package com.daggerprovidesmodulebindsexample

import com.example.daggerbindsexample.NotificationService
import com.example.daggerbindsexample.UserRepository
import javax.inject.Inject


class UserRegistrationService @Inject constructor(
    private val userRepository: UserRepository,
    private val notificationService: NotificationService
) {


    fun registerUser(email:String,password:String){
        userRepository.saveUser(email,password);
        notificationService.send("sunil@gmail.com",email,"Welcome, thanks for registration.")
    }

}