package ya.contest.movingAvr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/*
 * Алгоритм скользящего среднего, схлопывает множество точек
 *  по кривой в более сжатое множество.
 * */
public class OptimizedMovingAvg {
    public static void main(String[] args) {

        List<Integer> timeseries = new ArrayList<>(Arrays.asList(2, 2, 4, 8, 4, 6, 3, 1));
        int k = 3;

        System.out.println(movingAvr(timeseries, k));
    }

    private static List<Integer> movingAvr(List<Integer> timeseries, int k) {

        List<Integer> res = new ArrayList<>();

        int summa = timeseries.stream()
                .filter(Objects::nonNull)
                .mapToInt(Integer::intValue)
                .sum();

        res.add(summa / k);

        int current_avg = 0;

        //Первый раз вычисляем значение честно и сохраняем результат
        for(int i = 0; i < (timeseries.size() - k); i++) {
            summa -= timeseries.get(i);
            summa += timeseries.get(i+k);
            current_avg = summa/k;
            res.add(current_avg);
        }
        return res;
    }

/*
    псевдокод:
    функция скользящее_среднее(timeseries, K):
    result = []  # Пустой массив.
            # Первый раз вычисляем значение честно и сохраняем результат.
    current_sum = сумма элементов timeseries[0..K)
            result.добавить(current_sum / K)
    для i из [0 .. len(timeseries) - K):
        current_sum -= timeseries[i]
        current_sum += timeseries[i+K]
        current_avg = current_sum / K
        result.добавить(current_avg)
    вернуть result
*
* */
}
