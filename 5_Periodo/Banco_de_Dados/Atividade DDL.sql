CREATE TABLE Cliente (
    id_cliente number(5) NOT NULL,
    nom_cliente varchar2(80),
    ind_sexo varchar2(1),
    num_telefone varchar2(11),
    des_endereco varchar2(30),
    CONSTRAINT pk_cliente PRIMARY KEY(id_cliente)
);

CREATE TABLE Pedido (
    num_pedido number(5) NOT NULL,
    dat_pedido date,
    tip_origem varchar2(1),
    id_cliente number(5) NOT NULL,
    CONSTRAINT pk_pedido PRIMARY KEY(num_pedido),
    CONSTRAINT fk_id_cliente FOREIGN KEY(id_cliente) REFERENCES Cliente(id_cliente)
);

CREATE TABLE Produto (
    id_produto number(5) NOT NULL,
    des_produto varchar2(40),
    qtd_estoque number(6,2),
    val_produto number(5,2),
    CONSTRAINT pk_produto PRIMARY KEY(id_produto)
);

CREATE TABLE Item_pedido (
    num_pedido number(5) NOT NULL,
    id_produto number(5) NOT NULL,
    qtd_produto_pedido number(6,2),
    CONSTRAINT fk_num_pedido FOREIGN KEY(num_pedido) REFERENCES Pedido(num_pedido),
    CONSTRAINT fk_id_produto FOREIGN KEY(id_produto) REFERENCES Produto(id_produto)
);