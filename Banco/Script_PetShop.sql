CREATE TABLE produtos (
                codigo NUMERIC NOT NULL,
                Nome VARCHAR(100) NOT NULL,
                descricao VARCHAR(500),
                quantidade NUMERIC NOT NULL,
                valor_bruto NUMERIC NOT NULL,
                valor_venda NUMERIC NOT NULL,
                CONSTRAINT produtos_pk PRIMARY KEY (codigo)
);


CREATE TABLE produtos_vendidos (
                codigo NUMERIC NOT NULL,
                preco_vendido NUMERIC NOT NULL,
                quantidade_vendida NUMERIC NOT NULL,
                CONSTRAINT produtos_vendidos_pk PRIMARY KEY (codigo)
);


CREATE TABLE funcionarios (
                cpf NUMERIC NOT NULL,
                nome VARCHAR(100) NOT NULL,
                Sexo CHAR NOT NULL,
                dataDeNascimento DATE NOT NULL,
                endereco VARCHAR(200) NOT NULL,
                bairro VARCHAR(200) NOT NULL,
                cidade VARCHAR(200) NOT NULL,
                telefone NUMERIC NOT NULL,
                email VARCHAR(200),
                CONSTRAINT cpf PRIMARY KEY (cpf)
);


CREATE TABLE venda (
                nota NUMERIC NOT NULL,
                cpf NUMERIC NOT NULL,
                data_venda TIMESTAMP NOT NULL,
                codigo NUMERIC NOT NULL,
                CONSTRAINT venda_pk PRIMARY KEY (nota)
);

/*==================== FK ===============================================*/
ALTER TABLE produtos_vendidos ADD CONSTRAINT produtos_produtos_vendidos_fk
FOREIGN KEY (codigo)
REFERENCES produtos (codigo);

ALTER TABLE venda ADD CONSTRAINT produtos_vendidos_venda_fk
FOREIGN KEY (codigo)
REFERENCES produtos_vendidos (codigo);

ALTER TABLE venda ADD CONSTRAINT funcionarios_venda_fk
FOREIGN KEY (cpf)
REFERENCES funcionarios (cpf);

/*=========================== SELECT =============================*/
/* SELECT * FROM produtos;
SELECT * FROM funcionarios;
SELECT * FROM produtos_vendidos;
