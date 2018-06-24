package webCrawler;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.regex.Matcher; 
import java.util.regex.Pattern; 
public class patter_checker {

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
		
		public static ArrayList check_links(URL pageUrl,String webContent,HashSet crawledList){
			ArrayList linkList = new ArrayList();
			Pattern p = Pattern.compile("<source\\s+src\\s*=\\s*\"?(.*?)[\"|>]", Pattern.CASE_INSENSITIVE); 
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
				
				
				 p = Pattern.compile("\\b.mp4\\b", Pattern.CASE_INSENSITIVE); 
				 m=p.matcher(webContent);
				 int countHHRT = 0;
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
					
					if (crawledList.contains(link)) { 
						continue; 
						} 
					
					linkList.add(link);
					System.out.println("found | "+link+"\n");
					
					}
					
					
					
					}
			
				
			return (linkList);
				
		
			
		}
		
		
		
		public static void crawl( String startUrl, int maxUrls) {
			HashSet crawledList = new HashSet();
			LinkedHashSet toCrawlList = new LinkedHashSet();
		 
			toCrawlList.add(startUrl);
		
			while (crawling && toCrawlList.size() > 0) { 
				if (maxUrls != -1) { if (crawledList.size() == maxUrls) { break; } }
		
		String url = (String) toCrawlList.iterator().next();
		toCrawlList.remove(url); 
		URL verifiedUrl = verifyUrl(url);
		crawledList.add(url);
		String pageContents = downloadPage(verifiedUrl);
			if (pageContents != null && pageContents.length() > 0) {
			ArrayList links = check_links(verifiedUrl, pageContents, crawledList);
			toCrawlList.addAll(links);
		}
		
		}
			crawling = false;
		}
		
		
		
		public static void main(String[]args) throws MalformedURLException{
			HashSet crawledList = new HashSet();
			URL url =new URL("http://dl.my-film.in/s1/"); 
			String fbg = downloadPage(url);
			System.out.println(fbg);
			crawling = true;
			String pageC = "<video width='320' height='240' autoplay><source src='movie.mp4' type='video/mp4'><source src='movie.ogg' type='video/ogg'>Your browser does not support the video tag.</video>";
			check_links(url,pageC,crawledList);
			crawl("https://fmovies.se/film/secret-window.j4p2", 1000);
			
		}
	}
