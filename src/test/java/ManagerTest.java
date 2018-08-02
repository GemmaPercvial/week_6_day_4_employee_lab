import Management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
       manager = new Manager("Mike", 988, 1000.00, "Menswear");
    }

    @Test
    public void hasName(){
        assertEquals("Mike", manager.getName());
    }

    @Test
    public void hasNiNumber(){
        assertEquals(988, manager.getNiNumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(1000.00, manager.getSalary(), 2);
    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(50.2);
        assertEquals(1050.2, manager.getSalary(), 2);
    }

    @Test
    public void canPayBonus(){
        assertEquals(10.00, manager.payBonus(), 2);
    }

    @Test
    public void canGetDepartmentName(){
        assertEquals("Menswear", manager.getDepartmentName());
    }

    @Test
    public void canRaiseSalaryNegativeAmount(){
        manager.raiseSalary(-10);
        assertEquals(1000.00, manager.getSalary(), 2);
    }

    @Test
    public void canChangeName(){
        manager.setName("Colin");
        assertEquals("Colin", manager.getName());
    }

    @Test
    public void cantChangeNameToNull(){
        manager.setName(null);
        assertEquals("Mike", manager.getName());
    }



}
