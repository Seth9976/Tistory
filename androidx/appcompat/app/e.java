package androidx.appcompat.app;

import android.os.Message;
import android.view.View.OnClickListener;
import android.view.View;

public final class e implements View.OnClickListener {
    public final l a;

    public e(l l0) {
        this.a = l0;
    }

    @Override  // android.view.View$OnClickListener
    public void onClick(View view0) {
        Message message1;
        l l0 = this.a;
        if(view0 == l0.o) {
            Message message0 = l0.q;
            if(message0 != null) {
                message1 = Message.obtain(message0);
                goto label_19;
            }
            goto label_6;
        }
        else {
        label_6:
            if(view0 == l0.s) {
                Message message2 = l0.u;
                if(message2 != null) {
                    message1 = Message.obtain(message2);
                    goto label_19;
                }
                goto label_11;
            }
            else {
            label_11:
                if(view0 == l0.w) {
                    Message message3 = l0.y;
                    message1 = message3 == null ? null : Message.obtain(message3);
                }
                else {
                    message1 = null;
                }
            }
        }
    label_19:
        if(message1 != null) {
            message1.sendToTarget();
        }
        l0.P.obtainMessage(1, l0.b).sendToTarget();
    }
}

