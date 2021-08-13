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
                bat 'mvn clean package'
            }
        }
        stage('Deploying') {
            steps {
                echo 'deploying'
            }
        }
    }
}
