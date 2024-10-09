// automatically generated by the FlatBuffers compiler, do not modify

import * as flatbuffers from 'flatbuffers';



export class TapDetectionSettings implements flatbuffers.IUnpackableObject<TapDetectionSettingsT> {
  bb: flatbuffers.ByteBuffer|null = null;
  bb_pos = 0;
  __init(i:number, bb:flatbuffers.ByteBuffer):TapDetectionSettings {
  this.bb_pos = i;
  this.bb = bb;
  return this;
}

static getRootAsTapDetectionSettings(bb:flatbuffers.ByteBuffer, obj?:TapDetectionSettings):TapDetectionSettings {
  return (obj || new TapDetectionSettings()).__init(bb.readInt32(bb.position()) + bb.position(), bb);
}

static getSizePrefixedRootAsTapDetectionSettings(bb:flatbuffers.ByteBuffer, obj?:TapDetectionSettings):TapDetectionSettings {
  bb.setPosition(bb.position() + flatbuffers.SIZE_PREFIX_LENGTH);
  return (obj || new TapDetectionSettings()).__init(bb.readInt32(bb.position()) + bb.position(), bb);
}

fullResetDelay():number|null {
  const offset = this.bb!.__offset(this.bb_pos, 4);
  return offset ? this.bb!.readFloat32(this.bb_pos + offset) : null;
}

fullResetEnabled():boolean|null {
  const offset = this.bb!.__offset(this.bb_pos, 6);
  return offset ? !!this.bb!.readInt8(this.bb_pos + offset) : null;
}

fullResetTaps():number|null {
  const offset = this.bb!.__offset(this.bb_pos, 8);
  return offset ? this.bb!.readUint8(this.bb_pos + offset) : null;
}

yawResetDelay():number|null {
  const offset = this.bb!.__offset(this.bb_pos, 10);
  return offset ? this.bb!.readFloat32(this.bb_pos + offset) : null;
}

yawResetEnabled():boolean|null {
  const offset = this.bb!.__offset(this.bb_pos, 12);
  return offset ? !!this.bb!.readInt8(this.bb_pos + offset) : null;
}

yawResetTaps():number|null {
  const offset = this.bb!.__offset(this.bb_pos, 14);
  return offset ? this.bb!.readUint8(this.bb_pos + offset) : null;
}

mountingResetDelay():number|null {
  const offset = this.bb!.__offset(this.bb_pos, 16);
  return offset ? this.bb!.readFloat32(this.bb_pos + offset) : null;
}

mountingResetEnabled():boolean|null {
  const offset = this.bb!.__offset(this.bb_pos, 18);
  return offset ? !!this.bb!.readInt8(this.bb_pos + offset) : null;
}

mountingResetTaps():number|null {
  const offset = this.bb!.__offset(this.bb_pos, 20);
  return offset ? this.bb!.readUint8(this.bb_pos + offset) : null;
}

/**
 * If true, disables reset behavior of tap detection and sends a
 * TapDetectionSetupNotification, each time 2 taps are detected on any tracker
 */
setupMode():boolean|null {
  const offset = this.bb!.__offset(this.bb_pos, 22);
  return offset ? !!this.bb!.readInt8(this.bb_pos + offset) : null;
}

numberTrackersOverThreshold():number|null {
  const offset = this.bb!.__offset(this.bb_pos, 24);
  return offset ? this.bb!.readUint8(this.bb_pos + offset) : null;
}

static startTapDetectionSettings(builder:flatbuffers.Builder) {
  builder.startObject(11);
}

static addFullResetDelay(builder:flatbuffers.Builder, fullResetDelay:number) {
  builder.addFieldFloat32(0, fullResetDelay, 0);
}

static addFullResetEnabled(builder:flatbuffers.Builder, fullResetEnabled:boolean) {
  builder.addFieldInt8(1, +fullResetEnabled, 0);
}

static addFullResetTaps(builder:flatbuffers.Builder, fullResetTaps:number) {
  builder.addFieldInt8(2, fullResetTaps, 0);
}

static addYawResetDelay(builder:flatbuffers.Builder, yawResetDelay:number) {
  builder.addFieldFloat32(3, yawResetDelay, 0);
}

static addYawResetEnabled(builder:flatbuffers.Builder, yawResetEnabled:boolean) {
  builder.addFieldInt8(4, +yawResetEnabled, 0);
}

static addYawResetTaps(builder:flatbuffers.Builder, yawResetTaps:number) {
  builder.addFieldInt8(5, yawResetTaps, 0);
}

static addMountingResetDelay(builder:flatbuffers.Builder, mountingResetDelay:number) {
  builder.addFieldFloat32(6, mountingResetDelay, 0);
}

static addMountingResetEnabled(builder:flatbuffers.Builder, mountingResetEnabled:boolean) {
  builder.addFieldInt8(7, +mountingResetEnabled, 0);
}

static addMountingResetTaps(builder:flatbuffers.Builder, mountingResetTaps:number) {
  builder.addFieldInt8(8, mountingResetTaps, 0);
}

static addSetupMode(builder:flatbuffers.Builder, setupMode:boolean) {
  builder.addFieldInt8(9, +setupMode, 0);
}

static addNumberTrackersOverThreshold(builder:flatbuffers.Builder, numberTrackersOverThreshold:number) {
  builder.addFieldInt8(10, numberTrackersOverThreshold, 0);
}

static endTapDetectionSettings(builder:flatbuffers.Builder):flatbuffers.Offset {
  const offset = builder.endObject();
  return offset;
}

static createTapDetectionSettings(builder:flatbuffers.Builder, fullResetDelay:number|null, fullResetEnabled:boolean|null, fullResetTaps:number|null, yawResetDelay:number|null, yawResetEnabled:boolean|null, yawResetTaps:number|null, mountingResetDelay:number|null, mountingResetEnabled:boolean|null, mountingResetTaps:number|null, setupMode:boolean|null, numberTrackersOverThreshold:number|null):flatbuffers.Offset {
  TapDetectionSettings.startTapDetectionSettings(builder);
  if (fullResetDelay !== null)
    TapDetectionSettings.addFullResetDelay(builder, fullResetDelay);
  if (fullResetEnabled !== null)
    TapDetectionSettings.addFullResetEnabled(builder, fullResetEnabled);
  if (fullResetTaps !== null)
    TapDetectionSettings.addFullResetTaps(builder, fullResetTaps);
  if (yawResetDelay !== null)
    TapDetectionSettings.addYawResetDelay(builder, yawResetDelay);
  if (yawResetEnabled !== null)
    TapDetectionSettings.addYawResetEnabled(builder, yawResetEnabled);
  if (yawResetTaps !== null)
    TapDetectionSettings.addYawResetTaps(builder, yawResetTaps);
  if (mountingResetDelay !== null)
    TapDetectionSettings.addMountingResetDelay(builder, mountingResetDelay);
  if (mountingResetEnabled !== null)
    TapDetectionSettings.addMountingResetEnabled(builder, mountingResetEnabled);
  if (mountingResetTaps !== null)
    TapDetectionSettings.addMountingResetTaps(builder, mountingResetTaps);
  if (setupMode !== null)
    TapDetectionSettings.addSetupMode(builder, setupMode);
  if (numberTrackersOverThreshold !== null)
    TapDetectionSettings.addNumberTrackersOverThreshold(builder, numberTrackersOverThreshold);
  return TapDetectionSettings.endTapDetectionSettings(builder);
}

unpack(): TapDetectionSettingsT {
  return new TapDetectionSettingsT(
    this.fullResetDelay(),
    this.fullResetEnabled(),
    this.fullResetTaps(),
    this.yawResetDelay(),
    this.yawResetEnabled(),
    this.yawResetTaps(),
    this.mountingResetDelay(),
    this.mountingResetEnabled(),
    this.mountingResetTaps(),
    this.setupMode(),
    this.numberTrackersOverThreshold()
  );
}


unpackTo(_o: TapDetectionSettingsT): void {
  _o.fullResetDelay = this.fullResetDelay();
  _o.fullResetEnabled = this.fullResetEnabled();
  _o.fullResetTaps = this.fullResetTaps();
  _o.yawResetDelay = this.yawResetDelay();
  _o.yawResetEnabled = this.yawResetEnabled();
  _o.yawResetTaps = this.yawResetTaps();
  _o.mountingResetDelay = this.mountingResetDelay();
  _o.mountingResetEnabled = this.mountingResetEnabled();
  _o.mountingResetTaps = this.mountingResetTaps();
  _o.setupMode = this.setupMode();
  _o.numberTrackersOverThreshold = this.numberTrackersOverThreshold();
}
}

export class TapDetectionSettingsT implements flatbuffers.IGeneratedObject {
constructor(
  public fullResetDelay: number|null = null,
  public fullResetEnabled: boolean|null = null,
  public fullResetTaps: number|null = null,
  public yawResetDelay: number|null = null,
  public yawResetEnabled: boolean|null = null,
  public yawResetTaps: number|null = null,
  public mountingResetDelay: number|null = null,
  public mountingResetEnabled: boolean|null = null,
  public mountingResetTaps: number|null = null,
  public setupMode: boolean|null = null,
  public numberTrackersOverThreshold: number|null = null
){}


pack(builder:flatbuffers.Builder): flatbuffers.Offset {
  return TapDetectionSettings.createTapDetectionSettings(builder,
    this.fullResetDelay,
    this.fullResetEnabled,
    this.fullResetTaps,
    this.yawResetDelay,
    this.yawResetEnabled,
    this.yawResetTaps,
    this.mountingResetDelay,
    this.mountingResetEnabled,
    this.mountingResetTaps,
    this.setupMode,
    this.numberTrackersOverThreshold
  );
}
}
