// automatically generated by the FlatBuffers compiler, do not modify

package solarxr_protocol.rpc;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

public class AssignTrackerRequestT {
  private solarxr_protocol.datatypes.TrackerIdT trackerId;
  private int bodyPosition;
  private solarxr_protocol.datatypes.math.QuatT mountingRotation;

  public solarxr_protocol.datatypes.TrackerIdT getTrackerId() { return trackerId; }

  public void setTrackerId(solarxr_protocol.datatypes.TrackerIdT trackerId) { this.trackerId = trackerId; }

  public int getBodyPosition() { return bodyPosition; }

  public void setBodyPosition(int bodyPosition) { this.bodyPosition = bodyPosition; }

  public solarxr_protocol.datatypes.math.QuatT getMountingRotation() { return mountingRotation; }

  public void setMountingRotation(solarxr_protocol.datatypes.math.QuatT mountingRotation) { this.mountingRotation = mountingRotation; }


  public AssignTrackerRequestT() {
    this.trackerId = null;
    this.bodyPosition = 0;
    this.mountingRotation = new solarxr_protocol.datatypes.math.QuatT();
  }
}
