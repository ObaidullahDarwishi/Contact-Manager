public class Contact {
    String name;
    long phoneNumber;
    String emailAddress;
    String homeAddress;
    String birthDay;
    String notes;

    public Contact(String name, long phoneNumber, String emailAddress, String homeAddress, String birthDay, String notes) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
        this.homeAddress = homeAddress;
        this.birthDay = birthDay;
        this.notes = notes;
    }

    public Contact() {
        this.name = null;
        this.phoneNumber = 0;
        this.emailAddress = null;
        this.homeAddress = null;
        this.birthDay = null;
        this.notes = null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String toString() {
        return "\nName: " + name +
                "\nPhone: " + phoneNumber +
                "\nEmail: " + emailAddress +
                "\nAddress: " + homeAddress +
                "\nBirthday: " + birthDay +
                "\nNotes: " + notes;
    }
}
