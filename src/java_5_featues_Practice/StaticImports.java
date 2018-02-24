package java_5_featues_Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class StaticImports {

    public static void main(String[] args) {

        List<String> namesList = new ArrayList<String>();
        namesList.add("vani");
        namesList.add("Vamsi");
        namesList.add("varsha");
        namesList.add("vennela");
        namesList.add("test");
        ListIterator<String> iterator = namesList.listIterator(); // you can usr iterator or istiterator
        while (iterator.hasNext()) { // iterator and traverse only in forward.
            String name = iterator.next();

            System.out.println(name);

        }

        //        for (String me : namesList) { // for each
        //          
        //            System.out.println(me);
        //        }

    }
}
