package com.example.calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;


public class CalculatorController {

    @FXML
    private TextField textField;

    private String firstNumber = "";

    private String currentNumber = "";

    private String calculationType;

    @FXML
    void addition(ActionEvent event) {
        calculationSetup("+");
    }

    @FXML
    void substraction(ActionEvent event) {
        calculationSetup("-");
    }

    @FXML
    void division(ActionEvent event) {
        calculationSetup("/");
    }

    @FXML
    void multiplication(ActionEvent event) {
        calculationSetup("*");
    }

    public void calculationSetup(String calculationType){
        this.calculationType = calculationType;
        firstNumber = currentNumber;
        currentNumber = "";
    }

    @FXML
    void equals(ActionEvent event) {
        double firstNumberInt = Integer.parseInt(firstNumber);
        double secondNumberInt = Integer.parseInt(currentNumber);

        switch (calculationType) {
            case "+" -> {
                double calculatedNumber = firstNumberInt + secondNumberInt;
                textField.setText(String.valueOf(calculatedNumber));
            }
            case "-" -> {
                double calculatedNumber = firstNumberInt - secondNumberInt;
                textField.setText(String.valueOf(calculatedNumber));
            }
            case "/" -> {
                double calculatedNumber = firstNumberInt / secondNumberInt;
                textField.setText(String.valueOf(calculatedNumber));
            }
            case "*" -> {
                double calculatedNumber = firstNumberInt * secondNumberInt;
                textField.setText(String.valueOf(calculatedNumber));
            }
        }
    }

    @FXML
    void clear(ActionEvent event) {
        currentNumber = "";
        textField.setText("");
    }

    @FXML
    void zero(ActionEvent event) {
        if(!currentNumber.equals("")){
            addNumber("0");
        }
    }

    @FXML
    void one(ActionEvent event) {
        addNumber("1");
    }

    @FXML
    void two(ActionEvent event) {
        addNumber("2");
    }

    @FXML
    void three(ActionEvent event) {
        addNumber("3");
    }

    @FXML
    void four(ActionEvent event) {
        addNumber("4");
    }

    @FXML
    void five(ActionEvent event) {
        addNumber("5");
    }

    @FXML
    void six(ActionEvent event) {
        addNumber("6");
    }

    @FXML
    void seven(ActionEvent event) {
        addNumber("7");
    }

    @FXML
    void eight(ActionEvent event) {
        addNumber("8");
    }

    @FXML
    void nine(ActionEvent event) {
        addNumber("9");
    }

    public void updateTextField(){
        textField.setText(currentNumber);
    }

    public void addNumber(String number){
        currentNumber += number;
        updateTextField();
    }
}
