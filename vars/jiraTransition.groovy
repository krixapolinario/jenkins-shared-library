def call(Map config){
    echo "Ola ${config.login}"
    withCredentials([
        string(
            credentialsId: config.jiraCredential, 
            variable: 'JIRA_CREDENTIAL'
        )
    ]){
        sh libraryResource('jira/transition.sh')
    }
    // withEnv(["LOGIN=${config.login}"]){
    //     sh libraryResource('jira/transition.sh')
    // }
}