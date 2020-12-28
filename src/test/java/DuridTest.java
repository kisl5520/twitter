import javax.annotation.Resource;
import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.kisl.twitter.KislSpringbootApplication;

import lombok.extern.slf4j.Slf4j;

@SpringBootTest(classes = KislSpringbootApplication.class)
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@Slf4j
public class DuridTest {

	@Resource   
    private DataSource dataSource; 
	
	@Test   
	public void testConnection() throws Exception{    
		log.info("数据源dataSource: " + this.dataSource.getConnection());
	}
}
