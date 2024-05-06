public class NumberManipulation {
    public static void main(String[]args) {
        int n = 15; //Let's take n as 15 for example
        manipulateNumber(n);
    }

    static void manipulateNumber(int num) {
        if (num<= 0) {
            System.out.println("Final value: " + num);
            if (num < 0) {
                //If the number is negative, add 5 and print the result
                manipulateNumber(num + 5);
            } else {
                System.out.println("Operation completed.");
            }
        }else {
            //If the number is positive, subtract 5 and print the result
            System.out.println("Final value: "+num);
            manipulateNumber(num-5);
        }
    }
}


