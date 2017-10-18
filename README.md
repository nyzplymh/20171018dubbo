# 20171018dubbo
spring dubbo 环境搭建及简单测试
1. zookeeper 环境的搭建
先下载zookeeper 解压到本地，我使用的版本是3.3.6 ,可以直接在官网上下载https://mirrors.tuna.tsinghua.edu.cn/apache/zookeeper/zookeeper-3.3.6/zookeeper-3.3.6.tar.gz
，解压之后进入zookeeper 根目录打开conf文件 ，复制zoo_sample.cfg 并重命名为zoo.cfg ,配置文件用默认的即可，返回打开bin文件找到zkserver.cmd /zkserver.sh 启动即可。

2.安装dubbo的管理中心 ，dubbo-admin-2.5.3.war 放在tomcat的webApps 下启动后自动解压

3.整合ssm 和dubbo 并进行简单的查询操作
