package MyTest;

import java.util.Scanner;

public class Rating {



        Scanner scanner = new Scanner(System.in);
        char smile1 = '☺';





  void rating(){
        while (true){
            System.out.println("Оцените пожалуйста приложение от 1 до 5");
            int userRating = scanner.nextInt();
            if(userRating==1){
                System.out.println("Будем исправлятся!");
                break;
            }
            if(userRating==2){
                System.out.println("Есть куда расти!");
                break;
            }
            if(userRating==3){
                System.out.println("Неплохо!" + smile1);
                break;
            }
            if(userRating==4){
                System.out.println("Отлично! Спасибо!");
                break;
            }
            if(userRating==5){
                System.out.println("Супер) Спасибо!!");
                break;
            }
            System.out.println("Оценка должна быть от 1 до 5" + " " + smile1);
        }

    }

}



