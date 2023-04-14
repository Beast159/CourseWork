import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
        Employee[] employees = {
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


        System.out.println();
        printEmployees(employees);

        System.out.println("общая зарплата всех сотрудников " + totalSalary(employees));

        System.out.println("Сотрудник с минимальной зарплатой " + findEmployeeWithMinSalary(employees));

        System.out.println("Сотрудник с максимальной зарплатой " + findEmployeeWithMaxSalary(employees));
//        System.out.println(avarageSalary(employees));
        System.out.println(avarageSalary1(employees));

        System.out.println("ФИО всех сотрудников " + employees.getFullName);
    }

    public static void printEmployees(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static int totalSalary(Employee[] employees) {
        int sum = 0;
        for (Employee employee : employees) {
            sum = sum + employee.getSalary();
        }
        return sum;
    }

     public static Employee findEmployeeWithMinSalary(Employee[] employees) {
         Employee employeeWithMinSalary = employees[0];
         for (Employee employee : employees) {
             if (employeeWithMinSalary.getSalary() > employee.getSalary()) {
                 employeeWithMinSalary = employee;
             }
         }
         return employeeWithMinSalary;
     }

    public static Employee findEmployeeWithMaxSalary(Employee[] employees) {
        Employee employeeWithMaxSalary = employees[0];
        for (Employee employee : employees) {
            if (employeeWithMaxSalary.getSalary() < employee.getSalary()) {
                employeeWithMaxSalary = employee;
            }
        }
        return employeeWithMaxSalary;
    }


//    public static double avarageSalary(Employee[] employees) {
//        double sum = 0d;
//        double avarageSalary;
//        for (Employee employee : employees) {
//            sum = sum + employee.getSalary();
//        }
//        avarageSalary = sum / employees.length;
//        return avarageSalary;
//    }

    public static double avarageSalary1(Employee[] employees) {

        return totalSalary(employees) / (double) employees.length;
    }
    


}