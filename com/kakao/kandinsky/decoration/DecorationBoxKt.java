package com.kakao.kandinsky.decoration;

import aa.a0;
import aa.b0;
import aa.d0;
import aa.j;
import aa.k;
import aa.l;
import aa.m;
import aa.n;
import aa.p;
import aa.q;
import aa.s;
import aa.y;
import aa.z;
import android.graphics.Matrix;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer.Companion;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import com.kakao.kandinsky.designsystem.common.FunctionStateKt;
import com.kakao.kandinsky.designsystem.common.ModifierKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000X\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0002\u001A\u007F\u0010\u0000\u001A\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u0002H\u00022\u0006\u0010\u0006\u001A\u00020\u00072\b\b\u0002\u0010\b\u001A\u00020\t2\b\b\u0002\u0010\n\u001A\u00020\u000B2\u0006\u0010\f\u001A\u00020\u000B2\f\u0010\r\u001A\b\u0012\u0004\u0012\u0002H\u00020\u000E2#\u0010\u000F\u001A\u001F\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00010\u0010¢\u0006\u0002\b\u0013H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001As\u0010\u0016\u001A\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u0002H\u00022\u0006\u0010\u0006\u001A\u00020\u00072\b\b\u0002\u0010\b\u001A\u00020\t2\b\b\u0002\u0010\n\u001A\u00020\u000B2\u0006\u0010\f\u001A\u00020\u000B2\f\u0010\r\u001A\b\u0012\u0004\u0012\u0002H\u00020\u000E2\u0017\u0010\u000F\u001A\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0017¢\u0006\u0002\b\u0013H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u001A²\u0006\u0010\u0010\u001B\u001A\u00020\u001C\"\u0004\b\u0000\u0010\u0002X\u008A\u008E\u0002²\u0006\u0010\u0010\u001D\u001A\u00020\u001C\"\u0004\b\u0000\u0010\u0002X\u008A\u008E\u0002²\u0006\u0010\u0010\u001E\u001A\u00020\u001F\"\u0004\b\u0000\u0010\u0002X\u008A\u0084\u0002²\u0006\u0010\u0010 \u001A\u00020\u001F\"\u0004\b\u0000\u0010\u0002X\u008A\u0084\u0002²\u0006\u0010\u0010!\u001A\u00020\u0012\"\u0004\b\u0000\u0010\u0002X\u008A\u0084\u0002²\u0006\u0010\u0010\u0005\u001A\u0002H\u0002\"\u0004\b\u0000\u0010\u0002X\u008A\u0084\u0002"}, d2 = {"BasicDecorationBox", "", "T", "status", "Lcom/kakao/kandinsky/decoration/DecorationStatus;", "decoration", "size", "Landroidx/compose/ui/geometry/Size;", "displayRect", "Landroidx/compose/ui/geometry/Rect;", "displayInvertMatrix", "Landroid/graphics/Matrix;", "decorationMatrix", "decorationController", "Lcom/kakao/kandinsky/decoration/DecorationControllerInterface;", "content", "Lkotlin/Function3;", "Landroidx/compose/ui/Modifier;", "Lcom/kakao/kandinsky/decoration/DecorationRect;", "Landroidx/compose/runtime/Composable;", "BasicDecorationBox-vzil-yM", "(Lcom/kakao/kandinsky/decoration/DecorationStatus;Ljava/lang/Object;JLandroidx/compose/ui/geometry/Rect;Landroid/graphics/Matrix;Landroid/graphics/Matrix;Lcom/kakao/kandinsky/decoration/DecorationControllerInterface;Lkotlin/jvm/functions/Function5;Landroidx/compose/runtime/Composer;II)V", "DecorationBox", "Lkotlin/Function1;", "DecorationBox-vzil-yM", "(Lcom/kakao/kandinsky/decoration/DecorationStatus;Ljava/lang/Object;JLandroidx/compose/ui/geometry/Rect;Landroid/graphics/Matrix;Landroid/graphics/Matrix;Lcom/kakao/kandinsky/decoration/DecorationControllerInterface;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "decoration_release", "transitionOffset", "Landroidx/compose/ui/geometry/Offset;", "scaleAndRotateOffset", "isDragging", "", "isInDisplayRect", "decorationRect"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nDecorationBox.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DecorationBox.kt\ncom/kakao/kandinsky/decoration/DecorationBoxKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,169:1\n1223#2,6:170\n1223#2,6:176\n1223#2,6:182\n1223#2,6:188\n1223#2,6:194\n1223#2,6:200\n1223#2,6:206\n1223#2,6:212\n1223#2,6:218\n1223#2,6:224\n1223#2,6:230\n81#3:236\n107#3,2:237\n81#3:239\n107#3,2:240\n81#3:242\n81#3:243\n81#3:244\n81#3:245\n*S KotlinDebug\n*F\n+ 1 DecorationBox.kt\ncom/kakao/kandinsky/decoration/DecorationBoxKt\n*L\n73#1:170,6\n74#1:176,6\n78#1:182,6\n79#1:188,6\n102#1:194,6\n111#1:200,6\n146#1:206,6\n147#1:212,6\n151#1:218,6\n152#1:224,6\n165#1:230,6\n73#1:236\n73#1:237,2\n74#1:239\n74#1:240,2\n78#1:242\n79#1:243\n102#1:244\n108#1:245\n*E\n"})
public final class DecorationBoxKt {
    @Composable
    public static final void BasicDecorationBox-vzil-yM(@NotNull DecorationStatus decorationStatus0, Object object0, long v, @Nullable Rect rect0, @Nullable Matrix matrix0, @NotNull Matrix matrix1, @NotNull DecorationControllerInterface decorationControllerInterface0, @NotNull Function5 function50, @Nullable Composer composer0, int v1, int v2) {
        MutableState mutableState3;
        Matrix matrix4;
        State state4;
        Modifier modifier0;
        DecorationVisibility decorationVisibility0;
        Matrix matrix3;
        MutableState mutableState2;
        DecorationStatus decorationStatus2;
        int v6;
        int v3;
        Matrix matrix2;
        Intrinsics.checkNotNullParameter(decorationStatus0, "status");
        Intrinsics.checkNotNullParameter(matrix1, "decorationMatrix");
        Intrinsics.checkNotNullParameter(decorationControllerInterface0, "decorationController");
        Intrinsics.checkNotNullParameter(function50, "content");
        Composer composer1 = composer0.startRestartGroup(0xEFF61E91);
        Rect rect1 = (v2 & 8) == 0 ? rect0 : Rect.Companion.getZero();
        if((v2 & 16) == 0) {
            matrix2 = matrix0;
            v3 = v1;
        }
        else {
            matrix2 = new Matrix();
            v3 = 0xFFFF1FFF & v1;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xEFF61E91, v3, -1, "com.kakao.kandinsky.decoration.BasicDecorationBox (DecorationBox.kt:71)");
        }
        composer1.startReplaceGroup(0x96F03D82);
        MutableState mutableState0 = composer1.rememberedValue();
        Companion composer$Companion0 = Composer.Companion;
        if(mutableState0 == composer$Companion0.getEmpty()) {
            mutableState0 = SnapshotStateKt.mutableStateOf$default(Offset.box-impl(0L), null, 2, null);
            composer1.updateRememberedValue(mutableState0);
        }
        composer1.endReplaceGroup();
        composer1.startReplaceGroup(0x96F03DCB);
        MutableState mutableState1 = composer1.rememberedValue();
        if(mutableState1 == composer$Companion0.getEmpty()) {
            mutableState1 = SnapshotStateKt.mutableStateOf$default(Offset.box-impl(0L), null, 2, null);
            composer1.updateRememberedValue(mutableState1);
        }
        composer1.endReplaceGroup();
        composer1.startReplaceGroup(0x96F03E14);
        DecorationStatus decorationStatus1 = DecorationStatus.Enabled;
        boolean z = true;
        if(decorationStatus0 == decorationStatus1 || decorationStatus0 == DecorationStatus.Selected) {
            composer1.startReplaceGroup(0x96F03E83);
            State state0 = composer1.rememberedValue();
            if(state0 == composer$Companion0.getEmpty()) {
                state0 = SnapshotStateKt.derivedStateOf(new a0(mutableState0));
                composer1.updateRememberedValue(state0);
            }
            composer1.endReplaceGroup();
            composer1.startReplaceGroup(0x96F03EE6);
            int v4 = ((v1 & 0x380 ^ 0x180) <= 0x100 || !composer1.changed(v)) && (v1 & 0x180) != 0x100 ? 0 : 1;
            int v5 = ((v1 & 0x1C00 ^ 0xC00) <= 0x800 || !composer1.changed(rect1)) && (v1 & 0xC00) != 0x800 ? 0 : 1;
            boolean z1 = composer1.changed(matrix1);
            State state1 = composer1.rememberedValue();
            if((v4 | v5 | z1) != 0 || state1 == composer$Companion0.getEmpty()) {
                mutableState2 = mutableState1;
                matrix3 = matrix2;
                decorationStatus2 = decorationStatus1;
                v6 = v3;
                state1 = SnapshotStateKt.derivedStateOf(new b0(decorationControllerInterface0, v, rect1, matrix1, mutableState0));
                composer1.updateRememberedValue(state1);
            }
            else {
                v6 = v3;
                decorationStatus2 = decorationStatus1;
                mutableState2 = mutableState1;
                matrix3 = matrix2;
            }
            composer1.endReplaceGroup();
            if(((Boolean)state1.getValue()).booleanValue()) {
                decorationVisibility0 = DecorationVisibility.Visible;
                goto label_72;
            }
            if(((Boolean)state0.getValue()).booleanValue()) {
                decorationVisibility0 = DecorationVisibility.Dimmed;
                goto label_72;
            }
            decorationVisibility0 = DecorationVisibility.Gone;
        }
        else {
            decorationStatus2 = decorationStatus1;
            mutableState2 = mutableState1;
            matrix3 = matrix2;
            v6 = v3;
            if(decorationStatus0 == DecorationStatus.OnlyView) {
                decorationVisibility0 = DecorationVisibility.Visible;
            }
            else if(decorationStatus0 == DecorationStatus.Disabled) {
                decorationVisibility0 = DecorationVisibility.Dimmed;
            }
            else {
                throw new NoWhenBranchMatchedException();
            }
        }
    label_72:
        composer1.endReplaceGroup();
        EffectsKt.LaunchedEffect(decorationVisibility0, new j(decorationVisibility0, decorationControllerInterface0, object0, null), composer1, 0x40);
        if(decorationVisibility0 == DecorationVisibility.Gone) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
            if(scopeUpdateScope0 != null) {
                scopeUpdateScope0.updateScope(new k(decorationStatus0, object0, v, rect1, matrix3, matrix1, decorationControllerInterface0, function50, v1, v2, 0));
            }
            return;
        }
        composer1.startReplaceGroup(0x96F0422D);
        boolean z2 = (v1 & 0x380 ^ 0x180) > 0x100 && composer1.changed(v) || (v1 & 0x180) == 0x100;
        boolean z3 = composer1.changed(matrix1);
        State state2 = composer1.rememberedValue();
        if(z2 || z3 || state2 == composer$Companion0.getEmpty()) {
            state2 = SnapshotStateKt.derivedStateOf(new z(v, matrix1, mutableState0, mutableState2));
            composer1.updateRememberedValue(state2);
        }
        composer1.endReplaceGroup();
        State state3 = SnapshotStateKt.rememberUpdatedState(object0, composer1, v6 >> 3 & 14);
        composer1.startReplaceGroup(0x96F0433E);
        if(decorationStatus0 == decorationStatus2 || decorationStatus0 == DecorationStatus.Selected) {
            androidx.compose.ui.Modifier.Companion modifier$Companion0 = Modifier.Companion;
            composer1.startReplaceGroup(0x96F043B4);
            boolean z4 = (v1 & 0x380000 ^ 0x180000) > 0x100000 && composer1.changed(decorationControllerInterface0) || (v1 & 0x180000) == 0x100000;
            boolean z5 = composer1.changed(state3);
            int v7 = ((v1 & 14 ^ 6) <= 4 || !composer1.changed(decorationStatus0)) && (v1 & 6) != 4 ? 0 : 1;
            s s0 = composer1.rememberedValue();
            if((z4 | z5 | v7) != 0 || s0 == composer$Companion0.getEmpty()) {
                s0 = new s(decorationControllerInterface0, state3, decorationStatus0, null);
                composer1.updateRememberedValue(s0);
            }
            composer1.endReplaceGroup();
            matrix4 = matrix3;
            state4 = state3;
            modifier0 = SuspendingPointerInputFilterKt.pointerInput(SuspendingPointerInputFilterKt.pointerInput(modifier$Companion0, decorationStatus0, s0), new Object[]{Size.box-impl(v), matrix1, matrix3}, new y(mutableState0, decorationControllerInterface0, matrix3, state3, state2, null));
        }
        else {
            modifier0 = Modifier.Companion;
            state4 = state3;
            matrix4 = matrix3;
        }
        composer1.endReplaceGroup();
        function50.invoke(ModifierKt.enabled(modifier0, decorationVisibility0 == DecorationVisibility.Visible), Size.box-impl(v), ((DecorationRect)state2.getValue()), composer1, ((int)(v6 >> 3 & 0x70 | v6 >> 12 & 0x1C00)));
        if(decorationStatus0 == DecorationStatus.Selected) {
            composer1.startReplaceGroup(0x96F049C8);
            boolean z6 = composer1.changed(state2);
            l l0 = composer1.rememberedValue();
            if(z6 || l0 == composer$Companion0.getEmpty()) {
                l0 = new l(state2, 0);
                composer1.updateRememberedValue(l0);
            }
            composer1.endReplaceGroup();
            composer1.startReplaceGroup(0x96F04A32);
            if(((v1 & 0x380000 ^ 0x180000) <= 0x100000 || !composer1.changed(decorationControllerInterface0)) && (v1 & 0x180000) != 0x100000) {
                z = false;
            }
            boolean z7 = composer1.changed(state4);
            m m0 = composer1.rememberedValue();
            if(z || z7 || m0 == composer$Companion0.getEmpty()) {
                m0 = new m(0, decorationControllerInterface0, state4);
                composer1.updateRememberedValue(m0);
            }
            composer1.endReplaceGroup();
            ControlKt.DeleteControl(l0, FunctionStateKt.skippableLambda(m0, composer1, 0), composer1, 0);
            composer1.startReplaceGroup(0x96F04AA4);
            boolean z8 = composer1.changed(state2);
            l l1 = composer1.rememberedValue();
            if(z8 || l1 == composer$Companion0.getEmpty()) {
                l1 = new l(state2, 1);
                composer1.updateRememberedValue(l1);
            }
            composer1.endReplaceGroup();
            composer1.startReplaceGroup(0x96F04AFC);
            n n0 = composer1.rememberedValue();
            if(n0 == composer$Companion0.getEmpty()) {
                mutableState3 = mutableState2;
                n0 = new n(mutableState3);
                composer1.updateRememberedValue(n0);
            }
            else {
                mutableState3 = mutableState2;
            }
            composer1.endReplaceGroup();
            Function0 function00 = FunctionStateKt.skippableLambda(new p(decorationControllerInterface0, v, state4, state2, matrix4, mutableState3), composer1, 0);
            composer1.startReplaceGroup(0x96F04D56);
            q q0 = composer1.rememberedValue();
            if(q0 == composer$Companion0.getEmpty()) {
                q0 = new q(mutableState3, 0);
                composer1.updateRememberedValue(q0);
            }
            composer1.endReplaceGroup();
            ControlKt.RotateScaleControl(l1, n0, function00, q0, composer1, 0xC30);
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope1 = composer1.endRestartGroup();
        if(scopeUpdateScope1 != null) {
            scopeUpdateScope1.updateScope(new k(decorationStatus0, object0, v, rect1, matrix4, matrix1, decorationControllerInterface0, function50, v1, v2, 1));
        }
    }

    @Composable
    public static final void DecorationBox-vzil-yM(@NotNull DecorationStatus decorationStatus0, Object object0, long v, @Nullable Rect rect0, @Nullable Matrix matrix0, @NotNull Matrix matrix1, @NotNull DecorationControllerInterface decorationControllerInterface0, @NotNull Function3 function30, @Nullable Composer composer0, int v1, int v2) {
        Matrix matrix2;
        int v3;
        Intrinsics.checkNotNullParameter(decorationStatus0, "status");
        Intrinsics.checkNotNullParameter(matrix1, "decorationMatrix");
        Intrinsics.checkNotNullParameter(decorationControllerInterface0, "decorationController");
        Intrinsics.checkNotNullParameter(function30, "content");
        Composer composer1 = composer0.startRestartGroup(0xA8B231DD);
        Rect rect1 = (v2 & 8) == 0 ? rect0 : Rect.Companion.getZero();
        if((v2 & 16) == 0) {
            matrix2 = matrix0;
            v3 = v1;
        }
        else {
            v3 = v1 & 0xFFFF1FFF;
            matrix2 = new Matrix();
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xA8B231DD, v3, -1, "com.kakao.kandinsky.decoration.DecorationBox (DecorationBox.kt:39)");
        }
        DecorationBoxKt.BasicDecorationBox-vzil-yM(decorationStatus0, object0, v, rect1, matrix2, matrix1, decorationControllerInterface0, ComposableLambdaKt.rememberComposableLambda(478661830, true, new d0(decorationStatus0, function30), composer1, 54), composer1, v3 & 14 | 0xC48000 | (v3 >> 3 & 8) << 3 | v3 & 0x70 | v3 & 0x380 | v3 & 0x1C00 | 0x380000 & v3, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new k(decorationStatus0, object0, v, rect1, matrix2, matrix1, decorationControllerInterface0, function30, v1, v2, 2));
        }
    }

    public static final long access$BasicDecorationBox_vzil_yM$lambda$1(MutableState mutableState0) {
        return ((Offset)mutableState0.getValue()).unbox-impl();
    }

    public static final DecorationRect access$BasicDecorationBox_vzil_yM$lambda$11(State state0) {
        return (DecorationRect)state0.getValue();
    }

    public static final Object access$BasicDecorationBox_vzil_yM$lambda$12(State state0) {
        return state0.getValue();
    }

    public static final void access$BasicDecorationBox_vzil_yM$lambda$2(MutableState mutableState0, long v) {
        mutableState0.setValue(Offset.box-impl(v));
    }

    public static final long access$BasicDecorationBox_vzil_yM$lambda$4(MutableState mutableState0) {
        return ((Offset)mutableState0.getValue()).unbox-impl();
    }

    public static final void access$BasicDecorationBox_vzil_yM$lambda$5(MutableState mutableState0, long v) {
        mutableState0.setValue(Offset.box-impl(v));
    }
}

