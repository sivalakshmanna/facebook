//Declarative
pipeline{
    agent any
    environment {
        string(name: 'BRANCH_NAME', defaultvalue: 'master', description: 'From which branch artifacts wants to deploy?')
        string(name: 'BUILD_NUM', defaultvalue: '', description: 'From which build number artifacts wants to deploy?')
    }
    stages{
        stage("download artifacts"){
          steps{
            println " Here I'm downloading artifacts from s3"
            }
        }
        stage("copy artifacts"){
            steps{
                println "Here i'm copying artifacts from jenkins to tomcat server"
                sh """aws s3 ls 
                aws s3 ls s3://sivabandela
                aws s3 ls s3://sivabandela/${BRANCH_NAME}/${BUILD_NUM}/
                   """
            }
        }
    }
}