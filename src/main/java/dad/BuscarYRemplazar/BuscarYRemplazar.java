package dad.BuscarYRemplazar;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BuscarYRemplazar extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub

		CheckBox primer = new CheckBox("Mayusculas y minusculas");
		CheckBox segundo = new CheckBox("Buscar hacia atras");
		CheckBox tercero = new CheckBox("Expresion Regular");
		CheckBox cuarto = new CheckBox("Resaltar Resultados");

		GridPane segundoG = new GridPane();
		segundoG.setPadding(new Insets(5));
		segundoG.setHgap(10);
		segundoG.setVgap(10);

		segundoG.add(primer, 0, 0);
		segundoG.add(segundo, 1, 0);
		segundoG.add(tercero, 0, 1);
		segundoG.add(cuarto, 1, 1);

		ColumnConstraints[] colsbotones = { new ColumnConstraints(), new ColumnConstraints(), };
		segundoG.getColumnConstraints().setAll(colsbotones);

		colsbotones[0].setHgrow(Priority.ALWAYS);
		colsbotones[1].setHgrow(Priority.ALWAYS);

		Label Buscar = new Label("Buscar:");
		TextField primerT = new TextField();

		Label Remplazar = new Label("Remplazar con:");
		TextField segundoT = new TextField();

		GridPane primerG = new GridPane();
		primerG.setPadding(new Insets(5));
		primerG.add(Buscar, 0, 0);
		primerG.add(primerT, 1, 0);
		primerG.add(Remplazar, 0, 1);
		primerG.add(segundoT, 1, 1);
		primerG.add(segundoG, 1, 2);

		ColumnConstraints[] cols = { new ColumnConstraints(), new ColumnConstraints(), };
		primerG.getColumnConstraints().setAll(cols);

		cols[1].setHgrow(Priority.ALWAYS);
		cols[1].setFillWidth(true);

		Button buscar = new Button("Buscar");
		buscar.setMinWidth(150);
		buscar.setMaxWidth(150);
		Button remplaza = new Button("Reemplazar");
		remplaza.setMinWidth(150);
		remplaza.setMaxWidth(150);
		Button remplazarT = new Button("Reemplazar todo");
		remplazarT.setMinWidth(150);
		remplazarT.setMaxWidth(150);
		Button cerrar = new Button("Cerrar");
		cerrar.setMinWidth(150);
		cerrar.setMaxWidth(150);
		Button ayuda = new Button("Ayuda");
		ayuda.setMinWidth(150);
		ayuda.setMaxWidth(150);

		VBox segundoV = new VBox(5, buscar, remplaza, remplazarT, cerrar, ayuda);

		HBox root = new HBox(5, primerG, segundoV);
		HBox.setHgrow(primerG, Priority.ALWAYS);
		Scene scene = new Scene(root, 320, 200);

		primaryStage.setTitle("Buscar Y Reemplazar");
		primaryStage.setScene(scene);
		primaryStage.show();

	}

}
