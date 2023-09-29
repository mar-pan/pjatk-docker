## During this exercise you will learn how to persist data across multiple Docker runs and how to local Postgres database fast
1. Run the following command to build the image:
    ```
    docker compose -f docker-compose.yml up d
    ```
2. Run your IDE and connect to local Postgres database with the following credentials:
    ```
    host: localhost
    port: 5432
    username: postgres
    password: postgres
    database: postgres
    ```
3. Add some table from IDE, you can fill it with any data you want:
4. Now stop the container and run it again to see if changes persisted:
    ```
    docker exec -it my-webpage-image bash
    ```
