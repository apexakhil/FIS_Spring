package com.fis.empcatalog;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
class Emp {

	public Emp(String name) {
		this.name = name;
	}

	@Id
	@GeneratedValue
	private Long id;

	private String name;
}