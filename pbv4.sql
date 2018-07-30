--
-- Déchargement des données de la table `client`
--

INSERT INTO `client` (`mail`, `nom`, `numero`, `prenom`, `telephone`) VALUES
('fabien@orange.com', 'USSUNET', '12345678', 'Quentin', '0147200001'),
('Hugo@gmail.fr', 'Panoel', '98765432', 'Petitpa', '0682894761'),
('mendy@bbox.fr', 'Vallette', '10000000', 'Arnaud', '0123456789'),
('fafa@yahoo.fr', 'ROMAN', '20000000', 'Steven', '0198765432');

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
('2018-07-01', NULL, '2018-08-15'),
('2018-05-02', '2018-07-20', '2018-07-27');





