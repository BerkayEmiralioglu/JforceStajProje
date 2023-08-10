package com.staj.proje.service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserService {
    private final Map<String, String> userCredentials = new HashMap();

    public UserService() {
        this.userCredentials.put("IKrole", "IK123");
        this.userCredentials.put("IMrole", "IM123");
        this.userCredentials.put("Admin", "Admin123");
    }

    public boolean authenticateUser(String username, String password) {
        String storedPassword = (String)this.userCredentials.get(username);
        return storedPassword != null && storedPassword.equals(password);
    }

    public boolean isUserInRole(String username, String role) {
        String storedRole = (String)this.userCredentials.get(username);
        return storedRole != null && storedRole.equals(role);
    }
}
