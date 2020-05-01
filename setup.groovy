// Initial job for jenkins, most likely needs to be copy-pasted
// Sets up a job, 'setup-projects' which should create all other projects.

job('create_initial_job_setup') {
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
            ignoreExisting(false)
            removeAction('DISABLE')
            lookupStrategy('JENKINS_ROOT')
            removeAction('DELETE')
            removeViewAction('DELETE')
            external('setup_projects.groovy')
        }
        downstreamParameterized {
            trigger('create_jobs')
        }
    }
}