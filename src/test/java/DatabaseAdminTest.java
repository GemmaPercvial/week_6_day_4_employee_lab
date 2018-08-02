import TechStaff.DatabaseAdmin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Mike", 282, 1000.00);
    }

    @Test
    public void hasName(){
        assertEquals("Mike", databaseAdmin.getName());
    }

    @Test
    public void hasNiNumber(){
        assertEquals(282, databaseAdmin.getNiNumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(1000.00, databaseAdmin.getSalary(), 2);
    }

    @Test
    public void canRaiseSalary(){
        databaseAdmin.raiseSalary(50.2);
        assertEquals(1050.2, databaseAdmin.getSalary(), 2);
    }

    @Test
    public void canPayBonus(){
        assertEquals(10.00, databaseAdmin.payBonus(), 2);
    }

}
