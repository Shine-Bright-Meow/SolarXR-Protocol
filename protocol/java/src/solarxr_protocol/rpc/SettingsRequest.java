// automatically generated by the FlatBuffers compiler, do not modify

package solarxr_protocol.rpc;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@javax.annotation.Generated(value="flatc")
@SuppressWarnings("unused")
public final class SettingsRequest extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_22_10_26(); }
  public static SettingsRequest getRootAsSettingsRequest(ByteBuffer _bb) { return getRootAsSettingsRequest(_bb, new SettingsRequest()); }
  public static SettingsRequest getRootAsSettingsRequest(ByteBuffer _bb, SettingsRequest obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public SettingsRequest __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }


  public static void startSettingsRequest(FlatBufferBuilder builder) { builder.startTable(0); }
  public static int endSettingsRequest(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public SettingsRequest get(int j) { return get(new SettingsRequest(), j); }
    public SettingsRequest get(SettingsRequest obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
  public SettingsRequestT unpack() {
    SettingsRequestT _o = new SettingsRequestT();
    unpackTo(_o);
    return _o;
  }
  public void unpackTo(SettingsRequestT _o) {
  }
  public static int pack(FlatBufferBuilder builder, SettingsRequestT _o) {
    if (_o == null) return 0;
    startSettingsRequest(builder);
    return endSettingsRequest(builder);
  }
}

