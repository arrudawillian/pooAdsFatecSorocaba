--
--    Arquivo: BD_PROJETO.sql
--       Data: 01/12/16
-- Finalidade: Criar as tabelas referentes ao projeto de POO
--

--
-- Criando as tabelas
--

CREATE TABLE TBCANDIDATO(
INSCRICAO VARCHAR2(10) CONSTRAINT PK_INSCRICAO PRIMARY KEY,
CPF VARCHAR2(11),
NOME VARCHAR2(30),
ENDERECO VARCHAR2(30),
TELEFONE VARCHAR2(14),
EMAIL VARCHAR2(30),
MEDIA NUMBER(2,2));

CREATE TABLE TBFISCAL(
CODIGO VARCHAR2(10) CONSTRAINT PK_COD_FISCAL PRIMARY KEY,
CPF VARCHAR2(11),
NOME VARCHAR2(30),
ENDERECO VARCHAR2(30),
TELEFONE VARCHAR2(14),
EMAIL VARCHAR2(30),
LOCALI VARCHAR2(30));

CREATE TABLE TBCONCURSO(
SIGLA VARCHAR2(5) CONSTRAINT PK_TBCONCURSO PRIMARY KEY,
DESCRICAO VARCHAR2(50),
DATAREALIZACAO DATE,
TAXAINSCRICAO NUMBER(4,2));

ALTER TABLE TBFISCAL ADD (SIGLA VARCHAR2(5));
ALTER TABLE TBFISCAL ADD CONSTRAINT FK_SIGLA FOREIGN KEY (SIGLA) REFERENCES TBCONCURSO(SIGLA);

--
-- Inserindo dados
--

INSERT INTO TBCANDIDATO VALUES ('100','37587314881','Alice Silva','Alameda das Bromelias','(15)3245-6948','alisil@gmail.com','');
INSERT INTO TBCANDIDATO VALUES ('101','37587314881','Bruno Ferreira','Av. das Nações','(15)3222-1563','brufer@gmail.com','');
INSERT INTO TBCANDIDATO VALUES ('102','37587314881','Carlos Torres','Rua Bolivia','(15)3202-9265','cator@gmail.com','');
INSERT INTO TBCANDIDATO VALUES ('103','37587314881','Danilo Almeida','Rua Erasmo Braga','(15)3031-3647','danal@gmail.com','');
INSERT INTO TBCANDIDATO VALUES ('104','37587314881','Fernanda Kriguer','Av. Sorocaba','(15)3123-5746','ferkri@gmail.com','');

INSERT INTO TBFISCAL VALUES ('200','37587314881','Guilherme Pereira','Av. dos Estados','(11)4222-5556','guipe@gmail.com','São Paulo','');
INSERT INTO TBFISCAL VALUES ('201','37587314881','Helen Santos','Rua Sete de Setembro','(15)3031-1692','helsa@gmail.com','Sorocaba','');
INSERT INTO TBFISCAL VALUES ('202','37587314881','Ingrid Oliveira','Rua da Amizade','(14)3832-7643','ingol@gmail.com','Botucatu','');
INSERT INTO TBFISCAL VALUES ('203','37587314881','João Camargo','Rua Pelourinho','(15)3222-6556','jocam@gmail.com','Sorocaba','');
INSERT INTO TBFISCAL VALUES ('204','37587314881','Keren Ferreira','Av. dos Bandeirantes','(15)3221-5990','kefer@gmail.com','Sorocaba','');
INSERT INTO TBFISCAL VALUES ('205','37587314881','Léia Almeida','Av. São Paulo','(31)99911-1566','leial@gmail.com','Belo Horizonte','');
INSERT INTO TBFISCAL VALUES ('206','37587314881','Monica Cabral','Av. Brasil','(21)99237-5300','monca@gmail.com','Rio de Janeiro','');
INSERT INTO TBFISCAL VALUES ('207','37587314881','Nice Pires','Av. Ipanema','(15)3230-7000','nipir@gmail.com','Sorocaba','');
INSERT INTO TBFISCAL VALUES ('208','37587314881','Otavio Souza','Av. São João','(15)3242-9087','otaso@gmail.com','Votorantim','');

INSERT INTO TBCONCURSO VALUES ('TRE','Tribunal Regional Eleitoral','19/12/16',80.50);
INSERT INTO TBCONCURSO VALUES ('PFR','Policia Federal Rodoviária','20/01/17',60);
INSERT INTO TBCONCURSO VALUES ('TCE','Tribunal de Contas do Estado','15/3/17',50);
INSERT INTO TBCONCURSO VALUES ('SAAE','SAAE Sorocaba','28/06/17',77);
INSERT INTO TBCONCURSO VALUES ('PMS','Prefeitura Municipal de Sorocaba','05/02/17',38);

-- *
-- * Fim deste script
-- *
