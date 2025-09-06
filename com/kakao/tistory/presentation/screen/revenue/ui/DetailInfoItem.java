package com.kakao.tistory.presentation.screen.revenue.ui;

import androidx.annotation.StringRes;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import com.kakao.tistory.presentation.common.graph.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000B\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000BJ\u0010\u0010\f\u001A\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0010\u001A\u0004\u0018\u00010\u0006HÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ3\u0010\u0013\u001A\u00020\u00002\b\b\u0003\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u0006HÆ\u0001ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001A\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0014\u0010\rJ\u0010\u0010\u0015\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000BJ\u001A\u0010\u0018\u001A\u00020\u00172\b\u0010\u0016\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001A\u0010\u001B\u001A\u0004\b\u001C\u0010\u000BR\u0017\u0010\u0005\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001D\u0010\u001E\u001A\u0004\b\u001F\u0010\rR\u001F\u0010\u0007\u001A\u0004\u0018\u00010\u00068\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b \u0010!\u001A\u0004\b\"\u0010\u000F\u0082\u0002\u000B\n\u0002\b!\n\u0005\b¡\u001E0\u0001¨\u0006#"}, d2 = {"Lcom/kakao/tistory/presentation/screen/revenue/ui/DetailInfoItem;", "", "", "titleRes", "", "value", "Landroidx/compose/ui/graphics/Color;", "pointColor", "<init>", "(ILjava/lang/String;Landroidx/compose/ui/graphics/Color;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1", "()I", "component2", "()Ljava/lang/String;", "component3-QN2ZGVo", "()Landroidx/compose/ui/graphics/Color;", "component3", "copy-t9lfQc4", "(ILjava/lang/String;Landroidx/compose/ui/graphics/Color;)Lcom/kakao/tistory/presentation/screen/revenue/ui/DetailInfoItem;", "copy", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "getTitleRes", "b", "Ljava/lang/String;", "getValue", "c", "Landroidx/compose/ui/graphics/Color;", "getPointColor-QN2ZGVo", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class DetailInfoItem {
    public static final int $stable;
    public final int a;
    public final String b;
    public final Color c;

    public DetailInfoItem(int v, String s, Color color0, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v1 & 4) != 0) {
            color0 = null;
        }
        this(v, s, color0, null);
    }

    public DetailInfoItem(@StringRes int v, String s, Color color0, DefaultConstructorMarker defaultConstructorMarker0) {
        Intrinsics.checkNotNullParameter(s, "value");
        super();
        this.a = v;
        this.b = s;
        this.c = color0;
    }

    public final int component1() {
        return this.a;
    }

    @NotNull
    public final String component2() {
        return this.b;
    }

    @Nullable
    public final Color component3-QN2ZGVo() {
        return this.c;
    }

    @NotNull
    public final DetailInfoItem copy-t9lfQc4(@StringRes int v, @NotNull String s, @Nullable Color color0) {
        Intrinsics.checkNotNullParameter(s, "value");
        return new DetailInfoItem(v, s, color0, null);
    }

    public static DetailInfoItem copy-t9lfQc4$default(DetailInfoItem detailInfoItem0, int v, String s, Color color0, int v1, Object object0) {
        if((v1 & 1) != 0) {
            v = detailInfoItem0.a;
        }
        if((v1 & 2) != 0) {
            s = detailInfoItem0.b;
        }
        if((v1 & 4) != 0) {
            color0 = detailInfoItem0.c;
        }
        return detailInfoItem0.copy-t9lfQc4(v, s, color0);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof DetailInfoItem)) {
            return false;
        }
        if(this.a != ((DetailInfoItem)object0).a) {
            return false;
        }
        return Intrinsics.areEqual(this.b, ((DetailInfoItem)object0).b) ? Intrinsics.areEqual(this.c, ((DetailInfoItem)object0).c) : false;
    }

    @Nullable
    public final Color getPointColor-QN2ZGVo() {
        return this.c;
    }

    public final int getTitleRes() {
        return this.a;
    }

    @NotNull
    public final String getValue() {
        return this.b;
    }

    @Override
    public int hashCode() {
        int v = a.a(this.b, this.a * 0x1F, 0x1F);
        return this.c == null ? v : v + Color.hashCode-impl(this.c.unbox-impl());
    }

    @Override
    @NotNull
    public String toString() {
        return "DetailInfoItem(titleRes=" + this.a + ", value=" + this.b + ", pointColor=" + this.c + ")";
    }
}

