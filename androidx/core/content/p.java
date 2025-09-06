package androidx.core.content;

import android.content.ClipData;
import android.content.ComponentName;
import android.net.Uri;
import androidx.core.util.Predicate;
import java.util.Objects;

public final class p implements Predicate {
    public final int a;

    public p(int v) {
        this.a = v;
        super();
    }

    @Override  // androidx.core.util.Predicate
    public final boolean test(Object object0) {
        switch(this.a) {
            case 0: {
                ComponentName componentName0 = (ComponentName)object0;
                return true;
            }
            case 1: {
                return false;
            }
            case 2: {
                String s = (String)object0;
                return false;
            }
            case 3: {
                Uri uri0 = (Uri)object0;
                return false;
            }
            case 4: {
                ComponentName componentName1 = (ComponentName)object0;
                return false;
            }
            case 5: {
                ClipData clipData0 = (ClipData)object0;
                return false;
            }
            case 6: {
                return true;
            }
            default: {
                return Objects.isNull(object0);
            }
        }
    }
}

