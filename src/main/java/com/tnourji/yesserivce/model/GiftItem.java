package com.tnourji.yesserivce.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import java.util.Objects;

/**
 * A GiftItem.
 */
@Entity
@Table(name = "gift_item")
public class GiftItem implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "image")
    private String image;

    @Column(name = "price")
    private String price;

    @Column(name = "jhi_user")
    private String user;

    @Column(name = "expiration_date")
    private String expirationDate;

    @ManyToMany(mappedBy = "giftItems")
    @JsonIgnore
    private Set<Contributor> contributors = new HashSet<>();

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public GiftItem title(String title) {
        this.title = title;
        return this;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public GiftItem description(String description) {
        this.description = description;
        return this;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public GiftItem image(String image) {
        this.image = image;
        return this;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getPrice() {
        return price;
    }

    public GiftItem price(String price) {
        this.price = price;
        return this;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getUser() {
        return user;
    }

    public GiftItem user(String user) {
        this.user = user;
        return this;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public GiftItem expirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
        return this;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public Set<Contributor> getContributors() {
        return contributors;
    }

    public GiftItem contributors(Set<Contributor> contributors) {
        this.contributors = contributors;
        return this;
    }

    public GiftItem addContributors(Contributor contributor) {
        this.contributors.add(contributor);
        contributor.getGiftItems().add(this);
        return this;
    }

    public GiftItem removeContributors(Contributor contributor) {
        this.contributors.remove(contributor);
        contributor.getGiftItems().remove(this);
        return this;
    }

    public void setContributors(Set<Contributor> contributors) {
        this.contributors = contributors;
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
        GiftItem giftItem = (GiftItem) o;
        if (giftItem.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), giftItem.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "GiftItem{" +
            "id=" + getId() +
            ", title='" + getTitle() + "'" +
            ", description='" + getDescription() + "'" +
            ", image='" + getImage() + "'" +
            ", price='" + getPrice() + "'" +
            ", user='" + getUser() + "'" +
            ", expirationDate='" + getExpirationDate() + "'" +
            "}";
    }
}
