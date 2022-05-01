import static org.junit.Assert.*;
import org.junit.*;
public class SkillDemoTest {
    
    @Test
    public void multiplyTester() {
        int answer = SkillDemo1.multiply(2,3);
        assertEquals(6, answer);
    }
}
