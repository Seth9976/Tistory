package androidx.emoji2.text;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import com.google.android.gms.internal.measurement.zzhf;

public final class v extends ContentObserver {
    public final int a;
    public final Object b;

    public v(w w0, Handler handler0) {
        this.a = 0;
        this.b = w0;
        super(handler0);
    }

    public v(zzhf zzhf0) {
        this.a = 1;
        this.b = zzhf0;
        super(null);
    }

    @Override  // android.database.ContentObserver
    public void onChange(boolean z) {
        if(this.a != 1) {
            super.onChange(z);
            return;
        }
        ((zzhf)this.b).zzf();
    }

    @Override  // android.database.ContentObserver
    public void onChange(boolean z, Uri uri0) {
        if(this.a != 0) {
            super.onChange(z, uri0);
            return;
        }
        ((w)this.b).b();
    }
}

