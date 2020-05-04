package jp.snicmakino.domain.model

class CircleName(private val value: String) {
    init {
        if (value.length < 3)
            throw IllegalArgumentException("サークル名は3文字以上です")
        if (value.length > 20)
            throw IllegalArgumentException("サークル名は20文字以下です")
    }

    fun equals(other: CircleName?): Boolean {
        if (other == null) return false
        if (this === other) return true
        return value == other.value
    }

    override fun equals(other: Any?): Boolean {
        if (other == null) return false
        if (this === other) return true
        if (other !is CircleName) return false
        return equals(other)
    }
}