package com.onlineinteract.model;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.matchers.JUnitMatchers.*;

import java.io.IOException;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class MyDtoTest {

	@Test
	public void givenFieldIsIgnoredByName_whenDtoIsSerialized_thenCorrect() throws JsonParseException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		MyDto dtoObject = new MyDto();
		dtoObject.setStringValue("abc");
		dtoObject.setIntValue(12);
		dtoObject.setBooleanValue(true);
		String dtoAsString = mapper.writeValueAsString(dtoObject);
		assertThat(dtoAsString, not((containsString("intValue"))));
		System.out.println(dtoAsString);
	}

}
