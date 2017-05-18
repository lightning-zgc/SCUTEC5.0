#腾讯俱乐部TEC5.0 | 技术面试题
>数据类型题目

##Hadoop技术初探:自定义排序

###背景介绍
1.	HADOOP是apache旗下的一套开源软件平台2.	HADOOP提供的功能：利用服务器集群，根据用户的自定义业务逻辑，对海量数据进行分布式处理3.	HADOOP的核心组件有	* HDFS（分布式文件系统）	* YARN（运算资源调度系统）	* MAPREDUCE（分布式运算编程框架）4.	广义上来说，HADOOP通常是指一个更广泛的概念——HADOOP生态圈
### 任务要求
利用mapreduce架构，通过自定义可序列化bean, Partitioner，Comparator, Mapper, Reducer等实现对city.txt中的内容进行分区排序。详细的任务要求请参看[数据项目说明.pdf](https://github.com/lightning-zgc/SCUTEC5.0/blob/master/03-数据/数据项目说明.pdf)

### Hadoop学习资料参考
1.	知乎:[https://www.zhihu.com/question/19795366](https://www.zhihu.com/question/19795366)2.	官网文档:[http://hadoop.apache.org/docs/r2.6.5/](http://hadoop.apache.org/docs/r2.6.5/)
