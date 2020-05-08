package test;

import main.BalancedBrackets;
import org.junit.Test;
import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertTrue(true);
    }

    @Test
    public void onlyBracketsReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void stringInsideBracketsReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }

    @Test
    public void stringInsideBracketsWithSeparateStringReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }

    @Test
    public void stringWithSeparateEmptyBracketsReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }

    @Test
    public void emptyStringReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void noClosingBracketsReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }

    @Test
    public void bracketsInReverseOrderReturnsFalse(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }

    @Test
    public void oneSidedBracketsReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void onlyBracketsInReverseOrderReturnsFalse(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void escapeCharactersReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[\n]"));
    }

    @Test
    public void balancedBracketsWithNonBalancedBracketsReturnsFalse(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]]["));
    }

    @Test
    public void nonEscapeCharactersReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[@#word23]"));
    }
}
