package com.bumptech.glide.integration.okhttp3;

import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.HttpException;
import com.bumptech.glide.load.data.DataFetcher.DataCallback;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.model.GlideUrl;
import com.bumptech.glide.util.ContentLengthInputStream;
import com.bumptech.glide.util.Preconditions;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map.Entry;
import okhttp3.Call.Factory;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Request.Builder;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

public class OkHttpStreamFetcher implements DataFetcher, Callback {
    public final Factory a;
    public final GlideUrl b;
    public InputStream c;
    public ResponseBody d;
    public DataCallback e;
    public volatile Call f;

    public OkHttpStreamFetcher(Factory call$Factory0, GlideUrl glideUrl0) {
        this.a = call$Factory0;
        this.b = glideUrl0;
    }

    @Override  // com.bumptech.glide.load.data.DataFetcher
    public void cancel() {
        Call call0 = this.f;
        if(call0 != null) {
            call0.cancel();
        }
    }

    @Override  // com.bumptech.glide.load.data.DataFetcher
    public void cleanup() {
        try {
            InputStream inputStream0 = this.c;
            if(inputStream0 != null) {
                inputStream0.close();
            }
        }
        catch(IOException unused_ex) {
        }
        ResponseBody responseBody0 = this.d;
        if(responseBody0 != null) {
            responseBody0.close();
        }
        this.e = null;
    }

    @Override  // com.bumptech.glide.load.data.DataFetcher
    @NonNull
    public Class getDataClass() {
        return InputStream.class;
    }

    @Override  // com.bumptech.glide.load.data.DataFetcher
    @NonNull
    public DataSource getDataSource() {
        return DataSource.REMOTE;
    }

    @Override  // com.bumptech.glide.load.data.DataFetcher
    public void loadData(@NonNull Priority priority0, @NonNull DataCallback dataFetcher$DataCallback0) {
        Builder request$Builder0 = new Builder().url(this.b.toStringUrl());
        for(Object object0: this.b.getHeaders().entrySet()) {
            request$Builder0.addHeader(((String)((Map.Entry)object0).getKey()), ((String)((Map.Entry)object0).getValue()));
        }
        Request request0 = request$Builder0.build();
        this.e = dataFetcher$DataCallback0;
        this.f = this.a.newCall(request0);
        this.f.enqueue(this);
    }

    @Override  // okhttp3.Callback
    public void onFailure(@NonNull Call call0, @NonNull IOException iOException0) {
        if(Log.isLoggable("OkHttpFetcher", 3)) {
            Log.d("OkHttpFetcher", "OkHttp failed to obtain result", iOException0);
        }
        this.e.onLoadFailed(iOException0);
    }

    @Override  // okhttp3.Callback
    public void onResponse(@NonNull Call call0, @NonNull Response response0) {
        this.d = response0.body();
        if(response0.isSuccessful()) {
            long v = ((ResponseBody)Preconditions.checkNotNull(this.d)).contentLength();
            InputStream inputStream0 = ContentLengthInputStream.obtain(this.d.byteStream(), v);
            this.c = inputStream0;
            this.e.onDataReady(inputStream0);
            return;
        }
        this.e.onLoadFailed(new HttpException(response0.message(), response0.code()));
    }
}

