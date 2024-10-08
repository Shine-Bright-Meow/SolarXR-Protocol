// automatically generated by the FlatBuffers compiler, do not modify

package solarxr_protocol.rpc

import java.nio.*
import kotlin.math.sign
import com.google.flatbuffers.*

@Suppress("unused")
class NewSerialDeviceResponse : Table() {

    fun __init(_i: Int, _bb: ByteBuffer)  {
        __reset(_i, _bb)
    }
    fun __assign(_i: Int, _bb: ByteBuffer) : NewSerialDeviceResponse {
        __init(_i, _bb)
        return this
    }
    val device : solarxr_protocol.rpc.SerialDevice? get() = device(solarxr_protocol.rpc.SerialDevice())
    fun device(obj: solarxr_protocol.rpc.SerialDevice) : solarxr_protocol.rpc.SerialDevice? {
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
        fun getRootAsNewSerialDeviceResponse(_bb: ByteBuffer): NewSerialDeviceResponse = getRootAsNewSerialDeviceResponse(_bb, NewSerialDeviceResponse())
        @JvmStatic
        fun getRootAsNewSerialDeviceResponse(_bb: ByteBuffer, obj: NewSerialDeviceResponse): NewSerialDeviceResponse {
            _bb.order(ByteOrder.LITTLE_ENDIAN)
            return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb))
        }
        @JvmStatic
        fun createNewSerialDeviceResponse(builder: FlatBufferBuilder, deviceOffset: Int) : Int {
            builder.startTable(1)
            addDevice(builder, deviceOffset)
            return endNewSerialDeviceResponse(builder)
        }
        @JvmStatic
        fun startNewSerialDeviceResponse(builder: FlatBufferBuilder) = builder.startTable(1)
        @JvmStatic
        fun addDevice(builder: FlatBufferBuilder, device: Int) = builder.addOffset(0, device, 0)
        @JvmStatic
        fun endNewSerialDeviceResponse(builder: FlatBufferBuilder) : Int {
            val o = builder.endTable()
            return o
        }
    }
}
