import java.util.Scanner;

class PlannerPractic {
    public static void main(String[] args) {
        Scanner userReply = new Scanner(System.in);

        System.out.println("What day do you want to be assigned as the first day of the week?");
        String weekDay = userReply.nextLine();

        System.out.println("Your week starts on " + weekDay);

        System.out.println("How many days a week do you want to use this planner?");
        int dayCount = userReply.nextInt();
        userReply.nextLine(); // Consume the newline character left in the buffer

        String[] dayNames = new String[dayCount];
        int[] dailyCosts = new int[dayCount];
        int weeklyCost = 0;

        for (int i = 0; i < dayCount; i++) {
            System.out.println("Enter day " + (i + 1) + ": ");
            dayNames[i] = userReply.nextLine();

            System.out.println("How much money have you used today?");
            System.out.print("$");
            dailyCosts[i] = userReply.nextInt();
            weeklyCost += dailyCosts[i]; // Accumulate the daily cost into the weekly cost

            userReply.nextLine(); // Consume the newline character left in the buffer
        }

        System.out.println("Days in your planner:");
        for (int i = 0; i < dayCount; i++) {
            System.out.println(dayNames[i] + ": $" + dailyCosts[i]);
        }

        System.out.println("This week you have spent $" + weeklyCost);
    }
}
