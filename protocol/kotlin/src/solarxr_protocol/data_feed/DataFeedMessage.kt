// automatically generated by the FlatBuffers compiler, do not modify

package solarxr_protocol.data_feed

@Suppress("unused")
class DataFeedMessage private constructor() {
    companion object {
        const val NONE: UByte = 0u
        const val PollDataFeed: UByte = 1u
        const val StartDataFeed: UByte = 2u
        const val DataFeedUpdate: UByte = 3u
        const val DataFeedConfig: UByte = 4u
        val names : Array<String> = arrayOf("NONE", "PollDataFeed", "StartDataFeed", "DataFeedUpdate", "DataFeedConfig")
        @JvmStatic
        fun name(e: Int) : String = names[e]
    }
}
