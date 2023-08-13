package TestUnitaire;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class sumIntervals {


    public class IntervalSumTest {

        @Test
        public void testSumIntervals() {
            int[][] intervals1 = {{1, 5}};
            assertEquals(4, sumIntervals(intervals1));

            int[][] intervals2 = {{1, 4}, {7, 10}, {3, 5}};
            assertEquals(7, sumIntervals(intervals2));

            int[][] intervals3 = {{1, 10}, {2, 5}};
            assertEquals(9, sumIntervals(intervals3));

            int[][] intervals4 = {{1, 5}, {12, 15}, {3, 10}};
            assertEquals(12, sumIntervals(intervals4));

            int[][] intervals5 = {{1, 5}, {12, 15}, {3, 10}, {13, 18}};
            assertEquals(15, sumIntervals(intervals5));
        }

        public int sumIntervals(int[][] intervals) {
            // Implémentation de la fonction sumIntervals
            // Votre code pour calculer la somme des longueurs d'intervalles ici
        }
    }

}
