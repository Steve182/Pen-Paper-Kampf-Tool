package main;

import add.AddPresenter;
import add.AddView;
import display.DisplayPresenter;
import display.DisplayView;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.Model;

public class Main extends Application
	{

	@Override
	public void start(Stage stage) throws Exception
		{
			MainPresenter mainP = this.initApplication();
			mainP.showDisplayView();
			
			Scene scene = new Scene(mainP.getView(), 600, 500);
			stage.setScene(scene);
			stage.setTitle("Pen & Paper Kampf Tool");
			stage.show();
		}
	
	private MainPresenter initApplication()
	{
		Model model = new Model();
		
		MainPresenter mainP = new MainPresenter();
		MainView mainV = new MainView(mainP);
		
		DisplayPresenter displayP = new DisplayPresenter();
		DisplayView displayV = new DisplayView(displayP); 
		
		AddPresenter addP = new AddPresenter();
		AddView addV = new AddView(addP);
		
		mainP.setView(mainV);
		mainP.setDisplayP(displayP);
		mainP.setAddP(addP);
		
		displayP.setView(displayV);
		displayP.setModel(model);
		displayP.setMainP(mainP);
		
		addP.setAddV(addV);
		addP.setModel(model);
		addP.setMainP(mainP);
		
		return mainP;
	}
	
	public static void main(String[] args)
		{
			launch(args);
		}

	}
