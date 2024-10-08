// automatically generated by the FlatBuffers compiler, do not modify

package solarxr_protocol.rpc;

@SuppressWarnings("unused")
public final class ArmsMountingResetMode {
  private ArmsMountingResetMode() { }
  /**
   * Upper arm going back and forearm going forward
   */
  public static final int BACK = 0;
  /**
   * Arms going forward
   */
  public static final int FORWARD = 1;
  /**
   * Arms going up to the sides into a tpose
   */
  public static final int TPOSE_UP = 2;
  /**
   * Arms going down to the sides from a tpose
   */
  public static final int TPOSE_DOWN = 3;

  public static final String[] names = { "BACK", "FORWARD", "TPOSE_UP", "TPOSE_DOWN", };

  public static String name(int e) { return names[e]; }
}

