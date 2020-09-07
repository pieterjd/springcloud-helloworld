#SpringCloud HelloWorld
This is a helloworld style project for SpringCloud. It is heavily inspired by JavaBrains.io Youtube tutorial.

It contains 3 microservices:
* datetime-service: returns the current datetime
* salutation-service: returns at random a salutation for male or female persons
* greeting-service: uses the first 2 services to compose a greeting

## Keypoints
* each microservice should be standalone. As a consequence, there is some code duplication in the model package. 
  
  A common dependency on the datamodel breaks the standalone principle.
* Each REST endpoint returns an object. This makes it easy to change the return values. 
 
   Suppose an endpoint returns a String. After some time, you need to return a List as well. Now the response of the endpoint breaks the consuming clients.  If an object is returned, you can add a field without breaking anything, because spring only unserializes the field it's aware of.
