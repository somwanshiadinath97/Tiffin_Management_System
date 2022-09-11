
//customer 
CREATE TABLE `cust_info` (
  `user_id` int NOT NULL AUTO_INCREMENT,
  `user_name` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  `adhar_no` varchar(45) NOT NULL,
  `address_line` varchar(45) NOT NULL,
  `city` varchar(45) DEFAULT NULL,
  `pincode` int NOT NULL,
  `cont_no` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) 


//vendor 
CREATE TABLE `vend_info` (
  `user_id` int NOT NULL AUTO_INCREMENT,
  `user_name` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  `adhar_no` varchar(45) NOT NULL,
  `address_line` varchar(45) NOT NULL,
  `city` varchar(45) DEFAULT NULL,
  `pincode` varchar(45) NOT NULL,
  `cont_no` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
)


//delivery boy 
CREATE TABLE `del_info` (
  `user_id` int NOT NULL AUTO_INCREMENT,
  `user_name` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  `adhar_no` varchar(45) NOT NULL,
  `address_line` varchar(45) NOT NULL,
  `city` varchar(45) DEFAULT NULL,
  `pincode` varchar(45) NOT NULL,
  `cont_no` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) 


//tiffin details
CREATE TABLE `tiffin_details` (
  `tiffin_id` int NOT NULL AUTO_INCREMENT,
  `tiffin_name` varchar(45) NOT NULL,
  `tiffin_image` longblob,
  `tiffin_price_month` int DEFAULT NULL,
  `description` varchar(200) DEFAULT NULL,
  `vend_id` int DEFAULT NULL,
  PRIMARY KEY (`tiffin_id`),
  KEY `vend_id_idx` (`vend_id`),
  CONSTRAINT `vend_id` FOREIGN KEY (`vend_id`) REFERENCES `vend_info` (`user_id`)
)


//subsription
CREATE TABLE `subscription` (
  `sub_id` int NOT NULL AUTO_INCREMENT,
  `start_date` date DEFAULT NULL,
  `end_date` date DEFAULT NULL,
  `tiffin_id` int DEFAULT NULL,
  `user_id` int DEFAULT NULL,
  `delivery_area` varchar(100) NOT NULL,
  `city` varchar(45) DEFAULT NULL,
  `pincode` varchar(45) DEFAULT NULL,
  `no_of_meals_per_day` int DEFAULT NULL,
  `del_id` int DEFAULT NULL,
  PRIMARY KEY (`sub_id`),
  KEY `tiffin_id_idx` (`tiffin_id`),
  KEY `user_id_idx` (`user_id`),
  KEY `del_id_idx` (`del_id`),
  CONSTRAINT `del_id` FOREIGN KEY (`del_id`) REFERENCES `del_info` (`user_id`),
  CONSTRAINT `tiffin_id` FOREIGN KEY (`tiffin_id`) REFERENCES `tiffin_details` (`tiffin_id`),
  CONSTRAINT `user_id` FOREIGN KEY (`user_id`) REFERENCES `cust_info` (`user_id`)
)


//billing
CREATE TABLE `billing` (
  `trans_id` int NOT NULL AUTO_INCREMENT,
  `sub_id` int DEFAULT NULL,
  `no_of_days` int DEFAULT NULL,
  `no_of_off_days` int DEFAULT NULL,
  `month` varchar(45) DEFAULT NULL,
  ` year` int DEFAULT NULL,
  `total_amount` int DEFAULT NULL,
  `status` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`trans_id`),
  KEY `sub_id_idx` (`sub_id`),
  CONSTRAINT `sub_id` FOREIGN KEY (`sub_id`) REFERENCES `subscription` (`sub_id`)
) 


//feedback and complaint 
CREATE TABLE `feedback_complaint` (
  `fc_id` int NOT NULL,
  `feedback_rating` int DEFAULT NULL,
  `feedback_comments` varchar(200) DEFAULT NULL,
  `feedback_datetime` date DEFAULT NULL,
  `delevery_issue` varchar(100) DEFAULT NULL,
  `payment_issue` varchar(100) DEFAULT NULL,
  `other_issue` varchar(100) DEFAULT NULL,
  `order_id` int DEFAULT NULL,
  PRIMARY KEY (`fc_id`),
  KEY `order_id_idx` (`order_id`),
  CONSTRAINT `order_id` FOREIGN KEY (`order_id`) REFERENCES `subscription` (`sub_id`)
)


//extra order and absent request
CREATE TABLE `extra_order_absent_request` (
  `request_id` int NOT NULL AUTO_INCREMENT,
  `tiffin_id` int DEFAULT NULL,
  `cust_id` int DEFAULT NULL,
  `request_date` date DEFAULT NULL,
  `is_ack` tinyint DEFAULT NULL,
  `request_count` int DEFAULT NULL,
  `absent_present_info` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`request_id`),
  KEY `tiffin_id_idx` (`tiffin_id`),
  KEY `cust_id` (`cust_id`),
  CONSTRAINT `cust_id` FOREIGN KEY (`cust_id`) REFERENCES `subscription` (`sub_id`),
  CONSTRAINT `tiffinid` FOREIGN KEY (`tiffin_id`) REFERENCES `tiffin_details` (`tiffin_id`)
) 

#ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci