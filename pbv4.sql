
--
-- Déchargement des données de la table `client`
--

INSERT INTO `client` (`id`, `mail`, `name`, `numero`, `prenom`, `telephone`) VALUES
(1, 'blabla@chuchu.fr', 'BLA', '12345678', 'Blah', '0147200001'),
(2, 'dearSanta@fromNorth.com', 'Panoel', '98765432', 'Petitpa', '0666666666'),
(3, 'avdv75@gmial.com', 'Vallette', '10000000', 'Arnaud', '0123456789'),
(4, 'badrdegtm@live.fr', 'Azeri', '20000000', 'Badr', '0198765432');

-- --------------------------------------------------------


--
-- Déchargement des données de la table `reponse`
--

INSERT INTO `reponse` (`id`, `commentaire`, `statut`, `id_client`, `id_sondage`) VALUES
(1, NULL, b'1', 4, 1),
(2, 'Je ne suis pas satisfait de votre service bancaire donc je ne compte pas souscrire à une assurance chez vous.', b'0', 3, 1),
(3, NULL, b'0', 1, 2),
(4, 'J\'en ai déjà par millier dans mon petit soulier.', b'0', 2, 2),
(5, NULL, b'1', 4, 2);

-- --------------------------------------------------------



--
-- Déchargement des données de la table `sondage`
--

INSERT INTO `sondage` (`id`, `dateDebut`, `dateFermeture`, `dateFin`) VALUES
(1, '2018-07-01', '2018-07-15', '2018-07-15'),
(2, '2018-05-02', '2018-07-30', '2018-07-27');





