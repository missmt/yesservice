package com.tnourji.yesserivces.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name = "contributor_giftItem")
public class ContributorGiftItem implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @ManyToOne
    private Contributor contributor;
    
    @ManyToOne
    private GiftItem giftItem;
    
    @Column
    private Date creationDate;
    
    @Column
    private float amount;
    
    public Contributor getContributor() {
        return contributor;
    }
    
    public void setContributor(Contributor contributor) {
        this.contributor = contributor;
    }
    
    public GiftItem getGiftItem() {
        return giftItem;
    }
    
    public void setGiftItem(GiftItem giftItem) {
        this.giftItem = giftItem;
    }
    
    public Date getCreationDate() {
        return creationDate;
    }
    
    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }
    
    public float getAmount() {
        return amount;
    }
    
    public void setAmount(float amount) {
        this.amount = amount;
    }
    
}
