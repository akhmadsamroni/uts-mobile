package com.samroni.catatanpenjualan.activity.login

import com.samroni.catatanpenjualan.model.User

interface LoginView {
    fun onSuccessLogin(user: User?)
    fun onErrorLogin(msg: String?)
}