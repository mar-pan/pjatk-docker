## During this exercise you will get familiar with Dockerfiles
1. Build your first Docker image using the following command:
    ```
    docker build -t my-first-image .
    ```
2. Run your first Docker container using the following command:
    ```
    docker run --name my-first-image my-first-image 
    ```
3. Check if your container is running with the following command:
    ```
    docker ps
    ```
4. Connect to your container using the following command:
    ```
    docker run -it my-first-image bash
    ```
5. When inside container check your system version with the following command:
    ```
    cat /etc/issue
    ```
6. Change your system version to Ubuntu 20.04 by changing the FROM instruction inside Dockerfile (1. Dockerfile intro/Dockerfile):
    ```
    FROM ubuntu:18.04
    ```
7. Build image with a new version:
    ```
    docker build -t my-second-image .
    ```
8. Enter into newly build image with:
    ```
    docker run -it my-second-image bash
    ``` 
9. Check your system version with:
    ```
    cat /etc/issue
    ```
