package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.Key;

interface EngineJobListener {
    void onEngineJobCancelled(x arg1, Key arg2);

    void onEngineJobComplete(x arg1, Key arg2, z arg3);
}

