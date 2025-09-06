package com.kakao.tistory.presentation.view.comment;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sd.a;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0007\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000B"}, d2 = {"Lcom/kakao/tistory/presentation/view/comment/CommentActivityResultType;", "", "", "a", "I", "getCode", "()I", "code", "None", "Updated", "NotFound", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public enum CommentActivityResultType {
    None(-1),
    Updated(100),
    NotFound(101);

    public final int a;
    public static final CommentActivityResultType[] b;
    public static final EnumEntries c;

    static {
        CommentActivityResultType.b = arr_commentActivityResultType;
        Intrinsics.checkNotNullParameter(arr_commentActivityResultType, "entries");
        CommentActivityResultType.c = new a(arr_commentActivityResultType);
    }

    public CommentActivityResultType(int v1) {
        this.a = v1;
    }

    public final int getCode() {
        return this.a;
    }

    @NotNull
    public static EnumEntries getEntries() {
        return CommentActivityResultType.c;
    }
}

