import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DataBaseAdmin;

import static junit.framework.TestCase.assertEquals;

public class DataBaseAdminTest {
    private DataBaseAdmin admin;

    @Before
    public void before(){
        admin = new DataBaseAdmin("Stephen", 23456, 65000);
    }
    @Test
    public void canRaiseSalary(){
        int number = 1;
        assertEquals(65001.0, admin.raiseSalary(number));

    }
    @Test
    public void canPayBonus(){
        int number = 1;
        assertEquals(1.0, admin.payBonus(number));

    }

}
