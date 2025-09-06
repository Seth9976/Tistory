package a;

import androidx.compose.ui.geometry.Size;
import com.kakao.kandinsky.core.kdphoto.KDPhoto;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class f1 extends Lambda implements Function1 {
    public final KDPhoto a;

    public f1(KDPhoto kDPhoto0) {
        this.a = kDPhoto0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((KDPhoto)object0), "it");
        return Size.getWidth-impl(((KDPhoto)object0).getCropSize-NH-jbRc()) < ((float)this.a.getRequireWidth()) ? ((KDPhoto)object0) : KDPhoto.copy-2Ycw6ww$default(((KDPhoto)object0), null, 0, null, 0L, false, this.a.getRequireWidth(), null, 0L, null, 0.0f, null, null, null, null, 0x3FDF, null);
    }
}

