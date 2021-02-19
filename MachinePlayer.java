/**
 * @author Namita Singla
 *
 * Class representing Machine Player
 */

public class MachinePlayer
    extends Player {

  /**
   * Constructor
   * @param id Player id
   * @param game Othello game
   */
  public MachinePlayer(int id, Game game) {
    super(id, game);
  }

  /**
   * Make best possible move
   */
  public void makeMove() {
    Strategy strategy = new OthelloStrategy();
    strategy.bestMove(this, game);
  }

  /**
   * Select cell
   */
  public void selectCell(int rows, int cols) {
    setRow(rows);
    setCol(cols);
    System.out.println("Machine selected: (" + rows + "," + cols + ")");
  }
}
