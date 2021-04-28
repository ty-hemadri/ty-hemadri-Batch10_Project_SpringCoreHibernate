package com.te.springhibernate.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Entity
@Table(name = "movies")
@Data

public class Movies {
	@Id
	@Column
	private int mid;
	@Column
	private String mname;
	@Column
	private String mreview;
	@Column
	private double mrating;

}
