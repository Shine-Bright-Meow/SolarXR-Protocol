// automatically generated by the FlatBuffers compiler, do not modify

import * as flatbuffers from 'flatbuffers';

import { DataFeedMessageHeader, DataFeedMessageHeaderT } from '../solarxr-protocol/data-feed/data-feed-message-header.js';
import { PubSubHeader, PubSubHeaderT } from '../solarxr-protocol/pub-sub/pub-sub-header.js';
import { RpcMessageHeader, RpcMessageHeaderT } from '../solarxr-protocol/rpc/rpc-message-header.js';


/**
 * MessageBundle contains all of the messages for the data feed system and the
 * rpc system that will be sent in one buffer.
 */
export class MessageBundle implements flatbuffers.IUnpackableObject<MessageBundleT> {
  bb: flatbuffers.ByteBuffer|null = null;
  bb_pos = 0;
  __init(i:number, bb:flatbuffers.ByteBuffer):MessageBundle {
  this.bb_pos = i;
  this.bb = bb;
  return this;
}

static getRootAsMessageBundle(bb:flatbuffers.ByteBuffer, obj?:MessageBundle):MessageBundle {
  return (obj || new MessageBundle()).__init(bb.readInt32(bb.position()) + bb.position(), bb);
}

static getSizePrefixedRootAsMessageBundle(bb:flatbuffers.ByteBuffer, obj?:MessageBundle):MessageBundle {
  bb.setPosition(bb.position() + flatbuffers.SIZE_PREFIX_LENGTH);
  return (obj || new MessageBundle()).__init(bb.readInt32(bb.position()) + bb.position(), bb);
}

dataFeedMsgs(index: number, obj?:DataFeedMessageHeader):DataFeedMessageHeader|null {
  const offset = this.bb!.__offset(this.bb_pos, 4);
  return offset ? (obj || new DataFeedMessageHeader()).__init(this.bb!.__indirect(this.bb!.__vector(this.bb_pos + offset) + index * 4), this.bb!) : null;
}

dataFeedMsgsLength():number {
  const offset = this.bb!.__offset(this.bb_pos, 4);
  return offset ? this.bb!.__vector_len(this.bb_pos + offset) : 0;
}

rpcMsgs(index: number, obj?:RpcMessageHeader):RpcMessageHeader|null {
  const offset = this.bb!.__offset(this.bb_pos, 6);
  return offset ? (obj || new RpcMessageHeader()).__init(this.bb!.__indirect(this.bb!.__vector(this.bb_pos + offset) + index * 4), this.bb!) : null;
}

rpcMsgsLength():number {
  const offset = this.bb!.__offset(this.bb_pos, 6);
  return offset ? this.bb!.__vector_len(this.bb_pos + offset) : 0;
}

pubSubMsgs(index: number, obj?:PubSubHeader):PubSubHeader|null {
  const offset = this.bb!.__offset(this.bb_pos, 8);
  return offset ? (obj || new PubSubHeader()).__init(this.bb!.__indirect(this.bb!.__vector(this.bb_pos + offset) + index * 4), this.bb!) : null;
}

pubSubMsgsLength():number {
  const offset = this.bb!.__offset(this.bb_pos, 8);
  return offset ? this.bb!.__vector_len(this.bb_pos + offset) : 0;
}

static startMessageBundle(builder:flatbuffers.Builder) {
  builder.startObject(3);
}

static addDataFeedMsgs(builder:flatbuffers.Builder, dataFeedMsgsOffset:flatbuffers.Offset) {
  builder.addFieldOffset(0, dataFeedMsgsOffset, 0);
}

static createDataFeedMsgsVector(builder:flatbuffers.Builder, data:flatbuffers.Offset[]):flatbuffers.Offset {
  builder.startVector(4, data.length, 4);
  for (let i = data.length - 1; i >= 0; i--) {
    builder.addOffset(data[i]!);
  }
  return builder.endVector();
}

static startDataFeedMsgsVector(builder:flatbuffers.Builder, numElems:number) {
  builder.startVector(4, numElems, 4);
}

static addRpcMsgs(builder:flatbuffers.Builder, rpcMsgsOffset:flatbuffers.Offset) {
  builder.addFieldOffset(1, rpcMsgsOffset, 0);
}

static createRpcMsgsVector(builder:flatbuffers.Builder, data:flatbuffers.Offset[]):flatbuffers.Offset {
  builder.startVector(4, data.length, 4);
  for (let i = data.length - 1; i >= 0; i--) {
    builder.addOffset(data[i]!);
  }
  return builder.endVector();
}

static startRpcMsgsVector(builder:flatbuffers.Builder, numElems:number) {
  builder.startVector(4, numElems, 4);
}

static addPubSubMsgs(builder:flatbuffers.Builder, pubSubMsgsOffset:flatbuffers.Offset) {
  builder.addFieldOffset(2, pubSubMsgsOffset, 0);
}

static createPubSubMsgsVector(builder:flatbuffers.Builder, data:flatbuffers.Offset[]):flatbuffers.Offset {
  builder.startVector(4, data.length, 4);
  for (let i = data.length - 1; i >= 0; i--) {
    builder.addOffset(data[i]!);
  }
  return builder.endVector();
}

static startPubSubMsgsVector(builder:flatbuffers.Builder, numElems:number) {
  builder.startVector(4, numElems, 4);
}

static endMessageBundle(builder:flatbuffers.Builder):flatbuffers.Offset {
  const offset = builder.endObject();
  return offset;
}

static createMessageBundle(builder:flatbuffers.Builder, dataFeedMsgsOffset:flatbuffers.Offset, rpcMsgsOffset:flatbuffers.Offset, pubSubMsgsOffset:flatbuffers.Offset):flatbuffers.Offset {
  MessageBundle.startMessageBundle(builder);
  MessageBundle.addDataFeedMsgs(builder, dataFeedMsgsOffset);
  MessageBundle.addRpcMsgs(builder, rpcMsgsOffset);
  MessageBundle.addPubSubMsgs(builder, pubSubMsgsOffset);
  return MessageBundle.endMessageBundle(builder);
}

unpack(): MessageBundleT {
  return new MessageBundleT(
    this.bb!.createObjList<DataFeedMessageHeader, DataFeedMessageHeaderT>(this.dataFeedMsgs.bind(this), this.dataFeedMsgsLength()),
    this.bb!.createObjList<RpcMessageHeader, RpcMessageHeaderT>(this.rpcMsgs.bind(this), this.rpcMsgsLength()),
    this.bb!.createObjList<PubSubHeader, PubSubHeaderT>(this.pubSubMsgs.bind(this), this.pubSubMsgsLength())
  );
}


unpackTo(_o: MessageBundleT): void {
  _o.dataFeedMsgs = this.bb!.createObjList<DataFeedMessageHeader, DataFeedMessageHeaderT>(this.dataFeedMsgs.bind(this), this.dataFeedMsgsLength());
  _o.rpcMsgs = this.bb!.createObjList<RpcMessageHeader, RpcMessageHeaderT>(this.rpcMsgs.bind(this), this.rpcMsgsLength());
  _o.pubSubMsgs = this.bb!.createObjList<PubSubHeader, PubSubHeaderT>(this.pubSubMsgs.bind(this), this.pubSubMsgsLength());
}
}

export class MessageBundleT implements flatbuffers.IGeneratedObject {
constructor(
  public dataFeedMsgs: (DataFeedMessageHeaderT)[] = [],
  public rpcMsgs: (RpcMessageHeaderT)[] = [],
  public pubSubMsgs: (PubSubHeaderT)[] = []
){}


pack(builder:flatbuffers.Builder): flatbuffers.Offset {
  const dataFeedMsgs = MessageBundle.createDataFeedMsgsVector(builder, builder.createObjectOffsetList(this.dataFeedMsgs));
  const rpcMsgs = MessageBundle.createRpcMsgsVector(builder, builder.createObjectOffsetList(this.rpcMsgs));
  const pubSubMsgs = MessageBundle.createPubSubMsgsVector(builder, builder.createObjectOffsetList(this.pubSubMsgs));

  return MessageBundle.createMessageBundle(builder,
    dataFeedMsgs,
    rpcMsgs,
    pubSubMsgs
  );
}
}
