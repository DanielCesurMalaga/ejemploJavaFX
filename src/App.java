import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class App extends Application{
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage escenario) {
        Pane root = new Pane();

        Line linea1 = new Line();
        linea1.setStartX(100);
        linea1.setStartY(100);
        linea1.setEndX(200);
        linea1.setEndY(200);

        Line linea2 = new Line(200, 100, 300, 200);
        linea2.setStrokeWidth(10);

        Line linea3 = new Line(300, 100, 400, 200);
        linea3.setStrokeWidth(5);
        linea3.setStroke(Color.PURPLE);

        root.getChildren().addAll(linea1,linea2,linea3);

        Circle circulo = new Circle(300,200,50, Color.ORANGE);
        circulo.setCenterX(300);
        circulo.setCenterY(200);
        circulo.setRadius(50);
        circulo.setFill(Color.ORANGE);

        Rectangle cuadrado = new Rectangle();
        cuadrado.setX(300);
        cuadrado.setY(200);
        cuadrado.setWidth(40);
        cuadrado.setHeight(40);
        cuadrado.setFill(Color.PINK);

        Polygon pentagono = new Polygon();
        pentagono.getPoints().addAll(
            new Double[]{
                400.0, 200.00,
                450.0, 200.00,
                500.0, 250.00,
                425.00, 300.00,
                350.0, 250.00               
            }
        );


        root.getChildren().addAll(circulo, cuadrado, pentagono);




        escenario.setScene(new Scene(root,600,400));
        escenario.setTitle("Caso1 UD1");
        escenario.show();
    }
}
