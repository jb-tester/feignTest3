### **Simple test of Spring Feign client with Eureka **

- run eureka-service  application
- run feign-test3-api application
- run feign-test3-client application
- go to http://localhost:8761 and view the registered services
- run the http requests from http-request.http file


**Problems:**
- though the Actuator| Health tab displays the 'eureka' node for the eureka server application, it shows the empty services list always. It would be nice to display the registered services there
- there is no reference from the @FeignClient#name to the application name (and registered service in runtime)