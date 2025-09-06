package com.kakao.tistory.presentation.common;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sd.a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/kakao/tistory/presentation/common/CommentInputAcceptType;", "", "ACCEPT", "NOT_ACCEPT", "BLOCK", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public enum CommentInputAcceptType {
    ACCEPT,
    NOT_ACCEPT,
    BLOCK;

    public static final CommentInputAcceptType[] a;
    public static final EnumEntries b;

    static {
        CommentInputAcceptType.a = arr_commentInputAcceptType;
        Intrinsics.checkNotNullParameter(arr_commentInputAcceptType, "entries");
        CommentInputAcceptType.b = new a(arr_commentInputAcceptType);
    }

    @NotNull
    public static EnumEntries getEntries() {
        return CommentInputAcceptType.b;
    }
}

