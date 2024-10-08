// automatically generated by the FlatBuffers compiler, do not modify

import * as flatbuffers from 'flatbuffers';



export class StartWifiProvisioningRequest implements flatbuffers.IUnpackableObject<StartWifiProvisioningRequestT> {
  bb: flatbuffers.ByteBuffer|null = null;
  bb_pos = 0;
  __init(i:number, bb:flatbuffers.ByteBuffer):StartWifiProvisioningRequest {
  this.bb_pos = i;
  this.bb = bb;
  return this;
}

static getRootAsStartWifiProvisioningRequest(bb:flatbuffers.ByteBuffer, obj?:StartWifiProvisioningRequest):StartWifiProvisioningRequest {
  return (obj || new StartWifiProvisioningRequest()).__init(bb.readInt32(bb.position()) + bb.position(), bb);
}

static getSizePrefixedRootAsStartWifiProvisioningRequest(bb:flatbuffers.ByteBuffer, obj?:StartWifiProvisioningRequest):StartWifiProvisioningRequest {
  bb.setPosition(bb.position() + flatbuffers.SIZE_PREFIX_LENGTH);
  return (obj || new StartWifiProvisioningRequest()).__init(bb.readInt32(bb.position()) + bb.position(), bb);
}

ssid():string|null
ssid(optionalEncoding:flatbuffers.Encoding):string|Uint8Array|null
ssid(optionalEncoding?:any):string|Uint8Array|null {
  const offset = this.bb!.__offset(this.bb_pos, 4);
  return offset ? this.bb!.__string(this.bb_pos + offset, optionalEncoding) : null;
}

password():string|null
password(optionalEncoding:flatbuffers.Encoding):string|Uint8Array|null
password(optionalEncoding?:any):string|Uint8Array|null {
  const offset = this.bb!.__offset(this.bb_pos, 6);
  return offset ? this.bb!.__string(this.bb_pos + offset, optionalEncoding) : null;
}

port():string|null
port(optionalEncoding:flatbuffers.Encoding):string|Uint8Array|null
port(optionalEncoding?:any):string|Uint8Array|null {
  const offset = this.bb!.__offset(this.bb_pos, 8);
  return offset ? this.bb!.__string(this.bb_pos + offset, optionalEncoding) : null;
}

static startStartWifiProvisioningRequest(builder:flatbuffers.Builder) {
  builder.startObject(3);
}

static addSsid(builder:flatbuffers.Builder, ssidOffset:flatbuffers.Offset) {
  builder.addFieldOffset(0, ssidOffset, 0);
}

static addPassword(builder:flatbuffers.Builder, passwordOffset:flatbuffers.Offset) {
  builder.addFieldOffset(1, passwordOffset, 0);
}

static addPort(builder:flatbuffers.Builder, portOffset:flatbuffers.Offset) {
  builder.addFieldOffset(2, portOffset, 0);
}

static endStartWifiProvisioningRequest(builder:flatbuffers.Builder):flatbuffers.Offset {
  const offset = builder.endObject();
  return offset;
}

static createStartWifiProvisioningRequest(builder:flatbuffers.Builder, ssidOffset:flatbuffers.Offset, passwordOffset:flatbuffers.Offset, portOffset:flatbuffers.Offset):flatbuffers.Offset {
  StartWifiProvisioningRequest.startStartWifiProvisioningRequest(builder);
  StartWifiProvisioningRequest.addSsid(builder, ssidOffset);
  StartWifiProvisioningRequest.addPassword(builder, passwordOffset);
  StartWifiProvisioningRequest.addPort(builder, portOffset);
  return StartWifiProvisioningRequest.endStartWifiProvisioningRequest(builder);
}

unpack(): StartWifiProvisioningRequestT {
  return new StartWifiProvisioningRequestT(
    this.ssid(),
    this.password(),
    this.port()
  );
}


unpackTo(_o: StartWifiProvisioningRequestT): void {
  _o.ssid = this.ssid();
  _o.password = this.password();
  _o.port = this.port();
}
}

export class StartWifiProvisioningRequestT implements flatbuffers.IGeneratedObject {
constructor(
  public ssid: string|Uint8Array|null = null,
  public password: string|Uint8Array|null = null,
  public port: string|Uint8Array|null = null
){}


pack(builder:flatbuffers.Builder): flatbuffers.Offset {
  const ssid = (this.ssid !== null ? builder.createString(this.ssid!) : 0);
  const password = (this.password !== null ? builder.createString(this.password!) : 0);
  const port = (this.port !== null ? builder.createString(this.port!) : 0);

  return StartWifiProvisioningRequest.createStartWifiProvisioningRequest(builder,
    ssid,
    password,
    port
  );
}
}
