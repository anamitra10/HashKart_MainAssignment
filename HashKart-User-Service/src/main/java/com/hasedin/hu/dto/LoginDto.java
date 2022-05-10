package com.hasedin.hu.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginDto {
	private String emailId;
	private String password;

}
