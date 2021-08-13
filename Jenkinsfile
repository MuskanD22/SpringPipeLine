pipeline {
    agent any

    stages {
        stage('Checking version') {
            steps {
                bat 'javac -version'
            }
        }
        stage('Build') {
            steps {
                bat 'mvn -X clean -X package'
            }
        }
        stage('Deploying') {
            steps {
                deploy adapters: [tomcat9(credentialsId: '100', path: '', url: 'http://13.127.225.56:8080/')], contextPath: 'demo', war: '**/demoaws-0.0.1-SNAPSHOT.war'
            }
        }
    }
}
