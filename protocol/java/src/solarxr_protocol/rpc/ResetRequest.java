// automatically generated by the FlatBuffers compiler, do not modify

package solarxr_protocol.rpc;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@javax.annotation.Generated(value="flatc")
@SuppressWarnings("unused")
public final class ResetRequest extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_22_10_26(); }
  public static ResetRequest getRootAsResetRequest(ByteBuffer _bb) { return getRootAsResetRequest(_bb, new ResetRequest()); }
  public static ResetRequest getRootAsResetRequest(ByteBuffer _bb, ResetRequest obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public ResetRequest __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public int resetType() { int o = __offset(4); return o != 0 ? bb.get(o + bb_pos) & 0xFF : 0; }

  public static int createResetRequest(FlatBufferBuilder builder,
      int resetType) {
    builder.startTable(1);
    ResetRequest.addResetType(builder, resetType);
    return ResetRequest.endResetRequest(builder);
  }

  public static void startResetRequest(FlatBufferBuilder builder) { builder.startTable(1); }
  public static void addResetType(FlatBufferBuilder builder, int resetType) { builder.addByte(0, (byte) resetType, (byte) 0); }
  public static int endResetRequest(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public ResetRequest get(int j) { return get(new ResetRequest(), j); }
    public ResetRequest get(ResetRequest obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
  public ResetRequestT unpack() {
    ResetRequestT _o = new ResetRequestT();
    unpackTo(_o);
    return _o;
  }
  public void unpackTo(ResetRequestT _o) {
    int _oResetType = resetType();
    _o.setResetType(_oResetType);
  }
  public static int pack(FlatBufferBuilder builder, ResetRequestT _o) {
    if (_o == null) return 0;
    return createResetRequest(
      builder,
      _o.getResetType());
  }
}

