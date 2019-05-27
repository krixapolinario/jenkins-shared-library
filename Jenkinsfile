library identifier: 'sharedlibrary@master', retriever: modernSCM(
    [$class: 'GitSCMSource',
    remote: 'https://github.com/krixapolinario/jenkins-shared-library.git'])

pipeline {
    agent any
    stages {
        stage('teste'){
            steps{
                jiraTransition(
                    login: 'cristiane',
                    jiraCredential: 'testesecret'
                )
            }
        }
    }
}