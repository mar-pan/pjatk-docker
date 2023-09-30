## During this exercise you will get familiar with Dockerfile
1. Build your first Docker image using the following command:
    ```
    docker build -t my-first-image .
    ```
2. Run your freshly built Docker container using the following command:
    ```
    docker run --name my-first-image my-first-image 
    ```
3. Check if your container is running with the following command. Have you idea why it is not running?:
    ```
    docker ps
    ```
4. Now use the following command:
    ```
    docker ps -a
    ```
5. Run container another time using the following command (this time with interactive mode):
    ```
    docker run -it my-first-image bash
    ```
6. When inside container check your system version with the following command:
    ```
    cat /etc/issue
    ```
7. Change system version to Ubuntu 20.04 by changing the FROM instruction inside Dockerfile (1. Dockerfile intro/Dockerfile):
    ```
    FROM ubuntu:18.04
    ```
8. Build image with a new version:
    ```
    docker build -t my-second-image .
    ```
9. Enter into newly build image with:
    ```
    docker run -it my-second-image bash
    ``` 
10. Check your system version with:
    ```
    cat /etc/issue
    ```
