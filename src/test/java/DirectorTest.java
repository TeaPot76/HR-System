import org.junit.Before;
import org.junit.Test;
import staff.management.Director;

import static junit.framework.TestCase.assertEquals;

public class DirectorTest {
    private Director director;

    @Before
    public void before(){
        director = new Director("Lidia", 23456, 450000, "NewProducts", 10000000);
    }

    @Test
    public void canGetBudget(){
        assertEquals(10000000.0, director.getBudget());
    }

    @Test
    public void canSetBudget(){
       double budget = 30000000;
        director.setBudget(budget);
        assertEquals(30000000.0,director.getBudget());
    }
}
