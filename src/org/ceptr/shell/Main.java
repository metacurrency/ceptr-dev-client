package org.ceptr.shell;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class Main extends Application {
  
  BorderPane rootLayout = null;
  @Override
  public void start(Stage primaryStage) {
    try {
      rootLayout = new BorderPane();
      Scene scene = new Scene(rootLayout, 400, 400);

      addCenter(rootLayout);
      scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
      primaryStage.setScene(scene);
      primaryStage.show();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  private void addCenter(BorderPane rootLayout2) {
    VBox lines = new VBox();
    rootLayout2.setCenter(lines);
    
    VisualSemanticBox line0 = new VisualSemanticBox();
    lines.getChildren().add(line0);
  }

  public static void main(String[] args) {
    launch(args);
  }
  
  public static void loadTree() {
    
  }
}
