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
pub enum DeviceDataOffset {}
#[derive(Copy, Clone, PartialEq)]

/// Describes all possible information about a hardware device. For example, a
/// vive tracker is a  single hardware device, and a slime tracker with two
/// extensions is a single hardware device but two trackers.
pub struct DeviceData<'a> {
  pub _tab: flatbuffers::Table<'a>,
}

impl<'a> flatbuffers::Follow<'a> for DeviceData<'a> {
  type Inner = DeviceData<'a>;
  #[inline]
  unsafe fn follow(buf: &'a [u8], loc: usize) -> Self::Inner {
    Self { _tab: flatbuffers::Table::new(buf, loc) }
  }
}

impl<'a> DeviceData<'a> {
  pub const VT_ID: flatbuffers::VOffsetT = 4;
  pub const VT_CUSTOM_NAME: flatbuffers::VOffsetT = 6;
  pub const VT_HARDWARE_INFO: flatbuffers::VOffsetT = 8;
  pub const VT_HARDWARE_STATUS: flatbuffers::VOffsetT = 10;
  pub const VT_TRACKERS: flatbuffers::VOffsetT = 12;

  #[inline]
  pub unsafe fn init_from_table(table: flatbuffers::Table<'a>) -> Self {
    DeviceData { _tab: table }
  }
  #[allow(unused_mut)]
  pub fn create<'bldr: 'args, 'args: 'mut_bldr, 'mut_bldr>(
    _fbb: &'mut_bldr mut flatbuffers::FlatBufferBuilder<'bldr>,
    args: &'args DeviceDataArgs<'args>
  ) -> flatbuffers::WIPOffset<DeviceData<'bldr>> {
    let mut builder = DeviceDataBuilder::new(_fbb);
    if let Some(x) = args.trackers { builder.add_trackers(x); }
    if let Some(x) = args.hardware_status { builder.add_hardware_status(x); }
    if let Some(x) = args.hardware_info { builder.add_hardware_info(x); }
    if let Some(x) = args.custom_name { builder.add_custom_name(x); }
    if let Some(x) = args.id { builder.add_id(x); }
    builder.finish()
  }


  #[inline]
  pub fn id(&self) -> Option<&'a super::super::datatypes::DeviceId> {
    // Safety:
    // Created from valid Table for this object
    // which contains a valid value in this slot
    unsafe { self._tab.get::<super::super::datatypes::DeviceId>(DeviceData::VT_ID, None)}
  }
  /// The dynamically changeable name of the device. This might be set by the
  /// user to help them remember which tracker is which.
  #[inline]
  pub fn custom_name(&self) -> Option<&'a str> {
    // Safety:
    // Created from valid Table for this object
    // which contains a valid value in this slot
    unsafe { self._tab.get::<flatbuffers::ForwardsUOffset<&str>>(DeviceData::VT_CUSTOM_NAME, None)}
  }
  /// Mostly-static info about the device hardware
  #[inline]
  pub fn hardware_info(&self) -> Option<super::super::datatypes::hardware_info::HardwareInfo<'a>> {
    // Safety:
    // Created from valid Table for this object
    // which contains a valid value in this slot
    unsafe { self._tab.get::<flatbuffers::ForwardsUOffset<super::super::datatypes::hardware_info::HardwareInfo>>(DeviceData::VT_HARDWARE_INFO, None)}
  }
  /// General info about the status of the device
  #[inline]
  pub fn hardware_status(&self) -> Option<super::super::datatypes::hardware_info::HardwareStatus<'a>> {
    // Safety:
    // Created from valid Table for this object
    // which contains a valid value in this slot
    unsafe { self._tab.get::<flatbuffers::ForwardsUOffset<super::super::datatypes::hardware_info::HardwareStatus>>(DeviceData::VT_HARDWARE_STATUS, None)}
  }
  /// Info about all trackers attached to this device
  #[inline]
  pub fn trackers(&self) -> Option<flatbuffers::Vector<'a, flatbuffers::ForwardsUOffset<super::tracker::TrackerData<'a>>>> {
    // Safety:
    // Created from valid Table for this object
    // which contains a valid value in this slot
    unsafe { self._tab.get::<flatbuffers::ForwardsUOffset<flatbuffers::Vector<'a, flatbuffers::ForwardsUOffset<super::tracker::TrackerData>>>>(DeviceData::VT_TRACKERS, None)}
  }
}

