CREATE TABLE CANDIDATO (
		ID NUMBER PRIMARY KEY,
		NOME VARCHAR(80),
		CPF VARCHAR(11),
		SENHA VARCHAR(20),
		EMAIL VARCHAR(80)
);

CREATE TABLE TIPO_QUESTAO (
	ID NUMBER PRIMARY KEY, 
	DESCRICAO VARCHAR(80)
);

CREATE TABLE SENIORIDADE (
	ID NUMBER PRIMARY KEY,
	DESCRICAO VARCHAR(80)
);