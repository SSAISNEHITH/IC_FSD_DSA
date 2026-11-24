class Employee {
    int id;
    String name;
    String department;
    Employee() {
        this(0, "Unknown");
    }
    Employee(int id, String name) {
        this(id, name, "General");
    }
    Employee(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }
    void displayEmployee() {
        System.out.println("ID: " + id + ", Name: " + name + ", Department: " + department);
    }
    public static void main(String[] args) {
        Employee emp1 = new Employee(101, "Arjun");
        Employee emp2 = new Employee(102, "Priya", "Engineering");
        emp1.displayEmployee();
        emp2.displayEmployee();
    }
}