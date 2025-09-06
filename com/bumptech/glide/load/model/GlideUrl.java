package com.bumptech.glide.load.model;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.util.Preconditions;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.util.Map;

public class GlideUrl implements Key {
    public final Headers a;
    public final URL b;
    public final String c;
    public String d;
    public URL e;
    public volatile byte[] f;
    public int g;

    public GlideUrl(String s) {
        this(s, Headers.DEFAULT);
    }

    public GlideUrl(String s, Headers headers0) {
        this.b = null;
        this.c = Preconditions.checkNotEmpty(s);
        this.a = (Headers)Preconditions.checkNotNull(headers0);
    }

    public GlideUrl(URL uRL0) {
        this(uRL0, Headers.DEFAULT);
    }

    public GlideUrl(URL uRL0, Headers headers0) {
        this.b = (URL)Preconditions.checkNotNull(uRL0);
        this.c = null;
        this.a = (Headers)Preconditions.checkNotNull(headers0);
    }

    public final String a() {
        if(TextUtils.isEmpty(this.d)) {
            this.d = Uri.encode((TextUtils.isEmpty(this.c) ? ((URL)Preconditions.checkNotNull(this.b)).toString() : this.c), "@#&=*+-_.,:!?()/~\'%;$");
        }
        return this.d;
    }

    // 去混淆评级： 低(30)
    @Override  // com.bumptech.glide.load.Key
    public boolean equals(Object object0) {
        return object0 instanceof GlideUrl && this.getCacheKey().equals(((GlideUrl)object0).getCacheKey()) && this.a.equals(((GlideUrl)object0).a);
    }

    public String getCacheKey() {
        return this.c == null ? ((URL)Preconditions.checkNotNull(this.b)).toString() : this.c;
    }

    public Map getHeaders() {
        return this.a.getHeaders();
    }

    @Override  // com.bumptech.glide.load.Key
    public int hashCode() {
        if(this.g == 0) {
            int v = this.getCacheKey().hashCode();
            this.g = this.a.hashCode() + v * 0x1F;
        }
        return this.g;
    }

    @Override
    public String toString() {
        return this.getCacheKey();
    }

    public String toStringUrl() {
        return this.a();
    }

    public URL toURL() throws MalformedURLException {
        if(this.e == null) {
            this.e = new URL(this.a());
        }
        return this.e;
    }

    @Override  // com.bumptech.glide.load.Key
    public void updateDiskCacheKey(@NonNull MessageDigest messageDigest0) {
        if(this.f == null) {
            this.f = this.getCacheKey().getBytes(Key.CHARSET);
        }
        messageDigest0.update(this.f);
    }
}

