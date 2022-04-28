-- Alterações de preparo da tabela
TRUNCATE TABLE Cliente;
TRUNCATE TABLE Pedido;
TRUNCATE TABLE Item_Pedido;
TRUNCATE TABLE Produto;

ALTER TABLE Cliente DROP COLUMN dat_nascimento;
ALTER TABLE Cliente MODIFY (des_endereco VARCHAR2(30));
ALTER TABLE Item_Pedido ADD (qtd_produto_pedido NUMBER(6,2));
ALTER TABLE Produto MODIFY (val_produto NUMBER(5,2));
ALTER TABLE Produto DROP COLUMN tip_unidade;

-- Incerts

-- Cliente
INSERT INTO Cliente
(id_cliente, nom_cliente, ind_sexo, num_telefone, des_endereco)
VALUES(1, 'ANA', 'F', NULL, NULL);

INSERT INTO Cliente
(id_cliente, nom_cliente, ind_sexo, num_telefone, des_endereco)
VALUES(2, 'EDSON', 'M', NULL, 'AV CELSO GARCIA CID, 165');

INSERT INTO Cliente
(id_cliente, nom_cliente, ind_sexo, num_telefone, des_endereco)
VALUES(3, 'MARIA RITA', 'F', 999141298, 'RUA SANTOS, 380');

-- Produto

ALTER TABLE produto
MODIFY (val_produto number(6,2));

INSERT INTO produto
(id_produto, des_produto, qtd_estoque, val_produto)
VALUES(1, 'Notebook Gamer', 500, 5100);

INSERT INTO produto
(id_produto, des_produto, qtd_estoque, val_produto)
VALUES(2, 'Fone de Ouvido Gamer', 300, 231);

INSERT INTO produto
(id_produto, des_produto, qtd_estoque, val_produto)
VALUES(3, 'Lava-Louças', 10, 2100);

-- Pedido

ALTER TABLE pedido MODIFY (tip_origem varchar2(3));

INSERT INTO pedido
(num_pedido, dat_pedido, tip_origem, id_cliente)
VALUES(1001, '12/02/21', 'BAL', 1);

INSERT INTO pedido
(num_pedido, dat_pedido, tip_origem, id_cliente)
VALUES(1002, '11/02/21', 'WEB', 1);

INSERT INTO pedido
(num_pedido, dat_pedido, tip_origem, id_cliente)
VALUES(1003, '19/02/21', 'TEL', 3);

INSERT INTO pedido
(num_pedido, dat_pedido, tip_origem, id_cliente)
VALUES(1004, '19/02/21', 'WEB', 2);

-- Item_Pedido

INSERT INTO item_pedido
(num_pedido, id_produto, qtd_produto_pedido)
VALUES(1001, 1, 3);

INSERT INTO item_pedido
(num_pedido, id_produto, qtd_produto_pedido)
VALUES(1001, 2, 2);

INSERT INTO item_pedido
(num_pedido, id_produto, qtd_produto_pedido)
VALUES(1002, 1, 1);

INSERT INTO item_pedido
(num_pedido, id_produto, qtd_produto_pedido)
VALUES(1002, 3, 1);

INSERT INTO item_pedido
(num_pedido, id_produto, qtd_produto_pedido)
VALUES(1003, 1, 1);

INSERT INTO item_pedido
(num_pedido, id_produto, qtd_produto_pedido)
VALUES(1004, 1, 1);

INSERT INTO item_pedido
(num_pedido, id_produto, qtd_produto_pedido)
VALUES(1004, 2, 1);

INSERT INTO item_pedido
(num_pedido, id_produto, qtd_produto_pedido)
VALUES(1004, 3, 1);

-- Ex1

SELECT des_produto, qtd_estoque, val_produto FROM produto 
WHERE val_produto >= 213 ORDER BY val_produto;

-- Ex2

SELECT DISTINCT tip_origem FROM pedido ORDER BY tip_origem DESC;

-- Ex3
SELECT cliente.id_cliente, cliente.nom_cliente, COUNT(cliente.id_cliente) 
FROM cliente, pedido WHERE cliente.id_cliente = pedido.id_cliente 
GROUP BY cliente.nom_cliente, cliente.id_cliente
ORDER BY cliente.nom_cliente;

-- Ex4
SELECT MAX(dat_pedido), MIN(dat_pedido), COUNT(num_pedido) FROM PEDIDO;

-- Ex5
SELECT pedido.num_pedido, pedido.dat_pedido, cliente.nom_cliente, 
pedido.tip_origem FROM pedido, cliente WHERE cliente.id_cliente = pedido.id_cliente
ORDER BY pedido.num_pedido;

-- Ex6

SELECT pe.num_pedido, pe.dat_pedido, cl.nom_cliente, pe.tip_origem,
pr.des_produto, it.qtd_produto_pedido, cl.des_endereco
FROM CLIENTE cl, PEDIDO pe, PRODUTO pr, ITEM_PEDIDO it
WHERE it.id_produto = pr.id_produto AND it.num_pedido = pe.num_pedido 
AND cl.id_cliente = pe.id_cliente 
ORDER BY cl.nom_cliente, pe.tip_origem, pr.des_produto;

-- Ex7

SELECT p.des_produto ,SUM (i.qtd_produto_pedido)
FROM PRODUTO p, ITEM_PEDIDO i, PEDIDO pe
WHERE p.id_produto = i.id_produto AND i.num_pedido = pe.num_pedido 
GROUP BY p.des_produto
ORDER BY SUM(i.qtd_produto_pedido) DESC;

-- Ex8

SELECT pe.dat_pedido, c.nom_cliente, p.des_produto, i.qtd_produto_pedido, 
i.qtd_produto_pedido * p.val_produto AS valor_total
FROM PRODUTO p, ITEM_PEDIDO i, PEDIDO pe, CLIENTE c
WHERE i.num_pedido = pe.num_pedido AND pe.id_cliente = c.id_cliente AND i.id_produto = p.id_produto
GROUP BY pe.num_pedido, pe.dat_pedido, c.nom_cliente, p.des_produto, i.qtd_produto_pedido, p.val_produto
ORDER BY pe.dat_pedido, pe.num_pedido;