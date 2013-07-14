package sample

class MainController {
    /**
     * Show all executions of all jobs.
     */
    def index() {
        return [actions:Action.listOrderByDateCreated(order: 'desc')]
    }

    /**
     * Runs the VoidJob and redirect to index.
     */
    def execute(){
        VoidJob.triggerNow()
        redirect(action: 'index')
    }
}
