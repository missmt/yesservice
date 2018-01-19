package com.tnourji.commontools.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * A Contributor.
 */
@Entity
@Table(name = "contributor")
public class Contributor implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @ManyToMany
    @JoinTable(name = "contributor_gift_items",
               joinColumns = @JoinColumn(name="contributors_id", referencedColumnName="id"),
               inverseJoinColumns = @JoinColumn(name="gift_items_id", referencedColumnName="id"))
    private Set<GiftItem> giftItems = new HashSet<>();

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public Contributor firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Contributor lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Set<GiftItem> getGiftItems() {
        return giftItems;
    }

    public Contributor giftItems(Set<GiftItem> giftItems) {
        this.giftItems = giftItems;
        return this;
    }

    public Contributor addGiftItems(GiftItem giftItem) {
        this.giftItems.add(giftItem);
        giftItem.getContributors().add(this);
        return this;
    }

    public Contributor removeGiftItems(GiftItem giftItem) {
        this.giftItems.remove(giftItem);
        giftItem.getContributors().remove(this);
        return this;
    }

    public void setGiftItems(Set<GiftItem> giftItems) {
        this.giftItems = giftItems;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here, do not remove

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Contributor contributor = (Contributor) o;
        if (contributor.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), contributor.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "Contributor{" +
            "id=" + getId() +
            ", firstName='" + getFirstName() + "'" +
            ", lastName='" + getLastName() + "'" +
            "}";
    }
}
