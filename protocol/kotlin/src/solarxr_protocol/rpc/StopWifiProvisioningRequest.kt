// automatically generated by the FlatBuffers compiler, do not modify

package solarxr_protocol.rpc

import java.nio.*
import kotlin.math.sign
import com.google.flatbuffers.*

@Suppress("unused")
class StopWifiProvisioningRequest : Table() {

    fun __init(_i: Int, _bb: ByteBuffer)  {
        __reset(_i, _bb)
    }
    fun __assign(_i: Int, _bb: ByteBuffer) : StopWifiProvisioningRequest {
        __init(_i, _bb)
        return this
    }
    companion object {
        @JvmStatic
        fun validateVersion() = Constants.FLATBUFFERS_22_10_26()
        @JvmStatic
        fun getRootAsStopWifiProvisioningRequest(_bb: ByteBuffer): StopWifiProvisioningRequest = getRootAsStopWifiProvisioningRequest(_bb, StopWifiProvisioningRequest())
        @JvmStatic
        fun getRootAsStopWifiProvisioningRequest(_bb: ByteBuffer, obj: StopWifiProvisioningRequest): StopWifiProvisioningRequest {
            _bb.order(ByteOrder.LITTLE_ENDIAN)
            return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb))
        }
        @JvmStatic
        fun startStopWifiProvisioningRequest(builder: FlatBufferBuilder) = builder.startTable(0)
        @JvmStatic
        fun endStopWifiProvisioningRequest(builder: FlatBufferBuilder) : Int {
            val o = builder.endTable()
            return o
        }
    }
}
