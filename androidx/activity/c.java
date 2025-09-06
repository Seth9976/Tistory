package androidx.activity;

import android.os.Bundle;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import androidx.core.os.BundleKt;
import androidx.lifecycle.SavedStateHandle;
import androidx.navigation.NavHostController;
import androidx.navigation.fragment.NavHostFragment;
import androidx.savedstate.SavedStateRegistry.SavedStateProvider;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;

public final class c implements SavedStateProvider {
    public final int a;
    public final Object b;

    public c(Object object0, int v) {
        this.a = v;
        this.b = object0;
        super();
    }

    @Override  // androidx.savedstate.SavedStateRegistry$SavedStateProvider
    public final Bundle saveState() {
        switch(this.a) {
            case 0: {
                return ComponentActivity.c(((ComponentActivity)this.b));
            }
            case 1: {
                Map map0 = ((SaveableStateRegistry)this.b).performSave();
                Bundle bundle1 = new Bundle();
                for(Object object0: map0.entrySet()) {
                    String s = (String)((Map.Entry)object0).getKey();
                    List list0 = (List)((Map.Entry)object0).getValue();
                    bundle1.putParcelableArrayList(s, (list0 instanceof ArrayList ? ((ArrayList)list0) : new ArrayList(list0)));
                }
                return bundle1;
            }
            case 2: {
                return SavedStateHandle.a(((SavedStateHandle)this.b));
            }
            case 3: {
                Intrinsics.checkNotNullParameter(((NavHostController)this.b), "$this_apply");
                Bundle bundle2 = ((NavHostController)this.b).saveState();
                if(bundle2 == null) {
                    bundle2 = Bundle.EMPTY;
                    Intrinsics.checkNotNullExpressionValue(bundle2, "EMPTY");
                }
                return bundle2;
            }
            default: {
                NavHostFragment navHostFragment0 = (NavHostFragment)this.b;
                Intrinsics.checkNotNullParameter(navHostFragment0, "this$0");
                if(navHostFragment0.B != 0) {
                    return BundleKt.bundleOf(new Pair[]{TuplesKt.to("android-support-nav:fragment:graphId", navHostFragment0.B)});
                }
                Bundle bundle0 = Bundle.EMPTY;
                Intrinsics.checkNotNullExpressionValue(bundle0, "{\n                    Bu…e.EMPTY\n                }");
                return bundle0;
            }
        }
    }
}

