package com.kakao.android.base.model;

import com.kakao.android.base.exception.ConstsKt;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Deprecated(message = "don\'t use")
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000E\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u000B\b\u0017\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001A\u0010\u0003\u001A\u00020\u0004X\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001C\u0010\t\u001A\u0004\u0018\u00010\nX\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u000B\u0010\f\"\u0004\b\r\u0010\u000ER\u001C\u0010\u000F\u001A\u0004\u0018\u00010\u0010X\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001A\u0010\u0015\u001A\u00020\nX\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000ER\u001A\u0010\u0018\u001A\u00020\nX\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u0019\u0010\f\"\u0004\b\u001A\u0010\u000E¨\u0006\u001B"}, d2 = {"Lcom/kakao/android/base/model/ErrorModel;", "", "()V", "code", "", "getCode", "()I", "setCode", "(I)V", "message", "", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", "spannedMessage", "", "getSpannedMessage", "()Ljava/lang/CharSequence;", "setSpannedMessage", "(Ljava/lang/CharSequence;)V", "status", "getStatus", "setStatus", "title", "getTitle", "setTitle", "base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public class ErrorModel {
    private int code;
    @Nullable
    private String message;
    @Nullable
    private CharSequence spannedMessage;
    @NotNull
    private String status;
    @NotNull
    private String title;

    public ErrorModel() {
        this.code = -1;
        this.status = "EXCEPTION_UNKNOWN_STATUS";
        this.title = ConstsKt.getEXCEPTION_UNKNOWN_TITLE();
    }

    public final int getCode() {
        return this.code;
    }

    @Nullable
    public final String getMessage() {
        return this.message;
    }

    @Nullable
    public final CharSequence getSpannedMessage() {
        return this.spannedMessage;
    }

    @NotNull
    public final String getStatus() [...] // 潜在的解密器

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public final void setCode(int v) {
        this.code = v;
    }

    public final void setMessage(@Nullable String s) {
        this.message = s;
    }

    public final void setSpannedMessage(@Nullable CharSequence charSequence0) {
        this.spannedMessage = charSequence0;
    }

    public final void setStatus(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "<set-?>");
        this.status = s;
    }

    public final void setTitle(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "<set-?>");
        this.title = s;
    }
}

