package handler;

import java.io.File;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FileHandler 
{
	private static final Logger log = LoggerFactory.getLogger(FileHandler.class);
		   
	//파일이름과 경로를 받아서 파일을 삭제하는 메서드 작성
	//리턴타입 int(isOk) 잘 삭제 했는지 체크하기 위한 변수
	public int deleteFile(String imageFileName, String savePath) 
	{
		      boolean isDel = true; // 삭제가 잘 이루어 지는지 체크
		      log.info("ImageFileName : "+imageFileName);
		      
		      File fileDir = new File(savePath);
		      File removeFile = new File(fileDir+File.separator+imageFileName);
		      File removeThFile = new File(fileDir+File.separator+"_th_"+imageFileName);
		      
		      //현재 시점에서 삭제하고자 하는 파일이 있어야 삭제(존재해야 삭제)
		      if(removeFile.exists() || removeThFile.exists()) 
		      {
		         isDel = removeFile.delete(); //boolean 형태로 리턴
		         log.info(">>del:"+(isDel? "ok":"file"));
		         if(isDel)
		         {
		        	 isDel=removeThFile.delete();
		        	 log.info(">>thFile del:"+(isDel? "ok":"file"));
		         }
		      }
		      log.info("remove File Ok");
		      return isDel ? 1:0;
	}

}
