package com.example.UserManagementSystem.models;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import org.springframework.format.annotation.NumberFormat;

@Data
public class User {

    @NumberFormat
    int userId;

    @Pattern(regexp ="^[A-Za-z][A-Za-z0-9_]{7,29}$")
    String userName;

    @Pattern(regexp ="^((19|2[0-9])[0-9]{2})-(0[1-9]|1[012])-(0[1-9]|[12][0-9]|3[01])$")
    String dateOfBirth;

    @Email
    String email;

    @Pattern(regexp="^\\d{2}\\d{10}$")
    String phoneNumber;

    String date;

    String time;
}
