package add;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class AddView extends BorderPane
	{
		private AddPresenter addP;
				
		public AddView(AddPresenter editP)
			{
				this.addP = editP;
				this.initView();
			}

		public void initView()
			{
				VBox main = new VBox();
				Button newPreset = new Button("create new Preset");
				newPreset.setOnAction(e -> this.showCreateDialog());
				
				main.getChildren().addAll(newPreset);
				setCenter(main);
			}
		
		private void showCreateDialog()
		{
			Stage stage = new Stage();
			VBox root = new VBox();
			HBox box = new HBox();
			Label l = new Label("Enter Preset Name: ");
			TextField nameTF = new TextField();
			Button ok = new Button("OK");
			Label error = new Label("name can't be empty!");
			error.setVisible(false);
			
			ok.setOnAction(e -> {
				if(nameTF.getText().isEmpty())
					error.setVisible(true);
				else
					{
						this.addP.makePreset(nameTF.getText());
						stage.close();
					}
			});
			
			box.getChildren().addAll(l, nameTF);
			root.getChildren().addAll(box, ok, error);
			Scene scene = new Scene(root, 300, 100);
			stage.setScene(scene);
			stage.showAndWait();
		}

		// getter/setter--------------------------------------------
		public AddPresenter getEditP()
			{
				return addP;
			}

		public void setEditP(AddPresenter editP)
			{
				this.addP = editP;
			}
	}
