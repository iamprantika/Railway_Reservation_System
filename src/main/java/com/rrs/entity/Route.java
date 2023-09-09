package com.rrs.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Route {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;
	
	 	@Column(length=50)
	    private String SourceName;
	    @Column(length=50)
	    private String DestinationName;

	    @OneToMany
	    private List<Train> trains; // foreign key


}
