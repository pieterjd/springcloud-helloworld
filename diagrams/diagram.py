# use diagrams from https://github.com/mingrammer/diagrams
from diagrams import Diagram
from diagrams.programming.framework import Spring
from diagrams.onprem.client import Client
with Diagram("springcloud-helloworld"):
    eureka = Spring("Eureka Server")
    greeting = Spring("Greeting Service")
    salutation = Spring("Salutation Service")
    datetime = Spring("Datetime Service")
    client = Client("Client")
    client >> greeting
    greeting >> eureka
    greeting >> salutation
    greeting >> datetime
    salutation >> eureka
    datetime >> eureka


