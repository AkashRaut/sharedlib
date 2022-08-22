def call() {      

                sh "echo ${env.gitlabSourceBranch}"
                script {
                    if ("${env.gitlabSourceBranch}" == 'release') {

           sh 'npm cache clean --force' 
           echo "release"
		   echo "Cloning the ${ProjectName} project from Github"
	       git url: 'https://github.com/AkashRaut/sharedlib.git', branch: 'release', credentialsId: '1'
		   echo "Code has been checked out into ${JENKINS_HOME}/workspace/${JOB_NAME} workspace..!"
                    
                        
                    }  else {
 
           sh 'npm cache clean --force' 
           echo "uat"
		   echo "Cloning the ${ProjectName} project from Github"
	       git url: 'https://github.com/AkashRaut/sharedlib.git', branch: 'uat', credentialsId: '1'
		   echo "Code has been checked out into ${JENKINS_HOME}/workspace/${JOB_NAME} workspace..!"
                    }
                    }
}
