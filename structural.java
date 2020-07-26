public class Emp {
    private String name;
    private String gender;
    private String position;
    
    public Emp(String name, String gender, String position) {
        this.name = name;
        this.gender = gender;
        this.position = position;
    }
    
}
public interface Criteria {
    public List<Emp> criteria(List<Emp> employeeList);
}
