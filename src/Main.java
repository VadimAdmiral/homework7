public class Main {
    public static void main(String[] args) {
        //Задача 1;
        System.out.println("Задача 1");
        int targetAmount = 2_459_000;
        int monthlyFee = 15_000;
        int currentSum = 0;
        int months = 0;
        while (currentSum < targetAmount) {
            months++;
            currentSum += monthlyFee;
            System.out.println("Месяц " + months + " , сумма накоплений равна " + currentSum + "рублей.");
        }

        System.out.println("Потребуется " + months + " месяцев, чтобы накопить " + targetAmount + "рублей.");
//Задача 2;
        System.out.println("Задача 2");
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        for (int io = 10; io >= 1; io--)
            System.out.print(io + " ");
//Задача 3;
        System.out.println("Задача 3");
        int people = 12_000_000;
        int birthRate = 17;
        int fatality = 8;
        int years = 10;

        for (int io = 1; io <= years; io++) {
            int newBirths = people * birthRate / 1000;
            int deaths = people * fatality / 1000;
            people = people + newBirths - deaths;
            System.out.println("Год " + io + ", численность населения составляет " + people);}

            //Задача 4;
            System.out.println("Задача 4");
            int deposit = 15_000;
            int depositFinal = 12_000_000;
            double capital = 0.07;
            int month = 0;
            while (deposit < depositFinal)
                deposit += deposit * capital;
            month++;{
            System.out.println("Месяц " + month + ", сумма накоплений равна " + deposit + " рублей");}
            //Задача 5;
            System.out.println("Задача 5");
            int currentAmount = 15_000;
            int depositFinals = 12_000_000;
            double capitals = 0.07;
            int monthCount = 0;
            while (currentAmount < depositFinals)
                currentAmount += currentAmount * capitals;
            monthCount++;
            if (monthCount % 6 == 0){
                System.out.println("Месяц " + monthCount + ", сумма накоплений равна " + currentAmount + " рублей");}

            //Задача 6;
            System.out.println("Задача 6");
            for (int yearse = 1; yearse <= 9; yearse++)
                for (int monthCounts = 1; monthCounts <= 6; monthCounts++)
                    currentAmount += currentAmount * capitals;{
            System.out.println("Полгода " + "yearse" + ", сумма накоплений равна " + currentAmount + "рублей.");}
            //Задача 7;
            System.out.println("Задача 7");
            int firstFriday = 3;
            for (int day = firstFriday; day <= 31; day += 7){
                System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет.");}

            //Задача 8;
            System.out.println("Задача 8");
            int cometaYear = 0;
            int ourYear = 2025;
            int beginning = ourYear - 200;
            int ending = ourYear + 100;
            do {
                cometaYear += 79;
                if (cometaYear > beginning && cometaYear < ending) {
                    System.out.println(cometaYear);
                }
            } while (cometaYear < ending);
        }}