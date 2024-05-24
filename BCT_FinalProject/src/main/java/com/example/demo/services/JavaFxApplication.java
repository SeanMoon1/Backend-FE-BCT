package com.example.demo.services;

// BCT memeber SeungYeon Moon, JaeYoung Lee, Arnur Bodnov, Mikhail Semenov

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class JavaFxApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

//
        Button btn=new Button("Calculate");
        Text text = new Text();
        text.setText("Welcome To Shipping Container  Calculator");
        GridPane root=new GridPane();
        Scene scene = new Scene(root,500,400);
        Text laptops = new Text();
        Text Mouse = new Text();
        Text Desktop = new Text();
        Text LCD = new Text();
        Text Total_Conatiner = new Text();
        Text Total_Conatiner_num = new Text();
        Text Total_Amount = new Text();
        Text Total_Amount_num = new Text();


//        Text Fields
        TextField tf1=new TextField();
        TextField tf2=new TextField();
        TextField tf3=new TextField();
        TextField tf4=new TextField();

        laptops.setText("Enter number of laptops");
        Mouse.setText("Enter number of Mouse");
        Desktop.setText("Enter number of Desktop");
        LCD.setText("Enter number of lCD");
        Total_Conatiner.setText("Total number of Container  :");
        Total_Amount.setText("Total number of Amount in Euro :");


        root.addRow(0, text);
        root.addRow(1, laptops,tf1);
        root.addRow(2, Mouse,tf2);
        root.addRow(3, Desktop,tf3);
        root.addRow(4, LCD,tf4);
        root.addRow(5, btn );
        root.addRow(7, Total_Conatiner,Total_Conatiner_num );
        root.addRow(8, Total_Amount ,Total_Amount_num);




//        Event handlers
        //Creating EventHandler
        EventHandler<MouseEvent> handler = new EventHandler<MouseEvent>() {

            //            @Override
            public void handle(MouseEvent event) {
                // TODO Auto-generated method stub

                if(event.getSource()==btn)
                {
                    // Laptops
                    int lapWeight = (int) (Integer.parseInt(tf1.getText())*6.5);
                    int lapVolume = (int) (Integer.parseInt(tf1.getText()) * (0.6*0.5*0.5));

                    //  Mouse
                    int MouseWeight = (int) (Integer.parseInt(tf2.getText())*6.5);
                    int MouseVolume = (int) (Integer.parseInt(tf2.getText()) * (0.6*0.5*0.5));

                    int DesktopWeight = (int) (Integer.parseInt(tf3.getText())*6.5);
                    int DesktopVolume = (int) (Integer.parseInt(tf3.getText()) * (0.6*0.5*0.5));

                    int LcdWeight = (int) (Integer.parseInt(tf4.getText())*6.5);
                    int LcdVolume = (int) (Integer.parseInt(tf4.getText()) * (0.6*0.5*0.5));

                    int Total_Weight = lapWeight + MouseWeight + DesktopWeight + LcdWeight;
                    int Total_Volume = lapVolume + MouseVolume + DesktopVolume + LcdVolume;



                    if(Total_Volume < (2.59*2.43*6.06)){
                        Total_Conatiner_num.setText(String.valueOf(1));

                        if (Total_Weight < 500){
                            Total_Amount_num.setText(String.valueOf(1000));
                        }
                        else{
                            Total_Amount_num.setText(String.valueOf(1200));
                        }
                    }
                    else {
                        int counter = 0;
                        int value = (int) (2.59*2.43*6.06);
                        int cash = 0;
                        for(int i =  Total_Volume; Total_Volume > (2.59*2.43*6.06);  ){
                            Total_Volume  -= value;
                            counter += 1;
                            cash += 1800;

                        }
                        counter += 1;
                        cash += 1200;

                        Total_Conatiner_num.setText(String.valueOf(counter));
                        Total_Amount_num.setText(String.valueOf(cash));


                    }


                }

                event.consume();
            }

        };
        btn.setOnMouseClicked(handler);




        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}