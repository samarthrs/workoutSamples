import spock.lang.Specification

class GroovyAdderSpec extends Specification {

    def "should add 2 numbers"() {
        expect:
        2 == new JavaAdder().add([1,1])
    }

}