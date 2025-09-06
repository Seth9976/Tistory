package com.kakao.keditor;

import com.kakao.keditor.plugin.KeditorItemType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001A\u0012\u0010\u0000\u001A\u00020\u0001*\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002¨\u0006\u0004"}, d2 = {"type", "", "Ljava/lang/Class;", "Lcom/kakao/keditor/KeditorItem;", "keditor_release"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
public final class KeditorItemKt {
    @NotNull
    public static final String type(@NotNull Class class0) {
        Intrinsics.checkNotNullParameter(class0, "<this>");
        KeditorItemType keditorItemType0 = (KeditorItemType)class0.getAnnotation(KeditorItemType.class);
        if(keditorItemType0 != null) {
            String s = keditorItemType0.type();
            if(s != null) {
                return s;
            }
        }
        throw new Exception("[" + class0 + "] KeditorItem must have KeditorItemType annotation!");
    }
}

