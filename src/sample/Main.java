package sample;

import javafx.animation.*;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.ScrollEvent;
import javafx.scene.input.SwipeEvent;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polyline;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.util.Random;

import static com.sun.deploy.trace.Trace.flush;

public class Main extends Application {

    @FXML
    private Rectangle rec4;

    @FXML
    private Rectangle rec1;

    @FXML
    private Rectangle rec3;

    @FXML
    private Rectangle rec2;

    private Stage stage;

    private int winner = 0;

    @FXML
    private Button reset;

//    private MyListener myListener = new MyResponder();

    @FXML
    public void initialize() {
        winner = 0;
        rec1.setFill(Color.BLUE);
        rec2.setFill(Color.BLUE);
        rec3.setFill(Color.BLUE);
        rec4.setFill(Color.BLUE);
//        rec1.addEventHandler(Event.ANY, new EventHandler<Event>() {
//            @Override
//            public void handle(Event event) {
//                if(rec1.getX() >= 590){
//                    System.out.println(1);
//                }
//            }
//        });

//        rec1.setOnSwipeRight(new EventHandler<SwipeEvent>() {
//            @Override
//            public void handle(SwipeEvent event) {
//                if (rec1.getX() > 400) {
//                    System.out.println(1);
//                }
//                event.consume();
//            }
//        });

//        KeyFrame frame = new KeyFrame(Duration.seconds(1), new EventHandler<ActionEvent>() {
//            @Override
//            public void handle(ActionEvent event) {
        start1();
//            }
//        });
    }


    @Override
    public void start(Stage primaryStage) throws Exception {
        stage = primaryStage;
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("7 labka");
        primaryStage.setScene(new Scene(root, 800, 600));
        primaryStage.show();
    }

    private synchronized void start1() {
        Random r = new Random(System.currentTimeMillis());

        ((Runnable) () -> {
            Polyline polyLine = new Polyline();
            polyLine.getPoints().
                    addAll(new Double[]{
                            0.0, 30.0,
                            700.0, 30.0,
                    });
            PathTransition transition = new PathTransition();
            transition.setNode(rec1);
            transition.setPath(polyLine);
            //        transition.setCycleCount(PathTransition.INDEFINITE);
            transition.setDuration(new Duration(r.nextInt(10000 - 2000)));
            transition.statusProperty().addListener(new ChangeListener<Animation.Status>() {
                @Override
                public void changed(ObservableValue<? extends Animation.Status> observableValue,
                                    Animation.Status oldValue, Animation.Status newValue) {
                    if(newValue== Animation.Status.STOPPED && winner == 0){
                        rec1.setFill(Color.RED);
                        Stage st = new Stage();
                        st.initModality(Modality.APPLICATION_MODAL);
                        st.initOwner(stage);
                        VBox dialogVbox = new VBox(20);
                        dialogVbox.getChildren().add(new Text("1st won"));
                        winner = 1;
                        Scene dialogScene = new Scene(dialogVbox, 300, 200);
                        st.setScene(dialogScene);
                        st.show();
                    }
                }
            });
            transition.play();
        }).run();


        ((Runnable) () -> {
            Polyline polyLine = new Polyline();
            polyLine.getPoints().
                    addAll(new Double[]{
                            0.0, 80.0,
                            700.0, 80.0,
                    });
            PathTransition transition = new PathTransition();
            transition.setNode(rec2);
            transition.setPath(polyLine);
            //        transition.setCycleCount(PathTransition.INDEFINITE);
            transition.setDuration(new Duration(r.nextInt(10000 - 2000)));
            transition.statusProperty().addListener(new ChangeListener<Animation.Status>() {
                @Override
                public void changed(ObservableValue<? extends Animation.Status> observableValue,
                                    Animation.Status oldValue, Animation.Status newValue) {
                    if(newValue== Animation.Status.STOPPED && winner == 0){
                        rec2.setFill(Color.RED);
                        Stage st = new Stage();
                        st.initModality(Modality.APPLICATION_MODAL);
                        st.initOwner(stage);
                        VBox dialogVbox = new VBox(20);
                        dialogVbox.getChildren().add(new Text("2nd won"));
                        winner = 2;
                        Scene dialogScene = new Scene(dialogVbox, 300, 200);
                        st.setScene(dialogScene);
                        st.show();
                    }
                }
            });
            transition.play();
        }).run();

        ((Runnable) () -> {
            Polyline polyLine = new Polyline();
            polyLine.getPoints().
                    addAll(new Double[]{
                            0.0, 130.0,
                            700.0, 130.0,
                    });
            PathTransition transition = new PathTransition();
            transition.setNode(rec3);
            transition.setPath(polyLine);
            //        transition.setCycleCount(PathTransition.INDEFINITE);
            transition.setDuration(new Duration(r.nextInt(10000 - 2000)));
            transition.statusProperty().addListener(new ChangeListener<Animation.Status>() {
                @Override
                public void changed(ObservableValue<? extends Animation.Status> observableValue,
                                    Animation.Status oldValue, Animation.Status newValue) {
                    if(newValue== Animation.Status.STOPPED && winner == 0){
                        rec3.setFill(Color.RED);
                        Stage st = new Stage();
                        st.initModality(Modality.APPLICATION_MODAL);
                        st.initOwner(stage);
                        VBox dialogVbox = new VBox(20);
                        dialogVbox.getChildren().add(new Text("3rd won"));
                        winner = 3;
                        Scene dialogScene = new Scene(dialogVbox, 300, 200);
                        st.setScene(dialogScene);
                        st.show();
                    }
                }
            });
            transition.play();
        }).run();

        ((Runnable) () -> {
            Polyline polyLine = new Polyline();
            polyLine.getPoints().
                    addAll(new Double[]{
                            0.0, 150.0,
                            700.0, 150.0,
                    });
            PathTransition transition = new PathTransition();
            transition.setNode(rec4);
            transition.setPath(polyLine);
            //        transition.setCycleCount(PathTransition.INDEFINITE);
            transition.setDuration(new Duration(r.nextInt(10000 - 2000)));
            transition.statusProperty().addListener(new ChangeListener<Animation.Status>() {
                @Override
                public void changed(ObservableValue<? extends Animation.Status> observableValue,
                                    Animation.Status oldValue, Animation.Status newValue) {
                    if(newValue== Animation.Status.STOPPED && winner == 0){
                        rec4.setFill(Color.RED);
                        Stage st = new Stage();
                        st.initModality(Modality.APPLICATION_MODAL);
                        st.initOwner(stage);
                        VBox dialogVbox = new VBox(20);
                        dialogVbox.getChildren().add(new Text("4th won"));
                        winner = 4;
                        Scene dialogScene = new Scene(dialogVbox, 300, 200);
                        st.setScene(dialogScene);
                        st.show();
                    }
                }
            });
            transition.play();
        }).run();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
