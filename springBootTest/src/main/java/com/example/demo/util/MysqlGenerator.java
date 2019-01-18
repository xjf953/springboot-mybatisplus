package com.example.demo.util;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.DbType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

/**
 * <p>
 * 代码生成器演示
 * </p>
 *
 * @author hubin
 * @date 2016-12-01
 */
public class MysqlGenerator {
    //包路径
    private static final String PACKAGE_NAME = "com.example.demo.biz";
    private static final String BASE_PACKAGE_NAME = "com.example.demo";
    //保存路径
    private static final String projectPath = "F:/";
    public static void main(String[] args) {
       /* 生成代码包名 */
        AutoGenerator mpg = new AutoGenerator();
        mpg.setTemplateEngine(new FreemarkerTemplateEngine());

        // 全局配置
        GlobalConfig gc = new GlobalConfig();
        // 看过来1
        gc.setOutputDir("F:\\");
        gc.setFileOverride(true);
        gc.setActiveRecord(true);
        gc.setEnableCache(false);
        // 署名
         gc.setAuthor("xjf");

        // 自定义文件命名，注意 %s 会自动填充表实体属性！
        mpg.setGlobalConfig(gc);

        // 看过来3
        // 数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setDbType(DbType.MYSQL);
        dsc.setDriverName("com.mysql.jdbc.Driver");
        dsc.setUsername("root");
        dsc.setPassword("root");
        dsc.setUrl("jdbc:mysql://localhost:3306/mybatis?characterEncoding=utf8");
        mpg.setDataSource(dsc);

        // 策略配置
        StrategyConfig strategy = new StrategyConfig();
        // 全局大写命名 ORACLE 注意
        //strategy.setCapitalMode(true);
        // 此处可以修改为您的表前缀 看过来4
//        strategy.setTablePrefix(new String[] { ""});
        // 表名生成策略
        strategy.setNaming(NamingStrategy.underline_to_camel);
        // 需要生成的表
        strategy.setInclude(new String[] { "tb_user"});
//        strategy.setFieldNaming(NamingStrategy.underline_to_camel);
        // 自定义实体父类
//        strategy.setSuperEntityClass(BASE_PACKAGE_NAME+".core.mybatis.base.XkBaseEntity");
//        // 自定义 mapper 父类
//        strategy.setSuperMapperClass(BASE_PACKAGE_NAME+".core.mybatis.base.XkBaseMapper");
//        // 自定义 service 父类
//        strategy.setSuperServiceClass(BASE_PACKAGE_NAME+".core.mybatis.base.XkBaseService");
//        // 自定义 service 实现类父类
//        strategy.setSuperServiceImplClass(BASE_PACKAGE_NAME+".core.mybatis.base.XkBaseServiceImpl");
        // 自定义 controller 父类
//         strategy.setSuperControllerClass("com.baomidou.demo.TestController");
        // 【实体】是否生成字段常量（默认 false）
        // public static final String ID = "test_id";
        strategy.setEntityColumnConstant(false);
        // 【实体】是否为构建者模型（默认 false）
        // public User setName(String name) {this.name = name; return this;}
        // strategy.setEntityBuilderModel(true);
        mpg.setStrategy(strategy);

        // 包配置
        PackageConfig pc = new PackageConfig();
        pc.setParent(PACKAGE_NAME);
//        pc.setModuleName("biz");
        mpg.setPackageInfo(pc);

        // 执行生成
        mpg.execute();
    }


}