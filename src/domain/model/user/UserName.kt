package jp.snicmakino.domain.model.user

data class UserName(private val value: String) {
    init {
        if (value.length < 3)
            throw IllegalArgumentException("ユーザ名は3文字以上です")
        if (value.length > 20)
            throw IllegalArgumentException("ユーザ名は20文字以下です")
    }
}
