package b;

import com.kakao.kandinsky.launcher.KandinskyInput;
import kotlin.jvm.internal.Intrinsics;

public final class h extends p {
    public final KandinskyInput a;
    public final boolean b;

    public h(KandinskyInput kandinskyInput0, boolean z) {
        Intrinsics.checkNotNullParameter(kandinskyInput0, "input");
        super(0);
        this.a = kandinskyInput0;
        this.b = z;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof h)) {
            return false;
        }
        return Intrinsics.areEqual(this.a, ((h)object0).a) ? this.b == ((h)object0).b : false;
    }

    @Override
    public final int hashCode() {
        return Boolean.hashCode(this.b) + this.a.hashCode() * 0x1F;
    }

    @Override
    public final String toString() {
        return "Init(input=" + this.a + ", fromSavedState=" + this.b + ")";
    }
}

