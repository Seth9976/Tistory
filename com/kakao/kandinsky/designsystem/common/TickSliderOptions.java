package com.kakao.kandinsky.designsystem.common;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import wb.a;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b2\n\u0002\u0010\u000E\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b(\b\u0087\b\u0018\u00002\u00020\u0001B\u00B1\u0001\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001A\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001A\u00020\u0004\u0012\b\b\u0002\u0010\b\u001A\u00020\u0004\u0012\b\b\u0002\u0010\t\u001A\u00020\u0004\u0012\b\b\u0002\u0010\n\u001A\u00020\u0004\u0012\b\b\u0002\u0010\u000B\u001A\u00020\u0004\u0012\b\b\u0002\u0010\r\u001A\u00020\f\u0012\b\b\u0002\u0010\u000E\u001A\u00020\f\u0012\b\b\u0002\u0010\u000F\u001A\u00020\f\u0012\b\b\u0002\u0010\u0010\u001A\u00020\f\u0012\b\b\u0002\u0010\u0011\u001A\u00020\f\u0012\b\b\u0002\u0010\u0012\u001A\u00020\u0004\u0012\b\b\u0002\u0010\u0013\u001A\u00020\u0004\u0012\b\b\u0002\u0010\u0014\u001A\u00020\f\u0012\b\b\u0002\u0010\u0015\u001A\u00020\f\u00A2\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u0018\u0010\u0019J\u0016\u0010\u001C\u001A\u00020\u0004H\u00C6\u0003\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b\u001A\u0010\u001BJ\u0016\u0010\u001E\u001A\u00020\u0004H\u00C6\u0003\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b\u001D\u0010\u001BJ\u0016\u0010 \u001A\u00020\u0004H\u00C6\u0003\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b\u001F\u0010\u001BJ\u0016\u0010\"\u001A\u00020\u0004H\u00C6\u0003\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b!\u0010\u001BJ\u0016\u0010$\u001A\u00020\u0004H\u00C6\u0003\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b#\u0010\u001BJ\u0016\u0010&\u001A\u00020\u0004H\u00C6\u0003\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b%\u0010\u001BJ\u0016\u0010(\u001A\u00020\u0004H\u00C6\u0003\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b\'\u0010\u001BJ\u0016\u0010+\u001A\u00020\fH\u00C6\u0003\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b)\u0010*J\u0016\u0010-\u001A\u00020\fH\u00C6\u0003\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b,\u0010*J\u0016\u0010/\u001A\u00020\fH\u00C6\u0003\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b.\u0010*J\u0016\u00101\u001A\u00020\fH\u00C6\u0003\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b0\u0010*J\u0016\u00103\u001A\u00020\fH\u00C6\u0003\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b2\u0010*J\u0016\u00105\u001A\u00020\u0004H\u00C6\u0003\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b4\u0010\u001BJ\u0016\u00107\u001A\u00020\u0004H\u00C6\u0003\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b6\u0010\u001BJ\u0016\u00109\u001A\u00020\fH\u00C6\u0003\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b8\u0010*J\u0016\u0010;\u001A\u00020\fH\u00C6\u0003\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b:\u0010*J\u00BD\u0001\u0010>\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0006\u001A\u00020\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u00042\b\b\u0002\u0010\b\u001A\u00020\u00042\b\b\u0002\u0010\t\u001A\u00020\u00042\b\b\u0002\u0010\n\u001A\u00020\u00042\b\b\u0002\u0010\u000B\u001A\u00020\u00042\b\b\u0002\u0010\r\u001A\u00020\f2\b\b\u0002\u0010\u000E\u001A\u00020\f2\b\b\u0002\u0010\u000F\u001A\u00020\f2\b\b\u0002\u0010\u0010\u001A\u00020\f2\b\b\u0002\u0010\u0011\u001A\u00020\f2\b\b\u0002\u0010\u0012\u001A\u00020\u00042\b\b\u0002\u0010\u0013\u001A\u00020\u00042\b\b\u0002\u0010\u0014\u001A\u00020\f2\b\b\u0002\u0010\u0015\u001A\u00020\fH\u00C6\u0001\u00F8\u0001\u0001\u00A2\u0006\u0004\b<\u0010=J\u0010\u0010@\u001A\u00020?H\u00D6\u0001\u00A2\u0006\u0004\b@\u0010AJ\u0010\u0010B\u001A\u00020\u0002H\u00D6\u0001\u00A2\u0006\u0004\bB\u0010\u0019J\u001A\u0010E\u001A\u00020D2\b\u0010C\u001A\u0004\u0018\u00010\u0001H\u00D6\u0003\u00A2\u0006\u0004\bE\u0010FR\u0017\u0010\u0003\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\bG\u0010H\u001A\u0004\bI\u0010\u0019R\u001D\u0010\u0005\u001A\u00020\u00048\u0006\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\f\n\u0004\bJ\u0010K\u001A\u0004\bL\u0010\u001BR\u001D\u0010\u0006\u001A\u00020\u00048\u0006\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\f\n\u0004\bM\u0010K\u001A\u0004\bN\u0010\u001BR\u001D\u0010\u0007\u001A\u00020\u00048\u0006\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\f\n\u0004\bO\u0010K\u001A\u0004\bP\u0010\u001BR\u001D\u0010\b\u001A\u00020\u00048\u0006\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\f\n\u0004\bQ\u0010K\u001A\u0004\bR\u0010\u001BR\u001D\u0010\t\u001A\u00020\u00048\u0006\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\f\n\u0004\bS\u0010K\u001A\u0004\bT\u0010\u001BR\u001D\u0010\n\u001A\u00020\u00048\u0006\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\f\n\u0004\bU\u0010K\u001A\u0004\bV\u0010\u001BR\u001D\u0010\u000B\u001A\u00020\u00048\u0006\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\f\n\u0004\bW\u0010K\u001A\u0004\bX\u0010\u001BR\u001D\u0010\r\u001A\u00020\f8\u0006\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\f\n\u0004\bY\u0010Z\u001A\u0004\b[\u0010*R\u001D\u0010\u000E\u001A\u00020\f8\u0006\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\f\n\u0004\b\\\u0010Z\u001A\u0004\b]\u0010*R\u001D\u0010\u000F\u001A\u00020\f8\u0006\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\f\n\u0004\b^\u0010Z\u001A\u0004\b_\u0010*R\u001D\u0010\u0010\u001A\u00020\f8\u0006\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\f\n\u0004\b`\u0010Z\u001A\u0004\ba\u0010*R\u001D\u0010\u0011\u001A\u00020\f8\u0006\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\f\n\u0004\bb\u0010Z\u001A\u0004\bc\u0010*R\u001D\u0010\u0012\u001A\u00020\u00048\u0006\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\f\n\u0004\bd\u0010K\u001A\u0004\be\u0010\u001BR\u001D\u0010\u0013\u001A\u00020\u00048\u0006\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\f\n\u0004\bf\u0010K\u001A\u0004\bg\u0010\u001BR\u001D\u0010\u0014\u001A\u00020\f8\u0006\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\f\n\u0004\bh\u0010Z\u001A\u0004\bi\u0010*R\u001D\u0010\u0015\u001A\u00020\f8\u0006\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\f\n\u0004\bj\u0010Z\u001A\u0004\bk\u0010*\u0082\u0002\u000B\n\u0002\b!\n\u0005\b\u00A1\u001E0\u0001\u00A8\u0006l"}, d2 = {"Lcom/kakao/kandinsky/designsystem/common/TickSliderOptions;", "", "", "degreePerTick", "Landroidx/compose/ui/unit/Dp;", "termPerTick", "tickWidth", "tickHeight", "centerTickWidth", "centerTickHeight", "sideTickWidth", "sideTickHeight", "Landroidx/compose/ui/graphics/Color;", "changedCenterTickColor", "unchangedCenterTickColor", "centerTickColor", "accentTickColor", "tickColor", "numberOffset", "backgroundOffset", "numberBackgroundColor", "numberTextColor", "<init>", "(IFFFFFFFJJJJJFFJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1", "()I", "component2-D9Ej5fM", "()F", "component2", "component3-D9Ej5fM", "component3", "component4-D9Ej5fM", "component4", "component5-D9Ej5fM", "component5", "component6-D9Ej5fM", "component6", "component7-D9Ej5fM", "component7", "component8-D9Ej5fM", "component8", "component9-0d7_KjU", "()J", "component9", "component10-0d7_KjU", "component10", "component11-0d7_KjU", "component11", "component12-0d7_KjU", "component12", "component13-0d7_KjU", "component13", "component14-D9Ej5fM", "component14", "component15-D9Ej5fM", "component15", "component16-0d7_KjU", "component16", "component17-0d7_KjU", "component17", "copy-4w1sbNw", "(IFFFFFFFJJJJJFFJJ)Lcom/kakao/kandinsky/designsystem/common/TickSliderOptions;", "copy", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "getDegreePerTick", "b", "F", "getTermPerTick-D9Ej5fM", "c", "getTickWidth-D9Ej5fM", "d", "getTickHeight-D9Ej5fM", "e", "getCenterTickWidth-D9Ej5fM", "f", "getCenterTickHeight-D9Ej5fM", "g", "getSideTickWidth-D9Ej5fM", "h", "getSideTickHeight-D9Ej5fM", "i", "J", "getChangedCenterTickColor-0d7_KjU", "j", "getUnchangedCenterTickColor-0d7_KjU", "k", "getCenterTickColor-0d7_KjU", "l", "getAccentTickColor-0d7_KjU", "m", "getTickColor-0d7_KjU", "n", "getNumberOffset-D9Ej5fM", "o", "getBackgroundOffset-D9Ej5fM", "p", "getNumberBackgroundColor-0d7_KjU", "q", "getNumberTextColor-0d7_KjU", "designsystem_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nKDSlider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KDSlider.kt\ncom/kakao/kandinsky/designsystem/common/TickSliderOptions\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,372:1\n158#2:373\n148#2:374\n148#2:375\n148#2:376\n148#2:377\n158#2:378\n148#2:379\n148#2:380\n148#2:381\n*S KotlinDebug\n*F\n+ 1 KDSlider.kt\ncom/kakao/kandinsky/designsystem/common/TickSliderOptions\n*L\n81#1:373\n82#1:374\n83#1:375\n84#1:376\n85#1:377\n86#1:378\n87#1:379\n93#1:380\n94#1:381\n*E\n"})
public final class TickSliderOptions {
    public static final int $stable;
    public final int a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final long i;
    public final long j;
    public final long k;
    public final long l;
    public final long m;
    public final float n;
    public final float o;
    public final long p;
    public final long q;

