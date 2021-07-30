public class EmployeeTest {
    public static void main(String[] args) {
        Date birth= new Date(7,24,1949);
        Date hire=new Date(3,12,1988);
        Employee e1=new Employee("Bob","Blue",birth,hire);
        System.out.println(e1);
    }
}
