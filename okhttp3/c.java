package okhttp3;

import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.cache.DiskLruCache.Editor;
import okhttp3.internal.http.StatusLine;
import okhttp3.internal.platform.Platform;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ByteString.Companion;
import okio.ByteString;
import okio.Okio;
import okio.Source;

public final class c {
    public final HttpUrl a;
    public final Headers b;
    public final String c;
    public final Protocol d;
    public final int e;
    public final String f;
    public final Headers g;
    public final Handshake h;
    public final long i;
    public final long j;
    public static final String k;
    public static final String l;

    // 去混淆评级： 低(26)
    static {
        c.k = "OkHttp-Sent-Millis";
        c.l = "OkHttp-Received-Millis";
    }

    public c(Response response0) {
        Intrinsics.checkNotNullParameter(response0, "response");
        super();
        this.a = response0.request().url();
        this.b = Cache.Companion.varyHeaders(response0);
        this.c = response0.request().method();
        this.d = response0.protocol();
        this.e = response0.code();
        this.f = response0.message();
        this.g = response0.headers();
        this.h = response0.handshake();
        this.i = response0.sentRequestAtMillis();
        this.j = response0.receivedResponseAtMillis();
    }

    public c(Source source0) {
        Intrinsics.checkNotNullParameter(source0, "rawSource");
        TlsVersion tlsVersion0;
        super();
        try {
            BufferedSource bufferedSource0 = Okio.buffer(source0);
            String s = bufferedSource0.readUtf8LineStrict();
            HttpUrl httpUrl0 = HttpUrl.Companion.parse(s);
            if(httpUrl0 == null) {
                IOException iOException0 = new IOException("Cache corruption for " + s);
                Platform.Companion.get().log("cache corruption", 5, iOException0);
                throw iOException0;
            }
            this.a = httpUrl0;
            this.c = bufferedSource0.readUtf8LineStrict();
            Builder headers$Builder0 = new Builder();
            int v = Cache.Companion.readInt$okhttp(bufferedSource0);
            for(int v2 = 0; v2 < v; ++v2) {
                headers$Builder0.addLenient$okhttp(bufferedSource0.readUtf8LineStrict());
            }
            this.b = headers$Builder0.build();
            String s1 = bufferedSource0.readUtf8LineStrict();
            StatusLine statusLine0 = StatusLine.Companion.parse(s1);
            this.d = statusLine0.protocol;
            this.e = statusLine0.code;
            this.f = statusLine0.message;
            Builder headers$Builder1 = new Builder();
            int v3 = Cache.Companion.readInt$okhttp(bufferedSource0);
            for(int v1 = 0; v1 < v3; ++v1) {
                headers$Builder1.addLenient$okhttp(bufferedSource0.readUtf8LineStrict());
            }
            String s2 = headers$Builder1.get(c.k);
            String s3 = headers$Builder1.get(c.l);
            headers$Builder1.removeAll(c.k);
            headers$Builder1.removeAll(c.l);
            long v4 = 0L;
            this.i = s2 == null ? 0L : Long.parseLong(s2);
            if(s3 != null) {
                v4 = Long.parseLong(s3);
            }
            this.j = v4;
            this.g = headers$Builder1.build();
            if(Intrinsics.areEqual(this.a.scheme(), "https")) {
                String s4 = bufferedSource0.readUtf8LineStrict();
                if(s4.length() > 0) {
                    throw new IOException("expected \"\" but was \"" + s4 + '\"');
                }
                String s5 = bufferedSource0.readUtf8LineStrict();
                CipherSuite cipherSuite0 = CipherSuite.Companion.forJavaName(s5);
                List list0 = c.a(bufferedSource0);
                List list1 = c.a(bufferedSource0);
                if(bufferedSource0.exhausted()) {
                    tlsVersion0 = TlsVersion.SSL_3_0;
                }
                else {
                    String s6 = bufferedSource0.readUtf8LineStrict();
                    tlsVersion0 = TlsVersion.Companion.forJavaName(s6);
                }
                this.h = Handshake.Companion.get(tlsVersion0, cipherSuite0, list0, list1);
            }
            else {
                this.h = null;
            }
            goto label_63;
        }
        catch(Throwable throwable0) {
        }
        try {
            throw throwable0;
        }
        catch(Throwable throwable1) {
            CloseableKt.closeFinally(source0, throwable0);
            throw throwable1;
        }
    label_63:
        CloseableKt.closeFinally(source0, null);
    }

