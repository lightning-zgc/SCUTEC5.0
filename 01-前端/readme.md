# 腾讯俱乐部TEC5.0 | 技术面试题 #
> <p style="text-align:right;">——前端类题目</p>

## Canvas技术初探——沙盒弹力球 ##
- - -
-  背景简介  
2005年，一组前端技术的组合Ajax悄然问世。此后，随着Ajax应用的迅速普及，新Web时代的帷幕也徐徐拉开。仅几年间，各种“桌面般的”Web应用程序和新Web平台如雨后春笋。从Google Maps、Flickr、Netflix到Google Docs、Yahoo! Mail、Gmail，再到Twitter、Facebook、Digg……如今，现代Web发展的成果已经蔚为大观。  
界面，不仅是现代Web应用与传统Web应用程序的分水岭，也是曾经横亘于传统Web应用程序与桌面应用程序之间的一道难以逾越的“鸿沟”。然而，如今的前端技术日新月异，现代Web应用程序的界面展示了堪与桌面应用媲美的耀眼风姿。  
其中，“动画”是一个重要的部分，基于Flash的动画曾经风靡网络。不过，这种情况正在改变，Canvas就是Flash的一种替代方案。
- Canvas简介  
Canvas是 HTML5 新增的元素，可使用JavaScript脚本来绘制图形。例如：画图，合成照片，创建动画甚至实时视频处理与渲染。
- 任务描述  
  1. 基本任务  
    - 请使用Canvas以及JavaScript创建一个简单的Web前端界面，要求点击画布中任意一点可产生一个小球，小球具有随机的颜色、初速度（矢量）、加速度（矢量），小球碰撞边缘可被反弹，每一次反弹会损失10%的速度，小球的加速度会在速度达到一个预值时消失，这个值可以自定义，但是要求肉眼可辨识（既：我们可以看出你的小球速度有上限）。不考虑小球间的碰撞。“index.html”是给出的基本HTML页面结构框架，你也可以以任何其他方式来实现Canvas页面。  
  2. 加成任务
    - 考虑小球之间的碰撞
    - 取消小球的随机初速度、随机加速度、相互作用力（不检测碰撞），假设小球带电，考虑Canvas空间内存在周期性变化的电场，电场强度E=2V/m，小球电荷量Q=+2C，Canvas空间比例尺为1px=10m，电场方向初始为由下至上，每10次运算后方向反向，不考虑小球之间的作用力。
    - 在上一问的基础上，考虑小球之间的作用力，既考虑小球之间的碰撞也要考虑电荷间作用。
- Demo  
详情请见同目录下的Gif文件
![](./Demo.gif)  
- 参考资料  
为了方便大家学习，我们建议性地给出一些参考资料，但是请不要依赖于以下资料，请大显身手展示你的能力吧！  
>- https://developer.mozilla.org/en-US/docs/Web/API/Canvas_API  
>- http://wiki.jikexueyuan.com/project/html5/canvas.html
>- http://www.runoob.com/html/html5-canvas.html
>- http://www.xyhtml5.com/html5-canvas-event-handler.html  
