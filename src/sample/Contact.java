package sample;

import java.io.Serializable;

/**
 * Created by WesleyLewis on 9/13/16.
 */
public class Contact implements Serializable {
    String contactName;
    String contactPhoneNumber;
    String contactEmail;


    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactPhoneNumber() {
        return contactPhoneNumber;
    }

    public void setContactPhoneNumber(String contactPhoneNumber) {
        this.contactPhoneNumber = contactPhoneNumber;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }


    public Contact(String contactName, String contactPhoneNumber, String contactEmail) {
        this.contactName = contactName;
        this.contactPhoneNumber = contactPhoneNumber;
        this.contactEmail = contactEmail;
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %s", contactName, contactPhoneNumber, contactEmail);
    }
}
