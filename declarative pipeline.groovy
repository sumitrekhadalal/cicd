pipeline {
    agent any 
    stages {
        stage('pull') { 
            steps {
               sh 'git@github.com:sumitrekhadalal/studentapp-ui.git' 
            }
        }
    }
}
