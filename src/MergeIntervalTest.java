import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;

import static java.util.Arrays.asList;

/**
 * Created by Daniel on 01-Feb-17.
 */
public class MergeIntervalTest {
    private static MergeInterval sut;

    @BeforeClass
    public static void init(){
        sut = new MergeInterval();
    }

    @Test
    public void test1(){
        Interval interval1 = new Interval(1, 1);
        ArrayList<Interval> intervals = asList({interval1});
        ArrayList<Interval> newInterval;
    }
}
