# SpringBootThymeleaf
Ce projet consiste à développer une application CRUD en Java avec Spring Boot et Thymeleaf, permettant la gestion des utilisateurs avec une interface web. L'application utilise également une base de données MySQL.

## Prérequis
Java Development Kit (JDK) 17 ou plus récent
Intillij IDE ou tout autre IDE compatible avec Maven
MySQL Server
Maven pour la gestion des dépendances
Pilote JDBC MySQL (mysql-connector-java)

## Structure du Projet:
Le projet suit une architecture en couches :
1. Packages utilisés
ma.thymeleaf.dem.model : Contient l'entité User représentant un utilisateur.
ma.thymeleaf.dem.repository : Contient le référentiel UserRepository pour les opérations CRUD.
ma.thymeleaf.dem.controller : Contient le contrôleur UserController pour gérer les requêtes HTTP et les vues.
Fonctionnalités Implémentées
Ajouter un utilisateur avec un nom et un email.
Modifier les informations d'un utilisateur existant.
Supprimer un utilisateur.
Afficher la liste des utilisateurs avec une interface web dynamique.

## Instructions:
1. Configuration MySQL.
-Créez une base de données MySQL nommée thymeleaf.
-Modifiez le fichier application.properties (dans src/main/resources).
2. Exécution du projet
-Importez le projet dans Eclipse :
-File → Import → Existing Maven Projects → Sélectionnez le répertoire du projet.
-Cliquez sur Run As → Spring Boot App pour démarrer l'application.
-Accédez à l'application via un navigateur à l'URL :
-http://localhost:8080/signup
3. Structure des Vues (Templates Thymeleaf)
-add-user.html : Formulaire pour ajouter un nouvel utilisateur.
-index.html : Liste des utilisateurs avec options pour les modifier ou les supprimer.

## Vidéo:
https://github.com/user-attachments/assets/8fe2e267-cc57-47da-9180-6bc225340a4f

## Auteur
Ce projet a été développé par Zaggar Driss.
