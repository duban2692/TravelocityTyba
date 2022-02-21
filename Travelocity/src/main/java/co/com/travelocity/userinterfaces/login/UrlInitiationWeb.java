package co.com.travelocity.userinterfaces.login;


import co.com.travelocity.util.Utilities;

public enum UrlInitiationWeb {

    UrlInitiationWebDev("https://www.travelocity.com/dev", "dev"),
    UrlInitiationWebCert("https://www.travelocity.com", "cert"),
    UrlInitiationWebProd("https://www.travelocity.com/pro", "prod");

    private final String url;
    private final String Environments;

    UrlInitiationWeb(String url, String environments) {
        this.url = url;
        Environments = environments;
    }

    public String getUrl() {
        return url;
    }

    public String getEnvironments() {
        return Environments;
    }

    public String Url() {

        return url;
    }

    public static String getURL() {

        String url = null;
        for (UrlInitiationWeb urlInitiationWeb : UrlInitiationWeb.values()) {

            if (Utilities.getEnvironments().equals(urlInitiationWeb.getEnvironments())) {

                url = urlInitiationWeb.getUrl();
                break;
            }
        }

        return url;
    }
}
