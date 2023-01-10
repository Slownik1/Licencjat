package com.example.Licencjat.Outgoing;

import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OutgoingService {

    private final OutgoingRepository outgoingRepository;

    public OutgoingService(OutgoingRepository outgoingRepository) {
        this.outgoingRepository = outgoingRepository;
    }

    public List<Outgoing> getOutgoing(){
        return outgoingRepository.findAll();
    }

    public Outgoing addOutgoing(Outgoing outgoing){
        return outgoingRepository.save(outgoing);
    }

}
