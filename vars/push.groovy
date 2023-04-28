def call(){
    sh'''
    sudo aws ecr get-login-password --region "${param.region}" | sudo docker login --username AWS --password-stdin "${param.ecr_url}"
    sudo docker tag "${param.image_name}":"${param.tag}" "${param.repo_url}":"${param.tag}"
    sudo docker push "${param.ecr_url}"/"${param.repo_name}":${param.tag}
    echo "$info"
    '''
}
