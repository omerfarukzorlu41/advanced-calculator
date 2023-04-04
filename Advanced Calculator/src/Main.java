import java.util.Scanner;

public class Main {
    static int addition(int a,int b){
        int result = a + b;
        System.out.println(a+" + "+ b + " = "+result);
        return result;
    }
    static int subtracion(int a,int b){
        int result = a - b;
        System.out.println(a+" - "+ b + " = "+result);
        return result;
    }
    static int multiplication(int a,int b){
        int result = a * b;
        System.out.println(a+" * "+ b + " = "+result);
        return result;
    }
    static int division(int a,int b){
        if(b == 0){
            System.out.println("bölünen sayi sifir olamaz.");
            return 0;
        }
        int result = a / b;
        System.out.println(a+" / "+ b + " = "+result);
        return result;
    }
    static int modding(int a,int b){
        return a % b;
    }
    static int exponentiation(int a,int b){
        int result = 1;
        for(int i = 1 ; i <=b ;i++){
            result *= a;
        }
        return result;
    }
    static void rectangular(int a,int b){
        System.out.println("rectengular area: "+(a*b));
        System.out.println("rectengular  perimeter: "+(2*(a+b)));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int select;

        String menu = "1-addition\n" +
                "2-subtraction\n" +
                "3-multiplication\n" +
                "4-division\n" +
                "5-modding process\n" +
                "6-exponentiation\n" +
                "7-rectangular area and perimeter calculation\n" +
                "0-exit";
        System.out.println(menu);
        while(true){
            System.out.print("Lütfen yapmak istediğiniz islemi secin: ");
            select = scanner.nextInt();

            if(select == 0){
                break;
            }

            System.out.print("first number: ");
            int a = scanner.nextInt();
            System.out.print("second number: ");
            int b = scanner.nextInt();

          switch (select){
              case 1:
                  addition(a,b);
                  break;
              case 2:
                  subtracion(a,b);
                  break;
              case 3:
                  multiplication(a,b);
                  break;
              case 4:
                  division(a,b);
                  break;
              case 5:
                  System.out.println("Modding: "+modding(a,b));
                  break;
              case 6:
                  System.out.println("exponentiation: "+exponentiation(a,b));
                  break;
              case 7:
                  rectangular(a,b);
                  break;
              default:
                  System.out.println("invalid transaction ");
          }
        }
    }
}
