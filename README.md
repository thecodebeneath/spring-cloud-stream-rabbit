# spring-cloud-stream-rabbit
Spring Cloud Steam framework using RabbitMQ

Binds to rabbit @5672 and creates a queue named "input.streamHello".

Start a Docker container with RabbitMQ, and its management console, using:

`docker run -d --hostname my-rabbit --name some-rabbit -p 8080:15672 -p 5672:5672 rabbitmq:3-management`

Publish a message to the queue with a payload of:

`{"name" : "the codebeneath" }`
