package com.webtrixs.healthcheck.helper;
 
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.springframework.util.ResourceUtils;
 
 
 
public class CommonHelper {
 
 
public  static String readRequestFileAsStr(String filePath) throws IOException{
                File file = ResourceUtils.getFile("classpath:"+filePath);
                String json = FileUtils.readFileToString(file);
                return json;
}
 
 
public  static byte[] readRequestFileAsByte(String filePath) {
                File file = null;
                try {
                                file = ResourceUtils.getFile("classpath:"+filePath);
                } catch (FileNotFoundException e) {
                                // TODO Auto-generated catch block
                                e.printStackTrace();
                }
                InputStream is = null;
                try {
                                is = new FileInputStream(file);
                } catch (FileNotFoundException e) {
                                // TODO Auto-generated catch block
                                e.printStackTrace();
                }
                byte[] bytes = null;
                try {
                                bytes = IOUtils.toByteArray(is);
                } catch (IOException e) {
                                // TODO Auto-generated catch block
                                e.printStackTrace();
                }finally {
                                IOUtils.closeQuietly(is);
                }
                return bytes;
}
 
 
public  static InputStream readRequestFileAsInputStream(String filePath) {
                File file = null;
                try {
                                file = ResourceUtils.getFile("classpath:"+filePath);
                } catch (FileNotFoundException e) {
                                // TODO Auto-generated catch block
                                e.printStackTrace();
                }
                InputStream is = null;
                try {
                                is = new FileInputStream(file);
                } catch (FileNotFoundException e) {
                                // TODO Auto-generated catch block
                                e.printStackTrace();
                }
               
                return is;
}
 
 
}