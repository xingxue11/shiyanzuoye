package shiyan.shiyan11.renwu2.service;

import java.util.HashMap;
import java.util.Map;

public class HttpRequest {
    // 必填
    private String url;
    private String method;
    // 可选
    private Map<String, String> headers = new HashMap<>();
    private String body;
    private long timeout;
    private Map<String, String> queryParams = new HashMap<>();

    public void setUrl(String url) {
        this.url = url;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public void addHeader(String key, String value) {
        headers.put(key, value);
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setTimeout(long timeout) {
        this.timeout = timeout;
    }

    public void addQueryParam(String key, String value) {
        queryParams.put(key, value);
    }

    @Override
    public String toString() {
        return "HttpRequest{" +
                "url='" + url + '\'' +
                ", method='" + method + '\'' +
                ", headers=" + headers +
                ", body='" + body + '\'' +
                ", timeout=" + timeout +
                ", queryParams=" + queryParams +
                '}';
    }
}
