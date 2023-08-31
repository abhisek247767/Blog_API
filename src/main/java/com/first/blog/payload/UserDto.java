package com.first.blog.payload;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
//@Setter
//@Getter

public class UserDto {
	private int id;
	
	@NotNull
	@Size(min=4, message="username must be 4 letters")
	private String name;
	
	@Email(message="Valid Email adress provide")
	private String email;
	
	@NotEmpty
	@Size(min=4,max=12, message="pasword must be contains min-3 and max-12 letters")
	private String password;
	
	@NotNull
	private String about;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}
	
	

}
