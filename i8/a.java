package i8;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.google.android.gms.tasks.TaskCompletionSource;

public final class a extends ResultReceiver {
    public final TaskCompletionSource a;

    public a(Handler handler0, TaskCompletionSource taskCompletionSource0) {
        this.a = taskCompletionSource0;
        super(handler0);
    }

    @Override  // android.os.ResultReceiver
    public final void onReceiveResult(int v, Bundle bundle0) {
        TaskCompletionSource taskCompletionSource0 = this.a;
        switch(v) {
            case 1: {
                taskCompletionSource0.trySetResult(-1);
                return;
            }
            case 2: {
                taskCompletionSource0.trySetResult(0);
                return;
            }
            default: {
                taskCompletionSource0.trySetResult(1);
            }
        }
    }
}

