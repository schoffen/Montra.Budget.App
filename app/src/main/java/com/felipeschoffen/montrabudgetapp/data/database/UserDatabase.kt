package com.felipeschoffen.montrabudgetapp.data.database

import androidx.compose.runtime.MutableState
import com.felipeschoffen.montrabudgetapp.data.model.RegistrationInfo
import com.felipeschoffen.montrabudgetapp.domain.auth.RegisterResult
import com.felipeschoffen.montrabudgetapp.core.Result
import com.felipeschoffen.montrabudgetapp.core.error.RegisterError

interface UserDatabase {
    val registerResult: MutableState<RegisterResult>
    suspend fun registerWithEmail(registrationInfo: RegistrationInfo): Result<Unit, RegisterError>
}