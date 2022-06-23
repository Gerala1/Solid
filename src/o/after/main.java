package o.after;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class main {
    public static void main(String[] args) {

        /*
        List<Applicant> applicants = Arrays.asList(
                new Applicant("Admir", "Demaj", "Adidemaj@yahoo.com", EmployeeType.staff),
                new Applicant("Dean", "Meko", "dmeko@yahoo.com", EmployeeType.executive),
                new Applicant("Timothy", "Breet", "Thbreet@gmail.com", EmployeeType.manager)
        );

        List<o.before.Employee> employees = new ArrayList<>();
        Accounts accountProcessor = new Accounts();

        applicants.forEach(person -> employees.add(accountProcessor.create(person)));

        for (Employee employee : employees) {
            System.out.println(String.format("%s %s: %s IsManager: %s IsExecutive: %s", employee.getFirstName(), employee.getLastName(), employee.getEmail(), employee.isManager, employee.isExecutive));
        }
    }


        /*
           for(Applicant applicant: applicants){
            System.out.println(applicant.getFirstName());
        }
        List<Employee> employees = new ArrayList<>();
        Accounts accountProcessor = new Accounts();

        applicants.forEach(applicant -> employees.add(accountProcessor.create(applicant)));

        for (Employee employee: employees){
            System.out.println(employee.getFirstName());

        }     */
}}
