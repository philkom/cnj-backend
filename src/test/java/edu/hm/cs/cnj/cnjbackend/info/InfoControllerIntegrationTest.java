package edu.hm.cs.cnj.cnjbackend.info;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.*;
import static org.mockito.BDDMockito.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class InfoControllerIntegrationTest {

	@MockBean
	InfoProperties infoProperties;

	@Autowired
	InfoController serviceUnderTest;
	
	private final String message = "TestMessage";
	
	@Test
	public void testInfoMessage() {
		given(this.infoProperties.getMessage()).willReturn(message);
		Info info = serviceUnderTest.getInfo();
		assertThat(info.getMessage()).isEqualTo(message);
	}
}
