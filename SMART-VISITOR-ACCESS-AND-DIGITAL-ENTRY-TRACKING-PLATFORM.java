// Page navigation
const navLinks = document.querySelectorAll('.nav-link');
const pages = document.querySelectorAll('.page');
navLinks.forEach(link => {
  link.addEventListener('click', (e) => {
    e.preventDefault();
    navLinks.forEach(l => l.classList.remove('active'));
    pages.forEach(p => p.classList.remove('active'));
    link.classList.add('active');
    document.querySelector(link.getAttribute('href')).classList.add('active');
    if (link.getAttribute('href') === '#dashboard') loadVisitors();
  });
});

const API_BASE = "http://localhost:8081"; 
// Visitor Registration
document.getElementById('visitorForm').addEventListener('submit', async (e) => {
  e.preventDefault();
  const data = {
    name: document.getElementById('name').value,
    phoneNumber: document.getElementById('phone').value,
    email: document.getElementById('email').value,
    address: document.getElementById('address').value,
    purpose: document.getElementById('purpose').value,
    hostName: document.getElementById('personToMeet').value
  };
// WebConfig.java
package com.example.visitor_management_backend.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("http://127.0.0.1:5500", "http://localhost:5500")
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
                .allowedHeaders("*");
    }
}
/* style.css */
* {
  margin: 0;
  padding: 0;
  box-sizing: border-box;
  font-family: 'Segoe UI', sans-serif;
}

body {
  background: #ffffff;
  color: #0a1f44;
}

.navbar {
  background: #0a1f44;
  color: #ffffff;
  padding: 15px 30px;
  display: flex;
  justify-content: space-between;
  align-items: center;
  flex-wrap: wrap;
}

.navbar h2 {
  color: #ffffff;
}

.navbar nav a {
  color: #ffffff;
// Visitor.java
package com.example.visitor_management_backend.model;

import jakarta.persistence.*;

@Entity
@Table(name = "visitors")
public class Visitor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String phoneNumber;
    private String purpose;
    private String hostName;
    private String status;

    public Visitor() {}

    public Visitor(String name, String phoneNumber, String purpose, String hostName) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.purpose = purpose;
        this.hostName = hostName;
        this.status = "Checked In";
    }
# application.properties
spring.datasource.url=jdbc:postgresql://localhost:5432/visitor_management
spring.datasource.username=postgres
spring.datasource.password=idontknow

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
server.port=8081
<!-- index.html -->

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Visitor Management System</title>
<link rel="stylesheet" href="style.css">
</head>
<body>

<header class="navbar">
<h2>Visitor Management System</h2>
<nav>
<a href="#register" class="nav-link active">Register</a>
<a href="#login" class="nav-link">Admin Login</a>
<a href="#dashboard" class="nav-link">Dashboard</a>
</nav>
</header>

<!-- Visitor Registration -->
<section id="register" class="page active">
<div class="card">
<h3>Visitor Registration</h3>
<form id="visitorForm">
<input type="text" id="name" placeholder="Name" required>
<input type="tel" id="phone" placeholder="Phone Number" required>
<input type="email" id="email" placeholder="Email" required>
<input type="text" id="address" placeholder="Address" required>





