import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

/**
 * A path node is a button that user could walk through in a puzzle
 * A given path node in a legitimate puzzle always has at least one adjacent elements, and one parent.
 */
public class pathNode extends puzzleNode {

    /* An adjacency list of this path node */
    // private ArrayList<pathNode> adj;
    /* the parent of this path node */
    private pathNode parent;
    
    /* the entry and exit of the path line through this path node
                1 
            ----|----
           |    v    |
      3  --->        <---  4
           |    ^    |
            ----|----
                2
        entry represents where the path line enters.
        when a button is clicked, there's an entry line enters from entry 1,2,3,4 to the center of the node
        after that, when an adjacent button is clicked, the exit line exits from the center to the exit
        and connect to the entry of the adjacent line
    */
    private int entry = -1;
    private int exit = -1;
    /* reveals the entry and exit situtation */
    private boolean hasEntry;
    private boolean hasExit


    public pathNode(){
        super();
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
        if(getParent() == null){
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
    
    public int getEntry(){
		if(hasEntry)
        	return entry;
		else
			return -1;
	}
	
	public int getExit(){
		if(hasExit)	
			return exit;
		else
			return -1;
	}
	
	public int setEntry(int entry){
		if(!hasEntry)
			this.entry = entry;
		//debug
		else
			System.out.println("already has entry");
	}
	
	public int setExit(int exit)
		if(hasEntry && !hasExit)
			this.exit = exit;
		//debug
		else
			System.out.println("already has exit");
	}
	
        

    /**
     * Get the adjacency list of this path node
     * @return the adjacency list of this path node
     */
    /*
    public ArrayList<pathNode> getAdjacent(){
        return adj;
    }
    */
    
    
    /**
     * Add an adjacent path node to the adjacnency list
     * @param p an adjacent path node
     */
    /*
    public void addAdjacent(pathNode p){
        if(!adj.contains(p)) {
            adj.add(p);
        }
    }
    */


}
