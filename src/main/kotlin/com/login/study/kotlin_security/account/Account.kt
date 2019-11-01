package com.login.study.kotlin_security.account

import org.hibernate.annotations.CreationTimestamp
import java.time.LocalDateTime
import javax.persistence.*

@Entity
data class Account(
        @Id @GeneratedValue
        var id: Long? = null,
        var email: String,
        var password: String,

        @Enumerated(EnumType.STRING)
        @ElementCollection(fetch = FetchType.EAGER)
        var roles: Set<AccountRole>,

        @CreationTimestamp
        var createDt: LocalDateTime = LocalDateTime.now()
)