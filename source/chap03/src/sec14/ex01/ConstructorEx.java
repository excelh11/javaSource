package sec14.ex01;

import java.util.function.Supplier;
import java.util.ArrayList;
import java.util.List;

public class ConstructorEx {
    public static void main(String[] args) {
        Supplier<List<String>> listSupplier = ArrayList::new;
        
        List<String> list = listSupplier.get();
        list.add("Hello");
        list.add("World");
        
        System.out.println(list); 
    }
}

