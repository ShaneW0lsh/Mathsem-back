SELECT * FROM users;
SELECT * FROM fms_files;
SELECT * FROM reviews;

-- new user
INSERT INTO users (username, email, password_hash)
VALUES ('new_user', 'new@example.com', '$2a$10$hashedpasswordstring');

-- delete user
DELETE FROM users WHERE id = 1;

-- new .fms
INSERT INTO fms_files (user_id, file_name, file_data)
VALUES (1, 'test.fms', 'testbinarydata');

-- delete .fms
DELETE FROM fms_files WHERE id = 1;

-- new five stars reviews
INSERT INTO reviews (user_id, review_text, rating)
VALUES (2, 'Новый отзыв!', 5);

-- insert real .fms
INSERT INTO fms_files (user_id, file_name, file_data)
VALUES (
    2,
    'test.fms',
    LOAD_FILE('/var/lib/mysql-files/test.fms')
);
