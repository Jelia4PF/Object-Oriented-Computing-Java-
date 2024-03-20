import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class MetricConverterAppGui extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Metric Converter");

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        TextField valueField = new TextField();
        ComboBox<String> unitFromComboBox = new ComboBox<>();
        ComboBox<String> unitToComboBox = new ComboBox<>();
        Button convertButton = new Button("Convert");
        Label resultLabel = new Label();

        unitFromComboBox.getItems().addAll("kg", "g", "km", "mm");
        unitToComboBox.getItems().addAll("lb", "oz", "mile", "inch");
        
        grid.add(new Label("Value:"), 0, 0);
        grid.add(valueField, 1, 0);
        grid.add(new Label("From:"), 0, 1);
        grid.add(unitFromComboBox, 1, 1);
        grid.add(new Label("To:"), 0, 2);
        grid.add(unitToComboBox, 1, 2);
        grid.add(convertButton, 1, 3);
        grid.add(resultLabel, 1, 4);

        convertButton.setOnAction(e -> {
            try {
                double value = Double.parseDouble(valueField.getText());
                String unitFrom = unitFromComboBox.getValue();
                String unitTo = unitToComboBox.getValue();
                double convertedValue = convert(value, unitFrom, unitTo);

                if (convertedValue != -1) {
                    resultLabel.setText(value + " " + unitFrom + " = " + convertedValue + " " + unitTo);
                } else {
                    resultLabel.setText("Conversion not supported.");
                }
            } catch (NumberFormatException ex) {
                resultLabel.setText("Invalid number format.");
            }
        });

        Scene scene = new Scene(grid, 400, 275);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    private static double convert(double value, String unitFrom, String unitTo) {
        // Conversion logic remains the same
        if ("kg".equals(unitFrom) && "lb".equals(unitTo)) {
            return value * 2.20462;
        } else if ("g".equals(unitFrom) && "oz".equals(unitTo)) {
            return value * 0.035274;
        } else if ("km".equals(unitFrom) && "mile".equals(unitTo)) {
            return value * 0.621371;
        } else if ("mm".equals(unitFrom) && "inch".equals(unitTo)) {
            return value * 0.0393701;
        } else {
            return -1;
        }
    }
}
