// automatically generated by the FlatBuffers compiler, do not modify

package solarxr_protocol.rpc

import java.nio.*
import kotlin.math.sign
import com.google.flatbuffers.*

/**
 * Reboots the tracker connected to the serial monitor
 */
@Suppress("unused")
class SerialTrackerRebootRequest : Table() {

    fun __init(_i: Int, _bb: ByteBuffer)  {
        __reset(_i, _bb)
    }
    fun __assign(_i: Int, _bb: ByteBuffer) : SerialTrackerRebootRequest {
        __init(_i, _bb)
        return this
    }
    companion object {
        @JvmStatic
        fun validateVersion() = Constants.FLATBUFFERS_22_10_26()
        @JvmStatic
        fun getRootAsSerialTrackerRebootRequest(_bb: ByteBuffer): SerialTrackerRebootRequest = getRootAsSerialTrackerRebootRequest(_bb, SerialTrackerRebootRequest())
        @JvmStatic
        fun getRootAsSerialTrackerRebootRequest(_bb: ByteBuffer, obj: SerialTrackerRebootRequest): SerialTrackerRebootRequest {
            _bb.order(ByteOrder.LITTLE_ENDIAN)
            return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb))
        }
        @JvmStatic
        fun startSerialTrackerRebootRequest(builder: FlatBufferBuilder) = builder.startTable(0)
        @JvmStatic
        fun endSerialTrackerRebootRequest(builder: FlatBufferBuilder) : Int {
            val o = builder.endTable()
            return o
        }
    }
}
