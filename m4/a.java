package m4;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;

public final class a {
    public final IntentFilter a;
    public final BroadcastReceiver b;
    public boolean c;
    public boolean d;

    public a(BroadcastReceiver broadcastReceiver0, IntentFilter intentFilter0) {
        this.a = intentFilter0;
        this.b = broadcastReceiver0;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder(0x80);
        stringBuilder0.append("Receiver{");
        stringBuilder0.append(this.b);
        stringBuilder0.append(" filter=");
        stringBuilder0.append(this.a);
        if(this.d) {
            stringBuilder0.append(" DEAD");
        }
        stringBuilder0.append("}");
        return stringBuilder0.toString();
    }
}

