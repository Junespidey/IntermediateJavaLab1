/**
 * @author Namita Singla
 *
 * Class representing Othello player
 */
abstract public class Player {

  /**
   * Constructor
   * @param id Player id
   * @param game Othello game
   */
  public Player(int id, Game game) {
    this.id = id;
    this.game = game;
    next = null;
    score = 2;
  }

  /**
   * Get player id
   * @return player id
   */
  public int getId() {
    return id;
  }

  /**
   * Set next player
   * @param p other player
   */
  public void setNext(Player p) {
    next = p;
  }

  /**
   * Get next player
   * @return next player
   */
  public Player getNext() {
    return next;
  }

  abstract public void makeMove();

  abstract public void selectCell(int row, int column);

  /**
   * Get current score
   * @return score
   */
  public int getScore() {
    return score;
  }

  /**
   * Set current score
   * @param new score
   */
  public void setScore(int score) {
    this.score = score;
  }

  /**
   * Set current move row
   * @param row
   */
  public void setRow(int row) {
    this.row = row;
  }

  /**
   * Get current move row
   * @return current move row
   */
  public int getRow() {
    return row;
  }

  /**
   * Set current move column
   * @param col
   */
  public void setCol(int col) {
    this.col = col;
  }

  /**
   * Get current move column
   * @return current move column
   */
  public int getCol() {
    return col;
  }

  private Player next; // the other player

  protected Game game;

  private int id; //player unique id

  private int score; // player score

  private int row; // current move Row

  private int col; // current move Col
}
