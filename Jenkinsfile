@Library('jenkins-console-lib@master') _

pipeline{
    agent any
    options{
        ansiColor('xterm')
    }   
    environment {
        MAVEN_OPTS = '-Djansi.force=true'
    }
     stages{
        stage('first'){
            steps{
                script{
                    logger.logger("CHECK THIS ALERT","ALERT");           
                }
            }
        }
    }	
}
