package view;

import java.awt.Color;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JLabel;

import sheet.Sheet;
import xl.Status;

public class StatusArea extends JLabel implements Observer {
    public StatusArea() {
        setBackground(Color.WHITE);
        setOpaque(true);
    }

    public void update(Observable obs, Object arg) {
      setText(((Status) obs).getStatus());
    }
}