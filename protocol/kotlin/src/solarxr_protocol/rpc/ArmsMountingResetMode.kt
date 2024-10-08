// automatically generated by the FlatBuffers compiler, do not modify

package solarxr_protocol.rpc

@Suppress("unused")
class ArmsMountingResetMode private constructor() {
    companion object {
        /**
         * Upper arm going back and forearm going forward
         */
        const val BACK: UByte = 0u
        /**
         * Arms going forward
         */
        const val FORWARD: UByte = 1u
        /**
         * Arms going up to the sides into a tpose
         */
        const val TPOSEUP: UByte = 2u
        /**
         * Arms going down to the sides from a tpose
         */
        const val TPOSEDOWN: UByte = 3u
        val names : Array<String> = arrayOf("BACK", "FORWARD", "TPOSE_UP", "TPOSE_DOWN")
        @JvmStatic
        fun name(e: Int) : String = names[e]
    }
}
