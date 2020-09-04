# MyBatisLearning



项目包括以下几个模块：

- 模块`one-to-one`演示的是一对一的关系，一个Book对应一个Author，一本书对应一个作者
- 模块`one-to-many` 演示的是一对多的关系，其中一个Author对应多个Article，即一个作者对应多篇文章
- 模块`many-to-many`演示的是多对多的关系，多个Student对应多个Lecture，即学生和课程是多对多的3
- 模块`mybatis-generator`演示的是`mybatis-generator`的使用，能够根据mysql数据库的表格，以及配置文件generatorConfig.xml自动生成entity类，Dao类，XXXMapper.xml等，能够提高使用MyBatis的效率
  - 使用：配置好generatorConfig.xml，位置在于/resources/mybatis-generator文件夹中，需要根据自身情况修改当中的内容，由于我们在pom中添加了mybatis-generator-maven-plugin，因此我们可以通过maven->plugins->mybatis-generator:generate来启动，运行完成后提示成功则文件生成完毕



注意：

- 每个模块包含以下包：entity、dao、controller，由于只是演示MyBatis的功能，所以忽略了service层









