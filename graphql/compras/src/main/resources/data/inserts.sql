INSERT INTO cliente (id, email, nome) VALUES
(1, 'a@a.com', 'Cliente A');
(2, 'b@b.com', 'Cliente B');
(3, 'c@c.com', 'Cliente C');

INSERT INTO produto (id, nome, valor) VALUES
(1, 'Boné', 25);
(2, 'Bola', 120);
(3, 'Bermuda', 60);
(4, 'Camiseta', 80);
(5, 'Chuteira', 130);

INSERT INTO compra (`data`, quantidade, status, cliente_id, produto_id) VALUES
('2024-02-20 20:30:49', 2, 'Concluída', 1, 4),
('2023-03-14 20:30:49', 1, 'Concluída', 1, 5),
('2023-11-07 20:30:49', 5, 'Concluída', 3, 2),
('2023-05-06 20:30:49', 1, 'Pendente',  3, 1),
('2023-08-05 20:30:49', 1, 'Pendente',  1, 4),
('2023-05-23 20:30:49', 4, 'Concluída', 3, 5),
('2023-09-28 20:30:49', 4, 'Pendente',  2, 2),
('2023-03-24 20:30:49', 4, 'Concluída', 3, 1),
('2023-10-18 20:30:49', 2, 'Concluída', 2, 2),
('2024-01-04 20:30:49', 2, 'Pendente',  2, 1);

