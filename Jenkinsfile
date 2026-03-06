pipeline {
    agent any
     tools {
        maven 'Maven'
        jdk 'JDK17'
    }
    triggers { 
      githubPush() 
   }
    environment {
        DOCKER_IMAGE_NAME = 'calculator-miniproject'
        GITHUB_REPO_URL = 'https://github.com/VarunreddyChintha/calculator-miniproject.git'
    }

    stages {
        stage('Checkout') {
            steps {
                script {
                    // Checkout the code from the GitHub repository
                    git branch: 'main', url: "${GITHUB_REPO_URL}"
                }
            }
        }
        
        stage('Maven Build') {
            steps {
                script {
                    sh 'mvn clean install'
                }
            }
        }

        stage('Build Docker Image') {
            steps {
                script {
                    // Build Docker image
                    docker.build("${DOCKER_IMAGE_NAME}", '.')
                }
            }
        }

        stage('Push Docker Images') {
            steps {
                script{
                    docker.withRegistry('', 'DockerHubCred') {
                    sh 'docker tag calculator-miniproject varun000reddy/calculator-miniproject:latest'
                    sh 'docker push varun000reddy/calculator-miniproject:latest'
                    }
                 }
            }
        }

   stage('Run Ansible Playbook') {
            steps {
                script {
                    ansiblePlaybook(
                        playbook: 'deploy.yml',
                        inventory: 'inventory'
                     )
                }
            }
        }

    }
     post {
        always {
            mail(
                to: 'varun000reddy@gmail.com',
                subject: "Build ${currentBuild.currentResult}",
                body: "Build URL: ${env.BUILD_URL}"
            )
        }
    }
}
