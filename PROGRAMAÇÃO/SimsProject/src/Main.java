import Tools.CSVShoppingReader;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {

    }

    public static class TESTE {
        public static void main(String[] args) throws FileNotFoundException {

            String filePath = "Ficheiros/CoisasShopping23.csv";

            CSVShoppingReader shoppingReader = new CSVShoppingReader(filePath);

            shoppingReader.readCSVToRepository();


        }


    }
}
