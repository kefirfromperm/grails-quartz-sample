package sample

import org.quartz.impl.triggers.CalendarIntervalTriggerImpl

import static org.quartz.DateBuilder.IntervalUnit.*

/**
 * The job with custom trigger. This example uses the standard quartz trigger CalendarIntervalTriggerImpl.
 *
 * @author Vitalii Samolovskikh aka Kefir
 */
class CustomJob {
    static triggers = {
        custom triggerClass: CalendarIntervalTriggerImpl, repeatIntervalUnit: MINUTE, repeatInterval: 1
    }

    SampleService sampleService

    def execute(context){
        log.info(sampleService.logExecution(context))
    }
}
