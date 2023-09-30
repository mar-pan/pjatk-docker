## During this exercise you get familiar with developing application across multiple teams with Docker
1. Run the following command to build the image:
    ```
    docker compose -f docker-compose.yml up -d
    ```
2. Run your IDE and connect to local Postgres database with the following credentials:
    ```
    host: localhost
    port: 5432
    username: username
    password: password
    database: postgres
    ```
3. Add some table from IDE, you can fill it with any data you want.
4. Now stop the container with following command:
    ```
    docker compose -f docker-compose.yml down
    ```
5. And run it again to see if changes persisted:
    ```
    docker compose -f docker-compose.yml up -d
    ```
