package com.codegym.utils;

import com.codegym.model.Book;
import com.codegym.model.Customer;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FileUtils {
    public static final int CLASS_BOOK = 1;
    public static final int CLASS_CUSTOMER = 2;
    public static  <T> List<T> readDataFromFile(String fileName, int classID){
        List<T> datas = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader("./data/book.csv");
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
