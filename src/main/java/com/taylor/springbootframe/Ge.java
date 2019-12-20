package com.taylor.springbootdemo;


import com.taylor.springbootdemo.config.CodeGenerator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Ge {
    @Test
    public void contextLoads() {
        CodeGenerator gse = new CodeGenerator();
        //要给那些表生成
        gse.generateByTables(false,"table1","table2");
    }

}
