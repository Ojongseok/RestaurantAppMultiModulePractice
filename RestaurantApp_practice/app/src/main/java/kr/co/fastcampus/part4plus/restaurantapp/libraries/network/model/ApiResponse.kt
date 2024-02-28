package kr.co.fastcampus.part4plus.restaurantapp.libraries.network.model

import com.google.gson.annotations.SerializedName

sealed class ApiResponse<out T> {
    class Success<T>(
        @SerializedName("data") val data: T
    ) : ApiResponse<T>()

    class Fail(
        @SerializedName("error") val error: Throwable
    ) : ApiResponse<Nothing>()
}