/**
 * @author Namita Singla
 *
 * Class representing Human Player
 */

public class HumanPlayer
    extends Player {

  /**
   * Constructor
   * @param id Player id
   * @param game Othello game
   */
  public HumanPlayer(int id, Game game) {
    super(id, game);
  }

  public void makeMove() {

  }

  /**
   * Select cell
   */
  public void selectCell(int x, int y) {
    setRow(x);
    setCol(y);
    System.out.println("You selected: (" + x + "," + y + ")");
  }
}
