public class Employee {
    private final int id;
    private String fullname;
    private int departametnId;
    private int salary;

    private static Integer idCounter = 1;

    public Employee(String fullname, int departametnId, int salary) {
        this.id = idCounter++;
        this.fullname = fullname;
        this.salary = salary;
        this.departametnId = departametnId;
    }

    public String getFullname() {
        return fullname;
    }

    public int getdepartametnId() {
        return departametnId;
    }

    public int getSalary() {
        return salary;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public void setdepartametnId(int departametnId) {
        this.departametnId = departametnId;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fullname='" + fullname + '\'' +
                ", departametnId=" + departametnId +
                ", salary=" + salary +
                '}';
    }
}
