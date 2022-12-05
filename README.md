### First Microservice app

### How to build image 

#### build image with docker-maven plugin (**deprecated**)

1. Enable docker expose daemon (**but makes yourself vulnerable**)
   -  ![Enable docker expose daemon](README_image/enable_docker_expose_daemon.png)

2. run next commands
    ```shell
      ./mvnw clean package -DskipTests
      ./mvnw package dockerfile:build
    ```
   

#### build image with spring-boot
   
