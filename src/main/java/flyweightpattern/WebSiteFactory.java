package flyweightpattern;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author 麦田守望者
 * @Date 2020/8/18 9:20
 * @Version 1.0
 */
public class WebSiteFactory {
    private static Map<String,WebSite> websites = new HashMap<>();

    public static WebSite  getWebSite(String name){
        if(websites.get(name) == null){
            WebSite webSite = new DefaultWebSite(name);
            websites.put(name,webSite);
        }
        return websites.get(name);
    }

    public static void getSize(){
        System.out.println("网站总数："+websites.size());
    }
}
