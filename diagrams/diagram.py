# use diagrams from https://github.com/mingrammer/diagrams
from diagrams import Diagram, Cluster, Edge
from diagrams.programming.framework import Spring
from diagrams.onprem.client import Client

with Diagram("springcloud-helloworld"):
    client = Client("Client")
    with Cluster("Cloud Services"):
        greeting = Spring("Greeting Service")
        with Cluster("Private Cloud Services"):
            eureka = Spring("Eureka Server")
            salutation = Spring("Salutation Service")
            datetime = Spring("Datetime Service")
    client >> greeting
    greeting - Edge(forward=True,reverse=True) - eureka
    greeting >> salutation
    greeting >> datetime
    salutation - Edge(forward=True,reverse=True) - eureka
    datetime - Edge(forward=True,reverse=True) - eureka
