// automatically generated by the FlatBuffers compiler, do not modify

package slimevr_protocol.server;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class HandshakeRequest extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_2_0_0(); }
  public static HandshakeRequest getRootAsHandshakeRequest(ByteBuffer _bb) { return getRootAsHandshakeRequest(_bb, new HandshakeRequest()); }
  public static HandshakeRequest getRootAsHandshakeRequest(ByteBuffer _bb, HandshakeRequest obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public HandshakeRequest __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public int applicationType() { int o = __offset(4); return o != 0 ? bb.get(o + bb_pos) & 0xFF : 0; }

  public static int createHandshakeRequest(FlatBufferBuilder builder,
      int applicationType) {
    builder.startTable(1);
    HandshakeRequest.addApplicationType(builder, applicationType);
    return HandshakeRequest.endHandshakeRequest(builder);
  }

  public static void startHandshakeRequest(FlatBufferBuilder builder) { builder.startTable(1); }
  public static void addApplicationType(FlatBufferBuilder builder, int applicationType) { builder.addByte(0, (byte) applicationType, (byte) 0); }
  public static int endHandshakeRequest(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public HandshakeRequest get(int j) { return get(new HandshakeRequest(), j); }
    public HandshakeRequest get(HandshakeRequest obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
}

