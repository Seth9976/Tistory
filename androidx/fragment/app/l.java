package androidx.fragment.app;

import android.view.View;
import androidx.core.view.ViewCompat;
import java.util.Collection;
import java.util.List;
import java.util.Map.Entry;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class l extends Lambda implements Function1 {
    public final int w;
    public final Collection x;

    public l(Collection collection0, int v) {
        this.w = v;
        this.x = collection0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        switch(this.w) {
            case 0: {
                Intrinsics.checkNotNullParameter(((Map.Entry)object0), "entry");
                String s = ViewCompat.getTransitionName(((View)((Map.Entry)object0).getValue()));
                return Boolean.valueOf(CollectionsKt___CollectionsKt.contains(this.x, s));
            }
            case 1: {
                return Boolean.valueOf(this.x.contains(object0));
            }
            case 2: {
                return Boolean.valueOf(!this.x.contains(object0));
            }
            case 3: {
                return Boolean.valueOf(this.x.contains(object0));
            }
            case 4: {
                return Boolean.valueOf(((List)object0).retainAll(this.x));
            }
            case 5: {
                return Boolean.valueOf(this.x.contains(object0));
            }
            case 6: {
                return Boolean.valueOf(this.x.contains(object0));
            }
            case 7: {
                return Boolean.valueOf(!this.x.contains(object0));
            }
            default: {
                return Boolean.valueOf(this.x.contains(object0));
            }
        }
    }
}

