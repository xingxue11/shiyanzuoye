package shiyan.shiyan11.renwu2.service;

public class HttpRequestBuilder {
    private HttpRequest request = new HttpRequest();

    // url和method是必填，构造方法传入
    public HttpRequestBuilder(String url, String method) {
        request.setUrl(url);
        request.setMethod(method);
    }

    public HttpRequestBuilder header(String key, String value) {
        request.addHeader(key, value);
        return this;
    }

    public HttpRequestBuilder body(String body) {
        request.setBody(body);
        return this;
    }

    public HttpRequestBuilder timeout(long ms) {
        request.setTimeout(ms);
        return this;
    }

    public HttpRequestBuilder queryParam(String key, String value) {
        request.addQueryParam(key, value);
        return this;
    }

    public HttpRequest build() {
        return request;
    }
}
