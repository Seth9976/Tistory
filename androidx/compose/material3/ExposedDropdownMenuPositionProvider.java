package androidx.compose.material3;

import androidx.compose.material3.internal.MenuPosition.Horizontal;
import androidx.compose.material3.internal.MenuPosition.Vertical;
import androidx.compose.material3.internal.MenuPosition;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntRectKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.PopupPositionProvider;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Stable
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0001\u0018\u00002\u00020\u0001Bm\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0010\b\u0002\u0010\b\u001A\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001A\u00020\u0004\u00128\b\u0002\u0010\u0010\u001A2\u0012\u0013\u0012\u00110\u000B¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000E\u0012\u0013\u0012\u00110\u000B¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000F\u0012\u0004\u0012\u00020\u00070\n¢\u0006\u0004\b\u0011\u0010\u0012J2\u0010\u001B\u001A\u00020\u00182\u0006\u0010\u000E\u001A\u00020\u000B2\u0006\u0010\u0014\u001A\u00020\u00132\u0006\u0010\u0016\u001A\u00020\u00152\u0006\u0010\u0017\u001A\u00020\u0013H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001AR\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001C\u0010\u001D\u001A\u0004\b\u001E\u0010\u001FR\u0017\u0010\u0005\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001A\u0004\b\"\u0010#R\u001F\u0010\b\u001A\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b$\u0010%\u001A\u0004\b&\u0010\'R\u0017\u0010\t\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b(\u0010!\u001A\u0004\b)\u0010#RG\u0010\u0010\u001A2\u0012\u0013\u0012\u00110\u000B¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000E\u0012\u0013\u0012\u00110\u000B¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000F\u0012\u0004\u0012\u00020\u00070\n8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001A\u0004\b,\u0010-\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006."}, d2 = {"Landroidx/compose/material3/ExposedDropdownMenuPositionProvider;", "Landroidx/compose/ui/window/PopupPositionProvider;", "Landroidx/compose/ui/unit/Density;", "density", "", "topWindowInsets", "Landroidx/compose/runtime/State;", "", "keyboardSignalState", "verticalMargin", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/IntRect;", "Lkotlin/ParameterName;", "name", "anchorBounds", "menuBounds", "onPositionCalculated", "<init>", "(Landroidx/compose/ui/unit/Density;ILandroidx/compose/runtime/State;ILkotlin/jvm/functions/Function2;)V", "Landroidx/compose/ui/unit/IntSize;", "windowSize", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "popupContentSize", "Landroidx/compose/ui/unit/IntOffset;", "calculatePosition-llwVHH4", "(Landroidx/compose/ui/unit/IntRect;JLandroidx/compose/ui/unit/LayoutDirection;J)J", "calculatePosition", "a", "Landroidx/compose/ui/unit/Density;", "getDensity", "()Landroidx/compose/ui/unit/Density;", "b", "I", "getTopWindowInsets", "()I", "c", "Landroidx/compose/runtime/State;", "getKeyboardSignalState", "()Landroidx/compose/runtime/State;", "d", "getVerticalMargin", "e", "Lkotlin/jvm/functions/Function2;", "getOnPositionCalculated", "()Lkotlin/jvm/functions/Function2;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nExposedDropdownMenu.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExposedDropdownMenu.android.kt\nandroidx/compose/material3/ExposedDropdownMenuPositionProvider\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1490:1\n1#2:1491\n*E\n"})
public final class ExposedDropdownMenuPositionProvider implements PopupPositionProvider {
    public static final int $stable;
    public final Density a;
    public final int b;
    public final State c;
    public final int d;
    public final Function2 e;
    public final Horizontal f;
    public final Horizontal g;
    public final Horizontal h;
    public final Horizontal i;
    public final Vertical j;
    public final Vertical k;
    public final Vertical l;
    public final Vertical m;

    public ExposedDropdownMenuPositionProvider(@NotNull Density density0, int v, @Nullable State state0, int v1, @NotNull Function2 function20) {
        this.a = density0;
        this.b = v;
        this.c = state0;
        this.d = v1;
        this.e = function20;
        this.f = MenuPosition.startToAnchorStart$default(MenuPosition.INSTANCE, 0, 1, null);
        this.g = MenuPosition.endToAnchorEnd$default(MenuPosition.INSTANCE, 0, 1, null);
        this.h = MenuPosition.leftToWindowLeft$default(MenuPosition.INSTANCE, 0, 1, null);
        this.i = MenuPosition.rightToWindowRight$default(MenuPosition.INSTANCE, 0, 1, null);
        this.j = MenuPosition.topToAnchorBottom$default(MenuPosition.INSTANCE, 0, 1, null);
        this.k = MenuPosition.bottomToAnchorTop$default(MenuPosition.INSTANCE, 0, 1, null);
        this.l = MenuPosition.INSTANCE.topToWindowTop(v1);
        this.m = MenuPosition.INSTANCE.bottomToWindowBottom(v1);
    }

    public ExposedDropdownMenuPositionProvider(Density density0, int v, State state0, int v1, Function2 function20, int v2, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v2 & 4) != 0) {
            state0 = null;
        }
        if((v2 & 8) != 0) {
            v1 = density0.roundToPx-0680j_4(48.0f);
        }
        if((v2 & 16) != 0) {
            function20 = u4.F;
        }
        this(density0, v, state0, v1, function20);
    }

    @Override  // androidx.compose.ui.window.PopupPositionProvider
    public long calculatePosition-llwVHH4(@NotNull IntRect intRect0, long v, @NotNull LayoutDirection layoutDirection0, long v1) {
        int v5;
        State state0 = this.c;
        if(state0 != null) {
            state0.getValue();
        }
        long v2 = IntSizeKt.IntSize(IntSize.getWidth-impl(v), IntSize.getHeight-impl(v) + this.b);
        Horizontal menuPosition$Horizontal0 = IntOffset.getX-impl(intRect0.getCenter-nOcc-ac()) >= IntSize.getWidth-impl(v2) / 2 ? this.i : this.h;
        List list0 = CollectionsKt__CollectionsKt.listOf(new Horizontal[]{this.f, this.g, menuPosition$Horizontal0});
        int v3 = list0.size();
        for(int v4 = 0; true; ++v4) {
            v5 = 0;
            if(v4 >= v3) {
                break;
            }
            int v6 = ((Horizontal)list0.get(v4)).position-95KtPRI(intRect0, v2, IntSize.getWidth-impl(v1), layoutDirection0);
            if(v4 == CollectionsKt__CollectionsKt.getLastIndex(list0) || v6 >= 0 && IntSize.getWidth-impl(v1) + v6 <= IntSize.getWidth-impl(v2)) {
                v5 = v6;
                break;
            }
        }
        int v7 = 0;
        Vertical menuPosition$Vertical0 = IntOffset.getY-impl(intRect0.getCenter-nOcc-ac()) >= IntSize.getHeight-impl(v2) / 2 ? this.m : this.l;
        List list1 = CollectionsKt__CollectionsKt.listOf(new Vertical[]{this.j, this.k, menuPosition$Vertical0});
        int v8 = list1.size();
        for(int v9 = 0; v9 < v8; ++v9) {
            int v10 = ((Vertical)list1.get(v9)).position-JVtK1S4(intRect0, v2, IntSize.getHeight-impl(v1));
            if(v9 == CollectionsKt__CollectionsKt.getLastIndex(list1) || v10 >= 0 && IntSize.getHeight-impl(v1) + v10 <= IntSize.getHeight-impl(v2)) {
                v7 = v10;
                break;
            }
        }
        long v11 = IntOffsetKt.IntOffset(v5, v7);
        IntRect intRect1 = IntRectKt.IntRect-VbeCjmY(v11, v1);
        this.e.invoke(intRect0, intRect1);
        return v11;
    }

    @NotNull
    public final Density getDensity() {
        return this.a;
    }

    @Nullable
    public final State getKeyboardSignalState() {
        return this.c;
    }

    @NotNull
    public final Function2 getOnPositionCalculated() {
        return this.e;
    }

    public final int getTopWindowInsets() {
        return this.b;
    }

    public final int getVerticalMargin() {
        return this.d;
    }
}

