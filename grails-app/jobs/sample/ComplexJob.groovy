package sample

import org.quartz.impl.triggers.CalendarIntervalTriggerImpl
import static org.quartz.DateBuilder.IntervalUnit.*

/**
 *
 * @author Vitalii Samolovskikh aka Kefir
 */
class ComplexJob {
    static triggers = {
        simple repeatInterval: 25000
        cron cronExpression: '0 0/3 * * * ?'
        custom triggerClass: CalendarIntervalTriggerImpl, repeatIntervalUnit: MINUTE, repeatInterval: 2
    }

    SampleService sampleService

    def execute(context){
        log.info(sampleService.logExecuting(context))
    }
}
