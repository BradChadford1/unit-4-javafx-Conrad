import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.event.ActionEvent;
import javafx.scene.text.Font;

public class Cookie extends GridPane{
    private TextField size;
    private Label inputLabel;
    private double radius;

    public Cookie() {
        Font font = new Font(18);
        size = new TextField();
        size.setFont(font);
        size.setPrefWidth(70);
        size.setAlignment(Pos.CENTER);

        inputLabel = new Label();
        inputLabel.setText("Radius: ");
        inputLabel.setFont(font);

        Circle newCookie = new Circle();
        newCookie.setCenterX(150);
        newCookie.setCenterY(100);
        newCookie.setFill(Color.WHITE);
        radius = Double.parseDouble(size.getText());
        newCookie.setRadius(radius);




        setAlignment(Pos.TOP_LEFT);
        setHgap(10);
        setVgap(10);
        add(newCookie, 3,3);
        add(inputLabel, 0,0);
        add(size, 0,1);

    }

}
