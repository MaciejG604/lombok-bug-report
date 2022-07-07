package example;

import lombok.experimental.ExtensionMethod;

import java.util.ArrayList;

@ExtensionMethod({Ext.class, Try.class})
public class Example {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();

//        error: cannot find symbol array.extensionTry();
//        array.extensionTry();

//        error: cannot find symbol array.extensionTryInteger();
//        array.extensionTryInteger();

        array.extensionExt();
        array.extensionExtInteger();
    }
}

class Ext {
    public static <T> void extensionExt(Iterable<? extends T> values) {
        System.out.println("extensionExt");
        //Try.extensionTry(values);
    }
    public static void extensionExtInteger(Iterable<Integer> values) {
        System.out.println("extensionExtInteger");
        //Try.extensionTry(values);
    }
}

interface Try<T> {
    static <T> void extensionTry(Iterable<? extends T> values) {
        System.out.println("extensionTry");
    }

    static void extensionTryInteger(Iterable<Integer> values) {
        System.out.println("extensionTryInteger");
    }
}
