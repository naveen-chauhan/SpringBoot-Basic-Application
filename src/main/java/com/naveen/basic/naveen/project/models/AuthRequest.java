package com.naveen.basic.naveen.project.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author naveen.chauhan on 25/10/22
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuthRequest {
   private String username;

   private String password;
}
