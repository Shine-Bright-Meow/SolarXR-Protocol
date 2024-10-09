// automatically generated by the FlatBuffers compiler, do not modify

package solarxr_protocol.rpc

import java.nio.*
import kotlin.math.sign
import com.google.flatbuffers.*

@Suppress("unused")
class AssignTrackerRequest : Table() {

    fun __init(_i: Int, _bb: ByteBuffer)  {
        __reset(_i, _bb)
    }
    fun __assign(_i: Int, _bb: ByteBuffer) : AssignTrackerRequest {
        __init(_i, _bb)
        return this
    }
    val trackerId : solarxr_protocol.datatypes.TrackerId? get() = trackerId(solarxr_protocol.datatypes.TrackerId())
    fun trackerId(obj: solarxr_protocol.datatypes.TrackerId) : solarxr_protocol.datatypes.TrackerId? {
        val o = __offset(4)
        return if (o != 0) {
            obj.__assign(__indirect(o + bb_pos), bb)
        } else {
            null
        }
    }
    val bodyPosition : UByte
        get() {
            val o = __offset(6)
            return if(o != 0) bb.get(o + bb_pos).toUByte() else 0u
        }
    val mountingOrientation : solarxr_protocol.datatypes.math.Quat? get() = mountingOrientation(solarxr_protocol.datatypes.math.Quat())
    fun mountingOrientation(obj: solarxr_protocol.datatypes.math.Quat) : solarxr_protocol.datatypes.math.Quat? {
        val o = __offset(8)
        return if (o != 0) {
            obj.__assign(o + bb_pos, bb)
        } else {
            null
        }
    }
    val displayName : String?
        get() {
            val o = __offset(10)
            return if (o != 0) __string(o + bb_pos) else null
        }
    val displayNameAsByteBuffer : ByteBuffer get() = __vector_as_bytebuffer(10, 1)
    fun displayNameInByteBuffer(_bb: ByteBuffer) : ByteBuffer = __vector_in_bytebuffer(_bb, 10, 1)
    val allowDriftCompensation : Boolean
        get() {
            val o = __offset(12)
            return if(o != 0) 0.toByte() != bb.get(o + bb_pos) else false
        }
    companion object {
        @JvmStatic
        fun validateVersion() = Constants.FLATBUFFERS_22_10_26()
        @JvmStatic
        fun getRootAsAssignTrackerRequest(_bb: ByteBuffer): AssignTrackerRequest = getRootAsAssignTrackerRequest(_bb, AssignTrackerRequest())
        @JvmStatic
        fun getRootAsAssignTrackerRequest(_bb: ByteBuffer, obj: AssignTrackerRequest): AssignTrackerRequest {
            _bb.order(ByteOrder.LITTLE_ENDIAN)
            return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb))
        }
        @JvmStatic
        fun startAssignTrackerRequest(builder: FlatBufferBuilder) = builder.startTable(5)
        @JvmStatic
        fun addTrackerId(builder: FlatBufferBuilder, trackerId: Int) = builder.addOffset(0, trackerId, 0)
        @JvmStatic
        fun addBodyPosition(builder: FlatBufferBuilder, bodyPosition: UByte) = builder.addByte(1, bodyPosition.toByte(), 0)
        @JvmStatic
        fun addMountingOrientation(builder: FlatBufferBuilder, mountingOrientation: Int) = builder.addStruct(2, mountingOrientation, 0)
        @JvmStatic
        fun addDisplayName(builder: FlatBufferBuilder, displayName: Int) = builder.addOffset(3, displayName, 0)
        @JvmStatic
        fun addAllowDriftCompensation(builder: FlatBufferBuilder, allowDriftCompensation: Boolean) = builder.addBoolean(4, allowDriftCompensation, false)
        @JvmStatic
        fun endAssignTrackerRequest(builder: FlatBufferBuilder) : Int {
            val o = builder.endTable()
            return o
        }
    }
}
