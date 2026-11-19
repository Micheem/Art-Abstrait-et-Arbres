/*
 * Generateur — stratégie 1 (celle de l'énoncé).
 *
 * À écrire :
 *  - attributs : paramètres, lignes du fichier, tas, compteur r
 *  - chooseLeaf() : la feuille de plus grand poids (via le tas)
 *  - chooseDivision(feuille) : axe (variante A ou B) + coordonnée
 *      axe X : x_r + floor(w * p_r)     axe Y : y_r + floor(h * q_r)
 *  - chooseColor(lettre, couleurParent) : 'm' = couleur du parent
 *  - generateTree() : renvoie un Arbre2D
 *
 * Déroulé de generateTree :
 *  1. racine blanche couvrant tout le tableau
 *  2. si elle est divisible, la mettre dans le tas
 *  3. tant que r < nbFeuillesAdiviser et tas non vide :
 *       chooseLeaf -> chooseDivision -> chooseColor -> diviser
 *       mettre dans le tas uniquement les fils divisibles ; r++
 *  4. renvoyer l'arbre
 *
 * Complexité : (à compléter pour chaque méthode)
 */
