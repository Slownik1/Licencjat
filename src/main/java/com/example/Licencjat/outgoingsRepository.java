package com.example.Licencjat;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface outgoingsRepository extends JpaRepository<Outgoing, Integer> {


}
