public class Numbers {
    public int divideBy(int number) throws IllegalArgumentException {
        if (number == 0) {
            throw new IllegalArgumentException("Parametru nu poate fi egal cu 0!");
        }
        return number;
    }

    int countDivisibleBy7Numbers(int inferiorLimit, int superiorLimit) throws InvalidRangeException{
        if (inferiorLimit > superiorLimit) {
            throw new InvalidRangeException("Limite incorecte!");
        }
        int count = 0;
        // "for" parcurge numere din interval si incrementeaza (приращивание, увеличение)
        // counter pt fiecare numar divizibil cu 7
        for (int i = inferiorLimit; i <= superiorLimit; i++) {
            // выражение отсеивает номера, которые делятся без остатка на 7л
            if (i % 7 == 0) {
                count++;
            }
        }
        // возвращает количество номеров, которые дклятся на 7
        return count;
    }


    // один из вариантов создания обьектов, не используя при этом main
    public void call() {
        Numbers num = new Numbers();
        try {
            num.divideBy(0);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
