import static java.lang.Double.*;

public class Main {
    private static Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            Employee employee = new Employee(i % 5 + 1, Math.random() * 300000, "Иванов" + i);
            employees[i - 1] = employee;
        }
        System.out.println(getAllInfo());
        System.out.println("Минимальная зп в месяц: " + getEmployeeWithMinSalary());
        System.out.println("Максимальная зп в месяц: " + getEmployeeWithMaxSalary());
        System.out.printf("Сумма затрат на зп в месяц: %.2f\n", getEmployeeSumSalary());
        System.out.printf("Средняя зп в месяц: %.2f\n", getEmployeeSumSalary() / employees.length);
        printFullName();
    }
    public static String getAllInfo() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                Employee employee = employees[i];
                stringBuilder.append(employee.toString()).append("\n");
            }
        }
        return stringBuilder.toString();
    }
    public static Employee getEmployeeWithMinSalary() {
        double minSalary = Double.MAX_VALUE;
        Employee minEmployee = null;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
            Employee employee = employees[i];
            double minSalaryNew = min(minSalary, employee.getSalary());
            if (minSalaryNew != minSalary) {
                minEmployee = employee;
                minSalary = minSalaryNew;
            }
            }
        }
        return minEmployee;
    }
    public static Employee getEmployeeWithMaxSalary() {
        double maxSalary = Double.MIN_VALUE;
        Employee maxEmployee = null;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                Employee employee = employees[i];
                double maxSalaryNew = max(maxSalary, employee.getSalary());
                if (maxSalaryNew != maxSalary) {
                    maxEmployee = employee;
                    maxSalary = maxSalaryNew;
                }
            }
        }
        return maxEmployee;
    }
    public static double getEmployeeSumSalary() {
        double sumSalary = 0;
        Employee sumEmployee = null;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                Employee employee = employees[i];
                double sumSalaryNew = sum(sumSalary, employee.getSalary());
                sumSalary += i;
                sumEmployee = employee;
                sumSalary = sumSalaryNew;
            }
        }
        return  sumSalary;
    }
    public static void printFullName() {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                System.out.println("ФИО сотрудника: " + employees[i].getFullName());
            }
        }
    }
}