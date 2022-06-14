package com.conrad.test;

import javafx.application.Application;
import javafx.stage.Stage;

public class FX extends Application {
     public static void go() {
       launch();
     }

     @Override
          public void start(Stage stage) throws Exception {
         stage.show();
         stage.setTitle("Bazinga!");
     }
}