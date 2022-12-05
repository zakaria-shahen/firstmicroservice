### First Microservice app

### How to build image 

#### build image with docker-maven plugin (**deprecated**)

1. `git checkout dockerfile-maven-plugin`
2. Enable docker expose daemon (**but makes yourself vulnerable**)
   -  ![Enable docker expose daemon](README_image/enable_docker_expose_daemon.png)

3. run next command
    ```shell
      ./mvnw clean package dockerfile:build
    ```


#### build image with spring-boot:build-image plugin

1. run next commands
   ```shell
      ./mvnw clean spring:build-image
   ```
