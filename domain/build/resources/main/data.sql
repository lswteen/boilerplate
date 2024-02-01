CREATE TABLE search (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    user_id VARCHAR(255),
    title VARCHAR(255),
    order_number INT,
    created_at TIMESTAMP,
    updated_at TIMESTAMP
);

CREATE TABLE searchCondition (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    mapping_search_id BIGINT,
    type VARCHAR(255),
    type_value VARCHAR(255),
    created_at TIMESTAMP,
    updated_at TIMESTAMP,
    FOREIGN KEY (mapping_search_id) REFERENCES search(id)
);

-- search 테이블에 더미 데이터 삽입
INSERT INTO search (user_id, title, order_number, created_at, updated_at)
VALUES ('user1', 'Title1', 1, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
       ('user2', 'Title2', 2, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

-- searchCondition 테이블에 더미 데이터 삽입
INSERT INTO searchCondition (mapping_search_id, type, value, created_at, updated_at)
VALUES (1, 'type1', 'value1', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
       (1, 'type2', 'value2', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
       (2, 'type3', 'value3', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);
