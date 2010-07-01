package tyler.breisacher.scribe.model;

public interface MiniGridListener {

  /**
   * Called automatically whenever a mark is added to the minigrid that this
   * is listening to.
   * 
   * @param miniGrid the MiniGrid that has changed 
   * @param xy the position on the grid that got set.
   * @param mark the mark that got placed at {@code xy}
   */
  void miniGridMarked(MiniGrid miniGrid, XY xy, ScribeMark mark);

  /**
   * Called automatically when the minigrid that this is listening to becomes
   * enabled or disabled.
   * 
   * @param miniGrid the MiniGrid that has just become enabled/disabled.
   * @param enabled the new enabled state of the MiniGrid
   */
  void miniGridEnabled(MiniGrid miniGrid, boolean enabled);
}
