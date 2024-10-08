// automatically generated by the FlatBuffers compiler, do not modify

package solarxr_protocol.rpc

import java.nio.*
import kotlin.math.sign
import com.google.flatbuffers.*

/**
 * The current state of the overlay's display mode.
 */
@Suppress("unused")
class OverlayDisplayModeResponse : Table() {

    fun __init(_i: Int, _bb: ByteBuffer)  {
        __reset(_i, _bb)
    }
    fun __assign(_i: Int, _bb: ByteBuffer) : OverlayDisplayModeResponse {
        __init(_i, _bb)
        return this
    }
    val isVisible : Boolean
        get() {
            val o = __offset(4)
            return if(o != 0) 0.toByte() != bb.get(o + bb_pos) else false
        }
    val isMirrored : Boolean
        get() {
            val o = __offset(6)
            return if(o != 0) 0.toByte() != bb.get(o + bb_pos) else false
        }
    companion object {
        @JvmStatic
        fun validateVersion() = Constants.FLATBUFFERS_22_10_26()
        @JvmStatic
        fun getRootAsOverlayDisplayModeResponse(_bb: ByteBuffer): OverlayDisplayModeResponse = getRootAsOverlayDisplayModeResponse(_bb, OverlayDisplayModeResponse())
        @JvmStatic
        fun getRootAsOverlayDisplayModeResponse(_bb: ByteBuffer, obj: OverlayDisplayModeResponse): OverlayDisplayModeResponse {
            _bb.order(ByteOrder.LITTLE_ENDIAN)
            return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb))
        }
        @JvmStatic
        fun createOverlayDisplayModeResponse(builder: FlatBufferBuilder, isVisible: Boolean, isMirrored: Boolean) : Int {
            builder.startTable(2)
            addIsMirrored(builder, isMirrored)
            addIsVisible(builder, isVisible)
            return endOverlayDisplayModeResponse(builder)
        }
        @JvmStatic
        fun startOverlayDisplayModeResponse(builder: FlatBufferBuilder) = builder.startTable(2)
        @JvmStatic
        fun addIsVisible(builder: FlatBufferBuilder, isVisible: Boolean) = builder.addBoolean(0, isVisible, false)
        @JvmStatic
        fun addIsMirrored(builder: FlatBufferBuilder, isMirrored: Boolean) = builder.addBoolean(1, isMirrored, false)
        @JvmStatic
        fun endOverlayDisplayModeResponse(builder: FlatBufferBuilder) : Int {
            val o = builder.endTable()
            return o
        }
    }
}
