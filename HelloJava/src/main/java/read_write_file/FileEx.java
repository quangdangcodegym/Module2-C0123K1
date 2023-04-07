package read_write_file;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class FileEx {
    public static void main(String[] args) {
        String fileName = "./scores.txt";
        List<Integer> numbers = readNumbersFromfile(fileName);

        writeNumbersToFile(fileName, numbers);


    }

    private static void writeNumbersToFile(String fileName, List<Integer> numbers) {
        try {
            FileWriter fileWriter = new FileWriter(fileName);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (int i = 0; i < numbers.size(); i++) {
                bufferedWriter.write(numbers.get(i)+"\n");
            }
            bufferedWriter.close();
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }

    }

    private static List<Integer> readNumbersFromfile(String fileName) {
        List<Integer> items = null;
        try {
            Reader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            items = new ArrayList<>();
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                // line = "4", "6"
                items.add(Integer.parseInt(line));
            }

            List<Integer> sorts = new ArrayList<>();
            sorts.addAll(items);
            // items: 4,6,7,2,7
            sorts.sort(new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return o1.compareTo(o2);
                }
            });
            int max = sorts.get(sorts.size() - 1);

            items.add(max);

            System.out.println(items);

        } catch (FileNotFoundException fileNotFoundException) {

        } catch (IOException e) {

        }
        return items;
    }
}
