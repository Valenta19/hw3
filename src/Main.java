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
        long b = 987678965549L;
        double c = 2.786;
        short d = 569;
        int i = -159;
        int f = 27897;
        byte g = 67;

        System.out.println( "Задание 3" );
        int LyudmilaPavlovna = 23;
        int AnnaSergeyevna = 27;
        int EkaterinaAndreevna = 30;
        int Paper = 480;
        int student =  (LyudmilaPavlovna + AnnaSergeyevna + EkaterinaAndreevna);
        int LeafOnStudent = Paper / student;
        System.out.println("На каждого ученика рассчитано " + LeafOnStudent +  " листов бумаги.");

        System.out.println("Задание 4");
        int bottle = 16;
        int PerMin = 16 / 2;
        int Twentymin = PerMin * 20;
        System.out.println("За 20 минут машина произвела " + Twentymin +  " штук бутылок");
        int day = PerMin * 60 * 24;
        System.out.println("За сутки машина произвела " + day +  " штук бутылок");
        int ThreeDay = day * 3;
        System.out.println("За трое суток машина произвела " + ThreeDay +  " штук бутылок");
        int month = day * 30;
        System.out.println("За месяц машина произвела " + month +  " штук бутылок");







    }
}