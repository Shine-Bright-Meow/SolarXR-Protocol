// automatically generated by the FlatBuffers compiler, do not modify

import * as flatbuffers from 'flatbuffers';

import { MacAddress, MacAddressT } from '../../slimevr-protocol/datatypes/mac-address';
import { ImuId } from '../../slimevr-protocol/hardware-info/imu-id';
import { McuId } from '../../slimevr-protocol/hardware-info/mcu-id';


export class DeviceInfo {
  bb: flatbuffers.ByteBuffer|null = null;
  bb_pos = 0;
__init(i:number, bb:flatbuffers.ByteBuffer):DeviceInfo {
  this.bb_pos = i;
  this.bb = bb;
  return this;
}

static getRootAsDeviceInfo(bb:flatbuffers.ByteBuffer, obj?:DeviceInfo):DeviceInfo {
  return (obj || new DeviceInfo()).__init(bb.readInt32(bb.position()) + bb.position(), bb);
}

static getSizePrefixedRootAsDeviceInfo(bb:flatbuffers.ByteBuffer, obj?:DeviceInfo):DeviceInfo {
  bb.setPosition(bb.position() + flatbuffers.SIZE_PREFIX_LENGTH);
  return (obj || new DeviceInfo()).__init(bb.readInt32(bb.position()) + bb.position(), bb);
}

mcuId():McuId {
  const offset = this.bb!.__offset(this.bb_pos, 4);
  return offset ? this.bb!.readUint16(this.bb_pos + offset) : McuId.Other;
}

imuIds(index: number):ImuId|null {
  const offset = this.bb!.__offset(this.bb_pos, 6);
  return offset ? this.bb!.readUint16(this.bb!.__vector(this.bb_pos + offset) + index * 2) : 0;
}

imuIdsLength():number {
  const offset = this.bb!.__offset(this.bb_pos, 6);
  return offset ? this.bb!.__vector_len(this.bb_pos + offset) : 0;
}

imuIdsArray():Uint16Array|null {
  const offset = this.bb!.__offset(this.bb_pos, 6);
  return offset ? new Uint16Array(this.bb!.bytes().buffer, this.bb!.bytes().byteOffset + this.bb!.__vector(this.bb_pos + offset), this.bb!.__vector_len(this.bb_pos + offset)) : null;
}

displayName():string|null
displayName(optionalEncoding:flatbuffers.Encoding):string|Uint8Array|null
displayName(optionalEncoding?:any):string|Uint8Array|null {
  const offset = this.bb!.__offset(this.bb_pos, 8);
  return offset ? this.bb!.__string(this.bb_pos + offset, optionalEncoding) : null;
}

model():string|null
model(optionalEncoding:flatbuffers.Encoding):string|Uint8Array|null
model(optionalEncoding?:any):string|Uint8Array|null {
  const offset = this.bb!.__offset(this.bb_pos, 10);
  return offset ? this.bb!.__string(this.bb_pos + offset, optionalEncoding) : null;
}

manufacturer():string|null
manufacturer(optionalEncoding:flatbuffers.Encoding):string|Uint8Array|null
manufacturer(optionalEncoding?:any):string|Uint8Array|null {
  const offset = this.bb!.__offset(this.bb_pos, 12);
  return offset ? this.bb!.__string(this.bb_pos + offset, optionalEncoding) : null;
}

firmwareVersion():string|null
firmwareVersion(optionalEncoding:flatbuffers.Encoding):string|Uint8Array|null
firmwareVersion(optionalEncoding?:any):string|Uint8Array|null {
  const offset = this.bb!.__offset(this.bb_pos, 14);
  return offset ? this.bb!.__string(this.bb_pos + offset, optionalEncoding) : null;
}

macAddress(obj?:MacAddress):MacAddress|null {
  const offset = this.bb!.__offset(this.bb_pos, 16);
  return offset ? (obj || new MacAddress()).__init(this.bb_pos + offset, this.bb!) : null;
}

static startDeviceInfo(builder:flatbuffers.Builder) {
  builder.startObject(7);
}

static addMcuId(builder:flatbuffers.Builder, mcuId:McuId) {
  builder.addFieldInt16(0, mcuId, McuId.Other);
}

static addImuIds(builder:flatbuffers.Builder, imuIdsOffset:flatbuffers.Offset) {
  builder.addFieldOffset(1, imuIdsOffset, 0);
}

static createImuIdsVector(builder:flatbuffers.Builder, data:ImuId[]):flatbuffers.Offset {
  builder.startVector(2, data.length, 2);
  for (let i = data.length - 1; i >= 0; i--) {
    builder.addInt16(data[i]!);
  }
  return builder.endVector();
}

static startImuIdsVector(builder:flatbuffers.Builder, numElems:number) {
  builder.startVector(2, numElems, 2);
}

static addDisplayName(builder:flatbuffers.Builder, displayNameOffset:flatbuffers.Offset) {
  builder.addFieldOffset(2, displayNameOffset, 0);
}

static addModel(builder:flatbuffers.Builder, modelOffset:flatbuffers.Offset) {
  builder.addFieldOffset(3, modelOffset, 0);
}

static addManufacturer(builder:flatbuffers.Builder, manufacturerOffset:flatbuffers.Offset) {
  builder.addFieldOffset(4, manufacturerOffset, 0);
}

static addFirmwareVersion(builder:flatbuffers.Builder, firmwareVersionOffset:flatbuffers.Offset) {
  builder.addFieldOffset(5, firmwareVersionOffset, 0);
}

static addMacAddress(builder:flatbuffers.Builder, macAddressOffset:flatbuffers.Offset) {
  builder.addFieldStruct(6, macAddressOffset, 0);
}

static endDeviceInfo(builder:flatbuffers.Builder):flatbuffers.Offset {
  const offset = builder.endObject();
  return offset;
}


unpack(): DeviceInfoT {
  return new DeviceInfoT(
    this.mcuId(),
    this.bb!.createScalarList(this.imuIds.bind(this), this.imuIdsLength()),
    this.displayName(),
    this.model(),
    this.manufacturer(),
    this.firmwareVersion(),
    (this.macAddress() !== null ? this.macAddress()!.unpack() : null)
  );
}


unpackTo(_o: DeviceInfoT): void {
  _o.mcuId = this.mcuId();
  _o.imuIds = this.bb!.createScalarList(this.imuIds.bind(this), this.imuIdsLength());
  _o.displayName = this.displayName();
  _o.model = this.model();
  _o.manufacturer = this.manufacturer();
  _o.firmwareVersion = this.firmwareVersion();
  _o.macAddress = (this.macAddress() !== null ? this.macAddress()!.unpack() : null);
}
}

