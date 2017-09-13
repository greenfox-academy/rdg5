public class UrlFixer {
    public static void main(String... args) {
        String url = "https//www.reddit.com/r/nevertellmethebots";

        //First version:
        /*String replacedUrl = url.replace("nevertellmethebots", "nevertellmetheodds");
        String fullyReplacedUrl = replacedUrl.replace("https", "https:");*/
        //    System.out.println(fullyReplacedUrl);

        //Second version:
        String replacedUrl = url.replaceAll("https//www.reddit.com/r/nevertellmethebots", "https://www.reddit.com/r/nevertellmetheodds");
        System.out.println(replacedUrl);

    }
}