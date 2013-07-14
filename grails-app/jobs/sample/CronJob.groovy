package sample

/**
 * The job with cron trigger.
 *
 * @author Vitalii Samolovskikh aka Kefir
 */
class CronJob {
    static triggers = {
        cron cronExpression: '0 0/2 * * * ?'
    }

    SampleService sampleService

    def execute(context){
        log.info(sampleService.logExecuting(context))
    }
}
