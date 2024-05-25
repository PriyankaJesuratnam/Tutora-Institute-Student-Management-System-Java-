# Tutora-Institute-Student-Management-System-Java-
Tutora Institute Student Management System (Java) 

# Tutora Institute Student Management System

## Overview

The Tutora Institute Student Management System is a comprehensive Java-based application designed to manage various aspects of student and employee interactions within an educational institute. The system includes distinct functionalities for students and employees, allowing for efficient management of courses, inquiries, registrations, and technical issues.

## Features

### Login
- Secure login for students and employees.
- Role-based access control to ensure appropriate permissions.

### Student Side
1. **Course Details**: View and manage course information.
2. **Examination Issue Inquiry**: Submit and track examination-related issues.
3. **Medical Inquiry**: Submit medical inquiries and documentation.
4. **Student Common Inquiry**: General inquiries related to student services.
5. **Student Registration**: Register for new courses or modify existing registrations.
6. **Student Page**: View personal information and academic records.
7. **Technical Issue Page**: Report and track technical issues.

### Employee Side
- Manage student records and inquiries.
- Update course information.
- Respond to student inquiries and issues.

## Installation

1. **Clone the repository:**
    ```bash
    git clone https://github.com/your-repo/Tutora-Institute-Student-Management-System.git
    ```
2. **Navigate to the project directory:**
    ```bash
    cd Tutora-Institute-Student-Management-System
    ```
3. **Compile the project:**
    ```bash
    javac -d bin src/*.java
    ```
4. **Run the application:**
    ```bash
    java -cp bin Main
    ```

## Project Structure

```
Tutora-Institute-Student-Management-System/
├── src/
│   ├── Main.java
│   ├── Login.java
│   ├── Student.java
│   ├── Employee.java
│   ├── CourseDetails.java
│   ├── ExaminationInquiry.java
│   ├── MedicalInquiry.java
│   ├── CommonInquiry.java
│   ├── StudentRegistration.java
│   ├── TechnicalIssue.java
│   └── DatabaseConnection.java
├── bin/
├── README.md
└── .gitignore
```

## Usage

1. **Login**
    - Run the application and enter your credentials.
    - Based on your role (student or employee), you will be directed to the appropriate dashboard.

2. **Student Dashboard**
    - **Course Details**: View available courses and details.
    - **Examination Inquiry**: Submit any examination-related issues for review.
    - **Medical Inquiry**: Submit and manage medical documentation and inquiries.
    - **Common Inquiry**: For general questions and support.
    - **Student Registration**: Register for new courses or update current registrations.
    - **Technical Issue**: Report any technical problems encountered.

3. **Employee Dashboard**
    - **Manage Students**: Access and update student records.
    - **Respond to Inquiries**: Address student inquiries and issues.
    - **Update Courses**: Modify course details and schedules.

## Contributing

1. **Fork the repository**
2. **Create a new branch:**
    ```bash
    git checkout -b feature-name
    ```
3. **Make your changes and commit them:**
    ```bash
    git commit -m "Add some feature"
    ```
4. **Push to the branch:**
    ```bash
    git push origin feature-name
    ```
5. **Create a new Pull Request**


