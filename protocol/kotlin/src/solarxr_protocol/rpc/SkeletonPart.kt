// automatically generated by the FlatBuffers compiler, do not modify

package solarxr_protocol.rpc

import java.nio.*
import kotlin.math.sign
import com.google.flatbuffers.*

@Suppress("unused")
class SkeletonPart : Table() {

    fun __init(_i: Int, _bb: ByteBuffer)  {
        __reset(_i, _bb)
    }
    fun __assign(_i: Int, _bb: ByteBuffer) : SkeletonPart {
        __init(_i, _bb)
        return this
    }
    val bone : UByte
        get() {
            val o = __offset(4)
            return if(o != 0) bb.get(o + bb_pos).toUByte() else 0u
        }
    val value : Float
        get() {
            val o = __offset(6)
            return if(o != 0) bb.getFloat(o + bb_pos) else 0.0f
        }
    companion object {
        @JvmStatic
        fun validateVersion() = Constants.FLATBUFFERS_22_10_26()
        @JvmStatic
        fun getRootAsSkeletonPart(_bb: ByteBuffer): SkeletonPart = getRootAsSkeletonPart(_bb, SkeletonPart())
        @JvmStatic
        fun getRootAsSkeletonPart(_bb: ByteBuffer, obj: SkeletonPart): SkeletonPart {
            _bb.order(ByteOrder.LITTLE_ENDIAN)
            return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb))
        }
        @JvmStatic
        fun createSkeletonPart(builder: FlatBufferBuilder, bone: UByte, value: Float) : Int {
            builder.startTable(2)
            addValue(builder, value)
            addBone(builder, bone)
            return endSkeletonPart(builder)
        }
        @JvmStatic
        fun startSkeletonPart(builder: FlatBufferBuilder) = builder.startTable(2)
        @JvmStatic
        fun addBone(builder: FlatBufferBuilder, bone: UByte) = builder.addByte(0, bone.toByte(), 0)
        @JvmStatic
        fun addValue(builder: FlatBufferBuilder, value: Float) = builder.addFloat(1, value, 0.0)
        @JvmStatic
        fun endSkeletonPart(builder: FlatBufferBuilder) : Int {
            val o = builder.endTable()
            return o
        }
    }
}
