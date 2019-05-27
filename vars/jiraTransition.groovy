def call(Map config){
    echo "Ola ${config.login}"
    sh LibraryResource 'jira/transition.sh'
}