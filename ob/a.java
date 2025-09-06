package ob;

import android.app.Activity;
import androidx.core.app.ActivityCompat;
import com.kakao.kphotopicker.loader.GalleryType;
import com.kakao.kphotopicker.util.PermissionUtil;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class a extends Lambda implements Function2 {
    public final int w;
    public static final a x;
    public static final a y;

    static {
        a.x = new a(2, 0);
        a.y = new a(2, 1);
    }

    public a(int v, int v1) {
        this.w = v1;
        super(v);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        if(this.w != 0) {
            Intrinsics.checkNotNullParameter(((Activity)object0), "activity");
            Intrinsics.checkNotNullParameter(((GalleryType)object1), "<anonymous parameter 1>");
            PermissionUtil.INSTANCE.goToPermissionSettings(((Activity)object0));
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(((Activity)object0), "activity");
        Intrinsics.checkNotNullParameter(((GalleryType)object1), "galleryType");
        ActivityCompat.requestPermissions(((Activity)object0), PermissionUtil.INSTANCE.getMediaPermissions(((GalleryType)object1)), 0x83F);
        return Unit.INSTANCE;
    }
}

