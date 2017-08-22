# dubbo-sample
dubbo模板
1.构建dubbo项目
（1）git clone https://github.com/alibaba/dubbo dubbo 下载源码 master分支
（2） git clone https://github.com/alibaba/opensesame 下载 然后 mvn install
（3）如果要用jdk8进行编译dubbo-admin必须修改pom中下列依赖版本
webx的依赖改为3.1.6版；
<dependency> 
    <groupId>com.alibaba.citrus</groupId> 
    <artifactId>citrus-webx-all</artifactId> 
    <version>3.1.6</version> 
</dependency>
添加velocity的依赖，我用了1.7；
<dependency>
    <groupId>org.apache.velocity</groupId>
    <artifactId>velocity</artifactId>
    <version>1.7</version>
</dependency>

对依赖项dubbo添加exclusion，避免引入旧spring
<dependency>
    <groupId>com.alibaba</groupId>
    <artifactId>dubbo</artifactId>
    <version>${project.parent.version}</version>
    <exclusions>
        <exclusion>
            <groupId>org.springframework</groupId>
            <artifactId>spring</artifactId>
        </exclusion>
    </exclusions>
</dependency>

webx已有spring 3以上的依赖，因此注释掉dubbo-admin里面的spring依赖
<!--<dependency>-->
      <!--<groupId>org.springframework</groupId>-->
      <!--<artifactId>spring</artifactId>-->
<!--</dependency>-->


然后可以进行编译了
mvn clean install -Dmaven.test.skip  

如果要允许dubbo-admin可能需要修改WEB-INF中的dubbo.properties文件中的zookeeper的地址

然后就可以放入tomcat中进行启动了
