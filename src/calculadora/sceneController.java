/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author 20191148060007
 */
public class sceneController implements Initializable {

    double valor1 = 0;
    double valor2 = 0;
    double resultado = 0;

    String operacao = "";

    @FXML
    private Label label;
    @FXML
    private TextField telaTextField;
    @FXML
    private Button sete;
    @FXML
    private Button quatro;
    @FXML
    private Button um;
    @FXML
    private Button zero;
    @FXML
    private Button oito;
    @FXML
    private Button nove;
    @FXML
    private Button diminuirButton;
    @FXML
    private Button cinco;
    @FXML
    private Button seis;
    @FXML
    private Button somarButton;
    @FXML
    private Button dois;
    @FXML
    private Button tres;
    @FXML
    private Button decimalButton;
    @FXML
    private Button igualButton;
    @FXML
    private Button multiButton;
    @FXML
    private Button dividirButton;
    @FXML
    private Button apagarButton;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        um.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                telaTextField.setText(telaTextField.getText() + "1");
            }
        });

        dois.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                telaTextField.setText(telaTextField.getText() + "2");
            }
        });

        tres.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                telaTextField.setText(telaTextField.getText() + "3");
            }
        });

        quatro.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                telaTextField.setText(telaTextField.getText() + "4");
            }
        });

        cinco.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                telaTextField.setText(telaTextField.getText() + "5");
            }
        });

        seis.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                telaTextField.setText(telaTextField.getText() + "6");
            }
        });

        sete.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                telaTextField.setText(telaTextField.getText() + "7");
            }
        });

        oito.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                telaTextField.setText(telaTextField.getText() + "8");
            }
        });

        nove.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                telaTextField.setText(telaTextField.getText() + "9");
            }
        });

        zero.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                telaTextField.setText(telaTextField.getText() + "0");
            }
        });

        multiButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                valor1 = Double.parseDouble(telaTextField.getText());
                telaTextField.setText("");
                operacao = "*";
            }

        });
        
        dividirButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                valor1 = Double.parseDouble(telaTextField.getText());
                telaTextField.setText("");
                operacao = "/";
            }
        });
        
        somarButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                valor1 = Double.parseDouble(telaTextField.getText());
                telaTextField.setText("");
                operacao = "+";
            }
        });
        
        diminuirButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                valor1 = Double.parseDouble(telaTextField.getText());
                telaTextField.setText("");
                operacao = "-";
            }
        });
        
        apagarButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
               telaTextField.setText("");
               valor1 = 0;
               valor2= 0;
               operacao="";
            }
        });
        
        igualButton.setOnAction (new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                valor2 = Double.parseDouble(telaTextField.getText());
                
                switch(operacao){
                    case "+": 
                        resultado = valor1 + valor2;
                        telaTextField.setText(String.valueOf(resultado));
                        break;
                    case "-":
                        resultado = valor1 - valor2;
                        telaTextField.setText(String.valueOf(resultado));
                        break;
                    case "*":
                        resultado = valor1 * valor2;
                        telaTextField.setText(String.valueOf(resultado));
                        break;
                    case "/":
                        resultado = valor1 / valor2;
                        telaTextField.setText(String.valueOf(resultado));
                        break;
                }
                operacao="";
                valor1=0;
                valor2=0;
            }
        });
        
        decimalButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                telaTextField.setText(telaTextField.getText() + ".");
            }
        });
    }

}
