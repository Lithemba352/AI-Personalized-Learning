# Documentation
```
openapi: 3.0.0
info:
  title: AI-Personalised Learning API
  description: API for managing courses, enrollments, and users in an AI-powered learning platform
  version: 1.0.0
servers:
  - url: http://localhost:8080
    description: Local development server
paths:
  /api/courses:
    post:
      tags:
        - Courses
      summary: Publish a new course
      requestBody:
        required: true
        content:
          application/json:
            schema:
              $ref: '#/components/schemas/Course'
      responses:
        '200':
          description: Course published successfully
          content:
            application/json:
              schema:
                $ref: '#/components/schemas/Course'
        '400':
          description: Invalid course data
          content:
            application/json:
              schema:
                $ref: '#/components/schemas/Error'
    put:
      tags:
        - Courses
      summary: Update an existing course
      parameters:
        - name: id
          in: path
          required: true
          schema:
            type: string
      requestBody:
        required: true
        content:
          application/json:
            schema:
              $ref: '#/components/schemas/Course'
      responses:
        '200':
          description: Course updated successfully
          content:
            application/json:
              schema:
                $ref: '#/components/schemas/Course'
        '404':
          description: Course not found
          content:
            application/json:
              schema:
                $ref: '#/components/schemas/Error'

  /api/enrollments:
    post:
      tags:
        - Enrollments
      summary: Enroll a user in a course
      parameters:
        - name: userId
          in: query
          required: true
          schema:
            type: string
        - name: courseId
          in: query
          required: true
          schema:
            type: string
      responses:
        '200':
          description: Enrollment successful
          content:
            application/json:
              schema:
                $ref: '#/components/schemas/Enrollment'
        '400':
          description: Bad request (e.g., user already enrolled in 5 courses)
          content:
            application/json:
              schema:
                $ref: '#/components/schemas/Error'
    delete:
      tags:
        - Enrollments
      summary: Cancel an enrollment
      parameters:
        - name: enrollmentId
          in: path
          required: true
          schema:
            type: string
      responses:
        '200':
          description: Enrollment cancelled successfully
        '404':
          description: Enrollment not found
          content:
            application/json:
              schema:
                $ref: '#/components/schemas/Error'

  /api/user/register:
    post:
      tags:
        - Users
      summary: Register a new user
      requestBody:
        required: true
        content:
          application/json:
            schema:
              $ref: '#/components/schemas/User'
      responses:
        '200':
          description: User registered successfully
          content:
            application/json:
              schema:
                $ref: '#/components/schemas/User'
        '400':
          description: Invalid user data
          content:
            application/json:
              schema:
                $ref: '#/components/schemas/Error'

  /api/user/login:
    post:
      tags:
        - Users
      summary: Login a user
      parameters:
        - name: email
          in: query
          required: true
          schema:
            type: string
        - name: password
          in: query
          required: true
          schema:
            type: string
      responses:
        '200':
          description: Login successful
          content:
            application/json:
              schema:
                $ref: '#/components/schemas/User'
        '401':
          description: Unauthorized (invalid credentials)
          content:
            application/json:
              schema:
                $ref: '#/components/schemas/Error'

  /api/user/profile:
    put:
      tags:
        - Users
      summary: Update user profile
      requestBody:
        required: true
        content:
          application/json:
            schema:
              $ref: '#/components/schemas/User'
      responses:
        '200':
          description: Profile updated successfully
        '404':
          description: User not found
          content:
            application/json:
              schema:
                $ref: '#/components/schemas/Error'

components:
  schemas:
    Course:
      type: object
      properties:
        id:
          type: string
          example: "course123"
        title:
          type: string
          example: "Introduction to AI"
        description:
          type: string
          example: "Learn the basics of Artificial Intelligence"
        duration:
          type: integer
          example: 30
        difficulty:
          type: string
          example: "Beginner"
      required:
        - title
        - description

    Enrollment:
      type: object
      properties:
        enrollmentId:
          type: string
          example: "enroll456"
        userId:
          type: string
          example: "user789"
        courseId:
          type: string
          example: "course123"
        status:
          type: string
          example: "Active"
        enrolledDate:
          type: string
          format: date-time
          example: "2023-10-15T09:30:00Z"
      required:
        - userId
        - courseId

    User:
      type: object
      properties:
        id:
          type: string
          example: "user789"
        name:
          type: string
          example: "John Doe"
        email:
          type: string
          example: "john@example.com"
        password:
          type: string
          example: "securepassword123"
        role:
          type: string
          example: "student"
      required:
        - name
        - email
        - password

    Error:
      type: object
      properties:
        timestamp:
          type: string
          format: date-time
          example: "2023-10-15T10:15:30Z"
        status:
          type: integer
          example: 400
        error:
          type: string
          example: "Bad Request"
        message:
          type: string
          example: "User cannot be enrolled in more than 5 courses"

        path:
          type: string
          example: "/api/enrollments"
```
# Screenshoot for swagger
![Screenshot 2025-05-05 030846](https://github.com/user-attachments/assets/d3d481ec-9cfb-42f9-bd2d-c9cd141c5d52)
