
pipeline {
    agent any

    stages {

        stage('Pull') {
            steps {
               git branch: 'main', url: 'https://github.com/aniketm11/git-ignore.git'
            }
        }

        stage('Build') {
            steps {
                echo 'Building...'
            }
        }

        stage('Test') {
            steps {
                echo 'Testing...'
            }
        }

        stage('Deploy') {
            steps {
                echo 'Deploying...'
            }
        }
    }
}
