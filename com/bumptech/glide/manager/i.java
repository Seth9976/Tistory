package com.bumptech.glide.manager;

import android.content.Context;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;

public final class i implements RequestManagerFactory {
    @Override  // com.bumptech.glide.manager.RequestManagerRetriever$RequestManagerFactory
    public final RequestManager build(Glide glide0, Lifecycle lifecycle0, RequestManagerTreeNode requestManagerTreeNode0, Context context0) {
        return new RequestManager(glide0, lifecycle0, requestManagerTreeNode0, context0);
    }
}

