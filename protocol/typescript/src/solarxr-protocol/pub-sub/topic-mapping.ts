// automatically generated by the FlatBuffers compiler, do not modify

import * as flatbuffers from 'flatbuffers';

import { TopicHandle, TopicHandleT } from '../../solarxr-protocol/pub-sub/topic-handle.js';
import { TopicId, TopicIdT } from '../../solarxr-protocol/pub-sub/topic-id.js';


/**
 * Response for `TopicHandleRequest` or `SubscriptionRequest`.
 */
export class TopicMapping implements flatbuffers.IUnpackableObject<TopicMappingT> {
  bb: flatbuffers.ByteBuffer|null = null;
  bb_pos = 0;
  __init(i:number, bb:flatbuffers.ByteBuffer):TopicMapping {
  this.bb_pos = i;
  this.bb = bb;
  return this;
}

static getRootAsTopicMapping(bb:flatbuffers.ByteBuffer, obj?:TopicMapping):TopicMapping {
  return (obj || new TopicMapping()).__init(bb.readInt32(bb.position()) + bb.position(), bb);
}

static getSizePrefixedRootAsTopicMapping(bb:flatbuffers.ByteBuffer, obj?:TopicMapping):TopicMapping {
  bb.setPosition(bb.position() + flatbuffers.SIZE_PREFIX_LENGTH);
  return (obj || new TopicMapping()).__init(bb.readInt32(bb.position()) + bb.position(), bb);
}

id(obj?:TopicId):TopicId|null {
  const offset = this.bb!.__offset(this.bb_pos, 4);
  return offset ? (obj || new TopicId()).__init(this.bb!.__indirect(this.bb_pos + offset), this.bb!) : null;
}

handle(obj?:TopicHandle):TopicHandle|null {
  const offset = this.bb!.__offset(this.bb_pos, 6);
  return offset ? (obj || new TopicHandle()).__init(this.bb!.__indirect(this.bb_pos + offset), this.bb!) : null;
}

static startTopicMapping(builder:flatbuffers.Builder) {
  builder.startObject(2);
}

static addId(builder:flatbuffers.Builder, idOffset:flatbuffers.Offset) {
  builder.addFieldOffset(0, idOffset, 0);
}

static addHandle(builder:flatbuffers.Builder, handleOffset:flatbuffers.Offset) {
  builder.addFieldOffset(1, handleOffset, 0);
}

static endTopicMapping(builder:flatbuffers.Builder):flatbuffers.Offset {
  const offset = builder.endObject();
  return offset;
}


unpack(): TopicMappingT {
  return new TopicMappingT(
    (this.id() !== null ? this.id()!.unpack() : null),
    (this.handle() !== null ? this.handle()!.unpack() : null)
  );
}


unpackTo(_o: TopicMappingT): void {
  _o.id = (this.id() !== null ? this.id()!.unpack() : null);
  _o.handle = (this.handle() !== null ? this.handle()!.unpack() : null);
}
}

export class TopicMappingT implements flatbuffers.IGeneratedObject {
constructor(
  public id: TopicIdT|null = null,
  public handle: TopicHandleT|null = null
){}


pack(builder:flatbuffers.Builder): flatbuffers.Offset {
  const id = (this.id !== null ? this.id!.pack(builder) : 0);
  const handle = (this.handle !== null ? this.handle!.pack(builder) : 0);

  TopicMapping.startTopicMapping(builder);
  TopicMapping.addId(builder, id);
  TopicMapping.addHandle(builder, handle);

  return TopicMapping.endTopicMapping(builder);
}
}
