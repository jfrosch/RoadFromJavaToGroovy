package com.jackfrosch.equals

import groovy.transform.EqualsAndHashCode

@EqualsAndHashCode
class Code implements Comparable<Code> {
    String value

    int compareTo(Code o) {
        value.toLowerCase() <=> o.value.toLowerCase()
    }
}
