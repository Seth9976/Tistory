package com.kakao.tistory.presentation.screen.home.ui.common;

import a5.b;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import wb.a;

@Immutable
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000F\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001F\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\n\u001A\u00020\u0002HÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\f\u001A\u00020\u0002HÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000B\u0010\tJ\u0016\u0010\u000E\u001A\u00020\u0002HÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\tJ1\u0010\u0011\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u0002HÆ\u0001ø\u0001\u0001¢\u0006\u0004\b\u000F\u0010\u0010J\u0010\u0010\u0013\u001A\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001A\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001A\u0010\u001A\u001A\u00020\u00192\b\u0010\u0018\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001A\u0010\u001BR\u001D\u0010\u0003\u001A\u00020\u00028\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u001C\u0010\u001D\u001A\u0004\b\u001E\u0010\tR\u001D\u0010\u0004\u001A\u00020\u00028\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u001F\u0010\u001D\u001A\u0004\b \u0010\tR\u001D\u0010\u0005\u001A\u00020\u00028\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b!\u0010\u001D\u001A\u0004\b\"\u0010\t\u0082\u0002\u000B\n\u0002\b!\n\u0005\b¡\u001E0\u0001¨\u0006#"}, d2 = {"Lcom/kakao/tistory/presentation/screen/home/ui/common/SlotMoreButtonColor;", "", "Landroidx/compose/ui/graphics/Color;", "borderColor", "contentColor", "maxTextColor", "<init>", "(JJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1-0d7_KjU", "()J", "component1", "component2-0d7_KjU", "component2", "component3-0d7_KjU", "component3", "copy-ysEtTa8", "(JJJ)Lcom/kakao/tistory/presentation/screen/home/ui/common/SlotMoreButtonColor;", "copy", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "getBorderColor-0d7_KjU", "b", "getContentColor-0d7_KjU", "c", "getMaxTextColor-0d7_KjU", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class SlotMoreButtonColor {
    public static final int $stable;
    public final long a;
    public final long b;
    public final long c;

    public SlotMoreButtonColor(long v, long v1, long v2, DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = v;
        this.b = v1;
        this.c = v2;
    }

    public final long component1-0d7_KjU() {
        return this.a;
    }

    public final long component2-0d7_KjU() {
        return this.b;
    }

    public final long component3-0d7_KjU() {
        return this.c;
    }

    @NotNull
    public final SlotMoreButtonColor copy-ysEtTa8(long v, long v1, long v2) {
        return new SlotMoreButtonColor(v, v1, v2, null);
    }

    public static SlotMoreButtonColor copy-ysEtTa8$default(SlotMoreButtonColor slotMoreButtonColor0, long v, long v1, long v2, int v3, Object object0) {
        if((v3 & 1) != 0) {
            v = slotMoreButtonColor0.a;
        }
        if((v3 & 2) != 0) {
            v1 = slotMoreButtonColor0.b;
        }
        if((v3 & 4) != 0) {
            v2 = slotMoreButtonColor0.c;
        }
        return slotMoreButtonColor0.copy-ysEtTa8(v, v1, v2);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof SlotMoreButtonColor)) {
            return false;
        }
        if(!Color.equals-impl0(this.a, ((SlotMoreButtonColor)object0).a)) {
            return false;
        }
        return Color.equals-impl0(this.b, ((SlotMoreButtonColor)object0).b) ? Color.equals-impl0(this.c, ((SlotMoreButtonColor)object0).c) : false;
    }

    public final long getBorderColor-0d7_KjU() {
        return this.a;
    }

    public final long getContentColor-0d7_KjU() {
        return this.b;
    }

    public final long getMaxTextColor-0d7_KjU() {
        return this.c;
    }

    @Override
    public int hashCode() {
        return Color.hashCode-impl(this.c) + a.a(this.b, Color.hashCode-impl(this.a) * 0x1F, 0x1F);
    }

    @Override
    @NotNull
    public String toString() {
        String s = Color.toString-impl(this.a);
        String s1 = Color.toString-impl(this.b);
        String s2 = Color.toString-impl(this.c);
        return r0.a.o(b.w("SlotMoreButtonColor(borderColor=", s, ", contentColor=", s1, ", maxTextColor="), s2, ")");
    }
}

