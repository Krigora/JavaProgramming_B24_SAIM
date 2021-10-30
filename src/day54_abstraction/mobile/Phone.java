package day54_abstraction.mobile;

public class Phone {
    public static void main(String[] args) {

        MobileApp app1 = new MobileApp();
        app1.setName("Generic");
        app1.setVersion(0.1);
        app1.useApp(10);
        app1.download();

        System.out.println();

        Instagram instagram = new Instagram();
        //instagram.name = "instagram";
        instagram.setName("Instagram");
        instagram.setVersion(1.1);
        instagram.download();
        instagram.useApp(15);

        System.out.println();

        // creating a Discord class object and called instance methods for this class. Cannot directly access the name or version still, but we can indirectly via the getters and setters

        Discord discord = new Discord();
        discord.setName("Discord");
        discord.setVersion(11.4);
        discord.download();
        discord.useApp(10);


    }
}
