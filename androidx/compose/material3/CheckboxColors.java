package androidx.compose.material3;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.state.ToggleableState;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import wb.a;

@Immutable
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u001D\b\u0007\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0002\u0012\u0006\u0010\u0006\u001A\u00020\u0002\u0012\u0006\u0010\u0007\u001A\u00020\u0002\u0012\u0006\u0010\b\u001A\u00020\u0002\u0012\u0006\u0010\t\u001A\u00020\u0002\u0012\u0006\u0010\n\u001A\u00020\u0002\u0012\u0006\u0010\u000B\u001A\u00020\u0002\u0012\u0006\u0010\f\u001A\u00020\u0002\u0012\u0006\u0010\r\u001A\u00020\u0002\u0012\u0006\u0010\u000E\u001A\u00020\u0002\u00A2\u0006\u0004\b\u000F\u0010\u0010J\u0088\u0001\u0010\u0013\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u00022\b\b\u0002\u0010\u0007\u001A\u00020\u00022\b\b\u0002\u0010\b\u001A\u00020\u00022\b\b\u0002\u0010\t\u001A\u00020\u00022\b\b\u0002\u0010\n\u001A\u00020\u00022\b\b\u0002\u0010\u000B\u001A\u00020\u00022\b\b\u0002\u0010\f\u001A\u00020\u00022\b\b\u0002\u0010\r\u001A\u00020\u00022\b\b\u0002\u0010\u000E\u001A\u00020\u0002\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0011\u0010\u0012J\u001D\u0010\u0019\u001A\b\u0012\u0004\u0012\u00020\u00020\u00162\u0006\u0010\u0015\u001A\u00020\u0014H\u0001\u00A2\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u001E\u001A\b\u0012\u0004\u0012\u00020\u00020\u00162\u0006\u0010\u001B\u001A\u00020\u001A2\u0006\u0010\u0015\u001A\u00020\u0014H\u0001\u00A2\u0006\u0004\b\u001C\u0010\u001DJ%\u0010 \u001A\b\u0012\u0004\u0012\u00020\u00020\u00162\u0006\u0010\u001B\u001A\u00020\u001A2\u0006\u0010\u0015\u001A\u00020\u0014H\u0001\u00A2\u0006\u0004\b\u001F\u0010\u001DJ\u001A\u0010\"\u001A\u00020\u001A2\b\u0010!\u001A\u0004\u0018\u00010\u0001H\u0096\u0002\u00A2\u0006\u0004\b\"\u0010#J\u000F\u0010%\u001A\u00020$H\u0016\u00A2\u0006\u0004\b%\u0010&R\u001D\u0010\u0003\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b\'\u0010(\u001A\u0004\b)\u0010*R\u001D\u0010\u0004\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b+\u0010(\u001A\u0004\b,\u0010*R\u001D\u0010\u0005\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b-\u0010(\u001A\u0004\b.\u0010*R\u001D\u0010\u0006\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b/\u0010(\u001A\u0004\b0\u0010*R\u001D\u0010\u0007\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b1\u0010(\u001A\u0004\b2\u0010*R\u001D\u0010\b\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b3\u0010(\u001A\u0004\b4\u0010*R\u001D\u0010\t\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b5\u0010(\u001A\u0004\b6\u0010*R\u001D\u0010\n\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b7\u0010(\u001A\u0004\b8\u0010*R\u001D\u0010\u000B\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b9\u0010(\u001A\u0004\b:\u0010*R\u001D\u0010\f\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b;\u0010(\u001A\u0004\b<\u0010*R\u001D\u0010\r\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b=\u0010(\u001A\u0004\b>\u0010*R\u001D\u0010\u000E\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b?\u0010(\u001A\u0004\b@\u0010*\u0082\u0002\u000B\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u0006A"}, d2 = {"Landroidx/compose/material3/CheckboxColors;", "", "Landroidx/compose/ui/graphics/Color;", "checkedCheckmarkColor", "uncheckedCheckmarkColor", "checkedBoxColor", "uncheckedBoxColor", "disabledCheckedBoxColor", "disabledUncheckedBoxColor", "disabledIndeterminateBoxColor", "checkedBorderColor", "uncheckedBorderColor", "disabledBorderColor", "disabledUncheckedBorderColor", "disabledIndeterminateBorderColor", "<init>", "(JJJJJJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "copy-2qZNXz8", "(JJJJJJJJJJJJ)Landroidx/compose/material3/CheckboxColors;", "copy", "Landroidx/compose/ui/state/ToggleableState;", "state", "Landroidx/compose/runtime/State;", "checkmarkColor$material3_release", "(Landroidx/compose/ui/state/ToggleableState;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "checkmarkColor", "", "enabled", "boxColor$material3_release", "(ZLandroidx/compose/ui/state/ToggleableState;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "boxColor", "borderColor$material3_release", "borderColor", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "J", "getCheckedCheckmarkColor-0d7_KjU", "()J", "b", "getUncheckedCheckmarkColor-0d7_KjU", "c", "getCheckedBoxColor-0d7_KjU", "d", "getUncheckedBoxColor-0d7_KjU", "e", "getDisabledCheckedBoxColor-0d7_KjU", "f", "getDisabledUncheckedBoxColor-0d7_KjU", "g", "getDisabledIndeterminateBoxColor-0d7_KjU", "h", "getCheckedBorderColor-0d7_KjU", "i", "getUncheckedBorderColor-0d7_KjU", "j", "getDisabledBorderColor-0d7_KjU", "k", "getDisabledUncheckedBorderColor-0d7_KjU", "l", "getDisabledIndeterminateBorderColor-0d7_KjU", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nCheckbox.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Checkbox.kt\nandroidx/compose/material3/CheckboxColors\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,607:1\n708#2:608\n696#2:609\n708#2:610\n696#2:611\n708#2:612\n696#2:613\n708#2:614\n696#2:615\n708#2:616\n696#2:617\n708#2:618\n696#2:619\n708#2:620\n696#2:621\n708#2:622\n696#2:623\n708#2:624\n696#2:625\n708#2:626\n696#2:627\n708#2:628\n696#2:629\n708#2:630\n696#2:631\n*S KotlinDebug\n*F\n+ 1 Checkbox.kt\nandroidx/compose/material3/CheckboxColors\n*L\n462#1:608\n462#1:609\n463#1:610\n463#1:611\n464#1:612\n464#1:613\n465#1:614\n465#1:615\n466#1:616\n466#1:617\n467#1:618\n467#1:619\n468#1:620\n468#1:621\n469#1:622\n469#1:623\n470#1:624\n470#1:625\n471#1:626\n471#1:627\n472#1:628\n472#1:629\n473#1:630\n473#1:631\n*E\n"})
public final class CheckboxColors {
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[ToggleableState.values().length];
            try {
                arr_v[ToggleableState.On.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[ToggleableState.Indeterminate.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[ToggleableState.Off.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    public static final int $stable;
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final long i;
    public final long j;
    public final long k;
    public final long l;

    public CheckboxColors(long v, long v1, long v2, long v3, long v4, long v5, long v6, long v7, long v8, long v9, long v10, long v11, DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = v3;
        this.e = v4;
        this.f = v5;
        this.g = v6;
        this.h = v7;
        this.i = v8;
        this.j = v9;
        this.k = v10;
        this.l = v11;
    }

    @Composable
    @NotNull
    public final State borderColor$material3_release(boolean z, @NotNull ToggleableState toggleableState0, @Nullable Composer composer0, int v) {
        State state0;
        long v1;
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1009643462, v, -1, "androidx.compose.material3.CheckboxColors.borderColor (Checkbox.kt:534)");
        }
        if(z) {
            switch(WhenMappings.$EnumSwitchMapping$0[toggleableState0.ordinal()]) {
                case 1: 
                case 2: {
                    v1 = this.h;
                    break;
                }
                case 3: {
                    v1 = this.i;
                    break;
                }
                default: {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
        else {
            switch(WhenMappings.$EnumSwitchMapping$0[toggleableState0.ordinal()]) {
                case 1: {
                    v1 = this.j;
                    break;
                }
                case 2: {
                    v1 = this.l;
                    break;
                }
                case 3: {
                    v1 = this.k;
                    break;
                }
                default: {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
        if(z) {
            composer0.startReplaceGroup(0x9922214F);
            state0 = SingleValueAnimationKt.animateColorAsState-euL9pac(v1, AnimationSpecKt.tween$default((toggleableState0 == ToggleableState.Off ? 100 : 50), 0, null, 6, null), null, null, composer0, 0, 12);
        }
        else {
            composer0.startReplaceGroup(0x9924E28F);
            state0 = SnapshotStateKt.rememberUpdatedState(Color.box-impl(v1), composer0, 0);
        }
        composer0.endReplaceGroup();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return state0;
    }

    @Composable
    @NotNull
    public final State boxColor$material3_release(boolean z, @NotNull ToggleableState toggleableState0, @Nullable Composer composer0, int v) {
        State state0;
        long v1;
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x15804D09, v, -1, "androidx.compose.material3.CheckboxColors.boxColor (Checkbox.kt:501)");
        }
        if(z) {
            switch(WhenMappings.$EnumSwitchMapping$0[toggleableState0.ordinal()]) {
                case 1: 
                case 2: {
                    v1 = this.c;
                    break;
                }
                case 3: {
                    v1 = this.d;
                    break;
                }
                default: {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
        else {
            switch(WhenMappings.$EnumSwitchMapping$0[toggleableState0.ordinal()]) {
                case 1: {
                    v1 = this.e;
                    break;
                }
                case 2: {
                    v1 = this.g;
                    break;
                }
                case 3: {
                    v1 = this.f;
                    break;
                }
                default: {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
        if(z) {
            composer0.startReplaceGroup(0xE89F523E);
            state0 = SingleValueAnimationKt.animateColorAsState-euL9pac(v1, AnimationSpecKt.tween$default((toggleableState0 == ToggleableState.Off ? 100 : 50), 0, null, 6, null), null, null, composer0, 0, 12);
        }
        else {
            composer0.startReplaceGroup(-392031362);
            state0 = SnapshotStateKt.rememberUpdatedState(Color.box-impl(v1), composer0, 0);
        }
        composer0.endReplaceGroup();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return state0;
    }

    @Composable
    @NotNull
    public final State checkmarkColor$material3_release(@NotNull ToggleableState toggleableState0, @Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-507585681, v, -1, "androidx.compose.material3.CheckboxColors.checkmarkColor (Checkbox.kt:481)");
        }
        State state0 = SingleValueAnimationKt.animateColorAsState-euL9pac((toggleableState0 == ToggleableState.Off ? this.b : this.a), AnimationSpecKt.tween$default((toggleableState0 == ToggleableState.Off ? 100 : 50), 0, null, 6, null), null, null, composer0, 0, 12);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return state0;
    }

    @NotNull
    public final CheckboxColors copy-2qZNXz8(long v, long v1, long v2, long v3, long v4, long v5, long v6, long v7, long v8, long v9, long v10, long v11) {
        long v12 = v == 16L ? this.a : v;
        long v13 = v1 == 16L ? this.b : v1;
        long v14 = v2 == 16L ? this.c : v2;
        long v15 = v3 == 16L ? this.d : v3;
        long v16 = v4 == 16L ? this.e : v4;
        long v17 = v5 == 16L ? this.f : v5;
        long v18 = v6 == 16L ? this.g : v6;
        long v19 = v7 == 16L ? this.h : v7;
        long v20 = v8 == 16L ? this.i : v8;
        long v21 = v9 == 16L ? this.j : v9;
        long v22 = v10 == 16L ? this.k : v10;
        return v11 == 16L ? new CheckboxColors(v12, v13, v14, v15, v16, v17, v18, v19, v20, v21, v22, this.l, null) : new CheckboxColors(v12, v13, v14, v15, v16, v17, v18, v19, v20, v21, v22, v11, null);
    }

    public static CheckboxColors copy-2qZNXz8$default(CheckboxColors checkboxColors0, long v, long v1, long v2, long v3, long v4, long v5, long v6, long v7, long v8, long v9, long v10, long v11, int v12, Object object0) {
        long v13 = (v12 & 1) == 0 ? v : checkboxColors0.a;
        long v14 = (v12 & 2) == 0 ? v1 : checkboxColors0.b;
        long v15 = (v12 & 4) == 0 ? v2 : checkboxColors0.c;
        long v16 = (v12 & 8) == 0 ? v3 : checkboxColors0.d;
        long v17 = (v12 & 16) == 0 ? v4 : checkboxColors0.e;
        long v18 = (v12 & 0x20) == 0 ? v5 : checkboxColors0.f;
        long v19 = (v12 & 0x40) == 0 ? v6 : checkboxColors0.g;
        long v20 = (v12 & 0x80) == 0 ? v7 : checkboxColors0.h;
        long v21 = (v12 & 0x100) == 0 ? v8 : checkboxColors0.i;
        long v22 = (v12 & 0x200) == 0 ? v9 : checkboxColors0.j;
        long v23 = (v12 & 0x400) == 0 ? v10 : checkboxColors0.k;
        return (v12 & 0x800) == 0 ? checkboxColors0.copy-2qZNXz8(v13, v14, v15, v16, v17, v18, v19, v20, v21, v22, v23, v11) : checkboxColors0.copy-2qZNXz8(v13, v14, v15, v16, v17, v18, v19, v20, v21, v22, v23, checkboxColors0.l);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 == null || !(object0 instanceof CheckboxColors) || !Color.equals-impl0(this.a, ((CheckboxColors)object0).a)) {
            return false;
        }
        if(!Color.equals-impl0(this.b, ((CheckboxColors)object0).b)) {
            return false;
        }
        if(!Color.equals-impl0(this.c, ((CheckboxColors)object0).c)) {
            return false;
        }
        if(!Color.equals-impl0(this.d, ((CheckboxColors)object0).d)) {
            return false;
        }
        if(!Color.equals-impl0(this.e, ((CheckboxColors)object0).e)) {
            return false;
        }
        if(!Color.equals-impl0(this.f, ((CheckboxColors)object0).f)) {
            return false;
        }
        if(!Color.equals-impl0(this.g, ((CheckboxColors)object0).g)) {
            return false;
        }
        if(!Color.equals-impl0(this.h, ((CheckboxColors)object0).h)) {
            return false;
        }
        if(!Color.equals-impl0(this.i, ((CheckboxColors)object0).i)) {
            return false;
        }
        if(!Color.equals-impl0(this.j, ((CheckboxColors)object0).j)) {
            return false;
        }
        return Color.equals-impl0(this.k, ((CheckboxColors)object0).k) ? Color.equals-impl0(this.l, ((CheckboxColors)object0).l) : false;
    }

    public final long getCheckedBorderColor-0d7_KjU() {
        return this.h;
    }

    public final long getCheckedBoxColor-0d7_KjU() {
        return this.c;
    }

    public final long getCheckedCheckmarkColor-0d7_KjU() {
        return this.a;
    }

    public final long getDisabledBorderColor-0d7_KjU() {
        return this.j;
    }

    public final long getDisabledCheckedBoxColor-0d7_KjU() {
        return this.e;
    }

    public final long getDisabledIndeterminateBorderColor-0d7_KjU() {
        return this.l;
    }

    public final long getDisabledIndeterminateBoxColor-0d7_KjU() {
        return this.g;
    }

    public final long getDisabledUncheckedBorderColor-0d7_KjU() {
        return this.k;
    }

    public final long getDisabledUncheckedBoxColor-0d7_KjU() {
        return this.f;
    }

    public final long getUncheckedBorderColor-0d7_KjU() {
        return this.i;
    }

    public final long getUncheckedBoxColor-0d7_KjU() {
        return this.d;
    }

    public final long getUncheckedCheckmarkColor-0d7_KjU() {
        return this.b;
    }

    @Override
    public int hashCode() {
        return Color.hashCode-impl(this.l) + a.a(this.k, a.a(this.j, a.a(this.i, a.a(this.h, a.a(this.g, a.a(this.f, a.a(this.e, a.a(this.d, a.a(this.c, a.a(this.b, Color.hashCode-impl(this.a) * 0x1F, 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F);
    }
}

