package com.kh.mo.shopyapp.model.response.orderdetails


import com.google.gson.annotations.SerializedName

data class ShopMoney(
    @SerializedName("amount")
    val amount: String?,
    @SerializedName("currency_code")
    val currencyCode: String?
)