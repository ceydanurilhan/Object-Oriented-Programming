public class Employee {
    private String firstName;
    private String lastName;
    private  Date birthDate;
    private Date hireDate;

    public Employee(String first,String last,Date dateofbirth,Date dateofhire){
        firstName=first;
        lastName=last;
        birthDate=dateofbirth;
        hireDate=dateofhire;
    }
    public String toString(){
        return String.format("%s , %s Hired: %s Birthday: %s",lastName,firstName,hireDate,birthDate);
    }

}
