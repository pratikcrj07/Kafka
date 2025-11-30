package com.deliveryboy.Service;

import com.deliveryboy.config.AppConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;


@Service
public class kafkaService {


    @Autowired

    private KafkaTemplate<String, String> kafkaTemplate;

    public boolean updateLocation(String Location) {

        this.kafkaTemplate.send(AppConstants.LOCATION_TOPIC_NAME, Location);
return true;

    }

}