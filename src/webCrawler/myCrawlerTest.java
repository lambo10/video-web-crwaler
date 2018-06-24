package webCrawler;
import java.io.*; 
import java.net.*; 
import java.util.*; 
import java.util.regex.*; 
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.util.Scanner;

public class myCrawlerTest {
public static String butName = null;
public String []CrawledList = new String[10];
public static Boolean crawling = false;
	private static String downloadPage(URL pageUrl) { 
		try { 
		BufferedReader reader = new BufferedReader(new InputStreamReader( pageUrl.openStream()));
	
		String line; StringBuffer pageBuffer = new StringBuffer(); while ((line = reader.readLine()) != null) { pageBuffer.append(line); }
	return pageBuffer.toString(); } catch (Exception e) { }
	return null;
	}
	
	public static String removeWwwFromUrl(String url) {
		int index = url.indexOf("://www."); 
		if (index != -1) { 
			return url.substring(0, index + 3) + url.substring(index + 7); 
		}
	return (url);
	}
	
	private static URL verifyUrl(String url) {
		if (!url.toLowerCase().startsWith("http://")) return null;
			URL verifiedUrl = null; try { verifiedUrl = new URL(url); } catch (Exception e) { return null; }
		return verifiedUrl;
		}
	
	
	public static ArrayList<String> checkVideoLinks(String StringUrl) throws IOException{
		ArrayList<String> linkList = new ArrayList<String>();
		URL pageUrl =  new URL(StringUrl);
		 Document doc = Jsoup.connect(StringUrl).get();
		 Elements media = doc.select("[src]");
		 Elements herfVidLinks = doc.select("a[href]");
		 
		 for (Element src : media) {
			 String link = src.attr("abs:src");
			 String webContent = link;
			 Pattern p;
				Matcher m;
				
				
				if (link.length() < 1) { 
					continue; 
				}
				
				if (link.charAt(0) == '#') { 
					continue;
					}
				
				if (link.indexOf("mailto:") != -1) { 
					continue;
					}
				
				if (link.indexOf("tel:") != -1) { 
					continue;
					}
				
				if (link.toLowerCase().indexOf("javascript") != -1) { 
					continue; 
					}
				int countHHRT = 0;
				
				 p = Pattern.compile("\\b.mp4\\b", Pattern.CASE_INSENSITIVE); 
				 m=p.matcher(webContent);
				 while (m.find()) { 
					 countHHRT++;
				 }
				 


				 p = Pattern.compile("\\b.ogg\\b", Pattern.CASE_INSENSITIVE); 
				 m=p.matcher(webContent);
				 while (m.find()) { 
					 countHHRT++;
				 }
				 
				 
				 p = Pattern.compile("\\b.webm\\b", Pattern.CASE_INSENSITIVE); 
				 m=p.matcher(webContent);
				 while (m.find()) { 
					 countHHRT++;
				 }
				 
				 
				 p = Pattern.compile("\\b.mkv\\b", Pattern.CASE_INSENSITIVE); 
				 m=p.matcher(webContent);
				 while (m.find()) { 
					 countHHRT++;
				 }
				 
				 
				 
				 p = Pattern.compile("\\b.flv\\b", Pattern.CASE_INSENSITIVE); 
				 m=p.matcher(webContent);
				 while (m.find()) { 
					 countHHRT++;
				 }
				 
				 
				 
				 p = Pattern.compile("\\b.vob\\b", Pattern.CASE_INSENSITIVE); 
				 m=p.matcher(webContent);
				 while (m.find()) { 
					 countHHRT++;
				 }
				 
				 
				 p = Pattern.compile("\\b.ogv\\b", Pattern.CASE_INSENSITIVE); 
				 m=p.matcher(webContent);
				 while (m.find()) { 
					 countHHRT++;
				 }
				 
				 
				 p = Pattern.compile("\\b.drc\\b", Pattern.CASE_INSENSITIVE); 
				 m=p.matcher(webContent);
				 while (m.find()) { 
					 countHHRT++;
				 }
				 


				 p = Pattern.compile("\\b.mng\\b", Pattern.CASE_INSENSITIVE); 
				 m=p.matcher(webContent);
				 while (m.find()) { 
					 countHHRT++;
				 }
				 
				 
				 p = Pattern.compile("\\b.avi\\b", Pattern.CASE_INSENSITIVE); 
				 m=p.matcher(webContent);
				 while (m.find()) { 
					 countHHRT++;
				 }
				 
				 
				 p = Pattern.compile("\\b.mov\\b", Pattern.CASE_INSENSITIVE); 
				 m=p.matcher(webContent);
				 while (m.find()) { 
					 countHHRT++;
				 }
				 
				 
				 
				 p = Pattern.compile("\\b.qt\\b", Pattern.CASE_INSENSITIVE); 
				 m=p.matcher(webContent);
				 while (m.find()) { 
					 countHHRT++;
				 }
				 
				 
				 
				 p = Pattern.compile("\\b.wmv\\b", Pattern.CASE_INSENSITIVE); 
				 m=p.matcher(webContent);
				 while (m.find()) { 
					 countHHRT++;
				 }
				 
				 
				 p = Pattern.compile("\\b.yuv\\b", Pattern.CASE_INSENSITIVE); 
				 m=p.matcher(webContent);
				 while (m.find()) { 
					 countHHRT++;
				 }
				 
				 
				 
				 p = Pattern.compile("\\b.rm\\b", Pattern.CASE_INSENSITIVE); 
				 m=p.matcher(webContent);
				 while (m.find()) { 
					 countHHRT++;
				 }
				 


				 p = Pattern.compile("\\b.rmvb\\b", Pattern.CASE_INSENSITIVE); 
				 m=p.matcher(webContent);
				 while (m.find()) { 
					 countHHRT++;
				 }
				 
				 
				 p = Pattern.compile("\\b.asf\\b", Pattern.CASE_INSENSITIVE); 
				 m=p.matcher(webContent);
				 while (m.find()) { 
					 countHHRT++;
				 }
				 
				 
				 p = Pattern.compile("\\b.amv\\b", Pattern.CASE_INSENSITIVE); 
				 m=p.matcher(webContent);
				 while (m.find()) { 
					 countHHRT++;
				 }
				 
				 
				 
				 p = Pattern.compile("\\b.m4p\\b", Pattern.CASE_INSENSITIVE); 
				 m=p.matcher(webContent);
				 while (m.find()) { 
					 countHHRT++;
				 }
				 
				 
				 
				 p = Pattern.compile("\\b.m4v\\b", Pattern.CASE_INSENSITIVE); 
				 m=p.matcher(webContent);
				 while (m.find()) { 
					 countHHRT++;
				 }
				 
				 
				 p = Pattern.compile("\\b.mpg\\b", Pattern.CASE_INSENSITIVE); 
				 m=p.matcher(webContent);
				 while (m.find()) { 
					 countHHRT++;
				 }
				 
				 
				 
				 
				 p = Pattern.compile("\\b.mp2\\b", Pattern.CASE_INSENSITIVE); 
				 m=p.matcher(webContent);
				 while (m.find()) { 
					 countHHRT++;
				 }
				 


				 p = Pattern.compile("\\b.mpeg\\b", Pattern.CASE_INSENSITIVE); 
				 m=p.matcher(webContent);
				 while (m.find()) { 
					 countHHRT++;
				 }
				 
				 
				 p = Pattern.compile("\\b.mpe\\b", Pattern.CASE_INSENSITIVE); 
				 m=p.matcher(webContent);
				 while (m.find()) { 
					 countHHRT++;
				 }
				 
				 
				 p = Pattern.compile("\\b.mpv\\b", Pattern.CASE_INSENSITIVE); 
				 m=p.matcher(webContent);
				 while (m.find()) { 
					 countHHRT++;
				 }
				 
				 
				 
				 p = Pattern.compile("\\b.svi\\b", Pattern.CASE_INSENSITIVE); 
				 m=p.matcher(webContent);
				 while (m.find()) { 
					 countHHRT++;
				 }
				 
				 
				 
				 p = Pattern.compile("\\b.3gp\\b", Pattern.CASE_INSENSITIVE); 
				 m=p.matcher(webContent);
				 while (m.find()) { 
					 countHHRT++;
				 }
				 
				 
				 p = Pattern.compile("\\b.3g2\\b", Pattern.CASE_INSENSITIVE); 
				 m=p.matcher(webContent);
				 while (m.find()) { 
					 countHHRT++;
				 }
				 
				 
				 p = Pattern.compile("\\b.mxf\\b", Pattern.CASE_INSENSITIVE); 
				 m=p.matcher(webContent);
				 while (m.find()) { 
					 countHHRT++;
				 }
				 


				 p = Pattern.compile("\\b.roq\\b", Pattern.CASE_INSENSITIVE); 
				 m=p.matcher(webContent);
				 while (m.find()) { 
					 countHHRT++;
				 }
				 
				 
				 p = Pattern.compile("\\b.nsv\\b", Pattern.CASE_INSENSITIVE); 
				 m=p.matcher(webContent);
				 while (m.find()) { 
					 countHHRT++;
				 }
				 
				 
				 p = Pattern.compile("\\b.flv\\b", Pattern.CASE_INSENSITIVE); 
				 m=p.matcher(webContent);
				 while (m.find()) { 
					 countHHRT++;
				 }
				 
				 
				 
				 p = Pattern.compile("\\b.f4v\\b", Pattern.CASE_INSENSITIVE); 
				 m=p.matcher(webContent);
				 while (m.find()) { 
					 countHHRT++;
				 }
				 
				 
				 
				 p = Pattern.compile("\\b.f4p\\b", Pattern.CASE_INSENSITIVE); 
				 m=p.matcher(webContent);
				 while (m.find()) { 
					 countHHRT++;
				 }
				 
				 
				 p = Pattern.compile("\\b.f4a\\b", Pattern.CASE_INSENSITIVE); 
				 m=p.matcher(webContent);
				 while (m.find()) { 
					 countHHRT++;
				 }
				 
				 
				 p = Pattern.compile("\\b.f4b\\b", Pattern.CASE_INSENSITIVE); 
				 m=p.matcher(webContent);
				 while (m.find()) { 
					 countHHRT++;
				 }
				 


				 
				
				if (countHHRT >0) { 
					
					
					if (link.indexOf("://") == -1) {
						if (link.charAt(0) == '/') { 
							link = "http://" + pageUrl.getHost() + link;
						} else {
							String file = pageUrl.getFile(); 
							if (file.indexOf('/') == -1) { 
								link = "http://" + pageUrl.getHost() + "/" + link; } else { 
									String path = file.substring(0, file.lastIndexOf('/') + 1);
									link = "http://" + pageUrl.getHost() + path + link; } } }
				
						int index = link.indexOf('#'); 
						if (index != -1) { 
							link = link.substring(0, index);
					
					
					}
						
						link = removeWwwFromUrl(link);
					
						URL verifiedLink = verifyUrl(link);
						if (verifiedLink == null) { 
							continue;
							}
					
					
					linkList.add(link);
					
					}
	        }
		
		
			
		 
		 
		 
		 
		 
		 for (Element src : herfVidLinks) {
			 String link = src.attr("abs:src");
			 String webContent = link;
			 Pattern p;
				Matcher m;
				
				if (link.length() < 1) { 
					continue; 
				}
				
				if (link.charAt(0) == '#') { 
					continue;
					}
				
				if (link.indexOf("mailto:") != -1) { 
					continue;
					}
				
				if (link.indexOf("tel:") != -1) { 
					continue;
					}
				
				if (link.toLowerCase().indexOf("javascript") != -1) { 
					continue; 
					}
				int countHHRT = 0;
				
				 p = Pattern.compile("\\b.mp4\\b", Pattern.CASE_INSENSITIVE); 
				 m=p.matcher(webContent);
				 while (m.find()) { 
					 countHHRT++;
				 }
				 


				 p = Pattern.compile("\\b.ogg\\b", Pattern.CASE_INSENSITIVE); 
				 m=p.matcher(webContent);
				 while (m.find()) { 
					 countHHRT++;
				 }
				 
				 
				 p = Pattern.compile("\\b.webm\\b", Pattern.CASE_INSENSITIVE); 
				 m=p.matcher(webContent);
				 while (m.find()) { 
					 countHHRT++;
				 }
				 
				 
				 p = Pattern.compile("\\b.mkv\\b", Pattern.CASE_INSENSITIVE); 
				 m=p.matcher(webContent);
				 while (m.find()) { 
					 countHHRT++;
				 }
				 
				 
				 
				 p = Pattern.compile("\\b.flv\\b", Pattern.CASE_INSENSITIVE); 
				 m=p.matcher(webContent);
				 while (m.find()) { 
					 countHHRT++;
				 }
				 
				 
				 
				 p = Pattern.compile("\\b.vob\\b", Pattern.CASE_INSENSITIVE); 
				 m=p.matcher(webContent);
				 while (m.find()) { 
					 countHHRT++;
				 }
				 
				 
				 p = Pattern.compile("\\b.ogv\\b", Pattern.CASE_INSENSITIVE); 
				 m=p.matcher(webContent);
				 while (m.find()) { 
					 countHHRT++;
				 }
				 
				 
				 p = Pattern.compile("\\b.drc\\b", Pattern.CASE_INSENSITIVE); 
				 m=p.matcher(webContent);
				 while (m.find()) { 
					 countHHRT++;
				 }
				 


				 p = Pattern.compile("\\b.mng\\b", Pattern.CASE_INSENSITIVE); 
				 m=p.matcher(webContent);
				 while (m.find()) { 
					 countHHRT++;
				 }
				 
				 
				 p = Pattern.compile("\\b.avi\\b", Pattern.CASE_INSENSITIVE); 
				 m=p.matcher(webContent);
				 while (m.find()) { 
					 countHHRT++;
				 }
				 
				 
				 p = Pattern.compile("\\b.mov\\b", Pattern.CASE_INSENSITIVE); 
				 m=p.matcher(webContent);
				 while (m.find()) { 
					 countHHRT++;
				 }
				 
				 
				 
				 p = Pattern.compile("\\b.qt\\b", Pattern.CASE_INSENSITIVE); 
				 m=p.matcher(webContent);
				 while (m.find()) { 
					 countHHRT++;
				 }
				 
				 
				 
				 p = Pattern.compile("\\b.wmv\\b", Pattern.CASE_INSENSITIVE); 
				 m=p.matcher(webContent);
				 while (m.find()) { 
					 countHHRT++;
				 }
				 
				 
				 p = Pattern.compile("\\b.yuv\\b", Pattern.CASE_INSENSITIVE); 
				 m=p.matcher(webContent);
				 while (m.find()) { 
					 countHHRT++;
				 }
				 
				 
				 
				 p = Pattern.compile("\\b.rm\\b", Pattern.CASE_INSENSITIVE); 
				 m=p.matcher(webContent);
				 while (m.find()) { 
					 countHHRT++;
				 }
				 


				 p = Pattern.compile("\\b.rmvb\\b", Pattern.CASE_INSENSITIVE); 
				 m=p.matcher(webContent);
				 while (m.find()) { 
					 countHHRT++;
				 }
				 
				 
				 p = Pattern.compile("\\b.asf\\b", Pattern.CASE_INSENSITIVE); 
				 m=p.matcher(webContent);
				 while (m.find()) { 
					 countHHRT++;
				 }
				 
				 
				 p = Pattern.compile("\\b.amv\\b", Pattern.CASE_INSENSITIVE); 
				 m=p.matcher(webContent);
				 while (m.find()) { 
					 countHHRT++;
				 }
				 
				 
				 
				 p = Pattern.compile("\\b.m4p\\b", Pattern.CASE_INSENSITIVE); 
				 m=p.matcher(webContent);
				 while (m.find()) { 
					 countHHRT++;
				 }
				 
				 
				 
				 p = Pattern.compile("\\b.m4v\\b", Pattern.CASE_INSENSITIVE); 
				 m=p.matcher(webContent);
				 while (m.find()) { 
					 countHHRT++;
				 }
				 
				 
				 p = Pattern.compile("\\b.mpg\\b", Pattern.CASE_INSENSITIVE); 
				 m=p.matcher(webContent);
				 while (m.find()) { 
					 countHHRT++;
				 }
				 
				 
				 
				 
				 p = Pattern.compile("\\b.mp2\\b", Pattern.CASE_INSENSITIVE); 
				 m=p.matcher(webContent);
				 while (m.find()) { 
					 countHHRT++;
				 }
				 


				 p = Pattern.compile("\\b.mpeg\\b", Pattern.CASE_INSENSITIVE); 
				 m=p.matcher(webContent);
				 while (m.find()) { 
					 countHHRT++;
				 }
				 
				 
				 p = Pattern.compile("\\b.mpe\\b", Pattern.CASE_INSENSITIVE); 
				 m=p.matcher(webContent);
				 while (m.find()) { 
					 countHHRT++;
				 }
				 
				 
				 p = Pattern.compile("\\b.mpv\\b", Pattern.CASE_INSENSITIVE); 
				 m=p.matcher(webContent);
				 while (m.find()) { 
					 countHHRT++;
				 }
				 
				 
				 
				 p = Pattern.compile("\\b.svi\\b", Pattern.CASE_INSENSITIVE); 
				 m=p.matcher(webContent);
				 while (m.find()) { 
					 countHHRT++;
				 }
				 
				 
				 
				 p = Pattern.compile("\\b.3gp\\b", Pattern.CASE_INSENSITIVE); 
				 m=p.matcher(webContent);
				 while (m.find()) { 
					 countHHRT++;
				 }
				 
				 
				 p = Pattern.compile("\\b.3g2\\b", Pattern.CASE_INSENSITIVE); 
				 m=p.matcher(webContent);
				 while (m.find()) { 
					 countHHRT++;
				 }
				 
				 
				 p = Pattern.compile("\\b.mxf\\b", Pattern.CASE_INSENSITIVE); 
				 m=p.matcher(webContent);
				 while (m.find()) { 
					 countHHRT++;
				 }
				 


				 p = Pattern.compile("\\b.roq\\b", Pattern.CASE_INSENSITIVE); 
				 m=p.matcher(webContent);
				 while (m.find()) { 
					 countHHRT++;
				 }
				 
				 
				 p = Pattern.compile("\\b.nsv\\b", Pattern.CASE_INSENSITIVE); 
				 m=p.matcher(webContent);
				 while (m.find()) { 
					 countHHRT++;
				 }
				 
				 
				 p = Pattern.compile("\\b.flv\\b", Pattern.CASE_INSENSITIVE); 
				 m=p.matcher(webContent);
				 while (m.find()) { 
					 countHHRT++;
				 }
				 
				 
				 
				 p = Pattern.compile("\\b.f4v\\b", Pattern.CASE_INSENSITIVE); 
				 m=p.matcher(webContent);
				 while (m.find()) { 
					 countHHRT++;
				 }
				 
				 
				 
				 p = Pattern.compile("\\b.f4p\\b", Pattern.CASE_INSENSITIVE); 
				 m=p.matcher(webContent);
				 while (m.find()) { 
					 countHHRT++;
				 }
				 
				 
				 p = Pattern.compile("\\b.f4a\\b", Pattern.CASE_INSENSITIVE); 
				 m=p.matcher(webContent);
				 while (m.find()) { 
					 countHHRT++;
				 }
				 
				 
				 p = Pattern.compile("\\b.f4b\\b", Pattern.CASE_INSENSITIVE); 
				 m=p.matcher(webContent);
				 while (m.find()) { 
					 countHHRT++;
				 }
				 


				 
				
				if (countHHRT >0) { 
					
					
					if (link.indexOf("://") == -1) {
						if (link.charAt(0) == '/') { 
							link = "http://" + pageUrl.getHost() + link;
						} else {
							String file = pageUrl.getFile(); 
							if (file.indexOf('/') == -1) { 
								link = "http://" + pageUrl.getHost() + "/" + link; } else { 
									String path = file.substring(0, file.lastIndexOf('/') + 1);
									link = "http://" + pageUrl.getHost() + path + link; } } }
				
						int index = link.indexOf('#'); 
						if (index != -1) { 
							link = link.substring(0, index);
					
					
					}
						
						link = removeWwwFromUrl(link);
					
						URL verifiedLink = verifyUrl(link);
						if (verifiedLink == null) { 
							continue;
							}
					
					
					linkList.add(link);
					
					}
	        }
		
		 
		 
		 
		 
		 
		 
		 
		return (linkList);
			
	
		
	}
	
	
	
