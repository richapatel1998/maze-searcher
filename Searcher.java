
package mini2;

import api.Maze;
import api.MazeCell;
import api.Status;

/**
 * Utility class for searching a maze described by a collection
 * of MazeCell objects.
 */
public class Searcher
{
  /**
   * Recursively searches a given MazeCell and all of its unexplored 
   * neighbors.  Returns true if the current cell is the goal or if
   * the goal is found in a search initiated from this cell by 
   * searching a neighbor.  Returns false if this cell is not
   * unexplored and is not the goal.
   * 
   * @param maze
   *   the maze to be searched
   * @param row
   *   the row for the current cell being searched
   * @param col
   *   the column for the current cell being searched
   * @return
   *   true if a search from the current cell has reached the goal,
   *   false otherwise
   */
  public static boolean search(Maze maze, int row, int col)
  {
    // TODO
    return false;
  }

}
