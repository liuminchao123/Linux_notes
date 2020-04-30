## 习题

1. 

> 狗携带的数据总量为： 3 * 7 * 1024^3  =  2.1 * 10^10  byte(约等于)
>
> 狗的速度为：18 / 3.6 = 5 m/s
>
> 传输线传输速率为：150Mbps = 150 * 1250000 byte/s = 1.875 * 10^8 byte/s
>
> 设临界距离为 x 米
>
> 狗的数据传输速度为  2.1 * 10^10  byte  /  (x / 5) = 10.5 * 10^10 / x  byte/s
>
> 满足条件为   狗的传输速度   >     传输线的速度   
>
> 即   10.5 * 10^10 / x  byte/s  >  1.875 * 10^8 byte/s
>
> 即    x  <   5.6 * 10^3 m
>
> (1) 狗速度加倍的话，狗的数据传输速度也加倍，距离的最大值也就加倍
>
> (2) 每盒磁带容量加倍，狗的数据传输速度也加倍，距离的最大值也就加倍
>
> (3)  传输线路速率加倍，距离的最大值减半

4. 

> (1) 数字语言流量，需要一定的投递时间
>
> (2) 视频流量，也是需要一定的投递时间
>
> (3) 金融业务流量，需要特殊的稳定性与安全性

5. 

> 网上查到纽约与加州的距离大约为 5000 km
>
> 网线中的光速为： 2.0 * 10^8  m/s
>
> 在无延迟理想状态下，传输时间为  5.0 * 10^6 /  2.0 * 10^8 = 2.5 * 10^-2 s
>
> 在10us 内传输距离为 200 000 000m / 1000 000us*10us = 2km  
>
> 即使有50 个交换机， 增加了 50 * 2 = 100 km  整体影响为  100km/5000km=2%
>
> 所以交换机时间不为主要因素

9. 

> 一共有n+2个事件。 其中事件1到n代表主机在其时间槽成功地使用这条信道，没有产生冲突。 单个主机访问信道的事件的概率为p(1－p)n-1 。事件n+1代表信道空闲，其概率为(1- p)n。事件n+2代表产生冲突。由于n+2个可能发生的事件的概率等于1。 因此由于碰撞而被浪费的时槽的概率为 1 - np(1－p)n - 1 - (1- p)n

10. 

> 使用层次性协议，可以将设计问题，分解成各个更小并且更易于管理的小块。这意味着协议可以更改却不会影响到高层或者低层的协议。可能出现的缺点是虽然单层网络不便于完成和管理，但层次型网络的性能比单层网络要差

12. 

> 报文流和字节流是不同，报文流中，网络会保持信息间的边界，字节流不会。比如，一个进程先发送1024个字节到某个连接，后又再次发送1024个字节，接收者使用报文流读取2048个字节，会接收到2个报文，每个1024字节。如果使用字节流，信息的边界不会被识别，接收者会认为2048个字节是一个整体，这样会造成两个不同信息丢失

15. 

> 在一次传输中，设发生帧损坏的事件为A，不损坏的事件为B
>
> P(A) = p    P(B) = 1- p
>
> 为二项分布    
>
> 平均传输次数为   1 / (1 - p)   次

23. 

> 该图像的总字节数为 ： 1024 * 768 * 3 = 2.4 * 10^6 Byte  (约等于)
>
> 通过56kbps的调制解调器：18874368bit / 56kbps = 337.042s
> 通过1Mbps的线缆调制解调器：18874368bit / 1Mbps = 18.874s
> 通过10Mbps的以太网：18874368bit  /  10Mbps = 1.887s
> 通过100Mbps的以太网：18874368bit / 100Mbps = 0.189s

27. 

> 算法属于协议部分，协议是每层的内部操作，所以不会影响

28. 

> 不会影响到k-1层，会影响到k+1层，k+1层必须重新实现。（下层向上层提供服务）



> ​                                                                                                                          **刘旻钞**