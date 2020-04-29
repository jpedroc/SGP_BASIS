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

CREATE TABLE PROVA (
	ID NUMBER PRIMARY KEY,
	TITULO VARCHAR(80),
	PERCENTUAL_APROVACAO NUMBER(3)
);

CREATE TABLE QUESTAO (
	ID NUMBER PRIMARY KEY,
	DESCRICAO VARCHAR(400),
	ALTERNATIVA_1 VARCHAR(400),
	ALTERNATIVA_2 VARCHAR(400),
	ALTERANTIVA_3 VARCHAR(400),
	ALTERANTIVA_4 VARCHAR(400),
	ALTERANTIVA_5 VARCHAR(500),
	RESPOSTA NUMBER IN (1, 2, 3, 4),
	ID_SENIORIDADE NUMBER,
	ID_TIPO_QUESTAO NUMBER,
	FOREIGN KEY (ID_TIPO_QUESTAO) REFERENCES TIPO_QUESTAO(ID),
	FOREIGN KEY (ID_SENIORIDADE) REFERENCES SENIORIDADE(ID)
);

CREATE TABLE PROVA_QUESTAO (
	ID_PROVA NUMBER,
	ID_QUESTAO NUMBER,
	PRIMARY KEY(ID_PROVA, ID_QUESTAO),
	FOREIGN KEY(ID_PROVA) REFERENCES PROVA(ID),
	FOREIGN KEY(ID_QUESTAO) REFERENCES QUESTAO(ID)
);