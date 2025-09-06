package retrofit2;

import a5.b;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import jeb.synthetic.TWR;
import okhttp3.Call.Factory;
import okhttp3.HttpUrl.Builder;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okio.Buffer;
import okio.Timeout;
import wb.a;

public final class s implements Call {
    public final i0 a;
    public final Object b;
    public final Object[] c;
    public final Factory d;
    public final Converter e;
    public volatile boolean f;
    public okhttp3.Call g;
    public Throwable h;
    public boolean i;

    public s(i0 i00, Object object0, Object[] arr_object, Factory call$Factory0, Converter converter0) {
        this.a = i00;
        this.b = object0;
        this.c = arr_object;
        this.d = call$Factory0;
        this.e = converter0;
    }

    public final okhttp3.Call a() {
        HttpUrl httpUrl0;
        i0 i00 = this.a;
        Object[] arr_object = this.c;
        int v = arr_object.length;
        p0[] arr_p0 = i00.k;
        if(v == arr_p0.length) {
            g0 g00 = new g0(i00.d, i00.c, i00.e, i00.f, i00.g, i00.h, i00.i, i00.j);
            if(i00.l) {
                --v;
            }
            ArrayList arrayList0 = new ArrayList(v);
            for(int v1 = 0; v1 < v; ++v1) {
                arrayList0.add(arr_object[v1]);
                arr_p0[v1].a(g00, arr_object[v1]);
            }
            Builder httpUrl$Builder0 = g00.d;
            if(httpUrl$Builder0 == null) {
                HttpUrl httpUrl1 = g00.b;
                httpUrl0 = httpUrl1.resolve(g00.c);
                if(httpUrl0 == null) {
                    throw new IllegalArgumentException("Malformed URL. Base: " + httpUrl1 + ", Relative: " + g00.c);
                }
            }
            else {
                httpUrl0 = httpUrl$Builder0.build();
            }
            RequestBody requestBody0 = g00.k;
            if(requestBody0 == null) {
                okhttp3.FormBody.Builder formBody$Builder0 = g00.j;
                if(formBody$Builder0 == null) {
                    okhttp3.MultipartBody.Builder multipartBody$Builder0 = g00.i;
                    if(multipartBody$Builder0 != null) {
                        requestBody0 = multipartBody$Builder0.build();
                    }
                    else if(g00.h) {
                        requestBody0 = RequestBody.create(null, new byte[0]);
                    }
                }
                else {
                    requestBody0 = formBody$Builder0.build();
                }
            }
            MediaType mediaType0 = g00.g;
            okhttp3.Headers.Builder headers$Builder0 = g00.f;
            if(mediaType0 != null) {
                if(requestBody0 == null) {
                    headers$Builder0.add("Content-Type", mediaType0.toString());
                }
                else {
                    requestBody0 = new f0(requestBody0, mediaType0);
                }
            }
            okhttp3.Request.Builder request$Builder0 = g00.e.url(httpUrl0).headers(headers$Builder0.build()).method(g00.a, requestBody0);
            Invocation invocation0 = new Invocation(i00.a, this.b, i00.b, arrayList0);
            Request request0 = request$Builder0.tag(Invocation.class, invocation0).build();
            okhttp3.Call call0 = this.d.newCall(request0);
            if(call0 == null) {
                throw new NullPointerException("Call.Factory returned null.");
            }
            return call0;
        }
        StringBuilder stringBuilder0 = b.s(v, "Argument count (", ") doesn\'t match expected count (");
        throw new IllegalArgumentException(a.c(arr_p0.length, ")", stringBuilder0));
    }

    public final okhttp3.Call b() {
        okhttp3.Call call0 = this.g;
        if(call0 != null) {
            return call0;
        }
        Throwable throwable0 = this.h;
        if(throwable0 != null) {
            if(throwable0 instanceof IOException) {
                throw (IOException)throwable0;
            }
            if(throwable0 instanceof RuntimeException) {
                throw (RuntimeException)throwable0;
            }
            throw (Error)throwable0;
        }
        try {
            okhttp3.Call call1 = this.a();
            this.g = call1;
            return call1;
        }
        catch(RuntimeException | Error | IOException runtimeException0) {
            p0.p(runtimeException0);
            this.h = runtimeException0;
            throw runtimeException0;
        }
    }

