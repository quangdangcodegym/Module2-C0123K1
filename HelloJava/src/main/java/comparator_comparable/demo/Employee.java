package comparator_comparable.demo;

import java.util.Objects;

public class Employee implements Comparable<Employee> {
    private String name;
    private int age;
    private float salary;

    public Employee() {

    }

    public Employee(String name, int age, float salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }


    @Override
    public String toString() {
        return String.format("Name: %s, Age: %s, Salary: %s ", this.name, this.age, this.salary);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Employee) {
            Employee o1 = (Employee) obj;
            if (this.getName().equals(o1.getName()) && this.getAge() == ((Employee) obj).getAge()
            && this.getSalary() == ((Employee) obj).getSalary()) {
                return true;
            }
        }
        return false;
    }


    @Override
    public int hashCode() {
        return Objects.hash(this.age, this.name, this.salary);
    }

    public static void main(String[] args) {
        /**
        Employee[] employees = new Employee[10];
        employees[0] = new Employee("Quang Dang", 10, 1000.0f);
        employees[1] = new Employee("Quang Minh", 16, 3000.0f);
        employees[2] = new Employee("Quang Khoa", 5, 1000.0f);
        employees[3] = new Employee("Thu Dang", 60, 1000.0f);
        employees[4] = new Employee("My Dang", 8, 1000.0f);
        employees[5] = new Employee("Chau Dang", 15, 1000.0f);
        employees[6] = new Employee("Nghia Dang", 12, 9000.0f);
        employees[7] = new Employee("Bang Dang", 11, 1010.0f);
        employees[8] = new Employee("Quang Dang", 12, 5600.0f);
        employees[9] = new Employee("Quang Dang", 11, 7000.0f);

         // Chưa đề cập đến việc so sánh 2 đối tượng String
         String s1 = "Quang";
         String s2 = "Quang";
         System.out.println(s1.hashCode());
         System.out.println(s2.hashCode());




         As much as is reasonably practical,
         the hashCode method defined by class Object does return distinct integers for distinct objects
        System.out.println(e1.hashCode());
        System.out.println(e2.hashCode());

        // == so sánh tham chiếu của 2 đối tượng
        if (e1 == e2) {
            System.out.printf("%s == %s \n", "e1", "e2");
        }

        int a1 = 5;
        int a2 = 5;
        System.out.println(Objects.hash(a1));
        System.out.println(Objects.hash(a2));
        **/



        /**
        Employee e1 = new Employee("Quang Dang", 10, 1000.0f);  // 0x32cd
        Employee e2 = new Employee("Quang Dang", 10, 1000.0f);  // 0x32ee


        System.out.println(e1.hashCode());          //1252169911
        System.out.println(e2.hashCode());          // 2101973421
        // Chỗ này nói cái gì       ???
        if (e1 == e2) {
            System.out.printf("%s == %s \n", "e1", "e2");
        }
        // Chỗ này nói cái gì       ???
        if (e1.equals(e2)) {
            System.out.printf("%s equals %s \n", "e1", "e2");
        }

        // equals

        int a2 = 5;
        int a1 = 5;
        System.out.println(Objects.hash(a1));
        System.out.println(Objects.hash(a2));

         **/



    }

    @Override
    public int compareTo(Employee o) {
        if (this.age > o.getAge()) {
            return 1;
        } else if (this.age == o.getAge()) {
            return 0;
        }else
            return -1;
    }
}
