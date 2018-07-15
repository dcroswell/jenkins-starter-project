pipeline {
    environment {
        BUILD_SCRIPTS = 'mypipeline'
    }
    agent { label 'master' }
    stages {
        stage('Checkout: Code') {
            steps {
                bat 'echo "Hello World"'
            }
        }
        stage('build-test') {
            steps {
                bat 'echo "Hello World"'
            }
        }
    }
    post {
        always {
			cleanWs()
        }
    }
}