INSERT INTO tb_servidor (nome, cpf, email, matricula, data_admissao) VALUES
    ('João Pereira', '12345678901', 'joao.pereira@gmail.com', '20253', '2022-03-15');

INSERT INTO tb_servidor (nome, cpf, email, matricula, data_admissao) VALUES
    ('Ana Costa', '23456789012', 'ana.costa@gmail.com', '20254', '2021-11-08');

INSERT INTO tb_servidor (nome, cpf, email, matricula, data_admissao) VALUES
    ('Carlos Mendes', '34567890123', 'carlos.mendes@gmail.com', '20255', '2020-07-22');

INSERT INTO tb_servidor (nome, cpf, email, matricula, data_admissao) VALUES
    ('Fernanda Lima', '45678901234', 'fernanda.lima@gmail.com', '20256', '2019-01-30');

INSERT INTO tb_servidor (nome, cpf, email, matricula, data_admissao) VALUES
    ('Rafael Souza', '56789012345', 'rafael.souza@gmail.com', '20257', '2024-02-01');

INSERT INTO tb_servidor (nome, cpf, email, matricula, data_admissao) VALUES
    ('Juliana Rocha', '67890123456', 'juliana.rocha@gmail.com', '20258', '2023-09-18');

INSERT INTO tb_servidor (nome, cpf, email, matricula, data_admissao) VALUES
    ('Pedro Alves', '78901234567', 'pedro.alves@gmail.com', '20259', '2018-05-14');

INSERT INTO tb_servidor (nome, cpf, email, matricula, data_admissao) VALUES
    ('Camila Nogueira', '89012345678', 'camila.nogueira@gmail.com', '20260', '2022-12-05');

INSERT INTO tb_servidor (nome, cpf, email, matricula, data_admissao) VALUES
    ('Lucas Fernandes', '90123456789', 'lucas.fernandes@gmail.com', '20261', '2020-10-27');

INSERT INTO tb_servidor (nome, cpf, email, matricula, data_admissao) VALUES
    ('Patrícia Oliveira', '01234567890', 'patricia.oliveira@gmail.com', '20262', '2017-08-09');



INSERT INTO tb_status_solicitacao (descricao) VALUES ('Aprovado');
INSERT INTO tb_status_solicitacao (descricao) VALUES ('Pendente');
INSERT INTO tb_status_solicitacao (descricao) VALUES ('Rejeitado');



INSERT INTO tb_ferias (data_inicio, data_fim, dias_total, id_servidor, id_status) VALUES
    ('2026-01-05', '2026-01-19', 15, 1, 1);

INSERT INTO tb_ferias (data_inicio, data_fim, dias_total, id_servidor, id_status) VALUES
    ('2026-01-20', '2026-02-03', 15, 2, 2);

INSERT INTO tb_ferias (data_inicio, data_fim, dias_total, id_servidor, id_status) VALUES
    ('2026-02-10', '2026-03-11', 30, 3, 2);

INSERT INTO tb_ferias (data_inicio, data_fim, dias_total, id_servidor, id_status) VALUES
    ('2026-03-01', '2026-03-20', 20, 4, 1);

INSERT INTO tb_ferias (data_inicio, data_fim, dias_total, id_servidor, id_status) VALUES
    ('2026-03-25', '2026-04-23', 30, 5, 3);

INSERT INTO tb_ferias (data_inicio, data_fim, dias_total, id_servidor, id_status) VALUES
    ('2026-04-05', '2026-04-19', 15, 6, 2);

INSERT INTO tb_ferias (data_inicio, data_fim, dias_total, id_servidor, id_status) VALUES
    ('2026-04-20', '2026-05-09', 20, 7, 1);

INSERT INTO tb_ferias (data_inicio, data_fim, dias_total, id_servidor, id_status) VALUES
    ('2026-05-10', '2026-06-08', 30, 8, 2);

INSERT INTO tb_ferias (data_inicio, data_fim, dias_total, id_servidor, id_status) VALUES
    ('2026-06-01', '2026-06-15', 15, 9, 1);

INSERT INTO tb_ferias (data_inicio, data_fim, dias_total, id_servidor, id_status) VALUES
    ('2026-06-20', '2026-07-09', 20, 10, 2);

INSERT INTO tb_ferias (data_inicio, data_fim, dias_total, id_servidor, id_status) VALUES
    ('2026-07-05', '2026-08-03', 30, 1, 2);

INSERT INTO tb_ferias (data_inicio, data_fim, dias_total, id_servidor, id_status) VALUES
    ('2026-08-01', '2026-08-15', 15, 2, 1);

INSERT INTO tb_ferias (data_inicio, data_fim, dias_total, id_servidor, id_status) VALUES
    ('2026-08-20', '2026-09-08', 20, 3, 3);

INSERT INTO tb_ferias (data_inicio, data_fim, dias_total, id_servidor, id_status) VALUES
    ('2026-09-01', '2026-09-30', 30, 4, 2);

