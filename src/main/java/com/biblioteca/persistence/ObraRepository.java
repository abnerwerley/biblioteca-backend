package com.biblioteca.persistence;

import com.biblioteca.entities.Obra;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ObraRepository extends JpaRepository<Obra ,Long> {

    @Query("select o from OBRA o where titulo = :titulo and editora = :editora")
    List<Obra> findObraByTituloAndEditora(@Param("titulo") String titulo,
                                          @Param("editora") String editora);
}
