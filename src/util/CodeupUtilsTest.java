package util;

import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CodeupUtilsTest {

    private  ArrayList<Integer> intList;

    @Before
    public void setup() {
        intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(4);
        intList.add(5);
    }

    @Test
    public void testFindAddends () {
       ArrayList<IndexPair> resultList;
       resultList = CodeupUtils.findAddends(intList, 5);
        IndexPair ip = new IndexPair(0,3);
        assertEquals(resultList.get(0).getI(), 0);
        assertEquals(resultList.get(0).getJ(), 3);
    }

}
