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
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B)\b\u0000\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0002\u0012\u0006\u0010\u0006\u001A\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001D\u0010\u0003\u001A\b\u0012\u0004\u0012\u00020\u00020\u000B2\u0006\u0010\n\u001A\u00020\tH\u0001¢\u0006\u0004\b\f\u0010\rJ\u001D\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00020\u000B2\u0006\u0010\n\u001A\u00020\tH\u0001¢\u0006\u0004\b\u000E\u0010\rJ\u001A\u0010\u0010\u001A\u00020\t2\b\u0010\u000F\u001A\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000F\u0010\u0013\u001A\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/kakao/kandinsky/designsystem/common/KDButtonColors;", "", "Landroidx/compose/ui/graphics/Color;", "containerColor", "contentColor", "disabledContainerColor", "disabledContentColor", "<init>", "(JJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "enabled", "Landroidx/compose/runtime/State;", "containerColor$designsystem_release", "(ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "contentColor$designsystem_release", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "designsystem_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class KDButtonColors {
    public static final int $stable;
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public KDButtonColors(long v, long v1, long v2, long v3, DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = v3;
    }

    @Composable
    @NotNull
    public final State containerColor$designsystem_release(boolean z, @Nullable Composer composer0, int v) {
        composer0.startReplaceGroup(0xDAA92C1D);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xDAA92C1D, v, -1, "com.kakao.kandinsky.designsystem.common.KDButtonColors.containerColor (KDButton.kt:156)");
        }
        State state0 = SnapshotStateKt.rememberUpdatedState(Color.box-impl((z ? this.a : this.c)), composer0, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceGroup();
        return state0;
    }

    @Composable
    @NotNull
    public final State contentColor$designsystem_release(boolean z, @Nullable Composer composer0, int v) {
        composer0.startReplaceGroup(0x5E24AA5);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x5E24AA5, v, -1, "com.kakao.kandinsky.designsystem.common.KDButtonColors.contentColor (KDButton.kt:161)");
        }
        State state0 = SnapshotStateKt.rememberUpdatedState(Color.box-impl((z ? this.b : this.d)), composer0, 0);
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
        if(object0 == null || !(object0 instanceof KDButtonColors) || !Color.equals-impl0(this.a, ((KDButtonColors)object0).a)) {
            return false;
        }
        if(!Color.equals-impl0(this.b, ((KDButtonColors)object0).b)) {
            return false;
        }
        return Color.equals-impl0(this.c, ((KDButtonColors)object0).c) ? Color.equals-impl0(this.d, ((KDButtonColors)object0).d) : false;
    }

    @Override
    public int hashCode() {
        return Color.hashCode-impl(this.d) + a.a(this.c, a.a(this.b, Color.hashCode-impl(this.a) * 0x1F, 0x1F), 0x1F);
    }
}

