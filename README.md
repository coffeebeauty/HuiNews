# HuiNews
一个简易的android新闻客户端，最近在看第一行代码，打算运用里面所有的知识点。因为工作中其实用不到这么多内容，而要掌握Android还是熟悉下功能比较好。

1. 生命周期日志复习，包括fragment和activity的  17/3/17
2. 使用toast, menu, intent的隐式方法打开网页，拨打电话
3. 使用控件scrollview -- 17/3/21

编程中碰到的问题
1. findviewbyid在activity中可以直接调用，在fragment里没有该方法。所以用activity的方法，但这样不好，其实oncreateview里会返回一个view,view有findviewbyid的方法。然后一定要找到了该view再去查找元素
2. scrollview直接嵌套很高的textview时，上部分被截断，下部分很多空白。但用linearLayout缓冲一下就没问题。用textview的maxlines+scrollbars属性并不能解决该问题。
