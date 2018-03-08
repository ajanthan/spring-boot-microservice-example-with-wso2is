## Menu Service
A Sample service secured by OAuth2 using WSO2 Identity Server

### Steps to run the service
1. Download and install latest version of [WSO2 Identity Server](https://docs.wso2.com/display/IS541/Installing+the+Product)
2. Start the product and login to the [management console](https://docs.wso2.com/display/IS541/Getting+Started+with+the+Management+Console) using default password
3. [Create a service provider](https://docs.wso2.com/display/IS541/Adding+and+Configuring+a+Service+Provider) called "MenuService"
4. Then click on inbound authentication configuration, expand OAuth/OpenID Connect configuration and click configure
5. Leave all the default value except for callback url.For callback url give any valid dummy url and save it
6. Get the client id and client secret and update src/main/resources/application.properties
7. Build the project using Maven
8. Run the microservice by following command

 `java  -Djavax.net.ssl.trustStore=<IS_HOME>/repository/resources/security/client-truststore.jks -Djavax.net.ssl.trustStorePassword=wso2carbon -jar target/Menu-Service-0.0.1-SNAPSHOT.jar`
 
9. Generate access token using following command and get the token from the response

`curl -u <Client Id>:<Client Secret> -k -d "grant_type=password&username=admin&password=admin" -H "Content-Type:application/x-www-form-urlencoded" https://localhost:9443/oauth2/token`

10. Access the API using following command

`curl -kv http://localhost:8080/menu/ -H "Authorization: Bearer <access-token>"`
