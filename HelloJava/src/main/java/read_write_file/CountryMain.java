package read_write_file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CountryMain {

    public static void main(String[] args) {

        List<Country> countryList = readCountriesFromFile("./country.csv");
        showCountries(countryList);

        // Thêm 1 country vào file
    }

    public static void showCountries(List<Country> countryList) {
        for (int i = 0; i < countryList.size(); i++) {
            System.out.println(countryList.get(i));
        }
    }
    private static List<Country> readCountriesFromFile(String fileName) {
        List<Country> countryList = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                // line: '1,"AU","Australia"'
                String [] items = line.split(",");
                int id = Integer.parseInt(items[0]);
                Country c = new Country(id, items[1], items[2]);
                countryList.add(c);
            }


        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        return countryList;
    }
}
