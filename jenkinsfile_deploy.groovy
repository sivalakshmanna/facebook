//Declarative
pipeline{
    agent any
    stages{
        stage("download artifacts"){
          steps{
            println " Here I'm downloading artifacts from s3"
            }
        }
        stage("copy artifacts"){
            steps{
                println "Here i'm copying artifacts from jenkins to tomcat server"
            }
        }
    }
}