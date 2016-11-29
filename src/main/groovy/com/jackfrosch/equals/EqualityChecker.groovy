package com.jackfrosch.equals

class EqualityChecker {

    static void main(args) {
        String z = 'Z'
        String yzObj = 'YZ'
        showEqualityRelationships('YZ vs Y + Z', 'YZ', 'Y' + z)
        showEqualityRelationships('YZ vs Y${z}', 'YZ', "Y${z}")
        showEqualityRelationships('YZ vs yzObj', 'YZ', yzObj)
        showEqualityRelationships('5 vs 5L', 5, 5L)
        showEqualityRelationships('Code(Hello) vs Code(hello)',
                                    new Code(value: 'Hello'),
                                    new Code(value: 'hello'))
    }

    static void showEqualityRelationships(String context,
                                          def a, def b) {
        println "\n----- ${context} -----"
        println "a == b: ${a == b}"
        println "a <=> b: ${a <=> b}"
        println "a.equals(b): ${a.equals(b)}"
        println "a.is(b): ${a.is(b)}"
    }
}
