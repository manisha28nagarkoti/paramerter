def call(){
    sh'''
        sudo docker pull "${param.image_name}":"${param.tag}"
        env.info = "Success" 
        
    '''
    
}
