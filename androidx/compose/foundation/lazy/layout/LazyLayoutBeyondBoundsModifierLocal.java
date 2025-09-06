package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.BeyondBoundsLayout.BeyondBoundsScope;
import androidx.compose.ui.layout.BeyondBoundsLayout;
import androidx.compose.ui.layout.BeyondBoundsLayoutKt;
import androidx.compose.ui.modifier.ModifierLocalProvider;
import androidx.compose.ui.modifier.ProvidableModifierLocal;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref.ObjectRef;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000  2\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u0002:\u0001 B/\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u0012\u0006\u0010\b\u001A\u00020\u0007\u0012\u0006\u0010\n\u001A\u00020\t\u0012\u0006\u0010\f\u001A\u00020\u000B¢\u0006\u0004\b\r\u0010\u000EJ=\u0010\u0018\u001A\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u000F2\u0006\u0010\u0011\u001A\u00020\u00102\u0019\u0010\u0015\u001A\u0015\u0012\u0004\u0012\u00020\u0013\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0012¢\u0006\u0002\b\u0014H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017R\u001C\u0010\u001C\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00198VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u001A\u0010\u001BR\u0014\u0010\u001F\u001A\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u001D\u0010\u001E\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006!"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsModifierLocal;", "Landroidx/compose/ui/modifier/ModifierLocalProvider;", "Landroidx/compose/ui/layout/BeyondBoundsLayout;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsState;", "state", "Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;", "beyondBoundsInfo", "", "reverseLayout", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "<init>", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsState;Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;ZLandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/foundation/gestures/Orientation;)V", "T", "Landroidx/compose/ui/layout/BeyondBoundsLayout$LayoutDirection;", "direction", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/BeyondBoundsLayout$BeyondBoundsScope;", "Lkotlin/ExtensionFunctionType;", "block", "layout-o7g1Pn8", "(ILkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "layout", "Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "getKey", "()Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "key", "getValue", "()Landroidx/compose/ui/layout/BeyondBoundsLayout;", "value", "Companion", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class LazyLayoutBeyondBoundsModifierLocal implements BeyondBoundsLayout, ModifierLocalProvider {
    @Metadata(d1 = {"\u0000\u000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004*\u0001\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001A\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsModifierLocal$Companion;", "", "androidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsModifierLocal$Companion$emptyBeyondBoundsScope$1", "emptyBeyondBoundsScope", "Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsModifierLocal$Companion$emptyBeyondBoundsScope$1;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[LayoutDirection.values().length];
            try {
                arr_v[LayoutDirection.Ltr.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[LayoutDirection.Rtl.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    public static final int $stable;
    @NotNull
    public static final Companion Companion;
    public final LazyLayoutBeyondBoundsState a;
    public final LazyLayoutBeyondBoundsInfo b;
    public final boolean c;
    public final LayoutDirection d;
    public final Orientation e;
    public static final LazyLayoutBeyondBoundsModifierLocal.Companion.emptyBeyondBoundsScope.1 f;

    static {
        LazyLayoutBeyondBoundsModifierLocal.Companion = new Companion(null);
        LazyLayoutBeyondBoundsModifierLocal.f = new LazyLayoutBeyondBoundsModifierLocal.Companion.emptyBeyondBoundsScope.1();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    public LazyLayoutBeyondBoundsModifierLocal(@NotNull LazyLayoutBeyondBoundsState lazyLayoutBeyondBoundsState0, @NotNull LazyLayoutBeyondBoundsInfo lazyLayoutBeyondBoundsInfo0, boolean z, @NotNull LayoutDirection layoutDirection0, @NotNull Orientation orientation0) {
        this.a = lazyLayoutBeyondBoundsState0;
        this.b = lazyLayoutBeyondBoundsInfo0;
        this.c = z;
        this.d = layoutDirection0;
        this.e = orientation0;
    }

    // 检测为 Lambda 实现
    public final boolean a(Interval lazyLayoutBeyondBoundsInfo$Interval0, int v) [...]

    public final boolean b(int v) {
        if(!androidx.compose.ui.layout.BeyondBoundsLayout.LayoutDirection.equals-impl0(v, 1)) {
            if(androidx.compose.ui.layout.BeyondBoundsLayout.LayoutDirection.equals-impl0(v, 2)) {
                return true;
            }
            boolean z = this.c;
            if(!androidx.compose.ui.layout.BeyondBoundsLayout.LayoutDirection.equals-impl0(v, 5)) {
                if(androidx.compose.ui.layout.BeyondBoundsLayout.LayoutDirection.equals-impl0(v, 6)) {
                    return !z;
                }
                LayoutDirection layoutDirection0 = this.d;
                if(androidx.compose.ui.layout.BeyondBoundsLayout.LayoutDirection.equals-impl0(v, 3)) {
                    switch(layoutDirection0) {
                        case 1: {
                            break;
                        }
                        case 2: {
                            return !z;
                        }
                        default: {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                }
                else {
                    if(!androidx.compose.ui.layout.BeyondBoundsLayout.LayoutDirection.equals-impl0(v, 4)) {
                        LazyLayoutBeyondBoundsModifierLocalKt.access$unsupportedDirection();
                        throw new KotlinNothingValueException();
                    }
                    switch(layoutDirection0) {
                        case 1: {
                            return !z;
                        }
                        case 2: {
                            break;
                        }
                        default: {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                }
            }
            return z;
        }
        return false;
    }

    @Override  // androidx.compose.ui.modifier.ModifierLocalProvider
    @NotNull
    public ProvidableModifierLocal getKey() {
        return BeyondBoundsLayoutKt.getModifierLocalBeyondBoundsLayout();
    }

    @NotNull
    public BeyondBoundsLayout getValue() [...] // Inlined contents

    @Override  // androidx.compose.ui.modifier.ModifierLocalProvider
    public Object getValue() {
        return this;
    }

    @Override  // androidx.compose.ui.layout.BeyondBoundsLayout
    @Nullable
    public Object layout-o7g1Pn8(int v, @NotNull Function1 function10) {
        LazyLayoutBeyondBoundsState lazyLayoutBeyondBoundsState0 = this.a;
        if(lazyLayoutBeyondBoundsState0.getItemCount() > 0 && lazyLayoutBeyondBoundsState0.getHasVisibleItems()) {
            int v1 = this.b(v) ? lazyLayoutBeyondBoundsState0.getLastPlacedIndex() : lazyLayoutBeyondBoundsState0.getFirstPlacedIndex();
            ObjectRef ref$ObjectRef0 = new ObjectRef();
            LazyLayoutBeyondBoundsInfo lazyLayoutBeyondBoundsInfo0 = this.b;
            ref$ObjectRef0.element = lazyLayoutBeyondBoundsInfo0.addInterval(v1, v1);
            Object object0;
            for(object0 = null; object0 == null && this.a(((Interval)ref$ObjectRef0.element), v); object0 = function10.invoke(() -> {
                boolean z;
                Orientation orientation0 = this.e;
                boolean z1 = false;
                if((androidx.compose.ui.layout.BeyondBoundsLayout.LayoutDirection.equals-impl0(v, 5) ? true : androidx.compose.ui.layout.BeyondBoundsLayout.LayoutDirection.equals-impl0(v, 6))) {
                    z1 = true;
                    if(orientation0 != Orientation.Horizontal) {
                        goto label_9;
                    }
                }
                else if((androidx.compose.ui.layout.BeyondBoundsLayout.LayoutDirection.equals-impl0(v, 3) ? true : androidx.compose.ui.layout.BeyondBoundsLayout.LayoutDirection.equals-impl0(v, 4))) {
                    z1 = true;
                    if(orientation0 != Orientation.Vertical) {
                        goto label_9;
                    }
                }
                boolean z2 = false;
                if(z1) {
                    z2 = true;
                    z = true;
                }
                else if((androidx.compose.ui.layout.BeyondBoundsLayout.LayoutDirection.equals-impl0(v, 1) ? true : androidx.compose.ui.layout.BeyondBoundsLayout.LayoutDirection.equals-impl0(v, 2))) {
                    z2 = true;
                label_9:
                    z = false;
                }
                if(z2) {
                    if(z) {
                        return false;
                    }
                    return this.b(v) ? ((Interval)this.b.element).getEnd() < this.a.getItemCount() - 1 : ((Interval)this.b.element).getStart() > 0;
                }
                LazyLayoutBeyondBoundsModifierLocalKt.access$unsupportedDirection();
                throw new KotlinNothingValueException();
            })) {
                Interval lazyLayoutBeyondBoundsInfo$Interval0 = (Interval)ref$ObjectRef0.element;
                int v2 = lazyLayoutBeyondBoundsInfo$Interval0.getStart();
                int v3 = lazyLayoutBeyondBoundsInfo$Interval0.getEnd();
                if(this.b(v)) {
                    ++v3;
                }
                else {
                    --v2;
                }
                Interval lazyLayoutBeyondBoundsInfo$Interval1 = lazyLayoutBeyondBoundsInfo0.addInterval(v2, v3);
                lazyLayoutBeyondBoundsInfo0.removeInterval(((Interval)ref$ObjectRef0.element));
                ref$ObjectRef0.element = lazyLayoutBeyondBoundsInfo$Interval1;
                lazyLayoutBeyondBoundsState0.remeasure();
            }
            lazyLayoutBeyondBoundsInfo0.removeInterval(((Interval)ref$ObjectRef0.element));
            lazyLayoutBeyondBoundsState0.remeasure();
            return object0;
        }
        return function10.invoke(LazyLayoutBeyondBoundsModifierLocal.f);

        @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001A\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"androidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsModifierLocal$layout$2", "Landroidx/compose/ui/layout/BeyondBoundsLayout$BeyondBoundsScope;", "hasMoreContent", "", "getHasMoreContent", "()Z", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
        public final class androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsModifierLocal.layout.2 implements BeyondBoundsScope {
            public final LazyLayoutBeyondBoundsModifierLocal a;
            public final ObjectRef b;
            public final int c;

            public androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsModifierLocal.layout.2(LazyLayoutBeyondBoundsModifierLocal lazyLayoutBeyondBoundsModifierLocal0, ObjectRef ref$ObjectRef0, int v) {
                this.a = lazyLayoutBeyondBoundsModifierLocal0;
                this.b = ref$ObjectRef0;
                this.c = v;
            }

            @Override  // androidx.compose.ui.layout.BeyondBoundsLayout$BeyondBoundsScope
            public boolean getHasMoreContent() {
                return this.a.a(((Interval)this.b.element), this.c);
            }
        }

    }
}

