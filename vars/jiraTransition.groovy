def call(Map config){
    echo "Ola ${config.login}"
    sh libraryResource('jira/transition.sh')
}