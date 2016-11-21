package ru.innopolis.university.ramis.entity;

import javax.persistence.*;

/**
 * Created by innopolis on 18.11.16.
 */
@Entity
@Table(name = "Category")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name")
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id_parent")
    private Category category;

    public Category(Long id, String name, Category category) {
        this.id = id;
        this.name = name;
        this.category = category;
    }

    public Category() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public boolean isEmpty(){
        return this.name.isEmpty();
    }
}
