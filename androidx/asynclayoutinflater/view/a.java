package androidx.asynclayoutinflater.view;

import android.os.Handler.Callback;
import android.os.Message;

public final class a implements Handler.Callback {
    public final AsyncLayoutInflater a;

    public a(AsyncLayoutInflater asyncLayoutInflater0) {
        this.a = asyncLayoutInflater0;
    }

    @Override  // android.os.Handler$Callback
    public final boolean handleMessage(Message message0) {
        b b0 = (b)message0.obj;
        AsyncLayoutInflater asyncLayoutInflater0 = this.a;
        if(b0.d == null) {
            b0.d = asyncLayoutInflater0.a.inflate(b0.c, b0.b, false);
        }
        b0.e.onInflateFinished(b0.d, b0.c, b0.b);
        asyncLayoutInflater0.c.getClass();
        b0.e = null;
        b0.a = null;
        b0.b = null;
        b0.c = 0;
        b0.d = null;
        asyncLayoutInflater0.c.b.release(b0);
        return true;
    }
}

