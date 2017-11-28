public class ServerNameGenerator {

//Create two arrays whose elements are strings, one with at least 10 adjectives, another with at least 10 nouns.
//Create a method that will return a random element from an array of strings.


    public String[] adjectives = {"beautiful", "tall", "short", "ugly", " hot", "cold", "red", "blue", "new", "old"};
    public String[] nouns = {"dog", "cat", "house", "car", "floor", "door", "window", "sky", "weather", "beach"};

    public static void main(String[] args) {

        ServerNameGenerator sname = new ServerNameGenerator();
        System.out.println("The server name is: " + sname.returnRandomAdjective() + "-" + sname.returnRandomNouns());

    }

    public int returnRandomNumInRange(int max) {
        return (int) Math.floor(Math.random() * max);
    }

    public String returnRandomAdjective() {
        return adjectives[returnRandomNumInRange(adjectives.length)];
    }

    public String returnRandomNouns() {
        return nouns[returnRandomNumInRange(nouns.length)];
    }

}
