// def jiraTransitions(gitlabSourceBranch, jiraTargetState){
//     def JIRA_STATUS_TODO = '11'
//     def JIRA_STATUS_INPROGRESS = '21'
//     def JIRA_STATUS_AUTOMATEDTESTS = '81'
//     def JIRA_STATUS_INREVIEW = '51'
//     def JIRA_STATUS_READYFORTESTS = '61'
//     def JIRA_STATUS_MANUALTESTS = '71'
//     def JIRA_STATUS_DONE = '31'
//     jiraTransitionIssue(
//         idOrKey: gitlabSourceBranch,
//         input: [
//             transition: [ id: jiraTargetState ]
//         ],
//         site: 'JIRA'
//     )
// }

def call(String login='default'){
    echo "Ola ${login}"
}