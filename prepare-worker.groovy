node ('master'){
    stage('init'){
        sh 'ssh -i /root/jenkins-master_rsa root@68.183.116.191 yum install install epel-release -y '
}