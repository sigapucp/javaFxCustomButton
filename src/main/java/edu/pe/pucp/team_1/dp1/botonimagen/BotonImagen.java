package edu.pe.pucp.team_1.dp1.botonimagen;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;

public class BotonImagen extends Button {

    protected String targetController = "";
    
    public BotonImagen() {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/BotonImagen.fxml"));

        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);

        try {
            fxmlLoader.load();
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }
    }
    
    public String getTargetController() {
        return targetController;
    }
    
    public void setTargetController(String newTarget) {
        targetController = newTarget;
    }
}
