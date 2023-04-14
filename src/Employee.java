public class Employee {
    private final int id;
    private String fullName;
    private int departametnId;
    private int salary;

    private static Integer idCounter = 1;

    public Employee(String fullName, int departametnId, int salary) {
        this.id = idCounter++;
        this.fullName = fullName;
        this.salary = salary;
        this.departametnId = departametnId;
    }

    public String getFullName() {
        return fullName;
    }

    public int getdepartametnId() {
        return departametnId;
    }

    public int getSalary() {
        return salary;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
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
                "fullName='" + fullName + '\'' +
                ", departametnId=" + departametnId +
                ", salary=" + salary +
                '}';
    }
}
