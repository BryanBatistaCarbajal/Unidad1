package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Controller {
    @FXML TextArea txtReceta, txtIngredientes, txtPreparacion, txtPreguntas;
    public void procesar(ActionEvent procesar){
        try{
            File f= new File ("./src/sample/receta.txt");
            BufferedReader br= new BufferedReader((new FileReader(f)));
            String texto="";
            while ((texto= br.readLine())!=null){
                txtReceta.appendText("\n"+texto);
            }
        }catch (IOException e){
            txtReceta.setText(e.getMessage());
        }
        String []arregloLineas= txtReceta.getText().split("\n");
        for (int x=3;x<17;x++){
            String ingredientes = (Arrays.toString(arregloLineas[x].split(""+"\n")));
            txtIngredientes.setText(ingredientes);
        }
    }
}
