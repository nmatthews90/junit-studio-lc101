package test;

import main.BalancedBrackets;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketReturnTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void stringWithNoBracket() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void onlyBracketReturnFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void onlyBracketReturnFalseWithOnlyOpeningBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));


    }

    @Test
    public void onlyBracketReturnFalseWithOnlyClosingBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }



    @Test
    public void onlyBracketReturnTrueWhenBracketOnStartAndEnd() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }

    @Test
    public void onlyBracketReturnTrueWhenBracketOnStartInMiddle() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }

    @Test
    public void onlyBracketReturnTrueWhenBracketOnStart() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }

    @Test
    public void onlyBracketReturnFalseWhenBracketOnStart() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }

    @Test
    public void onlyBracketReturnTrueWhenMoreSets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[][]"));
    }

    @Test
    public void onlyBracketReturnFalseWhenOnlyCharacters() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("LaunchCode"));
    }




}
