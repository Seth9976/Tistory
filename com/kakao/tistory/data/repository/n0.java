package com.kakao.tistory.data.repository;

import android.content.ContentResolver;
import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okio.BufferedSink;
import okio.Okio;

public final class n0 extends RequestBody {
    public final MediaType a;
    public final ContentResolver b;
    public final Uri c;

    public n0(MediaType mediaType0, ContentResolver contentResolver0, Uri uri0) {
        Intrinsics.checkNotNullParameter(contentResolver0, "contentResolver");
        Intrinsics.checkNotNullParameter(uri0, "uri");
        super();
        this.a = mediaType0;
        this.b = contentResolver0;
        this.c = uri0;
    }

    @Override  // okhttp3.RequestBody
    public final long contentLength() {
        return -1L;
    }

    @Override  // okhttp3.RequestBody
    public final MediaType contentType() {
        return this.a;
    }

    @Override  // okhttp3.RequestBody
    public final void writeTo(BufferedSink bufferedSink0) {
        Intrinsics.checkNotNullParameter(bufferedSink0, "sink");
        try {
            InputStream inputStream0 = this.b.openInputStream(this.c);
            if(inputStream0 != null) {
                try {
                    bufferedSink0.writeAll(Okio.source(inputStream0));
                }
                catch(Throwable throwable0) {
                    CloseableKt.closeFinally(inputStream0, throwable0);
                    throw throwable0;
                }
                CloseableKt.closeFinally(inputStream0, null);
                return;
            }
        }
        catch(Throwable unused_ex) {
        }
        throw new IOException("Could not open " + this.c);
    }
}

