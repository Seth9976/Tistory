package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Velocity;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001AB\u0010\f\u001A\u00020\u000B2\u0006\u0010\u0001\u001A\u00020\u00002\u0006\u0010\u0003\u001A\u00020\u00022!\u0010\n\u001A\u001D\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0004H\u0000¢\u0006\u0004\b\f\u0010\r\u001AC\u0010\u0014\u001A\u00020\u00002\b\b\u0002\u0010\u000F\u001A\u00020\u000E2\u0014\b\u0002\u0010\u0011\u001A\u000E\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u000E0\u00042\b\b\u0002\u0010\u0012\u001A\u00020\u00102\b\b\u0002\u0010\u0013\u001A\u00020\u000EH\u0001¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Landroidx/compose/material3/SheetState;", "sheetState", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "velocity", "", "onFling", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection", "(Landroidx/compose/material3/SheetState;Landroidx/compose/foundation/gestures/Orientation;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "", "skipPartiallyExpanded", "Landroidx/compose/material3/SheetValue;", "confirmValueChange", "initialValue", "skipHiddenState", "rememberSheetState", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/material3/SheetValue;ZLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/SheetState;", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSheetDefaults.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SheetDefaults.kt\nandroidx/compose/material3/SheetDefaultsKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,436:1\n77#2:437\n1223#3,6:438\n148#4:444\n*S KotlinDebug\n*F\n+ 1 SheetDefaults.kt\nandroidx/compose/material3/SheetDefaultsKt\n*L\n409#1:437\n421#1:438,6\n432#1:444\n*E\n"})
public final class SheetDefaultsKt {
    public static final float a;
    public static final TweenSpec b;

    static {
        SheetDefaultsKt.a = 22.0f;
        SheetDefaultsKt.b = AnimationSpecKt.tween$default(300, 0, EasingKt.getFastOutSlowInEasing(), 2, null);
    }

    @NotNull
    public static final NestedScrollConnection ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection(@NotNull SheetState sheetState0, @NotNull Orientation orientation0, @NotNull Function1 function10) {
        return new NestedScrollConnection() {
            public final SheetState a;
            public final Function1 b;
            public final Orientation c;

            {
                SheetState sheetState0 = sheetState0;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                Orientation orientation0 = orientation0;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                Function1 function10 = function10;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                this.a = sheetState0;
                this.b = function10;
                this.c = orientation0;
            }

            @Override  // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
            @Nullable
            public Object onPostFling-RZ2iAVY(long v, long v1, @NotNull Continuation continuation0) {
                this.b.invoke(Boxing.boxFloat((this.c == Orientation.Horizontal ? Velocity.getX-impl(v1) : Velocity.getY-impl(v1))));
                return Velocity.box-impl(v1);
            }

            @Override  // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
            public long onPostScroll-DzOQY0M(long v, long v1, int v2) {
                if(NestedScrollSource.equals-impl0(v2, 1)) {
                    float f = this.a.getAnchoredDraggableState$material3_release().dispatchRawDelta((this.c == Orientation.Horizontal ? Offset.getX-impl(v1) : Offset.getY-impl(v1)));
                    float f1 = this.c == Orientation.Horizontal ? f : 0.0f;
                    if(this.c != Orientation.Vertical) {
                        f = 0.0f;
                    }
                    return OffsetKt.Offset(f1, f);
                }
                return 0L;
            }

            @Override  // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
            @Nullable
            public Object onPreFling-QWom1Mo(long v, @NotNull Continuation continuation0) {
                float f = this.c == Orientation.Horizontal ? Velocity.getX-impl(v) : Velocity.getY-impl(v);
                if(f < 0.0f && this.a.requireOffset() > this.a.getAnchoredDraggableState$material3_release().getAnchors().minAnchor()) {
                    this.b.invoke(Boxing.boxFloat(f));
                    return Velocity.box-impl(v);
                }
                return Velocity.box-impl(0L);
            }

            @Override  // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
            public long onPreScroll-OzD1aCk(long v, int v1) {
                Orientation orientation0 = Orientation.Horizontal;
                Orientation orientation1 = this.c;
                float f = orientation1 == orientation0 ? Offset.getX-impl(v) : Offset.getY-impl(v);
                float f1 = 0.0f;
                if(f < 0.0f && NestedScrollSource.equals-impl0(v1, 1)) {
                    float f2 = this.a.getAnchoredDraggableState$material3_release().dispatchRawDelta(f);
                    if(orientation1 == Orientation.Vertical) {
                        f1 = f2;
                    }
                    return OffsetKt.Offset((orientation1 == orientation0 ? f2 : 0.0f), f1);
                }
                return 0L;
            }
        };
    }

    public static final float access$getDragHandleVerticalPadding$p() [...] // 潜在的解密器

    @ExperimentalMaterial3Api
    @Composable
    @NotNull
    public static final SheetState rememberSheetState(boolean z, @Nullable Function1 function10, @Nullable SheetValue sheetValue0, boolean z1, @Nullable Composer composer0, int v, int v1) {
        int v2 = 0;
        boolean z2 = (v1 & 1) == 0 ? z : false;
        Function1 function11 = (v1 & 2) == 0 ? function10 : fk.w;
        SheetValue sheetValue1 = (v1 & 4) == 0 ? sheetValue0 : SheetValue.Hidden;
        boolean z3 = (v1 & 8) == 0 ? z1 : false;
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1032784200, v, -1, "androidx.compose.material3.rememberSheetState (SheetDefaults.kt:407)");
        }
        Object object0 = composer0.consume(CompositionLocalsKt.getLocalDensity());
        Object[] arr_object = {Boolean.valueOf(z2), function11, Boolean.valueOf(z3)};
        Saver saver0 = SheetState.Companion.Saver(z2, function11, ((Density)object0), z3);
        boolean z4 = (v & 14 ^ 6) > 4 && composer0.changed(z2) || (v & 6) == 4;
        boolean z5 = composer0.changed(((Density)object0));
        int v3 = ((v & 0x380 ^ 0x180) <= 0x100 || !composer0.changed(sheetValue1)) && (v & 0x180) != 0x100 ? 0 : 1;
        int v4 = ((v & 0x70 ^ 0x30) <= 0x20 || !composer0.changed(function11)) && (v & 0x30) != 0x20 ? 0 : 1;
        if((v & 0x1C00 ^ 0xC00) > 0x800 && composer0.changed(z3) || (v & 0xC00) == 0x800) {
            v2 = 1;
        }
        gk gk0 = composer0.rememberedValue();
        if((z4 | z5 | v3 | v4 | v2) != 0 || gk0 == Composer.Companion.getEmpty()) {
            gk0 = new gk(z2, ((Density)object0), sheetValue1, function11, z3);
            composer0.updateRememberedValue(gk0);
        }
        SheetState sheetState0 = (SheetState)RememberSaveableKt.rememberSaveable(arr_object, saver0, null, gk0, composer0, 0, 4);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return sheetState0;
    }
}

