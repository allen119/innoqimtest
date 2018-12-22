pipeline {
   agent any
   stages {
     stage('Test') {
        steps {
        sh 'make check || true' 
        }
     }
   }

   post {
      always {
        sh 'make check || true' 
        junit '**/reports/TEST-*.xml'
      }
   } 
}
