package Controller;

import Model.Account;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TextFormatter;
import javafx.scene.layout.GridPane;

import java.text.DecimalFormat;
import java.text.ParsePosition;

public class Controller {
    @FXML
    private GridPane grid;

    private Account user;

    public void setUser(Account user) {
        this.user = user;
    }

    @FXML
    private void initialize() {
    }

    static void restrictToNums(TextField field) {
        DecimalFormat format = new DecimalFormat( "#" );
        field.setTextFormatter( new TextFormatter<>(c ->
        {
            if ( c.getControlNewText().isEmpty() )
            {
                return c;
            }

            ParsePosition parsePosition = new ParsePosition( 0 );
            Object object = format.parse( c.getControlNewText(), parsePosition );

            if ( (object == null) || ((parsePosition.getIndex()) < (c.getControlNewText().length())))
            {
                return null;
            }
            else
            {
                return c;
            }
        }));

    }


}
