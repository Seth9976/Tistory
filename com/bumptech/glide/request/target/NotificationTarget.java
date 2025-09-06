package com.bumptech.glide.request.target;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.RemoteViews;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.request.transition.Transition;
import com.bumptech.glide.util.Preconditions;

public class NotificationTarget extends CustomTarget {
    public final RemoteViews d;
    public final Context e;
    public final int f;
    public final String g;
    public final Notification h;
    public final int i;

    public NotificationTarget(Context context0, int v, int v1, int v2, RemoteViews remoteViews0, Notification notification0, int v3, String s) {
        super(v, v1);
        this.e = (Context)Preconditions.checkNotNull(context0, "Context must not be null!");
        this.h = (Notification)Preconditions.checkNotNull(notification0, "Notification object can not be null!");
        this.d = (RemoteViews)Preconditions.checkNotNull(remoteViews0, "RemoteViews object can not be null!");
        this.i = v2;
        this.f = v3;
        this.g = s;
    }

    public NotificationTarget(Context context0, int v, RemoteViews remoteViews0, Notification notification0, int v1) {
        this(context0, v, remoteViews0, notification0, v1, null);
    }

    public NotificationTarget(Context context0, int v, RemoteViews remoteViews0, Notification notification0, int v1, String s) {
        this(context0, 0x80000000, 0x80000000, v, remoteViews0, notification0, v1, s);
    }

    public final void a(Bitmap bitmap0) {
        this.d.setImageViewBitmap(this.i, bitmap0);
        ((NotificationManager)Preconditions.checkNotNull(((NotificationManager)this.e.getSystemService("notification")))).notify(this.g, this.f, this.h);
    }

    @Override  // com.bumptech.glide.request.target.Target
    public void onLoadCleared(@Nullable Drawable drawable0) {
        this.a(null);
    }

    public void onResourceReady(@NonNull Bitmap bitmap0, @Nullable Transition transition0) {
        this.a(bitmap0);
    }

    @Override  // com.bumptech.glide.request.target.Target
    public void onResourceReady(@NonNull Object object0, @Nullable Transition transition0) {
        this.onResourceReady(((Bitmap)object0), transition0);
    }
}

