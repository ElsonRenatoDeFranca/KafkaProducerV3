# KafkaProducerV3

1- download Apache Kafka from official website


https://www.apache.org/dyn/closer.cgi?path=/kafka/2.6.0/kafka_2.13-2.6.0.tgz

2- Extract the file;

3- Configure the zookeeper.properties file by changing the dataDir key

dataDir=C:\Kafka\zookeeper-data

4- Configure the Kafka server.properties by changing the log.dirs key

log.dirs=C:\Kafka\kafka-logs

5- Open a terminal window and start the zookeeper server

KAFKA_HOME_DIRECTORY > .\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties

6- Open a terminal window and start the kafka server

KAFKA_HOME_DIRECTORY > .\bin\windows\kafka-server-start.bat .\config\server.properties

7- Create a topic 

KAFKA_HOME_DIRECTORY > .\bin\windows\kafka-topics.bat --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic TestTopic
KAFKA_HOME_DIRECTORY > .\bin\windows\kafka-topics.bat --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic NewTopic
KAFKA_HOME_DIRECTORY > .\bin\windows\kafka-topics.bat --list --zookeeper localhost:2181


Creating messages using Kafka

KAFKA_HOME_DIRECTORY > .\bin\windows\kafka-console-producer.bat --broker-list localhost:9092 --topic TestTopic 

> Test input data
> New Data
> Welcome to daily code buffer
> Happy learning
> Indian spices


KAFKA_HOME_DIRECTORY > .\bin\windows\kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic TestTopic --from-beginning


Building and running the application

>gradle build

>gradle bootRun
