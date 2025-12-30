# exodusent_web

# 🍜 짜장면이 좋아? 짬뽕이 좋아? – 투표 웹 애플리케이션

간단한 투표 웹페이지를 구현하는 과제로,  
**서버–클라이언트 역할 분리**, **상태 변경과 조회 분리**, **기본적인 웹 구조 이해**를 목표로 개발했습니다.

---

## 📌 프로젝트 개요

- 사용자는 **짜장면 / 짬뽕 중 하나를 선택하여 투표**
- 투표 결과는 **서버에서 관리**
- 새로고침 시에도 **투표 결과 유지**
- 서버 배포까지 포함한 **실제 실행 가능한 서비스**

---

## 🔗 배포 주소

- 투표 페이지  
  👉 `http://{EC2_PUBLIC_IP}:8080/vote`
  

- 결과 페이지  
  👉 `http://{EC2_PUBLIC_IP}:8080/result`

---

## ⚙️ 기술 스택

### Backend
- **Java 17**
- **Spring Boot 3.2.1**
- **Spring MVC**
- **Spring Data JPA**
- **Hibernate**
- **HikariCP**

### Frontend
- **Thymeleaf**
- **HTML**

### Database
- **MySQL (AWS RDS)**
- 투표 결과 영속 저장

### Infra / DevOps
- **Docker**
- **AWS EC2 (Ubuntu 24.04 LTS)**
- **Docker Hub**
- **AWS Security Group**

---

## 🧱 프로젝트 구조

```text
src/main/java
└── com.example.exodusent_voteproject
    ├── controller   # 요청/응답 처리
    ├── service      # 비즈니스 로직
    ├── domain       # Entity
    └── exception    # Custom Exception
