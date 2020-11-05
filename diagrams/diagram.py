# use diagrams from https://github.com/mingrammer/diagrams
from diagrams import Diagram, Cluster
from diagrams.programming.framework import Spring
from diagrams.onprem.client import Client

with Diagram("springcloud-helloworld"):
    with Cluster("Internet"):
        client = Client("Client")
        greeting = Spring("Greeting Service")
    eureka = Spring("Eureka Server")
    salutation = Spring("Salutation Service")
    datetime = Spring("Datetime Service")
    client >> greeting
    greeting >> eureka
    greeting >> salutation
    greeting >> datetime
    salutation >> eureka
    datetime >> eureka
