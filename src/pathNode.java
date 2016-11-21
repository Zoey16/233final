import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

/**
 * A path node is a button that user could walk through in a puzzle
 * A given path node in a legitimate puzzle always has at least one adjacent elements, and one parent.
 */
public class pathNode extends puzzleNode {

    /* An adjacency list of this path node */
    private ArrayList<pathNode> adj;
    /* the parent of this path node */
    private pathNode parent;


    public pathNode(){
        super();
        this.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
    }

    /**
     * a path node could be walked through
     * @return true
     */
    @Override
    public boolean canWalk() {
        return true;
    }

    /**
     * set the parent of this path node
     * @param parent the parent
     * @return true if success, false otherwise
     */
    public boolean setParent(pathNode parent){
        if(getParent() != null){
            this.parent = parent;
            return true;
        }
        return false;
    }

    /**
     * Get the parent of this path node
     * @return the parent of this path node
     */
    public pathNode getParent(){
        return parent;
    }

    /**
     * Get the adjacency list of this path node
     * @return the adjacency list of this path node
     */
    public ArrayList<pathNode> getAdjacent(){
        return adj;
    }

    /**
     * Add an adjacent path node to the adjacnency list
     * @param p an adjacent path node
     */
    public void addAdjacent(pathNode p){
        if(!adj.contains(p)) {
            adj.add(p);
        }
    }


}
