package h1;

import androidx.compose.runtime.saveable.SaveableStateRegistry.Entry;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class c extends Lambda implements Function0 {
    public final Object A;
    public final Object[] B;
    public final a w;
    public final Saver x;
    public final SaveableStateRegistry y;
    public final String z;

    public c(a a0, Saver saver0, SaveableStateRegistry saveableStateRegistry0, String s, Object object0, Object[] arr_object) {
        this.w = a0;
        this.x = saver0;
        this.y = saveableStateRegistry0;
        this.z = s;
        this.A = object0;
        this.B = arr_object;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int v1;
        a a0 = this.w;
        SaveableStateRegistry saveableStateRegistry0 = this.y;
        int v = 1;
        if(a0.b == saveableStateRegistry0) {
            v1 = 0;
        }
        else {
            a0.b = saveableStateRegistry0;
            v1 = 1;
        }
        String s = this.z;
        if(Intrinsics.areEqual(a0.c, s)) {
            v = v1;
        }
        else {
            a0.c = s;
        }
        a0.a = this.x;
        a0.d = this.A;
        a0.e = this.B;
        Entry saveableStateRegistry$Entry0 = a0.f;
        if(saveableStateRegistry$Entry0 != null && v != 0) {
            saveableStateRegistry$Entry0.unregister();
            a0.f = null;
            a0.a();
        }
        return Unit.INSTANCE;
    }
}

