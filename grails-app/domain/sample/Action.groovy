package sample

class Action {
    String jobName
    String triggerName
    Date dateCreated

    static constraints = {
        jobName(nullable: true)
        triggerName(nullable: true)
    }
}
