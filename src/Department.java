// A Department consists of a list of Employees as well as a list of Cohorts.
public class Department {

    Employee[] staff;
    Cohort[] cohorts;

    public Department(Employee[] staff, Cohort[] cohorts) {
        this.staff = staff;
        this.cohorts = cohorts;
    }
}
