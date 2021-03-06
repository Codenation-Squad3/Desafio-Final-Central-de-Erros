package br.com.codenation.desafio.model;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.validation.annotation.Validated;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Entity
@Builder
@Validated
@NoArgsConstructor
@AllArgsConstructor
@Table(name="users")
@EntityListeners(AuditingEntityListener.class)
public class User {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    private UUID id;

    @NotNull
    @Size(min = 3, max = 120)
    private String nome;

    @NotNull
    @Email
    @Column(unique = true)
    @Size(min = 5, max = 60)
    private String email;

    @NotNull
    private String password;

    private String token;

    @JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
    @Column(name ="user_id")
	private List<Log> logs;

	@NotNull
	@CreatedDate
	@Column(columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	private LocalDateTime createdAt;

}
