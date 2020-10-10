package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    @FXML TextField txtFrase;
    @FXML Label lblResultado;
    @FXML ComboBox comboBox;
    @FXML protected void initialize(){
        comboBox.getItems().addAll("Char At", "Ends With", "compareTo", "EqualsIgnoreCase", "IndexOf", "Replace", "ReplaceFirst", "Split", "startsWith", "Substring");
    }
    public void evento(ActionEvent event){
        String texto=txtFrase.getText();
    switch (comboBox.getSelectionModel().getSelectedIndex()){
        case 0:{
            char res=texto.charAt(2);
            lblResultado.setText(res+"");
            break;
        }
        case 1:{
            boolean res= texto.endsWith("a");
            lblResultado.setText(res+"");
            break;
        }
        case 2:{
            int res=texto.compareTo("ojo");
            lblResultado.setText(res+"");
            break;
        }
        case 3: {
            boolean res=texto.equalsIgnoreCase("london");
            lblResultado.setText(res+"");
            break;
        }
        case 4:{
            int res=texto.indexOf("a");
            lblResultado.setText(res+"");
            break;
        }
        case 5:{
            String res=texto.replace("a","o");
            lblResultado.setText(res+"");
            break;
        }
        case 6:{
            String res=texto.replaceFirst("a", "o");
            lblResultado.setText(res+"");
            break;
        }
        case 7:{
            String[] res= texto.split("a", 4);
            lblResultado.setText(res+"");
            break;
        }
        case 8: {
            boolean res=texto.startsWith("p");
            lblResultado.setText(res+"");
            break;
        }
        case 9:{
            String res=texto.substring(1,3);
            lblResultado.setText(res+"");
            break;
        }
    }
    }

}
