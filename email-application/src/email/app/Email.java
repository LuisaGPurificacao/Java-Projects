package email.app;

public class Email {

    public String email;
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailboxCapacity = 500;
    private String alternateEmail;

    // Constructor to receive the first name and last name
    // Ask for the department
    public Email(String firstName, String lastName, String department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.email = generateEmail(firstName, lastName, department);
        System.out.println("Email created: " + email);
        this.password = generatePassword();
        System.out.println("Password created: " + password);
    }

    private String generateEmail(String firstName, String lastName, String department) {
        StringBuilder email = new StringBuilder();

        if (department == null || department.isBlank())
            email.append(firstName.toLowerCase()).append(".").append(lastName.toLowerCase()).append("@company.com");
        else
            email.append(firstName.toLowerCase()).append(".").append(lastName.toLowerCase()).append("@").append(department.toLowerCase()).append(".company.com");

        return email.toString();
    }

    // Generate a random password
    private String generatePassword() {
        String passwordSet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%&*-_=+[]{};:,.?";
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < 8; i++) {
            int randomIndex = (int) (Math.random() * passwordSet.length());
            password.append(passwordSet.charAt(randomIndex));
        }

        return password.toString();
    }

    // Set the mailbox capacity
    public void setMailboxCapacity(int mailboxCapacity) {
        this.mailboxCapacity = mailboxCapacity;
    }

    // Display the mailbox capacity
    public int getMailboxCapacity() {
        return mailboxCapacity;
    }

    // Set the alternate email
    public void setAlternateEmail(String alternateEmail) {
        this.alternateEmail = alternateEmail;
    }

    // Display the alternate email
    public String getAlternateEmail() {
        return alternateEmail;
    }

    // Change the password
    public void setPassword(String password) {
        this.password = password;
    }

    // Display the password
    public String getPassword() {
        return password;
    }

    // Display the name
    public String getName() {
        return firstName.concat(" ").concat(lastName);
    }

    // Display the email
    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Email{");
        sb.append("email='").append(email).append('\'');
        sb.append(", firstName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", password='").append(password).append('\'');
        sb.append(", department='").append(department).append('\'');
        sb.append(", mailboxCapacity=").append(mailboxCapacity);
        sb.append(", alternateEmail='").append(alternateEmail).append('\'');
        sb.append('}');
        return sb.toString();
    }
}