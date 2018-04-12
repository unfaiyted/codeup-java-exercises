

public class ServerNameGenerator {

    public static void main(String[] args) {


        String[] adjetives = {"happy","jolly","jovial","deviant","fetching","punctual","tenacious","catlike","sleepy"};
        String[] nouns = {"coder","muscle","cat","fish","mouse","latte","paper","duck","chicken","hand","teacher"};

        System.out.println("Here is your server name:");
        System.out.println(randomElement(adjetives) + "-" + randomElement(nouns));

    }

    private static String randomElement(String[] name) {
        return name[(int) (Math.random() * name.length)];
    }


}