	private static boolean checkVidHerf (String webContent){
		 Pattern p;
			Matcher m;
			
			int countHHRT = 0;
			
			 p = Pattern.compile("\\b.mp4\\b", Pattern.CASE_INSENSITIVE); 
			 m=p.matcher(webContent);
			 while (m.find()) { 
				 countHHRT++;
			 }
			 


			 p = Pattern.compile("\\b.ogg\\b", Pattern.CASE_INSENSITIVE); 
			 m=p.matcher(webContent);
			 while (m.find()) { 
				 countHHRT++;
			 }
			 
			 
			 p = Pattern.compile("\\b.webm\\b", Pattern.CASE_INSENSITIVE); 
			 m=p.matcher(webContent);
			 while (m.find()) { 
				 countHHRT++;
			 }
			 
			 
			 p = Pattern.compile("\\b.mkv\\b", Pattern.CASE_INSENSITIVE); 
			 m=p.matcher(webContent);
			 while (m.find()) { 
				 countHHRT++;
			 }
			 
			 
			 
			 p = Pattern.compile("\\b.flv\\b", Pattern.CASE_INSENSITIVE); 
			 m=p.matcher(webContent);
			 while (m.find()) { 
				 countHHRT++;
			 }
			 
			 
			 
			 p = Pattern.compile("\\b.vob\\b", Pattern.CASE_INSENSITIVE); 
			 m=p.matcher(webContent);
			 while (m.find()) { 
				 countHHRT++;
			 }
			 
			 
			 p = Pattern.compile("\\b.ogv\\b", Pattern.CASE_INSENSITIVE); 
			 m=p.matcher(webContent);
			 while (m.find()) { 
				 countHHRT++;
			 }
			 
			 
			 p = Pattern.compile("\\b.drc\\b", Pattern.CASE_INSENSITIVE); 
			 m=p.matcher(webContent);
			 while (m.find()) { 
				 countHHRT++;
			 }
			 


			 p = Pattern.compile("\\b.mng\\b", Pattern.CASE_INSENSITIVE); 
			 m=p.matcher(webContent);
			 while (m.find()) { 
				 countHHRT++;
			 }
			 
			 
			 p = Pattern.compile("\\b.avi\\b", Pattern.CASE_INSENSITIVE); 
			 m=p.matcher(webContent);
			 while (m.find()) { 
				 countHHRT++;
			 }
			 
			 
			 p = Pattern.compile("\\b.mov\\b", Pattern.CASE_INSENSITIVE); 
			 m=p.matcher(webContent);
			 while (m.find()) { 
				 countHHRT++;
			 }
			 
			 
			 
			 p = Pattern.compile("\\b.qt\\b", Pattern.CASE_INSENSITIVE); 
			 m=p.matcher(webContent);
			 while (m.find()) { 
				 countHHRT++;
			 }
			 
			 
			 
			 p = Pattern.compile("\\b.wmv\\b", Pattern.CASE_INSENSITIVE); 
			 m=p.matcher(webContent);
			 while (m.find()) { 
				 countHHRT++;
			 }
			 
			 
			 p = Pattern.compile("\\b.yuv\\b", Pattern.CASE_INSENSITIVE); 
			 m=p.matcher(webContent);
			 while (m.find()) { 
				 countHHRT++;
			 }
			 
			 
			 
			 p = Pattern.compile("\\b.rm\\b", Pattern.CASE_INSENSITIVE); 
			 m=p.matcher(webContent);
			 while (m.find()) { 
				 countHHRT++;
			 }
			 


			 p = Pattern.compile("\\b.rmvb\\b", Pattern.CASE_INSENSITIVE); 
			 m=p.matcher(webContent);
			 while (m.find()) { 
				 countHHRT++;
			 }
			 
			 
			 p = Pattern.compile("\\b.asf\\b", Pattern.CASE_INSENSITIVE); 
			 m=p.matcher(webContent);
			 while (m.find()) { 
				 countHHRT++;
			 }
			 
			 
			 p = Pattern.compile("\\b.amv\\b", Pattern.CASE_INSENSITIVE); 
			 m=p.matcher(webContent);
			 while (m.find()) { 
				 countHHRT++;
			 }
			 
			 
			 
			 p = Pattern.compile("\\b.m4p\\b", Pattern.CASE_INSENSITIVE); 
			 m=p.matcher(webContent);
			 while (m.find()) { 
				 countHHRT++;
			 }
			 
			 
			 
			 p = Pattern.compile("\\b.m4v\\b", Pattern.CASE_INSENSITIVE); 
			 m=p.matcher(webContent);
			 while (m.find()) { 
				 countHHRT++;
			 }
			 
			 
			 p = Pattern.compile("\\b.mpg\\b", Pattern.CASE_INSENSITIVE); 
			 m=p.matcher(webContent);
			 while (m.find()) { 
				 countHHRT++;
			 }
			 
			 
			 
			 
			 p = Pattern.compile("\\b.mp2\\b", Pattern.CASE_INSENSITIVE); 
			 m=p.matcher(webContent);
			 while (m.find()) { 
				 countHHRT++;
			 }
			 


			 p = Pattern.compile("\\b.mpeg\\b", Pattern.CASE_INSENSITIVE); 
			 m=p.matcher(webContent);
			 while (m.find()) { 
				 countHHRT++;
			 }
			 
			 
			 p = Pattern.compile("\\b.mpe\\b", Pattern.CASE_INSENSITIVE); 
			 m=p.matcher(webContent);
			 while (m.find()) { 
				 countHHRT++;
			 }
			 
			 
			 p = Pattern.compile("\\b.mpv\\b", Pattern.CASE_INSENSITIVE); 
			 m=p.matcher(webContent);
			 while (m.find()) { 
				 countHHRT++;
			 }
			 
			 
			 
			 p = Pattern.compile("\\b.svi\\b", Pattern.CASE_INSENSITIVE); 
			 m=p.matcher(webContent);
			 while (m.find()) { 
				 countHHRT++;
			 }
			 
			 
			 
			 p = Pattern.compile("\\b.3gp\\b", Pattern.CASE_INSENSITIVE); 
			 m=p.matcher(webContent);
			 while (m.find()) { 
				 countHHRT++;
			 }
			 
			 
			 p = Pattern.compile("\\b.3g2\\b", Pattern.CASE_INSENSITIVE); 
			 m=p.matcher(webContent);
			 while (m.find()) { 
				 countHHRT++;
			 }
			 
			 
			 p = Pattern.compile("\\b.mxf\\b", Pattern.CASE_INSENSITIVE); 
			 m=p.matcher(webContent);
			 while (m.find()) { 
				 countHHRT++;
			 }
			 


			 p = Pattern.compile("\\b.roq\\b", Pattern.CASE_INSENSITIVE); 
			 m=p.matcher(webContent);
			 while (m.find()) { 
				 countHHRT++;
			 }
			 
			 
			 p = Pattern.compile("\\b.nsv\\b", Pattern.CASE_INSENSITIVE); 
			 m=p.matcher(webContent);
			 while (m.find()) { 
				 countHHRT++;
			 }
			 
			 
			 p = Pattern.compile("\\b.flv\\b", Pattern.CASE_INSENSITIVE); 
			 m=p.matcher(webContent);
			 while (m.find()) { 
				 countHHRT++;
			 }
			 
			 
			 
			 p = Pattern.compile("\\b.f4v\\b", Pattern.CASE_INSENSITIVE); 
			 m=p.matcher(webContent);
			 while (m.find()) { 
				 countHHRT++;
			 }
			 
			 
			 
			 p = Pattern.compile("\\b.f4p\\b", Pattern.CASE_INSENSITIVE); 
			 m=p.matcher(webContent);
			 while (m.find()) { 
				 countHHRT++;
			 }
			 
			 
			 p = Pattern.compile("\\b.f4a\\b", Pattern.CASE_INSENSITIVE); 
			 m=p.matcher(webContent);
			 while (m.find()) { 
				 countHHRT++;
			 }
			 
			 
			 p = Pattern.compile("\\b.f4b\\b", Pattern.CASE_INSENSITIVE); 
			 m=p.matcher(webContent);
			 while (m.find()) { 
				 countHHRT++;
			 }
			
			 if(countHHRT >0){
				 return true; 
			 }else{
				 return false;
			 }
		
	}
	
