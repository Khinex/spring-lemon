package com.naturalprogrammer.spring.lemondemo.dto;

import java.util.HashSet;
import java.util.Set;

import org.bson.types.ObjectId;

import com.naturalprogrammer.spring.lemondemo.domain.User.Tag;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class TestUserDto {

	private ObjectId id;
	private String username;
	private String password;
	private Set<String> roles = new HashSet<String>();
	private Tag tag;
	
	private boolean unverified = false;
	private boolean blocked = false;
	private boolean admin = false;
	private boolean goodUser = false;
	private boolean goodAdmin = false;
}
