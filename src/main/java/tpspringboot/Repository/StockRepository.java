package tpspringboot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tpspringboot.entites.Stock;

public interface StockRepository extends JpaRepository <Stock,Long> {

}
