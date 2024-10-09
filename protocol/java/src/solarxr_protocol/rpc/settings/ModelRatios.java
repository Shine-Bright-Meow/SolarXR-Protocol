// automatically generated by the FlatBuffers compiler, do not modify

package solarxr_protocol.rpc.settings;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

/**
 * Settings for the skeletal model that are ratios.
 * These values range from 0 to 1.
 */
@SuppressWarnings("unused")
public final class ModelRatios extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_22_10_26(); }
  public static ModelRatios getRootAsModelRatios(ByteBuffer _bb) { return getRootAsModelRatios(_bb, new ModelRatios()); }
  public static ModelRatios getRootAsModelRatios(ByteBuffer _bb, ModelRatios obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public ModelRatios __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public boolean hasImputeWaistFromChestHip() { return 0 != __offset(4); }
  public float imputeWaistFromChestHip() { int o = __offset(4); return o != 0 ? bb.getFloat(o + bb_pos) : 0f; }
  public boolean hasImputeWaistFromChestLegs() { return 0 != __offset(6); }
  public float imputeWaistFromChestLegs() { int o = __offset(6); return o != 0 ? bb.getFloat(o + bb_pos) : 0f; }
  public boolean hasImputeHipFromChestLegs() { return 0 != __offset(8); }
  public float imputeHipFromChestLegs() { int o = __offset(8); return o != 0 ? bb.getFloat(o + bb_pos) : 0f; }
  public boolean hasImputeHipFromWaistLegs() { return 0 != __offset(10); }
  public float imputeHipFromWaistLegs() { int o = __offset(10); return o != 0 ? bb.getFloat(o + bb_pos) : 0f; }
  /**
   * Hip's yaw and roll is set to the average of legs when 1.0
   */
  public boolean hasInterpHipLegs() { return 0 != __offset(12); }
  public float interpHipLegs() { int o = __offset(12); return o != 0 ? bb.getFloat(o + bb_pos) : 0f; }
  /**
   * Knee trackers' yaw and roll is set to the lower leg's when 1.0
   */
  public boolean hasInterpKneeTrackerAnkle() { return 0 != __offset(14); }
  public float interpKneeTrackerAnkle() { int o = __offset(14); return o != 0 ? bb.getFloat(o + bb_pos) : 0f; }
  /**
   * Upper leg's yaw and roll is set to the lower leg's when 1.0
   */
  public boolean hasInterpKneeAnkle() { return 0 != __offset(16); }
  public float interpKneeAnkle() { int o = __offset(16); return o != 0 ? bb.getFloat(o + bb_pos) : 0f; }

  public static int createModelRatios(FlatBufferBuilder builder,
      float imputeWaistFromChestHip,
      float imputeWaistFromChestLegs,
      float imputeHipFromChestLegs,
      float imputeHipFromWaistLegs,
      float interpHipLegs,
      float interpKneeTrackerAnkle,
      float interpKneeAnkle) {
    builder.startTable(7);
    ModelRatios.addInterpKneeAnkle(builder, interpKneeAnkle);
    ModelRatios.addInterpKneeTrackerAnkle(builder, interpKneeTrackerAnkle);
    ModelRatios.addInterpHipLegs(builder, interpHipLegs);
    ModelRatios.addImputeHipFromWaistLegs(builder, imputeHipFromWaistLegs);
    ModelRatios.addImputeHipFromChestLegs(builder, imputeHipFromChestLegs);
    ModelRatios.addImputeWaistFromChestLegs(builder, imputeWaistFromChestLegs);
    ModelRatios.addImputeWaistFromChestHip(builder, imputeWaistFromChestHip);
    return ModelRatios.endModelRatios(builder);
  }

  public static void startModelRatios(FlatBufferBuilder builder) { builder.startTable(7); }
  public static void addImputeWaistFromChestHip(FlatBufferBuilder builder, float imputeWaistFromChestHip) { builder.addFloat(0, imputeWaistFromChestHip, 0f); }
  public static void addImputeWaistFromChestLegs(FlatBufferBuilder builder, float imputeWaistFromChestLegs) { builder.addFloat(1, imputeWaistFromChestLegs, 0f); }
  public static void addImputeHipFromChestLegs(FlatBufferBuilder builder, float imputeHipFromChestLegs) { builder.addFloat(2, imputeHipFromChestLegs, 0f); }
  public static void addImputeHipFromWaistLegs(FlatBufferBuilder builder, float imputeHipFromWaistLegs) { builder.addFloat(3, imputeHipFromWaistLegs, 0f); }
  public static void addInterpHipLegs(FlatBufferBuilder builder, float interpHipLegs) { builder.addFloat(4, interpHipLegs, 0f); }
  public static void addInterpKneeTrackerAnkle(FlatBufferBuilder builder, float interpKneeTrackerAnkle) { builder.addFloat(5, interpKneeTrackerAnkle, 0f); }
  public static void addInterpKneeAnkle(FlatBufferBuilder builder, float interpKneeAnkle) { builder.addFloat(6, interpKneeAnkle, 0f); }
  public static int endModelRatios(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public ModelRatios get(int j) { return get(new ModelRatios(), j); }
    public ModelRatios get(ModelRatios obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
  public ModelRatiosT unpack() {
    ModelRatiosT _o = new ModelRatiosT();
    unpackTo(_o);
    return _o;
  }
  public void unpackTo(ModelRatiosT _o) {
    Float _oImputeWaistFromChestHip = hasImputeWaistFromChestHip() ? imputeWaistFromChestHip() : null;
    _o.setImputeWaistFromChestHip(_oImputeWaistFromChestHip);
    Float _oImputeWaistFromChestLegs = hasImputeWaistFromChestLegs() ? imputeWaistFromChestLegs() : null;
    _o.setImputeWaistFromChestLegs(_oImputeWaistFromChestLegs);
    Float _oImputeHipFromChestLegs = hasImputeHipFromChestLegs() ? imputeHipFromChestLegs() : null;
    _o.setImputeHipFromChestLegs(_oImputeHipFromChestLegs);
    Float _oImputeHipFromWaistLegs = hasImputeHipFromWaistLegs() ? imputeHipFromWaistLegs() : null;
    _o.setImputeHipFromWaistLegs(_oImputeHipFromWaistLegs);
    Float _oInterpHipLegs = hasInterpHipLegs() ? interpHipLegs() : null;
    _o.setInterpHipLegs(_oInterpHipLegs);
    Float _oInterpKneeTrackerAnkle = hasInterpKneeTrackerAnkle() ? interpKneeTrackerAnkle() : null;
    _o.setInterpKneeTrackerAnkle(_oInterpKneeTrackerAnkle);
    Float _oInterpKneeAnkle = hasInterpKneeAnkle() ? interpKneeAnkle() : null;
    _o.setInterpKneeAnkle(_oInterpKneeAnkle);
  }
  public static int pack(FlatBufferBuilder builder, ModelRatiosT _o) {
    if (_o == null) return 0;
    return createModelRatios(
      builder,
      _o.getImputeWaistFromChestHip(),
      _o.getImputeWaistFromChestLegs(),
      _o.getImputeHipFromChestLegs(),
      _o.getImputeHipFromWaistLegs(),
      _o.getInterpHipLegs(),
      _o.getInterpKneeTrackerAnkle(),
      _o.getInterpKneeAnkle());
  }
}

