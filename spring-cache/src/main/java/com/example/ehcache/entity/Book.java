package com.example.ehcache.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author mingzhihong
 * @date 2019/11/11 14:35
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book implements Serializable {
        /**
         * 编号
         */

        private Long id;

        /**
         * 书名
         */
        private String name;

        /**
         * 作者
         */
        private String writer;

        /**
         * 简介
         */
        private String introduction;
}
