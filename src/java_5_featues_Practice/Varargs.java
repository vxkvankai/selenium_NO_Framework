package java_5_featues_Practice;

public class Varargs {

    public static void main(String[] args) {
        // int sum1 = sum("tets", 3, 5); // calling varrags method, sum
        int sum1 = sum("tets", new int[] {2, 5, 6, 7}); // passing int array into varrargs method, sum
        System.out.println(sum1);
        EnumISSetOfConstants myenum = EnumISSetOfConstants.DEV;
        EnumISSetOfConstants[] mytest1 = EnumISSetOfConstants.values();
        System.out.println(mytest1);



    }

    private static int sum(String s, int... arr) { // varargs should be the last in the parameters
        System.out.println(s);
        int sum = 0;

        for (int num : arr) {
            sum = sum + num;
        }

        return sum;
    }


}
