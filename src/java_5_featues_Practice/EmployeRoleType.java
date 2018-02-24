package java_5_featues_Practice;



public enum EmployeRoleType {

    SDIM(10), DEV(13), MANAGER(9), HR(2);

    private final int rolecode;

    private EmployeRoleType(int rolecode) {
        this.rolecode = rolecode;
    }

    public int getRoleCode() {
        return rolecode;
    }


}
