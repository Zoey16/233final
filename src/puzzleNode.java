import javax.swing.JButton;

/**
 * A puzzle node is a button in a puzzle board
 */
public abstract class puzzleNode extends JButton{
    /**
     * Test if this node could be walk through
     * @return
     */
    public abstract boolean canWalk();
}
