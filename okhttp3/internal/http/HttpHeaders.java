package okhttp3.internal.http;

import a5.b;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.x;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.p;
import okhttp3.Challenge;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.platform.Platform;
import okio.Buffer;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\b\u0005\u001A\u001F\u0010\u0005\u001A\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001A!\u0010\f\u001A\u00020\u000B*\u00020\u00072\u0006\u0010\t\u001A\u00020\b2\u0006\u0010\n\u001A\u00020\u0000¢\u0006\u0004\b\f\u0010\r\u001A\u0011\u0010\u0010\u001A\u00020\u000F*\u00020\u000E¢\u0006\u0004\b\u0010\u0010\u0011\u001A\u0017\u0010\u0013\u001A\u00020\u000F2\u0006\u0010\u0012\u001A\u00020\u000EH\u0007¢\u0006\u0004\b\u0013\u0010\u0011¨\u0006\u0014"}, d2 = {"Lokhttp3/Headers;", "", "headerName", "", "Lokhttp3/Challenge;", "parseChallenges", "(Lokhttp3/Headers;Ljava/lang/String;)Ljava/util/List;", "Lokhttp3/CookieJar;", "Lokhttp3/HttpUrl;", "url", "headers", "", "receiveHeaders", "(Lokhttp3/CookieJar;Lokhttp3/HttpUrl;Lokhttp3/Headers;)V", "Lokhttp3/Response;", "", "promisesBody", "(Lokhttp3/Response;)Z", "response", "hasBody", "okhttp"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@JvmName(name = "HttpHeaders")
public final class HttpHeaders {
    public static final ByteString a;
    public static final ByteString b;

    static {
        HttpHeaders.a = ByteString.Companion.encodeUtf8("\"\\");
        HttpHeaders.b = ByteString.Companion.encodeUtf8("\t ,=");
    }

    public static final void a(Buffer buffer0, ArrayList arrayList0) {
        String s2;
        int v;
        String s1;
        String s;
        while(true) {
            s = null;
        label_1:
            if(s == null) {
                HttpHeaders.c(buffer0);
                s = HttpHeaders.b(buffer0);
                if(s == null) {
                    return;
                }
            }
            boolean z = HttpHeaders.c(buffer0);
            s1 = HttpHeaders.b(buffer0);
            if(s1 == null) {
                if(!buffer0.exhausted()) {
                    return;
                }
                arrayList0.add(new Challenge(s, x.emptyMap()));
                return;
            }
            v = Util.skipAll(buffer0, 61);
            if(z || !HttpHeaders.c(buffer0) && !buffer0.exhausted()) {
                break;
            }
            StringBuilder stringBuilder0 = b.t(s1);
            stringBuilder0.append(p.repeat("=", v));
            Map map0 = Collections.singletonMap(null, stringBuilder0.toString());
            Intrinsics.checkNotNullExpressionValue(map0, "singletonMap<String, Str…ek + \"=\".repeat(eqCount))");
            arrayList0.add(new Challenge(s, map0));
        }
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        int v1 = Util.skipAll(buffer0, 61) + v;
        while(true) {
            if(s1 == null) {
                s1 = HttpHeaders.b(buffer0);
                if(HttpHeaders.c(buffer0)) {
                    break;
                }
                else {
                    v1 = Util.skipAll(buffer0, 61);
                }
            }
            if(v1 == 0) {
                break;
            }
            if(v1 > 1) {
                return;
            }
            if(HttpHeaders.c(buffer0)) {
                return;
            }
            if(buffer0.exhausted() || buffer0.getByte(0L) != 34) {
                s2 = HttpHeaders.b(buffer0);
            }
            else {
                if(buffer0.readByte() == 34) {
                    s2 = null;
                    Buffer buffer1 = new Buffer();
                    while(true) {
                        long v2 = buffer0.indexOfElement(HttpHeaders.a);
                        if(v2 == -1L) {
                            goto label_50;
                        }
                        if(buffer0.getByte(v2) == 34) {
                            buffer1.write(buffer0, v2);
                            buffer0.readByte();
                            s2 = "";
                            goto label_50;
                        }
                        if(buffer0.size() == v2 + 1L) {
                            goto label_50;
                        }
                        buffer1.write(buffer0, v2);
                        buffer0.readByte();
                        buffer1.write(buffer0, 1L);
                    }
                }
                throw new IllegalArgumentException("Failed requirement.");
            }
        label_50:
            if(s2 == null) {
                return;
            }
            if(((String)linkedHashMap0.put(s1, s2)) != null) {
                return;
            }
            if(!HttpHeaders.c(buffer0) && !buffer0.exhausted()) {
                return;
            }
            s1 = null;
        }
        arrayList0.add(new Challenge(s, linkedHashMap0));
        s = s1;
        goto label_1;
    }

    public static final String b(Buffer buffer0) {
        long v = buffer0.indexOfElement(HttpHeaders.b);
        if(v == -1L) {
            v = buffer0.size();
        }
        return v == 0L ? null : buffer0.readUtf8(v);
    }

    public static final boolean c(Buffer buffer0) {
        boolean z = false;
        while(!buffer0.exhausted()) {
            int v = buffer0.getByte(0L);
            if(v == 44) {
                buffer0.readByte();
                z = true;
            }
            else {
                if(v != 9 && v != 0x20) {
                    break;
                }
                buffer0.readByte();
            }
        }
        return z;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "No longer supported", replaceWith = @ReplaceWith(expression = "response.promisesBody()", imports = {}))
    public static final boolean hasBody(@NotNull Response response0) {
        Intrinsics.checkNotNullParameter(response0, "response");
        return HttpHeaders.promisesBody(response0);
    }

    @NotNull
    public static final List parseChallenges(@NotNull Headers headers0, @NotNull String s) {
        Intrinsics.checkNotNullParameter(headers0, "<this>");
        Intrinsics.checkNotNullParameter(s, "headerName");
        List list0 = new ArrayList();
        int v = headers0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            if(p.equals(s, headers0.name(v1), true)) {
                Buffer buffer0 = new Buffer().writeUtf8(headers0.value(v1));
                try {
                    HttpHeaders.a(buffer0, ((ArrayList)list0));
                }
                catch(EOFException eOFException0) {
                    Platform.Companion.get().log("Unable to parse challenge", 5, eOFException0);
                }
            }
        }
        return list0;
    }

    public static final boolean promisesBody(@NotNull Response response0) {
        Intrinsics.checkNotNullParameter(response0, "<this>");
        if(Intrinsics.areEqual(response0.request().method(), "HEAD")) {
            return false;
        }
        int v = response0.code();
        return v >= 100 && v < 200 || (v == 204 || v == 304) ? Util.headersContentLength(response0) != -1L || p.equals("chunked", Response.header$default(response0, "Transfer-Encoding", null, 2, null), true) : true;
    }

    public static final void receiveHeaders(@NotNull CookieJar cookieJar0, @NotNull HttpUrl httpUrl0, @NotNull Headers headers0) {
        Intrinsics.checkNotNullParameter(cookieJar0, "<this>");
        Intrinsics.checkNotNullParameter(httpUrl0, "url");
        Intrinsics.checkNotNullParameter(headers0, "headers");
        if(cookieJar0 == CookieJar.NO_COOKIES) {
            return;
        }
        List list0 = Cookie.Companion.parseAll(httpUrl0, headers0);
        if(list0.isEmpty()) {
            return;
        }
        cookieJar0.saveFromResponse(httpUrl0, list0);
    }
}

