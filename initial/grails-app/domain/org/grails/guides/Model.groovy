package org.grails.guides

class Model {

    String name

    static belongTo = [ make: Make ]

    static constraints = {
    }

    String toString() {
        name
    }
}
