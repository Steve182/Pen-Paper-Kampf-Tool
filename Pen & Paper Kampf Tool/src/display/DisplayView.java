package display;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import model.Entity;

public class DisplayView extends BorderPane
	{
		private DisplayPresenter displayP;
				
		public DisplayView(DisplayPresenter displayP)
		{
			this.displayP = displayP;
			initView();
		}
		
		private void initView()
		{
			VBox main = new VBox();
			HBox box = new HBox(); 
			HBox bottomBox = new HBox(); 

			Insets ins = new Insets(5);
			box.setPadding(ins);
			main.setPadding(ins);
			
			TableView<Entity> tv = new TableView<>();
			TextField hpField = new TextField();
			Button changeHP = new Button("subtract/add");
			Button nextEntity = new Button("next Entity");
			Button nextPreset = new Button("next Preset");
			
			box.getChildren().addAll(tv, hpField, changeHP);
			bottomBox.getChildren().addAll(nextEntity, nextPreset);
			main.getChildren().addAll(box, bottomBox);
			setCenter(main);
		}
		
		//getter/setter-------------------------------------------
		public DisplayPresenter getDisplayP()
			{
				return displayP;
			}

		public void setDisplayP(DisplayPresenter displayP)
			{
				this.displayP = displayP;
			}
	}
