package com.example.encryption_intarfase;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class HelloController {
    @FXML
    private String user_VIBOR;
    private String user_ADRESS;
    @FXML
    private RadioButton Rashifrovka;

    @FXML
    private Button Start_Change;

    @FXML
    private TextField User_Path_Adress;

    @FXML
    private RadioButton Zashifrovka;

    @FXML
    private Text ReSULT_OPERATION_GET_USER;

    @FXML
    void  initialize () {
        Start_Change.setOnAction(actionEvent -> {







        });






        User_Path_Adress.setOnAction(actionEvent -> {user_ADRESS=User_Path_Adress.getText();
            System.out.println(user_ADRESS);});
        Rashifrovka.setOnAction(actionEvent -> {if (Rashifrovka.isSelected()){user_VIBOR= "Rashifrovka";}else {user_VIBOR= "Zashifrovka";}
            System.out.println(user_VIBOR);});
        Zashifrovka.setOnAction(actionEvent -> {if (Zashifrovka.isSelected()){user_VIBOR="Zashifrovka";}else {user_VIBOR= "Rashifrovka";}System.out.println(user_VIBOR);});

        }

    }


