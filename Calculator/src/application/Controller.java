package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private TextField textField;

    @FXML

    private String firstNum = "";

    private String NumActuel = "";

    private String TypeCalcul;

    @FXML
    void addition(ActionEvent event) {
        calculationSetup("+");
    }
    
    @FXML
    void multiplication(ActionEvent event) {
        calculationSetup("*");
    }
    
    @FXML
    void soustraction(ActionEvent event) {
        calculationSetup("-");
    }

    @FXML
    void division(ActionEvent event) {
        calculationSetup("/");
    }

   
    public void calculationSetup(String TypeCalcul){
        this.TypeCalcul = TypeCalcul;
        firstNum = NumActuel;
        NumActuel = "";
    }

    @FXML
    void calculate(ActionEvent event) {
        int firstNumInt = Integer.parseInt(firstNum);
        int secondNumberInt = Integer.parseInt(NumActuel);

        switch (TypeCalcul) {
            case "+" -> {
                int calculatedNumber = firstNumInt + secondNumberInt;
                textField.setText(String.valueOf(calculatedNumber));
            }
            case "-" -> {
                int calculatedNumber = firstNumInt - secondNumberInt;
                textField.setText(String.valueOf(calculatedNumber));
            }
            case "/" -> {
                double calculatedNumber = firstNumInt / (double)secondNumberInt;
                textField.setText(String.valueOf(calculatedNumber));
            }
            case "*" -> {
                int calculatedNumber = firstNumInt * secondNumberInt;
                textField.setText(String.valueOf(calculatedNumber));
            }
        }
    }

    @FXML
    void clearTextField(ActionEvent event) {
        NumActuel = "";
        textField.setText("");
    }

    @FXML
    void button0Clicked(ActionEvent event) {
        if(!NumActuel.equals("")){
            addNumber("0");
        }
    }

    @FXML
    void button1Clicked(ActionEvent event) {
        addNumber("1");
    }

    @FXML
    void button2Clicked(ActionEvent event) {
        addNumber("2");
    }

    @FXML
    void button3Clicked(ActionEvent event) {
        addNumber("3");
    }

    @FXML
    void button4Clicked(ActionEvent event) {
        addNumber("4");
    }

    @FXML
    void button5Clicked(ActionEvent event) {
        addNumber("5");
    }

    @FXML
    void button6Clicked(ActionEvent event) {
        addNumber("6");
    }

    @FXML
    void button7Clicked(ActionEvent event) {
        addNumber("7");
    }

    @FXML
    void button8Clicked(ActionEvent event) {
        addNumber("8");
    }

    @FXML
    void button9Clicked(ActionEvent event) {
        addNumber("9");
    }

    public void updateTextField(){
        textField.setText(NumActuel);
    }

    public void addNumber(String number){
        NumActuel += number;
        updateTextField();
    }
}