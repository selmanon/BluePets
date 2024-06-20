<p align="center">
  <img src="https://github.com/selmanon/BluePets/assets/2206036/3289251a-5ec3-45b1-b9a4-f4b36c97c1e6" width="50" title="Home screen">
</p>

## Objectifs

**Clean Architecture** : couches presentation, domain et data et injection de
dépendance. [ref](https://fernandocejas.com/2018/05/07/architecting-android-reloaded/)

**Tests unitaires** : avec Junit et Mokk.

**Gestion des flux de données** : Coroutine, Flow et Paging.

**Gestion de la vue** : Jetpack Compose (Dark/Night).

**Gestion de la navigation** : Jetpack Navigation.

## Decoupage de l'implementation

# Partie 1. Dev de la couche domaine

Le domaine est le coeur de l'application qui contient la logique et les règles métier. Il est donc
important que le domaine soit indépendant des autres modules et d'autres bibliothèques liées à l'UI,
à Android, ... Mais aussi que toutes les classes (sauf les modèles) et les méthodes publiques soient
testées.

# Partie 2. Dev de la couche donnees

La couche de données va permettre de récupérer et persister les données de l'application aux travers
de Repositories et des Data Sources qui peuvent être locales avec un BDD ou distantes avec une API.

# Partie 3. Dev de la couche presentation

Le rôle de l'UI est d'afficher les données de l'application à l'écran et de servir de point
principal d'interaction utilisateur. Le pattern utilisé est MVVM (Model - View - ViewModel)/UDF.

![image](https://github.com/selmanon/composeCleanArch/assets/2206036/6d5d69e3-8a1b-4ff0-ac7d-ccd5e1df9fad)

## Rendu de l'application

<p>
  <img src="https://github.com/selmanon/composeCleanArch/blob/master/screenshoots/home.png" width="250" title="Home screen">
  &nbsp; &nbsp; &nbsp; 
  <img src="https://github.com/selmanon/composeCleanArch/blob/master/screenshoots/post.png" width="250" alt="Pets screen">
 &nbsp; &nbsp; &nbsp; 
  <img src="https://github.com/selmanon/composeCleanArch/blob/master/screenshoots/error_screen.png" width="250" alt="Error screen">
</p>

# Points d'amélioration :

- TUs viewModel.
- Supporter le mode "offline first".
- Ajouter un bouton "retry" sur l'écran d'erreur de chargement de données. ✅
- Avoir un modue pour chaque couche. ✅
- Enlever la dépendance "material". (car elle est utilisée que pour le "pull-to-refrsh")  
- TUs pour le pagingSource. ✅
- Tests d'interface utilisateur.
- Gestion du scroll. ✅
- Ajouter le pull to refresh. ✅
- Enrichire l'UI/UX. _WIP_
- Enrichir la gestion des erreurs.
- Ajouter la navigation dans l'AppBar. ✅
- Ajouter un buildSrc module pour la gestion des versions (Android/release). ✅
- Configurer la CI.
