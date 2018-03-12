package main;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;

import main.MainPresenter;

public class MainView extends BorderPane
	{
		private MainPresenter mainP;
		private Button display;
		private Button add;
		
		public MainView(MainPresenter mainP)
		{
			this.mainP = mainP;
			initView();
		}
		
		private void initView() 
		{
			Insets padding = new Insets(5, 5, 5, 0);
			HBox top = new HBox();
			top.setPadding(padding);
			
			display = new Button("show");
			add = new Button("add new Preset");
			
			display.setOnAction(e -> mainP.showDisplayView());
			add.setOnAction(e -> mainP.showAddView());

			top.getChildren().addAll(display, add);
			setTop(top);
		}
		
		//getter/setter---------------------------------------------
		public void setContent(Pane content)
		{
			setCenter(content);
		}

		public MainPresenter getPresenter()
			{
				return mainP;
			}

		public void setPresenter(MainPresenter mainP)
			{
				this.mainP = mainP;
			}

		public MainPresenter getMainP()
			{
				return this.mainP;
			}

		public void setMainP(MainPresenter mainP)
			{
				this.mainP = mainP;
			}
	}
