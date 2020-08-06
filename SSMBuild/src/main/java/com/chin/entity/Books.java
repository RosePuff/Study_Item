package com.chin.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName: Books
 * @Description: TODO 类描述
 * @Author: LQH
 * @Date: 2020/08/05
 * @Version: 1.0
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Books {

    private int bookId;
    private String bookName;
    private int bookCount;
    private String detail;
}
