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
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import wb.a;

@Immutable
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0002\u0012\u0006\u0010\u0006\u001A\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ8\u0010\u000B\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ%\u0010\u0012\u001A\b\u0012\u0004\u0012\u00020\u00020\u000F2\u0006\u0010\r\u001A\u00020\f2\u0006\u0010\u000E\u001A\u00020\fH\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001A\u0010\u0014\u001A\u00020\f2\b\u0010\u0013\u001A\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000F\u0010\u0017\u001A\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u001D\u0010\u0003\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0019\u0010\u001A\u001A\u0004\b\u001B\u0010\u001CR\u001D\u0010\u0004\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001D\u0010\u001A\u001A\u0004\b\u001E\u0010\u001CR\u001D\u0010\u0005\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001F\u0010\u001A\u001A\u0004\b \u0010\u001CR\u001D\u0010\u0006\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b!\u0010\u001A\u001A\u0004\b\"\u0010\u001C\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006#"}, d2 = {"Landroidx/compose/material3/RadioButtonColors;", "", "Landroidx/compose/ui/graphics/Color;", "selectedColor", "unselectedColor", "disabledSelectedColor", "disabledUnselectedColor", "<init>", "(JJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "copy-jRlVdoo", "(JJJJ)Landroidx/compose/material3/RadioButtonColors;", "copy", "", "enabled", "selected", "Landroidx/compose/runtime/State;", "radioColor$material3_release", "(ZZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "radioColor", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "J", "getSelectedColor-0d7_KjU", "()J", "b", "getUnselectedColor-0d7_KjU", "c", "getDisabledSelectedColor-0d7_KjU", "d", "getDisabledUnselectedColor-0d7_KjU", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nRadioButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RadioButton.kt\nandroidx/compose/material3/RadioButtonColors\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,273:1\n708#2:274\n696#2:275\n708#2:276\n696#2:277\n708#2:278\n696#2:279\n708#2:280\n696#2:281\n*S KotlinDebug\n*F\n+ 1 RadioButton.kt\nandroidx/compose/material3/RadioButtonColors\n*L\n215#1:274\n215#1:275\n216#1:276\n216#1:277\n217#1:278\n217#1:279\n218#1:280\n218#1:281\n*E\n"})
public final class RadioButtonColors {
    public static final int $stable;
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public RadioButtonColors(long v, long v1, long v2, long v3, DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = v3;
    }

    @NotNull
    public final RadioButtonColors copy-jRlVdoo(long v, long v1, long v2, long v3) {
        long v4 = v == 16L ? this.a : v;
        long v5 = v1 == 16L ? this.b : v1;
        long v6 = v2 == 16L ? this.c : v2;
        return v3 == 16L ? new RadioButtonColors(v4, v5, v6, this.d, null) : new RadioButtonColors(v4, v5, v6, v3, null);
    }

    public static RadioButtonColors copy-jRlVdoo$default(RadioButtonColors radioButtonColors0, long v, long v1, long v2, long v3, int v4, Object object0) {
        long v5 = (v4 & 1) == 0 ? v : radioButtonColors0.a;
        long v6 = (v4 & 2) == 0 ? v1 : radioButtonColors0.b;
        long v7 = (v4 & 4) == 0 ? v2 : radioButtonColors0.c;
        return (v4 & 8) == 0 ? radioButtonColors0.copy-jRlVdoo(v5, v6, v7, v3) : radioButtonColors0.copy-jRlVdoo(v5, v6, v7, radioButtonColors0.d);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 == null || !(object0 instanceof RadioButtonColors) || !Color.equals-impl0(this.a, ((RadioButtonColors)object0).a)) {
            return false;
        }
        if(!Color.equals-impl0(this.b, ((RadioButtonColors)object0).b)) {
            return false;
        }
        return Color.equals-impl0(this.c, ((RadioButtonColors)object0).c) ? Color.equals-impl0(this.d, ((RadioButtonColors)object0).d) : false;
    }

    public final long getDisabledSelectedColor-0d7_KjU() {
        return this.c;
    }

    public final long getDisabledUnselectedColor-0d7_KjU() {
        return this.d;
    }

    public final long getSelectedColor-0d7_KjU() {
        return this.a;
    }

    public final long getUnselectedColor-0d7_KjU() {
        return this.b;
    }

    @Override
    public int hashCode() {
        return Color.hashCode-impl(this.d) + a.a(this.c, a.a(this.b, Color.hashCode-impl(this.a) * 0x1F, 0x1F), 0x1F);
    }

    @Composable
    @NotNull
    public final State radioColor$material3_release(boolean z, boolean z1, @Nullable Composer composer0, int v) {
        State state0;
        long v1;
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1840145292, v, -1, "androidx.compose.material3.RadioButtonColors.radioColor (RadioButton.kt:228)");
        }
        if(z && z1) {
            v1 = this.a;
        }
        else if(!z || z1) {
            v1 = z || !z1 ? this.d : this.c;
        }
        else {
            v1 = this.b;
        }
        if(z) {
            composer0.startReplaceGroup(350067971);
            state0 = SingleValueAnimationKt.animateColorAsState-euL9pac(v1, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, null, composer0, 0x30, 12);
        }
        else {
            composer0.startReplaceGroup(350170674);
            state0 = SnapshotStateKt.rememberUpdatedState(Color.box-impl(v1), composer0, 0);
        }
        composer0.endReplaceGroup();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return state0;
    }
}

