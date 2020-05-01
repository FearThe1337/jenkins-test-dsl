// Initial job for jenkins, most likely needs to be copy-pasted

job('setup-projects') {
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
    }
}