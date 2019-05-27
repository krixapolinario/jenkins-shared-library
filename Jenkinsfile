library identifier: 'sharedlibrary@master', retriever: modernSCM(
    [$class: 'GitSCMSource',
    remote: 'git@github.com:krixapolinario/jenkins-shared-library.git'])

pipeline {
    agent any
    stages {
        stage('teste'){
            steps{
                jiraTransition()
            }
        }
    }
}