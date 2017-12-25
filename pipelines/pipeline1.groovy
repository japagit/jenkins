pipeline {
    agent none
    stage ('Example') {
        steps {
             script { 
                echo 'Starting'
                 echo 'Nothing to do!'
             }
        }
    }
}