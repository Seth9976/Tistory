package com.bumptech.glide.load.engine.cache;

import android.app.ActivityManager;
import android.content.Context;
import android.text.format.Formatter;
import android.util.Log;
import com.bumptech.glide.util.Preconditions;

public final class MemorySizeCalculator {
    public static final class Builder {
        public final Context a;
        public final ActivityManager b;
        public final g c;
        public float d;
        public float e;
        public float f;
        public float g;
        public int h;

        public Builder(Context context0) {
            this.d = 2.0f;
            this.e = 1.0f;
            this.f = 0.4f;
            this.g = 0.33f;
            this.h = 0x400000;
            this.a = context0;
            ActivityManager activityManager0 = (ActivityManager)context0.getSystemService("activity");
            this.b = activityManager0;
            this.c = new g(context0.getResources().getDisplayMetrics());
            if(activityManager0.isLowRamDevice()) {
                this.e = 0.0f;
            }
        }

        public MemorySizeCalculator build() {
            return new MemorySizeCalculator(this);
        }

        public Builder setArrayPoolSize(int v) {
            this.h = v;
            return this;
        }

        public Builder setBitmapPoolScreens(float f) {
            Preconditions.checkArgument(f >= 0.0f, "Bitmap pool screens must be greater than or equal to 0");
            this.e = f;
            return this;
        }

        public Builder setLowMemoryMaxSizeMultiplier(float f) {
            Preconditions.checkArgument(f >= 0.0f && f <= 1.0f, "Low memory max size multiplier must be between 0 and 1");
            this.g = f;
            return this;
        }

        public Builder setMaxSizeMultiplier(float f) {
            Preconditions.checkArgument(f >= 0.0f && f <= 1.0f, "Size multiplier must be between 0 and 1");
            this.f = f;
            return this;
        }

        public Builder setMemoryCacheScreens(float f) {
            Preconditions.checkArgument(f >= 0.0f, "Memory cache screens must be greater than or equal to 0");
            this.d = f;
            return this;
        }
    }

    interface ScreenDimensions {
        int getHeightPixels();

        int getWidthPixels();
    }

    public final int a;
    public final int b;
    public final int c;

    public MemorySizeCalculator(Builder memorySizeCalculator$Builder0) {
        Context context0 = memorySizeCalculator$Builder0.a;
        ActivityManager activityManager0 = memorySizeCalculator$Builder0.b;
        int v = activityManager0.isLowRamDevice() ? memorySizeCalculator$Builder0.h / 2 : memorySizeCalculator$Builder0.h;
        this.c = v;
        float f = memorySizeCalculator$Builder0.f;
        float f1 = memorySizeCalculator$Builder0.g;
        int v1 = activityManager0.getMemoryClass();
        if(activityManager0.isLowRamDevice()) {
            f = f1;
        }
        int v2 = Math.round(((float)(v1 * 0x100000)) * f);
        float f2 = (float)(memorySizeCalculator$Builder0.c.a.widthPixels * memorySizeCalculator$Builder0.c.a.heightPixels * 4);
        int v3 = Math.round(memorySizeCalculator$Builder0.e * f2);
        int v4 = Math.round(f2 * memorySizeCalculator$Builder0.d);
        int v5 = v2 - v;
        int v6 = v4 + v3;
        if(v6 <= v5) {
            this.b = v4;
            this.a = v3;
        }
        else {
            float f3 = memorySizeCalculator$Builder0.d;
            float f4 = ((float)v5) / (memorySizeCalculator$Builder0.e + f3);
            this.b = Math.round(f3 * f4);
            this.a = Math.round(f4 * memorySizeCalculator$Builder0.e);
        }
        if(Log.isLoggable("MemorySizeCalculator", 3)) {
            Log.d("MemorySizeCalculator", "Calculation complete, Calculated memory cache size: " + Formatter.formatFileSize(context0, ((long)this.b)) + ", pool size: " + Formatter.formatFileSize(context0, ((long)this.a)) + ", byte array size: " + Formatter.formatFileSize(context0, ((long)v)) + ", memory class limited? " + (v6 > v2) + ", max size: " + Formatter.formatFileSize(context0, ((long)v2)) + ", memoryClass: " + activityManager0.getMemoryClass() + ", isLowMemoryDevice: " + activityManager0.isLowRamDevice());
        }
    }

    public int getArrayPoolSizeInBytes() {
        return this.c;
    }

    public int getBitmapPoolSize() {
        return this.a;
    }

    public int getMemoryCacheSize() {
        return this.b;
    }
}

