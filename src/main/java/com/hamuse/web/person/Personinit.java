package com.hamuse.web.person;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.hamuse.web.proxy.Proxy;
@Component
public class Personinit extends Proxy implements ApplicationRunner {
	private PersonRepository PersonRepository;
	private static final DateFormat df = new SimpleDateFormat("yyyy-mm-dd");
	@Autowired
	public Personinit(PersonRepository PersonRepository) {
		this.PersonRepository = PersonRepository;
	}
	@Override
	public void run(ApplicationArguments args) throws Exception {
		long count = PersonRepository.count();
		if(count == 0) {
			Person person = null;
			
			String[][] mtx = {{"hong", "1", "홍길동", "1980-01-01","M","1","1","90"},
							  {"kim", "1", "김유신", "1980-05-05","M","2","1","60"},
							  {"park", "1", "박지성", "1980-06-05","M","3","1","70"},
							  {"you", "1", "유관순", "1985-09-09","F","2","2","85"},
							  {"han", "1", "한여울", "1989-09-04","F","2","4","100"},
							  {"java", "1", "자바", "1985-07-05","M","3","2","50"},
							  {"maria", "1", "마리아", "1990-07-09","F","3","4","70"},
							  {"mysql", "1", "마이스", "1990-05-09","M","1","4","65"},
							  {"yarn", "1", "얀", "1990-06-05","F","2","4","70"},
							  {"mmm", "1", "엠엠엠", "1990-04-09","M","1","3","40"},
							  {"jan", "1", "장해경", "1989-04-09","F","1","2","100"},
							  { "na", "1", "나도욱",  "1993-06-05", "M", "2" ,"3","35" },
				              { "mo", "1", "모모",  "1994-06-05", "F", "3" ,"4","87" },
				              { "sa", "1", "사나",  "1992-06-05", "F", "2" ,"1","42" },
				              { "ji", "1", "지효",  "1992-06-05", "F", "1" ,"2","98" },
				              { "da", "1", "다현",  "1994-06-05", "F", "3" ,"4","75" },
				              { "jj", "1", "쯔위",  "1996-06-05", "F", "2" ,"3","67" },
				              { "cy", "1", "채영",  "1999-06-05", "F", "1" ,"2","45" },
				              { "na", "1", "나연",  "1995-06-05", "F", "2" ,"1","82" },
				              { "jung", "1", "정연",  "1995-06-05", "F", "3" ,"3","68" },
				              { "mi", "1", "미나",  "1992-06-05", "F", "2" ,"2","47" },
				              { "im", "1", "임꺽정",  "1992-06-05", "M", "1" ,"4","52" },
				              { "iu", "1", "아이유",  "1994-06-05", "F", "2" ,"4","96" },
				              { "you", "1", "유재석",  "1998-06-05", "M", "3" ,"1","37" },
				              { "kim", "1", "김수로",  "1990-06-05", "M", "2" ,"3","83" },
				              { "jo", "1", "조세호",  "1991-06-05", "M", "2" ,"2","72" },
				              { "yang", "1", "양세찬",  "1999-06-04", "M", "3" ,"2","95"}};
			/*Person p2 = new Person();
			String[] hong = {"hong", "1", "홍길동", "1980-01-01"};
			String[] kim = {"kim", "1", "김유신", "1980-05-05"};*/
			
			for(String[] arr : mtx) {
				person = new Person();
				person.setUserid(arr[0]);
				person.setPasswd(arr[1]);
				person.setName(arr[2]);
				person.setBirthday(df.parse(arr[3]));
				person.setGender(arr[4]);
				person.setHak(integer(arr[5]));
				person.setBan(integer(arr[6]));
				person.setScore(integer(arr[7]));
				PersonRepository.save(person);
			}
			
			/*for(int i=0; i<mtx.length; i++) {
				person = new Person();
				person.setUserid(mtx[i][0]);
				person.setPasswd(mtx[i][1]);
				person.setName(mtx[i][2]);
				person.setBirthday(df.parse(mtx[i][3]));
				PersonRepository.save(person);
			}*/
		}
	}
}