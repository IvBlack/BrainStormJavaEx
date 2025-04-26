package ya.contest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.stream.Collectors;

/*
* Раскадывает число на входе на простые множители
* */
public class NumFactorization {
    public static void main(String[] args)
    {

        StringBuilder outputBuffer = new StringBuilder();

        try (BufferedReader br = new BufferedReader(new BufferedReader(new InputStreamReader(System.in)))) {
            int numToFactorize = Integer.parseInt(br.readLine());

            outputBuffer.append(toSeveralFactors(numToFactorize));
            System.out.println(outputBuffer);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static String toSeveralFactors(int num) //240 на вход
    {
        ArrayList<Integer> numFactors = new ArrayList<Integer>();
//        factors.add(1);
        int startNumFactor = 2;

        while (num != 1) {
            if (num % startNumFactor == 0)
            {
                numFactors.add(startNumFactor);
                num /= startNumFactor;
            }
            else
                startNumFactor++;
        }

        return numFactors.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(" "));

        //переложили в массив из листа
//        int[] result = new int[numFactors.size()];
//        for (int i = 0; i < result.length; i++)
//            result[i] = numFactors.get(i);
//        return result;
    }


/* ========================================
* Иные реализации, имеющие право на жизнь
*

        static List<Integer> factorsOf (int val) {

        List<Integer> factors  = new ArrayList<Integer>();
        for(int i=1; i <= val/2; i++)
        {
            if(val % i == 0)
            {
                factors.add(i);
            }
        }
        return factors;
    }

    static List<Integer> factorsOf2(int val) {
        List<Integer> factors = new ArrayList<>();
        List<Integer> seq = new ArrayList<>();
        seq.add(1);
        int counter = 0;

        while (val != 1) {
            if (val % seq.get(counter) == 0) {
                factors.add(seq.get(counter));
                val/= seq.get(counter);
                continue;
            }
            counter++;
        }
        return factors;
    }

 ==========================================================*/
}
