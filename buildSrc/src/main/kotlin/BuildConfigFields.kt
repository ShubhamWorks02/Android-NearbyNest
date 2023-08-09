object BuildConfigFields {
    // AppCenter
    val APPCENTER_SECRET = Field(
        Type.STRING,
        "APPCENTER_SECRET",
        "\"APPCENTER_KEY\""
    )

    val IMAGE_API_KEY = Field(
        Type.STRING,
        "API_KEY",
        "\"38732269-f345afa503965f279b46427d9\""
    )

    private object Type {
        const val STRING = "String"
    }

    data class Field(val type: String, val title: String, val value: String)
}
