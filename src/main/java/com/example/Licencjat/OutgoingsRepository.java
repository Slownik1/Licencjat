package com.example.Licencjat;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface OutgoingsRepository extends JpaRepository<Outgoing, Integer> {


}
