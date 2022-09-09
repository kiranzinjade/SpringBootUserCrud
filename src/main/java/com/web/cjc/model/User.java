package com.web.cjc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Table(name = "user_data")
@Entity
public class User {

	@Id
	@Column(name = "uset_id")
    private	Long uid;
	@Column(name = "user_name")
	private String uname;
	@Column(name = "user_Adhar")
	private Double userAdhar;
}
