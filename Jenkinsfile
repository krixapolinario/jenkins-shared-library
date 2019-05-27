library identifier: 'sharedlibrary@master', retriever: modernSCM(
    [$class: 'GitSCMSource',
    remote: 'git@github.com:krixapolinario/jenkins-shared-library.git'])

pipeline {
    stages {
        stage('teste'){
            steps{
                jiraTransition()
            }
        }
    }
}