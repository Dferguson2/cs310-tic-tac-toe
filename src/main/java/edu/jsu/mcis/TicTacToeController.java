package edu.jsu.mcis;
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicTacToeController implements ActionListener {

    private final TicTacToeModel model;
    private final TicTacToeView view;
    
    /* CONSTRUCTOR */

    public TicTacToeController(int width) {
        
        /* Initialize model, view, and width */

        model = new TicTacToeModel(width);
        view = new TicTacToeView(this,width);
        
    }

    public String getMarkAsString(int row, int col) {        
        return (model.getMark(row, col).toString());        
    }
    
    public TicTacToeView getView() {        
        return view;        
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        JButton button = ((JButton)event.getSource()); 
        String squareSpot = button.getName();
        squareSpot = squareSpot.replaceFirst("Square","");
        
        String[] location = squareSpot.split("");
        int row = Integer.parseInt(location[0]);
        int col = Integer.parseInt(location[1]);
        model.makeMark(row, col);
        view.updateSquares();
        if(model.isGameover()){
            view.disableSquares();
            view.showResult(model.getResult().toString().toUpperCase());
        }
    }


}