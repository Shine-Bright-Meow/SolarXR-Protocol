// automatically generated by the FlatBuffers compiler, do not modify

package solarxr_protocol.data_feed.device_data

import java.nio.*
import kotlin.math.sign
import com.google.flatbuffers.*

/**
 * Describes all possible information about a hardware device. For example, a
 * vive tracker is a  single hardware device, and a slime tracker with two
 * extensions is a single hardware device but two trackers.
 */
@Suppress("unused")
class DeviceData : Table() {

    fun __init(_i: Int, _bb: ByteBuffer)  {
        __reset(_i, _bb)
    }
    fun __assign(_i: Int, _bb: ByteBuffer) : DeviceData {
        __init(_i, _bb)
        return this
    }
    val id : solarxr_protocol.datatypes.DeviceId? get() = id(solarxr_protocol.datatypes.DeviceId())
    fun id(obj: solarxr_protocol.datatypes.DeviceId) : solarxr_protocol.datatypes.DeviceId? {
        val o = __offset(4)
        return if (o != 0) {
            obj.__assign(o + bb_pos, bb)
        } else {
            null
        }
    }
    /**
     * The dynamically changeable name of the device. This might be set by the
     * user to help them remember which tracker is which.
     */
    val customName : String?
        get() {
            val o = __offset(6)
            return if (o != 0) __string(o + bb_pos) else null
        }
    val customNameAsByteBuffer : ByteBuffer get() = __vector_as_bytebuffer(6, 1)
    fun customNameInByteBuffer(_bb: ByteBuffer) : ByteBuffer = __vector_in_bytebuffer(_bb, 6, 1)
    /**
     * Mostly-static info about the device hardware
     */
    val hardwareInfo : solarxr_protocol.datatypes.hardware_info.HardwareInfo? get() = hardwareInfo(solarxr_protocol.datatypes.hardware_info.HardwareInfo())
    fun hardwareInfo(obj: solarxr_protocol.datatypes.hardware_info.HardwareInfo) : solarxr_protocol.datatypes.hardware_info.HardwareInfo? {
        val o = __offset(8)
        return if (o != 0) {
            obj.__assign(__indirect(o + bb_pos), bb)
        } else {
            null
        }
    }
    /**
     * General info about the status of the device
     */
    val hardwareStatus : solarxr_protocol.datatypes.hardware_info.HardwareStatus? get() = hardwareStatus(solarxr_protocol.datatypes.hardware_info.HardwareStatus())
    fun hardwareStatus(obj: solarxr_protocol.datatypes.hardware_info.HardwareStatus) : solarxr_protocol.datatypes.hardware_info.HardwareStatus? {
        val o = __offset(10)
        return if (o != 0) {
            obj.__assign(__indirect(o + bb_pos), bb)
        } else {
            null
        }
    }
    /**
     * Info about all trackers attached to this device
     */
    fun trackers(j: Int) : solarxr_protocol.data_feed.tracker.TrackerData? = trackers(solarxr_protocol.data_feed.tracker.TrackerData(), j)
    fun trackers(obj: solarxr_protocol.data_feed.tracker.TrackerData, j: Int) : solarxr_protocol.data_feed.tracker.TrackerData? {
        val o = __offset(12)
        return if (o != 0) {
            obj.__assign(__indirect(__vector(o) + j * 4), bb)
        } else {
            null
        }
    }
    val trackersLength : Int
        get() {
            val o = __offset(12); return if (o != 0) __vector_len(o) else 0
        }
    companion object {
        @JvmStatic
        fun validateVersion() = Constants.FLATBUFFERS_22_10_26()
        @JvmStatic
        fun getRootAsDeviceData(_bb: ByteBuffer): DeviceData = getRootAsDeviceData(_bb, DeviceData())
        @JvmStatic
        fun getRootAsDeviceData(_bb: ByteBuffer, obj: DeviceData): DeviceData {
            _bb.order(ByteOrder.LITTLE_ENDIAN)
            return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb))
        }
        @JvmStatic
        fun startDeviceData(builder: FlatBufferBuilder) = builder.startTable(5)
        @JvmStatic
        fun addId(builder: FlatBufferBuilder, id: Int) = builder.addStruct(0, id, 0)
        @JvmStatic
        fun addCustomName(builder: FlatBufferBuilder, customName: Int) = builder.addOffset(1, customName, 0)
        @JvmStatic
        fun addHardwareInfo(builder: FlatBufferBuilder, hardwareInfo: Int) = builder.addOffset(2, hardwareInfo, 0)
        @JvmStatic
        fun addHardwareStatus(builder: FlatBufferBuilder, hardwareStatus: Int) = builder.addOffset(3, hardwareStatus, 0)
        @JvmStatic
        fun addTrackers(builder: FlatBufferBuilder, trackers: Int) = builder.addOffset(4, trackers, 0)
        @JvmStatic
        fun createTrackersVector(builder: FlatBufferBuilder, data: IntArray) : Int {
            builder.startVector(4, data.size, 4)
            for (i in data.size - 1 downTo 0) {
                builder.addOffset(data[i])
            }
            return builder.endVector()
        }
        @JvmStatic
        fun startTrackersVector(builder: FlatBufferBuilder, numElems: Int) = builder.startVector(4, numElems, 4)
        @JvmStatic
        fun endDeviceData(builder: FlatBufferBuilder) : Int {
            val o = builder.endTable()
            return o
        }
    }
}
