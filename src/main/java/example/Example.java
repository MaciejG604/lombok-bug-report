package example;

import lombok.experimental.ExtensionMethod;

import java.util.ArrayList;

@ExtensionMethod({Ext.class, Try.class, TrySecond.class, TryThird.class})
public class Example {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        Integer integer = 1;

        array.extensionExt();

//        error: cannot find symbol array.extensionTry();
//        array.extensionTry();

//        error: cannot find symbol array.extensionTrySecond();
//        array.extensionTrySecond();

//        error: cannot find symbol integer.extensionTryThird();
//        integer.extensionTryThird();
    }
}

class Ext {
    public static <T> void extensionExt(Iterable<? extends T> values) {
        System.out.println("extensionExt");
        //Possible workaround:
        Try.extensionTry(values);
    }
}

interface Try<T> {
    static <T> void extensionTry(Iterable<? extends T> values) {
        System.out.println("extensionTry");
    }
}

interface TrySecond {
    static void extensionTrySecond(Iterable<Integer> values) {
        System.out.println("extensionTrySecond");
    }
}

interface TryThird {
    static void extensionTryThird(Integer value) {
        System.out.println("extensionTryThird");
    }
}
