package print;

import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {
        GBElement<Integer> number = new GBElement<>(8);
        GBElement<String> str = new GBElement<>("Happy");
        GBElement<Double> db = new GBElement<>(2.89);

        number.printElement();
        str.printElement();
        db.printElement();

        int length = 10;
        GBArray<Integer> intArr = new GBArray(length);
        for (int i = 0; i < length; i++) {
            intArr.setArr(i, i + 5);
        }
        System.out.println(intArr);

        GBArray<String> strArr = new GBArray(length);
        for (int i = 0; i < length; i++) {
            strArr.setArr(i, String.valueOf(i + " element"));
        }
        System.out.println(strArr);
    }
}

