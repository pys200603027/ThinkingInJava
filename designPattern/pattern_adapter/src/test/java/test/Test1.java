package test;

import com.example.pattern_adapter.example_1.OperationAdapter;
import com.example.pattern_adapter.example_1.ScoreOperation;

import org.junit.Test;

import java.util.Arrays;

public class Test1 {

    @Test
    public void test1() {
        int[] socres = {84, 76, 50, 69, 90, 92, 88, 86};
        int[] result;
        int score;


        ScoreOperation scoreOperation = new OperationAdapter();
        result = scoreOperation.sort(socres);

        System.out.println("===================");
        System.out.println(Arrays.toString(result));


        score = scoreOperation.search(result, 90);
        System.out.println("find result:" + score);
    }
}
