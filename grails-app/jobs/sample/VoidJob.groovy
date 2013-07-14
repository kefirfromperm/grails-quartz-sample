package sample

/**
 * The job without triggers.  It can be started by hand.
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
