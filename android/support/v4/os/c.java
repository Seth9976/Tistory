package android.support.v4.os;

import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.widget.w0;

public final class c extends Stub {
    public final ResultReceiver a;

    public c(ResultReceiver resultReceiver0) {
        this.a = resultReceiver0;
        super();
    }

    @Override  // android.support.v4.os.IResultReceiver
    public final void send(int v, Bundle bundle0) {
        ResultReceiver resultReceiver0 = this.a;
        Handler handler0 = resultReceiver0.b;
        if(handler0 != null) {
            handler0.post(new w0(resultReceiver0, v, bundle0, 3));
        }
    }
}

