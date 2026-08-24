package com.cl.contacthub.entites;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ContactHub {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long contactHubID;
    private String firstName;
    private String lastName;
    private String email;
    private String address;
    private String contactNumber;

    @Lob
    private byte[] profilePhoto;
}