export class DeviceInfoT {
constructor(
  public mcuId: McuId = McuId.Other,
  public imuIds: (ImuId)[] = [],
  public displayName: string|Uint8Array|null = null,
  public model: string|Uint8Array|null = null,
  public manufacturer: string|Uint8Array|null = null,
  public firmwareVersion: string|Uint8Array|null = null,
  public macAddress: MacAddressT|null = null
){}


pack(builder:flatbuffers.Builder): flatbuffers.Offset {
  const imuIds = DeviceInfo.createImuIdsVector(builder, this.imuIds);
  const displayName = (this.displayName !== null ? builder.createString(this.displayName!) : 0);
  const model = (this.model !== null ? builder.createString(this.model!) : 0);
  const manufacturer = (this.manufacturer !== null ? builder.createString(this.manufacturer!) : 0);
  const firmwareVersion = (this.firmwareVersion !== null ? builder.createString(this.firmwareVersion!) : 0);

  DeviceInfo.startDeviceInfo(builder);
  DeviceInfo.addMcuId(builder, this.mcuId);
  DeviceInfo.addImuIds(builder, imuIds);
  DeviceInfo.addDisplayName(builder, displayName);
  DeviceInfo.addModel(builder, model);
  DeviceInfo.addManufacturer(builder, manufacturer);
  DeviceInfo.addFirmwareVersion(builder, firmwareVersion);
  DeviceInfo.addMacAddress(builder, (this.macAddress !== null ? this.macAddress!.pack(builder) : 0));

  return DeviceInfo.endDeviceInfo(builder);
}
}
