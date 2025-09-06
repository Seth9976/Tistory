package com.kakao.kandinsky.designsystem.common;

import androidx.activity.c0;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer.Companion;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.platform.h;
import androidx.compose.ui.platform.i;
import ca.n0;
import ca.o0;
import ca.p0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001A#\u0010\u0003\u001A\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007\u00A2\u0006\u0004\b\u0003\u0010\u0004\u001A5\u0010\u0003\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00010\u0006\"\u0004\b\u0000\u0010\u00052\u0012\u0010\u0002\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00010\u0006H\u0007\u00A2\u0006\u0004\b\u0003\u0010\u0007\u001AG\u0010\u0003\u001A\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00010\n\"\u0004\b\u0000\u0010\b\"\u0004\b\u0001\u0010\t2\u0018\u0010\u0002\u001A\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00010\nH\u0007\u00A2\u0006\u0004\b\u0003\u0010\u000B\u001A)\u0010\r\u001A\b\u0012\u0004\u0012\u00028\u00000\u0000\"\u0004\b\u0000\u0010\f2\f\u0010\u0002\u001A\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0007\u00A2\u0006\u0004\b\r\u0010\u0004\u001A;\u0010\r\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\"\u0004\b\u0000\u0010\u0005\"\u0004\b\u0001\u0010\f2\u0012\u0010\u0002\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006H\u0007\u00A2\u0006\u0004\b\r\u0010\u0007\u001AM\u0010\r\u001A\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\n\"\u0004\b\u0000\u0010\b\"\u0004\b\u0001\u0010\t\"\u0004\b\u0002\u0010\f2\u0018\u0010\u0002\u001A\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\nH\u0007\u00A2\u0006\u0004\b\r\u0010\u000B\u00A8\u0006\u0012\u00B2\u0006\u0012\u0010\u000F\u001A\b\u0012\u0004\u0012\u00020\u00010\u000E8\nX\u008A\u0084\u0002\u00B2\u0006\u001E\u0010\u000F\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00010\u0010\"\u0004\b\u0000\u0010\u00058\nX\u008A\u0084\u0002\u00B2\u0006*\u0010\u000F\u001A\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00010\u0011\"\u0004\b\u0000\u0010\b\"\u0004\b\u0001\u0010\t8\nX\u008A\u0084\u0002\u00B2\u0006\u0018\u0010\u000F\u001A\b\u0012\u0004\u0012\u00028\u00000\u000E\"\u0004\b\u0000\u0010\f8\nX\u008A\u0084\u0002\u00B2\u0006$\u0010\u000F\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0010\"\u0004\b\u0000\u0010\u0005\"\u0004\b\u0001\u0010\f8\nX\u008A\u0084\u0002\u00B2\u00060\u0010\u000F\u001A\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0011\"\u0004\b\u0000\u0010\b\"\u0004\b\u0001\u0010\t\"\u0004\b\u0002\u0010\f8\nX\u008A\u0084\u0002"}, d2 = {"Lkotlin/Function0;", "", "newValue", "skippableLambda", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)Lkotlin/jvm/functions/Function0;", "P", "Lkotlin/Function1;", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Lkotlin/jvm/functions/Function1;", "P1", "P2", "Lkotlin/Function2;", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)Lkotlin/jvm/functions/Function2;", "R", "skippableReturnLambda", "Lca/p0;", "event", "Lca/n0;", "Lca/o0;", "designsystem_release"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nFunctionState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FunctionState.kt\ncom/kakao/kandinsky/designsystem/common/FunctionStateKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,81:1\n1223#2,6:82\n1223#2,6:88\n1223#2,6:94\n1223#2,6:100\n1223#2,6:106\n1223#2,6:112\n1223#2,6:118\n1223#2,6:124\n1223#2,6:130\n1223#2,6:136\n1223#2,6:142\n1223#2,6:148\n81#3:154\n81#3:155\n81#3:156\n81#3:157\n81#3:158\n81#3:159\n*S KotlinDebug\n*F\n+ 1 FunctionState.kt\ncom/kakao/kandinsky/designsystem/common/FunctionStateKt\n*L\n34#1:82,6\n37#1:88,6\n42#1:94,6\n45#1:100,6\n51#1:106,6\n54#1:112,6\n59#1:118,6\n62#1:124,6\n67#1:130,6\n70#1:136,6\n76#1:142,6\n79#1:148,6\n34#1:154\n42#1:155\n51#1:156\n59#1:157\n67#1:158\n76#1:159\n*E\n"})
public final class FunctionStateKt {
    @Composable
    @NotNull
    public static final Function0 skippableLambda(@NotNull Function0 function00, @Nullable Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(function00, "newValue");
        composer0.startReplaceGroup(0xB2DC8269);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xB2DC8269, v, -1, "com.kakao.kandinsky.designsystem.common.skippableLambda (FunctionState.kt:32)");
        }
        composer0.startReplaceGroup(-2007345089);
        MutableState mutableState0 = composer0.rememberedValue();
        Companion composer$Companion0 = Composer.Companion;
        if(mutableState0 == composer$Companion0.getEmpty()) {
            mutableState0 = SnapshotStateKt.mutableStateOf$default(new p0(function00), null, 2, null);
            composer0.updateRememberedValue(mutableState0);
        }
        composer0.endReplaceGroup();
        p0 p00 = (p0)mutableState0.getValue();
        p00.getClass();
        Intrinsics.checkNotNullParameter(function00, "onClick");
        p00.a = function00;
        Object object0 = mutableState0.getValue();
        composer0.startReplaceGroup(-2007344980);
        boolean z = composer0.changed(((p0)object0));
        c0 c00 = composer0.rememberedValue();
        if(z || c00 == composer$Companion0.getEmpty()) {
            c00 = new c0(0, ((p0)object0), p0.class, "invoke", "invoke()Ljava/lang/Object;", 0, 7);
            composer0.updateRememberedValue(c00);
        }
        composer0.endReplaceGroup();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceGroup();
        return c00;
    }

    @Composable
    @NotNull
    public static final Function1 skippableLambda(@NotNull Function1 function10, @Nullable Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(function10, "newValue");
        composer0.startReplaceGroup(0x8F6C7CAB);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x8F6C7CAB, v, -1, "com.kakao.kandinsky.designsystem.common.skippableLambda (FunctionState.kt:40)");
        }
        composer0.startReplaceGroup(-2007344872);
        MutableState mutableState0 = composer0.rememberedValue();
        Companion composer$Companion0 = Composer.Companion;
        if(mutableState0 == composer$Companion0.getEmpty()) {
            mutableState0 = SnapshotStateKt.mutableStateOf$default(new n0(function10), null, 2, null);
            composer0.updateRememberedValue(mutableState0);
        }
        composer0.endReplaceGroup();
        n0 n00 = (n0)mutableState0.getValue();
        n00.getClass();
        Intrinsics.checkNotNullParameter(function10, "onClick");
        n00.a = function10;
        Object object0 = mutableState0.getValue();
        composer0.startReplaceGroup(-2007344762);
        boolean z = composer0.changed(((n0)object0));
        h h0 = composer0.rememberedValue();
        if(z || h0 == composer$Companion0.getEmpty()) {
            h0 = new h(1, ((n0)object0), n0.class, "invoke", "invoke(Ljava/lang/Object;)Ljava/lang/Object;", 0, 2);
            composer0.updateRememberedValue(h0);
        }
        composer0.endReplaceGroup();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceGroup();
        return h0;
    }

    @Composable
    @NotNull
    public static final Function2 skippableLambda(@NotNull Function2 function20, @Nullable Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(function20, "newValue");
        composer0.startReplaceGroup(0x6BFC76ED);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x6BFC76ED, v, -1, "com.kakao.kandinsky.designsystem.common.skippableLambda (FunctionState.kt:49)");
        }
        composer0.startReplaceGroup(-2007344638);
        MutableState mutableState0 = composer0.rememberedValue();
        Companion composer$Companion0 = Composer.Companion;
        if(mutableState0 == composer$Companion0.getEmpty()) {
            mutableState0 = SnapshotStateKt.mutableStateOf$default(new o0(function20), null, 2, null);
            composer0.updateRememberedValue(mutableState0);
        }
        composer0.endReplaceGroup();
        o0 o00 = (o0)mutableState0.getValue();
        o00.getClass();
        Intrinsics.checkNotNullParameter(function20, "onClick");
        o00.a = function20;
        Object object0 = mutableState0.getValue();
        composer0.startReplaceGroup(-2007344528);
        boolean z = composer0.changed(((o0)object0));
        i i0 = composer0.rememberedValue();
        if(z || i0 == composer$Companion0.getEmpty()) {
            i0 = new i(2, ((o0)object0), o0.class, "invoke", "invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0, 1);
            composer0.updateRememberedValue(i0);
        }
        composer0.endReplaceGroup();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceGroup();
        return i0;
    }

    @Composable
    @NotNull
    public static final Function0 skippableReturnLambda(@NotNull Function0 function00, @Nullable Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(function00, "newValue");
        composer0.startReplaceGroup(0x857F59F9);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x857F59F9, v, -1, "com.kakao.kandinsky.designsystem.common.skippableReturnLambda (FunctionState.kt:57)");
        }
        composer0.startReplaceGroup(-247273014);
        MutableState mutableState0 = composer0.rememberedValue();
        Companion composer$Companion0 = Composer.Companion;
        if(mutableState0 == composer$Companion0.getEmpty()) {
            mutableState0 = SnapshotStateKt.mutableStateOf$default(new p0(function00), null, 2, null);
            composer0.updateRememberedValue(mutableState0);
        }
        composer0.endReplaceGroup();
        p0 p00 = (p0)mutableState0.getValue();
        p00.getClass();
        Intrinsics.checkNotNullParameter(function00, "onClick");
        p00.a = function00;
        Object object0 = mutableState0.getValue();
        composer0.startReplaceGroup(-247272905);
        boolean z = composer0.changed(((p0)object0));
        c0 c00 = composer0.rememberedValue();
        if(z || c00 == composer$Companion0.getEmpty()) {
            c00 = new c0(0, ((p0)object0), p0.class, "invoke", "invoke()Ljava/lang/Object;", 0, 8);
            composer0.updateRememberedValue(c00);
        }
        composer0.endReplaceGroup();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceGroup();
        return c00;
    }

    @Composable
    @NotNull
    public static final Function1 skippableReturnLambda(@NotNull Function1 function10, @Nullable Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(function10, "newValue");
        composer0.startReplaceGroup(0x620F543B);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x620F543B, v, -1, "com.kakao.kandinsky.designsystem.common.skippableReturnLambda (FunctionState.kt:65)");
        }
        composer0.startReplaceGroup(0xF142EAA6);
        MutableState mutableState0 = composer0.rememberedValue();
        Companion composer$Companion0 = Composer.Companion;
        if(mutableState0 == composer$Companion0.getEmpty()) {
            mutableState0 = SnapshotStateKt.mutableStateOf$default(new n0(function10), null, 2, null);
            composer0.updateRememberedValue(mutableState0);
        }
        composer0.endReplaceGroup();
        n0 n00 = (n0)mutableState0.getValue();
        n00.getClass();
        Intrinsics.checkNotNullParameter(function10, "onClick");
        n00.a = function10;
        Object object0 = mutableState0.getValue();
        composer0.startReplaceGroup(0xF142EB14);
        boolean z = composer0.changed(((n0)object0));
        h h0 = composer0.rememberedValue();
        if(z || h0 == composer$Companion0.getEmpty()) {
            h0 = new h(1, ((n0)object0), n0.class, "invoke", "invoke(Ljava/lang/Object;)Ljava/lang/Object;", 0, 3);
            composer0.updateRememberedValue(h0);
        }
        composer0.endReplaceGroup();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceGroup();
        return h0;
    }

    @Composable
    @NotNull
    public static final Function2 skippableReturnLambda(@NotNull Function2 function20, @Nullable Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(function20, "newValue");
        composer0.startReplaceGroup(1050627709);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1050627709, v, -1, "com.kakao.kandinsky.designsystem.common.skippableReturnLambda (FunctionState.kt:74)");
        }
        composer0.startReplaceGroup(0xF142EB93);
        MutableState mutableState0 = composer0.rememberedValue();
        Companion composer$Companion0 = Composer.Companion;
        if(mutableState0 == composer$Companion0.getEmpty()) {
            mutableState0 = SnapshotStateKt.mutableStateOf$default(new o0(function20), null, 2, null);
            composer0.updateRememberedValue(mutableState0);
        }
        composer0.endReplaceGroup();
        o0 o00 = (o0)mutableState0.getValue();
        o00.getClass();
        Intrinsics.checkNotNullParameter(function20, "onClick");
        o00.a = function20;
        Object object0 = mutableState0.getValue();
        composer0.startReplaceGroup(0xF142EC01);
        boolean z = composer0.changed(((o0)object0));
        i i0 = composer0.rememberedValue();
        if(z || i0 == composer$Companion0.getEmpty()) {
            i0 = new i(2, ((o0)object0), o0.class, "invoke", "invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0, 2);
            composer0.updateRememberedValue(i0);
        }
        composer0.endReplaceGroup();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceGroup();
        return i0;
    }
}

