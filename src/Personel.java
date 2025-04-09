public class Personel {
    private String firstName;
    private String lastName;
    private ContactInfo contactInfo;

    public Personel(String firstName, String lastName, String phone, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.contactInfo = new ContactInfo(phone, email);
    }

    // İç sınıf (Inner Class)
    public class ContactInfo {
        private String phoneNumber;
        private String email;

        public ContactInfo(String phoneNumber, String email) {
            this.phoneNumber = phoneNumber;
            this.email = email;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public String getEmail() {
            return email;
        }

        public void displayContactInfo() {
            System.out.println("Telefon: " + phoneNumber);
            System.out.println("E-posta: " + email);
        }
    }

    //Çalışanın tüm bilgilerini gösteren metot
    public void displayEmployeeInfo() {
        System.out.println("Ad: " + firstName);
        System.out.println("Soyad: " + lastName);
        contactInfo.displayContactInfo();
    }
}
