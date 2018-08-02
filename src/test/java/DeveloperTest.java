
import TechStaff.Developer;
import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class DeveloperTest {
    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Mike", 988, 1000.00);
    }

    @Test
    public void hasName(){
        assertEquals("Mike", developer.getName());
    }

    @Test
    public void hasNiNumber(){
        assertEquals(988, developer.getNiNumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(1000.00, developer.getSalary(), 2);
    }

    @Test
    public void canRaiseSalary(){
        developer.raiseSalary(50.2);
        assertEquals(1050.2, developer.getSalary(), 2);
    }

    @Test
    public void canPayBonus(){
        assertEquals(10.00, developer.payBonus(), 2);
    }

}
