package pl.openthejar.model;

import lombok.Getter;

import javax.persistence.*;

/**
 * Podstawowa encja przechowujaca tylko klucz glowny
 */
@Entity
@Getter
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;
}