	public static ArrayList<String> check_links(URL pageUrl,String webContent,String pUrl2,HashSet<String> crawledList) throws IOException{
		ArrayList<String> linkList = new ArrayList<String>();
		Pattern p = Pattern.compile("<a\\s+href\\s*=\\s*\"?(.*?)[\"|>]", Pattern.CASE_INSENSITIVE); 
		Matcher m=p.matcher(webContent);
		while (m.find()) { 
			String link = m.group(1).trim();
			
			if (link.length() < 1) { 
				continue; 
			}
			
			if (link.charAt(0) == '#') { 
				continue;
				}
			
			if (link.indexOf("mailto:") != -1) { 
				continue;
				}
			
			if (link.indexOf("tel:") != -1) { 
				continue;
				}
			
			if (link.toLowerCase().indexOf("javascript") != -1) { 
				continue; 
				}
			
			if(checkVidHerf(link)){
				continue;
			}
			if (link.indexOf("://") == -1) {
				if (link.charAt(0) == '/') { 
					link = "http://" + pageUrl.getHost() + link;
				} else {
					String file = pageUrl.getFile(); 
					if (file.indexOf('/') == -1) { 
						link = "http://" + pageUrl.getHost() + "/" + link; } else { 
							String path = file.substring(0, file.lastIndexOf('/') + 1);
							link = "http://" + pageUrl.getHost() + path + link; } } }
		
				int index = link.indexOf('#'); 
				if (index != -1) { 
					link = link.substring(0, index);
			
			
			}
				
				link = removeWwwFromUrl(link);
			
				URL verifiedLink = verifyUrl(link);
				if (verifiedLink == null) { 
					continue;
					}
			
			if (crawledList.contains(link)) { 
				continue; 
				} 
			
			linkList.add(link);
			System.out.println("found | "+link+"\n");
			
			}
		
ArrayList<String> videoLinks = checkVideoLinks(pUrl2);
if (videoLinks.isEmpty()) {
	System.out.println(pageUrl. getHost());
}else{
	String ApageText = find_webText(pUrl2);

	put_in_DB (ApageText,videoLinks);
}
		return (linkList);
			
	
	}
	
	
	
