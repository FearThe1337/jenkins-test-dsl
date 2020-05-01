multibranchPipelineJob('multibranch-test') {
    branchSources {
        git {
            // id has to be unique, so random uuid?
            id('481be7f2-933a-4456-a9ca-b5ba4d147eef')
            remote('git@github.com:FearThe1337/jenkins-test-project-1.git')
            credentialsId('git-key')
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