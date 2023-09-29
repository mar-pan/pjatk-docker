## During this exercise you will try to break you colleague work :)
1. Run the following command to build the image:
    ```
    docker build -t my-webpage-image .
    ```
2. Run your IDE and connect to local Postgres database with the following credentials:
    ```
    docker run --rm --name my-webpage-image -p 80:80 my-webpage-image
    ```
3. Run your browser and go to:
    ```
    http://localhost:80
    ```
4. Now lets swap PCs with your colleague and once again enter into container (open second terminal window):
    ```
    docker exec -it my-webpage-image bash
    ```
5. Delete his/her index.html file:
    ```
    rm -rf /usr/share/nginx/html/index.html
    ```
6. Now let swap your PCs again and try to reach http://localhost:80 from browser. What happened?:
    ```
    http://localhost:80
    ```
7. Let's fix our colleague trolling :), stop the container by pressing Ctrl + C from the first terminal window:
8. Rerun image with:
    ```
    docker run --name my-webpage-image -p 80:80 my-webpage-image
    ```
