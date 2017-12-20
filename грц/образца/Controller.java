package sample;


import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.canvas.GraphicsContext;
import javafx.stage.Stage;
import javafx.scene.canvas.Canvas;

import javax.swing.text.LabelView;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Controller {
    @FXML
    public Label label1;
    @FXML
    public Canvas mainCanvas;

    public void doIT() {
        FXMLLoader root = new FXMLLoader(getClass().getResource("sample.fxml"));
        Stage stage = new Stage();;
        stage.setTitle("ХУЕТА");
        GraphicsContext gc = mainCanvas.getGraphicsContext2D();
        gc.strokeRoundRect(100, 100, 100, 100, 0, 0);
    }
}
