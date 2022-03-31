// automatically generated by the FlatBuffers compiler, do not modify

package slimevr_protocol.server;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class TrackersList extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_2_0_0(); }
  public static TrackersList getRootAsTrackersList(ByteBuffer _bb) { return getRootAsTrackersList(_bb, new TrackersList()); }
  public static TrackersList getRootAsTrackersList(ByteBuffer _bb, TrackersList obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public TrackersList __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public slimevr_protocol.server.DeviceStatus trackers(int j) { return trackers(new slimevr_protocol.server.DeviceStatus(), j); }
  public slimevr_protocol.server.DeviceStatus trackers(slimevr_protocol.server.DeviceStatus obj, int j) { int o = __offset(4); return o != 0 ? obj.__assign(__indirect(__vector(o) + j * 4), bb) : null; }
  public int trackersLength() { int o = __offset(4); return o != 0 ? __vector_len(o) : 0; }
  public slimevr_protocol.server.DeviceStatus.Vector trackersVector() { return trackersVector(new slimevr_protocol.server.DeviceStatus.Vector()); }
  public slimevr_protocol.server.DeviceStatus.Vector trackersVector(slimevr_protocol.server.DeviceStatus.Vector obj) { int o = __offset(4); return o != 0 ? obj.__assign(__vector(o), 4, bb) : null; }

  public static int createTrackersList(FlatBufferBuilder builder,
      int trackersOffset) {
    builder.startTable(1);
    TrackersList.addTrackers(builder, trackersOffset);
    return TrackersList.endTrackersList(builder);
  }

  public static void startTrackersList(FlatBufferBuilder builder) { builder.startTable(1); }
  public static void addTrackers(FlatBufferBuilder builder, int trackersOffset) { builder.addOffset(0, trackersOffset, 0); }
  public static int createTrackersVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startTrackersVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static int endTrackersList(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public TrackersList get(int j) { return get(new TrackersList(), j); }
    public TrackersList get(TrackersList obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
}

