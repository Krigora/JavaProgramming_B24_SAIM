package office_hours.social_media;

public class UsingSocialMedia {
    public static void main(String[] args) {

        FacebookUser fatma = new FacebookUser("FatmaJava", "sadadaudnau", "Fatima O");
        System.out.println(fatma);

        System.out.println(FacebookUser.platform);

        fatma.post("Oh today we had a good office hours");
        fatma.post("I am regretting more java");

        System.out.println(fatma.getAllPost());

        FacebookUser malika = new FacebookUser("MalikaSDET", "dadadadsadad", "Malika Z", 21, 5000);
        System.out.println(malika);
        malika.directMessage(fatma, "hello!");

    }
}
