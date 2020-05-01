job('create_jobs') {
    scm {
        git {
            remote {
                name('origin')
                url('git@github.com:FearThe1337/jenkins-test-dsl.git')
                credentials('git-key')
            }
            extensions {
                cleanAfterCheckout()
            }
        }
    }
    steps {
        dsl {
            removeAction('DISABLE')
            removeViewAction('DELETE')
            lookupStrategy('JENKINS_ROOT')
            external('jobs/_000000_sample_job.groovy')
        }
    }
}