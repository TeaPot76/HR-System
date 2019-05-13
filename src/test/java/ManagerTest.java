import org.junit.Before;
import org.junit.Test;
import staff.Employee;
import staff.management.Manager;

import static junit.framework.TestCase.assertEquals;

public class ManagerTest {

   private Manager manager;

   @Before
    public void before(){
       manager = new Manager("Bob", 23456, 50000, "API");

   }
   @Test
    public void canRaiseSalary(){
       int number = 1;
       assertEquals(50001.0, manager.raiseSalary(number));

   }
    @Test
    public void canPayBonus(){
       int number = 2;
       assertEquals(2.0, manager.payBonus(number));

    }

}
