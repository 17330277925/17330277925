# 17330277925
实验目的
掌握字符串String及其方法的使用
掌握异常处理结构
业务要求
内容:
利用己学的字符串处理知识编程完成《长恨歌》古诗的整理对齐工作,写出
功能函数,并运行。达到如下功能
1.每7个汉字加入一个标点符号,奇数时加“,”,偶数时加“。”
2.允许提供输入参数,统计古诗中某个字或词出现的次数
3.考虑操作中可能出现的异常,在程序中设计异常处理程序
输入:
汉皇重色思倾国御宇多年求不得杨家有女初长成养在深闺人未识天生丽质难
自弃一朝选在君王侧回眸一笑百媚生六宫粉黛无颜色春寒赐浴华清池温泉水滑洗凝
脂侍儿扶起娇无力始是新承恩泽时云鬓花颜金步摇芙蓉帐暖度春宵春宵苦短日高起
从此君王不早朝承欢青宴无闲暇春从春游夜专夜后宫佳丽三千人三千宠爱在一身金
屋妆成娇侍夜玉楼宴罢醉和春姊妹弟兄皆列土可怜光采生门户遂令天下父母心不重
生男重生女骊宫高处入青云仙乐风飘处处闻缓歌慢舞凝丝竹尽日君王看不足渔阳鼙
鼓动地来惊破霓裳羽衣曲九重城阙烟尘生千乘万骑西南行<未完,待续>
输出:
汉皇重色思倾国,御宇多年求不得
杨家有女初长成,养在深闺人未识。

天生丽质难自弃,一朝选在君王侧。
回眸一笑百媚生,六宫粉黛无颜色。
春寒赐浴华清池,温泉水滑洗凝脂。
侍儿扶起娇无力,始是新承恩泽时。
云鬓花颜金步摇,芙蓉帐暖度春宵。
春宵苦短日高起,从此君王不早朝。
……
注意:
输入的内容,利用min方法中的args数组传递
流程图：










代码：
package zzq;

public class chg1 {

	public static void main(String[] args) {
		chg3 c = new chg3();
		String str = new String("汉皇重色思倾国御宇多年求不得杨家有女初长成养在深闺人未识天生丽质难自弃一朝选在君王侧回眸一笑百媚生六宫粉黛无颜色春寒赐浴华清池温泉水滑洗凝脂侍儿扶起娇无力始是新承恩泽时云鬓花颜金步摇芙蓉帐暖度春宵春宵苦短日高起从此君王不早朝承欢侍宴无闲暇春从春游夜专夜后宫佳丽三千人三千宠爱在一身金屋妆成娇侍夜玉楼宴罢醉和春姊妹弟兄皆列士可怜光采生门户遂令天下父母心不重生男重生女骊宫高处入青云仙乐风飘处处闻缓歌慢舞凝丝竹尽日君王看不足渔阳鼙鼓动地来惊破霓裳羽衣曲九重城阙烟尘生千乘万骑西南行翠华摇摇行复止西出都门百余里六军不发无奈何宛转蛾眉马前死花钿委地无人收翠翘金雀玉搔头君王掩面救不得回看血泪相和流黄埃散漫风萧索云栈萦纡登剑阁峨嵋山下少人行旌旗无光日色薄蜀江水碧蜀山青圣主朝朝暮暮情行宫见月伤心色夜雨闻铃肠断声天旋地转回龙驭到此踌躇不能去马嵬坡下泥土中不见玉颜空死处君臣相顾尽沾衣东望都门信马归归来池苑皆依旧太液芙蓉未央柳芙蓉如面柳如眉对此如何不泪垂春风桃李花开日秋雨梧桐叶落时西宫南内多秋草落叶满阶红不扫梨园弟子白发新椒房阿监青娥老夕殿萤飞思悄然孤灯挑尽未成眠迟迟钟鼓初长夜耿耿星河欲曙天鸳鸯瓦冷霜华重翡翠衾寒谁与共悠悠生死别经年魂魄不曾来入梦临邛道士鸿都客能以精诚致魂魄为感君王辗转思遂教方士殷勤觅排空驭气奔如电升天入地求之遍上穷碧落下黄泉两处茫茫皆不见忽闻海上有仙山山在虚无缥渺间楼阁玲珑五云起其中绰约多仙子中有一人字太真雪肤花貌参差是金阙西厢叩玉扃转教小玉报双成闻道汉家天子使九华帐里梦魂惊揽衣推枕起徘徊珠箔银屏迤逦开云鬓半偏新睡觉花冠不整下堂来风吹仙袂飘飖举犹似霓裳羽衣舞玉容寂寞泪阑干梨花一枝春带雨含情凝睇谢君王一别音容两渺茫昭阳殿里恩爱绝蓬莱宫中日月长回头下望人寰处不见长安见尘雾惟将旧物表深情钿合金钗寄将去钗留一股合一扇钗擘黄金合分钿但教心似金钿坚天上人间会相见临别殷勤重寄词词中有誓两心知七月七日长生殿夜半无人私语时在天愿作比翼鸟在地愿为连理枝天长地久有时尽此恨绵绵无绝期");
		c.A(str);
		try {
			chg4 t= new chg4();
			t.T(str,"生");
		}
		catch(chg2 e) {
			System.out.println("统计的汉字不存在！");
		}
		// TODO Auto-generated method stub

	}

}
package zzq;

public class chg2 extends Exception{
	chg2(String s) {
		System.out.println(s);
	}

}
package zzq;

public class chg3 {
	public void A(String string) {
		int x=0;
		int y=7;
		int p=7;
		int q=14;
		int m;
		String a[]=new String[34];
	for(int i=0;i<34;i=i+2) {
		a[i]=string.substring(x,y);
		m=i+1;
		a[m]=string.substring(p,q);
		System.out.print(a[i]+"."+a[m]+"."+"\n");
		x=x+14;
		y=y+14;
		p=p+14;
		q=q+14;
	}
	}
}
package zzq;

public class chg4 {
	public void T(String string1,String string2) throws chg2{
		int r1,r2,s=0;
		for(int i=0;i<100;i++) {
			r1=string1.indexOf(string2);
			if(r1==-1)
				break;
			string1 = string1.substring(r1+1,string1.length()-1);
			s++;
		}
		if(s==0) {
			chg2 e=new chg2("抛出异常");
			throw e;
		}
		System.out.print("\n"+string2+"字出现的字数为："+s);
			
		}
	}

代码截图：
  https://github.com/17330277925/17330277925
流程图






运行结果：

实验感想：
这次的实验对我来说，还是有难度的，在通过询问同学和自己翻书查阅资料，终于明白了它们的用法。
这也说明我的编程能力还差的远，我不能将自己现学的东西和知识融会贯通。我在这一方面还需要更多的努力。还有，我们可以适当地利用网络资源，去学习编程的思想以及代码的每一处的意义。
