package androidx.core.os;

import android.os.PersistableBundle;
import androidx.annotation.DoNotInline;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class q {
    @DoNotInline
    @JvmStatic
    @NotNull
    public static final PersistableBundle a(int v) {
        return new PersistableBundle(v);
    }

    @DoNotInline
    @JvmStatic
    public static final void b(@NotNull PersistableBundle persistableBundle0, @Nullable String s, @Nullable Object object0) {
        if(object0 == null) {
            persistableBundle0.putString(s, null);
            return;
        }
        if(object0 instanceof Boolean) {
            r.a(persistableBundle0, s, ((Boolean)object0).booleanValue());
            return;
        }
        if(object0 instanceof Double) {
            persistableBundle0.putDouble(s, ((Number)object0).doubleValue());
            return;
        }
        if(object0 instanceof Integer) {
            persistableBundle0.putInt(s, ((Number)object0).intValue());
            return;
        }
        if(object0 instanceof Long) {
            persistableBundle0.putLong(s, ((Number)object0).longValue());
            return;
        }
        if(object0 instanceof String) {
            persistableBundle0.putString(s, ((String)object0));
            return;
        }
        if(object0 instanceof boolean[]) {
            r.b(persistableBundle0, s, ((boolean[])object0));
            return;
        }
        if(object0 instanceof double[]) {
            persistableBundle0.putDoubleArray(s, ((double[])object0));
            return;
        }
        if(object0 instanceof int[]) {
            persistableBundle0.putIntArray(s, ((int[])object0));
            return;
        }
        if(object0 instanceof long[]) {
            persistableBundle0.putLongArray(s, ((long[])object0));
            return;
        }
        if(!(object0 instanceof Object[])) {
            throw new IllegalArgumentException("Illegal value type " + object0.getClass().getCanonicalName() + " for key \"" + s + '\"');
        }
        Class class0 = object0.getClass().getComponentType();
        Intrinsics.checkNotNull(class0);
        if(!String.class.isAssignableFrom(class0)) {
            throw new IllegalArgumentException("Illegal value array type " + class0.getCanonicalName() + " for key \"" + s + '\"');
        }
        Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type kotlin.Array<kotlin.String>");
        persistableBundle0.putStringArray(s, ((String[])object0));
    }
}

