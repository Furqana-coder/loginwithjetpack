package com.temi.loginwithjetpack
sealed class Routes(val route: String) {
    object Login : Routes("Login")
}