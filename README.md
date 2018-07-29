# ===================================================

# Bienvenue sur ProxiBanqueV4
* Date : 29/07/2018
* Créateurs : Badr Azeri, Quentin Ussunet, Arnaud Vallette

# Lancement de l'application

## Pré-requis :
Concernant le back :
* Avoir installé TomCat 8.5.31
* Avoir installé Maven
* Avoir télécharger le fichier **proxybankV4-azeri-ussunet-vallette.war**



## Procédure d'installation :

Pour le back-end :

* Récupérer **pbv4.sql** à la racine du dossier du projet
* créer une BDD **pbv4jpa** MySQL en encodage UTF8 moteur InnoDB
* user :"root", mot de passe :""
* déployer une première fois l'application sur TomCat, le schéma de BDD sera créé automatiquement.
* importer le fichier proxibanquejpa.sql dans la BDD
* Consulter le navigateur: localhost:8080/proxibanquev4/

Si vous voulez utilisez les WebServices vous pouvez déployé le projet Angular correspondant
[ProxyFront](https://github.com/AV-DV-87/proxyfront)


# Exemple d'utilisation

TODO modif cas d'utilisation de l'interface de Gestion des sondages :

### 1- Ouvrir un sondage :
Lamine ou Lamine LOLO - Zidane ou Zidane ZOZO - Fabien ou Fabien FOFO - Steven ou Steven SOSO
Date de naissance pour Lamine 01/04/1985

### 2- Consulter les détails d'un sondage :
Possibilité de voir le nombre de répondant (reponse négative et positive), le nombre de nouveau client, 

### 3 - Fermeture d'un sondage :
Possibilité de fermer un sondage si il est en cours.

# ===================================================
