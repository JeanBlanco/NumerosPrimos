package org.example;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.example.PasswordStringthUtil.*;

public class PasswordStringthUtilTest {
    @Test
    public void testPasswordStrengthWeak() {
        PaswordStringth actual = PasswordStringthUtil.getPaswordStringthUtil("1234");
        Assertions.assertEquals(PaswordStringth.WEAK, actual);
     }

    @Test
    public void testPasswordStrengthWeak1() {
        PaswordStringth actual2 = PasswordStringthUtil.getPaswordStringthUtil("12ab");
        Assertions.assertEquals(PaswordStringth.WEAK, actual2);
    }

    @Test
    public void testPasswordStrengthWeakNumbers() {
        PaswordStringth actual3 = PasswordStringthUtil.getPaswordStringthUtil("12345678");
        Assertions.assertEquals(PaswordStringth.WEAK, actual3);
    }

    @Test
    public void testPasswordStrengthWeakCharacters() {
        PaswordStringth actual4 = PasswordStringthUtil.getPaswordStringthUtil("abcdefgh");
        Assertions.assertEquals(PaswordStringth.WEAK ,actual4);
    }

    @Test
    public void testPasswordStrengthMedium() {
        PaswordStringth  actual5 = PasswordStringthUtil.getPaswordStringthUtil("1234abcd");
        Assertions.assertEquals(PaswordStringth.MEDIUM,actual5);
    }

    @Test
    public void testPasswordStrengthStrong() {
        PaswordStringth actual6 = PasswordStringthUtil.getPaswordStringthUtil("1234abcd+");
        Assertions.assertEquals(PaswordStringth.STRONG, actual6);
    }

}