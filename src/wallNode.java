/**
 * A wall node is a wall in a puzzle board that cannot be walk through
 */
public class wallNode extends puzzleNode {
    @Override
    public boolean canWalk() {
        return false;
    }
}
