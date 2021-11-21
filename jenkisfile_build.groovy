//Declarative pipeline
pipeline{
    agent any
    stages{
        stage("chekout code"){
            steps{
                println "clone our code to our repository"
                sh "ls -l"
            }
        }
        stage("build code"){
            steps{
                println "mvn clean package"
                sh "mvn clean package"
                sh "ls -l target/"
            }
        }
        stage("upload artifacts to s3"){
            steps{
                println "uploading artifacts to s3 bucket"
            }
        }
    }
}