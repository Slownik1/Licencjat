pipeline {
    agent any

    tools {
        // Install the Maven version configured as "M3" and add it to the path.
        maven "M3"
    }

    stages {
        
         stage('Test') {
                    steps {
                        sh "mvn test"
                    }
                }
         stage('Deploy') {
                     steps {
                         sh "mvn spring-boot:run"
                         sh "cd angularclient"
                         sh "cd ng serve --open"
                         sh "cd angularclient"
                     }
                 }
    }
}
