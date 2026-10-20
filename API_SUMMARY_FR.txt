| **Service**   | **Méthode** | **Endpoint**                                              | **Description**                                                                        |
| ------------- | ----------- | --------------------------------------------------------- | -------------------------------------------------------------------------------------- |
| **Facture**  | GET         | `/smartcity/factures/clients`                             | Récupère la liste complète de tous les clients.                                        |
| **Facture**  | GET         | `/smartcity/factures/clients/count`                       | Obtient le nombre total de clients enregistrés.                                        |
| **Facture**  | GET         | `/smartcity/factures/types`                               | Récupère les types de factures disponibles (ex: ELECT, EAU,PARKING).                   |
| **Facture**  | GET         | `/smartcity/factures/{type}`                              | Récupère toutes les factures pour un type spécifique (specifié en chemin).             |
| **Parking**   | GET         | `/smartcity/parking/etages`                               | Récupère la liste de tous les étages du parking.                                       |
| **Parking**   | GET         | `/smartcity/parking/etages/{labelEtage}`                  | Obtient les détails complets d'un étage spécifique via son libellé.                    |
| **Parking**   | GET         | `/smartcity/parking/etages/{labelEtage}/spots/{codeSpot}` | Obtient les détails d'une place de parking spécifique par son code et son étage.       |
| **Parking**   | POST        | `/smartcity/parking/reservation`                          | Crée une nouvelle réservation de place de parking. Retourne la facture associée.       |
| **Parking**   | GET         | `/smartcity/parking/reservations`                         | Récupère la liste de toutes les réservations de parking.                               |
| **Parking**   | GET         | `/smartcity/parking/reservations/{refClient}`             | Récupère les réservations de parking pour un client spécifique (par référence).        |
| **Parking**   | GET         | `/smartcity/parking/spots/empty`                          | Récupère la liste des étages contenant des places de parking libres (format détaillé). |
| **Parking**   | GET         | `/smartcity/parking/spots/empty/brief`                    | Récupère la liste des étages contenant des places de parking libres (format abrégé).   |
| **Transport** | GET         | `/smartcity/transport/lignes`                             | Récupère la liste de toutes les lignes de transport disponibles.                       |
| **Transport** | GET         | `/smartcity/transport/lignes/{codeLigne}/trajets`         | Récupère la liste des trajets associés à un code de ligne de transport spécifique.     |
| **Transport** | GET         | `/smartcity/transport/terminus`                           | Récupère la liste de tous les terminus de transport.                                   |