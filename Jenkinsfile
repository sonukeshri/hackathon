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
        stage ('Generate test') {

                    steps {
                           echo 'Running test'
                           sh 'git clone https://github.com/sonukeshri/hackathon.git'
                           sh 'cd code-healer'
                           sh 'git checkout -b temp_test_sonu'
                           sh './gradlew clean assemble'
                           sh 'java -classpath build/libs/hackathon-0.0.1-SNAPSHOT.jar:../randoop-all-4.2.6.jar randoop.main.Main gentests --testjar=build/libs/hackathon-0.0.1-SNAPSHOT.jar --output-limit=100'
                           sh 'git restore .'
                           sh 'git add .'
                           sh 'git commit -m "randoop tests"'
                           sh 'git push --set-upstream https://sonukeshri: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@github.com/sonukeshri/hackathon.git temp_test_sonu'

                    }
                }


    }

}
