public class Employee extends Person2 {
    private long employeeId;
    private long departmentId;
    public Employee(String name, int age, long departmentId, long employeeId) {
        super(name, age);
        this.departmentId = departmentId;
        this.employeeId = employeeId;
    }
}