    public final Response c(okhttp3.Response response0) {
        Response response2;
        ResponseBody responseBody0 = response0.body();
        okhttp3.Response response1 = response0.newBuilder().body(new r(responseBody0.contentType(), responseBody0.contentLength())).build();
        int v = response1.code();
        if(v >= 200 && v < 300) {
            if(v != 204 && v != 205) {
                q q0 = new q(responseBody0);
                try {
                    return Response.success(this.e.convert(q0), response1);
                }
                catch(RuntimeException runtimeException0) {
                    IOException iOException0 = q0.d;
                    if(iOException0 == null) {
                        throw runtimeException0;
                    }
                    throw iOException0;
                }
            }
            responseBody0.close();
            return Response.success(null, response1);
        }
        try {
            Buffer buffer0 = new Buffer();
            responseBody0.source().readAll(buffer0);
            response2 = Response.error(ResponseBody.create(responseBody0.contentType(), responseBody0.contentLength(), buffer0), response1);
        }
        catch(Throwable throwable0) {
            TWR.safeClose$NT(responseBody0, throwable0);
            throw throwable0;
        }
        responseBody0.close();
        return response2;
    }

    @Override  // retrofit2.Call
    public final void cancel() {
        okhttp3.Call call0;
        this.f = true;
        synchronized(this) {
            call0 = this.g;
        }
        if(call0 != null) {
            call0.cancel();
        }
    }

    @Override
    public final Object clone() {
        return new s(this.a, this.b, this.c, this.d, this.e);
    }

    @Override  // retrofit2.Call
    public final Call clone() {
        return new s(this.a, this.b, this.c, this.d, this.e);
    }

    @Override  // retrofit2.Call
    public final void enqueue(Callback callback0) {
        Objects.requireNonNull(callback0, "callback == null");
        synchronized(this) {
            if(!this.i) {
                this.i = true;
                okhttp3.Call call0 = this.g;
                Throwable throwable0 = this.h;
                if(call0 == null && throwable0 == null) {
                    try {
                        okhttp3.Call call1 = this.a();
                        this.g = call1;
                        call0 = call1;
                    }
                    catch(Throwable throwable0) {
                        p0.p(throwable0);
                        this.h = throwable0;
                    }
                }
                if(throwable0 != null) {
                    callback0.onFailure(this, throwable0);
                    return;
                }
                if(this.f) {
                    call0.cancel();
                }
                call0.enqueue(new p(this, callback0));
                return;
            }
        }
        throw new IllegalStateException("Already executed.");
    }

    @Override  // retrofit2.Call
    public final Response execute() {
        synchronized(this) {
            if(!this.i) {
                this.i = true;
                okhttp3.Call call0 = this.b();
                if(this.f) {
                    call0.cancel();
                }
                return this.c(call0.execute());
            }
        }
        throw new IllegalStateException("Already executed.");
    }

    @Override  // retrofit2.Call
    public final boolean isCanceled() {
        boolean z = true;
        if(this.f) {
            return true;
        }
        synchronized(this) {
            if(this.g == null || !this.g.isCanceled()) {
                z = false;
            }
            return z;
        }
    }

    @Override  // retrofit2.Call
    public final boolean isExecuted() {
        synchronized(this) {
        }
        return this.i;
    }

    @Override  // retrofit2.Call
    public final Request request() {
        synchronized(this) {
            try {
                return this.b().request();
            }
            catch(IOException iOException0) {
                throw new RuntimeException("Unable to create request.", iOException0);
            }
        }
    }

    @Override  // retrofit2.Call
    public final Timeout timeout() {
        synchronized(this) {
            try {
                return this.b().timeout();
            }
            catch(IOException iOException0) {
                throw new RuntimeException("Unable to create call.", iOException0);
            }
        }
    }
}

