public class Main {
    public static void main(String[] args) {
        Department department = new Department();

        department.setId("234");
        department.setName("Sales");

        Employee employee = new Employee();

        employee.setId("456");
        employee.setLastName("Poker");
        employee.setDepartment(department);

        EmployeeMapper employeeMapper =new EmployeeMapperImpl() ;
        EmployeeDto employeeDto  = employeeMapper.entityToDto(employee);
        System.out.println(employeeDto);
    }
}
