package com.comparable;

import java.io.IOException;
import java.util.UUID;

import org.springframework.web.multipart.MultipartFile;


public class Demo {

	
	public static void main(String[] args) {
		
		
	}
	
	public String uploadImage(String path, File file) throws IOException {
		String name = file.getOriginalFilename();
		String randomID = UUID.randomUUID().toString();
		String fileName1 
		= randomID.concat(name.substring(name.lastIndexOf(".")));
		return fileName1;
		}
}
