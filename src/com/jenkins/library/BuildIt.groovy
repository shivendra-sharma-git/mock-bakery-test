package com.jenkins.library
//This is to build the docker image using buildah on container itself.
def build(def dockerFilePath) {
    sh """
        echo INFO: Linting dockerfile
        echo kaniko --dockerfile=${pwd()}/${dockerFilePath} --context=${pwd()}/pipelines/conf --no-push
        sleep 1500
    """    
}