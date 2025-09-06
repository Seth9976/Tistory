package b;

import com.kakao.kandinsky.launcher.KandinskyOutput;
import kotlin.jvm.internal.Intrinsics;

public final class a extends c {
    public final KandinskyOutput a;

    public a(KandinskyOutput kandinskyOutput0) {
        super(0);
        this.a = kandinskyOutput0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof a ? Intrinsics.areEqual(this.a, ((a)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a == null ? 0 : this.a.hashCode();
    }

    @Override
    public final String toString() {
        return "Finish(output=" + this.a + ")";
    }
}

