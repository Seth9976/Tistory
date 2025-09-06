package okhttp3.internal.connection;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.ConnectionSpec;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001A\u00020\u00032\u0006\u0010\b\u001A\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000E\u001A\u00020\r2\u0006\u0010\f\u001A\u00020\u000B¢\u0006\u0004\b\u000E\u0010\u000F¨\u0006\u0010"}, d2 = {"Lokhttp3/internal/connection/ConnectionSpecSelector;", "", "", "Lokhttp3/ConnectionSpec;", "connectionSpecs", "<init>", "(Ljava/util/List;)V", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "configureSecureSocket", "(Ljavax/net/ssl/SSLSocket;)Lokhttp3/ConnectionSpec;", "Ljava/io/IOException;", "e", "", "connectionFailed", "(Ljava/io/IOException;)Z", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class ConnectionSpecSelector {
    public final List a;
    public int b;
    public boolean c;
    public boolean d;

    public ConnectionSpecSelector(@NotNull List list0) {
        Intrinsics.checkNotNullParameter(list0, "connectionSpecs");
        super();
        this.a = list0;
    }

    @NotNull
    public final ConnectionSpec configureSecureSocket(@NotNull SSLSocket sSLSocket0) throws IOException {
        boolean z;
        ConnectionSpec connectionSpec0;
        Intrinsics.checkNotNullParameter(sSLSocket0, "sslSocket");
        int v = this.b;
        List list0 = this.a;
        int v1 = list0.size();
        while(true) {
            connectionSpec0 = null;
            z = true;
            if(v >= v1) {
                break;
            }
            connectionSpec0 = (ConnectionSpec)list0.get(v);
            if(connectionSpec0.isCompatible(sSLSocket0)) {
                this.b = v + 1;
                break;
            }
            ++v;
        }
        if(connectionSpec0 != null) {
            int v2 = this.b;
            int v3 = list0.size();
            while(true) {
                if(v2 >= v3) {
                    z = false;
                    break;
                }
                if(((ConnectionSpec)list0.get(v2)).isCompatible(sSLSocket0)) {
                    break;
                }
                ++v2;
            }
            this.c = z;
            connectionSpec0.apply$okhttp(sSLSocket0, this.d);
            return connectionSpec0;
        }
        String[] arr_s = sSLSocket0.getEnabledProtocols();
        Intrinsics.checkNotNull(arr_s);
        String s = Arrays.toString(arr_s);
        Intrinsics.checkNotNullExpressionValue(s, "toString(this)");
        throw new UnknownServiceException("Unable to find acceptable protocols. isFallback=" + this.d + ", modes=" + list0 + ", supported protocols=" + s);
    }

    // 去混淆评级： 低(23)
    public final boolean connectionFailed(@NotNull IOException iOException0) {
        Intrinsics.checkNotNullParameter(iOException0, "e");
        this.d = true;
        return this.c ? !(iOException0 instanceof ProtocolException) && !(iOException0 instanceof InterruptedIOException) && (!(iOException0 instanceof SSLHandshakeException) || !(iOException0.getCause() instanceof CertificateException)) && !(iOException0 instanceof SSLPeerUnverifiedException) && iOException0 instanceof SSLException : false;
    }
}

