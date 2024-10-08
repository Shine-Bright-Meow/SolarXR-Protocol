// automatically generated by the FlatBuffers compiler, do not modify

package solarxr_protocol.rpc

import java.nio.*
import kotlin.math.sign
import com.google.flatbuffers.*

@Suppress("unused")
class SerialDevicesResponse : Table() {

    fun __init(_i: Int, _bb: ByteBuffer)  {
        __reset(_i, _bb)
    }
    fun __assign(_i: Int, _bb: ByteBuffer) : SerialDevicesResponse {
        __init(_i, _bb)
        return this
    }
    fun devices(j: Int) : solarxr_protocol.rpc.SerialDevice? = devices(solarxr_protocol.rpc.SerialDevice(), j)
    fun devices(obj: solarxr_protocol.rpc.SerialDevice, j: Int) : solarxr_protocol.rpc.SerialDevice? {
        val o = __offset(4)
        return if (o != 0) {
            obj.__assign(__indirect(__vector(o) + j * 4), bb)
        } else {
            null
        }
    }
    val devicesLength : Int
        get() {
            val o = __offset(4); return if (o != 0) __vector_len(o) else 0
        }
    companion object {
        @JvmStatic
        fun validateVersion() = Constants.FLATBUFFERS_22_10_26()
        @JvmStatic
        fun getRootAsSerialDevicesResponse(_bb: ByteBuffer): SerialDevicesResponse = getRootAsSerialDevicesResponse(_bb, SerialDevicesResponse())
        @JvmStatic
        fun getRootAsSerialDevicesResponse(_bb: ByteBuffer, obj: SerialDevicesResponse): SerialDevicesResponse {
            _bb.order(ByteOrder.LITTLE_ENDIAN)
            return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb))
        }
        @JvmStatic
        fun createSerialDevicesResponse(builder: FlatBufferBuilder, devicesOffset: Int) : Int {
            builder.startTable(1)
            addDevices(builder, devicesOffset)
            return endSerialDevicesResponse(builder)
        }
        @JvmStatic
        fun startSerialDevicesResponse(builder: FlatBufferBuilder) = builder.startTable(1)
        @JvmStatic
        fun addDevices(builder: FlatBufferBuilder, devices: Int) = builder.addOffset(0, devices, 0)
        @JvmStatic
        fun createDevicesVector(builder: FlatBufferBuilder, data: IntArray) : Int {
            builder.startVector(4, data.size, 4)
            for (i in data.size - 1 downTo 0) {
                builder.addOffset(data[i])
            }
            return builder.endVector()
        }
        @JvmStatic
        fun startDevicesVector(builder: FlatBufferBuilder, numElems: Int) = builder.startVector(4, numElems, 4)
        @JvmStatic
        fun endSerialDevicesResponse(builder: FlatBufferBuilder) : Int {
            val o = builder.endTable()
            return o
        }
    }
}
