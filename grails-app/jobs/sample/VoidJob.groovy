package sample

/**
 *
 * @author Vitalii Samolovskikh aka Kefir
 */
class VoidJob {
    static triggers = {}

    SampleService sampleService

    def execute(context){
        log.info(sampleService.logExecuting(context))
    }
}
