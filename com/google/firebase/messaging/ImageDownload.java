package com.google.firebase.messaging;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Log;
import androidx.activity.m;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import g.a;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class ImageDownload implements Closeable {
    public final URL a;
    public volatile Future b;
    public Task c;

    public ImageDownload(URL uRL0) {
        this.a = uRL0;
    }

    public Bitmap blockingDownload() throws IOException {
        byte[] arr_b;
        boolean z = Log.isLoggable("FirebaseMessaging", 4);
        URL uRL0 = this.a;
        if(z) {
            Log.i("FirebaseMessaging", "Starting download of: " + uRL0);
        }
        URLConnection uRLConnection0 = uRL0.openConnection();
        if(uRLConnection0.getContentLength() > 0x100000) {
            throw new IOException("Content-Length exceeds max size of 1048576");
        }
        try(InputStream inputStream0 = uRLConnection0.getInputStream()) {
            arr_b = a.Z(new d(inputStream0));
        }
        if(Log.isLoggable("FirebaseMessaging", 2)) {
            Log.v("FirebaseMessaging", "Downloaded " + arr_b.length + " bytes from " + uRL0);
        }
        if(arr_b.length > 0x100000) {
            throw new IOException("Image exceeds max size of 1048576");
        }
        Bitmap bitmap0 = BitmapFactory.decodeByteArray(arr_b, 0, arr_b.length);
        if(bitmap0 == null) {
            throw new IOException("Failed to decode image: " + uRL0);
        }
        if(Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Successfully downloaded image: " + uRL0);
        }
        return bitmap0;
    }

    @Override
    public void close() {
        this.b.cancel(true);
    }

    @Nullable
    public static ImageDownload create(String s) {
        if(TextUtils.isEmpty(s)) {
            return null;
        }
        try {
            return new ImageDownload(new URL(s));
        }
        catch(MalformedURLException unused_ex) {
            Log.w("FirebaseMessaging", "Not downloading image, bad URL: " + s);
            return null;
        }
    }

    public Task getTask() {
        return (Task)Preconditions.checkNotNull(this.c);
    }

    public void start(ExecutorService executorService0) {
        TaskCompletionSource taskCompletionSource0 = new TaskCompletionSource();
        this.b = executorService0.submit(new m(16, this, taskCompletionSource0));
        this.c = taskCompletionSource0.getTask();
    }
}

