public class ServerNameGenerator {
    final public static String [] adjectives = {"pretty", "obscure", "distant", "radical", "meaningful", "sincere", "dubious", "faux", "honest", "dire"};

    final public static String [] nouns = {"horse", " machine", "despot", "radical", "definitions", "streak", "warning", "observation", "merchant", "phase"};

    public static String buildDomain () {
        String adjective = adjectives[(int) (Math.random()*10)];
        String noun = nouns[(int) (Math.random()*10)];
        return adjective + "-" + noun;
    }
    public static void main (String [] args) {
        System.out.println();
        System.out.println("your list of 10 possible domains.");
        for (int i = 0; i<10; i++) {
            System.out.println(buildDomain());
        } //for loop close

    } //main method close

} // ServerNameGenerator class close