    // 去混淆评级： 中等(70)
    public TickSliderOptions(int v, float f, float f1, float f2, float f3, float f4, float f5, float f6, long v1, long v2, long v3, long v4, long v5, float f7, float f8, long v6, long v7, int v8, DefaultConstructorMarker defaultConstructorMarker0) {
        this(((v8 & 1) == 0 ? v : 2), ((v8 & 2) == 0 ? f : 8.2f), ((v8 & 4) == 0 ? f1 : 1.0f), ((v8 & 8) == 0 ? f2 : 12.0f), ((v8 & 16) == 0 ? f3 : 2.0f), ((v8 & 0x20) == 0 ? f4 : 16.0f), ((v8 & 0x40) == 0 ? f5 : 1.2f), ((v8 & 0x80) == 0 ? f6 : 16.0f), ((v8 & 0x100) == 0 ? v1 : 0L), ((v8 & 0x200) == 0 ? v2 : 0L), ((v8 & 0x400) == 0 ? v3 : Color.copy-wmQWz5c$default(0L, 0.5f, 0.0f, 0.0f, 0.0f, 14, null)), ((v8 & 0x800) == 0 ? v4 : Color.copy-wmQWz5c$default(0L, 0.5f, 0.0f, 0.0f, 0.0f, 14, null)), ((v8 & 0x1000) == 0 ? v5 : Color.copy-wmQWz5c$default(0L, 0.1f, 0.0f, 0.0f, 0.0f, 14, null)), ((v8 & 0x2000) == 0 ? f7 : 22.0f), ((v8 & 0x4000) == 0 ? f8 : 16.0f), ((v8 & 0x8000) == 0 ? v6 : 0L), ((v8 & 0x10000) == 0 ? v7 : 0L), null);
    }

