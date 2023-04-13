package gui;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.util.Callback;
import model.entities.Person;

public class ViewController implements Initializable {

	@FXML
	private ComboBox<Person> comboxPerson;

	private ObservableList<Person> obLPerson;

	@FXML
	public void onBtComboBoxPersonAction() {
		Person person = comboxPerson.getSelectionModel().getSelectedItem();
		System.out.println(person);
	}
	
	@FXML
	private Button buttonAll;
	
	@FXML
	public void onButtonAllAction() {
		for(Person person : comboxPerson.getItems()) {
			System.out.println(person);
		}
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		List<Person> personList = new ArrayList<>();
		personList.add(new Person(1, "Maria", "maria@gmail.com"));
		personList.add(new Person(2, "João", "joao@gmail.com"));
		personList.add(new Person(3, "Bob", "bob@gmail.com"));

		obLPerson = FXCollections.observableArrayList(personList);
		comboxPerson.setItems(obLPerson);

		Callback<ListView<Person>, ListCell<Person>> factory = lv -> new ListCell<Person>() {
			@Override
			protected void updateItem(Person item, boolean empty) {
				super.updateItem(item, empty);
				setText(empty ? "" : item.getName());

			}
		};
		comboxPerson.setCellFactory(factory);
		comboxPerson.setButtonCell(factory.call(null));
	}
}
