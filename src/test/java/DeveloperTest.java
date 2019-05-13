import org.junit.Before;
import org.junit.Test;
import staff.techStaff.Developer;

import static junit.framework.TestCase.assertEquals;

public class DeveloperTest {
    private Developer developer;

    @Before
    public void before(){
        developer = new Developer("Rob", 34567, 65000);

    }
    @Test
    public void canRaiseSalary(){
        int number = 1;
        assertEquals(65001.0, developer.raiseSalary(number));

    }
    @Test
    public void canPayBonus(){
        int number = 1;
        assertEquals(1.0, developer.payBonus(number));

    }
}
