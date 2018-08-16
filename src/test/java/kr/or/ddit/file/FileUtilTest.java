package kr.or.ddit.file;

import static org.junit.Assert.*;

import org.junit.Test;

public class FileUtilTest {

	@Test
	public void getFileNameTest() {
		/***Given***/
		String contentDisposition = "form-data; name=\"uploadFile\"; filename=\"sally.png\"";

		/***When***/
		String fileName = FileUtil.getFileName(contentDisposition);

		/***Then***/
		assertEquals("\"sally.png\"", fileName);

	}

}
