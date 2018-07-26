-- phpMyAdmin SQL Dump
-- version 4.8.1
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1
-- Généré le :  jeu. 26 juil. 2018 à 15:14
-- Version du serveur :  10.1.33-MariaDB
-- Version de PHP :  7.2.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `pbv4`
--

-- --------------------------------------------------------

--
-- Structure de la table `client`
--

CREATE TABLE `client` (
  `id` int(11) NOT NULL,
  `mail` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `numero` varchar(255) DEFAULT NULL,
  `prenom` varchar(255) DEFAULT NULL,
  `telephone` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

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
-- Structure de la table `reponse`
--

CREATE TABLE `reponse` (
  `id` int(11) NOT NULL,
  `commentaire` varchar(255) DEFAULT NULL,
  `statut` bit(1) DEFAULT NULL,
  `id_client` int(11) DEFAULT NULL,
  `id_sondage` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

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
-- Structure de la table `sondage`
--

CREATE TABLE `sondage` (
  `id` int(11) NOT NULL,
  `dateDebut` date DEFAULT NULL,
  `dateFermeture` date DEFAULT NULL,
  `dateFin` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `sondage`
--

INSERT INTO `sondage` (`id`, `dateDebut`, `dateFermeture`, `dateFin`) VALUES
(1, '2018-07-01', '2018-07-15', '2018-07-15'),
(2, '2018-05-02', '2018-07-30', '2018-07-27');

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `client`
--
ALTER TABLE `client`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `reponse`
--
ALTER TABLE `reponse`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKi7mxcds5nwa3y6ajibe4jnuqn` (`id_client`),
  ADD KEY `FK7i03lnt5xdjyqvh2gsxqfm2em` (`id_sondage`);

--
-- Index pour la table `sondage`
--
ALTER TABLE `sondage`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT pour les tables déchargées
--

--
-- AUTO_INCREMENT pour la table `client`
--
ALTER TABLE `client`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT pour la table `reponse`
--
ALTER TABLE `reponse`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT pour la table `sondage`
--
ALTER TABLE `sondage`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- Contraintes pour les tables déchargées
--

--
-- Contraintes pour la table `reponse`
--
ALTER TABLE `reponse`
  ADD CONSTRAINT `FK7i03lnt5xdjyqvh2gsxqfm2em` FOREIGN KEY (`id_sondage`) REFERENCES `sondage` (`id`),
  ADD CONSTRAINT `FKi7mxcds5nwa3y6ajibe4jnuqn` FOREIGN KEY (`id_client`) REFERENCES `client` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
