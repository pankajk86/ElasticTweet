package org.personal.elastic.kafka;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.kafka.clients.consumer.Consumer;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;

public class TwitterKafkaProcessor {
    
    private static final String KAFKA_CONFIG_FILE = "src/main/resources/kafka.properties";
    private static Producer<String, String> producer = null;
    private static Consumer<String, String> consumer = null;
    
    public static Producer<String, String> getProducer() {
        
        if(producer == null) {
            producer = new KafkaProducer<String, String>(getProducerProperties());
        }
        return producer;
    }
    
    public static Consumer<String, String> getConsumer() {
        
        if(consumer == null) {
            consumer = new KafkaConsumer<String, String>(getConsumerProperties());
        }
        return consumer;
    }
    
    private static Properties getProperties() {
        Properties props = new Properties();
        try {
            props.load(new FileInputStream(KAFKA_CONFIG_FILE));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return props;
    }
    
    private static Properties getProducerProperties() {
        
        String metadataBrokerList = "metadata.broker.list";
        String serializerClass = "serializer.class";
        String clientId = "client.id";
        String bootstrapServers = "bootstrap.servers";
        String keySerialzer = "key.serializer";
        String valueSerializer = "value.serializer";
        
        Properties props = getProperties();
        Properties producerProperties = new Properties();
        
        producerProperties.setProperty(metadataBrokerList, props.getProperty(metadataBrokerList));
        producerProperties.setProperty(serializerClass, props.getProperty(serializerClass));
        producerProperties.setProperty(clientId, props.getProperty(clientId));
        producerProperties.setProperty(bootstrapServers, props.getProperty(bootstrapServers));
        producerProperties.setProperty(keySerialzer, props.getProperty(keySerialzer));
        producerProperties.setProperty(valueSerializer, props.getProperty(valueSerializer));
        
        return producerProperties;
    }
    
    private static Properties getConsumerProperties() {
        
        String zookeeperConnect = "zookeeper.connect";
        String groupId = "group.id";
        String zookeeperSessionTimeout = "zookeeper.session.timeout.ms";
        String zookeeperSyncTime = "zookeeper.sync.time.ms";
        String autoCommitInterval = "auto.commit.interval.ms";
        String bootstrapServers = "bootstrap.servers";
        String keyDeserialzer = "key.deserializer";
        String valueDeserializer = "value.deserializer";
        
        Properties props = getProperties();
        Properties consumerProperties = new Properties();
        
        consumerProperties.setProperty(zookeeperConnect, props.getProperty(zookeeperConnect));
        consumerProperties.setProperty(groupId, props.getProperty(groupId));
        consumerProperties.setProperty(zookeeperSessionTimeout, props.getProperty(zookeeperSessionTimeout));
        consumerProperties.setProperty(zookeeperSyncTime, props.getProperty(zookeeperSyncTime));
        consumerProperties.setProperty(autoCommitInterval, props.getProperty(autoCommitInterval));
        consumerProperties.setProperty(bootstrapServers, props.getProperty(bootstrapServers));
        consumerProperties.setProperty(keyDeserialzer, props.getProperty(keyDeserialzer));
        consumerProperties.setProperty(valueDeserializer, props.getProperty(valueDeserializer));
        
        return consumerProperties;
    }
}
