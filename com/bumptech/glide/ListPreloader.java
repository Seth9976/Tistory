package com.bumptech.glide;

import android.widget.AbsListView.OnScrollListener;
import android.widget.AbsListView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;

public class ListPreloader implements AbsListView.OnScrollListener {
    public interface PreloadModelProvider {
        @NonNull
        List getPreloadItems(int arg1);

        @Nullable
        RequestBuilder getPreloadRequestBuilder(@NonNull Object arg1);
    }

    public interface PreloadSizeProvider {
        @Nullable
        int[] getPreloadSize(@NonNull Object arg1, int arg2, int arg3);
    }

    public final int a;
    public final g b;
    public final RequestManager c;
    public final PreloadModelProvider d;
    public final PreloadSizeProvider e;
    public int f;
    public int g;
    public int h;
    public int i;
    public boolean j;

    public ListPreloader(@NonNull RequestManager requestManager0, @NonNull PreloadModelProvider listPreloader$PreloadModelProvider0, @NonNull PreloadSizeProvider listPreloader$PreloadSizeProvider0, int v) {
        this.h = -1;
        this.j = true;
        this.c = requestManager0;
        this.d = listPreloader$PreloadModelProvider0;
        this.e = listPreloader$PreloadSizeProvider0;
        this.a = v;
        this.b = new g(v + 1);
    }

    public final void a(int v, boolean z) {
        int v4;
        int v3;
        if(this.j != z) {
            this.j = z;
            for(int v1 = 0; true; ++v1) {
                g g0 = this.b;
                if(v1 >= g0.a.size()) {
                    break;
                }
                f f0 = (f)g0.a.poll();
                g0.a.offer(f0);
                f0.b = 0;
                f0.a = 0;
                this.c.clear(f0);
            }
        }
        int v2 = (z ? this.a : -this.a) + v;
        if(v < v2) {
            v3 = Math.max(this.f, v);
            v4 = v2;
        }
        else {
            v4 = Math.min(this.g, v);
            v3 = v2;
        }
        int v5 = Math.min(this.i, v4);
        int v6 = Math.min(this.i, Math.max(0, v3));
        PreloadModelProvider listPreloader$PreloadModelProvider0 = this.d;
        if(v < v2) {
            for(int v7 = v6; v7 < v5; ++v7) {
                this.b(v7, listPreloader$PreloadModelProvider0.getPreloadItems(v7), true);
            }
        }
        else {
            for(int v8 = v5 - 1; v8 >= v6; --v8) {
                this.b(v8, listPreloader$PreloadModelProvider0.getPreloadItems(v8), false);
            }
        }
        this.g = v6;
        this.f = v5;
    }

    public final void b(int v, List list0, boolean z) {
        int v1 = list0.size();
        if(z) {
            for(int v2 = 0; v2 < v1; ++v2) {
                this.c(v, v2, list0.get(v2));
            }
            return;
        }
        for(int v3 = v1 - 1; v3 >= 0; --v3) {
            this.c(v, v3, list0.get(v3));
        }
    }

    public final void c(int v, int v1, Object object0) {
        if(object0 == null) {
            return;
        }
        int[] arr_v = this.e.getPreloadSize(object0, v, v1);
        if(arr_v == null) {
            return;
        }
        RequestBuilder requestBuilder0 = this.d.getPreloadRequestBuilder(object0);
        if(requestBuilder0 == null) {
            return;
        }
        int v2 = arr_v[0];
        int v3 = arr_v[1];
        f f0 = (f)this.b.a.poll();
        this.b.a.offer(f0);
        f0.b = v2;
        f0.a = v3;
        requestBuilder0.into(f0);
    }

    @Override  // android.widget.AbsListView$OnScrollListener
    public void onScroll(AbsListView absListView0, int v, int v1, int v2) {
        if(this.i == 0 && v2 == 0) {
            return;
        }
        this.i = v2;
        int v3 = this.h;
        if(v > v3) {
            this.a(v1 + v, true);
        }
        else if(v < v3) {
            this.a(v, false);
        }
        this.h = v;
    }

    @Override  // android.widget.AbsListView$OnScrollListener
    public void onScrollStateChanged(AbsListView absListView0, int v) {
    }
}