INSERT INTO tb_ferias (data_inicio, data_fim, dias_total, id_servidor, id_status) VALUES
    ('2026-09-10', '2026-09-24', 15, 5, 1);

INSERT INTO tb_ferias (data_inicio, data_fim, dias_total, id_servidor, id_status) VALUES
    ('2026-10-01', '2026-10-20', 20, 6, 2);

INSERT INTO tb_ferias (data_inicio, data_fim, dias_total, id_servidor, id_status) VALUES
    ('2026-10-15', '2026-11-13', 30, 7, 3);

INSERT INTO tb_ferias (data_inicio, data_fim, dias_total, id_servidor, id_status) VALUES
    ('2026-11-01', '2026-11-15', 15, 8, 1);

INSERT INTO tb_ferias (data_inicio, data_fim, dias_total, id_servidor, id_status) VALUES
    ('2026-11-20', '2026-12-09', 20, 9, 2);

INSERT INTO tb_ferias (data_inicio, data_fim, dias_total, id_servidor, id_status) VALUES
    ('2026-12-01', '2026-12-30', 30, 10, 2);



INSERT INTO tb_pagamento_ferias (valor_bruto, valor_liquido, data_pagamento, id_ferias) VALUES
    (310.00, 263.50, '2026-12-20', 1);

INSERT INTO tb_pagamento_ferias (valor_bruto, valor_liquido, data_pagamento, id_ferias) VALUES
    (180.00, 150.00, '2026-01-03', 2);

INSERT INTO tb_pagamento_ferias (valor_bruto, valor_liquido, data_pagamento, id_ferias) VALUES
    (300.00, 255.00, '2026-01-18', 3);

INSERT INTO tb_pagamento_ferias (valor_bruto, valor_liquido, data_pagamento, id_ferias) VALUES
    (220.00, 187.00, '2026-02-05', 4);

INSERT INTO tb_pagamento_ferias (valor_bruto, valor_liquido, data_pagamento, id_ferias) VALUES
    (450.00, 382.50, '2026-02-20', 5);

INSERT INTO tb_pagamento_ferias (valor_bruto, valor_liquido, data_pagamento, id_ferias) VALUES
    (160.00, 136.00, '2026-03-25', 6);

INSERT INTO tb_pagamento_ferias (valor_bruto, valor_liquido, data_pagamento, id_ferias) VALUES
    (280.00, 238.00, '2026-04-10', 7);

INSERT INTO tb_pagamento_ferias (valor_bruto, valor_liquido, data_pagamento, id_ferias) VALUES
    (500.00, 425.00, '2026-05-05', 8);

INSERT INTO tb_pagamento_ferias (valor_bruto, valor_liquido, data_pagamento, id_ferias) VALUES
    (170.00, 144.50, '2026-05-28', 9);

INSERT INTO tb_pagamento_ferias (valor_bruto, valor_liquido, data_pagamento, id_ferias) VALUES
    (260.00, 221.00, '2026-06-10', 10);

INSERT INTO tb_pagamento_ferias (valor_bruto, valor_liquido, data_pagamento, id_ferias) VALUES
    (320.00, 272.00, '2026-06-25', 11);

INSERT INTO tb_pagamento_ferias (valor_bruto, valor_liquido, data_pagamento, id_ferias) VALUES
    (150.00, 125.00, '2026-07-15', 12);

INSERT INTO tb_pagamento_ferias (valor_bruto, valor_liquido, data_pagamento, id_ferias) VALUES
    (240.00, 204.00, '2026-07-30', 13);

INSERT INTO tb_pagamento_ferias (valor_bruto, valor_liquido, data_pagamento, id_ferias) VALUES
    (600.00, 510.00, '2026-08-18', 14);

INSERT INTO tb_pagamento_ferias (valor_bruto, valor_liquido, data_pagamento, id_ferias) VALUES
    (200.00, 170.00, '2026-09-05', 15);

INSERT INTO tb_pagamento_ferias (valor_bruto, valor_liquido, data_pagamento, id_ferias) VALUES
    (350.00, 297.50, '2026-09-20', 16);

INSERT INTO tb_pagamento_ferias (valor_bruto, valor_liquido, data_pagamento, id_ferias) VALUES
    (480.00, 408.00, '2026-10-10', 17);

INSERT INTO tb_pagamento_ferias (valor_bruto, valor_liquido, data_pagamento, id_ferias) VALUES
    (190.00, 161.50, '2026-10-28', 18);

INSERT INTO tb_pagamento_ferias (valor_bruto, valor_liquido, data_pagamento, id_ferias) VALUES
    (270.00, 229.50, '2026-11-12', 19);

INSERT INTO tb_pagamento_ferias (valor_bruto, valor_liquido, data_pagamento, id_ferias) VALUES
    (550.00, 467.50, '2026-12-01', 20);
