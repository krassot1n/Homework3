public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();

    }



    public static void task1() {
        System.out.println("Задача №1");

        byte num1 = -126;
        short num2 = 256;
        int num3 = 128_000;
        long num4 = 9_876_543_210L;
        float num5 = 1.5f;
        double num6 = 250.5;

        System.out.println("Значение переменной num1 с типом byte равно "+ num1);
        System.out.println("Значение переменной num2 с типом short равно " + num2 );
        System.out.println("Значение переменной num3 с типом int равно " + num3);
        System.out.println("Значение переменной num4 с типом long равно " + num4);
        System.out.println("Значение переменной num5 с типом float равно " + num5);
        System.out.println("Значение переменной num6 с типом double равно " + num6);
        System.out.println();





    }
    public static void task2() {
        System.out.println("Задача №2");

        double a = 27.12;
        long b = 987_678_965_549L;
        float c = 2.786f;
        short d = 269;
        int e = -159;
        int f = 27897;
        byte g = 67;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println();



    }
    public static void task3() {
        System.out.println("Задача №3");

        int studentInClass1 = 23;
        int studentInClass2 = 27;
        int studentInClass3 = 30;

        int allStudents = studentInClass1 + studentInClass2 + studentInClass3;

        int sheetsOfPaper = 480;

        int paperPerStudent = sheetsOfPaper/ allStudents;

        System.out.println("На каждого ученика рассчитано " + paperPerStudent + " листов бумаги");
        System.out.println();


    }
    public static void task4() {
        System.out.println("Задача №4");

        int preparationTimeInMinutes1 = 20;
        int preparationTimeInMinutes2 = 1_440;
        int preparationTimeInMinutes3 = 4_320;
        int preparationTimeInMinutes4 = 43_200;

        int productivityInTwoMinutes = 16;
        int productivityInOneMinute = productivityInTwoMinutes/2;


        int productivity1 = productivityInOneMinute * preparationTimeInMinutes1;
        int productivity2 = productivityInOneMinute * preparationTimeInMinutes2;
        int productivity3 = productivityInOneMinute * preparationTimeInMinutes3;
        int productivity4 = productivityInOneMinute * preparationTimeInMinutes4;

        System.out.println("За 20 минут машина произвела " + productivity1 + " штук бутылок");
        System.out.println("За сутки машина произвела " + productivity2 + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + productivity3 + " штук бутылок");
        System.out.println("За 1 месяц машина произвела " + productivity4 + " штук бутылок");
        System.out.println();


    }
    public static void task5() {
        System.out.println("Задача №5");

        int colorNeedToRepair = 120;
        int whiteColorClassNeed = 2;
        int brownColorClassNeed = 4;
        int numberOfClasses =colorNeedToRepair /(whiteColorClassNeed + brownColorClassNeed);
        int allWhiteColors = numberOfClasses * whiteColorClassNeed;
        int allBrownColors = numberOfClasses * brownColorClassNeed;

        System.out.println("В школе, где " + numberOfClasses + "классов, нужно " + allWhiteColors + " банок белой краски и " + allBrownColors +  " банок коричневой краски");
        System.out.println();


    }
    public static void task6() {
        System.out.println("Задача №6");

        int numberOfBanana = 5;
        int weightOneBanana = 80;
        int amountOfMilk = 200;
        int weightMilk = 105;
        int iceCreamBriquettes = 2;
        int weightBriquette = 100;
        int numberOfEggs = 4;
        int weightOneEgg = 70;
        int weightBreakfast = (numberOfBanana * weightOneBanana) + ((amountOfMilk/100) * weightMilk) + (iceCreamBriquettes * weightBriquette) + (numberOfEggs * weightOneEgg);
        double weightBreakfastInKilogram = weightBreakfast / 1000.00;
        System.out.println("Вес в граммах равен " + weightBreakfast);
        System.out.println("Вес в клограммах равен " + weightBreakfastInKilogram);
        System.out.println();


    }
    public static void task7() {
        System.out.println("Задача №7");

        int needToLose = 7_000;
        int dayLoseMin = 250;
        int dayLoseMax = 500;
        int daysToLoseMax = needToLose/dayLoseMin;
        int daysToLoseMin = needToLose/dayLoseMax;
        int daysToLoseAvg = daysToLoseMin + daysToLoseMax/2;

        System.out.println(daysToLoseMax + " дней потребуется для похудения, если спортсмен будет терять по " + dayLoseMin + " грамм в днеь");
        System.out.println(daysToLoseMin + " дней потребуется для похудения, если спортсмен будет терять по " + dayLoseMax + " грамм в днеь");
        System.out.println(daysToLoseAvg + " дней потребуется в среднем чтобы добится результата");
        System.out.println();


    }
    public static void task8() {
        System.out.println("Задача №8");

        double salaryIncreaseRate = 1.10;
        int mashaSalaryPerMonth = 67_760;
        int denisSalaryPerMonth = 83_690;
        int kristinaSalaryPerMonth = 76_230;
        double newMashaSalaryPerMonth = mashaSalaryPerMonth * salaryIncreaseRate;
        double newDenisSalaryPerMonth = denisSalaryPerMonth * salaryIncreaseRate;
        double newKristinaSalaryPerMonth = kristinaSalaryPerMonth * salaryIncreaseRate;

        System.out.println("Маша теперь получает " + newMashaSalaryPerMonth + " рублей. Годовой доход вырос на " + (newMashaSalaryPerMonth - mashaSalaryPerMonth) + " рублей");
        System.out.println("Денис теперь получает " + newDenisSalaryPerMonth + " рублей. Годовой доход вырос на " + (newDenisSalaryPerMonth - denisSalaryPerMonth) + " рублей");
        System.out.println("Кристина теперь получает " + newKristinaSalaryPerMonth + " рублей. Годовой доход вырос на " + (newKristinaSalaryPerMonth - kristinaSalaryPerMonth) + " рублей");
    }

}