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
            System.out.println("Год " + io + ", численность населения составляет " + people);
        }

        //Задача 4;
        System.out.println("Задача 4");
        int monthCount = 0;
        double currentAmount = 15000;
        int targetAmounts = 12000000;

        while (currentAmount < targetAmount) {
            currentAmount *= 1.07; // добавляем 7%
            monthCount++;
            System.out.println("Месяц " + monthCount + ", сумма накоплений равна " + currentAmount);
        }
        //Задача 5;
        System.out.println("Задача 5");
        int monthCounts = 0;
        double currentAmounts = 15000;
        int targetAmountss = 12000000;

        while (currentAmounts < targetAmountss) {
            currentAmounts *= 1.07; // добавляем 7%
            monthCount++;

            if (monthCount % 6 == 0) {
                System.out.println("Месяц " + monthCount + ", сумма накоплений равна " + currentAmounts);
            }
        }

        //Задача 6;
        System.out.println("Задача 6");
        int monthCountss = 0;
        int totalMonths = 9 * 12; // 9 лет в месяцах
        int halfYear = 6; // 6 месяцев
        int initialAmount = 15000;
        double currentAmountss = initialAmount;

        while (monthCountss < totalMonths) {
            currentAmountss *= 1.07; // добавляем 7% каждый месяц
            monthCountss++;

            // вывод суммы каждые полгода
            if (monthCountss % halfYear == 0) {
                System.out.println("Полгода " + (monthCountss / halfYear) + ", сумма накоплений равна " + currentAmountss + " рублей.");
            }
        }
        //Задача 7;
        System.out.println("Задача 7");
        int firstFriday = 3;
        for (int day = firstFriday; day <= 31; day += 7) {
            System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет.");
        }

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
    }
}