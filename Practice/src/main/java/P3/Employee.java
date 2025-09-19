package P3;

public class Employee implements Comparable<Employee> {
    private int id;
    private String name;
    private double salary;
    private String department;

    public Employee(int id, String name, double salary, String department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public double getSalary() { return salary; }
    public String getDepartment() { return department; }

    @Override
    public int compareTo(Employee other) {
        return Double.compare(other.salary, this.salary); // Descending salary
    }

    @Override
    public String toString() {
        return "P3.Employee{id=" + id + ", name='" + name + "', salary=" + salary + ", department='" + department + "'}";
    }
}
