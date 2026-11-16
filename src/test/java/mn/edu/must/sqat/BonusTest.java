package mn.edu.must.sqat;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BonusTest {
    @Test
    void fiveConsecutiveAtThreshold() {
        assertEquals(8, DataFlowTargets.bonus(new int[]{1, 1, 1, 1, 1}, 5));
    }

    @Test
    void longStreakBelowThreshold() {
        assertEquals(3, DataFlowTargets.bonus(new int[]{1, 0, 1, 1, 1, 1, 1}, 7));
    }
}
