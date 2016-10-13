package com.example.administrator.calculator;

/**
 * Created by Administrator on 2016/10/23.
 */
public class Resultclass {
    public void Result(double num[],char ch[],int numendlong,int chengchu)
    {
        int i=0;int j=0;int chengchushu=0;
        do {
            do {
                for(i=0;i<numendlong;i++)
                {
                    if(ch[i]=='*'||ch[i]=='/')
                    {
                        if(ch[i]=='*')
                            num[i]=num[i]*num[i+1];
                        else
                            num[i]=num[i]/num[i+1];
                        for(j=i+1;j<numendlong;j++)
                        {
                            num[j]=num[j+1];
                            ch[j]=ch[j+1];
                        }
                        num[numendlong]='0';
                        ch[numendlong]='?';
                        numendlong--;
                        chengchushu++;
                    }
                }
            }while (chengchushu<chengchu);
            for(i=0;i<numendlong;i++)
            {
                if(ch[i]=='+'||ch[i]=='-')
                {
                    if(ch[i]=='+')
                        num[i]=num[i]+num[i+1];
                    else
                        num[i]=num[i]-num[i+1];
                    for(j=i+1;j<numendlong;j++)
                    {
                        num[j]=num[j+1];
                        ch[j]=ch[j+1];
                    }
                    num[numendlong]=0;
                    ch[numendlong]='?';
                    numendlong--;
                }
            }
        }while (ch[0]!='?'&&ch[1]!='?');
    }
}
