public class Employee {
    private final int id;
    private int department;
    private double salary;

    private String fullName;

    public Employee(int department, double salary, String fullName) {
        this.id = SequenceManager.getNextSequence();
        this.department = department;
        this.salary = salary;
        this.fullName = fullName;
    }

    public int getId() {
        return id;
    }

    public int getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public String getFullName() {
        return fullName;
    }

    public void setDepartment(int department) {
        this.department = department;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString(){
        return String.format("%d. %s;  Номер отдела: %d; Зарплата: %.2f", id, fullName, department, salary);
    }
}
