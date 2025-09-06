package com.kakao.tistory.presentation.widget.swipe;

import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Immutable
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012 \b\u0002\u0010\u0007\u001A\u001A\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002¢\u0006\u0002\b\u0005¢\u0006\u0002\b\u0006\u0012 \b\u0002\u0010\b\u001A\u001A\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002¢\u0006\u0002\b\u0005¢\u0006\u0002\b\u0006¢\u0006\u0004\b\t\u0010\nJ(\u0010\u000B\u001A\u001A\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002¢\u0006\u0002\b\u0005¢\u0006\u0002\b\u0006HÆ\u0003¢\u0006\u0004\b\u000B\u0010\fJ(\u0010\r\u001A\u001A\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002¢\u0006\u0002\b\u0005¢\u0006\u0002\b\u0006HÆ\u0003¢\u0006\u0004\b\r\u0010\fJT\u0010\u000E\u001A\u00020\u00002 \b\u0002\u0010\u0007\u001A\u001A\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002¢\u0006\u0002\b\u0005¢\u0006\u0002\b\u00062 \b\u0002\u0010\b\u001A\u001A\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002¢\u0006\u0002\b\u0005¢\u0006\u0002\b\u0006HÆ\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u0010\u0010\u0011\u001A\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001A\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001A\u0010\u0018\u001A\u00020\u00172\b\u0010\u0016\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R/\u0010\u0007\u001A\u001A\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002¢\u0006\u0002\b\u0005¢\u0006\u0002\b\u00068\u0006¢\u0006\f\n\u0004\b\u001A\u0010\u001B\u001A\u0004\b\u001C\u0010\fR/\u0010\b\u001A\u001A\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002¢\u0006\u0002\b\u0005¢\u0006\u0002\b\u00068\u0006¢\u0006\f\n\u0004\b\u001D\u0010\u001B\u001A\u0004\b\u001E\u0010\f¨\u0006\u001F"}, d2 = {"Lcom/kakao/tistory/presentation/widget/swipe/SwipeAnchors;", "", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "start", "end", "<init>", "(Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;)V", "component1", "()Lkotlin/jvm/functions/Function3;", "component2", "copy", "(Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;)Lcom/kakao/tistory/presentation/widget/swipe/SwipeAnchors;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lkotlin/jvm/functions/Function3;", "getStart", "b", "getEnd", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class SwipeAnchors {
    public static final int $stable;
    public final Function3 a;
    public final Function3 b;

    public SwipeAnchors() {
        this(null, null, 3, null);
    }

    public SwipeAnchors(@Nullable Function3 function30, @Nullable Function3 function31) {
        this.a = function30;
        this.b = function31;
    }

    public SwipeAnchors(Function3 function30, Function3 function31, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 1) != 0) {
            function30 = null;
        }
        if((v & 2) != 0) {
            function31 = null;
        }
        this(function30, function31);
    }

    @Nullable
    public final Function3 component1() {
        return this.a;
    }

    @Nullable
    public final Function3 component2() {
        return this.b;
    }

    @NotNull
    public final SwipeAnchors copy(@Nullable Function3 function30, @Nullable Function3 function31) {
        return new SwipeAnchors(function30, function31);
    }

    public static SwipeAnchors copy$default(SwipeAnchors swipeAnchors0, Function3 function30, Function3 function31, int v, Object object0) {
        if((v & 1) != 0) {
            function30 = swipeAnchors0.a;
        }
        if((v & 2) != 0) {
            function31 = swipeAnchors0.b;
        }
        return swipeAnchors0.copy(function30, function31);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof SwipeAnchors)) {
            return false;
        }
        return Intrinsics.areEqual(this.a, ((SwipeAnchors)object0).a) ? Intrinsics.areEqual(this.b, ((SwipeAnchors)object0).b) : false;
    }

    @Nullable
    public final Function3 getEnd() {
        return this.b;
    }

    @Nullable
    public final Function3 getStart() {
        return this.a;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.a == null ? 0 : this.a.hashCode();
        Function3 function30 = this.b;
        if(function30 != null) {
            v = function30.hashCode();
        }
        return v1 * 0x1F + v;
    }

    @Override
    @NotNull
    public String toString() {
        return "SwipeAnchors(start=" + this.a + ", end=" + this.b + ")";
    }
}

