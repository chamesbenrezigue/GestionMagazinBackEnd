package tpspringboot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tpspringboot.entites.Produit;

public interface ProduitRepository extends JpaRepository <Produit,Long> {

}
