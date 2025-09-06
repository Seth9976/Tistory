package a;

import com.kakao.kandinsky.core.kdphoto.KDPhoto;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class u0 extends Lambda implements Function1 {
    public final KDPhoto a;

    public u0(KDPhoto kDPhoto0) {
        this.a = kDPhoto0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((KDPhoto)object0), "it");
        return KDPhoto.copy-2Ycw6ww$default(((KDPhoto)object0), null, 0, null, 0L, false, 0, null, 0L, null, 0.0f, null, null, this.a.getBorder(), null, 0x2FFF, null);
    }
}

