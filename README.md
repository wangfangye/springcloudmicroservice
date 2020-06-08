### 逐步实现尚硅谷SpringCloud 2018版本
开启步骤：
- eureka集群:7001\7002\7003
- provider-dept:8001\8003\8004      
    嫌麻烦的，其实可以修改port之后通过install产生多个jar包，然后命令行运行，也可以产生多个微服务。
- consumer-dept:80
      
tips:
微服务中添加了druid监控，可以输入localhost:80/druid,输入用户名、密码查看。不过这里只是为了测试集成druid，没有具体的业务需求。

7001、7002、7003端口为eureka集群。图中打开了7003端口的eureka的管理器。显示7002和7003.
![eureka集群](imgs/eureka集群.png)

注册三个了MICROSERVICECLOUD-DEPT微服务，以及一个CONSUMER-USER的微服务。可以通过使用RestTemplate，通过微服务的名字进行调用。之后有更加简单的方式。
![微服务列表](imgs/服务列表.png)

