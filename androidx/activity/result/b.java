package androidx.activity.result;

import android.os.Bundle;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.core.os.BundleCompat;
import androidx.lifecycle.Lifecycle.Event;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

public final class b implements LifecycleEventObserver {
    public final ActivityResultRegistry a;
    public final String b;
    public final ActivityResultCallback c;
    public final ActivityResultContract d;

    public b(ActivityResultRegistry activityResultRegistry0, String s, ActivityResultCallback activityResultCallback0, ActivityResultContract activityResultContract0) {
        this.a = activityResultRegistry0;
        this.b = s;
        this.c = activityResultCallback0;
        this.d = activityResultContract0;
    }

    @Override  // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner0, Event lifecycle$Event0) {
        ActivityResultRegistry activityResultRegistry0 = this.a;
        Intrinsics.checkNotNullParameter(activityResultRegistry0, "this$0");
        String s = this.b;
        Intrinsics.checkNotNullParameter(s, "$key");
        ActivityResultCallback activityResultCallback0 = this.c;
        Intrinsics.checkNotNullParameter(activityResultCallback0, "$callback");
        ActivityResultContract activityResultContract0 = this.d;
        Intrinsics.checkNotNullParameter(activityResultContract0, "$contract");
        Intrinsics.checkNotNullParameter(lifecycleOwner0, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(lifecycle$Event0, "event");
        if(Event.ON_START == lifecycle$Event0) {
            c c0 = new c(activityResultContract0, activityResultCallback0);
            activityResultRegistry0.e.put(s, c0);
            LinkedHashMap linkedHashMap0 = activityResultRegistry0.f;
            if(linkedHashMap0.containsKey(s)) {
                Object object0 = linkedHashMap0.get(s);
                linkedHashMap0.remove(s);
                activityResultCallback0.onActivityResult(object0);
            }
            Bundle bundle0 = activityResultRegistry0.g;
            ActivityResult activityResult0 = (ActivityResult)BundleCompat.getParcelable(bundle0, s, ActivityResult.class);
            if(activityResult0 != null) {
                bundle0.remove(s);
                activityResultCallback0.onActivityResult(activityResultContract0.parseResult(activityResult0.getResultCode(), activityResult0.getData()));
            }
        }
        else {
            if(Event.ON_STOP == lifecycle$Event0) {
                activityResultRegistry0.e.remove(s);
                return;
            }
            if(Event.ON_DESTROY == lifecycle$Event0) {
                activityResultRegistry0.unregister$activity_release(s);
            }
        }
    }
}

