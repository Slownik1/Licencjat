package com.example.Licencjat.Outgoing;

import com.example.Licencjat.Incoming.Incoming;
import com.example.Licencjat.Incoming.IncomingRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.addAll;

@Service
public class OutgoingService {

    private final OutgoingRepository outgoingRepository;
    private final IncomingRepository incomingRepository;

    public OutgoingService(OutgoingRepository outgoingRepository, IncomingRepository incomingRepository) {
        this.outgoingRepository = outgoingRepository;
        this.incomingRepository = incomingRepository;
    }

    public List<Object> getOutgoing(){

        List<Incoming> listOfIncoming =incomingRepository.findAll();
        List<Outgoing> listOfOutgoing =outgoingRepository.findAll();

        ArrayList<Object> list = new ArrayList<>();
        list.addAll(listOfOutgoing);
        list.addAll(listOfIncoming);

        return list;
    }

    public Outgoing addOutgoing(Outgoing outgoing){
        return outgoingRepository.save(outgoing);
    }

}
