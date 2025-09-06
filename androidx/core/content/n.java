package androidx.core.content;

import android.content.ComponentName;
import android.net.Uri;
import androidx.core.util.Predicate;

public final class n implements Predicate {
    public final int a;
    public final String b;

    public n(String s, int v) {
        this.a = v;
        this.b = s;
        super();
    }

    @Override  // androidx.core.util.Predicate
    public final boolean test(Object object0) {
        switch(this.a) {
            case 0: {
                String s1 = ((Uri)object0).getAuthority();
                return this.b.equals(s1);
            }
            case 1: {
                String s2 = ((Uri)object0).getAuthority();
                return this.b.equals(s2);
            }
            case 2: {
                String s3 = ((Uri)object0).getAuthority();
                return this.b.equals(s3);
            }
            case 3: {
                return this.b.equals(((String)object0));
            }
            case 4: {
                String s4 = ((ComponentName)object0).getPackageName();
                return this.b.equals(s4);
            }
            default: {
                String s = ((Uri)object0).getAuthority();
                return this.b.equals(s);
            }
        }
    }
}

