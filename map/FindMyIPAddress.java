package map;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.HashMap;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.LinkedHashMap;
import java.util.LinkedList;

public class FindMyIPAddress {
    
    public static void main(String[] args)
    {
        final String log = "123.123.123.123 - - [26/Apr/2000:00:23:48 -0400] \"GET /pics/wpaper.gif HTTP/1.0\" 200 6248 \"http:// www.jafsoft.com/asctortf/\" \"Mozilla/4.05 (Macintosh; I; PPC)\"\n"
                + "123.123.123.123 - - [26/Apr/2000:00:23:47 -0400] \"GET /asctortf/ HTTP/1.0\" 200 8130 \"http:// search.netscape.com/Computers/Data_Formats/Document/Text/RTF\" \"Mozilla/4.05 (Macintosh; I; PPC)\"\n"
                + "123.123.123.124 - - [26/Apr/2000:00:23:48 -0400] \"GET /pics/5star2000.gif HTTP/1.0\" 200 4005 \"http:// www.jafsoft.com/asctortf/\" \"Mozilla/4.05 (Macintosh; I; PPC)\"\n"
                + "123.123.123.123 - - [26/Apr/2000:00:23:50 -0400] \"GET /pics/5star.gif HTTP/1.0\" 404 1031 \"http:// www.jafsoft.com/asctortf/\" \"Mozilla/4.05 (Macintosh; I; PPC)\"\n"
                + "123.123.123.126 - - [26/Apr/2000:00:23:51 -0400] \"GET /pics/a2hlogo.jpg HTTP/1.0\" 200 4282 \"http:// www.jafsoft.com/asctortf/\" \"Mozilla/4.05 (Macintosh; I; PPC)\"\n"
                + "123.123.123.120 - - [26/Apr/2000:00:23:51 -0400] \"GET /cgi-bin/newcount?jafsof3&width=4&font=digital&noshow HTTP/1.0\" 200 36 \"http:// www.jafsoft.com/asctortf/\" \"Mozilla/4.05 (Macintosh; I; PPC)\"\n"
                + "123.123.123.120 - - [26/Apr/2000:00:23:51 -0400] \"GET /cgi-bin/newcount?jafsof3&width=4&font=digital&noshow HTTP/1.0\" 200 36 \"http:// www.jafsoft.com/asctortf/\" \"Mozilla/4.05 (Macintosh; I; PPC)\"\n"
                + "123.123.123.120 - - [26/Apr/2000:00:23:51 -0400] \"GET /cgi-bin/newcount?jafsof3&width=4&font=digital&noshow HTTP/1.0\" 200 36 \"http:// www.jafsoft.com/asctortf/\" \"Mozilla/4.05 (Macintosh; I; PPC)\"\n"
                + "123.123.123.120 - - [26/Apr/2000:00:23:51 -0400] \"GET /cgi-bin/newcount?jafsof3&width=4&font=digital&noshow HTTP/1.0\" 200 36 \"http:// www.jafsoft.com/asctortf/\" \"Mozilla/4.05 (Macintosh; I; PPC)\"\n"
                + "123.123.123.123 - - [26/Apr/2000:00:23:51 -0400] \"GET /cgi-bin/newcount?jafsof3&width=4&font=digital&noshow HTTP/1.0\" 200 36 \"http:// www.jafsoft.com/asctortf/\" \"Mozilla/4.05 (Macintosh; I; PPC)\"\n";

        findSuccessIpCount(log);
    }

    public static void findSuccessIpCount(String record)
    {

        final String regex = "^(\\S+) (\\S+) (\\S+) \\[([\\w:/]+\\s[+\\-]\\d{4})\\] \"(\\S+) (\\S+)\\s*(\\S+)?\\s*\" (\\d{3}) (\\S+)";

        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(record);

        HashMap<String, Integer> countIP = new HashMap<String, Integer>();
        while (matcher.find()) {

            String IP = matcher.group(1);

            String Response = matcher.group(8);
            int response = Integer.parseInt(Response);

            if (response == 200) {
                if (countIP.containsKey(IP)) {
                    countIP.put(IP, countIP.get(IP) + 1);
                }
                else {
                    countIP.put(IP, 1);
                }
            }
        }

        Map<String,Integer> IpAddress = new TreeMap<String,Integer>(Collections.reverseOrder());
        IpAddress.putAll(countIP);
            //countIP = sortByValue(countIP);

        for (Map.Entry entry : IpAddress.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    public static HashMap<String,Integer> sortByValue(HashMap<String,Integer> counMap){
        List<Map.Entry<String, Integer> > list = 
        new LinkedList<Map.Entry<String, Integer> >(counMap.entrySet()); 

 // Sort the list 
 Collections.sort(list, new Comparator<Map.Entry<String, Integer> >() { 
     public int compare(Map.Entry<String, Integer> o1,  
                        Map.Entry<String, Integer> o2) 
     { 
         return (o1.getValue()).compareTo(o2.getValue()); 
     } 
 }); 


 HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>(); 
 for (Map.Entry<String, Integer> aa : list) { 
     temp.put(aa.getKey(), aa.getValue()); 
 } 
 return temp; 
    }
}
