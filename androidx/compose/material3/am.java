package androidx.compose.material3;

import kotlin.jvm.internal.Intrinsics;
import r0.a;

public final class am implements SnackbarVisuals {
    public final String a;
    public final String b;
    public final boolean c;
    public final SnackbarDuration d;

    public am(String s, String s1, boolean z, SnackbarDuration snackbarDuration0) {
        this.a = s;
        this.b = s1;
        this.c = z;
        this.d = snackbarDuration0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            if(am.class != class0 || !Intrinsics.areEqual(this.a, ((am)object0).a)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.b, ((am)object0).b)) {
                return false;
            }
            return this.c == ((am)object0).c ? this.d == ((am)object0).d : false;
        }
        return false;
    }

    @Override  // androidx.compose.material3.SnackbarVisuals
    public final String getActionLabel() {
        return this.b;
    }

    @Override  // androidx.compose.material3.SnackbarVisuals
    public final SnackbarDuration getDuration() {
        return this.d;
    }

    @Override  // androidx.compose.material3.SnackbarVisuals
    public final String getMessage() {
        return this.a;
    }

    @Override  // androidx.compose.material3.SnackbarVisuals
    public final boolean getWithDismissAction() {
        return this.c;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode();
        return this.b == null ? this.d.hashCode() + a.e(v * 961, 0x1F, this.c) : this.d.hashCode() + a.e((v * 0x1F + this.b.hashCode()) * 0x1F, 0x1F, this.c);
    }
}

