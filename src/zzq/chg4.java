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

