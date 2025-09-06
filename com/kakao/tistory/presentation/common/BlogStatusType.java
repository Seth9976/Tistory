package com.kakao.tistory.presentation.common;

import com.kakao.tistory.presentation.R.string;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sd.a;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000E\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000E\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0007\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006R\u0019\u0010\r\u001A\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001A\u0004\b\u000B\u0010\fR\u0019\u0010\u0010\u001A\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u000E\u0010\n\u001A\u0004\b\u000F\u0010\fj\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0016"}, d2 = {"Lcom/kakao/tistory/presentation/common/BlogStatusType;", "", "", "a", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "value", "", "b", "Ljava/lang/Integer;", "getExceptionTitleStringId", "()Ljava/lang/Integer;", "exceptionTitleStringId", "c", "getExceptionMessageStringId", "exceptionMessageStringId", "OPEN", "CLOSED", "MIGRATION", "DEL", "TMP", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public enum BlogStatusType {
    OPEN("open"),
    CLOSED("closed"),
    MIGRATION("mig"),
    DEL("del", string.label_exception_blog_restricted_title, string.label_exception_blog_status_del_message),
    TMP("tmp", string.label_exception_blog_restricted_title, string.label_exception_blog_status_tmp_message);

    public final String a;
    public final Integer b;
    public final Integer c;
    public static final BlogStatusType[] d;
    public static final EnumEntries e;

    static {
        BlogStatusType.d = arr_blogStatusType;
        Intrinsics.checkNotNullParameter(arr_blogStatusType, "entries");
        BlogStatusType.e = new a(arr_blogStatusType);
    }

    public BlogStatusType(String s1) {
        this.a = s1;
        this.b = null;
        this.c = null;
    }

    public BlogStatusType(String s1, Integer integer0, Integer integer1) {
        this.a = s1;
        this.b = integer0;
        this.c = integer1;
    }

    @NotNull
    public static EnumEntries getEntries() {
        return BlogStatusType.e;
    }

    @Nullable
    public final Integer getExceptionMessageStringId() {
        return this.c;
    }

    @Nullable
    public final Integer getExceptionTitleStringId() {
        return this.b;
    }

    @NotNull
    public final String getValue() {
        return this.a;
    }
}

