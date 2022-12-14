package ru.kata.spring.boot_security.demo.services;

import ru.kata.spring.boot_security.demo.model.Role;

import java.util.Set;

public interface RoleService {

    void addRole(Role role);

    Role getRoleByName(String name);

    Set<Role> getRolesByName(Set<Role> roles);

    Set<Role> getAllRoles();
}
