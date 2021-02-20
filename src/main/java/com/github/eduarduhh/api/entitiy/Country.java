package com.github.eduarduhh.api.entitiy;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pais")
public class Country {
	
	@Id
	private Long id;
	
	@Column(name = "nome")
	private String name;
	
	@Column(name = "nome_pt")
	private String porgueseName;
	
	@Column(name = "sigla")
	private String code;
	
	@Column(name = "bacen")
	private Integer bacen;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPorgueseName() {
		return porgueseName;
	}

	public void setPorgueseName(String porgueseName) {
		this.porgueseName = porgueseName;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Integer getBacen() {
		return bacen;
	}

	public void setBacen(Integer bacen) {
		this.bacen = bacen;
	}

	@Override
	public String toString() {
		return "Country [id=" + id + ", name=" + name + ", porgueseName=" + porgueseName + ", code=" + code + ", bacen="
				+ bacen + "]";
	}
		

}
