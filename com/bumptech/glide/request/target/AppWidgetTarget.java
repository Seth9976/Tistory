package com.bumptech.glide.request.target;

import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.RemoteViews;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.request.transition.Transition;
import com.bumptech.glide.util.Preconditions;

public class AppWidgetTarget extends CustomTarget {
    public final int[] d;
    public final ComponentName e;
    public final RemoteViews f;
    public final Context g;
    public final int h;

    public AppWidgetTarget(Context context0, int v, int v1, int v2, RemoteViews remoteViews0, ComponentName componentName0) {
        super(v, v1);
        this.g = (Context)Preconditions.checkNotNull(context0, "Context can not be null!");
        this.f = (RemoteViews)Preconditions.checkNotNull(remoteViews0, "RemoteViews object can not be null!");
        this.e = (ComponentName)Preconditions.checkNotNull(componentName0, "ComponentName can not be null!");
        this.h = v2;
        this.d = null;
    }

    public AppWidgetTarget(Context context0, int v, int v1, int v2, RemoteViews remoteViews0, int[] arr_v) {
        super(v, v1);
        if(arr_v.length == 0) {
            throw new IllegalArgumentException("WidgetIds must have length > 0");
        }
        this.g = (Context)Preconditions.checkNotNull(context0, "Context can not be null!");
        this.f = (RemoteViews)Preconditions.checkNotNull(remoteViews0, "RemoteViews object can not be null!");
        this.d = (int[])Preconditions.checkNotNull(arr_v, "WidgetIds can not be null!");
        this.h = v2;
        this.e = null;
    }

    public AppWidgetTarget(Context context0, int v, RemoteViews remoteViews0, ComponentName componentName0) {
        this(context0, 0x80000000, 0x80000000, v, remoteViews0, componentName0);
    }

    public AppWidgetTarget(Context context0, int v, RemoteViews remoteViews0, int[] arr_v) {
        this(context0, 0x80000000, 0x80000000, v, remoteViews0, arr_v);
    }

    @Override  // com.bumptech.glide.request.target.Target
    public void onLoadCleared(@Nullable Drawable drawable0) {
        RemoteViews remoteViews0 = this.f;
        remoteViews0.setImageViewBitmap(this.h, null);
        AppWidgetManager appWidgetManager0 = AppWidgetManager.getInstance(this.g);
        ComponentName componentName0 = this.e;
        if(componentName0 != null) {
            appWidgetManager0.updateAppWidget(componentName0, remoteViews0);
            return;
        }
        appWidgetManager0.updateAppWidget(this.d, remoteViews0);
    }

    public void onResourceReady(@NonNull Bitmap bitmap0, @Nullable Transition transition0) {
        RemoteViews remoteViews0 = this.f;
        remoteViews0.setImageViewBitmap(this.h, bitmap0);
        AppWidgetManager appWidgetManager0 = AppWidgetManager.getInstance(this.g);
        ComponentName componentName0 = this.e;
        if(componentName0 != null) {
            appWidgetManager0.updateAppWidget(componentName0, remoteViews0);
            return;
        }
        appWidgetManager0.updateAppWidget(this.d, remoteViews0);
    }

    @Override  // com.bumptech.glide.request.target.Target
    public void onResourceReady(@NonNull Object object0, @Nullable Transition transition0) {
        this.onResourceReady(((Bitmap)object0), transition0);
    }
}

