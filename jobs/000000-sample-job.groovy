multibranchPipelineJob('multibranch-test') {
    branchSources {
        git {
            // id has to be unique, so random uuid?
            id('481be7f2-933a-4456-a9ca-b5ba4d147eef')
            remote{
                url('https://github.com/jenkinsci/job-dsl-plugin.git')
                credentials('git-key')
            }
            credentials
            // credentialsId('id')
            includes('*')
        }
    }
    orphanedItemStrategy {
        discardOldItems {
            numToKeep(20)
        }
    }

    description('My multibranch pipeline test')
    displayName('multibranch-test')
}