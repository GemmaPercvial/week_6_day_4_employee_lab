import Management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {
    Director director;
    @Before
    public void before(){
        director = new Director("Mike", 987, 1000.00, "Manswear", 10000.00);
    }

    @Test
    public void hasName(){
        assertEquals("Mike", director.getName());
    }

    @Test
    public void hasNiNumber(){
        assertEquals(987, director.getNiNumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(1000.00, director.getSalary(), 2);
    }

    @Test
    public void hasDepartmentName(){
        assertEquals("Manswear", director.getDepartmentName());
    }

    @Test
    public void hasBudget(){
        assertEquals(10000.00, director.getBudget(), 2);
    }

    @Test
    public void canRaiseSalary(){
        director.raiseSalary(50.2);
        assertEquals(1050.2, director.getSalary(), 2);
    }

    @Test
    public void canPayBonus(){
        assertEquals(20.00, director.payBonus(), 2);
    }
}
