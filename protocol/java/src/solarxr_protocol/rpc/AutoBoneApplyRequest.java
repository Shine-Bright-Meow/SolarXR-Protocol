// automatically generated by the FlatBuffers compiler, do not modify

package solarxr_protocol.rpc;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

/**
 * Applies the estimated proportions
 */
@SuppressWarnings("unused")
public final class AutoBoneApplyRequest extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_22_10_26(); }
  public static AutoBoneApplyRequest getRootAsAutoBoneApplyRequest(ByteBuffer _bb) { return getRootAsAutoBoneApplyRequest(_bb, new AutoBoneApplyRequest()); }
  public static AutoBoneApplyRequest getRootAsAutoBoneApplyRequest(ByteBuffer _bb, AutoBoneApplyRequest obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public AutoBoneApplyRequest __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }


  public static void startAutoBoneApplyRequest(FlatBufferBuilder builder) { builder.startTable(0); }
  public static int endAutoBoneApplyRequest(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public AutoBoneApplyRequest get(int j) { return get(new AutoBoneApplyRequest(), j); }
    public AutoBoneApplyRequest get(AutoBoneApplyRequest obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
  public AutoBoneApplyRequestT unpack() {
    AutoBoneApplyRequestT _o = new AutoBoneApplyRequestT();
    unpackTo(_o);
    return _o;
  }
  public void unpackTo(AutoBoneApplyRequestT _o) {
  }
  public static int pack(FlatBufferBuilder builder, AutoBoneApplyRequestT _o) {
    if (_o == null) return 0;
    startAutoBoneApplyRequest(builder);
    return endAutoBoneApplyRequest(builder);
  }
}

