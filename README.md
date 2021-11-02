#Spring Boot Book Seller

### Endpoints

#### Sign-Up

```
POST /api/authentication/sign-up HTTP/1.1
Host: localhost:8080
Content-Type: application/json

{
    "name": "user",
    "username": "user",
    "password": "user"
}
```

#### Sign-In

```
POST /api/authentication/sign-in HTTP/1.1
Host: localhost:8080
Content-Type: application/json

{
    "username": "user",
    "password": "user"
}

token: eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJ1c2VyIiwicm9sZXMiOiJST0xFX1VTRVIiLCJ1c2VySWQiOjEsImV4cCI6MTYzNTk2MjAwMH0.G353r3R44BGw0AKPW8eGKlY7-HT9qgQ5y_BjdvWi5hRAkpsZvHQsyYmVtKA2kCDBnuL7JCoUIbPDfeNH4zSc9A
```