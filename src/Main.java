public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        byte cat = 1;
        System.out.println( "Значение переменной cat с типом byte равно " + cat);
        short dog = 2;
        System.out.println( "Значение переменной dog с типом short равно " + dog);
        int bird = 3;
        System.out.println( "Значение переменной bird с типом int равно " + bird);
        float bear = 4.5f;
        System.out.println( "Значение переменной bear с типом float равно " + bear);
        long wolf = 5L;
        System.out.println( "Значение переменной wolf с типом long равно " + wolf);
        double snake = 6.5;
        System.out.println( "Значение переменной snake с типом double равно " + snake);

        System.out.println("Задание 2");
        float a = 27.12f;
        long b = 987_678_965_549L;
        double c = 2.786;
        short d = 569;
        int i = -159;
        int f = 27897;
        byte g = 67;

        System.out.println( "Задание 3" );
        int lyudmilaPavlovna = 23;
        int annaSergeyevna = 27;
        int ekaterinaAndreevna = 30;
        int Paper = 480;
        int student =  (lyudmilaPavlovna + annaSergeyevna + ekaterinaAndreevna);
        int LeafOnStudent = Paper / student;
        System.out.println("На каждого ученика рассчитано " + LeafOnStudent +  " листов бумаги.");

        System.out.println("Задание 4");
        int bottle = 16;
        int perMin = 16 / 2;
        int twentyMin =perMin * 20;
        System.out.println("За 20 минут машина произвела " + twentyMin +  " штук бутылок");
        int day = perMin * 60 * 24;
        System.out.println("За сутки машина произвела " + day +  " штук бутылок");
        int threeDay = day * 3;
        System.out.println("За трое суток машина произвела " + threeDay +  " штук бутылок");
        int month = day * 30;
        System.out.println("За месяц машина произвела " + month +  " штук бутылок");

        System.out.println("Задание 5");
        int paints = 120;
        int whitePaint = 2;
        int brownPaint = 4;
        int colorsPerClass = whitePaint + brownPaint;
        int classes = paints / colorsPerClass;
        int allWhite = classes * whitePaint;
        int allBrown = classes * brownPaint;
        System.out.println("В школе, где " + classes + " классов, нужно " + allWhite + " банок белой краски и " + allBrown + " банок коричневой краски");

        System.out.println("Задание 6 ");
        int banana = 80;
        int milk = 105;
        int cream = 100;
        int agg = 70;
        double totalProducts = banana * 5 +  milk * 2 + cream * 2 + agg * 4;
        System.out.println(totalProducts + " грамм ");
        double KilogramF = totalProducts / 1_000;
        System.out.println(KilogramF + " килограмм");

        System.out.println(" Задание 7 ");
        int excessWeight = 7_000;
        int lossWeightPerDayMin = 250;
        int lossWeightPerDayMax = 500;
        double reset250 = (double) excessWeight / lossWeightPerDayMin;
        double reset500 = (double) excessWeight / lossWeightPerDayMax;
        double average = ( lossWeightPerDayMin + lossWeightPerDayMax) / 2D;
        double averageDaysCount = excessWeight / average;
        System.out.println(reset250 + " дней ");
        System.out.println(reset500 + " дней ");
        System.out.println(averageDaysCount + " в среднем дней");

        System.out.println("Задание 8");

        int salaryMasha = 67_760;
        int increaseMasha = salaryMasha / 10;
        int newSalaryMasha = salaryMasha + increaseMasha;
        int differenceIncomeMasha = increaseMasha * 12;
        System.out.println("Маша теперь получает " + newSalaryMasha +  " рублей. Годовой доход вырос на " + differenceIncomeMasha + " рублей.");

        int salaryDenis = 83_690;
        int increaseDenis = salaryDenis / 10;
        int newSalaryDenis = salaryDenis + increaseDenis;
        int differenceIncomeDenis = increaseDenis * 12;
        System.out.println("Денис теперь получает " + newSalaryDenis +  " рублей. Годовой доход вырос на " + differenceIncomeDenis + " рублей.");

        int salaryKristina = 76_230;
        int increaseKristina = salaryKristina / 10;
        int newSalaryKristina = salaryKristina + increaseKristina;
        int differenceIncomeKristina = increaseKristina * 12;
        System.out.println("Кристина теперь получает " + newSalaryKristina +  " рублей. Годовой доход вырос на " + differenceIncomeKristina + " рублей.");















    }
}