package com.example.dagger
/*
we create a constructor for passing objects of other classes,
Instead of creating those objects inside UserRegistrationService class.
This is called manual dependency injection
 */
class UserRegistrationService(
    private val userRepo: UserRepo,
    private val emailService: EmailService
) {
    fun userRegistration(email: String, pass: String) {
        userRepo.saveUser(email, pass)
        emailService.send(email, "abc@gmail.com", "")
    }
}