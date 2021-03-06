package org.wecancodeit.studentroster.model;

public class Student {
	
	private Long id;
	private String name;
	private String github;
	private String favoriteFood;

	public Student(Long id, String name, String github, String favoriteFood) {
		this.id = id;
		this.name = name;
		this.github = github;
		this.favoriteFood = favoriteFood;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getGithub() {
		return github;
	}

	public String getFavoriteFood() {
		return favoriteFood;
	}

}
