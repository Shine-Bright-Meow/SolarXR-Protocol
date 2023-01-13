// automatically generated by the FlatBuffers compiler, do not modify

package solarxr_protocol.pub_sub;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

/**
 * A `TopicId` identifies an application-specific category of data. Because it
 * is application-specific, it is up to the application within the specified
 * organization to define its semantics/meaning.
 *
 * For example, "bob" may have an "overlay" app with a "settings" topic for controlling
 * the overlay visibility and other settings, as well as a "video feed" topic for
 * allowing other applications to display video data in a wrist mounted window in VR.
 */
@javax.annotation.Generated(value="flatc")
@SuppressWarnings("unused")
public final class TopicId extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_22_10_26(); }
  public static TopicId getRootAsTopicId(ByteBuffer _bb) { return getRootAsTopicId(_bb, new TopicId()); }
  public static TopicId getRootAsTopicId(ByteBuffer _bb, TopicId obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public TopicId __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  /**
   * The organization/developer that defines the meaning of this feature. Avoids name
   * clashes. Should be something unique - same idea as java package identifier.
   */
  public String organization() { int o = __offset(4); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer organizationAsByteBuffer() { return __vector_as_bytebuffer(4, 1); }
  public ByteBuffer organizationInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 4, 1); }
  /**
   * The name of the application/device. Should be unique within the organization.
   */
  public String appName() { int o = __offset(6); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer appNameAsByteBuffer() { return __vector_as_bytebuffer(6, 1); }
  public ByteBuffer appNameInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 6, 1); }
  /**
   * The name of the topic. Should be unique within the application.
   */
  public String topic() { int o = __offset(8); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer topicAsByteBuffer() { return __vector_as_bytebuffer(8, 1); }
  public ByteBuffer topicInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 8, 1); }

  public static int createTopicId(FlatBufferBuilder builder,
      int organizationOffset,
      int appNameOffset,
      int topicOffset) {
    builder.startTable(3);
    TopicId.addTopic(builder, topicOffset);
    TopicId.addAppName(builder, appNameOffset);
    TopicId.addOrganization(builder, organizationOffset);
    return TopicId.endTopicId(builder);
  }

  public static void startTopicId(FlatBufferBuilder builder) { builder.startTable(3); }
  public static void addOrganization(FlatBufferBuilder builder, int organizationOffset) { builder.addOffset(0, organizationOffset, 0); }
  public static void addAppName(FlatBufferBuilder builder, int appNameOffset) { builder.addOffset(1, appNameOffset, 0); }
  public static void addTopic(FlatBufferBuilder builder, int topicOffset) { builder.addOffset(2, topicOffset, 0); }
  public static int endTopicId(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public TopicId get(int j) { return get(new TopicId(), j); }
    public TopicId get(TopicId obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
  public TopicIdT unpack() {
    TopicIdT _o = new TopicIdT();
    unpackTo(_o);
    return _o;
  }
  public void unpackTo(TopicIdT _o) {
    String _oOrganization = organization();
    _o.setOrganization(_oOrganization);
    String _oAppName = appName();
    _o.setAppName(_oAppName);
    String _oTopic = topic();
    _o.setTopic(_oTopic);
  }
  public static int pack(FlatBufferBuilder builder, TopicIdT _o) {
    if (_o == null) return 0;
    int _organization = _o.getOrganization() == null ? 0 : builder.createString(_o.getOrganization());
    int _appName = _o.getAppName() == null ? 0 : builder.createString(_o.getAppName());
    int _topic = _o.getTopic() == null ? 0 : builder.createString(_o.getTopic());
    return createTopicId(
      builder,
      _organization,
      _appName,
      _topic);
  }
}

