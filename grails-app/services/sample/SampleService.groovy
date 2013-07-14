package sample

/**
 * The simple service for the application.
 *
 * @author Vitalii Samolovskikh aka Kefir
 */
class SampleService {
    /**
     * Saves executing in DB and returns a log message.
     * @param context the quartz executing context
     */
    def logExecution(context){
        def jobName = context?.jobDetail?.key as String
        def triggerName = context?.trigger?.key as String
        new Action(jobName: jobName, triggerName: triggerName).save()
        "The job ${jobName} is executing with the tirgger ${triggerName}"
    }
}
