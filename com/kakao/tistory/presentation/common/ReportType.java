package com.kakao.tistory.presentation.common;

import com.kakao.tistory.presentation.R.string;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sd.a;

// 部分失败：枚举糖化
// 枚举按原样呈现，而不是糖化为Java 5枚举。
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000E\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000F\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0007\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006R\u0019\u0010\r\u001A\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001A\u0004\b\u000B\u0010\fj\u0002\b\u000Ej\u0002\b\u000Fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016¨\u0006\u0017"}, d2 = {"Lcom/kakao/tistory/presentation/common/ReportType;", "", "", "a", "Ljava/lang/String;", "getCode", "()Ljava/lang/String;", "code", "", "b", "Ljava/lang/Integer;", "getNameRes", "()Ljava/lang/Integer;", "nameRes", "REPORT1", "REPORT2", "REPORT3", "REPORT4", "REPORT5", "REPORT6", "REPORT_ETC", "REPORT_ILLEGAL_FILMING", "NONE", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class ReportType extends Enum {
    public static final enum ReportType NONE;
    public static final enum ReportType REPORT1;
    public static final enum ReportType REPORT2;
    public static final enum ReportType REPORT3;
    public static final enum ReportType REPORT4;
    public static final enum ReportType REPORT5;
    public static final enum ReportType REPORT6;
    public static final enum ReportType REPORT_ETC;
    public static final enum ReportType REPORT_ILLEGAL_FILMING;
    public final String a;
    public final Integer b;
    public static final ReportType[] c;
    public static final EnumEntries d;

    static {
        ReportType.REPORT1 = new ReportType("REPORT1", 0, "A", string.label_report_button_1);
        ReportType.REPORT2 = new ReportType("REPORT2", 1, "U", string.label_report_button_2);
        ReportType.REPORT3 = new ReportType("REPORT3", 2, "O", string.label_report_button_3);
        ReportType.REPORT4 = new ReportType("REPORT4", 3, "C", string.label_report_button_4);
        ReportType.REPORT5 = new ReportType("REPORT5", 4, "P", string.label_report_button_5);
        ReportType.REPORT6 = new ReportType("REPORT6", 5, "E", string.label_report_button_6);
        ReportType.REPORT_ETC = new ReportType("REPORT_ETC", 6, "G", string.label_report_button_7);
        ReportType.REPORT_ILLEGAL_FILMING = new ReportType("REPORT_ILLEGAL_FILMING", 7, "F", string.label_report_button_8);
        ReportType.NONE = new ReportType();
        ReportType[] arr_reportType = {ReportType.REPORT1, ReportType.REPORT2, ReportType.REPORT3, ReportType.REPORT4, ReportType.REPORT5, ReportType.REPORT6, ReportType.REPORT_ETC, ReportType.REPORT_ILLEGAL_FILMING, ReportType.NONE};
        ReportType.c = arr_reportType;
        Intrinsics.checkNotNullParameter(arr_reportType, "entries");
        ReportType.d = new a(arr_reportType);
    }

    public ReportType() {
        super("NONE", 8);
        this.a = "NONE";
        this.b = null;
    }

    public ReportType(String s, int v, String s1, Integer integer0) {
        super(s, v);
        this.a = s1;
        this.b = integer0;
    }

    @NotNull
    public final String getCode() [...] // 潜在的解密器

    @NotNull
    public static EnumEntries getEntries() {
        return ReportType.d;
    }

    @Nullable
    public final Integer getNameRes() {
        return this.b;
    }

    public static ReportType valueOf(String s) {
        return (ReportType)Enum.valueOf(ReportType.class, s);
    }

    public static ReportType[] values() {
        return (ReportType[])ReportType.c.clone();
    }
}

