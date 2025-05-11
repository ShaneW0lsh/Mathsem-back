SET FOREIGN_KEY_CHECKS = 0;

-- new user
INSERT IGNORE INTO users (username, email, password_hash) VALUES
('test_user', 'test@example.com', 'hashed_password'),
('admin', 'admin@example.com', 'admin_hash');

-- new .fms
INSERT IGNORE INTO fms_files (user_id, file_name, file_data) VALUES
(1, 'test1.fms', 'binary_data_placeholder'),
(2, 'config.fms', 'another_binary_placeholder');

-- new five stars reviews
INSERT IGNORE INTO reviews (user_id, review_text, rating) VALUES
(1, 'Good!', 5),
(2, 'BAD(', 4);

SET FOREIGN_KEY_CHECKS = 1;