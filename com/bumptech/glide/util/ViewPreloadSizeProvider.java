package com.bumptech.glide.util;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.ListPreloader.PreloadSizeProvider;
import com.bumptech.glide.k;
import com.bumptech.glide.request.target.SizeReadyCallback;
import java.util.Arrays;

public class ViewPreloadSizeProvider implements PreloadSizeProvider, SizeReadyCallback {
    public int[] a;
    public k b;

    public ViewPreloadSizeProvider() {
    }

    public ViewPreloadSizeProvider(@NonNull View view0) {
        k k0 = new k(1, view0);
        this.b = k0;
        k0.getSize(this);
    }

    @Override  // com.bumptech.glide.ListPreloader$PreloadSizeProvider
    @Nullable
    public int[] getPreloadSize(@NonNull Object object0, int v, int v1) {
        return this.a == null ? null : Arrays.copyOf(this.a, this.a.length);
    }

    @Override  // com.bumptech.glide.request.target.SizeReadyCallback
    public void onSizeReady(int v, int v1) {
        this.a = new int[]{v, v1};
        this.b = null;
    }

    public void setView(@NonNull View view0) {
        if(this.a == null && this.b == null) {
            k k0 = new k(1, view0);
            this.b = k0;
            k0.getSize(this);
        }
    }
}

