package npp.robot.controllers;

import javafx.scene.Node;
import npp.robot.core.Place;
import npp.robot.windows.MainWindow;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by mac on 28.05.16.
 */
public class BaseController  implements IController {

    public static final Logger log = LoggerFactory.getLogger(BaseController.class);
    public static Place place = Place.getInstance();

    private Node view;

    @Override
    public Node getView() {
        return view;
    }

    @Override
    public void setView (Node view){
        this.view = view;
    }

//    @Override
//    public Scene getScene() {
//        return null;
//    }
//
//    @Override
//    public void setScene(Scene scene) {
//
//    }

    @Override
    public void show() {
        preShowing();
        MainWindow.getNavigation().Show(this);
        postShowing();
    }

    public void preShowing()
    {
    }

    public void postShowing()
    {
    }
}