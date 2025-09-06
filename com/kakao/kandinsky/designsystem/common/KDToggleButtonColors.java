package com.kakao.kandinsky.designsystem.common;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import wb.a;

@Immutable
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B9\b\u0000\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0002\u0012\u0006\u0010\u0006\u001A\u00020\u0002\u0012\u0006\u0010\u0007\u001A\u00020\u0002\u0012\u0006\u0010\b\u001A\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ%\u0010\u0003\u001A\b\u0012\u0004\u0012\u00020\u00020\u000E2\u0006\u0010\f\u001A\u00020\u000B2\u0006\u0010\r\u001A\u00020\u000BH\u0001¢\u0006\u0004\b\u000F\u0010\u0010J%\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00020\u000E2\u0006\u0010\f\u001A\u00020\u000B2\u0006\u0010\r\u001A\u00020\u000BH\u0001¢\u0006\u0004\b\u0011\u0010\u0010J\u001A\u0010\u0013\u001A\u00020\u000B2\b\u0010\u0012\u001A\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000F\u0010\u0016\u001A\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/kakao/kandinsky/designsystem/common/KDToggleButtonColors;", "", "Landroidx/compose/ui/graphics/Color;", "containerColor", "contentColor", "disabledContainerColor", "disabledContentColor", "checkedContainerColor", "checkedContentColor", "<init>", "(JJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "enabled", "checked", "Landroidx/compose/runtime/State;", "containerColor$designsystem_release", "(ZZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "contentColor$designsystem_release", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "designsystem_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class KDToggleButtonColors {
    public static final int $stable;
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;

    public KDToggleButtonColors(long v, long v1, long v2, long v3, long v4, long v5, DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = v3;
        this.e = v4;
        this.f = v5;
    }

    @Composable
    @NotNull
    public final State containerColor$designsystem_release(boolean z, boolean z1, @Nullable Composer composer0, int v) {
        long v1;
        composer0.startReplaceGroup(0xEFF13845);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xEFF13845, v, -1, "com.kakao.kandinsky.designsystem.common.KDToggleButtonColors.containerColor (KDButton.kt:196)");
        }
        if(z) {
            v1 = z1 ? this.e : this.a;
        }
        else {
            v1 = this.c;
        }
        State state0 = SnapshotStateKt.rememberUpdatedState(Color.box-impl(v1), composer0, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceGroup();
        return state0;
    }

    @Composable
    @NotNull
    public final State contentColor$designsystem_release(boolean z, boolean z1, @Nullable Composer composer0, int v) {
        long v1;
        composer0.startReplaceGroup(-160544563);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-160544563, v, -1, "com.kakao.kandinsky.designsystem.common.KDToggleButtonColors.contentColor (KDButton.kt:206)");
        }
        if(z) {
            v1 = z1 ? this.f : this.b;
        }
        else {
            v1 = this.d;
        }
        State state0 = SnapshotStateKt.rememberUpdatedState(Color.box-impl(v1), composer0, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceGroup();
        return state0;
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 == null || !(object0 instanceof KDToggleButtonColors) || !Color.equals-impl0(this.a, ((KDToggleButtonColors)object0).a)) {
            return false;
        }
        if(!Color.equals-impl0(this.b, ((KDToggleButtonColors)object0).b)) {
            return false;
        }
        if(!Color.equals-impl0(this.c, ((KDToggleButtonColors)object0).c)) {
            return false;
        }
        if(!Color.equals-impl0(this.d, ((KDToggleButtonColors)object0).d)) {
            return false;
        }
        return Color.equals-impl0(this.e, ((KDToggleButtonColors)object0).e) ? Color.equals-impl0(this.f, ((KDToggleButtonColors)object0).f) : false;
    }

    @Override
    public int hashCode() {
        return Color.hashCode-impl(this.f) + a.a(this.e, a.a(this.d, a.a(this.c, a.a(this.b, Color.hashCode-impl(this.a) * 0x1F, 0x1F), 0x1F), 0x1F), 0x1F);
    }
}

