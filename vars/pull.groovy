def pull(){
    sh '''
        sudo docker pull "${param.image_name}":"${param.tag}"
        ls
    '''
    
}
