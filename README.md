# 💼 Job Tracker Project

A full-stack web application that helps job seekers manage and track their job applications. Built with **Spring Boot**, **MongoDB**, and a responsive **React + Vite + TailwindCSS** frontend.

---

## ✨ Features

- 🧑‍💻 Candidate Sign Up / Login (JWT based)
- 📝 Create, Read, Delete Job Applications
- 📬 Filter jobs by email (track candidate's applications)
- 🔐 Backend security with Spring Security
- 🌍 MongoDB Atlas integration
- ⚡ Responsive UI (in frontend repo)

---

## 🧠 Tech Stack

### Frontend
![React](https://img.shields.io/badge/React-20232a?style=for-the-badge&logo=react&logoColor=61DAFB)
![TailwindCSS](https://img.shields.io/badge/TailwindCSS-38bdf8?style=for-the-badge&logo=tailwindcss&logoColor=white)
![Axios](https://img.shields.io/badge/Axios-5A29E4?style=for-the-badge&logo=axios&logoColor=white)
![Vite](https://img.shields.io/badge/Vite-646CFF?style=for-the-badge&logo=vite&logoColor=white)

### Backend
![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white)
![MongoDB](https://img.shields.io/badge/MongoDB-4EA94B?style=for-the-badge&logo=mongodb&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white)
![JWT](https://img.shields.io/badge/JWT-black?style=for-the-badge&logo=JSON%20web%20tokens)

---

## 📁 Folder Structure

```bash
job-tracker-project/
├── backendjobtracer/         # Spring Boot Backend
│   ├── src/
│   │   └── main/
│   │       ├── java/
│   │       │   └── com/anudeep/jobquestbackend/
│   │       │       ├── CandidateController.java
│   │       │       ├── CandidateService.java
│   │       │       ├── JobController.java
│   │       │       ├── JobService.java
│   │       │       ├── JwtTokenProvider.java
│   │       │       ├── SecurityConfig.java
│   │       │       └── ...
│   │       └── resources/
│   │           └── application.properties
│   ├── pom.xml
│   └── README.md

├── jobquest-frontend/        # React Frontend (Vite + Tailwind)
│   ├── public/
│   ├── src/
│   │   ├── components/
│   │   ├── pages/
│   │   ├── services/
│   │   ├── App.jsx
│   │   ├── main.jsx
│   │   └── index.css
│   ├── package.json
│   └── vite.config.js
