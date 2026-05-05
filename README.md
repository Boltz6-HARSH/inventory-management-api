# Inventory Management API

A backend REST API built using Spring Boot to manage product inventory and track stock levels.

## 🚀 Features
- Add new products
- Retrieve all products
- Check low stock status
- Layered architecture (Controller → Service → Repository)

## 🛠 Tech Stack
- Java
- Spring Boot
- Spring Data JPA
- H2 Database

## 📡 API Endpoints

### 1. Add Product
POST /products

Request:
{
  "name": "Laptop",
  "quantity": 3,
  "price": 50000
}

### 2. Get All Products
GET /products

### 3. Check Low Stock
GET /products/{id}/low

## ▶️ Run Locally
1. Clone repo  
2. Open in VS Code / IntelliJ  
3. Run InventoryApplication.java  
4. Test using Postman  

## 📌 Future Improvements
- Add product categories
- Add search functionality
- Use MySQL instead of H2
