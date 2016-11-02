package com.jackfrosch.strings

class StringRunner {
    static void main(args) {
        String name = "Jack"

        def s1 = "Hello"
        def s2 = 'Hello'
        def s3 = "Hello ${name}"
        def s4 = createMessage(name)
        String s5 = s4

        println "s1.class: ${s1.class}"
        println "s2.class: ${s2.class}"
        println "s3.class: ${s3.class}"
        println "s4.class: ${s4.class}"
        println "s5.class: ${s5.class}"

        // char gotcha
        // char c1 = 'ab'
        // char c1 = (char) 'ab'
        char c2 = 'ab' as char
        println "c2.class: ${c2.class}; c2 = ${c2}"

        // Map gotcha
        Map map = ["${name}" : 57]
        println map
        println map.Jack

        println s5
    }

    static def createMessage(String name) {
"""-------------------------------------------------
Dear ${name}:

It has come to our attention you're still coding
Java when you could be coding Groovy.

Are you crazy, man? Stop it. Just stop it.

Sincerely,

The Drudgery Elimination Team
-------------------------------------------------"""
    }
}
