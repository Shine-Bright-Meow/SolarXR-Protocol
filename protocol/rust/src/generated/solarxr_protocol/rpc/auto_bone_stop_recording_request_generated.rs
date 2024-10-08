// automatically generated by the FlatBuffers compiler, do not modify
// @generated
extern crate alloc;
extern crate flatbuffers;
use alloc::boxed::Box;
use alloc::string::{String, ToString};
use alloc::vec::Vec;
use core::mem;
use core::cmp::Ordering;
use self::flatbuffers::{EndianScalar, Follow};
use super::*;
pub enum AutoBoneStopRecordingRequestOffset {}
#[derive(Copy, Clone, PartialEq)]

/// Stops the current recording, using it as far as it has been recorded
pub struct AutoBoneStopRecordingRequest<'a> {
  pub _tab: flatbuffers::Table<'a>,
}

impl<'a> flatbuffers::Follow<'a> for AutoBoneStopRecordingRequest<'a> {
  type Inner = AutoBoneStopRecordingRequest<'a>;
  #[inline]
  unsafe fn follow(buf: &'a [u8], loc: usize) -> Self::Inner {
    Self { _tab: flatbuffers::Table::new(buf, loc) }
  }
}

impl<'a> AutoBoneStopRecordingRequest<'a> {

  #[inline]
  pub unsafe fn init_from_table(table: flatbuffers::Table<'a>) -> Self {
    AutoBoneStopRecordingRequest { _tab: table }
  }
  #[allow(unused_mut)]
  pub fn create<'bldr: 'args, 'args: 'mut_bldr, 'mut_bldr>(
    _fbb: &'mut_bldr mut flatbuffers::FlatBufferBuilder<'bldr>,
    _args: &'args AutoBoneStopRecordingRequestArgs
  ) -> flatbuffers::WIPOffset<AutoBoneStopRecordingRequest<'bldr>> {
    let mut builder = AutoBoneStopRecordingRequestBuilder::new(_fbb);
    builder.finish()
  }

}

impl flatbuffers::Verifiable for AutoBoneStopRecordingRequest<'_> {
  #[inline]
  fn run_verifier(
    v: &mut flatbuffers::Verifier, pos: usize
  ) -> Result<(), flatbuffers::InvalidFlatbuffer> {
    use self::flatbuffers::Verifiable;
    v.visit_table(pos)?
     .finish();
    Ok(())
  }
}
pub struct AutoBoneStopRecordingRequestArgs {
}
impl<'a> Default for AutoBoneStopRecordingRequestArgs {
  #[inline]
  fn default() -> Self {
    AutoBoneStopRecordingRequestArgs {
    }
  }
}

pub struct AutoBoneStopRecordingRequestBuilder<'a: 'b, 'b> {
  fbb_: &'b mut flatbuffers::FlatBufferBuilder<'a>,
  start_: flatbuffers::WIPOffset<flatbuffers::TableUnfinishedWIPOffset>,
}
impl<'a: 'b, 'b> AutoBoneStopRecordingRequestBuilder<'a, 'b> {
  #[inline]
  pub fn new(_fbb: &'b mut flatbuffers::FlatBufferBuilder<'a>) -> AutoBoneStopRecordingRequestBuilder<'a, 'b> {
    let start = _fbb.start_table();
    AutoBoneStopRecordingRequestBuilder {
      fbb_: _fbb,
      start_: start,
    }
  }
  #[inline]
  pub fn finish(self) -> flatbuffers::WIPOffset<AutoBoneStopRecordingRequest<'a>> {
    let o = self.fbb_.end_table(self.start_);
    flatbuffers::WIPOffset::new(o.value())
  }
}

impl core::fmt::Debug for AutoBoneStopRecordingRequest<'_> {
  fn fmt(&self, f: &mut core::fmt::Formatter<'_>) -> core::fmt::Result {
    let mut ds = f.debug_struct("AutoBoneStopRecordingRequest");
      ds.finish()
  }
}
