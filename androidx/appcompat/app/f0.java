package androidx.appcompat.app;

import android.content.IntentFilter;

public abstract class f0 {
    public e0 a;
    public final i0 b;

    public f0(i0 i00) {
        this.b = i00;
    }

    public final void a() {
        e0 e00 = this.a;
        if(e00 != null) {
            try {
                this.b.k.unregisterReceiver(e00);
            }
            catch(IllegalArgumentException unused_ex) {
            }
            this.a = null;
        }
    }

    public abstract IntentFilter b();

    public abstract int c();

    public abstract void d();

    public final void e() {
        this.a();
        IntentFilter intentFilter0 = this.b();
        if(intentFilter0.countActions() == 0) {
            return;
        }
        if(this.a == null) {
            this.a = new e0(this, 0);
        }
        this.b.k.registerReceiver(this.a, intentFilter0);
    }
}