impl flatbuffers::Verifiable for DeviceData<'_> {
  #[inline]
  fn run_verifier(
    v: &mut flatbuffers::Verifier, pos: usize
  ) -> Result<(), flatbuffers::InvalidFlatbuffer> {
    use self::flatbuffers::Verifiable;
    v.visit_table(pos)?
     .visit_field::<super::super::datatypes::DeviceId>("id", Self::VT_ID, false)?
     .visit_field::<flatbuffers::ForwardsUOffset<&str>>("custom_name", Self::VT_CUSTOM_NAME, false)?
     .visit_field::<flatbuffers::ForwardsUOffset<super::super::datatypes::hardware_info::HardwareInfo>>("hardware_info", Self::VT_HARDWARE_INFO, false)?
     .visit_field::<flatbuffers::ForwardsUOffset<super::super::datatypes::hardware_info::HardwareStatus>>("hardware_status", Self::VT_HARDWARE_STATUS, false)?
     .visit_field::<flatbuffers::ForwardsUOffset<flatbuffers::Vector<'_, flatbuffers::ForwardsUOffset<super::tracker::TrackerData>>>>("trackers", Self::VT_TRACKERS, false)?
     .finish();
    Ok(())
  }
}
pub struct DeviceDataArgs<'a> {
    pub id: Option<&'a super::super::datatypes::DeviceId>,
    pub custom_name: Option<flatbuffers::WIPOffset<&'a str>>,
    pub hardware_info: Option<flatbuffers::WIPOffset<super::super::datatypes::hardware_info::HardwareInfo<'a>>>,
    pub hardware_status: Option<flatbuffers::WIPOffset<super::super::datatypes::hardware_info::HardwareStatus<'a>>>,
    pub trackers: Option<flatbuffers::WIPOffset<flatbuffers::Vector<'a, flatbuffers::ForwardsUOffset<super::tracker::TrackerData<'a>>>>>,
}
impl<'a> Default for DeviceDataArgs<'a> {
  #[inline]
  fn default() -> Self {
    DeviceDataArgs {
      id: None,
      custom_name: None,
      hardware_info: None,
      hardware_status: None,
      trackers: None,
    }
  }
}

pub struct DeviceDataBuilder<'a: 'b, 'b> {
  fbb_: &'b mut flatbuffers::FlatBufferBuilder<'a>,
  start_: flatbuffers::WIPOffset<flatbuffers::TableUnfinishedWIPOffset>,
}
impl<'a: 'b, 'b> DeviceDataBuilder<'a, 'b> {
  #[inline]
  pub fn add_id(&mut self, id: &super::super::datatypes::DeviceId) {
    self.fbb_.push_slot_always::<&super::super::datatypes::DeviceId>(DeviceData::VT_ID, id);
  }
  #[inline]
  pub fn add_custom_name(&mut self, custom_name: flatbuffers::WIPOffset<&'b  str>) {
    self.fbb_.push_slot_always::<flatbuffers::WIPOffset<_>>(DeviceData::VT_CUSTOM_NAME, custom_name);
  }
  #[inline]
  pub fn add_hardware_info(&mut self, hardware_info: flatbuffers::WIPOffset<super::super::datatypes::hardware_info::HardwareInfo<'b >>) {
    self.fbb_.push_slot_always::<flatbuffers::WIPOffset<super::super::datatypes::hardware_info::HardwareInfo>>(DeviceData::VT_HARDWARE_INFO, hardware_info);
  }
  #[inline]
  pub fn add_hardware_status(&mut self, hardware_status: flatbuffers::WIPOffset<super::super::datatypes::hardware_info::HardwareStatus<'b >>) {
    self.fbb_.push_slot_always::<flatbuffers::WIPOffset<super::super::datatypes::hardware_info::HardwareStatus>>(DeviceData::VT_HARDWARE_STATUS, hardware_status);
  }
  #[inline]
  pub fn add_trackers(&mut self, trackers: flatbuffers::WIPOffset<flatbuffers::Vector<'b , flatbuffers::ForwardsUOffset<super::tracker::TrackerData<'b >>>>) {
    self.fbb_.push_slot_always::<flatbuffers::WIPOffset<_>>(DeviceData::VT_TRACKERS, trackers);
  }
  #[inline]
  pub fn new(_fbb: &'b mut flatbuffers::FlatBufferBuilder<'a>) -> DeviceDataBuilder<'a, 'b> {
    let start = _fbb.start_table();
    DeviceDataBuilder {
      fbb_: _fbb,
      start_: start,
    }
  }
  #[inline]
  pub fn finish(self) -> flatbuffers::WIPOffset<DeviceData<'a>> {
    let o = self.fbb_.end_table(self.start_);
    flatbuffers::WIPOffset::new(o.value())
  }
}

impl core::fmt::Debug for DeviceData<'_> {
  fn fmt(&self, f: &mut core::fmt::Formatter<'_>) -> core::fmt::Result {
    let mut ds = f.debug_struct("DeviceData");
      ds.field("id", &self.id());
      ds.field("custom_name", &self.custom_name());
      ds.field("hardware_info", &self.hardware_info());
      ds.field("hardware_status", &self.hardware_status());
      ds.field("trackers", &self.trackers());
      ds.finish()
  }
}
