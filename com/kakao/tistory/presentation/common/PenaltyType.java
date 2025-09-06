package com.kakao.tistory.presentation.common;

import com.kakao.tistory.presentation.R.string;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sd.a;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000E\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0007\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001A\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001A\u0004\b\u000B\u0010\fj\u0002\b\u000Ej\u0002\b\u000Fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/kakao/tistory/presentation/common/PenaltyType;", "", "", "a", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "value", "", "b", "I", "getTitleResourceId", "()I", "titleResourceId", "BLOCK", "UNBLOCK", "PENALTY", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public enum PenaltyType {
    BLOCK("block", string.label_dialog_block),
    UNBLOCK("unblock", string.label_dialog_unblock),
    PENALTY("penalty", string.label_blog_penalty);

    public final String a;
    public final int b;
    public static final PenaltyType[] c;
    public static final EnumEntries d;

    static {
        PenaltyType.c = arr_penaltyType;
        Intrinsics.checkNotNullParameter(arr_penaltyType, "entries");
        PenaltyType.d = new a(arr_penaltyType);
    }

    public PenaltyType(String s1, int v1) {
        this.a = s1;
        this.b = v1;
    }

    @NotNull
    public static EnumEntries getEntries() {
        return PenaltyType.d;
    }

    public final int getTitleResourceId() {
        return this.b;
    }

    @NotNull
    public final String getValue() {
        return this.a;
    }
}

