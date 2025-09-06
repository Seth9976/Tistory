package retrofit2;

import java.util.regex.Pattern;
import okhttp3.Headers;
import okhttp3.HttpUrl.Builder;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;

public final class g0 {
    public final String a;
    public final HttpUrl b;
    public String c;
    public Builder d;
    public final okhttp3.Request.Builder e;
    public final okhttp3.Headers.Builder f;
    public MediaType g;
    public final boolean h;
    public final okhttp3.MultipartBody.Builder i;
    public final okhttp3.FormBody.Builder j;
    public RequestBody k;
    public static final char[] l;
    public static final Pattern m;

    static {
        g0.l = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        g0.m = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");
    }

    public g0(String s, HttpUrl httpUrl0, String s1, Headers headers0, MediaType mediaType0, boolean z, boolean z1, boolean z2) {
        this.a = s;
        this.b = httpUrl0;
        this.c = s1;
        this.e = new okhttp3.Request.Builder();
        this.g = mediaType0;
        this.h = z;
        this.f = headers0 == null ? new okhttp3.Headers.Builder() : headers0.newBuilder();
        if(z1) {
            this.j = new okhttp3.FormBody.Builder();
            return;
        }
        if(z2) {
            okhttp3.MultipartBody.Builder multipartBody$Builder0 = new okhttp3.MultipartBody.Builder();
            this.i = multipartBody$Builder0;
            multipartBody$Builder0.setType(MultipartBody.FORM);
        }
    }

    public final void a(String s, String s1, boolean z) {
        if("Content-Type".equalsIgnoreCase(s)) {
            try {
                this.g = MediaType.get(s1);
                return;
            }
            catch(IllegalArgumentException illegalArgumentException0) {
                throw new IllegalArgumentException("Malformed content type: " + s1, illegalArgumentException0);
            }
        }
        okhttp3.Headers.Builder headers$Builder0 = this.f;
        if(z) {
            headers$Builder0.addUnsafeNonAscii(s, s1);
            return;
        }
        headers$Builder0.add(s, s1);
    }

    public final void b(String s, String s1, boolean z) {
        String s2 = this.c;
        if(s2 != null) {
            HttpUrl httpUrl0 = this.b;
            Builder httpUrl$Builder0 = httpUrl0.newBuilder(s2);
            this.d = httpUrl$Builder0;
            if(httpUrl$Builder0 == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + httpUrl0 + ", Relative: " + this.c);
            }
            this.c = null;
        }
        if(z) {
            this.d.addEncodedQueryParameter(s, s1);
            return;
        }
        this.d.addQueryParameter(s, s1);
    }
}

