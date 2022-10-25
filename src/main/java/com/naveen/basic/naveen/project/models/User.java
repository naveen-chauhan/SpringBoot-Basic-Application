package com.naveen.basic.naveen.project.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author naveen.chauhan on 25/10/22
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="user_details")
public class User {
    @Id
	private int id;

	private String username;

	private String password;

	private String email;

}
