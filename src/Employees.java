public class Employees {
    private String name;
    private Integer id;
    private Double salary;


    public Employees(String name, Integer id, Double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }


    public String getName() {
        return this.name;
    }


    public Integer getId() {
        return this.id;
    }


    public Double getSalary() {
        return this.salary;
    }

    public void increaseSalary(Double salary) {
        this.salary += (this.salary * salary) / 100;
    }
    public void decreaseSalary(Double salary){
        this.salary -= (this.salary * salary) / 100;
    }

    @Override
    public String toString() {
        return String.format("%n Name: %s %n ID: %d %n Salary: %.2f", getName(), getId(), getSalary());
    }


} 