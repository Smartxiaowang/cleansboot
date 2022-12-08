SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for shdz
-- ----------------------------
DROP TABLE IF EXISTS `shdz`;
CREATE TABLE `shdz`  (
  `id` int(19) NOT NULL AUTO_INCREMENT,
  `address` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '所在地区',
  `postal_code` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '详细地址',
  `prefix_phone_number` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '邮编',
  `phone_number` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `default_shipping_address` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '设为默认地址',
  `detailed_address` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `username` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 21 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of shdz
-- ----------------------------
INSERT INTO `shdz` VALUES (3, '广东佛山666', '000000', '1', '13293932222', '1', '韩国队获得法国', '1');
INSERT INTO `shdz` VALUES (4, '广东佛山666', '000001', '0', '13293932223', '0', '韩国队获得法国', '3');
INSERT INTO `shdz` VALUES (5, '广东佛山5', '000002', '0', '13293932225', '0', '韩国队获得法国', '4');
INSERT INTO `shdz` VALUES (6, '广东佛山6', '000004', '0', '13293932226', '0', '韩国队获得法国', '5');
INSERT INTO `shdz` VALUES (7, '广东佛山777', '999997', '0', '13293932224', '0', '韩国队获得法国', '6');
INSERT INTO `shdz` VALUES (8, '广东佛山8', '453245', '0', '13293932224', '0', '韩国队获得法国', '7');
INSERT INTO `shdz` VALUES (9, '广东佛山9', '763425', '0', '13293932224', '0', '韩国队获得法国', '8');
INSERT INTO `shdz` VALUES (10, '广东佛山11', '225468', '0', '13593932224', '0', '韩国队获得法国', '9');
INSERT INTO `shdz` VALUES (17, '采访过很多重返国会', '535434', '0', '13293332224', '0', '风格和', 'GH');
INSERT INTO `shdz` VALUES (18, '采访过很多重返国会', '675335', '0', '13639322224', '0', '风格和', 'GH');
INSERT INTO `shdz` VALUES (19, '采访过很多重返国会', '966745', '0', '13222232224', '0', '风格和', 'GH');
INSERT INTO `shdz` VALUES (20, '采访过很多重返国会ED546SD6', '466545', '0', '13293932224', '0', '风格和', 'GH');

SET FOREIGN_KEY_CHECKS = 1;
