// automatically generated by the FlatBuffers compiler, do not modify

package solarxr_protocol.rpc;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

/**
 * Response containing all current valid statuses
 */
@SuppressWarnings("unused")
public final class StatusSystemResponse extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_22_10_26(); }
  public static StatusSystemResponse getRootAsStatusSystemResponse(ByteBuffer _bb) { return getRootAsStatusSystemResponse(_bb, new StatusSystemResponse()); }
  public static StatusSystemResponse getRootAsStatusSystemResponse(ByteBuffer _bb, StatusSystemResponse obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public StatusSystemResponse __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public solarxr_protocol.rpc.StatusMessage currentStatuses(int j) { return currentStatuses(new solarxr_protocol.rpc.StatusMessage(), j); }
  public solarxr_protocol.rpc.StatusMessage currentStatuses(solarxr_protocol.rpc.StatusMessage obj, int j) { int o = __offset(4); return o != 0 ? obj.__assign(__indirect(__vector(o) + j * 4), bb) : null; }
  public int currentStatusesLength() { int o = __offset(4); return o != 0 ? __vector_len(o) : 0; }
  public solarxr_protocol.rpc.StatusMessage.Vector currentStatusesVector() { return currentStatusesVector(new solarxr_protocol.rpc.StatusMessage.Vector()); }
  public solarxr_protocol.rpc.StatusMessage.Vector currentStatusesVector(solarxr_protocol.rpc.StatusMessage.Vector obj) { int o = __offset(4); return o != 0 ? obj.__assign(__vector(o), 4, bb) : null; }

  public static int createStatusSystemResponse(FlatBufferBuilder builder,
      int currentStatusesOffset) {
    builder.startTable(1);
    StatusSystemResponse.addCurrentStatuses(builder, currentStatusesOffset);
    return StatusSystemResponse.endStatusSystemResponse(builder);
  }

  public static void startStatusSystemResponse(FlatBufferBuilder builder) { builder.startTable(1); }
  public static void addCurrentStatuses(FlatBufferBuilder builder, int currentStatusesOffset) { builder.addOffset(0, currentStatusesOffset, 0); }
  public static int createCurrentStatusesVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startCurrentStatusesVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static int endStatusSystemResponse(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public StatusSystemResponse get(int j) { return get(new StatusSystemResponse(), j); }
    public StatusSystemResponse get(StatusSystemResponse obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
  public StatusSystemResponseT unpack() {
    StatusSystemResponseT _o = new StatusSystemResponseT();
    unpackTo(_o);
    return _o;
  }
  public void unpackTo(StatusSystemResponseT _o) {
    solarxr_protocol.rpc.StatusMessageT[] _oCurrentStatuses = new solarxr_protocol.rpc.StatusMessageT[currentStatusesLength()];
    for (int _j = 0; _j < currentStatusesLength(); ++_j) {_oCurrentStatuses[_j] = (currentStatuses(_j) != null ? currentStatuses(_j).unpack() : null);}
    _o.setCurrentStatuses(_oCurrentStatuses);
  }
  public static int pack(FlatBufferBuilder builder, StatusSystemResponseT _o) {
    if (_o == null) return 0;
    int _currentStatuses = 0;
    if (_o.getCurrentStatuses() != null) {
      int[] __currentStatuses = new int[_o.getCurrentStatuses().length];
      int _j = 0;
      for (solarxr_protocol.rpc.StatusMessageT _e : _o.getCurrentStatuses()) { __currentStatuses[_j] = solarxr_protocol.rpc.StatusMessage.pack(builder, _e); _j++;}
      _currentStatuses = createCurrentStatusesVector(builder, __currentStatuses);
    }
    return createStatusSystemResponse(
      builder,
      _currentStatuses);
  }
}

