Demo project for configuring https://github.com/codecentric/spring-boot-admin with Oauth on Spring Boot 2.1 verison

Services are configured as Eureka clients.
Project contains:
- [spring-boot-eureka-server] Eureka server (which should be started first)
- [spring-boot-authorization] Authentication and Authorization server. Clients will be redirected to login page which is hosted on this application. This application issues JWT tokens but it can be something else.
- [spring-boot-service] Dummy service that is registered as client and will show up in admin server (so we have something to monitor) 
- [spring-boot-admin] Admin server application configured to retrieve authorization from autorization server

Implementation is based on this thread:
https://stackoverflow.com/questions/44929918/how-to-access-actuator-endpoints-behind-oauth2-security-from-spring-boot-admin
