package com.kakao.keditor.request;

import com.kakao.keditor.KeditorItem;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001A0\u0010\u0000\u001A\u00020\u0001*\u00020\u00022!\u0010\u0003\u001A\u001D\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\u00010\u0004H\u0086\u0004\u001A \u0010\t\u001A\u0004\u0018\u0001H\n\"\n\b\u0000\u0010\n\u0018\u0001*\u00020\u000B*\u00020\u0002H\u0086\b¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"focused", "", "Lcom/kakao/keditor/request/FocusedRequest;", "block", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "position", "item", "T", "Lcom/kakao/keditor/KeditorItem;", "(Lcom/kakao/keditor/request/FocusedRequest;)Lcom/kakao/keditor/KeditorItem;", "keditor_release"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
public final class RenderingRequestKt {
    public static final void focused(@NotNull FocusedRequest focusedRequest0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(focusedRequest0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "block");
        function10.invoke(focusedRequest0.getFocusedPosition());
    }

    public static final KeditorItem item(FocusedRequest focusedRequest0) {
        Intrinsics.checkNotNullParameter(focusedRequest0, "<this>");
        KeditorItem keditorItem0 = focusedRequest0.getFocusedItem();
        Intrinsics.reifiedOperationMarker(2, "T");
        return keditorItem0;
    }
}

