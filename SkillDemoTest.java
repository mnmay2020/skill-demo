import static org.junit.Assert.*;
import org.junit.*;
public class SkillDemoTest {
    
    @Test
    public void multiplyTester() {
        SkillDemo1 test = new SkillDemo1();
        assertEquals(6, test.multiply(2,3));
    }
}
