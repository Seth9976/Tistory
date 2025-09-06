package okhttp3.internal.http;

import java.io.IOException;
import java.net.ProtocolException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.p;
import md.b;
import okhttp3.Interceptor.Chain;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response.Builder;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.Util;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.http2.ConnectionShutdownException;
import okio.BufferedSink;
import okio.Okio;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001A\u00020\b2\u0006\u0010\u0007\u001A\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000B"}, d2 = {"Lokhttp3/internal/http/CallServerInterceptor;", "Lokhttp3/Interceptor;", "", "forWebSocket", "<init>", "(Z)V", "Lokhttp3/Interceptor$Chain;", "chain", "Lokhttp3/Response;", "intercept", "(Lokhttp3/Interceptor$Chain;)Lokhttp3/Response;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class CallServerInterceptor implements Interceptor {
    public final boolean a;

    public CallServerInterceptor(boolean z) {
        this.a = z;
    }

    @Override  // okhttp3.Interceptor
    @NotNull
    public Response intercept(@NotNull Chain interceptor$Chain0) throws IOException {
        boolean z1;
        boolean z;
        Builder response$Builder0;
        Intrinsics.checkNotNullParameter(interceptor$Chain0, "chain");
        Exchange exchange0 = ((RealInterceptorChain)interceptor$Chain0).getExchange$okhttp();
        Intrinsics.checkNotNull(exchange0);
        Request request0 = ((RealInterceptorChain)interceptor$Chain0).getRequest$okhttp();
        RequestBody requestBody0 = request0.body();
        long v = System.currentTimeMillis();
        Long long0 = null;
        try {
            exchange0.writeRequestHeaders(request0);
            if(!HttpMethod.permitsRequestBody(request0.method()) || requestBody0 == null) {
                goto label_27;
            }
            else {
                if(p.equals("100-continue", request0.header("Expect"), true)) {
                    exchange0.flushRequest();
                    response$Builder0 = exchange0.readResponseHeaders(true);
                    goto label_12;
                }
                else {
                    goto label_16;
                }
                goto label_18;
            }
            goto label_35;
        }
        catch(IOException iOException0) {
            z = true;
            response$Builder0 = null;
            goto label_39;
        }
        try {
        label_12:
            z = true;
            exchange0.responseHeadersStart();
            z = false;
            goto label_18;
        }
        catch(IOException iOException0) {
            goto label_39;
        }
        try {
        label_16:
            z = true;
            response$Builder0 = null;
        }
        catch(IOException iOException0) {
            z = true;
            response$Builder0 = null;
            goto label_39;
        }
        try {
        label_18:
            if(response$Builder0 == null) {
                BufferedSink bufferedSink0 = Okio.buffer(exchange0.createRequestBody(request0, false));
                requestBody0.writeTo(bufferedSink0);
                bufferedSink0.close();
            }
            else {
                exchange0.noRequestBody();
                if(!exchange0.getConnection$okhttp().isMultiplexed$okhttp()) {
                    exchange0.noNewExchangesOnConnection();
                }
            }
            goto label_35;
        }
        catch(IOException iOException0) {
            goto label_39;
        }
        try {
        label_27:
            exchange0.noRequestBody();
            z = true;
            response$Builder0 = null;
        }
        catch(IOException iOException0) {
            z = true;
            response$Builder0 = null;
            goto label_39;
        }
        try {
        label_35:
            exchange0.finishRequest();
            iOException0 = null;
            goto label_41;
        }
        catch(IOException iOException0) {
        }
    label_39:
        if(iOException0 instanceof ConnectionShutdownException || !exchange0.getHasFailure$okhttp()) {
            throw iOException0;
        }
        try {
        label_41:
            if(response$Builder0 == null) {
                response$Builder0 = exchange0.readResponseHeaders(false);
                Intrinsics.checkNotNull(response$Builder0);
                if(z) {
                    exchange0.responseHeadersStart();
                    z = false;
                }
            }
            Response response0 = response$Builder0.request(request0).handshake(exchange0.getConnection$okhttp().handshake()).sentRequestAtMillis(v).receivedResponseAtMillis(System.currentTimeMillis()).build();
            int v1 = response0.code();
            if(v1 == 100) {
                z1 = true;
            }
            else if(102 > v1 || v1 >= 200) {
                z1 = false;
            }
            else {
                z1 = true;
            }
            if(z1) {
                Builder response$Builder1 = exchange0.readResponseHeaders(false);
                Intrinsics.checkNotNull(response$Builder1);
                if(z) {
                    exchange0.responseHeadersStart();
                }
                response0 = response$Builder1.request(request0).handshake(exchange0.getConnection$okhttp().handshake()).sentRequestAtMillis(v).receivedResponseAtMillis(System.currentTimeMillis()).build();
                v1 = response0.code();
            }
            exchange0.responseHeadersEnd(response0);
            Response response1 = !this.a || v1 != 101 ? response0.newBuilder().body(exchange0.openResponseBody(response0)).build() : response0.newBuilder().body(Util.EMPTY_RESPONSE).build();
            if(p.equals("close", response1.request().header("Connection"), true) || p.equals("close", Response.header$default(response1, "Connection", null, 2, null), true)) {
                exchange0.noNewExchangesOnConnection();
            }
            if(v1 == 204 || v1 == 205) {
                ResponseBody responseBody0 = response1.body();
                if((responseBody0 == null ? -1L : responseBody0.contentLength()) > 0L) {
                    StringBuilder stringBuilder0 = new StringBuilder("HTTP ");
                    stringBuilder0.append(v1);
                    stringBuilder0.append(" had non-zero Content-Length: ");
                    ResponseBody responseBody1 = response1.body();
                    if(responseBody1 != null) {
                        long0 = responseBody1.contentLength();
                    }
                    stringBuilder0.append(long0);
                    throw new ProtocolException(stringBuilder0.toString());
                }
            }
            return response1;
        label_80:
            if(iOException0 == null) {
                throw iOException1;
            }
        }
        catch(IOException iOException1) {
            goto label_80;
        }
        b.addSuppressed(iOException0, iOException1);
        throw iOException0;
    }
}

