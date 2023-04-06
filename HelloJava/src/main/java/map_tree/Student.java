package map_tree;

import java.util.Objects;

public class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }
    public Student() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public boolean equals(Object obj) {
        Student o = (Student) obj;

        return this.name.equals(o.getName());
    }
}
