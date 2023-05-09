package com.victordev.dslist.entities;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb-game")
public class Game {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private Long id;
	private String title;
	
	@Column(name = "game_year")
	private Integer year;
	private String genre;
	private String plalforms;
	private Double score;
	private String imgUrl;
	private String shortDrescription;
	private String longtDrescription;
	
	public Game() {
		
	}

	public Game(Long id, String title, Integer year, String genre, String plalforms, Double score, String imgUrl,
			String shortDrescription, String longtDrescription) {
		this.id = id;
		this.title = title;
		this.year = year;
		this.genre = genre;
		this.plalforms = plalforms;
		this.score = score;
		this.imgUrl = imgUrl;
		this.shortDrescription = shortDrescription;
		this.longtDrescription = longtDrescription;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getPlalforms() {
		return plalforms;
	}

	public void setPlalforms(String plalforms) {
		this.plalforms = plalforms;
	}

	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public String getShortDrescription() {
		return shortDrescription;
	}

	public void setShortDrescription(String shortDrescription) {
		this.shortDrescription = shortDrescription;
	}

	public String getLongtDrescription() {
		return longtDrescription;
	}

	public void setLongtDrescription(String longtDrescription) {
		this.longtDrescription = longtDrescription;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Game other = (Game) obj;
		return Objects.equals(id, other.id);
	}
	
	
}
