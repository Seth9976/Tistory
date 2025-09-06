package com.kakao.tistory.presentation.common.event;

import android.content.Context;
import com.kakao.tistory.presentation.common.utils.ToastUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001A\u0012\u0010\u0000\u001A\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001A\u00020\u0004¨\u0006\u0005"}, d2 = {"showToast", "", "Landroid/content/Context;", "event", "Lcom/kakao/tistory/presentation/common/event/ShowToastEvent;", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nToastEvent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ToastEvent.kt\ncom/kakao/tistory/presentation/common/event/ToastEventKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,14:1\n1#2:15\n*E\n"})
public final class ToastEventKt {
    public static final void showToast(@NotNull Context context0, @NotNull ShowToastEvent showToastEvent0) {
        Intrinsics.checkNotNullParameter(context0, "<this>");
        Intrinsics.checkNotNullParameter(showToastEvent0, "event");
        String s = showToastEvent0.getMessage();
        if(s == null) {
            Integer integer0 = showToastEvent0.getMessageRes();
            s = integer0 == null ? null : context0.getString(integer0.intValue());
        }
        if(s != null) {
            ToastUtils.show$default(ToastUtils.INSTANCE, context0, s, 0, 1, 4, null);
        }
    }
}

