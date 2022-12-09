package tdd.chapter3Test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TwoPointsDistanceTest {
    @Test
    public void testTwoPointsInAplaneRestOnlinePerpendicularToAxis(){
        assertTrue(DistanceExercise.isPerpendicular(2,2,4,5));

    }
    @Test
    public void testPerpendicularity(){
        assertFalse(DistanceExercise.isPerpendicular(2,2,5,5));
    }
    @Test
    public void forStrings(){
        assertTrue(DistanceExercise.forStrings("2344"));
    }
}


