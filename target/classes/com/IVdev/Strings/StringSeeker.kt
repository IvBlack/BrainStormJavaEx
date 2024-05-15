//package com.IVdev.Strings
//import java.util.*
//
///*
//Given a string s containing just the characters '(', ')', '{','}', '[',']'
//determine if the input string is valid
//*/
//class StringSeeker {
//    fun isValid(s : String): Boolean {
//        val openStack = Stack<Char>()
//        for (c in s) {
//            when {
//                isOpen(c) -> openStack.push(c)
//                isClose(c) -> {
//                    if (openStack.isEmpty()) return false
//                    val lastOpen = openStack.pop()
//                    if (!areSameType(left = lastOpen, right = c)) return false
//                }
//                else -> return false
//            }
//        }
//        return openStack.isEmpty()
//    }
//
//    fun isOpen(c : Char): Boolean {
//        return c == '(' || c == '[' || c == '{'
//    }
//
//    fun isClose(c : Char): Boolean {
//        return c == ')' || c == ']' || c == '}'
//    }
//
//    fun areSameType(left: Char, right: Char): Boolean {
//        return (left == '(' && right == ')') ||
//                (left == '[' && right == ']') ||
//                (left == '{' && right == '}')
//    }
//}