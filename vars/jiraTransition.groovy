// def call(Map config){
//     echo "Ola ${config.login}"
//     withCredentials([
//         string(
//             credentialsId: config.jiraCredential, 
//             variable: 'JIRA_CREDENTIAL'
//         )
//     ]){
//         sh libraryResource('jira/transition.sh')
//     }
//     // withEnv(["LOGIN=${config.login}"]){
//     //     sh libraryResource('jira/transition.sh')
//     // }
// }


def call(Map config){

    jiraCodes = [
        done:'1', 
        review:'2', 
        blocked:'3', 
    ]

    jiraCredential = config.jiraCredential ?: 'defaultjiracred'

    jiraStateId = jiraCodes.get(config.jiraState)

    echo ">>>> ${jiraStateId}"
    // jiraTransitionIssue(
    //     idOrKey: config.jiraIssue,
    //     input: [
    //         transition: [ id: jiraStateId ]
    //     ],
    //     site: config.jiraServer
    // )
}