// automatically generated by the FlatBuffers compiler, do not modify

package solarxr_protocol.rpc;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

/**
 * Settings related to IMU yaw drift compensation
 */
@SuppressWarnings("unused")
public final class DriftCompensationSettings extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_22_10_26(); }
  public static DriftCompensationSettings getRootAsDriftCompensationSettings(ByteBuffer _bb) { return getRootAsDriftCompensationSettings(_bb, new DriftCompensationSettings()); }
  public static DriftCompensationSettings getRootAsDriftCompensationSettings(ByteBuffer _bb, DriftCompensationSettings obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public DriftCompensationSettings __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public boolean enabled() { int o = __offset(4); return o != 0 ? 0!=bb.get(o + bb_pos) : false; }
  /**
   * 0 to 1. A higher value results in more yaw drift compensation
   */
  public float amount() { int o = __offset(6); return o != 0 ? bb.getFloat(o + bb_pos) : 0.0f; }
  /**
   * Number of previous resets to take into account when calculating yaw drift
   */
  public int maxResets() { int o = __offset(8); return o != 0 ? bb.getShort(o + bb_pos) & 0xFFFF : 0; }

  public static int createDriftCompensationSettings(FlatBufferBuilder builder,
      boolean enabled,
      float amount,
      int maxResets) {
    builder.startTable(3);
    DriftCompensationSettings.addAmount(builder, amount);
    DriftCompensationSettings.addMaxResets(builder, maxResets);
    DriftCompensationSettings.addEnabled(builder, enabled);
    return DriftCompensationSettings.endDriftCompensationSettings(builder);
  }

  public static void startDriftCompensationSettings(FlatBufferBuilder builder) { builder.startTable(3); }
  public static void addEnabled(FlatBufferBuilder builder, boolean enabled) { builder.addBoolean(0, enabled, false); }
  public static void addAmount(FlatBufferBuilder builder, float amount) { builder.addFloat(1, amount, 0.0f); }
  public static void addMaxResets(FlatBufferBuilder builder, int maxResets) { builder.addShort(2, (short) maxResets, (short) 0); }
  public static int endDriftCompensationSettings(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public DriftCompensationSettings get(int j) { return get(new DriftCompensationSettings(), j); }
    public DriftCompensationSettings get(DriftCompensationSettings obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
  public DriftCompensationSettingsT unpack() {
    DriftCompensationSettingsT _o = new DriftCompensationSettingsT();
    unpackTo(_o);
    return _o;
  }
  public void unpackTo(DriftCompensationSettingsT _o) {
    boolean _oEnabled = enabled();
    _o.setEnabled(_oEnabled);
    float _oAmount = amount();
    _o.setAmount(_oAmount);
    int _oMaxResets = maxResets();
    _o.setMaxResets(_oMaxResets);
  }
  public static int pack(FlatBufferBuilder builder, DriftCompensationSettingsT _o) {
    if (_o == null) return 0;
    return createDriftCompensationSettings(
      builder,
      _o.getEnabled(),
      _o.getAmount(),
      _o.getMaxResets());
  }
}

