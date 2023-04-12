package com.codegym.utils;

import com.codegym.model.Book;
import com.codegym.model.Customer;
import com.codegym.model.Order;
import com.codegym.model.OrderItem;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FileUtils {
    public static final int CLASS_BOOK = 1;
    public static final int CLASS_CUSTOMER = 2;
    public static final int CLASS_ORDER = 3;

    public static final int CLASS_ORDER_ITEM = 4;
    public static  <T> List<T> readDataFromFile(String fileName, int classID){
        List<T> datas = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line = "";
            while ((line = bufferedReader.readLine()) != null) {

                switch (classID) {
                    case CLASS_BOOK:{
                        String[] items = line.split(",");
                        long id = Long.parseLong(items[0]);
                        double price = Double.parseDouble(items[4]);

                        String strDate = items[3];  //  '10-04-2023 14:16:30'
                        Date date = DateUtils.parseDate(strDate);

                        Book book = new Book();
                        book.setId(id);
                        book.setName(items[1]);
                        book.setDescription(items[2]);
                        book.setPrice(price);
                        book.setEntryDate(date);

                        datas.add((T) book);
                        break;
                    }
                    case CLASS_CUSTOMER:
                    {
                        String[] items = line.split(",");
                        long id = Long.parseLong(items[0]);

                        String strDate = items[4];  //  '10-04-2023 14:16:30'
                        Date date = DateUtils.parseDate(strDate);

                        Customer customer = new Customer();
                        //1,Bao Thy,baothy@gmail.com,Phú Thượng TP Huế,10-04-2023 14:16:30
                        customer.setId(id);
                        customer.setFullName(items[1]);
                        customer.setEmail(items[2]);
                        customer.setAddress(items[3]);
                        customer.setCreateAt(date);

                        datas.add((T) customer);
                        break;
                    }
                    case CLASS_ORDER:
                    {
                        // line: 1,Quang Dang,10-04-2023 14:16:30,25000
                        String[] items = line.split(",");
                        Order order = new Order();
                        order.setId(Long.parseLong(items[0]));
                        order.setFullName(items[1]);
                        order.setCreateAt(DateUtils.parseDate(items[2]));
                        order.setTotal(Double.parseDouble(items[3]));

                        datas.add((T) order);
                        break;
                    }
                    case CLASS_ORDER_ITEM:
                    {
                        // line: 1,1,1,1,5000
                        String[] items = line.split(",");
                        OrderItem orderItem = new OrderItem();
                        orderItem.setId(Long.parseLong(items[0]));
                        orderItem.setIdOrder(Long.parseLong(items[1]));
                        orderItem.setIdBook(Long.parseLong(items[2]));
                        orderItem.setQuantity(Integer.parseInt(items[3]));
                        orderItem.setPrice(Double.parseDouble(items[4]));

                        datas.add((T) orderItem);
                        break;
                    }


                }

            }
            bufferedReader.close();
            fileReader.close();
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        return datas;
    }

    public static <T> void writeDateToFile(String fileName, List<T> datas){
        try {

            FileWriter fileWriter = new FileWriter(fileName);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (int i = 0; i < datas.size(); i++) {
                bufferedWriter.write(datas.get(i).toString() +"\n");
            }
            bufferedWriter.close();
            fileWriter.close();

        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }

    }
}
