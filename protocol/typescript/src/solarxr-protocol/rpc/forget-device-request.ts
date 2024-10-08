// automatically generated by the FlatBuffers compiler, do not modify

import * as flatbuffers from 'flatbuffers';



export class ForgetDeviceRequest implements flatbuffers.IUnpackableObject<ForgetDeviceRequestT> {
  bb: flatbuffers.ByteBuffer|null = null;
  bb_pos = 0;
  __init(i:number, bb:flatbuffers.ByteBuffer):ForgetDeviceRequest {
  this.bb_pos = i;
  this.bb = bb;
  return this;
}

static getRootAsForgetDeviceRequest(bb:flatbuffers.ByteBuffer, obj?:ForgetDeviceRequest):ForgetDeviceRequest {
  return (obj || new ForgetDeviceRequest()).__init(bb.readInt32(bb.position()) + bb.position(), bb);
}

static getSizePrefixedRootAsForgetDeviceRequest(bb:flatbuffers.ByteBuffer, obj?:ForgetDeviceRequest):ForgetDeviceRequest {
  bb.setPosition(bb.position() + flatbuffers.SIZE_PREFIX_LENGTH);
  return (obj || new ForgetDeviceRequest()).__init(bb.readInt32(bb.position()) + bb.position(), bb);
}

macAddress():string|null
macAddress(optionalEncoding:flatbuffers.Encoding):string|Uint8Array|null
macAddress(optionalEncoding?:any):string|Uint8Array|null {
  const offset = this.bb!.__offset(this.bb_pos, 4);
  return offset ? this.bb!.__string(this.bb_pos + offset, optionalEncoding) : null;
}

static startForgetDeviceRequest(builder:flatbuffers.Builder) {
  builder.startObject(1);
}

static addMacAddress(builder:flatbuffers.Builder, macAddressOffset:flatbuffers.Offset) {
  builder.addFieldOffset(0, macAddressOffset, 0);
}

static endForgetDeviceRequest(builder:flatbuffers.Builder):flatbuffers.Offset {
  const offset = builder.endObject();
  return offset;
}

static createForgetDeviceRequest(builder:flatbuffers.Builder, macAddressOffset:flatbuffers.Offset):flatbuffers.Offset {
  ForgetDeviceRequest.startForgetDeviceRequest(builder);
  ForgetDeviceRequest.addMacAddress(builder, macAddressOffset);
  return ForgetDeviceRequest.endForgetDeviceRequest(builder);
}

unpack(): ForgetDeviceRequestT {
  return new ForgetDeviceRequestT(
    this.macAddress()
  );
}


unpackTo(_o: ForgetDeviceRequestT): void {
  _o.macAddress = this.macAddress();
}
}

export class ForgetDeviceRequestT implements flatbuffers.IGeneratedObject {
constructor(
  public macAddress: string|Uint8Array|null = null
){}


pack(builder:flatbuffers.Builder): flatbuffers.Offset {
  const macAddress = (this.macAddress !== null ? builder.createString(this.macAddress!) : 0);

  return ForgetDeviceRequest.createForgetDeviceRequest(builder,
    macAddress
  );
}
}
