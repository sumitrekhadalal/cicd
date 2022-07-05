pipeline {
    agent any 
    stages {
        stage('pull') { 
            steps {
               sh 'https://github.com/sumitrekhadalal/studentapp-ui.git'
            }
        }
    }
}
