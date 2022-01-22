#!/bin/bash
export BUILD_ID=dontKillMe
app_id=$(ps -ef | grep 'basic-app-0.0.1-SNAPSHOT.jar' | grep -v 'grep' | awk '{ printf $2 }')
kill -9 $app_id
nohup java -jar ./target/jenkins-maven-0.0.1-SNAPSHOT.jar &
