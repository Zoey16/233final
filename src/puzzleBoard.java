import javax.swing.*;
import java.awt.*;

/**
 * A puzzle board is the user interface of a puzzle game.
 * User could play the puzzle by clicking on the path represented by buttons
 */
public class puzzleBoard extends JFrame {

    GridBagLayout puzzlePlace;      // The layout of the board
    JPanel puzzlePanel;             // The panel of the board
    int size_x;                     // The horizontal dimension of the board
    int size_y;                     // The vertical dimension of the board

    /**
     * initialize the puzzle board with given dimension
     * @param x dimension x
     * @param y dimension y
     */
    public puzzleBoard(int x, int y){
        super("puzzle game");
        size_x = x;
        size_y = y;
        puzzlePlace = new GridBagLayout();
        puzzlePanel = new JPanel(puzzlePlace);
        this.add(puzzlePanel);
        this.setSize(500,400);
        this.setVisible(true);
    }

    /**
     * Add an puzzle node to the board at certain coordinate
     * @param node the node to be added
     * @param pos_x the x position
     * @param pos_y the y position
     */
    public void add(puzzleNode node, int pos_x, int pos_y){
        if(pos_x > size_x || pos_y > size_y){
            System.out.println("Cannot Deploy Here");
            return;
        }
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = pos_x;
        c.gridy = pos_y;
        c.gridheight = this.getHeight()/(size_y + 1);
        c.gridwidth = this.getWidth()/size_x;
        puzzlePanel.add(node, c);
    }

    public static void main(String[] args) {
        puzzleBoard p = new puzzleBoard(3,4);
        p.add(new pathNode(), 1,4);
        p.add(new wallNode(), 1,3);
    }
}
