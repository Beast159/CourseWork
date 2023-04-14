import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
        System.out.println(Arrays.toString(employees));

        System.out.println();
        printEmployees();

        System.out.println();
        totalSalary();

    }

    private static Employee[] employees = {
        new Employee("Иванов Иван Иванович", 1, 41500),
        new Employee("Петров Петр Петрович", 2, 49700),
        new Employee("Сидоров Сидр Сидорович", 3, 57900),
        new Employee("Тиль Духаст Рамштайнович", 4, 35400),
        new Employee("Калашников Михаил Тимофеевич", 5, 62100),
        new Employee("Егоров Владимир Васильевич", 1, 57500),
        new Employee("Коноплин Раскумар Гоношишевич ", 2, 84000),
        new Employee("Сухой Павел Осипович", 3, 150000),
        new Employee("Бульба Остап Тарасович", 4, 76000),
        new Employee("Бульба Тарас", 5, 99999),

    };


    public static void printEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);

        }
    }

    public static int totalSalary() {
        int sum = 0;
        for (Employee employee : employees) {
            sum = sum + employee.getSalary();
        }

        return sum;

    }

   // public static Employee findEmployeeWithMinSalary() {

  //      for (int i = 0, i<Employee(employees).len);


  //  }




}