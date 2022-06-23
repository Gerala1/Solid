package o.after;



public class Accounts {
    public Employee create(Applicant person) {
        Employee employee = new Employee();

        switch (person.typeOfEmployee) {
            case staff ->{ break; }

            case manager -> {
                employee.isManager = true;
                break;
            }
            case executive -> {
                employee.isManager = true;
                employee.isExecutive = true;
                break;
            }

        }

        employee.firstName = person.firstName;
        employee.lastName = person.lastName;
        employee.email = String.format("%s.%s@example.com", person.firstName, person.lastName);
        employee.setRole();
        return employee;



    }
}
