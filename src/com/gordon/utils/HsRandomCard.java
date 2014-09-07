package com.gordon.utils;

import java.util.HashMap;
import java.util.Map;

public class HsRandomCard 
{	
	public static void main(String[]args)
	{
		String[]cards={"�»���","����","צ��","��Ȼƽ��","Ұ��֮��","��ŭ","Ұ��֮��","Ұ��ӡ��",
				"Ұ�Գɳ�","����֮��","��Ȼӡ��","Ұ������","����֮��","�����ػ���","�綾֮��","˺ҧ",
				"��ɨ","��צ��³��","�ǳ�׹��","����","�ǻ���","��Ȼ֮��","ս������","֪ʶ����","��¡�Ϳ˱�����","������˹",
				"����ӡ��","�������","ɭ����","������","��ҰŬ��","������","׷����","��������",
				"��������","��ը����","�ѻ�","��","ʳ������","������ͺ��","���ŷŹ�","������",
				"ɱ¾����","�������","ӥ�ǹ�","�������","ѱ��ʦ","��ը���","̦ԭϬţ","��ԭʨ","�Ƕ�ʿ�ĳ���","��������³ʲ",
				"��ǹ","�µ�","����","����","������","��ͽ","ħ��","��˪����",
				"����","�����ǻ�","����","����","����","����","������","����",
				"����ʵ��","��׶","��","ˮԪ��","����","����","����ѩ","������","����","�ױ�",
				"���ۻ���","����֮��","����ף��","ʥ������","����","�������","���","����",
				"�ǻ�ף��","ǫѷ","ʥ��","��ƽ","����������","����֮��","�ǹ�","���",
				"����","��ŭ֮��","������","��ף������ʿ","Ԫ����","����֮ŭ","����","ʥ��","��",
				"��Ĭ","��","����","�Ļ�"	,"�����ӽ�","��������","���","Ȫ",
				"�ı�","ʹ","��ʥ֮��","��ȡ","��Ӱ","��","��ͽ","��ҫ",
				"�½���","����","��Ӱ����","Ⱥ��","��ʥ����","ʥ��","��ʥ֮��","�ؽ�	","ά��","����",
				"�j������","��Ӱ��","����","��Ѫ","ӰϮ","��ҩ","����","�̹�",
				"��������","����","���ĵĴ̿�","����","�Ϸ���","�ƹ�","��7","����",
				"����֮��","��","��­","αװ��ʦ","��ŭ�Ͷ�","�̿�֮��","��ɱ","�ٳ���","��ʧ","����",
				"��������","ͼ��֮��","����","���","������	","��ħ","ʯ������","�����",
				"����֮��","����","ת��","�׸�","��Ŭ","����","�޻�","��Ͱ",
				"���ұ���","�ӽ���","�ǻ�","����籩","������","��Ѫ","��Ԫ��","����֮��","��Ԫ��","������",
				"����","������Լ","��������","��������","����С��","��ʴ��","�������","��ѪС��",
				"��ħ��","��ħ","��ȡ����","��ħ��ʿ","��֪��ħ","��Ӱ��","��ħ","��ħ��",
				"��������","��Ӱ����","��Ԩ����	","�����ٻ���","ĩ������","ĩ���ֻ�","������","����","Ť�����","����",
				"ŭ������","����","նɱ","����ն","����","�๤","����ŭ��","ս��ŭ��",
				"�㸫","��","�ͻ�","Ӣ�´��","����ʦ","˳��ն","���","ս��",
				"���ҿ�սʿ","�ܽ�","�⿨¡","����֮ҧ","����","����ϣ","�½�","�Ҷ�","Ѫ��","�Ϻ�",
				"����","�Ϻ�����","����","ʥ�⻤����","�����ػ���","��ҽ","����","����ӥ",
				"��","�ֶ�","������֪","������͸��","��","AC","���ý�ʬ","Ѫ������",
				"����","11��","����","�����г���","ɱ��з","����Ϯ����","���","�Ϲ�",
				"����","С����","��������","��ͽ","С��è","����","ս��Ʒ","��ŭ",
				"ĩ��Ԥ����","����Թ��","����","����","����ʦ","��ͷ","ը����","����",
				"��ѧѧ","���ȷ籩","������","����","����","����","֩����","Ѫ��Ϯ����",
				"Ѹ����","Ѫ��","���ǵ�ʳʬ��","С��","èͷӥ","����ʦ","������","˪�ǲ���",
				"�ɵ�","����������","ħ�","Ѫ���г���","�����Ա�","����","�굶","�Ϻ�����",
				"�ų�","���֮����֪","��������","������֪","��������","С���ٻ���","�ҽ���ŭ��","ʯ���",
				"�󹤽�","�۾���","����","���ǳ�","��ŭ������","��������","ţͷ��սʿ","����",
				"����","���������˾","�¿���","130","�ɿ�����˹֮Ӱ","����ʳʬ��","�趯֮��","��ʹ",
				"������","ʮ�־�","Ѫ��","��ʥ","����Ȼ","��¯��","������","����",
				"�������","����","������","ѩ��","���������","�����ķ�ʦ","����è","�ֲ�����",
				"ĺ������","�������ʿ","��������","ɭ��","����","����","�Ʒ�","������",
				"��","��Ϲ��","ϴ��","���³�","����˹","ʳ��ħ��ʦ","ħ��ɽ","����",
				"�ӻ�ɭ","������ʲ","����ɭ","ҹ��","������","����","˹������","����",
				"�ɼ�","����������","Ģ��","����������","�ƶ�","����֮����ʿ","��������","��Ӣţͷ���ϳ�",
				"��Ƥ����","�ϻ�","�ر����屣��","�Ѷ���","��ì","˪�Ƕ���","��Ͷ","������ʿ",
				"������","��˪Ԫ��","��ţ","��ʦ","Ů��","�����","��˹","ĸţ",
				"PDD","����","��¶��","����˹��","ŵɭ��","����","����","�����",
				"����","��ս����","���Ļ���","�������ʿ","95֮��","�Ӷ�","�Ͽ�","��³��",
				"����˿","��ɪ��","�����ϣ��","����","����","����","����֮��","������","ɽ��","�ۺ�"};		
		
				int size=cards.length;
				System.out.println(size);
				for(int i=0;i<size;i++)
				{
					int n=i+(int)(Math.random()*(size-i));					
					String tmp=cards[i];
					cards[i]=cards[n];
					cards[n]=tmp;
					System.out.println(cards[i]);
				}
				
				Map<String,Integer>map=new HashMap<String,Integer>();
				for(int i=0;i<size;i++)
				{
					map.put(cards[i],1);
				}
				System.out.println(map.size());
	}

}

