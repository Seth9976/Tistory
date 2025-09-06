package androidx.compose.material3.internal;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpOffset;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntRectKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.PopupPositionProvider;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;
import w0.u0;

@Immutable
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000F\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u000F\b\u0081\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001A\u00020\u0006\u00128\b\u0002\u0010\u000F\u001A2\u0012\u0013\u0012\u00110\t\u00A2\u0006\f\b\n\u0012\b\b\u000B\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\t\u00A2\u0006\f\b\n\u0012\b\b\u000B\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000E0\b\u00A2\u0006\u0004\b\u0010\u0010\u0011J2\u0010\u001A\u001A\u00020\u00172\u0006\u0010\f\u001A\u00020\t2\u0006\u0010\u0013\u001A\u00020\u00122\u0006\u0010\u0015\u001A\u00020\u00142\u0006\u0010\u0016\u001A\u00020\u0012H\u0016\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0018\u0010\u0019J\u0016\u0010\u001D\u001A\u00020\u0002H\u00C6\u0003\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001B\u0010\u001CJ\u0010\u0010\u001E\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b\u001E\u0010\u001FJ\u0010\u0010 \u001A\u00020\u0006H\u00C6\u0003\u00A2\u0006\u0004\b \u0010!J@\u0010\"\u001A2\u0012\u0013\u0012\u00110\t\u00A2\u0006\f\b\n\u0012\b\b\u000B\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\t\u00A2\u0006\f\b\n\u0012\b\b\u000B\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000E0\bH\u00C6\u0003\u00A2\u0006\u0004\b\"\u0010#Jk\u0010&\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u000628\b\u0002\u0010\u000F\u001A2\u0012\u0013\u0012\u00110\t\u00A2\u0006\f\b\n\u0012\b\b\u000B\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\t\u00A2\u0006\f\b\n\u0012\b\b\u000B\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000E0\bH\u00C6\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\b$\u0010%J\u0010\u0010(\u001A\u00020\'H\u00D6\u0001\u00A2\u0006\u0004\b(\u0010)J\u0010\u0010*\u001A\u00020\u0006H\u00D6\u0001\u00A2\u0006\u0004\b*\u0010!J\u001A\u0010.\u001A\u00020-2\b\u0010,\u001A\u0004\u0018\u00010+H\u00D6\u0003\u00A2\u0006\u0004\b.\u0010/R\u001D\u0010\u0003\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b0\u00101\u001A\u0004\b2\u0010\u001CR\u0017\u0010\u0005\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\b3\u00104\u001A\u0004\b5\u0010\u001FR\u0017\u0010\u0007\u001A\u00020\u00068\u0006\u00A2\u0006\f\n\u0004\b6\u00107\u001A\u0004\b8\u0010!RG\u0010\u000F\u001A2\u0012\u0013\u0012\u00110\t\u00A2\u0006\f\b\n\u0012\b\b\u000B\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\t\u00A2\u0006\f\b\n\u0012\b\b\u000B\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000E0\b8\u0006\u00A2\u0006\f\n\u0004\b9\u0010:\u001A\u0004\b;\u0010#\u0082\u0002\u000B\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u0006<"}, d2 = {"Landroidx/compose/material3/internal/DropdownMenuPositionProvider;", "Landroidx/compose/ui/window/PopupPositionProvider;", "Landroidx/compose/ui/unit/DpOffset;", "contentOffset", "Landroidx/compose/ui/unit/Density;", "density", "", "verticalMargin", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/IntRect;", "Lkotlin/ParameterName;", "name", "anchorBounds", "menuBounds", "", "onPositionCalculated", "<init>", "(JLandroidx/compose/ui/unit/Density;ILkotlin/jvm/functions/Function2;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/unit/IntSize;", "windowSize", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "popupContentSize", "Landroidx/compose/ui/unit/IntOffset;", "calculatePosition-llwVHH4", "(Landroidx/compose/ui/unit/IntRect;JLandroidx/compose/ui/unit/LayoutDirection;J)J", "calculatePosition", "component1-RKDOV3M", "()J", "component1", "component2", "()Landroidx/compose/ui/unit/Density;", "component3", "()I", "component4", "()Lkotlin/jvm/functions/Function2;", "copy-uVxBXkw", "(JLandroidx/compose/ui/unit/Density;ILkotlin/jvm/functions/Function2;)Landroidx/compose/material3/internal/DropdownMenuPositionProvider;", "copy", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "getContentOffset-RKDOV3M", "b", "Landroidx/compose/ui/unit/Density;", "getDensity", "c", "I", "getVerticalMargin", "d", "Lkotlin/jvm/functions/Function2;", "getOnPositionCalculated", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nMenuPosition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MenuPosition.kt\nandroidx/compose/material3/internal/DropdownMenuPositionProvider\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,432:1\n1#2:433\n*E\n"})
public final class DropdownMenuPositionProvider implements PopupPositionProvider {
    public static final int $stable;
    public final long a;
    public final Density b;
    public final int c;
    public final Function2 d;
    public final Horizontal e;
    public final Horizontal f;
    public final Horizontal g;
    public final Horizontal h;
    public final Vertical i;
    public final Vertical j;
    public final Vertical k;
    public final Vertical l;
    public final Vertical m;

