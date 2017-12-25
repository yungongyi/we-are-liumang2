package cn.tuyuan.commonweal.test;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.tuyuan.commonweal.pojo.TableManage;
import cn.tuyuan.commonweal.pojo.Type;
import cn.tuyuan.commonweal.service.TableManageService;
import cn.tuyuan.commonweal.service.TypeService;

public class TestType {

	
private static ApplicationContext app;
	
	@Before
	public  void  before() throws Exception {
		app=new ClassPathXmlApplicationContext("applicationContext.xml");
	}

	@Test
	public void test() {
		try {
			TypeService tb=(TypeService) app.getBean("typeService");
			List<Type> li=tb.getTypeByTableId(6);
			System.out.println(li.size());
			for(Type l:li){
				System.out.println(l.getTypeName()+"\t"+l.getTypeId()+"\t"+l.getTableId());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
