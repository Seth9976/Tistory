package com.kakao.tistory.presentation.view.comment;

import com.kakao.tistory.presentation.R.string;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sd.a;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000B\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0007\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000Bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/kakao/tistory/presentation/view/comment/CommentMenuItem;", "", "", "a", "I", "getTitleResId", "()I", "titleResId", "Delete", "Modify", "Report", "Pin", "UnPin", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public enum CommentMenuItem {
    Delete(string.label_comment_menu_delete),
    Modify(string.label_comment_menu_modify),
    Report(string.label_comment_menu_report),
    Pin(string.label_comment_menu_pin),
    UnPin(string.label_comment_menu_unpin);

    public final int a;
    public static final CommentMenuItem[] b;
    public static final EnumEntries c;

    static {
        CommentMenuItem.b = arr_commentMenuItem;
        Intrinsics.checkNotNullParameter(arr_commentMenuItem, "entries");
        CommentMenuItem.c = new a(arr_commentMenuItem);
    }

    public CommentMenuItem(int v1) {
        this.a = v1;
    }

    @NotNull
    public static EnumEntries getEntries() {
        return CommentMenuItem.c;
    }

    public final int getTitleResId() {
        return this.a;
    }
}

