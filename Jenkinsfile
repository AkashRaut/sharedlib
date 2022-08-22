@Library('sharedlib') _
pipeline{
	agent any
 environment { 
	 ProjectName = "Job1"
	     }
 stages {
   
    stage('Git Clone'){
        steps{
               cleanWs()
	       gitClone()
             }
        }
    
    
     stage('Script'){
        steps{
		   helloWorld()
        }
    }   
     
   }
    
}
