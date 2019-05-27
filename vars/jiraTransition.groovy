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
    if config.jiraState == 'OPEN' {
        jiraStateId='1'
    } else if config.jiraState == 'IN_PROGRESS' {
        jiraStateId='2'
    } else {
        jiraStateId='3'
    }
    sh echo ">>>> ${jiraStateId}"
    // jiraTransitionIssue(
    //     idOrKey: config.jiraIssue,
    //     input: [
    //         transition: [ id: jiraStateId ]
    //     ],
    //     site: config.jiraServer
    // )
}