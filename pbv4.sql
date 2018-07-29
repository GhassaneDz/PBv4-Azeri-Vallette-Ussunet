
--
-- Déchargement des données de la table `client`
--

INSERT INTO `client` (`mail`, `nom`, `numero`, `prenom`, `telephone`) VALUES
('blabla@chuchu.fr', 'BLA', '12345678', 'Blah', '0147200001'),
('dearSanta@fromNorth.com', 'Panoel', '98765432', 'Petitpa', '0666666666'),
('avdv75@gmial.com', 'Vallette', '10000000', 'Arnaud', '0123456789'),
('badrdegtm@live.fr', 'Azeri', '20000000', 'Badr', '0198765432');

-- --------------------------------------------------------


--
-- Déchargement des données de la table `reponse`
--

INSERT INTO `reponse` (`commentaire`, `statut`, `id_client`, `id_sondage`) VALUES
(NULL, b'1', 4, 1),
('Je ne suis pas satisfait de votre service bancaire donc je ne compte pas souscrire à une assurance chez vous.', b'0', 3, 1),
( NULL, b'0', 1, 2),
('J\'en ai déjà par millier dans mon petit soulier.', b'0', 2, 2),
(NULL, b'1', 4, 2);

-- --------------------------------------------------------



--
-- Déchargement des données de la table `sondage`
--

INSERT INTO `sondage` (`dateDebut`, `dateFermeture`, `dateFin`) VALUES
('2018-07-01', '2018-07-15', '2018-07-15'),
('2018-05-02', '2018-07-30', '2018-07-27');





