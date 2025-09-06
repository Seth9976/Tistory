package androidx.appcompat.app;

import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import java.lang.ref.WeakReference;

public final class j extends Handler {
    public final int a;
    public Object b;

    public j() {
        this.a = 0;
        super();
    }

    public j(LocalBroadcastManager localBroadcastManager0, Looper looper0) {
        this.a = 1;
        this.b = localBroadcastManager0;
        super(looper0);
    }

    @Override  // android.os.Handler
    public final void handleMessage(Message message0) {
        if(this.a != 0) {
            if(message0.what != 1) {
                super.handleMessage(message0);
                return;
            }
            ((LocalBroadcastManager)this.b).a();
            return;
        }
        switch(message0.what) {
            case -3: 
            case -2: 
            case -1: {
                ((DialogInterface.OnClickListener)message0.obj).onClick(((DialogInterface)((WeakReference)this.b).get()), message0.what);
                return;
            }
            case 1: {
                ((DialogInterface)message0.obj).dismiss();
            }
        }
    }
}

