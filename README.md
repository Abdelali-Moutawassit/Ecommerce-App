# 🛍️ E-Commerce App

## 🌟 Introduction
Bienvenue dans l'application **E-Commerce** 🛒, une plateforme moderne développée avec **Spring Boot** pour le backend et **Angular** pour le frontend. Cette application offre une expérience utilisateur fluide et performante pour la gestion des achats en ligne.

---

## 🚀 Technologies Utilisées
### 🔧 Backend (Spring Boot)
- 🏗️ **Spring Boot** (REST API, MVC)
- 🔗 **Spring Security** (Authentification & Autorisation)
- 🗄️ **Spring Data JPA** (Gestion des bases de données)
- 🏬 **Hibernate** (ORM)
- 🛢️ **PostgreSQL / MySQL** (Base de données)
- 🌐 **Swagger** (Documentation API)
- 📨 **JWT Token** (Sécurité des utilisateurs)

### 🎨 Frontend (Angular)
- 🅰️ **Angular** (Framework frontend moderne)
- 🎭 **Bootstrap / Tailwind CSS** (Stylisation responsive)
- 📦 **RxJS** (Programmation réactive)
- 🔥 **NgRx** (Gestion d'état)
- 🛠️ **Angular Material** (UI Components)

---

## 📂 Architecture du Projet
```
📦 ecommerce-app
├── 📁 backend (Spring Boot)
│   ├── 📁 src/main/java/com/ecommerce
│   ├── 📁 src/main/resources
│   ├── 📜 pom.xml (Maven Dependencies)
│   └── 📜 application.properties
│
├── 📁 frontend (Angular)
│   ├── 📁 src/app
│   ├── 📁 src/assets
│   ├── 📜 package.json
│   ├── 📜 angular.json
│   └── 📜 tsconfig.json
│
└── 📜 README.md (Ce fichier)
```

---

## 🎯 Fonctionnalités Clés
✅ Authentification et Autorisation (JWT, OAuth2) 🔑  
✅ Gestion des Produits et Catégories 🏷️  
✅ Gestion du Panier et Commandes 🛒  
✅ Système de Paiement (Stripe, PayPal) 💳  
✅ Gestion des Utilisateurs & Rôles 👥  
✅ Recherche et Filtres Avancés 🔍  
✅ Notifications et Emailing 📩  
✅ Tableau de Bord Administratif 📊  

---

## 🔥 Installation et Démarrage
### 📌 Backend (Spring Boot)
1. Cloner le repo :
   ```bash
   git clone https://github.com/votre-repo/ecommerce-app.git
   ```
2. Accéder au dossier backend :
   ```bash
   cd ecommerce-app/backend
   ```
3. Construire et exécuter l'application :
   ```bash
   mvn clean install
   mvn spring-boot:run
   ```

### 📌 Frontend (Angular)
1. Accéder au dossier frontend :
   ```bash
   cd ../frontend
   ```
2. Installer les dépendances :
   ```bash
   npm install
   ```
3. Lancer l'application :
   ```bash
   ng serve --open
   ```

---

## 📜 API Endpoints
| Endpoint | Méthode | Description |
|----------|---------|-------------|
| `/api/auth/signup` | POST | Inscription utilisateur |
| `/api/auth/login` | POST | Connexion utilisateur |
| `/api/products` | GET | Récupérer tous les produits |
| `/api/products/{id}` | GET | Détails d'un produit |
| `/api/orders` | POST | Créer une commande |

---

## 🎨 Captures d'Écran
| 🏠 Accueil | 🛒 Panier | 📦 Produits |
|---|---|---|
| ![Home](https://via.placeholder.com/200) | ![Cart](https://via.placeholder.com/200) | ![Products](https://via.placeholder.com/200) |

---

## 🏆 Contributions
Les contributions sont les bienvenues ! 🙌
- Forkez le projet 🍴
- Créez une branche feature 🚀
- Proposez une PR 🎉


