package ru.netology.sqr.quadro.services;
public class SQRService {
    public int calcBonus(int minCount, int maxCount){
        int all = 0;
        int x = 99;

        for (int i = 10; i <= x; i++) {

            if (i * i >= minCount) {
                if (i * i <= maxCount){
                    all = all + 1;
                }
            }

        }

        return all;

    }
}
