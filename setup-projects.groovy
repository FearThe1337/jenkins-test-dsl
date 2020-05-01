job('001-setup-jenkins-job') {
    steps {
        additionalClasspath('jobs')
        removeAction('DISABLE')
        removeViewAction('DELETE')
        lookupStrategy('JENKINS_ROOT')
        external('000000-sample-job.groovy')
    }
}