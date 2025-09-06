package t6;

import android.content.Context;
import com.google.android.datatransport.runtime.backends.CreationContext;
import com.google.android.datatransport.runtime.time.Clock;
import r0.a;

public final class b extends CreationContext {
    public final Context a;
    public final Clock b;
    public final Clock c;
    public final String d;

    public b(Context context0, Clock clock0, Clock clock1, String s) {
        if(context0 == null) {
            throw new NullPointerException("Null applicationContext");
        }
        this.a = context0;
        if(clock0 == null) {
            throw new NullPointerException("Null wallClock");
        }
        this.b = clock0;
        if(clock1 == null) {
            throw new NullPointerException("Null monotonicClock");
        }
        this.c = clock1;
        if(s == null) {
            throw new NullPointerException("Null backendName");
        }
        this.d = s;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof CreationContext) {
            Context context0 = ((CreationContext)object0).getApplicationContext();
            if(this.a.equals(context0)) {
                Clock clock0 = ((CreationContext)object0).getWallClock();
                if(this.b.equals(clock0)) {
                    Clock clock1 = ((CreationContext)object0).getMonotonicClock();
                    if(this.c.equals(clock1)) {
                        String s = ((CreationContext)object0).getBackendName();
                        return this.d.equals(s);
                    }
                }
            }
            return false;
        }
        return false;
    }

    @Override  // com.google.android.datatransport.runtime.backends.CreationContext
    public final Context getApplicationContext() {
        return this.a;
    }

    @Override  // com.google.android.datatransport.runtime.backends.CreationContext
    public final String getBackendName() {
        return this.d;
    }

    @Override  // com.google.android.datatransport.runtime.backends.CreationContext
    public final Clock getMonotonicClock() {
        return this.c;
    }

    @Override  // com.google.android.datatransport.runtime.backends.CreationContext
    public final Clock getWallClock() {
        return this.b;
    }

    @Override
    public final int hashCode() {
        return (((this.a.hashCode() ^ 1000003) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode()) * 1000003 ^ this.d.hashCode();
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("CreationContext{applicationContext=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", wallClock=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", monotonicClock=");
        stringBuilder0.append(this.c);
        stringBuilder0.append(", backendName=");
        return a.o(stringBuilder0, this.d, "}");
    }
}

