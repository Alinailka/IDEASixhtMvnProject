package ru.netology.statistic;

public class StatisticsService {
    /**
     * Calculate index of max income //Рассчитать индекс максимального дохода
     *
     * @param incomes - array of incomes //@param доходы - массив доходов
     * @return - index of first max value //@return - индекс первого максимального значения текущего
     */

    public long findMax(long[] incomes) {
        long current_max_index = 0;
        long current_max = incomes[0]; //текущий максимум
        for (long income : incomes)
            if (current_max < income)
                current_max = income;
        return current_max;
    }
}
