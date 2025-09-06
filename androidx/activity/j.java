package androidx.activity;

import android.content.Intent;
import android.content.IntentSender.SendIntentException;
import androidx.activity.result.contract.ActivityResultContract.SynchronousResult;
import androidx.core.location.d;
import androidx.profileinstaller.DeviceProfileWriter;
import g3.q;
import java.io.Serializable;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;

public final class j implements Runnable {
    public final int a;
    public final Object b;
    public final int c;
    public final Object d;

    public j(Object object0, int v, Object object1, int v1) {
        this.a = v1;
        this.b = object0;
        this.c = v;
        this.d = object1;
        super();
    }

    public j(Object object0, Executor executor0, int v, int v1) {
        this.a = v1;
        this.b = object0;
        this.d = executor0;
        this.c = v;
        super();
    }

    @Override
    public final void run() {
        switch(this.a) {
            case 0: {
                Intrinsics.checkNotNullParameter(((androidx.activity.ComponentActivity.activityResultRegistry.1)this.b), "this$0");
                Object object0 = ((SynchronousResult)this.d).getValue();
                ((androidx.activity.ComponentActivity.activityResultRegistry.1)this.b).dispatchResult(this.c, object0);
                return;
            }
            case 1: {
                Intrinsics.checkNotNullParameter(((androidx.activity.ComponentActivity.activityResultRegistry.1)this.b), "this$0");
                Intrinsics.checkNotNullParameter(((IntentSender.SendIntentException)this.d), "$e");
                Intent intent0 = new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", ((IntentSender.SendIntentException)this.d));
                ((androidx.activity.ComponentActivity.activityResultRegistry.1)this.b).dispatchResult(this.c, 0, intent0);
                return;
            }
            case 2: {
                q q0 = (q)this.b;
                int v = this.c;
                if(q0.b == ((Executor)this.d)) {
                    q0.a.onStatusChanged(v);
                }
                return;
            }
            case 3: {
                boolean z = ((d)this.b).b != ((Executor)this.d);
                return;
            }
            default: {
                ((DeviceProfileWriter)this.b).c.onResultReceived(this.c, ((Serializable)this.d));
            }
        }
    }
}

