package x3;

import androidx.datastore.core.okio.OkioStorageKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import okio.FileSystem;
import okio.Path;

public final class b extends Lambda implements Function2 {
    public static final b w;

    static {
        b.w = new b(2);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        Intrinsics.checkNotNullParameter(((Path)object0), "path");
        Intrinsics.checkNotNullParameter(((FileSystem)object1), "<anonymous parameter 1>");
        return OkioStorageKt.createSingleProcessCoordinator(((Path)object0));
    }
}

