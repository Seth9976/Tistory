package a7;

import android.util.Log;

public class j {
    public final boolean a;
    public final String b;
    public final Exception c;
    public final int d;
    public static final j e;

    static {
        j.e = new j(true, 3, null, null);
    }

    public j(boolean z, int v, String s, Exception exception0) {
        this.a = z;
        this.d = v;
        this.b = s;
        this.c = exception0;
    }

    public String a() {
        return this.b;
    }

    public final void b() {
        if(!this.a && Log.isLoggable("GoogleCertificatesRslt", 3)) {
            Exception exception0 = this.c;
            if(exception0 != null) {
                Log.d("GoogleCertificatesRslt", this.a(), exception0);
                return;
            }
            Log.d("GoogleCertificatesRslt", this.a());
        }
    }
}

