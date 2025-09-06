package androidx.core.content;

import android.content.ClipData.Item;
import android.content.ComponentName;
import android.content.UriMatcher;
import android.net.Uri;
import androidx.core.util.Predicate;

public final class o implements Predicate {
    public final int a;
    public final Object b;

    public o(Object object0, int v) {
        this.a = v;
        this.b = object0;
        super();
    }

    @Override  // androidx.core.util.Predicate
    public final boolean test(Object object0) {
        switch(this.a) {
            case 0: {
                return ((ComponentName)this.b).equals(((ComponentName)object0));
            }
            case 1: {
                return ((UriMatcher)this.b).match(((Uri)object0)) != -1;
            }
            case 2: {
                return ((java.util.function.Predicate)this.b).test(((ClipData.Item)object0));
            }
            case 3: {
                return this.b.equals(object0);
            }
            default: {
                return ((Predicate)this.b).a(object0);
            }
        }
    }
}

