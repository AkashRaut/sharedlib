def call() {
		   echo "Cloning the ${ProjectName} project from GitLab"
	       git url: 'https://github.com/AkashRaut/appcenter-sampleapp-android.git', branch: 'master'
		   echo "Code has been checked out into ${JENKINS_HOME}/workspace/${JOB_NAME} workspace..!"
}
