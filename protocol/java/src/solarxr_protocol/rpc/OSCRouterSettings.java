// automatically generated by the FlatBuffers compiler, do not modify

package solarxr_protocol.rpc;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

/**
 * OSC router forwards messages it receives, to allow the usage of multiple OSC programs for the same app.
 */
@SuppressWarnings("unused")
public final class OSCRouterSettings extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_22_10_26(); }
  public static OSCRouterSettings getRootAsOSCRouterSettings(ByteBuffer _bb) { return getRootAsOSCRouterSettings(_bb, new OSCRouterSettings()); }
  public static OSCRouterSettings getRootAsOSCRouterSettings(ByteBuffer _bb, OSCRouterSettings obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public OSCRouterSettings __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public solarxr_protocol.rpc.OSCSettings oscSettings() { return oscSettings(new solarxr_protocol.rpc.OSCSettings()); }
  public solarxr_protocol.rpc.OSCSettings oscSettings(solarxr_protocol.rpc.OSCSettings obj) { int o = __offset(4); return o != 0 ? obj.__assign(__indirect(o + bb_pos), bb) : null; }

  public static int createOSCRouterSettings(FlatBufferBuilder builder,
      int oscSettingsOffset) {
    builder.startTable(1);
    OSCRouterSettings.addOscSettings(builder, oscSettingsOffset);
    return OSCRouterSettings.endOSCRouterSettings(builder);
  }

  public static void startOSCRouterSettings(FlatBufferBuilder builder) { builder.startTable(1); }
  public static void addOscSettings(FlatBufferBuilder builder, int oscSettingsOffset) { builder.addOffset(0, oscSettingsOffset, 0); }
  public static int endOSCRouterSettings(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public OSCRouterSettings get(int j) { return get(new OSCRouterSettings(), j); }
    public OSCRouterSettings get(OSCRouterSettings obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
  public OSCRouterSettingsT unpack() {
    OSCRouterSettingsT _o = new OSCRouterSettingsT();
    unpackTo(_o);
    return _o;
  }
  public void unpackTo(OSCRouterSettingsT _o) {
    if (oscSettings() != null) _o.setOscSettings(oscSettings().unpack());
    else _o.setOscSettings(null);
  }
  public static int pack(FlatBufferBuilder builder, OSCRouterSettingsT _o) {
    if (_o == null) return 0;
    int _oscSettings = _o.getOscSettings() == null ? 0 : solarxr_protocol.rpc.OSCSettings.pack(builder, _o.getOscSettings());
    return createOSCRouterSettings(
      builder,
      _oscSettings);
  }
}

