// automatically generated by the FlatBuffers compiler, do not modify

package solarxr_protocol.datatypes

import java.nio.*
import kotlin.math.sign
import com.google.flatbuffers.*

/**
 * A unique ID for the device. IDs are not guaranteed to be the same after
 * the connection is terminated.
 */
@Suppress("unused")
class DeviceId : Struct() {

    fun __init(_i: Int, _bb: ByteBuffer)  {
        __reset(_i, _bb)
    }
    fun __assign(_i: Int, _bb: ByteBuffer) : DeviceId {
        __init(_i, _bb)
        return this
    }
    val id : UByte get() = bb.get(bb_pos + 0).toUByte()
    companion object {
        @JvmStatic
        fun createDeviceId(builder: FlatBufferBuilder, id: UByte) : Int {
            builder.prep(1, 1)
            builder.putByte(id.toByte())
            return builder.offset()
        }
    }
}
