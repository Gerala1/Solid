package o.after;



public class Applicant extends Staff{


    EmployeeType typeOfEmployee;

    public Applicant(String firstName, String lastName,  EmployeeType typeOfEmployee) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.typeOfEmployee = typeOfEmployee;
    }



}
