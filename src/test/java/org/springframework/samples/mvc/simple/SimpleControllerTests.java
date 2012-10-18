package org.springframework.samples.mvc.simple;

import static org.springframework.test.web.mock.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.mock.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.mock.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.mock.servlet.setup.MockMvcBuilders.standaloneSetup;

import org.junit.Test;
//@webcontext
//@context(file:....)

public class SimpleControllerTests {

	//private MockMvc mockMvc;

	// this.mockMvc = standalone......
	@Test
	public void simple() throws Exception {
		standaloneSetup(new SimpleController()).build()
			.perform(get("/simple"))
			.andExpect(status().isOk())
			.andExpect(content().contentType("text/plain;charset=ISO-8859-1"))
			.andExpect(content().string("Hello world!"));
	}

}
