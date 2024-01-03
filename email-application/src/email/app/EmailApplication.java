package email.app;

public class EmailApplication {

    public static void main(String[] args) {

        Email em1 = new Email("Luisa", "Purificação", null);

        em1.setAlternateEmail("lp@email.com");
        System.out.println(em1.getAlternateEmail());
        System.out.println(em1.getName());

        System.out.println(em1.toString());

    }

}
