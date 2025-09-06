package jb;

import com.kakao.kphotopicker.picker.MediaItem.Photo;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class x extends Lambda implements Function1 {
    public static final x w;

    static {
        x.w = new x(1);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNull(((List)object0));
        ArrayList arrayList0 = new ArrayList();
        for(Object object1: ((List)object0)) {
            if(object1 instanceof Photo) {
                arrayList0.add(object1);
            }
        }
        return Boolean.valueOf(!arrayList0.isEmpty());
    }
}