    public TickSliderOptions(int v, float f, float f1, float f2, float f3, float f4, float f5, float f6, long v1, long v2, long v3, long v4, long v5, float f7, float f8, long v6, long v7, DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = v;
        this.b = f;
        this.c = f1;
        this.d = f2;
        this.e = f3;
        this.f = f4;
        this.g = f5;
        this.h = f6;
        this.i = v1;
        this.j = v2;
        this.k = v3;
        this.l = v4;
        this.m = v5;
        this.n = f7;
        this.o = f8;
        this.p = v6;
        this.q = v7;
    }

    public final int component1() {
        return this.a;
    }

    public final long component10-0d7_KjU() {
        return this.j;
    }

    public final long component11-0d7_KjU() {
        return this.k;
    }

    public final long component12-0d7_KjU() {
        return this.l;
    }

    public final long component13-0d7_KjU() {
        return this.m;
    }

    public final float component14-D9Ej5fM() {
        return this.n;
    }

    public final float component15-D9Ej5fM() {
        return this.o;
    }

    public final long component16-0d7_KjU() {
        return this.p;
    }

    public final long component17-0d7_KjU() {
        return this.q;
    }

    public final float component2-D9Ej5fM() {
        return this.b;
    }

    public final float component3-D9Ej5fM() {
        return this.c;
    }

