package com.onlineinteract.model;

import static org.junit.Assert.assertThat;
import static org.junit.matchers.JUnitMatchers.containsString;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ExtendableBeanTest {

	@Test
	public void whenSerializingUsingJsonAnyGetter_thenCorrect() throws JsonProcessingException {
		ExtendableBean bean = new ExtendableBean("My bean");
		bean.add("attr1", "val1");
		bean.add("attr2", "val2");
		String result = new ObjectMapper().writeValueAsString(bean);
		System.out.println(result);
		assertThat(result, containsString("attr1"));
		assertThat(result, containsString("val1"));
	}

}
