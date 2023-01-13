// automatically generated by the FlatBuffers compiler, do not modify

package solarxr_protocol.rpc;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@javax.annotation.Generated(value="flatc")
@SuppressWarnings("unused")
public final class RecordBVHRequest extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_22_10_26(); }
  public static RecordBVHRequest getRootAsRecordBVHRequest(ByteBuffer _bb) { return getRootAsRecordBVHRequest(_bb, new RecordBVHRequest()); }
  public static RecordBVHRequest getRootAsRecordBVHRequest(ByteBuffer _bb, RecordBVHRequest obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public RecordBVHRequest __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public boolean stop() { int o = __offset(4); return o != 0 ? 0!=bb.get(o + bb_pos) : false; }

  public static int createRecordBVHRequest(FlatBufferBuilder builder,
      boolean stop) {
    builder.startTable(1);
    RecordBVHRequest.addStop(builder, stop);
    return RecordBVHRequest.endRecordBVHRequest(builder);
  }

  public static void startRecordBVHRequest(FlatBufferBuilder builder) { builder.startTable(1); }
  public static void addStop(FlatBufferBuilder builder, boolean stop) { builder.addBoolean(0, stop, false); }
  public static int endRecordBVHRequest(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public RecordBVHRequest get(int j) { return get(new RecordBVHRequest(), j); }
    public RecordBVHRequest get(RecordBVHRequest obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
  public RecordBVHRequestT unpack() {
    RecordBVHRequestT _o = new RecordBVHRequestT();
    unpackTo(_o);
    return _o;
  }
  public void unpackTo(RecordBVHRequestT _o) {
    boolean _oStop = stop();
    _o.setStop(_oStop);
  }
  public static int pack(FlatBufferBuilder builder, RecordBVHRequestT _o) {
    if (_o == null) return 0;
    return createRecordBVHRequest(
      builder,
      _o.getStop());
  }
}

