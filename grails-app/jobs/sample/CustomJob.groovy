package sample

import org.quartz.impl.triggers.CalendarIntervalTriggerImpl

import static org.quartz.DateBuilder.IntervalUnit.*

/**
 *
 * @author Vitalii Samolovskikh aka Kefir
 */
class CustomJob {
    static triggers = {
        custom triggerClass: CalendarIntervalTriggerImpl, repeatIntervalUnit: MINUTE, repeatInterval: 1
    }

    SampleService sampleService

    def execute(context){
        log.info(sampleService.logExecuting(context))
    }
}
