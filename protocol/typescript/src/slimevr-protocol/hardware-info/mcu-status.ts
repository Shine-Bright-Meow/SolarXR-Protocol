// automatically generated by the FlatBuffers compiler, do not modify

import * as flatbuffers from 'flatbuffers';



export class McuStatus {
  bb: flatbuffers.ByteBuffer|null = null;
  bb_pos = 0;
__init(i:number, bb:flatbuffers.ByteBuffer):McuStatus {
  this.bb_pos = i;
  this.bb = bb;
  return this;
}

static getRootAsMcuStatus(bb:flatbuffers.ByteBuffer, obj?:McuStatus):McuStatus {
  return (obj || new McuStatus()).__init(bb.readInt32(bb.position()) + bb.position(), bb);
}

static getSizePrefixedRootAsMcuStatus(bb:flatbuffers.ByteBuffer, obj?:McuStatus):McuStatus {
  bb.setPosition(bb.position() + flatbuffers.SIZE_PREFIX_LENGTH);
  return (obj || new McuStatus()).__init(bb.readInt32(bb.position()) + bb.position(), bb);
}

temp():number {
  const offset = this.bb!.__offset(this.bb_pos, 4);
  return offset ? this.bb!.readFloat32(this.bb_pos + offset) : 0.0;
}

static startMcuStatus(builder:flatbuffers.Builder) {
  builder.startObject(1);
}

static addTemp(builder:flatbuffers.Builder, temp:number) {
  builder.addFieldFloat32(0, temp, 0.0);
}

static endMcuStatus(builder:flatbuffers.Builder):flatbuffers.Offset {
  const offset = builder.endObject();
  return offset;
}

static createMcuStatus(builder:flatbuffers.Builder, temp:number):flatbuffers.Offset {
  McuStatus.startMcuStatus(builder);
  McuStatus.addTemp(builder, temp);
  return McuStatus.endMcuStatus(builder);
}

unpack(): McuStatusT {
  return new McuStatusT(
    this.temp()
  );
}


unpackTo(_o: McuStatusT): void {
  _o.temp = this.temp();
}
}

export class McuStatusT {
constructor(
  public temp: number = 0.0
){}


pack(builder:flatbuffers.Builder): flatbuffers.Offset {
  return McuStatus.createMcuStatus(builder,
    this.temp
  );
}
}
