package read_write_binary;

import java.io.*;

public class ReadWriteBinary {
    public static void main(String[] args) {

        try {
            FileInputStream inputStream = new FileInputStream("./country.csv");
            FileOutputStream outputStream = new FileOutputStream("./country1.txt");
            byte[] bytes = new byte[2];
            inputStream.read(bytes);

            outputStream.write(43);

            inputStream.close();
            outputStream.close();

        } catch (FileNotFoundException fileNotFoundException) {

        } catch (IOException ioException) {

        }

    }
}