	private static void put_in_DB (String text,ArrayList<String> videoLinks){
		int count = 0;
		while(count < videoLinks.size()){
			String pVedioLink = (String) videoLinks.get(count);
			pythonProcess pyp = new pythonProcess();
			String pyInstruction = "import numpy as np\nimport MySQLdb\ndef divide_sent(txt,vidLink,botNameHH):\n from nltk.tokenize import sent_tokenize\n sent_tokenize_list = sent_tokenize(txt)\n len(sent_tokenize_list)\n print (sent_tokenize_list)\n sentencesA = np.asarray(sent_tokenize_list)\n count = 0\n while count < 3:\n  print (sentencesA[count])\n  conn = MySQLdb.connect(host='localhost',\n                         user='root',\n                         passwd='lambert88',\n                         db='maxialertH')\n  x = conn.cursor()\n  add_salary = ('INSERT INTO test_SE_db'\n                '(sentence, link, botName) '\n                'VALUES (%(emp_sent)s, %(emp_link)s, %(emp_botName)s)')\n  data_salary = {\n      'emp_sent': sentencesA[count],\n      'emp_link': vidLink,\n      'emp_botName': botNameHH,\n  }\n\n  x.execute(add_salary,data_salary)\n  conn.commit()\n  x.close()\n  conn.close()\n\n  count = count + 1\n\ndivide_sent('"
					;
			String pyInstruction3 ="','";
			String pyInstruction5 = "','";
			String pyInstruction7 = "')";
			
			String fullPyInstruction = pyInstruction+text+pyInstruction3+pVedioLink+pyInstruction5+butName+pyInstruction7;
	pyp.pyProcess(fullPyInstruction);
			count++;
		}
	}
	
	
	
	
	private static String  find_webText(String url) throws IOException{
		Document doc = Jsoup.connect(url).get();
		String PageText = null;
		PageText = doc.body().text();
		return PageText;
	}
	
