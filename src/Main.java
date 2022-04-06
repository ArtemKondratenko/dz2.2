public class Main {

    public static void main(String[] args) {
        int current_Account  = 600;
        int replenishment = 600;
        int bonus = 0;

        int totalSum = current_Account + replenishment;
        if (totalSum >= 1000) {
            bonus = totalSum / 100;
        }

        System.out.println(bonus);
        System.out.println(totalSum+bonus);


    }
}

