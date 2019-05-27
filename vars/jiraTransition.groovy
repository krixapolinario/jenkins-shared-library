def call(Map config){
    echo "Ola ${config.login}"
    withEnv(["LOGIN=${config.login}"]){
        sh libraryResource('jira/transition.sh')
    }
}