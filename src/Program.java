import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;



public class Program {
    public static void main(String[] args) {
        
        Locale.setDefault(new Locale("US"));
        Scanner read = new Scanner(System.in);
        List<Employees> registry = new ArrayList<>();
        
        System.out.printf("How many employees will be registered? %n");
        
        int howmanyemployees = read.nextInt();
        for (byte n = 0; n < howmanyemployees; n++){
            read.nextLine();
            System.out.printf("%n Employee #%d:", n + 1);
            System.out.printf("%n Name: ");
            String name = read.nextLine();
            System.out.printf("%n ID: ");
            int id = read.nextInt();
            while (!registry.isEmpty() && position(registry, id) != null){
                System.out.println("This id is already taken. Try again: ");
                id = read.nextInt();
            }
            System.out.printf("%n Salary: ");
            double salary = read.nextDouble(); 
            registry.add(new Employees(name, id, salary));
        }

        System.out.println("Enter the employee id that will have the salary increase: ");
        int empId = read.nextInt();
        if (position(registry, empId) != null){
            System.out.println("Enter percentage to commmit the increase: ");
            double percentage = read.nextDouble();
            registry.get(position(registry, empId)).increaseSalary(percentage);
        } else System.out.println("this id doesn't exist.");
        read.close();

        for (Employees employees : registry) {
            System.out.println(employees);
        }
    }
    public static Integer position(List<Employees> list, int id){
        for (Integer n = 0; n < list.size(); n++){
            if (list.get(n).getId().equals(id)){
                return n;
            }
        }
        return null;
    }
}
