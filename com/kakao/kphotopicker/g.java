package com.kakao.kphotopicker;

import android.content.Context;
import com.kakao.kphotopicker.widget.dragselection.DragSelectTouchListener;
import com.kakao.kphotopicker.widget.dragselection.ExtensionsKt;
import jb.o;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class g extends Lambda implements Function1 {
    public final Context w;
    public final PickerFragment x;

    public g(Context context0, PickerFragment pickerFragment0) {
        this.w = context0;
        this.x = pickerFragment0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((DragSelectTouchListener)object0), "$this$create");
        Intrinsics.checkNotNullExpressionValue(this.w, "$it");
        ((DragSelectTouchListener)object0).setHotspotHeight(ExtensionsKt.dimen(this.w, dimen.picker_image_item_size));
        ((DragSelectTouchListener)object0).setDragEndListener(new o(this.x, 1));
        return Unit.INSTANCE;
    }
}

