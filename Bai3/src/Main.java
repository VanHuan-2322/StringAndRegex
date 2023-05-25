import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String url = "http://dantri.com.vn/the-gioi.htm";

        try {
            String htmlContent = getHTMLContent(url);
            if (htmlContent != null) {
                String regex = "<a class=\"news-item__avatar\"(.*?)<a class=\"news-item__title\"(.*?)</a>";
                Pattern pattern = Pattern.compile(regex);
                Matcher matcher = pattern.matcher(htmlContent);
                while (matcher.find()) {
                    String newsTitle = matcher.group(2).replaceAll("<.*?>", "").trim();
                    System.out.println(newsTitle);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String getHTMLContent(String url) throws IOException {
        StringBuilder content = new StringBuilder();
        BufferedReader reader = null;

        try {
            URL urlObject = new URL(url);
            reader = new BufferedReader(new InputStreamReader(urlObject.openStream()));

            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line);
            }
        } finally {
            if (reader != null) {
                reader.close();
            }
        }

        return content.toString();
    }
}
