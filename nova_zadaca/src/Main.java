public class Main {
    public static void main(String[] args) {
        //ZADATAK 2: POVRSINA KRUGA = r2 * PI
        int r = 2;
        int rSquared = r * r;
        double pi = 3.14;
        System.out.println("Area of the circle is " + (rSquared * pi));

        //ZADATAK 3
        int a = 20;
        int b = 15;

        if (a%b==0 && a>10 && a%3==0 && a<10000) {
            System.out.println("true");
        }else{
            System.out.println("false");
        }

        // ZADATAK 4
        int a = 4;
        int b = 4;

        if (a > b) {
            System.out.println("a + b = " + (a + b));
        } else if (b > a) {
            System.out.println("a - b = " + (a - b));
        } else if (a == b) {
            System.out.println("a * b = " + (a * b));

            // ZADATAK 5
            int x = 10;
            int numberToCheck = (x+x+6)/2-x;

            if (numberToCheck%2==0) {
                System.out.println("Number " + numberToCheck + " is divisible by 2");
            }else {
                System.out.println("Number " + numberToCheck + " is not divisible by 2");
            }

            // ZADATAK 6
            int a = 11;
            int b = 23;
            int c = -10;
            int d = 66;
            int x = a + b + c + d;
            int y = x - 1;

            if ((a > 0 && b > 0) || (c > 0 && d > 0)) {
                System.out.println("Sum of a+b+c+d is " + x);
            }
            if (x > 100 && x % 2 == 0) {
                System.out.println("X is divisible by 2 and equals: " + (x / 2));
            } else if ((x > 100) && y % 2 == 0) {
                System.out.println("Y is divisible by 2 and equals: " + (y / 2));
            } else {
                System.out.println("Number is still not divisible by 2");
            }

            //ZADATAK 1
            int cashRegister = 110;
            int bill = -1;
            int change = cashRegister - bill;
            int denominationOfTwenty = 20;
            int denominationOfTen = 10;
            int denominationOfTwo = 2;
            int denominationOfOne = 1;

            System.out.println("Change in denomination 20 KM: " + change/denominationOfTwenty);
            System.out.println("Change in denomination 10 KM: " + (change%denominationOfTwenty/denominationOfTen));
            System.out.println("Change in denomination 2 KM: " + (change%denominationOfTen/denominationOfTwo));
            System.out.println("Change in denomination 1 KM: " + (change%denominationOfTwo/denominationOfOne));

            if (cashRegister>100 && bill>0) {
                System.out.println("You have too much money");
            } else if (bill<=0) {
                System.out.println("You didn't buy anything, did you?!");
            } else if (bill<0) {
                System.out.println("Did you maybe break something?");
            }

            //SUPER DUPER SEGA MEGA BONUS ZADATAK 1

            double cashRegister = 100.00;
            double bill = 92.35;
            double change = cashRegister - bill;
            double a = 0.5;
            double b = 0.2;
            double c = 0.1;
            double d = 0.01;

            double zeroFive = change/a;
            int zeroFiveRounded = (int) zeroFive;

            double zeroTwo = (change%a)/b;
            int zeroTwoRounded = (int) zeroTwo;

            double zeroOne = (change%b)/c;
            int zeroOneRounded = (int) zeroOne;

            double zeroZeroOne = (change%c)/d;
            int zeroZeroOneRounded = (int) zeroZeroOne;

            System.out.println("Change in denomination 0.5 KM: " + zeroFiveRounded);
            System.out.println("Change in denomination 0.2 KM: " + zeroTwoRounded);
            System.out.println("Change in denomination 0.1 KM: " + zeroOneRounded);
            System.out.println("Change in denomination 0.01 KM: " + zeroZeroOneRounded);


        }
    }
