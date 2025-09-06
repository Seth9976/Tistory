package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.DataSource;

interface DecodeJob.Callback {
    void onLoadFailed(GlideException arg1);

    void onResourceReady(Resource arg1, DataSource arg2, boolean arg3);

    void reschedule(n arg1);
}

