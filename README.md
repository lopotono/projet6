Cette application est un site web sur le thème de l'escalade. Le visiteur du site peut consulter les sites d'escalade existants. 
Il peut également ajouter un commentaire pour donner son avis sur un des sites d'escalade.

Les utilisateurs inscrits dans la base de données peuvent, en plus de consulter et ajouter des commentaires sur les sites d'escalade, rajouter des sites d'escalade, des topos, des secteurs, des voies, des longueurs. 
Ils pourront emprunter un ou plusieurs topos disponibles pour une durée d'un mois.


* Configuration du serveur Tomcat :

La configuration du serveur s'effectue dans l'IDE Eclipse ; Configuration du path ; Configuration du Server Runtime Environnement : Apache Tomcat v8.5 et récupération du fichier d'installation Tomcat à la racine du disque dur de l'ordinateur. Le serveur est déployé en local sur le port http://localhost:8080.
  
  
* Déploiement de l'application :

Compilation des sources du projet avec la commande en console mvn compile.
Génération d'un fichier WAR pour le déploiement de l'application web.
Ajout du plugin maven-war-plugin dans le pom.xml parent du projet. On pourra réaliser un export pour créer un fichier WAR sous l'IDE Eclipse ou packager en ligne de commande dans la console : mvn package.
Les codes source de l'application se situent pour chaques modules dans src/main/java.

La base de données nommée db_escalade est stockée sur le serveur pgadminIII. URL : jdbc:postgresql://localhost:5432/db_escalade