	public static void crawl( String startUrl, int maxUrls) throws IOException {
		HashSet<String> crawledList = new HashSet<String>();
		LinkedHashSet<String> toCrawlList = new LinkedHashSet<String>();
	 
		toCrawlList.add(startUrl);
	
		while (crawling && toCrawlList.size() > 0) { 
			if (maxUrls != -1) { if (crawledList.size() == maxUrls) { break; } }
	
	String url = (String) toCrawlList.iterator().next();
	toCrawlList.remove(url); 
	URL verifiedUrl = verifyUrl(url);
	String vrURL2 = url;
	crawledList.add(url);
	String pageContents = downloadPage(verifiedUrl);
		if (pageContents != null && pageContents.length() > 0) {
		ArrayList<String> links = check_links(verifiedUrl, pageContents,vrURL2, crawledList);
		toCrawlList.addAll(links);
	}
	
	}
		crawling = false;
	}
	
	private static void getName(){
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		String input = in.nextLine().trim();
		
		
		if(input.length()==0){
			System.out.println("Input Bot Name");
			getName();
		}else{
			butName = input;
		}
		
	}
	
	private static void startBot() throws IOException{
		crawling = true;
		crawl("https://localhost:/pingee/", 1000);
	}
	public static void main(String[]args) throws IOException{
		System.out.println("Input Bot Name");
		getName();
		startBot();
		
	}
}
