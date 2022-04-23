// automatically generated by the FlatBuffers compiler, do not modify

package slimevr_protocol.data_feed.tracker;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

public class TrackerDataT {
  private slimevr_protocol.datatypes.TrackerIdT trackerId;
  private slimevr_protocol.data_feed.tracker.TrackerInfoT info;
  private int status;
  private slimevr_protocol.datatypes.math.QuatT rotation;
  private slimevr_protocol.datatypes.math.Vec3fT position;
  private slimevr_protocol.datatypes.math.Vec3fT rawRotVel;
  private slimevr_protocol.datatypes.math.Vec3fT rawTransAccel;
  private slimevr_protocol.datatypes.TemperatureT temp;

  public slimevr_protocol.datatypes.TrackerIdT getTrackerId() { return trackerId; }

  public void setTrackerId(slimevr_protocol.datatypes.TrackerIdT trackerId) { this.trackerId = trackerId; }

  public slimevr_protocol.data_feed.tracker.TrackerInfoT getInfo() { return info; }

  public void setInfo(slimevr_protocol.data_feed.tracker.TrackerInfoT info) { this.info = info; }

  public int getStatus() { return status; }

  public void setStatus(int status) { this.status = status; }

  public slimevr_protocol.datatypes.math.QuatT getRotation() { return rotation; }

  public void setRotation(slimevr_protocol.datatypes.math.QuatT rotation) { this.rotation = rotation; }

  public slimevr_protocol.datatypes.math.Vec3fT getPosition() { return position; }

  public void setPosition(slimevr_protocol.datatypes.math.Vec3fT position) { this.position = position; }

  public slimevr_protocol.datatypes.math.Vec3fT getRawRotVel() { return rawRotVel; }

  public void setRawRotVel(slimevr_protocol.datatypes.math.Vec3fT rawRotVel) { this.rawRotVel = rawRotVel; }

  public slimevr_protocol.datatypes.math.Vec3fT getRawTransAccel() { return rawTransAccel; }

  public void setRawTransAccel(slimevr_protocol.datatypes.math.Vec3fT rawTransAccel) { this.rawTransAccel = rawTransAccel; }

  public slimevr_protocol.datatypes.TemperatureT getTemp() { return temp; }

  public void setTemp(slimevr_protocol.datatypes.TemperatureT temp) { this.temp = temp; }


  public TrackerDataT() {
    this.trackerId = null;
    this.info = null;
    this.status = 0;
    this.rotation = new slimevr_protocol.datatypes.math.QuatT();
    this.position = new slimevr_protocol.datatypes.math.Vec3fT();
    this.rawRotVel = new slimevr_protocol.datatypes.math.Vec3fT();
    this.rawTransAccel = new slimevr_protocol.datatypes.math.Vec3fT();
    this.temp = new slimevr_protocol.datatypes.TemperatureT();
  }
}
