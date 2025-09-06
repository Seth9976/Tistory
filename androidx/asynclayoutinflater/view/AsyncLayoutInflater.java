package androidx.asynclayoutinflater.view;

import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import p.a;

public final class AsyncLayoutInflater {
    public interface OnInflateFinishedListener {
        void onInflateFinished(@NonNull View arg1, @LayoutRes int arg2, @Nullable ViewGroup arg3);
    }

    public final a a;
    public final Handler b;
    public final c c;

    public AsyncLayoutInflater(@NonNull Context context0) {
        androidx.asynclayoutinflater.view.a a0 = new androidx.asynclayoutinflater.view.a(this);
        this.a = new a(context0);
        this.b = new Handler(a0);
        this.c = c.c;
    }

    @UiThread
    public void inflate(@LayoutRes int v, @Nullable ViewGroup viewGroup0, @NonNull OnInflateFinishedListener asyncLayoutInflater$OnInflateFinishedListener0) {
        if(asyncLayoutInflater$OnInflateFinishedListener0 != null) {
            c c0 = this.c;
            b b0 = (b)c0.b.acquire();
            if(b0 == null) {
                b0 = new b();  // 初始化器: Ljava/lang/Object;-><init>()V
            }
            b0.a = this;
            b0.c = v;
            b0.b = viewGroup0;
            b0.e = asyncLayoutInflater$OnInflateFinishedListener0;
            c0.getClass();
            try {
                c0.a.put(b0);
                return;
            }
            catch(InterruptedException interruptedException0) {
                throw new RuntimeException("Failed to enqueue async inflate request", interruptedException0);
            }
        }
        throw new NullPointerException("callback argument may not be null!");
    }
}

