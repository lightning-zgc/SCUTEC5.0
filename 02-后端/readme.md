# 腾讯俱乐部TEC5.0 | 技术面试题 #
> <p style="text-align:right;">——后端类题目</p>

## Golang从入门到放弃——简单的图像处理服务器 ##
- - -
-  背景简介  
Go，为了方便浏览器和识别，部分人称其为 Golang，是Google开发的一种静态强类型、编译型，并发型，并具有垃圾回收功能的编程语言。  
罗伯特·格瑞史莫，罗勃·派克（Rob Pike）及肯·汤普逊于2007年9月开始设计 Go 语言，稍后 Ian Lance Taylor, Russ Cox 加入项目中。Go 语言是基于 Inferno 操作系统所开发的。Go 语言于2009年11月正式宣布推出，成为开放源代码项目，并在 Linux 及 Mac OS X 平台上进行了实现，后追加 Windows 系统下的实现。  
- 任务描述  
  1. 基本任务  
    - 请使用Go语言，建立一个简答的服务器，可以接受用户上传的图片并存储在本地，同时将处理之后的图片返回给用户，要求返回给用户的图片必须经过处理，你可以进行镜像、映像、像素化等等处理，效果越炫酷面试官会越愉悦，上传需要使用的前端模板已经给出在“index.html”中，推荐使用ImageMagick对图片进行处理。
  2. 加成任务
    - 返回所有已保存文件的列表，推荐使用数据库存储文件名，并提供原图以及处理后图片下载功能。
    - 在上一问的基础上，对储存的文件进行查重，仅仅保存一份文件，但是记录两次上传文件的文件名（如果文件名冲突则只算作一个文件）。
    - 在上一问的基础上，文件分片保存，使用数据库建立对文件片的索引。
- 参考资料  
为了方便大家学习，我们建议性地给出一些参考资料，但是请不要依赖于以下资料，请大显身手展示你的能力吧！  
IDE推荐JetBrains的Gogland(https://www.jetbrains.com/go/)
>- https://golang.org/  
>- http://golangtc.com/  
>- https://www.reddit.com/r/golang/  
>- https://github.com/astaxie/build-web-application-with-golang/blob/master/zh/03.2.md
