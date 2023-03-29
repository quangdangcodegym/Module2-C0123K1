import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DehaCompany {
    List<Employee> employees;

    public DehaCompany() {
        employees = new ArrayList<>();
        //long id, String fullName, Date birthDay, String phone, String email,
        // EmployeeType employeeType, int expInYear, String proSkill
        Employee ep1 = new Experience(1L, "Quang Dang", new Date(1992, 7, 18), "033399457133",
                "quang.dang@codegym.vn", EmployeeType.Experience, 5, "Chem gio");
        // String majors, int semester, String universityName)
        Employee ep2 = new Intern("Chem gio", 4, "Duy Tan");
        ep2.setFullName("Quoc Phap");
        ep2.setEmail("phapsukumathon@gmail.com");
        ep2.setBirthDay(new Date(2000, 2, 2));

        employees.add(ep1);
        employees.add(ep2);
    }
}
