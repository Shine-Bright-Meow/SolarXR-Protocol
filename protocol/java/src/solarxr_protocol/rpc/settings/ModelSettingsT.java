// automatically generated by the FlatBuffers compiler, do not modify

package solarxr_protocol.rpc.settings;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

public class ModelSettingsT {
  private solarxr_protocol.rpc.settings.ModelTogglesT toggles;
  private solarxr_protocol.rpc.settings.ModelRatiosT ratios;
  private solarxr_protocol.rpc.settings.LegTweaksSettingsT legTweaks;

  public solarxr_protocol.rpc.settings.ModelTogglesT getToggles() { return toggles; }

  public void setToggles(solarxr_protocol.rpc.settings.ModelTogglesT toggles) { this.toggles = toggles; }

  public solarxr_protocol.rpc.settings.ModelRatiosT getRatios() { return ratios; }

  public void setRatios(solarxr_protocol.rpc.settings.ModelRatiosT ratios) { this.ratios = ratios; }

  public solarxr_protocol.rpc.settings.LegTweaksSettingsT getLegTweaks() { return legTweaks; }

  public void setLegTweaks(solarxr_protocol.rpc.settings.LegTweaksSettingsT legTweaks) { this.legTweaks = legTweaks; }


  public ModelSettingsT() {
    this.toggles = null;
    this.ratios = null;
    this.legTweaks = null;
  }
}

