package com.company;

public class ExpenseTesting {
    public static void main(String[] args) {

        double[] feedExpensesCat = {100.50, 236.0, 510.6, 150.20, 80.0, 172.0, 135.4};
        double[] feedExpensesHamster = {70.50, 146.0, 710.6, 250.20, 83.0, 19.0, 55.4};
        sayHello("Пиксель");
        System.out.println("Твой самый дорогой корм стоил " + findMaxExpense(feedExpensesCat));
        System.out.println("Всего на корм было потрачено " + findExpensesSum(feedExpensesCat));
        sayEnjoyMeal("Пиксель");

        sayHello("Байт");
        System.out.println("Твой самый дорогой корм стоил " + findMaxExpense(feedExpensesHamster));
        System.out.println("Всего на корм было потрачено " + findExpensesSum(feedExpensesHamster));
        sayEnjoyMeal("Байт");

    }

        public static void sayHello(String name){
            System.out.println("Привет, "+ name);
        }



        public static double findMaxExpense(double[]expenses){
            double findMaxExpense  = 0;
            for (int i = 0; i < expenses.length; i++) {
                if (expenses[i] > findMaxExpense) {
                    findMaxExpense = expenses[i];
                    // return findMaxExpense;
                }
            } return findMaxExpense;
        }



        public static double findExpensesSum(double[]expenses){
            double findExpensesSum = 0;
            for (int i = 0; i < expenses.length; i++) {
                findExpensesSum = findExpensesSum + expenses[i];
                // return findExpensesSum;
            }  return findExpensesSum;
        }



        public static void sayEnjoyMeal(String name){
            System.out.println("Приятного аппетита, " + name + " !");
        }

    }

