package it.tdp.polito.lab0.controller;


	
import it.tdp.polito.lab0.model.Model;

import java.net.URL;

import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

	public class  Lab0Controller {
		private Model model;

	    @FXML
	    private ResourceBundle resources;

	    @FXML
	    private URL location;

	    @FXML
	    private Button cancelBtn;

	    @FXML
	    private Button insertBtn;

	    @FXML
	    private TextField textArea;

	    @FXML
	    private TextField textField;

	    @FXML
	    void doCancel(ActionEvent event) {
	    	this.model.reset();
	    	this.textArea.setText("I dati sono stati cancellati");
	    	

	    }

	    @FXML
	    void doInsert(ActionEvent event) {
	    	String p="";
	     p=this.textField.getText();
	    	if(p==""){
	    		this.textArea.setText("inserire una parola nella casella apposta");
	    		return;
	    	}
	    	else{
	    		model.addParola(p);
	 ;
	    		this.textArea.setText(model.getElenco().toString());;
	    		
	    	}
	    	

	    }

		public void set(Model model) {
			this.model=model;
		}

	    @FXML
	    void initialize() {
	        assert cancelBtn != null : "fx:id=\"cancelBtn\" was not injected: check your FXML file 'lab0.fxml'.";
	        assert insertBtn != null : "fx:id=\"insertBtn\" was not injected: check your FXML file 'lab0.fxml'.";
	        assert textArea != null : "fx:id=\"textArea\" was not injected: check your FXML file 'lab0.fxml'.";
	        assert textField != null : "fx:id=\"textField\" was not injected: check your FXML file 'lab0.fxml'.";

	    }

	}


