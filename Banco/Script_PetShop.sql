/*======================= CRIAÇÃO TABELA ============================================*/
CREATE TABLE produtos (
                codigo NUMERIC NOT NULL,
                Nome VARCHAR(100) NOT NULL,
                descricao VARCHAR(500),
                quantidade NUMERIC NOT NULL,
                valor_bruto NUMERIC NOT NULL,
                valor_venda NUMERIC NOT NULL,
                CONSTRAINT produtos_pk PRIMARY KEY (codigo)
);

CREATE TABLE funcionarios (
                cpf VARCHAR(14) NOT NULL,
                nome VARCHAR(100) NOT NULL,
                Sexo CHAR NOT NULL,
                endereco VARCHAR(200) NOT NULL,
                bairro VARCHAR(200) NOT NULL,
                cidade VARCHAR(200) NOT NULL,
                email VARCHAR(200),
                CONSTRAINT cpf PRIMARY KEY (cpf)
);

/*=========================== SELECT =============================*/
/* SELECT * FROM produtos;
SELECT * FROM funcionarios;