    public final float component4-D9Ej5fM() {
        return this.d;
    }

    public final float component5-D9Ej5fM() {
        return this.e;
    }

    public final float component6-D9Ej5fM() {
        return this.f;
    }

    public final float component7-D9Ej5fM() {
        return this.g;
    }

    public final float component8-D9Ej5fM() {
        return this.h;
    }

    public final long component9-0d7_KjU() {
        return this.i;
    }

    @NotNull
    public final TickSliderOptions copy-4w1sbNw(int v, float f, float f1, float f2, float f3, float f4, float f5, float f6, long v1, long v2, long v3, long v4, long v5, float f7, float f8, long v6, long v7) {
        return new TickSliderOptions(v, f, f1, f2, f3, f4, f5, f6, v1, v2, v3, v4, v5, f7, f8, v6, v7, null);
    }

    public static TickSliderOptions copy-4w1sbNw$default(TickSliderOptions tickSliderOptions0, int v, float f, float f1, float f2, float f3, float f4, float f5, float f6, long v1, long v2, long v3, long v4, long v5, float f7, float f8, long v6, long v7, int v8, Object object0) {
        int v9 = (v8 & 1) == 0 ? v : tickSliderOptions0.a;
        float f9 = (v8 & 2) == 0 ? f : tickSliderOptions0.b;
        float f10 = (v8 & 4) == 0 ? f1 : tickSliderOptions0.c;
        float f11 = (v8 & 8) == 0 ? f2 : tickSliderOptions0.d;
        float f12 = (v8 & 16) == 0 ? f3 : tickSliderOptions0.e;
        float f13 = (v8 & 0x20) == 0 ? f4 : tickSliderOptions0.f;
        float f14 = (v8 & 0x40) == 0 ? f5 : tickSliderOptions0.g;
        float f15 = (v8 & 0x80) == 0 ? f6 : tickSliderOptions0.h;
        long v10 = (v8 & 0x100) == 0 ? v1 : tickSliderOptions0.i;
        long v11 = (v8 & 0x200) == 0 ? v2 : tickSliderOptions0.j;
        long v12 = (v8 & 0x400) == 0 ? v3 : tickSliderOptions0.k;
        long v13 = (v8 & 0x800) == 0 ? v4 : tickSliderOptions0.l;
        long v14 = (v8 & 0x1000) == 0 ? v5 : tickSliderOptions0.m;
        float f16 = (v8 & 0x2000) == 0 ? f7 : tickSliderOptions0.n;
        float f17 = (v8 & 0x4000) == 0 ? f8 : tickSliderOptions0.o;
        long v15 = (v8 & 0x8000) == 0 ? v6 : tickSliderOptions0.p;
        return (v8 & 0x10000) == 0 ? tickSliderOptions0.copy-4w1sbNw(v9, f9, f10, f11, f12, f13, f14, f15, v10, v11, v12, v13, v14, f16, f17, v15, v7) : tickSliderOptions0.copy-4w1sbNw(v9, f9, f10, f11, f12, f13, f14, f15, v10, v11, v12, v13, v14, f16, f17, v15, tickSliderOptions0.q);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof TickSliderOptions)) {
            return false;
        }
        if(this.a != ((TickSliderOptions)object0).a) {
            return false;
        }
        if(!Dp.equals-impl0(this.b, ((TickSliderOptions)object0).b)) {
            return false;
        }
        if(!Dp.equals-impl0(this.c, ((TickSliderOptions)object0).c)) {
            return false;
        }
        if(!Dp.equals-impl0(this.d, ((TickSliderOptions)object0).d)) {
            return false;
        }
        if(!Dp.equals-impl0(this.e, ((TickSliderOptions)object0).e)) {
            return false;
        }
        if(!Dp.equals-impl0(this.f, ((TickSliderOptions)object0).f)) {
            return false;
        }
        if(!Dp.equals-impl0(this.g, ((TickSliderOptions)object0).g)) {
            return false;
        }
        if(!Dp.equals-impl0(this.h, ((TickSliderOptions)object0).h)) {
            return false;
        }
        if(!Color.equals-impl0(this.i, ((TickSliderOptions)object0).i)) {
            return false;
        }
        if(!Color.equals-impl0(this.j, ((TickSliderOptions)object0).j)) {
            return false;
        }
        if(!Color.equals-impl0(this.k, ((TickSliderOptions)object0).k)) {
            return false;
        }
        if(!Color.equals-impl0(this.l, ((TickSliderOptions)object0).l)) {
            return false;
        }
        if(!Color.equals-impl0(this.m, ((TickSliderOptions)object0).m)) {
            return false;
        }
        if(!Dp.equals-impl0(this.n, ((TickSliderOptions)object0).n)) {
            return false;
        }
        if(!Dp.equals-impl0(this.o, ((TickSliderOptions)object0).o)) {
            return false;
        }
        return Color.equals-impl0(this.p, ((TickSliderOptions)object0).p) ? Color.equals-impl0(this.q, ((TickSliderOptions)object0).q) : false;
    }

    public final long getAccentTickColor-0d7_KjU() {
        return this.l;
    }

    public final float getBackgroundOffset-D9Ej5fM() {
        return this.o;
    }

    public final long getCenterTickColor-0d7_KjU() {
        return this.k;
    }

    public final float getCenterTickHeight-D9Ej5fM() {
        return this.f;
    }

    public final float getCenterTickWidth-D9Ej5fM() {
        return this.e;
    }

    public final long getChangedCenterTickColor-0d7_KjU() {
        return this.i;
    }

    public final int getDegreePerTick() {
        return this.a;
    }

    public final long getNumberBackgroundColor-0d7_KjU() {
        return this.p;
    }

    public final float getNumberOffset-D9Ej5fM() {
        return this.n;
    }

    public final long getNumberTextColor-0d7_KjU() {
        return this.q;
    }

    public final float getSideTickHeight-D9Ej5fM() {
        return this.h;
    }

    public final float getSideTickWidth-D9Ej5fM() {
        return this.g;
    }

    public final float getTermPerTick-D9Ej5fM() {
        return this.b;
    }

    public final long getTickColor-0d7_KjU() {
        return this.m;
    }

    public final float getTickHeight-D9Ej5fM() {
        return this.d;
    }

    public final float getTickWidth-D9Ej5fM() {
        return this.c;
    }

    public final long getUnchangedCenterTickColor-0d7_KjU() {
        return this.j;
    }

    @Override
    public int hashCode() {
        return Color.hashCode-impl(this.q) + a.a(this.p, r0.a.C(this.o, r0.a.C(this.n, a.a(this.m, a.a(this.l, a.a(this.k, a.a(this.j, a.a(this.i, r0.a.C(this.h, r0.a.C(this.g, r0.a.C(this.f, r0.a.C(this.e, r0.a.C(this.d, r0.a.C(this.c, r0.a.C(this.b, this.a * 0x1F, 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F);
    }

    @Override
    @NotNull
    public String toString() {
        String s = Dp.toString-impl(this.b);
        String s1 = Dp.toString-impl(this.c);
        String s2 = Dp.toString-impl(this.d);
        String s3 = Dp.toString-impl(this.e);
        String s4 = Dp.toString-impl(this.f);
        String s5 = Dp.toString-impl(this.g);
        String s6 = Dp.toString-impl(this.h);
        String s7 = Color.toString-impl(this.i);
        String s8 = Color.toString-impl(this.j);
        String s9 = Color.toString-impl(this.k);
        String s10 = Color.toString-impl(this.l);
        String s11 = Color.toString-impl(this.m);
        String s12 = Dp.toString-impl(this.n);
        String s13 = Dp.toString-impl(this.o);
        String s14 = Color.toString-impl(this.p);
        String s15 = Color.toString-impl(this.q);
        StringBuilder stringBuilder0 = new StringBuilder("TickSliderOptions(degreePerTick=");
        a.j(stringBuilder0, this.a, ", termPerTick=", s, ", tickWidth=");
        androidx.room.a.w(stringBuilder0, s1, ", tickHeight=", s2, ", centerTickWidth=");
        androidx.room.a.w(stringBuilder0, s3, ", centerTickHeight=", s4, ", sideTickWidth=");
        androidx.room.a.w(stringBuilder0, s5, ", sideTickHeight=", s6, ", changedCenterTickColor=");
        androidx.room.a.w(stringBuilder0, s7, ", unchangedCenterTickColor=", s8, ", centerTickColor=");
        androidx.room.a.w(stringBuilder0, s9, ", accentTickColor=", s10, ", tickColor=");
        androidx.room.a.w(stringBuilder0, s11, ", numberOffset=", s12, ", backgroundOffset=");
        androidx.room.a.w(stringBuilder0, s13, ", numberBackgroundColor=", s14, ", numberTextColor=");
        return r0.a.o(stringBuilder0, s15, ")");
    }
}

