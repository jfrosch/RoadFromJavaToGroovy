package com.jackfrosch.truth

import groovy.transform.ToString

class TruthClient {
    @ToString(includePackage = false)
    static class Employee {
        String name
        boolean active
        boolean asBoolean() { active }
    }

    static void main(String[] args) {
        TruthService truthService = new TruthService()

        truthService.echo(-1, -1 as boolean)
        truthService.echo(0, 0 as boolean)
        truthService.echo(1, 1 as boolean)
        truthService.echo('Hello', 'Hello' as boolean)
        truthService.echo('""', '' as boolean)
        truthService.echo([1,2,3], [1,2,3] as boolean)
        truthService.echo([], [] as boolean)
        truthService.echo([a:1,b:2], [a:1,b:2] as boolean)
        truthService.echo([:], [:] as boolean)
        truthService.echo("[1,2,3].iterator()",
                            [1,2,3].iterator() as boolean)
        truthService.echo("[].iterator()", [].iterator() as boolean)
        truthService.echo("new Object()", new Object() as boolean)
        truthService.echo("null", null as boolean)

        Employee emp1 = new Employee(name: "Jack", active: true)
        Employee emp2 = new Employee(name: "Jill", active: false)

        truthService.echo(emp1, emp1 as boolean)
        truthService.echo(emp2, emp2 as boolean)
    }
}