    public static List a(BufferedSource bufferedSource0) {
        int v = Cache.Companion.readInt$okhttp(bufferedSource0);
        if(v == -1) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        try {
            CertificateFactory certificateFactory0 = CertificateFactory.getInstance("X.509");
            List list0 = new ArrayList(v);
            for(int v1 = 0; v1 < v; ++v1) {
                String s = bufferedSource0.readUtf8LineStrict();
                Buffer buffer0 = new Buffer();
                ByteString byteString0 = ByteString.Companion.decodeBase64(s);
                if(byteString0 == null) {
                    throw new IOException("Corrupt certificate in cache entry");
                }
                buffer0.write(byteString0);
                ((ArrayList)list0).add(certificateFactory0.generateCertificate(buffer0.inputStream()));
            }
            return list0;
        }
        catch(CertificateException certificateException0) {
        }
        throw new IOException(certificateException0.getMessage());
    }

    public static void b(BufferedSink bufferedSink0, List list0) {
        try {
            bufferedSink0.writeDecimalLong(((long)list0.size())).writeByte(10);
            for(Object object0: list0) {
                byte[] arr_b = ((Certificate)object0).getEncoded();
                Intrinsics.checkNotNullExpressionValue(arr_b, "bytes");
                bufferedSink0.writeUtf8(Companion.of$default(ByteString.Companion, arr_b, 0, 0, 3, null).base64()).writeByte(10);
            }
        }
        catch(CertificateEncodingException certificateEncodingException0) {
            throw new IOException(certificateEncodingException0.getMessage());
        }
    }

    public final void c(Editor diskLruCache$Editor0) {
        HttpUrl httpUrl0 = this.a;
        Handshake handshake0 = this.h;
        Headers headers0 = this.g;
        Headers headers1 = this.b;
        Intrinsics.checkNotNullParameter(diskLruCache$Editor0, "editor");
        BufferedSink bufferedSink0 = Okio.buffer(diskLruCache$Editor0.newSink(0));
        try {
            bufferedSink0.writeUtf8(httpUrl0.toString()).writeByte(10);
            bufferedSink0.writeUtf8(this.c).writeByte(10);
            bufferedSink0.writeDecimalLong(((long)headers1.size())).writeByte(10);
            int v1 = headers1.size();
            for(int v2 = 0; v2 < v1; ++v2) {
                bufferedSink0.writeUtf8(headers1.name(v2)).writeUtf8(": ").writeUtf8(headers1.value(v2)).writeByte(10);
            }
            bufferedSink0.writeUtf8(new StatusLine(this.d, this.e, this.f).toString()).writeByte(10);
            bufferedSink0.writeDecimalLong(((long)(headers0.size() + 2))).writeByte(10);
            int v3 = headers0.size();
            for(int v = 0; v < v3; ++v) {
                bufferedSink0.writeUtf8(headers0.name(v)).writeUtf8(": ").writeUtf8(headers0.value(v)).writeByte(10);
            }
            bufferedSink0.writeUtf8(c.k).writeUtf8(": ").writeDecimalLong(this.i).writeByte(10);
            bufferedSink0.writeUtf8(c.l).writeUtf8(": ").writeDecimalLong(this.j).writeByte(10);
            if(Intrinsics.areEqual(httpUrl0.scheme(), "https")) {
                bufferedSink0.writeByte(10);
                Intrinsics.checkNotNull(handshake0);
                bufferedSink0.writeUtf8(handshake0.cipherSuite().javaName()).writeByte(10);
                c.b(bufferedSink0, handshake0.peerCertificates());
                c.b(bufferedSink0, handshake0.localCertificates());
                bufferedSink0.writeUtf8(handshake0.tlsVersion().javaName()).writeByte(10);
            }
            goto label_38;
        }
        catch(Throwable throwable0) {
        }
        try {
            throw throwable0;
        }
        catch(Throwable throwable1) {
            CloseableKt.closeFinally(bufferedSink0, throwable0);
            throw throwable1;
        }
    label_38:
        CloseableKt.closeFinally(bufferedSink0, null);
    }
}

