package a7;

import com.google.android.gms.common.zze;

public final class i extends j {
    public final zze f;

    public i(zze zze0) {
        super(false, 1, null, null);
        this.f = zze0;
    }

    @Override  // a7.j
    public final String a() {
        try {
            return (String)this.f.call();
        }
        catch(Exception exception0) {
            throw new RuntimeException(exception0);
        }
    }
}

