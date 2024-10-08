// automatically generated by the FlatBuffers compiler, do not modify

package solarxr_protocol.rpc

import java.nio.*
import kotlin.math.sign
import com.google.flatbuffers.*

@Suppress("unused")
class AutoBoneProcessRequest : Table() {

    fun __init(_i: Int, _bb: ByteBuffer)  {
        __reset(_i, _bb)
    }
    fun __assign(_i: Int, _bb: ByteBuffer) : AutoBoneProcessRequest {
        __init(_i, _bb)
        return this
    }
    val processType : UByte
        get() {
            val o = __offset(4)
            return if(o != 0) bb.get(o + bb_pos).toUByte() else 0u
        }
    companion object {
        @JvmStatic
        fun validateVersion() = Constants.FLATBUFFERS_22_10_26()
        @JvmStatic
        fun getRootAsAutoBoneProcessRequest(_bb: ByteBuffer): AutoBoneProcessRequest = getRootAsAutoBoneProcessRequest(_bb, AutoBoneProcessRequest())
        @JvmStatic
        fun getRootAsAutoBoneProcessRequest(_bb: ByteBuffer, obj: AutoBoneProcessRequest): AutoBoneProcessRequest {
            _bb.order(ByteOrder.LITTLE_ENDIAN)
            return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb))
        }
        @JvmStatic
        fun createAutoBoneProcessRequest(builder: FlatBufferBuilder, processType: UByte) : Int {
            builder.startTable(1)
            addProcessType(builder, processType)
            return endAutoBoneProcessRequest(builder)
        }
        @JvmStatic
        fun startAutoBoneProcessRequest(builder: FlatBufferBuilder) = builder.startTable(1)
        @JvmStatic
        fun addProcessType(builder: FlatBufferBuilder, processType: UByte) = builder.addByte(0, processType.toByte(), 0)
        @JvmStatic
        fun endAutoBoneProcessRequest(builder: FlatBufferBuilder) : Int {
            val o = builder.endTable()
            return o
        }
    }
}
