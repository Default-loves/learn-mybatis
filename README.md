# MyBatisLearning

项目包括以下几个模块：
- 模块`general`：MyBatis的一些基础操作
- 模块`one-to-one`演示的是一对一的关系，一个Book对应一个Author，一本书对应一个作者
- 模块`one-to-many` 演示的是一对多的关系，其中一个Author对应多个Article，即一个作者对应多篇文章
- 模块`many-to-many`演示的是多对多的关系，多个Student对应多个Lecture，即学生和课程是多对多的
- 模块`mybatis-generator`演示的是`mybatis-generator`的使用，能够根据mysql数据库的表格，以及配置文件generatorConfig.xml自动生成entity类，Dao类，XXXMapper.xml等，能够提高使用MyBatis的效率
  - 使用：配置好generatorConfig.xml，位置在于/resources/mybatis-generator文件夹中，需要根据自身情况修改当中的内容，由于我们在pom中添加了mybatis-generator-maven-plugin，因此我们可以通过maven->plugins->mybatis-generator:generate来启动，运行完成后提示成功则文件生成完毕
  

注意：
- 每个模块包含以下包：entity、dao、controller，由于只是演示MyBatis的功能，所以省略了service层





### Other

- xml文件中进行小于判断：<![CDATA[<=]]>
- DAO类方法中的参数如果是基本类型，需要添加@Param指定名称
- MyBatis中if标签中不能用“AND”，而要用“and”
- like concat('%',#{parkNames},'%')



### 问题

#### 属性映射不出来

比如我们有如下的数据

![image-20220715145737889](G:\GithubMy\my\learn-mybatis\image\image-20220715145737889.png)

我们关注字段`shop_name`

`mapper.xml`文件我们是这样写的

```xml
<resultMap id="BaseResultMap" type="com.junyi.domain.Article" >
    <id column="id" property="id" jdbcType="INTEGER" />
    <result column="name" property="name" jdbcType="VARCHAR" />
    <result column="text" property="text" jdbcType="VARCHAR" />
    <result column="remark" property="remark" jdbcType="VARCHAR" />
    <result column="money" property="money" jdbcType="INTEGER" />
    <result column="create_time" property="createTime" jdbcType="TIMESTAMP" />
    <result column="update_time" property="updateTime" jdbcType="TIMESTAMP" />
    <result column="shop_name" property="shopName" jdbcType="VARCHAR" />
</resultMap>

<sql id="Base_Column_List" >
    id, `name`, `text`, remark, money, create_time, update_time
</sql>
```

我们写个简单的查询

```xml
<select id="listAll" resultMap="BaseResultMap">
    select
    	<include refid="Base_Column_List" />
    	, shop_name AS shopName
    from article
</select>
```

然后我们通过工具进行查询，发现`shopName`字段的值总是映射不到

![image-20220715150314659](G:\GithubMy\my\learn-mybatis\image\image-20220715150314659.png)

具体原因是因为我们写的查询语句，对于字段`shop_name`，使用了`resultMap`，还进行了字段别名的设置`shop_name AS shopName`

解决办法是：

1. 将AS删除

```xml
<select id="listAll" resultMap="BaseResultMap">
    select
        <include refid="Base_Column_List" />
        , shop_name
    from article
</select>
```

2. 将`resultMap`的`shop_name`字段删除

```xml
<resultMap id="BaseResultMap" type="com.junyi.domain.Article" >
  <id column="id" property="id" jdbcType="INTEGER" />
  <result column="name" property="name" jdbcType="VARCHAR" />
  <result column="text" property="text" jdbcType="VARCHAR" />
  <result column="remark" property="remark" jdbcType="VARCHAR" />
  <result column="money" property="money" jdbcType="INTEGER" />
  <result column="create_time" property="createTime" jdbcType="TIMESTAMP" />
  <result column="update_time" property="updateTime" jdbcType="TIMESTAMP" />
  <!--<result column="shop_name" property="shopName" jdbcType="VARCHAR" />-->
</resultMap>
```

不同的字段`resultMap`和`As XXX`是可以混合使用的，但是对于同一个字段，两个混用会存在问题