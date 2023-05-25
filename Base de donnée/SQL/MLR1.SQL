# -----------------------------------------------------------------------------
#       TABLE : FormuleFidelisation
# -----------------------------------------------------------------------------

CREATE TABLE IF NOT EXISTS FormuleFidelisation
 (
   IDFormuleFidelisation INTEGER NOT NULL AUTO_INCREMENT ,
   NomFormuleFidelisation VARCHAR(255) NULL  ,
   DescriptionFormuleFidelisation VARCHAR(255) NULL  
   , PRIMARY KEY (IDFormuleFidelisation) 
 ) 
 comment = "";

# -----------------------------------------------------------------------------
#       TABLE : Client
# -----------------------------------------------------------------------------

CREATE TABLE IF NOT EXISTS Client
 (
   IDClient INTEGER NOT NULL AUTO_INCREMENT ,
   Nom VARCHAR(64) NULL  ,
   Prenom VARCHAR(64) NULL  ,
   AdresseMail VARCHAR(255) NULL  ,
   MotDePasse VARCHAR(255) NULL  ,
   Adresse VARCHAR(255) NULL  ,
   CodePostal INTEGER NULL  ,
   Ville VARCHAR(255) NULL  ,
   AdresseSiegeSocial VARCHAR(255) NULL  ,
   CodePostalSiegeSocial INTEGER NULL  ,
   VilleSiegeSocial VARCHAR(255) NULL  
   , PRIMARY KEY (IDClient) 
 ) 
 comment = "";

# -----------------------------------------------------------------------------
#       TABLE : Consommateur
# -----------------------------------------------------------------------------

CREATE TABLE IF NOT EXISTS Consommateur
 (
   IDConsommateur INTEGER NOT NULL AUTO_INCREMENT ,
   Nom VARCHAR(64) NULL  ,
   Prenom VARCHAR(64) NULL  ,
   AdresseMail VARCHAR(255) NULL  ,
   Adresse VARCHAR(255) NULL  ,
   CodePostal INTEGER NULL  ,
   Ville VARCHAR(255) NULL  
   , PRIMARY KEY (IDConsommateur) 
 ) 
 comment = "";

# -----------------------------------------------------------------------------
#       TABLE : PointDeVente
# -----------------------------------------------------------------------------

CREATE TABLE IF NOT EXISTS PointDeVente
 (
   IDPointDeVente INTEGER NOT NULL AUTO_INCREMENT ,
   IDFormuleFidelisation INTEGER NOT NULL  ,
   IDClient INTEGER NOT NULL  ,
   Adresse VARCHAR(255) NULL  ,
   CodePostal INTEGER NULL  ,
   Ville VARCHAR(255) NULL  ,
   NomPointDevente VARCHAR(255) NULL  
   , PRIMARY KEY (IDPointDeVente) 
 ) 
 comment = "";


# -----------------------------------------------------------------------------
#       CREATION DES REFERENCES DE TABLE
# -----------------------------------------------------------------------------


ALTER TABLE PointDeVente 
  ADD FOREIGN KEY FK_PointDeVente_FormuleFidelisation (IDFormuleFidelisation)
      REFERENCES FormuleFidelisation (IDFormuleFidelisation) ;


ALTER TABLE PointDeVente 
  ADD FOREIGN KEY FK_PointDeVente_Client (IDClient)
      REFERENCES Client (IDClient) ;

