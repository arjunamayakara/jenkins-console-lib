#!groovy
@Library('jenkins-console-lib@master') _

pipeline{
    agent any
    options {
      ansiColor('xterm')
    }
     stages{
        stage('first'){
            steps{
                script{
                    logger.logger("CHECK THIS ALERT","ALERT");    
                    logger.printPurpleMsg("printing purple message");
                    logger.error("I am Error");
                    logger.debug("I am Debug");
                }
            }
        }
    }	
}
