package MyTest;

import java.util.Scanner;

public class Practicum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Сколько денег у вас осталось до зарплаты?");
        double moneyBeforeSalary = scanner.nextDouble();
        System.out.println("Сколько дней до зарплаты?");
        int daysBeforeSalary = scanner.nextInt();

        Converter converter = new Converter(78.5, 88.7, 0.75);
        DinnerAdvisor dinnerAdvisor = new DinnerAdvisor();
        ExpensesManager expensesManager = new ExpensesManager();
        SavingManager savingManager = new SavingManager();
        UserGame userGame = new UserGame();
        Rating rating = new Rating();



        while (true){
            printMenu();
            int command = scanner.nextInt();
            if(command==1){
                System.out.println("Ваши сбережения: " + moneyBeforeSalary + " RUB");
                System.out.println("В какую валюту хотите конвертировать? Доступные варианты: 1- USD, 2- EUR, 3- JPY");
                int currency = scanner.nextInt();
                converter.convert(moneyBeforeSalary, currency);
            }else if(command==2){
                dinnerAdvisor.getAdvice(moneyBeforeSalary, daysBeforeSalary);
            }else if(command==3){
                System.out.println("За какой день вы хотите ввести трату:  1- ПН, 2- ВТ, 3- СР, 4- ЧТ, 5- ПТ, 6- СБ, 7- ВС");
                int day = scanner.nextInt();
                System.out.println("Введите размер траты:");
                double expense = scanner.nextDouble();
                moneyBeforeSalary = expensesManager.saveExpense(moneyBeforeSalary, day, expense);
                }else if(command==4){
                expensesManager.printAllExpenses();
            }else if(command==5){
                System.out.println("Самая большая трата на этой неделе составила " + expensesManager.findMaxExpenses() + " руб.");
            }else if(command==6) {
                System.out.println("Финансовая цель?");
                int goal = scanner.nextInt();
                System.out.println("Сколько откладываем сегодня?");
                int moneyToday = scanner.nextInt();
                savingManager.saving(goal, moneyToday);
            }else if(command==7){
                userGame.game();
            }else if (command==0){
                System.out.println("Хотите оценить приложение? 1-Да или 2-Нет");
                int userCommandRating = scanner.nextInt();
                if(userCommandRating==1){
                    rating.rating();
                    break;
                }else if(userCommandRating==2){
                    System.out.println("До свидания!");
                    break;
                }
            }else {
                System.out.println("Такой команды пока нет!");
            }
        }



    }public static void printMenu(){
        System.out.println("Что вы хотите сделать?");
        System.out.println("1 - Конвертировать валюту");
        System.out.println("2 - Получить совет");
        System.out.println("3 - Ввести трату");
        System.out.println("4 - Показать траты за неделю");
        System.out.println("5 - Показать самую большую сумму расходов за неделю");
        System.out.println("6 - Накопить деньги");
        System.out.println("7 - Сыграть в игру с компьютером");
        System.out.println("0 - Выход");
    }




}
