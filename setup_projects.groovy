job('001-setup-jenkins-job') {
    steps {
        dsl {
            additionalClasspath('jobs')
            removeAction('DISABLE')
            removeViewAction('DELETE')
            lookupStrategy('JENKINS_ROOT')
            external('_000000_sample_job.groovy')
        }
    }
}