package com.bod.bod.user.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Getter;

@Getter
public class EditPasswordRequestDto {

	@NotBlank(message = "Old password is mandatory")
	private String oldPassword;

	@NotBlank(message = "New password is mandatory")
	@Size(min = 8, max = 15, message = "Password must be between 8 and 15 characters")
	@Pattern(
		regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,15}$",
		message = "Password must contain at least one uppercase letter, one lowercase letter, one number, and one special character"
	)
	private String newPassword;
}
