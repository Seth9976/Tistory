package com.kakao.tistory.presentation.widget.dialog;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sd.a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/kakao/tistory/presentation/widget/dialog/DialogButton;", "", "LEFT", "RIGHT", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public enum DialogButton {
    LEFT,
    RIGHT;

    public static final DialogButton[] a;
    public static final EnumEntries b;

    static {
        DialogButton.a = arr_dialogButton;
        Intrinsics.checkNotNullParameter(arr_dialogButton, "entries");
        DialogButton.b = new a(arr_dialogButton);
    }

    @NotNull
    public static EnumEntries getEntries() {
        return DialogButton.b;
    }
}

