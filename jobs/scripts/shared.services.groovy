node {
    stage ('Setup') { 
        env.ACCOUNT_ID = 1234567
        git credentialsId: '731e821f-b798-47e9-af26-3f3326cdac34', url: 'https://github.com/dcroswell/jenkins-starter-project'
    }
    stage ('Build') {
        bat "echo $ACCOUNT_ID"
    }  
}

