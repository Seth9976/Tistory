package androidx.core.provider;

import android.os.Handler.Callback;
import android.os.Handler;
import android.os.Message;

public final class r implements Handler.Callback {
    public final SelfDestructiveThread a;

    public r(SelfDestructiveThread selfDestructiveThread0) {
        this.a = selfDestructiveThread0;
    }

    @Override  // android.os.Handler$Callback
    public final boolean handleMessage(Message message0) {
        switch(message0.what) {
            case 0: {
                SelfDestructiveThread selfDestructiveThread0 = this.a;
                Object object0 = selfDestructiveThread0.a;
                synchronized(object0) {
                    if(selfDestructiveThread0.c.hasMessages(1)) {
                        return true;
                    }
                    selfDestructiveThread0.b.quit();
                    selfDestructiveThread0.b = null;
                    selfDestructiveThread0.c = null;
                    return true;
                }
            }
            case 1: {
                Runnable runnable0 = (Runnable)message0.obj;
                this.a.getClass();
                runnable0.run();
                synchronized(this.a.a) {
                    this.a.c.removeMessages(0);
                    Handler handler0 = this.a.c;
                    handler0.sendMessageDelayed(handler0.obtainMessage(0), ((long)this.a.f));
                    return true;
                }
            }
            default: {
                return true;
            }
        }
    }
}

