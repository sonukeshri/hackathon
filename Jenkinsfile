pipeline {
    agent any

    stages {
        stage ('Print Version') {

            steps {
				        echo 'Print Gradle Version'
                withGradle() {
                    sh './gradlew -v'
                }
            }
        }
        stage ('Clean') {

            steps {
        				  echo 'Running gradle clean'
                  withGradle() {
                       sh './gradlew clean'
                  }
            }
        }
        stage ('Build') {

            steps {
                   echo 'Running gradle build'
                   withGradle() {
                         sh './gradlew build'
                   }
            }
        }
        stage ('Run Repairnator') {
                            steps {
                                   echo 'Running Repairnator'
                                   sh './repairnator.sh'

                            }
                        }
    }
}
