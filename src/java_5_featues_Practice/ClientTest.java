package java_5_featues_Practice;

// Kishan utube java 5 feature classes: https://www.youtube.com/watch?v=L7Y0hCMdaj8&list=PLzS3AYzXBoj8NQ9Dkc3Nm-to40V6rFpki&index=9

public class ClientTest {

    public static void main(String[] args) {

        Department d = new Department();

        d.setId(1);
        d.setName("vankai");

        Employee employee1 = new Employee();
        employee1.setId(5);
        employee1.setName("vamsi");
        employee1.setSalary(1000000000);

        Employee employee2 = new Employee();
        employee2.setId(5);
        employee2.setName("vamsi");
        employee2.setSalary(1000000000);

        Employee empArr[] = new Employee[2];
        empArr[0] = employee1;
        empArr[1] = employee2;
        display(empArr);

        System.out.println("---------------------------");
        Integer intArr[] = {1, 2, 3, 4, 5, 67};
        display(intArr);
        GenericClassWithMultipleParameters<Department, Employee> mygenClass =
            new GenericClassWithMultipleParameters<Department, Employee>(d, employee1);

        Department dept = mygenClass.getT();
        System.out.println(dept);

        Employee emp = mygenClass.getU();
        System.out.println(emp);
        System.out.println(employee2.getSalary());

        GenericClassWithMultipleParameters<Integer, String> mygenClass2 =
            new GenericClassWithMultipleParameters<Integer, String>(109345, "Kethu");

        System.out.println(mygenClass2.getT() + "\t" + mygenClass2.getU());
        System.out.println("");

    }

    private static <E> void display(E[] elements) {
        for (E e : elements) {
            System.out.println(e);
        }

    }


}
