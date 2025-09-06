package b;

import com.kakao.kandinsky.launcher.KandinskyOutput;
import kotlin.jvm.internal.Intrinsics;

public final class f extends p {
    public final KandinskyOutput a;

    public f(KandinskyOutput kandinskyOutput0) {
        Intrinsics.checkNotNullParameter(kandinskyOutput0, "kandinskyOutput");
        super(0);
        this.a = kandinskyOutput0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof f ? Intrinsics.areEqual(this.a, ((f)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public final String toString() {
        return "FinishSavePhoto(kandinskyOutput=" + this.a + ")";
    }
}

