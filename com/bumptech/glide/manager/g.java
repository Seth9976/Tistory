package com.bumptech.glide.manager;

import a7.b;
import android.content.Context;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.util.Util;
import java.util.HashMap;

public final class g {
    public final HashMap a;
    public final RequestManagerFactory b;

    public g(RequestManagerFactory requestManagerRetriever$RequestManagerFactory0) {
        this.a = new HashMap();
        this.b = requestManagerRetriever$RequestManagerFactory0;
    }

    public final RequestManager a(Context context0, Glide glide0, Lifecycle lifecycle0, FragmentManager fragmentManager0, boolean z) {
        Util.assertMainThread();
        Util.assertMainThread();
        HashMap hashMap0 = this.a;
        RequestManager requestManager0 = (RequestManager)hashMap0.get(lifecycle0);
        if(requestManager0 == null) {
            e e0 = new e(lifecycle0);
            b b0 = new b(this, fragmentManager0, false, 8);
            RequestManager requestManager1 = this.b.build(glide0, e0, b0, context0);
            hashMap0.put(lifecycle0, requestManager1);
            e0.addListener(new f(this, lifecycle0));
            if(z) {
                requestManager1.onStart();
            }
            return requestManager1;
        }
        return requestManager0;
    }
}

