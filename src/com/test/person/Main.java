package com.test.person;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Main {

	public static void main(String[] args) {
		// ����Ƿ񴴽��ļ���
		String folder = "D:\\MyEclipse 2015\\workspaces\\IO\\src\\file\\";
		File file_folder = new File(folder);
		if(!file_folder.exists()){
			file_folder.mkdirs();
		}
		// �����ļ�
		String fileName = "file.txt";
		try {
			// ����txt�ļ�
			FileOutputStream fos = new FileOutputStream(new File(folder+fileName));
			// д������
			String writerContent = "�µ�����";
			fos.write(writerContent.getBytes());
			// ��ȡ����
			FileInputStream fis = new FileInputStream(new File(folder+fileName));
			int length = fis.available();
			byte[] array = new byte[length];
			fis.read(array);
			if(fis!=null) fis.close();
			String contentStr = new String(array);
			System.out.println("��ȡ�ļ����ݣ�"+contentStr);
		} catch (Exception e) {
		}
	}
}