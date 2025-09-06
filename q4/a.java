package q4;

import android.os.Bundle;
import androidx.core.os.BundleKt;
import androidx.lifecycle.SavedStateHandle;
import androidx.navigation.NavType;
import g.b;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;

public final class a extends b {
    public final int b;
    public final Map c;
    public final Object d;

    public a(Bundle bundle0, Map map0) {
        this.b = 0;
        Intrinsics.checkNotNullParameter(bundle0, "bundle");
        Intrinsics.checkNotNullParameter(map0, "typeMap");
        super();
        this.d = bundle0;
        this.c = map0;
    }

    public a(SavedStateHandle savedStateHandle0, Map map0) {
        this.b = 1;
        Intrinsics.checkNotNullParameter(savedStateHandle0, "handle");
        Intrinsics.checkNotNullParameter(map0, "typeMap");
        super();
        this.d = savedStateHandle0;
        this.c = map0;
    }

    @Override  // g.b
    public final boolean g(String s) {
        if(this.b != 0) {
            Intrinsics.checkNotNullParameter(s, "key");
            return ((SavedStateHandle)this.d).contains(s);
        }
        Intrinsics.checkNotNullParameter(s, "key");
        return ((Bundle)this.d).containsKey(s);
    }

    @Override  // g.b
    public final Object j(String s) {
        if(this.b != 0) {
            Intrinsics.checkNotNullParameter(s, "key");
            SavedStateHandle savedStateHandle0 = (SavedStateHandle)this.d;
            Bundle bundle0 = BundleKt.bundleOf(new Pair[]{TuplesKt.to(s, savedStateHandle0.get(s))});
            Object object0 = this.c.get(s);
            if(object0 == null) {
                throw new IllegalStateException(("Failed to find type for " + s + " when decoding " + savedStateHandle0).toString());
            }
            return ((NavType)object0).get(bundle0, s);
        }
        Intrinsics.checkNotNullParameter(s, "key");
        NavType navType0 = (NavType)this.c.get(s);
        return navType0 == null ? null : navType0.get(((Bundle)this.d), s);
    }
}

