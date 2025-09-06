package b;

import com.kakao.kandinsky.core.kdphoto.KDPhoto;
import kotlin.jvm.internal.Intrinsics;

public final class o extends p {
    public final KDPhoto a;

    public o(KDPhoto kDPhoto0) {
        Intrinsics.checkNotNullParameter(kDPhoto0, "updated");
        super(0);
        this.a = kDPhoto0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof o ? Intrinsics.areEqual(this.a, ((o)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public final String toString() {
        return "UpdatePhoto(updated=" + this.a + ")";
    }
}

