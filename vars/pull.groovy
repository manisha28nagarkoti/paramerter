def pull(){
    sh '''
        sudo docker pull ${env.image_name}:${env.tag}
        ls
    '''
    
}
