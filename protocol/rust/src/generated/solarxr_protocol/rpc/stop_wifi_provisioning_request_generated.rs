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
pub enum StopWifiProvisioningRequestOffset {}
#[derive(Copy, Clone, PartialEq)]

pub struct StopWifiProvisioningRequest<'a> {
  pub _tab: flatbuffers::Table<'a>,
}

impl<'a> flatbuffers::Follow<'a> for StopWifiProvisioningRequest<'a> {
  type Inner = StopWifiProvisioningRequest<'a>;
  #[inline]
  unsafe fn follow(buf: &'a [u8], loc: usize) -> Self::Inner {
    Self { _tab: flatbuffers::Table::new(buf, loc) }
  }
}

impl<'a> StopWifiProvisioningRequest<'a> {

  #[inline]
  pub unsafe fn init_from_table(table: flatbuffers::Table<'a>) -> Self {
    StopWifiProvisioningRequest { _tab: table }
  }
  #[allow(unused_mut)]
  pub fn create<'bldr: 'args, 'args: 'mut_bldr, 'mut_bldr>(
    _fbb: &'mut_bldr mut flatbuffers::FlatBufferBuilder<'bldr>,
    _args: &'args StopWifiProvisioningRequestArgs
  ) -> flatbuffers::WIPOffset<StopWifiProvisioningRequest<'bldr>> {
    let mut builder = StopWifiProvisioningRequestBuilder::new(_fbb);
    builder.finish()
  }

}

impl flatbuffers::Verifiable for StopWifiProvisioningRequest<'_> {
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
pub struct StopWifiProvisioningRequestArgs {
}
impl<'a> Default for StopWifiProvisioningRequestArgs {
  #[inline]
  fn default() -> Self {
    StopWifiProvisioningRequestArgs {
    }
  }
}

pub struct StopWifiProvisioningRequestBuilder<'a: 'b, 'b> {
  fbb_: &'b mut flatbuffers::FlatBufferBuilder<'a>,
  start_: flatbuffers::WIPOffset<flatbuffers::TableUnfinishedWIPOffset>,
}
impl<'a: 'b, 'b> StopWifiProvisioningRequestBuilder<'a, 'b> {
  #[inline]
  pub fn new(_fbb: &'b mut flatbuffers::FlatBufferBuilder<'a>) -> StopWifiProvisioningRequestBuilder<'a, 'b> {
    let start = _fbb.start_table();
    StopWifiProvisioningRequestBuilder {
      fbb_: _fbb,
      start_: start,
    }
  }
  #[inline]
  pub fn finish(self) -> flatbuffers::WIPOffset<StopWifiProvisioningRequest<'a>> {
    let o = self.fbb_.end_table(self.start_);
    flatbuffers::WIPOffset::new(o.value())
  }
}

impl core::fmt::Debug for StopWifiProvisioningRequest<'_> {
  fn fmt(&self, f: &mut core::fmt::Formatter<'_>) -> core::fmt::Result {
    let mut ds = f.debug_struct("StopWifiProvisioningRequest");
      ds.finish()
  }
}
