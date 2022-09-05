package project3.junit;

import org.junit.Test;
import project3.domain.Employee;
import project3.service.NameListService;
import project3.service.TeamException;


/**
 * @author lt
 * @Description 对NameListService类的测试
 * @data 8/9 - 8:29
 */
public class NameListServiceTest {

    @Test
    public void testGetAllEmployees(){
        NameListService service = new NameListService();
        Employee[] employees = service.getAllEmployees();
        for(int i = 0;i < employees.length;i++){
            System.out.println(employees[i]);
        }
    }

    @Test
    public void testGetEmployee(){
        NameListService service = new NameListService();
        int id = 1;
        try {
            Employee employee = service.getEmployee(id);
            System.out.println(employee);
        } catch (TeamException e) {
            System.out.println(e.getMessage());
        }
    }

}
