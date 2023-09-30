## During this exercise you get familiar with developing application across multiple teams with Docker
1. Run the following command to build the image:
    ```
    docker compose -f docker-compose.yml up -d
    ```
2. From browser go to http://localhost:3000 and see if you can see the webpage.
3. Edit file (4. The App/frontend/src/App.tsx) line 23 add your name for example.
4. Rebuild images
    ```
    docker compose -f docker-compose.yml up -d
    ```
5. See if change is reflected in browser.
6. And run it again to see if changes persisted:
    ```
    docker compose -f docker-compose.yml up -d
    ```
7. Check two endpoints if they're working correctly

   -http://localhost:8080/api/
    
   -http://localhost:8080/api/myEndpoint

9. Uncomment code in the backend section (HomeController) and rebuild your docker project to see working changes

   ```
   docker compose -f docker-compose.yml up --build -d
   ```

Code taken from https://github.com/docker/awesome-compose/tree/master
