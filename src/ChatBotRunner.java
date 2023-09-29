public class ChatBotRunner {
    public static void main(String[] args) {
        ChatBot debbie = new ChatBot("Debbie", 2);

        debbie.greeting("Sydney");
        debbie.favoriteNumber(7);
        debbie.weather();
        debbie.favoriteFood("pizza");

        double meters = debbie.convertFeetToMeters(12);
        int sum = debbie.addNumbers(4,9,8);
        String bye = debbie.goodbye();
        int quotient = debbie.divNumbers(6, 3);

        System.out.println("There are " + meters + " meters in 12 feet.");
        System.out.println("The sum of these numbers is " + sum);
        System.out.println("The quotient of these numbers is " + quotient);
        System.out.println(bye);
    }
}
