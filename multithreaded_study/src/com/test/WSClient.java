package com.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @date 2013-01-17
 * @author Administrator
 * @category 远程访问WebService获取数据并转化返回为XML
 */
public class WSClient {
	private String uploadPcrf(String xml) {
		String urlString = "http://ufsea/SeaService/SEAPersonService/SEAPersonService.asmx";
		String soapActionString = "http://tempuri.org/CheckPersonByDomainAccount";
		HttpURLConnection httpConn = null;
		OutputStream out = null;
		String returnXml = "";

		// 设置批次号

		System.out.println("开始");
		try {
			httpConn = (HttpURLConnection) new URL(urlString).openConnection();
			httpConn.setRequestProperty("Content-Type", "text/xml; charset=utf-8");
			httpConn.setRequestProperty("SOAPAction", soapActionString);
			httpConn.setRequestMethod("POST");
			httpConn.setDoOutput(true);
			httpConn.setDoInput(true);
			httpConn.connect();
			out = httpConn.getOutputStream(); // 获取输出流对象
			httpConn.getOutputStream().write(xml.getBytes()); // 将要提交服务器的SOAP请求字符流写入输出流
			out.flush();
			out.close();
			int code = httpConn.getResponseCode(); // 用来获取服务器响应状态
			String tempString = null;
			StringBuffer sb1 = new StringBuffer();
			if (code == HttpURLConnection.HTTP_OK) {
				BufferedReader reader = new BufferedReader(new InputStreamReader(httpConn.getInputStream(), "UTF-8"));
				while ((tempString = reader.readLine()) != null) {
					sb1.append(tempString);
				}
				if (null != reader) {
					reader.close();
				}
			} else {
				BufferedReader reader = new BufferedReader(new InputStreamReader(httpConn.getErrorStream(), "UTF-8"));
				// 一次读入一行，直到读入null为文件结束
				while ((tempString = reader.readLine()) != null) {
					sb1.append(tempString);
				}
				if (null != reader) {
					reader.close();
				}
			}
			// 响应报文
			returnXml = sb1.toString();
			System.out.println("结束");
		} catch (Exception e) {
		}
		return returnXml;
	}

	public static void main(String[] args) {

		//参数
		String domainAccount = "liuwma";

		String xml = "<?xml version=\"1.0\" encoding=\"utf-8\"?>"
				+ "<soap:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">"
				+ "<soap:Body>" + "<CheckPersonByDomainAccount xmlns=\"http://tempuri.org/\">" + "<AccountName>"
				+ domainAccount + "</AccountName>" + "</CheckPersonByDomainAccount>" + "</soap:Body>"
				+ "</soap:Envelope>";
		String r = new WSClient().uploadPcrf(xml);
		//检查返回值
		Pattern p = Pattern.compile("<[^>]+>");
		Matcher m = p.matcher(r);
		
		System.out.println(m.replaceAll(""));

	}
}