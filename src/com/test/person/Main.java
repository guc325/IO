package com.test.person;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Main {

	public static void main(String[] args) {
		// 检查是否创建文件夹
		String folder = "D:\\MyEclipse 2015\\workspaces\\IO\\src\\file\\";
		File file_folder = new File(folder);
		if(!file_folder.exists()){
			file_folder.mkdirs();
		}
		// 创建文件
		String fileName = "file.txt";
		try {
			// 创建txt文件
			FileOutputStream fos = new FileOutputStream(new File(folder+fileName));
			// 写入内容
			String writerContent = "新的内容";
			fos.write(writerContent.getBytes());
			// 读取内容
			FileInputStream fis = new FileInputStream(new File(folder+fileName));
			int length = fis.available();
			byte[] array = new byte[length];
			fis.read(array);
			if(fis!=null) fis.close();
			String contentStr = new String(array);
			System.out.println("读取文件内容："+contentStr);
		} catch (Exception e) {
		}
	}
}