package com.vmx.h2manage.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.time.Instant;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(
        value = {"createTime", "updateTime"},
        allowGetters = true
)
public abstract class DateAudit implements Serializable {

    private static final long serialVersionUID = -4606983160626938083L;

    @CreatedDate
    @Column(nullable = false, updatable = false)
    private Instant createTime;

    @LastModifiedDate
    @Column(nullable = false)
    private Instant updateTime;

    public Instant getCreatedAt() {
        return createTime;
    }

    public void setCreatedAt(Instant createdAt) {
        this.createTime = createdAt;
    }

    public Instant getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Instant updatedAt) {
        this.updateTime = updatedAt;
    }
}