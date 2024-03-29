package com.example.composetutorial

import java.util.regex.Pattern

class Utils {

    companion object{

        val EMAIL_ADDRESS_PATTERN = Pattern.compile(
            "[a-zA-Z0-9\\+\\.\\_\\%\\-\\+]{1,256}" +
                    "\\@" +
                    "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}" +
                    "(" +
                    "\\." +
                    "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,25}" +
                    ")+"
        )

        open fun isValidEmail(input : String) : Boolean{
            return EMAIL_ADDRESS_PATTERN.matcher(input).matches()
        }
    }

}