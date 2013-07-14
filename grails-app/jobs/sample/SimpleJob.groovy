package sample

/**
 * The simple job is an job which is triggered with simple quartz trigger.
 *
 * @author Vitalii Samolovskikh aka Kefir
 */
class SimpleJob {
    static triggers = {
        // Simple trigger
        simple repeatInterval: 10000, repeatCount: 30
    }

    SampleService sampleService

    def execute(context){
        log.info(sampleService.logExecution(context))
    }
}
