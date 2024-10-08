// automatically generated by the FlatBuffers compiler, do not modify

import * as flatbuffers from 'flatbuffers';

import { ResetType } from '../../solarxr-protocol/rpc/reset-type.js';


export class ResetRequest implements flatbuffers.IUnpackableObject<ResetRequestT> {
  bb: flatbuffers.ByteBuffer|null = null;
  bb_pos = 0;
  __init(i:number, bb:flatbuffers.ByteBuffer):ResetRequest {
  this.bb_pos = i;
  this.bb = bb;
  return this;
}

static getRootAsResetRequest(bb:flatbuffers.ByteBuffer, obj?:ResetRequest):ResetRequest {
  return (obj || new ResetRequest()).__init(bb.readInt32(bb.position()) + bb.position(), bb);
}

static getSizePrefixedRootAsResetRequest(bb:flatbuffers.ByteBuffer, obj?:ResetRequest):ResetRequest {
  bb.setPosition(bb.position() + flatbuffers.SIZE_PREFIX_LENGTH);
  return (obj || new ResetRequest()).__init(bb.readInt32(bb.position()) + bb.position(), bb);
}

resetType():ResetType {
  const offset = this.bb!.__offset(this.bb_pos, 4);
  return offset ? this.bb!.readUint8(this.bb_pos + offset) : ResetType.Yaw;
}

static startResetRequest(builder:flatbuffers.Builder) {
  builder.startObject(1);
}

static addResetType(builder:flatbuffers.Builder, resetType:ResetType) {
  builder.addFieldInt8(0, resetType, ResetType.Yaw);
}

static endResetRequest(builder:flatbuffers.Builder):flatbuffers.Offset {
  const offset = builder.endObject();
  return offset;
}

static createResetRequest(builder:flatbuffers.Builder, resetType:ResetType):flatbuffers.Offset {
  ResetRequest.startResetRequest(builder);
  ResetRequest.addResetType(builder, resetType);
  return ResetRequest.endResetRequest(builder);
}

unpack(): ResetRequestT {
  return new ResetRequestT(
    this.resetType()
  );
}


unpackTo(_o: ResetRequestT): void {
  _o.resetType = this.resetType();
}
}

export class ResetRequestT implements flatbuffers.IGeneratedObject {
constructor(
  public resetType: ResetType = ResetType.Yaw
){}


pack(builder:flatbuffers.Builder): flatbuffers.Offset {
  return ResetRequest.createResetRequest(builder,
    this.resetType
  );
}
}
