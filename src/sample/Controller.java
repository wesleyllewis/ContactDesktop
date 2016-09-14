package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import jodd.json.JsonSerializer;

import java.io.*;
import java.net.URL;


import java.util.ResourceBundle;


public class Controller implements Initializable {
    ObservableList<Contact> contacts = FXCollections.observableArrayList();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        contactList.setItems(contacts);
    }

    @FXML
    ListView contactList;
    @FXML
    TextField contactName;
    @FXML
    TextField contactPhoneNumber;
    @FXML
    TextField contactEmail;

    public void addContact() throws IOException {
        if (contactName.getText().isEmpty() || contactPhoneNumber.getText().isEmpty() || contactEmail.getText().isEmpty())
            try {
            } catch (Exception e) { //i feel like there's probably a better way
            }
        else {
            contacts.add(new Contact(contactName.getText(), contactPhoneNumber.getText(), contactEmail.getText()));
            writeFile("contacts.json", contacts.toString());
        }
    }

    public void removeContact() {
        Contact contact = (Contact) contactList.getSelectionModel().getSelectedItem();
        contacts.remove(contact);
    }

    private static void writeFile(String fileName, String fileContent) throws IOException {
        File f = new File(fileName);
        FileWriter fw = new FileWriter(f);
        JsonSerializer serializer = new JsonSerializer();
        String json = serializer.include("*").serialize(fileContent);
        fw.write(json);
        fw.close();

    }

}
