package com.bumptech.glide.load.engine;

import android.os.Handler.Callback;
import android.os.Message;
import com.bumptech.glide.request.target.PreloadTarget;

public final class f0 implements Handler.Callback {
    public final int a;

    public f0(int v) {
        this.a = v;
        super();
    }

    @Override  // android.os.Handler$Callback
    public final boolean handleMessage(Message message0) {
        if(this.a != 0) {
            if(message0.what == 1) {
                ((PreloadTarget)message0.obj).d.clear(((PreloadTarget)message0.obj));
                return true;
            }
            return false;
        }
        if(message0.what == 1) {
            ((Resource)message0.obj).recycle();
            return true;
        }
        return false;
    }
}

