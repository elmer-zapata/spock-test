import spock.*
import spock.lang.Specification

class NewSpec extends Specification{
    def "Un nuevo comercio desea afiliarse al programa pago planilla"(){
        given: "un nuevo comercio que no esta afiliado al programa"
            def comercio = new Comercio()
        when: "el comercio se registra al programa"
            def comercioBuild = new ComercioBuild();
            comercio = comercioBuild.withDisccount(10).name("ketal").build();
        then: "espera el comercio debera tener el estatus afiliado"
            comercio.descuento == 10
    }
}
