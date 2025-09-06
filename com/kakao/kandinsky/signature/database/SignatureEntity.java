package com.kakao.kandinsky.signature.database;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.room.Entity;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

@StabilityInferred(parameters = 1)
@Entity(tableName = "signature")
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0010\u000B\n\u0002\ba\b\u0087\b\u0018\u00002\u00020\u0001B\u00E5\u0001\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\b\b\u0002\u0010\b\u001A\u00020\u0004\u0012\u0006\u0010\n\u001A\u00020\t\u0012\u0006\u0010\u000B\u001A\u00020\t\u0012\b\b\u0002\u0010\f\u001A\u00020\t\u0012\b\b\u0002\u0010\r\u001A\u00020\t\u0012\b\b\u0002\u0010\u000E\u001A\u00020\u0004\u0012\b\b\u0002\u0010\u000F\u001A\u00020\t\u0012\b\b\u0002\u0010\u0010\u001A\u00020\t\u0012\b\b\u0002\u0010\u0011\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0012\u001A\u00020\t\u0012\b\b\u0002\u0010\u0013\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0014\u001A\u00020\t\u0012\b\b\u0002\u0010\u0015\u001A\u00020\u0004\u0012\b\b\u0002\u0010\u0016\u001A\u00020\u0004\u0012\b\b\u0002\u0010\u0018\u001A\u00020\u0017\u0012\b\b\u0002\u0010\u0019\u001A\u00020\u0017\u0012\b\b\u0002\u0010\u001A\u001A\u00020\u0017\u0012\b\b\u0002\u0010\u001B\u001A\u00020\u0002\u0012\n\b\u0002\u0010\u001C\u001A\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u001D\u001A\u00020\u0017\u00A2\u0006\u0004\b\u001E\u0010\u001FJ\u001A\u0010!\u001A\u00020\u00172\b\u0010 \u001A\u0004\u0018\u00010\u0001H\u0096\u0002\u00A2\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b#\u0010$J\u0010\u0010%\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b%\u0010&J\u0010\u0010\'\u001A\u00020\u0006H\u00C6\u0003\u00A2\u0006\u0004\b\'\u0010(J\u0010\u0010)\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b)\u0010&J\u0010\u0010*\u001A\u00020\tH\u00C6\u0003\u00A2\u0006\u0004\b*\u0010+J\u0010\u0010,\u001A\u00020\tH\u00C6\u0003\u00A2\u0006\u0004\b,\u0010+J\u0010\u0010-\u001A\u00020\tH\u00C6\u0003\u00A2\u0006\u0004\b-\u0010+J\u0010\u0010.\u001A\u00020\tH\u00C6\u0003\u00A2\u0006\u0004\b.\u0010+J\u0010\u0010/\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b/\u0010&J\u0010\u00100\u001A\u00020\tH\u00C6\u0003\u00A2\u0006\u0004\b0\u0010+J\u0010\u00101\u001A\u00020\tH\u00C6\u0003\u00A2\u0006\u0004\b1\u0010+J\u0010\u00102\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b2\u0010$J\u0010\u00103\u001A\u00020\tH\u00C6\u0003\u00A2\u0006\u0004\b3\u0010+J\u0010\u00104\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b4\u0010$J\u0010\u00105\u001A\u00020\tH\u00C6\u0003\u00A2\u0006\u0004\b5\u0010+J\u0010\u00106\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b6\u0010&J\u0010\u00107\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b7\u0010&J\u0010\u00108\u001A\u00020\u0017H\u00C6\u0003\u00A2\u0006\u0004\b8\u00109J\u0010\u0010:\u001A\u00020\u0017H\u00C6\u0003\u00A2\u0006\u0004\b:\u00109J\u0010\u0010;\u001A\u00020\u0017H\u00C6\u0003\u00A2\u0006\u0004\b;\u00109J\u0010\u0010<\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b<\u0010$J\u0012\u0010=\u001A\u0004\u0018\u00010\u0002H\u00C6\u0003\u00A2\u0006\u0004\b=\u0010>J\u0010\u0010?\u001A\u00020\u0017H\u00C6\u0003\u00A2\u0006\u0004\b?\u00109J\u00F8\u0001\u0010@\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u00062\b\b\u0002\u0010\b\u001A\u00020\u00042\b\b\u0002\u0010\n\u001A\u00020\t2\b\b\u0002\u0010\u000B\u001A\u00020\t2\b\b\u0002\u0010\f\u001A\u00020\t2\b\b\u0002\u0010\r\u001A\u00020\t2\b\b\u0002\u0010\u000E\u001A\u00020\u00042\b\b\u0002\u0010\u000F\u001A\u00020\t2\b\b\u0002\u0010\u0010\u001A\u00020\t2\b\b\u0002\u0010\u0011\u001A\u00020\u00022\b\b\u0002\u0010\u0012\u001A\u00020\t2\b\b\u0002\u0010\u0013\u001A\u00020\u00022\b\b\u0002\u0010\u0014\u001A\u00020\t2\b\b\u0002\u0010\u0015\u001A\u00020\u00042\b\b\u0002\u0010\u0016\u001A\u00020\u00042\b\b\u0002\u0010\u0018\u001A\u00020\u00172\b\b\u0002\u0010\u0019\u001A\u00020\u00172\b\b\u0002\u0010\u001A\u001A\u00020\u00172\b\b\u0002\u0010\u001B\u001A\u00020\u00022\n\b\u0002\u0010\u001C\u001A\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u001D\u001A\u00020\u0017H\u00C6\u0001\u00A2\u0006\u0004\b@\u0010AJ\u0010\u0010B\u001A\u00020\u0004H\u00D6\u0001\u00A2\u0006\u0004\bB\u0010&J\u0010\u0010C\u001A\u00020\u0002H\u00D6\u0001\u00A2\u0006\u0004\bC\u0010$R\u001A\u0010\u0003\u001A\u00020\u00028\u0006X\u0087\u0004\u00A2\u0006\f\n\u0004\bD\u0010E\u001A\u0004\bF\u0010$R\u0017\u0010\u0005\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\bG\u0010H\u001A\u0004\bI\u0010&R\u0017\u0010\u0007\u001A\u00020\u00068\u0006\u00A2\u0006\f\n\u0004\bJ\u0010K\u001A\u0004\bL\u0010(R\u0017\u0010\b\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\bM\u0010H\u001A\u0004\bN\u0010&R\u0017\u0010\n\u001A\u00020\t8\u0006\u00A2\u0006\f\n\u0004\bO\u0010P\u001A\u0004\bQ\u0010+R\u0017\u0010\u000B\u001A\u00020\t8\u0006\u00A2\u0006\f\n\u0004\bR\u0010P\u001A\u0004\bS\u0010+R\u0017\u0010\f\u001A\u00020\t8\u0006\u00A2\u0006\f\n\u0004\bT\u0010P\u001A\u0004\bU\u0010+R\u0017\u0010\r\u001A\u00020\t8\u0006\u00A2\u0006\f\n\u0004\bV\u0010P\u001A\u0004\bW\u0010+R\u0017\u0010\u000E\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\bX\u0010H\u001A\u0004\bY\u0010&R\u0017\u0010\u000F\u001A\u00020\t8\u0006\u00A2\u0006\f\n\u0004\bZ\u0010P\u001A\u0004\b[\u0010+R\u0017\u0010\u0010\u001A\u00020\t8\u0006\u00A2\u0006\f\n\u0004\b\\\u0010P\u001A\u0004\b]\u0010+R\u0017\u0010\u0011\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b^\u0010E\u001A\u0004\b_\u0010$R\u0017\u0010\u0012\u001A\u00020\t8\u0006\u00A2\u0006\f\n\u0004\b`\u0010P\u001A\u0004\ba\u0010+R\u0017\u0010\u0013\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\bb\u0010E\u001A\u0004\bc\u0010$R\u0017\u0010\u0014\u001A\u00020\t8\u0006\u00A2\u0006\f\n\u0004\bd\u0010P\u001A\u0004\be\u0010+R\u0017\u0010\u0015\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\bf\u0010H\u001A\u0004\bg\u0010&R\u0017\u0010\u0016\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\bh\u0010H\u001A\u0004\bi\u0010&R\u0017\u0010\u0018\u001A\u00020\u00178\u0006\u00A2\u0006\f\n\u0004\bj\u0010k\u001A\u0004\bl\u00109R\u0017\u0010\u0019\u001A\u00020\u00178\u0006\u00A2\u0006\f\n\u0004\bm\u0010k\u001A\u0004\bn\u00109R\u0017\u0010\u001A\u001A\u00020\u00178\u0006\u00A2\u0006\f\n\u0004\bo\u0010k\u001A\u0004\bp\u00109R\u0017\u0010\u001B\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\bq\u0010E\u001A\u0004\br\u0010$R\u0019\u0010\u001C\u001A\u0004\u0018\u00010\u00028\u0006\u00A2\u0006\f\n\u0004\bs\u0010t\u001A\u0004\bu\u0010>R\u0017\u0010\u001D\u001A\u00020\u00178\u0006\u00A2\u0006\f\n\u0004\bv\u0010k\u001A\u0004\bw\u00109\u00A8\u0006x"}, d2 = {"Lcom/kakao/kandinsky/signature/database/SignatureEntity;", "", "", "uid", "", "type", "", "updatedTime", "data", "", "size", "angle", "horizontalPaddingRatio", "verticalPaddingRatio", "originalSize", "fontSize", "lineHeight", "color", "alpha", "background", "backgroundAlpha", "boundsSize", "textPadding", "", "bold", "italic", "underLine", "align", "font", "watermark", "<init>", "(ILjava/lang/String;JLjava/lang/String;FFFFLjava/lang/String;FFIFIFLjava/lang/String;Ljava/lang/String;ZZZILjava/lang/Integer;Z)V", "other", "equals", "(Ljava/lang/Object;)Z", "component1", "()I", "component2", "()Ljava/lang/String;", "component3", "()J", "component4", "component5", "()F", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "()Z", "component19", "component20", "component21", "component22", "()Ljava/lang/Integer;", "component23", "copy", "(ILjava/lang/String;JLjava/lang/String;FFFFLjava/lang/String;FFIFIFLjava/lang/String;Ljava/lang/String;ZZZILjava/lang/Integer;Z)Lcom/kakao/kandinsky/signature/database/SignatureEntity;", "toString", "hashCode", "a", "I", "getUid", "b", "Ljava/lang/String;", "getType", "c", "J", "getUpdatedTime", "d", "getData", "e", "F", "getSize", "f", "getAngle", "g", "getHorizontalPaddingRatio", "h", "getVerticalPaddingRatio", "i", "getOriginalSize", "j", "getFontSize", "k", "getLineHeight", "l", "getColor", "m", "getAlpha", "n", "getBackground", "o", "getBackgroundAlpha", "p", "getBoundsSize", "q", "getTextPadding", "r", "Z", "getBold", "s", "getItalic", "t", "getUnderLine", "u", "getAlign", "v", "Ljava/lang/Integer;", "getFont", "w", "getWatermark", "signature_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class SignatureEntity {
    public static final int $stable;
    public final int a;
    public final String b;
    public final long c;
    public final String d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final String i;
    public final float j;
    public final float k;
    public final int l;
    public final float m;
    public final int n;
    public final float o;
    public final String p;
    public final String q;
    public final boolean r;
    public final boolean s;
    public final boolean t;
    public final int u;
    public final Integer v;
    public final boolean w;

    public SignatureEntity(int v, @NotNull String s, long v1, @NotNull String s1, float f, float f1, float f2, float f3, @NotNull String s2, float f4, float f5, int v2, float f6, int v3, float f7, @NotNull String s3, @NotNull String s4, boolean z, boolean z1, boolean z2, int v4, @Nullable Integer integer0, boolean z3) {
        Intrinsics.checkNotNullParameter(s, "type");
        Intrinsics.checkNotNullParameter(s1, "data");
        Intrinsics.checkNotNullParameter(s2, "originalSize");
        Intrinsics.checkNotNullParameter(s3, "boundsSize");
        Intrinsics.checkNotNullParameter(s4, "textPadding");
        super();
        this.a = v;
        this.b = s;
        this.c = v1;
        this.d = s1;
        this.e = f;
        this.f = f1;
        this.g = f2;
        this.h = f3;
        this.i = s2;
        this.j = f4;
        this.k = f5;
        this.l = v2;
        this.m = f6;
        this.n = v3;
        this.o = f7;
        this.p = s3;
        this.q = s4;
        this.r = z;
        this.s = z1;
        this.t = z2;
        this.u = v4;
        this.v = integer0;
        this.w = z3;
    }

    public SignatureEntity(int v, String s, long v1, String s1, float f, float f1, float f2, float f3, String s2, float f4, float f5, int v2, float f6, int v3, float f7, String s3, String s4, boolean z, boolean z1, boolean z2, int v4, Integer integer0, boolean z3, int v5, DefaultConstructorMarker defaultConstructorMarker0) {
        this(v, s, v1, ((v5 & 8) == 0 ? s1 : ""), f, f1, ((v5 & 0x40) == 0 ? f2 : 0.0f), ((v5 & 0x80) == 0 ? f3 : 0.0f), ((v5 & 0x100) == 0 ? s2 : ""), ((v5 & 0x200) == 0 ? f4 : 10.0f), ((v5 & 0x400) == 0 ? f5 : 15.0f), ((v5 & 0x800) == 0 ? v2 : 0), ((v5 & 0x1000) == 0 ? f6 : 100.0f), ((v5 & 0x2000) == 0 ? v3 : 0), ((v5 & 0x4000) == 0 ? f7 : 0.0f), ((0x8000 & v5) == 0 ? s3 : ""), ((0x10000 & v5) == 0 ? s4 : ""), ((0x20000 & v5) == 0 ? z : false), ((0x40000 & v5) == 0 ? z1 : false), ((0x80000 & v5) == 0 ? z2 : false), ((0x100000 & v5) == 0 ? v4 : 0), ((0x200000 & v5) == 0 ? integer0 : null), ((v5 & 0x400000) == 0 ? z3 : false));
    }

    public final int component1() {
        return this.a;
    }

    public final float component10() {
        return this.j;
    }

    public final float component11() {
        return this.k;
    }

    public final int component12() {
        return this.l;
    }

    public final float component13() {
        return this.m;
    }

    public final int component14() {
        return this.n;
    }

    public final float component15() {
        return this.o;
    }

    @NotNull
    public final String component16() {
        return this.p;
    }

    @NotNull
    public final String component17() {
        return this.q;
    }

    public final boolean component18() {
        return this.r;
    }

    public final boolean component19() {
        return this.s;
    }

    @NotNull
    public final String component2() {
        return this.b;
    }

    public final boolean component20() {
        return this.t;
    }

    public final int component21() {
        return this.u;
    }

    @Nullable
    public final Integer component22() {
        return this.v;
    }

    public final boolean component23() {
        return this.w;
    }

    public final long component3() {
        return this.c;
    }

    @NotNull
    public final String component4() {
        return this.d;
    }

    public final float component5() {
        return this.e;
    }

    public final float component6() {
        return this.f;
    }

    public final float component7() {
        return this.g;
    }

    public final float component8() {
        return this.h;
    }

    @NotNull
    public final String component9() {
        return this.i;
    }

    @NotNull
    public final SignatureEntity copy(int v, @NotNull String s, long v1, @NotNull String s1, float f, float f1, float f2, float f3, @NotNull String s2, float f4, float f5, int v2, float f6, int v3, float f7, @NotNull String s3, @NotNull String s4, boolean z, boolean z1, boolean z2, int v4, @Nullable Integer integer0, boolean z3) {
        Intrinsics.checkNotNullParameter(s, "type");
        Intrinsics.checkNotNullParameter(s1, "data");
        Intrinsics.checkNotNullParameter(s2, "originalSize");
        Intrinsics.checkNotNullParameter(s3, "boundsSize");
        Intrinsics.checkNotNullParameter(s4, "textPadding");
        return new SignatureEntity(v, s, v1, s1, f, f1, f2, f3, s2, f4, f5, v2, f6, v3, f7, s3, s4, z, z1, z2, v4, integer0, z3);
    }

    public static SignatureEntity copy$default(SignatureEntity signatureEntity0, int v, String s, long v1, String s1, float f, float f1, float f2, float f3, String s2, float f4, float f5, int v2, float f6, int v3, float f7, String s3, String s4, boolean z, boolean z1, boolean z2, int v4, Integer integer0, boolean z3, int v5, Object object0) {
        int v6 = (v5 & 1) == 0 ? v : signatureEntity0.a;
        String s5 = (v5 & 2) == 0 ? s : signatureEntity0.b;
        long v7 = (v5 & 4) == 0 ? v1 : signatureEntity0.c;
        String s6 = (v5 & 8) == 0 ? s1 : signatureEntity0.d;
        float f8 = (v5 & 16) == 0 ? f : signatureEntity0.e;
        float f9 = (v5 & 0x20) == 0 ? f1 : signatureEntity0.f;
        float f10 = (v5 & 0x40) == 0 ? f2 : signatureEntity0.g;
        float f11 = (v5 & 0x80) == 0 ? f3 : signatureEntity0.h;
        String s7 = (v5 & 0x100) == 0 ? s2 : signatureEntity0.i;
        float f12 = (v5 & 0x200) == 0 ? f4 : signatureEntity0.j;
        float f13 = (v5 & 0x400) == 0 ? f5 : signatureEntity0.k;
        int v8 = (v5 & 0x800) == 0 ? v2 : signatureEntity0.l;
        float f14 = (v5 & 0x1000) == 0 ? f6 : signatureEntity0.m;
        int v9 = (v5 & 0x2000) == 0 ? v3 : signatureEntity0.n;
        float f15 = (v5 & 0x4000) == 0 ? f7 : signatureEntity0.o;
        String s8 = (v5 & 0x8000) == 0 ? s3 : signatureEntity0.p;
        String s9 = (v5 & 0x10000) == 0 ? s4 : signatureEntity0.q;
        boolean z4 = (v5 & 0x20000) == 0 ? z : signatureEntity0.r;
        boolean z5 = (v5 & 0x40000) == 0 ? z1 : signatureEntity0.s;
        boolean z6 = (v5 & 0x80000) == 0 ? z2 : signatureEntity0.t;
        int v10 = (v5 & 0x100000) == 0 ? v4 : signatureEntity0.u;
        Integer integer1 = (v5 & 0x200000) == 0 ? integer0 : signatureEntity0.v;
        return (v5 & 0x400000) == 0 ? signatureEntity0.copy(v6, s5, v7, s6, f8, f9, f10, f11, s7, f12, f13, v8, f14, v9, f15, s8, s9, z4, z5, z6, v10, integer1, z3) : signatureEntity0.copy(v6, s5, v7, s6, f8, f9, f10, f11, s7, f12, f13, v8, f14, v9, f15, s8, s9, z4, z5, z6, v10, integer1, signatureEntity0.w);
    }

    // 去混淆评级： 低(20)
    @Override
    public boolean equals(@Nullable Object object0) {
        if(!(object0 instanceof SignatureEntity)) {
            return false;
        }
        return Intrinsics.areEqual(this.b, ((SignatureEntity)object0).b) ? Intrinsics.areEqual(((SignatureEntity)object0).d, this.d) && ((SignatureEntity)object0).l == this.l && ((SignatureEntity)object0).m == this.m && ((SignatureEntity)object0).n == this.n && ((SignatureEntity)object0).o == this.o && Intrinsics.areEqual(((SignatureEntity)object0).p, this.p) && Intrinsics.areEqual(((SignatureEntity)object0).q, this.q) && ((SignatureEntity)object0).r == this.r && ((SignatureEntity)object0).s == this.s && ((SignatureEntity)object0).t == this.t && ((SignatureEntity)object0).u == this.u && Intrinsics.areEqual(((SignatureEntity)object0).v, this.v) && ((SignatureEntity)object0).e == this.e && ((SignatureEntity)object0).f == this.f && ((SignatureEntity)object0).w == this.w && ((SignatureEntity)object0).g == this.g && ((SignatureEntity)object0).h == this.h : false;
    }

    public final int getAlign() {
        return this.u;
    }

    public final float getAlpha() {
        return this.m;
    }

    public final float getAngle() {
        return this.f;
    }

    public final int getBackground() {
        return this.n;
    }

    public final float getBackgroundAlpha() {
        return this.o;
    }

    public final boolean getBold() {
        return this.r;
    }

    @NotNull
    public final String getBoundsSize() {
        return this.p;
    }

    public final int getColor() {
        return this.l;
    }

    @NotNull
    public final String getData() {
        return this.d;
    }

    @Nullable
    public final Integer getFont() {
        return this.v;
    }

    public final float getFontSize() {
        return this.j;
    }

    public final float getHorizontalPaddingRatio() {
        return this.g;
    }

    public final boolean getItalic() {
        return this.s;
    }

    public final float getLineHeight() {
        return this.k;
    }

    @NotNull
    public final String getOriginalSize() {
        return this.i;
    }

    public final float getSize() {
        return this.e;
    }

    @NotNull
    public final String getTextPadding() {
        return this.q;
    }

    @NotNull
    public final String getType() {
        return this.b;
    }

    public final int getUid() {
        return this.a;
    }

    public final boolean getUnderLine() {
        return this.t;
    }

    public final long getUpdatedTime() {
        return this.c;
    }

    public final float getVerticalPaddingRatio() {
        return this.h;
    }

    public final boolean getWatermark() {
        return this.w;
    }

    @Override
    public int hashCode() {
        int v = a.c(this.u, a.e(a.e(a.e(q.c(q.c(a.b(this.o, a.c(this.n, a.b(this.m, a.c(this.l, a.b(this.k, a.b(this.j, q.c(a.b(this.h, a.b(this.g, a.b(this.f, a.b(this.e, q.c(wb.a.k(this.c, q.c(this.a * 0x1F, 0x1F, this.b), 0x1F), 0x1F, this.d), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F, this.i), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F, this.p), 0x1F, this.q), 0x1F, this.r), 0x1F, this.s), 0x1F, this.t), 0x1F);
        return this.v == null ? Boolean.hashCode(this.w) + v * 0x1F : Boolean.hashCode(this.w) + (v + this.v.hashCode()) * 0x1F;
    }

    @Override
    @NotNull
    public String toString() {
        return "SignatureEntity(uid=" + this.a + ", type=" + this.b + ", updatedTime=" + this.c + ", data=" + this.d + ", size=" + this.e + ", angle=" + this.f + ", horizontalPaddingRatio=" + this.g + ", verticalPaddingRatio=" + this.h + ", originalSize=" + this.i + ", fontSize=" + this.j + ", lineHeight=" + this.k + ", color=" + this.l + ", alpha=" + this.m + ", background=" + this.n + ", backgroundAlpha=" + this.o + ", boundsSize=" + this.p + ", textPadding=" + this.q + ", bold=" + this.r + ", italic=" + this.s + ", underLine=" + this.t + ", align=" + this.u + ", font=" + this.v + ", watermark=" + this.w + ")";
    }
}

