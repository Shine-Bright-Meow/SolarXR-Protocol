// automatically generated by the FlatBuffers compiler, do not modify

package solarxr_protocol.rpc

import java.nio.*
import kotlin.math.sign
import com.google.flatbuffers.*

@Suppress("unused")
class TrackingPauseStateResponse : Table() {

    fun __init(_i: Int, _bb: ByteBuffer)  {
        __reset(_i, _bb)
    }
    fun __assign(_i: Int, _bb: ByteBuffer) : TrackingPauseStateResponse {
        __init(_i, _bb)
        return this
    }
    /**
     * Skeleton tracking is paused if true, skeleton tracking is unpaused if false.
     */
    val trackingPaused : Boolean
        get() {
            val o = __offset(4)
            return if(o != 0) 0.toByte() != bb.get(o + bb_pos) else false
        }
    companion object {
        @JvmStatic
        fun validateVersion() = Constants.FLATBUFFERS_22_10_26()
        @JvmStatic
        fun getRootAsTrackingPauseStateResponse(_bb: ByteBuffer): TrackingPauseStateResponse = getRootAsTrackingPauseStateResponse(_bb, TrackingPauseStateResponse())
        @JvmStatic
        fun getRootAsTrackingPauseStateResponse(_bb: ByteBuffer, obj: TrackingPauseStateResponse): TrackingPauseStateResponse {
            _bb.order(ByteOrder.LITTLE_ENDIAN)
            return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb))
        }
        @JvmStatic
        fun createTrackingPauseStateResponse(builder: FlatBufferBuilder, trackingPaused: Boolean) : Int {
            builder.startTable(1)
            addTrackingPaused(builder, trackingPaused)
            return endTrackingPauseStateResponse(builder)
        }
        @JvmStatic
        fun startTrackingPauseStateResponse(builder: FlatBufferBuilder) = builder.startTable(1)
        @JvmStatic
        fun addTrackingPaused(builder: FlatBufferBuilder, trackingPaused: Boolean) = builder.addBoolean(0, trackingPaused, false)
        @JvmStatic
        fun endTrackingPauseStateResponse(builder: FlatBufferBuilder) : Int {
            val o = builder.endTable()
            return o
        }
    }
}
