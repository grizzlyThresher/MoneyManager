package View;

import javafx.scene.Node;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;

/**
 * Created by grizz on 5/6/2017.
 */
public class GridManagement {

    public static void addRow(GridPane grid) {
        grid.getRowConstraints().add( new RowConstraints(30));
    }
}
