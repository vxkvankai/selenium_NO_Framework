package java_5_featues_Practice;

public class Client2 {

    public static void main(String[] args) {

        EmployeRoleType[] values = EmployeRoleType.values();
        for (EmployeRoleType eRoleType : values) { // enum with for each
            System.out.println(eRoleType + "\t" + eRoleType.getRoleCode());
        }

        EmployeRoleType roleTp = EmployeRoleType.MANAGER; // enum in switch cases
        switch (roleTp) {
            case DEV:
                System.out.println("Dev Task");
                break;
            case SDIM:
                System.out.println("SDIM Task");
                break;
            case HR:
                System.out.println("HR Task");
                break;
            case MANAGER:
                System.out.println("MANAGER Task");

                break;
            default:
                System.out.println("Invalid Task");
                break;
        }
    }

}
