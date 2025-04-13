package b_april.ex_28_ENUM;

public enum APIURLs
{
    KATALON("https://katalon.com"),
    GOOGLE("https://www.google.com"),
    VWO("https://app.wo.com");

    private final String urls;

    APIURLs(String urls)
    {
        this.urls = urls;
    }

    String getUrls()
    {
        return urls;
    }
}
