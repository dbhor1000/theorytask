public class Main {
    public static void main(String[] args) {


        String line = "1234567";


        StringBuilder lineSb = new StringBuilder(line);
        StringBuilder lineHalf1 = new StringBuilder();
        StringBuilder lineHalf2 = new StringBuilder();
        StringBuilder oddString = new StringBuilder();


        int lineLength = line.length();
        char[] lineToSymbols = line.toCharArray();


        if ((lineLength % 2) == 0) {         //В исходной строке чётное количество символов

            for (int i = 0; i < (lineLength / 2); i++) {
                lineHalf1.append(lineToSymbols[i]);
            }

            for (int i = (lineLength / 2); i < lineLength; i++) {
                lineHalf2.append(lineToSymbols[i]);
            }

            System.out.println(lineHalf1);
            System.out.println(lineHalf2);

        } else {        //В исходной строке нечётное количество символов

            oddString.append(lineToSymbols[ (lineLength - 1) / 2 ]); //Символ в середние строки вынесли отдельно

            for (int i = 0; i < (((lineLength - 1) / 2)) ; i++) {
                lineHalf1.append(lineToSymbols[i]);
            }

            for (int i = ((lineLength + 1) / 2); i < lineLength; i++) {
                lineHalf2.append(lineToSymbols[i]);
            }

            System.out.println(lineHalf1);
            System.out.println(oddString);
            System.out.println(lineHalf2);

        }



    }
}