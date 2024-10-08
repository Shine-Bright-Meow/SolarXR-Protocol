// automatically generated by the FlatBuffers compiler, do not modify

import * as flatbuffers from 'flatbuffers';



/**
 * Makes a temporary change to legtweaks. This is not saved to disk, and can be
 * cleared with `LegTweaksTmpClear`
 */
export class LegTweaksTmpChange implements flatbuffers.IUnpackableObject<LegTweaksTmpChangeT> {
  bb: flatbuffers.ByteBuffer|null = null;
  bb_pos = 0;
  __init(i:number, bb:flatbuffers.ByteBuffer):LegTweaksTmpChange {
  this.bb_pos = i;
  this.bb = bb;
  return this;
}

static getRootAsLegTweaksTmpChange(bb:flatbuffers.ByteBuffer, obj?:LegTweaksTmpChange):LegTweaksTmpChange {
  return (obj || new LegTweaksTmpChange()).__init(bb.readInt32(bb.position()) + bb.position(), bb);
}

static getSizePrefixedRootAsLegTweaksTmpChange(bb:flatbuffers.ByteBuffer, obj?:LegTweaksTmpChange):LegTweaksTmpChange {
  bb.setPosition(bb.position() + flatbuffers.SIZE_PREFIX_LENGTH);
  return (obj || new LegTweaksTmpChange()).__init(bb.readInt32(bb.position()) + bb.position(), bb);
}

floorClip():boolean|null {
  const offset = this.bb!.__offset(this.bb_pos, 4);
  return offset ? !!this.bb!.readInt8(this.bb_pos + offset) : null;
}

skatingCorrection():boolean|null {
  const offset = this.bb!.__offset(this.bb_pos, 6);
  return offset ? !!this.bb!.readInt8(this.bb_pos + offset) : null;
}

toeSnap():boolean|null {
  const offset = this.bb!.__offset(this.bb_pos, 8);
  return offset ? !!this.bb!.readInt8(this.bb_pos + offset) : null;
}

footPlant():boolean|null {
  const offset = this.bb!.__offset(this.bb_pos, 10);
  return offset ? !!this.bb!.readInt8(this.bb_pos + offset) : null;
}

static startLegTweaksTmpChange(builder:flatbuffers.Builder) {
  builder.startObject(4);
}

static addFloorClip(builder:flatbuffers.Builder, floorClip:boolean) {
  builder.addFieldInt8(0, +floorClip, 0);
}

static addSkatingCorrection(builder:flatbuffers.Builder, skatingCorrection:boolean) {
  builder.addFieldInt8(1, +skatingCorrection, 0);
}

static addToeSnap(builder:flatbuffers.Builder, toeSnap:boolean) {
  builder.addFieldInt8(2, +toeSnap, 0);
}

static addFootPlant(builder:flatbuffers.Builder, footPlant:boolean) {
  builder.addFieldInt8(3, +footPlant, 0);
}

static endLegTweaksTmpChange(builder:flatbuffers.Builder):flatbuffers.Offset {
  const offset = builder.endObject();
  return offset;
}

static createLegTweaksTmpChange(builder:flatbuffers.Builder, floorClip:boolean|null, skatingCorrection:boolean|null, toeSnap:boolean|null, footPlant:boolean|null):flatbuffers.Offset {
  LegTweaksTmpChange.startLegTweaksTmpChange(builder);
  if (floorClip !== null)
    LegTweaksTmpChange.addFloorClip(builder, floorClip);
  if (skatingCorrection !== null)
    LegTweaksTmpChange.addSkatingCorrection(builder, skatingCorrection);
  if (toeSnap !== null)
    LegTweaksTmpChange.addToeSnap(builder, toeSnap);
  if (footPlant !== null)
    LegTweaksTmpChange.addFootPlant(builder, footPlant);
  return LegTweaksTmpChange.endLegTweaksTmpChange(builder);
}

unpack(): LegTweaksTmpChangeT {
  return new LegTweaksTmpChangeT(
    this.floorClip(),
    this.skatingCorrection(),
    this.toeSnap(),
    this.footPlant()
  );
}


unpackTo(_o: LegTweaksTmpChangeT): void {
  _o.floorClip = this.floorClip();
  _o.skatingCorrection = this.skatingCorrection();
  _o.toeSnap = this.toeSnap();
  _o.footPlant = this.footPlant();
}
}

export class LegTweaksTmpChangeT implements flatbuffers.IGeneratedObject {
constructor(
  public floorClip: boolean|null = null,
  public skatingCorrection: boolean|null = null,
  public toeSnap: boolean|null = null,
  public footPlant: boolean|null = null
){}


pack(builder:flatbuffers.Builder): flatbuffers.Offset {
  return LegTweaksTmpChange.createLegTweaksTmpChange(builder,
    this.floorClip,
    this.skatingCorrection,
    this.toeSnap,
    this.footPlant
  );
}
}
