// automatically generated by the FlatBuffers compiler, do not modify

package solarxr_protocol.rpc

import java.nio.*
import kotlin.math.sign
import com.google.flatbuffers.*

/**
 * When a new status appears, it's sent alone
 */
@Suppress("unused")
class StatusSystemUpdate : Table() {

    fun __init(_i: Int, _bb: ByteBuffer)  {
        __reset(_i, _bb)
    }
    fun __assign(_i: Int, _bb: ByteBuffer) : StatusSystemUpdate {
        __init(_i, _bb)
        return this
    }
    val newStatus : solarxr_protocol.rpc.StatusMessage? get() = newStatus(solarxr_protocol.rpc.StatusMessage())
    fun newStatus(obj: solarxr_protocol.rpc.StatusMessage) : solarxr_protocol.rpc.StatusMessage? {
        val o = __offset(4)
        return if (o != 0) {
            obj.__assign(__indirect(o + bb_pos), bb)
        } else {
            null
        }
    }
    companion object {
        @JvmStatic
        fun validateVersion() = Constants.FLATBUFFERS_22_10_26()
        @JvmStatic
        fun getRootAsStatusSystemUpdate(_bb: ByteBuffer): StatusSystemUpdate = getRootAsStatusSystemUpdate(_bb, StatusSystemUpdate())
        @JvmStatic
        fun getRootAsStatusSystemUpdate(_bb: ByteBuffer, obj: StatusSystemUpdate): StatusSystemUpdate {
            _bb.order(ByteOrder.LITTLE_ENDIAN)
            return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb))
        }
        @JvmStatic
        fun createStatusSystemUpdate(builder: FlatBufferBuilder, newStatusOffset: Int) : Int {
            builder.startTable(1)
            addNewStatus(builder, newStatusOffset)
            return endStatusSystemUpdate(builder)
        }
        @JvmStatic
        fun startStatusSystemUpdate(builder: FlatBufferBuilder) = builder.startTable(1)
        @JvmStatic
        fun addNewStatus(builder: FlatBufferBuilder, newStatus: Int) = builder.addOffset(0, newStatus, 0)
        @JvmStatic
        fun endStatusSystemUpdate(builder: FlatBufferBuilder) : Int {
            val o = builder.endTable()
            return o
        }
    }
}