    public DropdownMenuPositionProvider(long v, Density density0, int v1, Function2 function20, int v2, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v2 & 4) != 0) {
            v1 = density0.roundToPx-0680j_4(48.0f);
        }
        if((v2 & 8) != 0) {
            function20 = u0.w;
        }
        this(v, density0, v1, function20, null);
    }

    public DropdownMenuPositionProvider(long v, Density density0, int v1, Function2 function20, DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = v;
        this.b = density0;
        this.c = v1;
        this.d = function20;
        int v2 = density0.roundToPx-0680j_4(DpOffset.getX-D9Ej5fM(v));
        this.e = MenuPosition.INSTANCE.startToAnchorStart(v2);
        this.f = MenuPosition.INSTANCE.endToAnchorEnd(v2);
        this.g = MenuPosition.INSTANCE.leftToWindowLeft(0);
        this.h = MenuPosition.INSTANCE.rightToWindowRight(0);
        int v3 = density0.roundToPx-0680j_4(DpOffset.getY-D9Ej5fM(v));
        this.i = MenuPosition.INSTANCE.topToAnchorBottom(v3);
        this.j = MenuPosition.INSTANCE.bottomToAnchorTop(v3);
        this.k = MenuPosition.INSTANCE.centerToAnchorTop(v3);
        this.l = MenuPosition.INSTANCE.topToWindowTop(v1);
        this.m = MenuPosition.INSTANCE.bottomToWindowBottom(v1);
    }

    @Override  // androidx.compose.ui.window.PopupPositionProvider
    public long calculatePosition-llwVHH4(@NotNull IntRect intRect0, long v, @NotNull LayoutDirection layoutDirection0, long v1) {
        int v5;
        int v2 = 0;
        Horizontal menuPosition$Horizontal0 = IntOffset.getX-impl(intRect0.getCenter-nOcc-ac()) >= IntSize.getWidth-impl(v) / 2 ? this.h : this.g;
        List list0 = CollectionsKt__CollectionsKt.listOf(new Horizontal[]{this.e, this.f, menuPosition$Horizontal0});
        int v3 = list0.size();
        for(int v4 = 0; true; ++v4) {
            v5 = 0;
            if(v4 >= v3) {
                break;
            }
            int v6 = ((Horizontal)list0.get(v4)).position-95KtPRI(intRect0, v, IntSize.getWidth-impl(v1), layoutDirection0);
            if(v4 == CollectionsKt__CollectionsKt.getLastIndex(list0) || v6 >= 0 && IntSize.getWidth-impl(v1) + v6 <= IntSize.getWidth-impl(v)) {
                v5 = v6;
                break;
            }
        }
        Vertical menuPosition$Vertical0 = IntOffset.getY-impl(intRect0.getCenter-nOcc-ac()) >= IntSize.getHeight-impl(v) / 2 ? this.m : this.l;
        List list1 = CollectionsKt__CollectionsKt.listOf(new Vertical[]{this.i, this.j, this.k, menuPosition$Vertical0});
        int v7 = list1.size();
        int v8 = 0;
        while(v8 < v7) {
            int v9 = ((Vertical)list1.get(v8)).position-JVtK1S4(intRect0, v, IntSize.getHeight-impl(v1));
            if(v8 != CollectionsKt__CollectionsKt.getLastIndex(list1) && (v9 < this.c || IntSize.getHeight-impl(v1) + v9 > IntSize.getHeight-impl(v) - this.c)) {
                ++v8;
            }
            else {
                v2 = v9;
                if(true) {
                    break;
                }
            }
        }
        long v10 = IntOffsetKt.IntOffset(v5, v2);
        IntRect intRect1 = IntRectKt.IntRect-VbeCjmY(v10, v1);
        this.d.invoke(intRect0, intRect1);
        return v10;
    }

    public final long component1-RKDOV3M() {
        return this.a;
    }

    @NotNull
    public final Density component2() {
        return this.b;
    }

    public final int component3() {
        return this.c;
    }

    @NotNull
    public final Function2 component4() {
        return this.d;
    }

    @NotNull
    public final DropdownMenuPositionProvider copy-uVxBXkw(long v, @NotNull Density density0, int v1, @NotNull Function2 function20) {
        return new DropdownMenuPositionProvider(v, density0, v1, function20, null);
    }

    public static DropdownMenuPositionProvider copy-uVxBXkw$default(DropdownMenuPositionProvider dropdownMenuPositionProvider0, long v, Density density0, int v1, Function2 function20, int v2, Object object0) {
        if((v2 & 1) != 0) {
            v = dropdownMenuPositionProvider0.a;
        }
        if((v2 & 2) != 0) {
            density0 = dropdownMenuPositionProvider0.b;
        }
        if((v2 & 4) != 0) {
            v1 = dropdownMenuPositionProvider0.c;
        }
        if((v2 & 8) != 0) {
            function20 = dropdownMenuPositionProvider0.d;
        }
        return dropdownMenuPositionProvider0.copy-uVxBXkw(v, density0, v1, function20);
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
        if(!Intrinsics.areEqual(this.b, ((DropdownMenuPositionProvider)object0).b)) {
            return false;
        }
        return this.c == ((DropdownMenuPositionProvider)object0).c ? Intrinsics.areEqual(this.d, ((DropdownMenuPositionProvider)object0).d) : false;
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
        return this.d;
    }

    public final int getVerticalMargin() {
        return this.c;
    }

    @Override
    public int hashCode() {
        return this.d.hashCode() + a.c(this.c, (this.b.hashCode() + DpOffset.hashCode-impl(this.a) * 0x1F) * 0x1F, 0x1F);
    }

    @Override
    @NotNull
    public String toString() {
        return "DropdownMenuPositionProvider(contentOffset=" + DpOffset.toString-impl(this.a) + ", density=" + this.b + ", verticalMargin=" + this.c + ", onPositionCalculated=" + this.d + ')';
    }
}

