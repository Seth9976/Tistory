package com.bumptech.glide.load.data;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.HttpException;
import com.bumptech.glide.load.model.GlideUrl;
import com.bumptech.glide.util.ContentLengthInputStream;
import com.bumptech.glide.util.LogTime;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map.Entry;
import java.util.Map;

public class HttpUrlFetcher implements DataFetcher {
    interface HttpUrlConnectionFactory {
        HttpURLConnection build(URL arg1) throws IOException;
    }

    public final GlideUrl a;
    public final int b;
    public HttpURLConnection c;
    public InputStream d;
    public volatile boolean e;

    static {
    }

    public HttpUrlFetcher(GlideUrl glideUrl0, int v) {
        this.a = glideUrl0;
        this.b = v;
    }

    public static int a(HttpURLConnection httpURLConnection0) {
        try {
            return httpURLConnection0.getResponseCode();
        }
        catch(IOException iOException0) {
            if(Log.isLoggable("HttpUrlFetcher", 3)) {
                Log.d("HttpUrlFetcher", "Failed to get a response code", iOException0);
            }
            return -1;
        }
    }

    public final InputStream b(URL uRL0, int v, URL uRL1, Map map0) {
        URL uRL2;
        HttpURLConnection httpURLConnection1;
        HttpURLConnection httpURLConnection0;
        if(v < 5) {
            if(uRL1 != null) {
                try {
                    if(uRL0.toURI().equals(uRL1.toURI())) {
                        throw new HttpException("In re-direct loop", -1);
                    }
                }
                catch(URISyntaxException unused_ex) {
                }
            }
            try {
                httpURLConnection0 = (HttpURLConnection)uRL0.openConnection();
            }
            catch(IOException iOException0) {
                throw new HttpException("URL.openConnection threw", 0, iOException0);
            }
            for(Object object0: map0.entrySet()) {
                httpURLConnection0.addRequestProperty(((String)((Map.Entry)object0).getKey()), ((String)((Map.Entry)object0).getValue()));
            }
            httpURLConnection0.setConnectTimeout(this.b);
            httpURLConnection0.setReadTimeout(this.b);
            httpURLConnection0.setUseCaches(false);
            httpURLConnection0.setDoInput(true);
            httpURLConnection0.setInstanceFollowRedirects(false);
            this.c = httpURLConnection0;
            try {
                httpURLConnection0.connect();
                this.d = this.c.getInputStream();
            }
            catch(IOException iOException1) {
                throw new HttpException("Failed to connect or obtain data", HttpUrlFetcher.a(this.c), iOException1);
            }
            if(this.e) {
                return null;
            }
            int v1 = HttpUrlFetcher.a(this.c);
            if(v1 / 100 == 2) {
                try {
                    httpURLConnection1 = this.c;
                    if(TextUtils.isEmpty(httpURLConnection1.getContentEncoding())) {
                        int v2 = httpURLConnection1.getContentLength();
                        this.d = ContentLengthInputStream.obtain(httpURLConnection1.getInputStream(), ((long)v2));
                        return this.d;
                    }
                    if(Log.isLoggable("HttpUrlFetcher", 3)) {
                        Log.d("HttpUrlFetcher", "Got non empty content encoding: " + httpURLConnection1.getContentEncoding());
                    }
                    this.d = httpURLConnection1.getInputStream();
                    return this.d;
                }
                catch(IOException iOException2) {
                }
                throw new HttpException("Failed to obtain InputStream", HttpUrlFetcher.a(httpURLConnection1), iOException2);
            }
            if(v1 / 100 == 3) {
                String s = this.c.getHeaderField("Location");
                if(TextUtils.isEmpty(s)) {
                    throw new HttpException("Received empty or null redirect url", v1);
                }
                try {
                    uRL2 = new URL(uRL0, s);
                }
                catch(MalformedURLException malformedURLException0) {
                    throw new HttpException("Bad redirect url: " + s, v1, malformedURLException0);
                }
                this.cleanup();
                return this.b(uRL2, v + 1, uRL0, map0);
            }
            if(v1 == -1) {
                throw new HttpException(-1);
            }
            try {
                throw new HttpException(this.c.getResponseMessage(), v1);
            }
            catch(IOException iOException3) {
                throw new HttpException("Failed to get a response message", v1, iOException3);
            }
        }
        throw new HttpException("Too many (> 5) redirects!", -1);
    }

    @Override  // com.bumptech.glide.load.data.DataFetcher
    public void cancel() {
        this.e = true;
    }

    @Override  // com.bumptech.glide.load.data.DataFetcher
    public void cleanup() {
        InputStream inputStream0 = this.d;
        if(inputStream0 != null) {
            try {
                inputStream0.close();
            }
            catch(IOException unused_ex) {
            }
        }
        HttpURLConnection httpURLConnection0 = this.c;
        if(httpURLConnection0 != null) {
            httpURLConnection0.disconnect();
        }
        this.c = null;
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
        long v = LogTime.getLogTime();
        try {
            try {
                dataFetcher$DataCallback0.onDataReady(this.b(this.a.toURL(), 0, null, this.a.getHeaders()));
                goto label_14;
            }
            catch(IOException iOException0) {
            }
            if(Log.isLoggable("HttpUrlFetcher", 3)) {
                Log.d("HttpUrlFetcher", "Failed to load data for url", iOException0);
            }
            dataFetcher$DataCallback0.onLoadFailed(iOException0);
        }
        catch(Throwable throwable0) {
            goto label_11;
        }
        if(Log.isLoggable("HttpUrlFetcher", 2)) {
            Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + LogTime.getElapsedMillis(v));
            return;
        label_11:
            if(Log.isLoggable("HttpUrlFetcher", 2)) {
                Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + LogTime.getElapsedMillis(v));
            }
            throw throwable0;
        label_14:
            if(Log.isLoggable("HttpUrlFetcher", 2)) {
                Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + LogTime.getElapsedMillis(v));
            }
        }
    }
}

