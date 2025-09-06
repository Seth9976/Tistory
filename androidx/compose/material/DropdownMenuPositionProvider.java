package androidx.compose.material;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.PopupPositionProvider;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt__SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.q2;

@Immutable
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\f\b\u0081\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u001A\b\u0002\u0010\t\u001A\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u00A2\u0006\u0004\b\n\u0010\u000BJ2\u0010\u0015\u001A\u00020\u00122\u0006\u0010\f\u001A\u00020\u00072\u0006\u0010\u000E\u001A\u00020\r2\u0006\u0010\u0010\u001A\u00020\u000F2\u0006\u0010\u0011\u001A\u00020\rH\u0016\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0013\u0010\u0014J\u0016\u0010\u0018\u001A\u00020\u0002H\u00C6\u0003\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b\u0019\u0010\u001AJ\"\u0010\u001B\u001A\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u00C6\u0003\u00A2\u0006\u0004\b\u001B\u0010\u001CJC\u0010\u001F\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\u001A\b\u0002\u0010\t\u001A\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u00C6\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001D\u0010\u001EJ\u0010\u0010!\u001A\u00020 H\u00D6\u0001\u00A2\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001A\u00020#H\u00D6\u0001\u00A2\u0006\u0004\b$\u0010%J\u001A\u0010)\u001A\u00020(2\b\u0010\'\u001A\u0004\u0018\u00010&H\u00D6\u0003\u00A2\u0006\u0004\b)\u0010*R\u001D\u0010\u0003\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b+\u0010,\u001A\u0004\b-\u0010\u0017R\u0017\u0010\u0005\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\b.\u0010/\u001A\u0004\b0\u0010\u001AR)\u0010\t\u001A\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0006\u00A2\u0006\f\n\u0004\b1\u00102\u001A\u0004\b3\u0010\u001C\u0082\u0002\u000B\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u00064"}, d2 = {"Landroidx/compose/material/DropdownMenuPositionProvider;", "Landroidx/compose/ui/window/PopupPositionProvider;", "Landroidx/compose/ui/unit/DpOffset;", "contentOffset", "Landroidx/compose/ui/unit/Density;", "density", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/IntRect;", "", "onPositionCalculated", "<init>", "(JLandroidx/compose/ui/unit/Density;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "anchorBounds", "Landroidx/compose/ui/unit/IntSize;", "windowSize", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "popupContentSize", "Landroidx/compose/ui/unit/IntOffset;", "calculatePosition-llwVHH4", "(Landroidx/compose/ui/unit/IntRect;JLandroidx/compose/ui/unit/LayoutDirection;J)J", "calculatePosition", "component1-RKDOV3M", "()J", "component1", "component2", "()Landroidx/compose/ui/unit/Density;", "component3", "()Lkotlin/jvm/functions/Function2;", "copy-rOJDEFc", "(JLandroidx/compose/ui/unit/Density;Lkotlin/jvm/functions/Function2;)Landroidx/compose/material/DropdownMenuPositionProvider;", "copy", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "getContentOffset-RKDOV3M", "b", "Landroidx/compose/ui/unit/Density;", "getDensity", "c", "Lkotlin/jvm/functions/Function2;", "getOnPositionCalculated", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Menu.kt\nandroidx/compose/material/DropdownMenuPositionProvider\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,304:1\n1#2:305\n179#3,2:306\n179#3,2:308\n*S KotlinDebug\n*F\n+ 1 Menu.kt\nandroidx/compose/material/DropdownMenuPositionProvider\n*L\n278#1:306,2\n292#1:308,2\n*E\n"})
public final class DropdownMenuPositionProvider implements PopupPositionProvider {
    public static final int $stable;
    public final long a;
    public final Density b;
    public final Function2 c;

    public DropdownMenuPositionProvider(long v, Density density0, Function2 function20, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v1 & 4) != 0) {
            function20 = q2.F;
        }
        this(v, density0, function20, null);
    }

    public DropdownMenuPositionProvider(long v, Density density0, Function2 function20, DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = v;
        this.b = density0;
        this.c = function20;
    }

    @Override  // androidx.compose.ui.window.PopupPositionProvider
    public long calculatePosition-llwVHH4(@NotNull IntRect intRect0, long v, @NotNull LayoutDirection layoutDirection0, long v1) {
        Object object1;
        Object object0;
        Sequence sequence0;
        int v2 = this.b.roundToPx-0680j_4(48.0f);
        int v3 = this.b.roundToPx-0680j_4(DpOffset.getX-D9Ej5fM(this.a)) * (layoutDirection0 == LayoutDirection.Ltr ? 1 : -1);
        int v4 = this.b.roundToPx-0680j_4(DpOffset.getY-D9Ej5fM(this.a));
        int v5 = intRect0.getLeft() + v3;
        int v6 = intRect0.getRight() - IntSize.getWidth-impl(v1) + v3;
        int v7 = IntSize.getWidth-impl(v) - IntSize.getWidth-impl(v1);
        if(layoutDirection0 == LayoutDirection.Ltr) {
            Integer integer0 = v5;
            Integer integer1 = v6;
            if(intRect0.getLeft() < 0) {
                v7 = 0;
            }
            sequence0 = SequencesKt__SequencesKt.sequenceOf(new Integer[]{integer0, integer1, v7});
        }
        else {
            Integer integer2 = v6;
            Integer integer3 = v5;
            if(intRect0.getRight() <= IntSize.getWidth-impl(v)) {
                v7 = 0;
            }
            sequence0 = SequencesKt__SequencesKt.sequenceOf(new Integer[]{integer2, integer3, v7});
        }
        Iterator iterator0 = sequence0.iterator();
        do {
            object0 = null;
            if(!iterator0.hasNext()) {
                goto label_25;
            }
            object1 = iterator0.next();
            int v8 = ((Number)object1).intValue();
        }
        while(v8 < 0 || IntSize.getWidth-impl(v1) + v8 > IntSize.getWidth-impl(v));
        goto label_26;
    label_25:
        object1 = null;
    label_26:
        if(((Integer)object1) != null) {
            v6 = (int)(((Integer)object1));
        }
        int v9 = intRect0.getTop() - IntSize.getHeight-impl(v1) + v4;
        for(Object object2: SequencesKt__SequencesKt.sequenceOf(new Integer[]{Math.max(intRect0.getBottom() + v4, v2), v9, ((int)(intRect0.getTop() - IntSize.getHeight-impl(v1) / 2 + v4)), ((int)(IntSize.getHeight-impl(v) - IntSize.getHeight-impl(v1) - v2))})) {
            int v10 = ((Number)object2).intValue();
            if(v10 >= v2 && IntSize.getHeight-impl(v1) + v10 <= IntSize.getHeight-impl(v) - v2) {
                object0 = object2;
                break;
            }
            if(false) {
                break;
            }
        }
        if(((Integer)object0) != null) {
            v9 = (int)(((Integer)object0));
        }
        IntRect intRect1 = new IntRect(v6, v9, IntSize.getWidth-impl(v1) + v6, IntSize.getHeight-impl(v1) + v9);
        this.c.invoke(intRect0, intRect1);
        return IntOffsetKt.IntOffset(v6, v9);
    }

    public final long component1-RKDOV3M() {
        return this.a;
    }

    @NotNull
    public final Density component2() {
        return this.b;
    }

    @NotNull
    public final Function2 component3() {
        return this.c;
    }

    @NotNull
    public final DropdownMenuPositionProvider copy-rOJDEFc(long v, @NotNull Density density0, @NotNull Function2 function20) {
        return new DropdownMenuPositionProvider(v, density0, function20, null);
    }

    public static DropdownMenuPositionProvider copy-rOJDEFc$default(DropdownMenuPositionProvider dropdownMenuPositionProvider0, long v, Density density0, Function2 function20, int v1, Object object0) {
        if((v1 & 1) != 0) {
            v = dropdownMenuPositionProvider0.a;
        }
        if((v1 & 2) != 0) {
            density0 = dropdownMenuPositionProvider0.b;
        }
        if((v1 & 4) != 0) {
            function20 = dropdownMenuPositionProvider0.c;
        }
        return dropdownMenuPositionProvider0.copy-rOJDEFc(v, density0, function20);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof DropdownMenuPositionProvider)) {
            return false;
        }
        if(!DpOffset.equals-impl0(this.a, ((DropdownMenuPositionProvider)object0).a)) {
            return false;
        }
        return Intrinsics.areEqual(this.b, ((DropdownMenuPositionProvider)object0).b) ? Intrinsics.areEqual(this.c, ((DropdownMenuPositionProvider)object0).c) : false;
    }

    public final long getContentOffset-RKDOV3M() {
        return this.a;
    }

    @NotNull
    public final Density getDensity() {
        return this.b;
    }

    @NotNull
    public final Function2 getOnPositionCalculated() {
        return this.c;
    }

    @Override
    public int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() + DpOffset.hashCode-impl(this.a) * 0x1F) * 0x1F;
    }

    @Override
    @NotNull
    public String toString() {
        return "DropdownMenuPositionProvider(contentOffset=" + DpOffset.toString-impl(this.a) + ", density=" + this.b + ", onPositionCalculated=" + this.c + ')';
    }
}

