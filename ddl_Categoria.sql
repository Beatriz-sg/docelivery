CREATE TABLE categoria
(
    id                    BIGINT AUTO_INCREMENT NOT NULL,
    data_hora_agendamento datetime              NOT NULL,
    descricao             VARCHAR(100)          NOT NULL,
    CONSTRAINT pk_categoria PRIMARY KEY (id)
);