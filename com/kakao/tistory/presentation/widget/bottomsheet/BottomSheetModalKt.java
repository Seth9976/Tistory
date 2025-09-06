package com.kakao.tistory.presentation.widget.bottomsheet;

import android.view.Window;
import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.ExperimentalMaterialApi;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.SwipeableKt;
import androidx.compose.material.SwipeableState;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier.Companion;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.R.string;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Velocity;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u001AT\u0010\f\u001A\u00020\b2\n\b\u0002\u0010\u0001\u001A\u0004\u0018\u00010\u00002\u000E\b\u0002\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001A\u00020\u00052\f\u0010\t\u001A\b\u0012\u0004\u0012\u00020\b0\u00072\u0011\u0010\u000B\u001A\r\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\nH\u0007¢\u0006\u0004\b\f\u0010\r\"*\u0010\u0014\u001A\u00020\u000F\"\u0004\b\u0000\u0010\u000E*\b\u0012\u0004\u0012\u00028\u00000\u00028@X\u0081\u0004¢\u0006\f\u0012\u0004\b\u0012\u0010\u0013\u001A\u0004\b\u0010\u0010\u0011¨\u0006\u0019²\u0006\f\u0010\u0016\u001A\u00020\u00158\nX\u008A\u0084\u0002²\u0006\f\u0010\u0018\u001A\u00020\u00178\nX\u008A\u0084\u0002"}, d2 = {"Landroid/view/Window;", "window", "Landroidx/compose/material/SwipeableState;", "Lcom/kakao/tistory/presentation/widget/bottomsheet/BottomSheetValue;", "state", "", "topPadding", "Lkotlin/Function0;", "", "onDismiss", "Landroidx/compose/runtime/Composable;", "sheetContent", "BottomSheetModal", "(Landroid/view/Window;Landroidx/compose/material/SwipeableState;ILkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "T", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "getPreUpPostDownNestedScrollConnection", "(Landroidx/compose/material/SwipeableState;)Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "getPreUpPostDownNestedScrollConnection$annotations", "(Landroidx/compose/material/SwipeableState;)V", "PreUpPostDownNestedScrollConnection", "Landroidx/compose/ui/graphics/Color;", "statusBarColor", "", "alpha", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nBottomSheetModal.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BottomSheetModal.kt\ncom/kakao/tistory/presentation/widget/bottomsheet/BottomSheetModalKt\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,191:1\n696#2:192\n1223#3,6:193\n1223#3,6:199\n1223#3,6:205\n81#4:211\n81#4:212\n*S KotlinDebug\n*F\n+ 1 BottomSheetModal.kt\ncom/kakao/tistory/presentation/widget/bottomsheet/BottomSheetModalKt\n*L\n165#1:192\n173#1:193,6\n174#1:199,6\n186#1:205,6\n158#1:211\n166#1:212\n*E\n"})
public final class BottomSheetModalKt {
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void BottomSheetModal(@Nullable Window window0, @Nullable SwipeableState swipeableState0, int v, @NotNull Function0 function00, @NotNull Function2 function20, @Nullable Composer composer0, int v1, int v2) {
        SwipeableState swipeableState2;
        Window window1;
        int v4;
        SwipeableState swipeableState1;
        Intrinsics.checkNotNullParameter(function00, "onDismiss");
        Intrinsics.checkNotNullParameter(function20, "sheetContent");
        Composer composer1 = composer0.startRestartGroup(0xAEF256DA);
        int v3 = (v2 & 1) == 0 ? v1 : v1 | 2;
        if((v1 & 0x70) == 0) {
            if((v2 & 2) == 0) {
                swipeableState1 = swipeableState0;
                v4 = composer1.changed(swipeableState1) ? 0x20 : 16;
            }
            else {
                swipeableState1 = swipeableState0;
                v4 = 16;
            }
            v3 |= v4;
        }
        else {
            swipeableState1 = swipeableState0;
        }
        if((v2 & 4) != 0) {
            v3 |= 0x180;
        }
        else if((v1 & 0x380) == 0) {
            v3 |= (composer1.changed(v) ? 0x100 : 0x80);
        }
        if((v2 & 8) != 0) {
            v3 |= 0xC00;
        }
        else if((v1 & 0x1C00) == 0) {
            v3 |= (composer1.changedInstance(function00) ? 0x800 : 0x400);
        }
        if((v2 & 16) != 0) {
            v3 |= 0x6000;
        }
        else if((0xE000 & v1) == 0) {
            v3 |= (composer1.changedInstance(function20) ? 0x4000 : 0x2000);
        }
        if((v2 & 1) != 1 || (0xB6DB & v3) != 9362 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v1 & 1) == 0 || composer1.getDefaultsInvalid()) {
                if((v2 & 2) != 0) {
                    swipeableState1 = SwipeableKt.rememberSwipeableState(BottomSheetValue.Closed, null, null, composer1, 6, 6);
                    v3 &= 0xFFFFFF8F;
                }
                window1 = (v2 & 1) == 0 ? window0 : null;
            }
            else {
                composer1.skipToGroupEnd();
                if((v2 & 2) != 0) {
                    v3 &= 0xFFFFFF8F;
                }
                window1 = window0;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xAEF256DA, v3, -1, "com.kakao.tistory.presentation.widget.bottomsheet.BottomSheetModal (BottomSheetModal.kt:50)");
            }
            BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), null, false, ComposableLambdaKt.rememberComposableLambda(-1320949948, true, new f(v, swipeableState1, function00, window1, function20), composer1, 54), composer1, 0xC06, 6);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
            window1 = window0;
        }
        swipeableState2 = swipeableState1;
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new g(window1, swipeableState2, v, function00, function20, v1, v2));
        }
    }

    public static final void access$Scrim-sW7UJKQ(Window window0, long v, Function0 function00, boolean z, Composer composer0, int v1, int v2) {
        Window window1;
        Modifier modifier1;
        boolean z2;
        long v4;
        Composer composer1 = composer0.startRestartGroup(960180294);
        int v3 = (v2 & 1) == 0 ? v1 : v1 | 2;
        if((v2 & 2) != 0) {
            v3 |= 0x30;
        }
        else if((v1 & 0x70) == 0) {
            v3 |= (composer1.changed(v) ? 0x20 : 16);
        }
        if((v2 & 4) != 0) {
            v3 |= 0x180;
        }
        else if((v1 & 0x380) == 0) {
            v3 |= (composer1.changedInstance(function00) ? 0x100 : 0x80);
        }
        if((v2 & 8) != 0) {
            v3 |= 0xC00;
        }
        else if((v1 & 0x1C00) == 0) {
            v3 |= (composer1.changed(z) ? 0x800 : 0x400);
        }
        if((v2 & 1) != 1 || (v3 & 5851) != 1170 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(960180294, v3, -1, "com.kakao.tistory.presentation.widget.bottomsheet.Scrim (BottomSheetModal.kt:156)");
            }
            if(z) {
                composer1.startReplaceGroup(0x7FC766A3);
                v4 = Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer1, MaterialTheme.$stable).getOnSurface-0d7_KjU(), 0.32f, 0.0f, 0.0f, 0.0f, 14, null);
            }
            else {
                composer1.startReplaceGroup(0x7FC76EA0);
                v4 = Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer1, MaterialTheme.$stable).getOnSurface-0d7_KjU(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null);
            }
            composer1.endReplaceGroup();
            window1 = (v2 & 1) == 0 ? window0 : null;
            State state0 = SingleValueAnimationKt.animateColorAsState-euL9pac(v4, new TweenSpec(0, 0, null, 7, null), null, null, composer1, 0x30, 12);
            if(window1 != null) {
                window1.setStatusBarColor(ColorKt.toArgb-8_81llA(((Color)state0.getValue()).unbox-impl()));
            }
            if(v != 16L) {
                State state1 = AnimateAsStateKt.animateFloatAsState((z ? 1.0f : 0.0f), new TweenSpec(0, 0, null, 7, null), 0.0f, null, null, composer1, 0x30, 28);
                String s = StringResources_androidKt.stringResource(string.close_sheet, composer1, 0);
                composer1.startReplaceGroup(0x7FC7A0A0);
                if(z) {
                    Companion modifier$Companion0 = Modifier.Companion;
                    composer1.startReplaceGroup(0x7FC7A915);
                    m m0 = composer1.rememberedValue();
                    if((v3 & 0x380) == 0x100 || m0 == Composer.Companion.getEmpty()) {
                        m0 = new m(function00, null);
                        composer1.updateRememberedValue(m0);
                    }
                    composer1.endReplaceGroup();
                    Modifier modifier0 = SuspendingPointerInputFilterKt.pointerInput(modifier$Companion0, function00, m0);
                    composer1.startReplaceGroup(0x7FC7B4A9);
                    boolean z1 = composer1.changed(s);
                    o o0 = composer1.rememberedValue();
                    if((v3 & 0x380) == 0x100 || z1 || o0 == Composer.Companion.getEmpty()) {
                        o0 = new o(s, function00);
                        composer1.updateRememberedValue(o0);
                    }
                    composer1.endReplaceGroup();
                    z2 = true;
                    modifier1 = SemanticsModifierKt.semantics(modifier0, true, o0);
                }
                else {
                    z2 = true;
                    modifier1 = Modifier.Companion;
                }
                composer1.endReplaceGroup();
                Modifier modifier2 = SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null).then(modifier1);
                composer1.startReplaceGroup(0x7FC7D86E);
                if((v3 & 0x70) != 0x20) {
                    z2 = false;
                }
                boolean z3 = composer1.changed(state1);
                j j0 = composer1.rememberedValue();
                if(z3 || z2 || j0 == Composer.Companion.getEmpty()) {
                    j0 = new j(v, state1);
                    composer1.updateRememberedValue(j0);
                }
                composer1.endReplaceGroup();
                CanvasKt.Canvas(modifier2, j0, composer1, 0);
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
            window1 = window0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new k(window1, v, function00, z, v1, v2));
        }
    }

    public static final float access$Scrim_sW7UJKQ$lambda$1(State state0) {
        return ((Number)state0.getValue()).floatValue();
    }

    @NotNull
    public static final NestedScrollConnection getPreUpPostDownNestedScrollConnection(@NotNull SwipeableState swipeableState0) {
        Intrinsics.checkNotNullParameter(swipeableState0, "<this>");
        return new NestedScrollConnection() {
            @Override  // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
            @Nullable
            public Object onPostFling-RZ2iAVY(long v, long v1, @NotNull Continuation continuation0) {
                h h0;
                if(continuation0 instanceof h) {
                    h0 = (h)continuation0;
                    int v2 = h0.d;
                    if((v2 & 0x80000000) == 0) {
                        h0 = new h(this, continuation0);
                    }
                    else {
                        h0.d = v2 ^ 0x80000000;
                    }
                }
                else {
                    h0 = new h(this, continuation0);
                }
                Object object0 = h0.b;
                Object object1 = a.getCOROUTINE_SUSPENDED();
                switch(h0.d) {
                    case 0: {
                        ResultKt.throwOnFailure(object0);
                        h0.a = v1;
                        h0.d = 1;
                        return swipeableState0.performFling(Offset.getY-impl(OffsetKt.Offset(Velocity.getX-impl(v1), Velocity.getY-impl(v1))), h0) == object1 ? object1 : Velocity.box-impl(v1);
                    }
                    case 1: {
                        v1 = h0.a;
                        ResultKt.throwOnFailure(object0);
                        return Velocity.box-impl(v1);
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }

            // 去混淆评级： 中等(60)
            @Override  // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
            public long onPostScroll-DzOQY0M(long v, long v1, int v2) {
                return NestedScrollSource.equals-impl0(v2, 1) ? OffsetKt.Offset(0.0f, swipeableState0.performDrag(Offset.getY-impl(v1))) : 0L;
            }

            @Override  // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
            @Nullable
            public Object onPreFling-QWom1Mo(long v, @NotNull Continuation continuation0) {
                i i0;
                if(continuation0 instanceof i) {
                    i0 = (i)continuation0;
                    int v1 = i0.d;
                    if((v1 & 0x80000000) == 0) {
                        i0 = new i(this, continuation0);
                    }
                    else {
                        i0.d = v1 ^ 0x80000000;
                    }
                }
                else {
                    i0 = new i(this, continuation0);
                }
                Object object0 = i0.b;
                Object object1 = a.getCOROUTINE_SUSPENDED();
                switch(i0.d) {
                    case 0: {
                        ResultKt.throwOnFailure(object0);
                        float f = Offset.getY-impl(OffsetKt.Offset(Velocity.getX-impl(v), Velocity.getY-impl(v)));
                        if(f >= 0.0f || ((Number)swipeableState0.getOffset().getValue()).floatValue() <= -2147483648.0f) {
                            v = 0L;
                        }
                        else {
                            i0.a = v;
                            i0.d = 1;
                            if(swipeableState0.performFling(f, i0) == object1) {
                                return object1;
                            }
                        }
                        return Velocity.box-impl(v);
                    }
                    case 1: {
                        v = i0.a;
                        ResultKt.throwOnFailure(object0);
                        return Velocity.box-impl(v);
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }

            // 去混淆评级： 低(25)
            @Override  // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
            public long onPreScroll-OzD1aCk(long v, int v1) {
                float f = Offset.getY-impl(v);
                return f >= 0.0f || !NestedScrollSource.equals-impl0(v1, 1) ? 0L : OffsetKt.Offset(0.0f, swipeableState0.performDrag(f));
            }
        };
    }

    @ExperimentalMaterialApi
    public static void getPreUpPostDownNestedScrollConnection$annotations(SwipeableState swipeableState0) {
    }
}

