package fooddeliveryfive;

import fooddeliveryfive.config.kafka.KafkaProcessor;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class PolicyHandler{
    @StreamListener(KafkaProcessor.INPUT)
    public void onStringEventListener(@Payload String eventString){

    }

    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverDelivered_UpdateStatus(@Payload Delivered delivered){

        if(delivered.isMe()){
            System.out.println("##### listener UpdateStatus : " + delivered.toJson());
        }
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverMenuRegistered_RegisterMenu(@Payload MenuRegistered menuRegistered){

        if(menuRegistered.isMe()){
            System.out.println("##### listener RegisterMenu : " + menuRegistered.toJson());
        }
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverMenuDeleted_DeleteMenu(@Payload MenuDeleted menuDeleted){

        if(menuDeleted.isMe()){
            System.out.println("##### listener DeleteMenu : " + menuDeleted.toJson());
        }
    }

}
