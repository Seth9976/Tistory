package com.kakao.kandinsky.crop.ui;

import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.gb;
import androidx.compose.material3.wd;
import androidx.compose.material3.y8;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer.Companion;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.unit.DpOffset;
import androidx.compose.ui.unit.DpSize;
import androidx.room.a;
import com.kakao.kandinsky.crop.contract.TouchCenterPoint;
import com.kakao.kandinsky.crop.contract.TouchCirclePoint;
import com.kakao.kandinsky.crop.contract.TouchDragPoint;
import com.kakao.kandinsky.crop.contract.TouchLinePoint;
import com.kakao.kandinsky.crop.contract.TouchPoint;
import com.kakao.kandinsky.designsystem.common.ModifierKt;
import com.kakao.kandinsky.designsystem.theme.ColorKt;
import com.kakao.kandinsky.designsystem.util.DpExtensionKt;
import com.kakao.kandinsky.gesture.GestureInteraction;
import com.kakao.kandinsky.gesture.GestureInteractionKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import z9.b;
import z9.c;
import z9.e;
import z9.f;
import z9.g;
import z9.h;
import z9.j;

@Metadata(d1 = {"\u0000G\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003*\u0001\u0017\u001A\u008C\u0001\u0010\u0013\u001A\u00020\u00072\u0006\u0010\u0001\u001A\u00020\u00002\u0006\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u00022\u0014\b\u0002\u0010\b\u001A\u000E\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u0014\b\u0002\u0010\n\u001A\u000E\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00070\u00052\'\u0010\u0010\u001A#\u0012\u0004\u0012\u00020\t\u0012\u0013\u0012\u00110\f¢\u0006\f\b\r\u0012\b\b\u000E\u0012\u0004\b\b(\u000F\u0012\u0004\u0012\u00020\u00070\u000B2\f\u0010\u0012\u001A\b\u0012\u0004\u0012\u00020\u00070\u0011H\u0007¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0019²\u0006\u000E\u0010\u0016\u001A\u00020\u00158\n@\nX\u008A\u008E\u0002²\u0006\f\u0010\u0018\u001A\u00020\u00178\nX\u008A\u0084\u0002"}, d2 = {"Landroidx/compose/ui/geometry/Rect;", "cropRect", "", "showGuideLine", "enableDrag", "Lkotlin/Function1;", "", "", "onZoom", "Landroidx/compose/ui/geometry/Offset;", "onMove", "Lkotlin/Function2;", "Lcom/kakao/kandinsky/crop/contract/TouchDragPoint;", "Lkotlin/ParameterName;", "name", "touchPoint", "onDrag", "Lkotlin/Function0;", "onFinishInteraction", "CropBox", "(Landroidx/compose/ui/geometry/Rect;ZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "Lcom/kakao/kandinsky/crop/contract/TouchPoint;", "selectedTouchPoint", "com/kakao/kandinsky/crop/ui/CropBoxKt$CropBox$gestureInteraction$2$1", "gestureInteraction", "crop_release"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nCropBox.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CropBox.kt\ncom/kakao/kandinsky/crop/ui/CropBoxKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 8 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 9 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 10 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,211:1\n1223#2,6:212\n1223#2,6:218\n1223#2,6:262\n1223#2,6:270\n1223#2,6:288\n1223#2,6:295\n1223#2,6:330\n1223#2,6:336\n71#3:224\n68#3,6:225\n74#3:259\n78#3:280\n78#4,6:231\n85#4,4:246\n89#4,2:256\n93#4:279\n368#5,9:237\n377#5:258\n378#5,2:277\n4032#6,6:250\n158#7:260\n148#7:281\n148#7:282\n148#7:301\n148#7:302\n1855#8:261\n1856#8:268\n1855#8:269\n1856#8:276\n50#9:283\n50#9:284\n50#9:285\n86#9:286\n56#9:287\n56#9:294\n68#9:303\n56#9:304\n68#9:305\n56#9:306\n50#9,7:307\n56#9:314\n68#9:315\n56#9:316\n50#9,7:317\n68#9:324\n56#9:325\n50#9:326\n86#9:327\n86#9:328\n50#9:329\n81#10:342\n107#10,2:343\n81#10:345\n*S KotlinDebug\n*F\n+ 1 CropBox.kt\ncom/kakao/kandinsky/crop/ui/CropBoxKt\n*L\n43#1:212,6\n45#1:218,6\n81#1:262,6\n93#1:270,6\n147#1:288,6\n154#1:295,6\n188#1:330,6\n197#1:336,6\n64#1:224\n64#1:225,6\n64#1:259\n64#1:280\n64#1:231,6\n64#1:246,4\n64#1:256,2\n64#1:279\n64#1:237,9\n64#1:258\n64#1:277,2\n64#1:250,6\n76#1:260\n133#1:281\n134#1:282\n170#1:301\n171#1:302\n80#1:261\n80#1:268\n92#1:269\n92#1:276\n139#1:283\n140#1:284\n141#1:285\n145#1:286\n146#1:287\n153#1:294\n174#1:303\n174#1:304\n175#1:305\n175#1:306\n175#1:307,7\n176#1:314\n176#1:315\n176#1:316\n177#1:317,7\n177#1:324\n177#1:325\n181#1:326\n181#1:327\n182#1:328\n182#1:329\n43#1:342\n43#1:343,2\n45#1:345\n*E\n"})
public final class CropBoxKt {
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;
        public static final int[] $EnumSwitchMapping$1;

        static {
            int[] arr_v = new int[TouchCirclePoint.values().length];
            try {
                arr_v[TouchCirclePoint.TopLeft.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[TouchCirclePoint.TopRight.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[TouchCirclePoint.BottomRight.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[TouchCirclePoint.BottomLeft.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
            int[] arr_v1 = new int[TouchLinePoint.values().length];
            try {
                arr_v1[TouchLinePoint.Top.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v1[TouchLinePoint.Bottom.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v1[TouchLinePoint.Left.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v1[TouchLinePoint.Right.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$1 = arr_v1;
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void CropBox(@NotNull Rect rect0, boolean z, boolean z1, @Nullable Function1 function10, @Nullable Function1 function11, @NotNull Function2 function20, @NotNull Function0 function00, @Nullable Composer composer0, int v, int v1) {
        Function1 function13;
        Function1 function12;
        boolean z2;
        MutableState mutableState3;
        long v8;
        long v5;
        MutableState mutableState2;
        int v2;
        Intrinsics.checkNotNullParameter(rect0, "cropRect");
        Intrinsics.checkNotNullParameter(function20, "onDrag");
        Intrinsics.checkNotNullParameter(function00, "onFinishInteraction");
        Composer composer1 = composer0.startRestartGroup(0x1D186FAC);
        if((v1 & 1) == 0) {
            v2 = (v & 14) == 0 ? (composer1.changed(rect0) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x70) == 0) {
            v2 |= (composer1.changed(z) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x380) == 0) {
            v2 |= (composer1.changed(z1) ? 0x100 : 0x80);
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
        }
        else if((v & 0x1C00) == 0) {
            v2 |= (composer1.changedInstance(function10) ? 0x800 : 0x400);
        }
        if((v1 & 16) != 0) {
            v2 |= 0x6000;
        }
        else if((0xE000 & v) == 0) {
            v2 |= (composer1.changedInstance(function11) ? 0x4000 : 0x2000);
        }
        if((v1 & 0x20) != 0) {
            v2 |= 0x30000;
        }
        else if((0x70000 & v) == 0) {
            v2 |= (composer1.changedInstance(function20) ? 0x20000 : 0x10000);
        }
        if((v1 & 0x40) != 0) {
            v2 |= 0x180000;
        }
        else if((0x380000 & v) == 0) {
            v2 |= (composer1.changedInstance(function00) ? 0x100000 : 0x80000);
        }
        if((0x2DB6DB & v2) != 0x92492 || !composer1.getSkipping()) {
            boolean z3 = (v1 & 4) == 0 ? z1 : true;
            Function1 function14 = (v1 & 8) == 0 ? function10 : b.w;
            Function1 function15 = (v1 & 16) == 0 ? function11 : c.w;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x1D186FAC, v2, -1, "com.kakao.kandinsky.crop.ui.CropBox (CropBox.kt:38)");
            }
            long v3 = DpExtensionKt.toDpSize-Pq9zytI(rect0.getSize-NH-jbRc(), composer1, 0);
            long v4 = DpExtensionKt.toDpOffset-9KIMszo(rect0.getTopLeft-F1C5BW0(), composer1, 0);
            composer1.startReplaceGroup(0x1F81A5A0);
            MutableState mutableState0 = composer1.rememberedValue();
            Companion composer$Companion0 = Composer.Companion;
            if(mutableState0 == composer$Companion0.getEmpty()) {
                mutableState0 = SnapshotStateKt.mutableStateOf$default(TouchCenterPoint.Center, null, 2, null);
                composer1.updateRememberedValue(mutableState0);
            }
            composer1.endReplaceGroup();
            composer1.startReplaceGroup(0x1F81A600);
            MutableState mutableState1 = composer1.rememberedValue();
            if(mutableState1 == composer$Companion0.getEmpty()) {
                mutableState2 = mutableState0;
                v5 = v3;
                mutableState1 = SnapshotStateKt.mutableStateOf$default(new GestureInteraction() {
                    public final Function1 a;
                    public final Function1 b;
                    public final MutableState c;
                    public final Function2 d;
                    public final Function0 e;

                    {
                        Function1 function10 = function14;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                        Function1 function11 = function15;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                        MutableState mutableState0 = mutableState0;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                        Function2 function20 = function20;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                        Function0 function00 = function00;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                        this.a = function10;
                        this.b = function11;
                        this.c = mutableState0;
                        this.d = function20;
                        this.e = function00;
                    }

                    @Override  // com.kakao.kandinsky.gesture.GestureInteraction
                    public void onDrag-k-4lQ0M(long v) {
                        TouchPoint touchPoint0 = CropBoxKt.access$CropBox$lambda$1(this.c);
                        Unit unit0 = null;
                        TouchDragPoint touchDragPoint0 = touchPoint0 instanceof TouchDragPoint ? ((TouchDragPoint)touchPoint0) : null;
                        if(touchDragPoint0 != null) {
                            Offset offset0 = Offset.box-impl(v);
                            this.d.invoke(offset0, touchDragPoint0);
                            unit0 = Unit.INSTANCE;
                        }
                        if(unit0 == null) {
                            Offset offset1 = Offset.box-impl(v);
                            this.b.invoke(offset1);
                        }
                    }

                    @Override  // com.kakao.kandinsky.gesture.GestureInteraction
                    public void onFinish() {
                        CropBoxKt.access$CropBox$lambda$2(this.c, TouchCenterPoint.Center);
                        this.e.invoke();
                    }

                    @Override  // com.kakao.kandinsky.gesture.GestureInteraction
                    public void onZoom-3MmeM6k(long v, float f) {
                        this.a.invoke(f);
                    }
                }, null, 2, null);
                composer1.updateRememberedValue(mutableState1);
            }
            else {
                mutableState2 = mutableState0;
                v5 = v3;
            }
            composer1.endReplaceGroup();
            androidx.compose.ui.Modifier.Companion modifier$Companion0 = Modifier.Companion;
            Modifier modifier0 = SizeKt.fillMaxSize$default(modifier$Companion0, 0.0f, 1, null);
            MaterialTheme materialTheme0 = MaterialTheme.INSTANCE;
            int v6 = MaterialTheme.$stable;
            Modifier modifier1 = GestureInteractionKt.gesture(ModifierKt.dim-bw27NRU(modifier0, Color.copy-wmQWz5c$default(materialTheme0.getColorScheme(composer1, v6).getScrim-0d7_KjU(), 0.8f, 0.0f, 0.0f, 0.0f, 14, null), rect0), ((com.kakao.kandinsky.crop.ui.CropBoxKt.CropBox.gestureInteraction.2.1)mutableState1.getValue()));
            androidx.compose.ui.Alignment.Companion alignment$Companion0 = Alignment.Companion;
            MeasurePolicy measurePolicy0 = BoxKt.maybeCachedBoxMeasurePolicy(alignment$Companion0.getTopStart(), false);
            int v7 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier2 = ComposedModifierKt.materializeModifier(composer1, modifier1);
            androidx.compose.ui.node.ComposeUiNode.Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
            Function0 function01 = composeUiNode$Companion0.getConstructor();
            if(composer1.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer1.startReusableNode();
            if(composer1.getInserting()) {
                composer1.createNode(function01);
            }
            else {
                composer1.useNode();
            }
            Function2 function21 = a.r(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap0);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v7)) {
                a.t(v7, composer1, v7, function21);
            }
            Updater.set-impl(composer1, modifier2, composeUiNode$Companion0.getSetModifier());
            BoxScopeInstance boxScopeInstance0 = BoxScopeInstance.INSTANCE;
            composer1.startReplaceGroup(0xE8960DA);
            if(z) {
                v8 = v5;
                BoxKt.Box(DrawModifierKt.drawBehind(OffsetKt.offset-VpY3zN4(SizeKt.size-6HolHcs(boxScopeInstance0.align(modifier$Companion0, alignment$Companion0.getTopStart()), v8), DpOffset.getX-D9Ej5fM(v4), DpOffset.getY-D9Ej5fM(v4)), new y8(Color.copy-wmQWz5c$default(materialTheme0.getColorScheme(composer1, v6).getSecondary-0d7_KjU(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), 0.5f, 6)), composer1, 0);
            }
            else {
                v8 = v5;
            }
            composer1.endReplaceGroup();
            composer1.startReplaceGroup(0xE896248);
            for(Object object0: TouchLinePoint.getEntries()) {
                TouchLinePoint touchLinePoint0 = (TouchLinePoint)object0;
                composer1.startReplaceGroup(1428009192);
                boolean z4 = composer1.changed(touchLinePoint0);
                p9.a a0 = composer1.rememberedValue();
                if(z4 || a0 == Composer.Companion.getEmpty()) {
                    mutableState3 = mutableState2;
                    a0 = new p9.a(20, touchLinePoint0, mutableState3);
                    composer1.updateRememberedValue(a0);
                }
                else {
                    mutableState3 = mutableState2;
                }
                composer1.endReplaceGroup();
                CropBoxKt.b(z3, v4, v8, touchLinePoint0, a0, composer1, v2 >> 6 & 14);
                mutableState2 = mutableState3;
            }
            composer1.endReplaceGroup();
            composer1.startReplaceGroup(0x1F81AC0E);
            if(z3) {
                for(Object object1: TouchCirclePoint.getEntries()) {
                    TouchCirclePoint touchCirclePoint0 = (TouchCirclePoint)object1;
                    composer1.startReplaceGroup(1428009586);
                    boolean z5 = composer1.changed(touchCirclePoint0);
                    p9.a a1 = composer1.rememberedValue();
                    if(z5 || a1 == Composer.Companion.getEmpty()) {
                        a1 = new p9.a(21, touchCirclePoint0, mutableState2);
                        composer1.updateRememberedValue(a1);
                    }
                    composer1.endReplaceGroup();
                    CropBoxKt.a(v4, v8, touchCirclePoint0, a1, composer1, 0);
                }
            }
            if(a.x(composer1)) {
                ComposerKt.traceEventEnd();
            }
            z2 = z3;
            function12 = function14;
            function13 = function15;
        }
        else {
            composer1.skipToGroupEnd();
            z2 = z1;
            function12 = function10;
            function13 = function11;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new gb(rect0, z, z2, function12, function13, function20, function00, v, v1));
        }
    }

    public static final void a(long v, long v1, TouchCirclePoint touchCirclePoint0, Function0 function00, Composer composer0, int v2) {
        long v6;
        Composer composer1 = composer0.startRestartGroup(-1081370465);
        int v3 = (v2 & 14) == 0 ? (composer1.changed(v) ? 4 : 2) | v2 : v2;
        if((v2 & 0x70) == 0) {
            v3 |= (composer1.changed(v1) ? 0x20 : 16);
        }
        if((v2 & 0x380) == 0) {
            v3 |= (composer1.changed(touchCirclePoint0) ? 0x100 : 0x80);
        }
        if((v2 & 0x1C00) == 0) {
            v3 |= (composer1.changedInstance(function00) ? 0x800 : 0x400);
        }
        if((v3 & 5851) != 1170 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1081370465, v3, -1, "com.kakao.kandinsky.crop.ui.DraggableCircle (CropBox.kt:130)");
            }
            long v4 = ColorKt.getShadow(MaterialTheme.INSTANCE.getColorScheme(composer1, MaterialTheme.$stable));
            long v5 = MaterialTheme.INSTANCE.getColorScheme(composer1, MaterialTheme.$stable).getOnBackground-0d7_KjU();
            switch(WhenMappings.$EnumSwitchMapping$0[touchCirclePoint0.ordinal()]) {
                case 1: {
                    v6 = v;
                    break;
                }
                case 2: {
                    v6 = DpKt.DpOffset-YgX7TsA(DpSize.getWidth-D9Ej5fM(v1) + DpOffset.getX-D9Ej5fM(v), DpOffset.getY-D9Ej5fM(v));
                    break;
                }
                case 3: {
                    v6 = DpKt.DpOffset-YgX7TsA(DpSize.getWidth-D9Ej5fM(v1) + DpOffset.getX-D9Ej5fM(v), DpSize.getHeight-D9Ej5fM(v1) + DpOffset.getY-D9Ej5fM(v));
                    break;
                }
                case 4: {
                    v6 = DpKt.DpOffset-YgX7TsA(DpOffset.getX-D9Ej5fM(v), DpSize.getHeight-D9Ej5fM(v1) + DpOffset.getY-D9Ej5fM(v));
                    break;
                }
                default: {
                    throw new NoWhenBranchMatchedException();
                }
            }
            Modifier modifier0 = OffsetKt.offset-VpY3zN4(SizeKt.size-3ABfNKs(Modifier.Companion, 48.0f), DpOffset.getX-D9Ej5fM(v6) - 24.0f, DpOffset.getY-D9Ej5fM(v6) - 24.0f);
            composer1.startReplaceGroup(0x2BFE6E7B);
            e e0 = composer1.rememberedValue();
            if((v3 & 0x1C00) == 0x800 || e0 == Composer.Companion.getEmpty()) {
                e0 = new e(function00, null);
                composer1.updateRememberedValue(e0);
            }
            composer1.endReplaceGroup();
            Modifier modifier1 = PaddingKt.padding-3ABfNKs(SuspendingPointerInputFilterKt.pointerInput(modifier0, null, e0), 14.0f);
            composer1.startReplaceGroup(0x2BFE6F30);
            boolean z = composer1.changed(v4);
            boolean z1 = composer1.changed(v5);
            f f0 = composer1.rememberedValue();
            if(z || z1 || f0 == Composer.Companion.getEmpty()) {
                f0 = new f(v4, v5);
                composer1.updateRememberedValue(f0);
            }
            composer1.endReplaceGroup();
            BoxKt.Box(DrawModifierKt.drawBehind(modifier1, f0), composer1, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new g(v, v1, touchCirclePoint0, function00, v2));
        }
    }

    public static final TouchPoint access$CropBox$lambda$1(MutableState mutableState0) {
        return (TouchPoint)mutableState0.getValue();
    }

    public static final void access$CropBox$lambda$2(MutableState mutableState0, TouchPoint touchPoint0) {
        mutableState0.setValue(touchPoint0);
    }

    public static final void b(boolean z, long v, long v1, TouchLinePoint touchLinePoint0, Function0 function00, Composer composer0, int v2) {
        Modifier modifier1;
        Modifier modifier0;
        Composer composer1 = composer0.startRestartGroup(0x3706C103);
        int v3 = (v2 & 14) == 0 ? (composer1.changed(z) ? 4 : 2) | v2 : v2;
        if((v2 & 0x70) == 0) {
            v3 |= (composer1.changed(v) ? 0x20 : 16);
        }
        if((v2 & 0x380) == 0) {
            v3 |= (composer1.changed(v1) ? 0x100 : 0x80);
        }
        if((v2 & 0x1C00) == 0) {
            v3 |= (composer1.changed(touchLinePoint0) ? 0x800 : 0x400);
        }
        if((v2 & 0xE000) == 0) {
            v3 |= (composer1.changedInstance(function00) ? 0x4000 : 0x2000);
        }
        if((0xB6DB & v3) != 9362 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x3706C103, v3, -1, "com.kakao.kandinsky.crop.ui.DraggableLine (CropBox.kt:168)");
            }
            int[] arr_v = WhenMappings.$EnumSwitchMapping$1;
            switch(arr_v[touchLinePoint0.ordinal()]) {
                case 1: {
                    modifier0 = OffsetKt.offset-VpY3zN4(Modifier.Companion, DpOffset.getX-D9Ej5fM(v) - 1.0f, DpOffset.getY-D9Ej5fM(v) - 25.0f);
                    break;
                }
                case 2: {
                    modifier0 = OffsetKt.offset-VpY3zN4(Modifier.Companion, DpOffset.getX-D9Ej5fM(v) - 1.0f, DpSize.getHeight-D9Ej5fM(v1) + DpOffset.getY-D9Ej5fM(v) - 25.0f);
                    break;
                }
                case 3: {
                    modifier0 = OffsetKt.offset-VpY3zN4(Modifier.Companion, DpOffset.getX-D9Ej5fM(v) - 25.0f, DpOffset.getY-D9Ej5fM(v) - 1.0f);
                    break;
                }
                case 4: {
                    modifier0 = OffsetKt.offset-VpY3zN4(Modifier.Companion, DpSize.getWidth-D9Ej5fM(v1) + DpOffset.getX-D9Ej5fM(v) - 25.0f, DpOffset.getY-D9Ej5fM(v) - 1.0f);
                    break;
                }
                default: {
                    throw new NoWhenBranchMatchedException();
                }
            }
            switch(arr_v[touchLinePoint0.ordinal()]) {
                case 1: 
                case 2: {
                    modifier1 = SizeKt.size-VpY3zN4(Modifier.Companion, DpSize.getWidth-D9Ej5fM(v1) + 2.0f, 50.0f);
                    break;
                }
                case 3: 
                case 4: {
                    modifier1 = SizeKt.size-VpY3zN4(Modifier.Companion, 50.0f, DpSize.getHeight-D9Ej5fM(v1) + 2.0f);
                    break;
                }
                default: {
                    throw new NoWhenBranchMatchedException();
                }
            }
            Modifier modifier2 = modifier0.then(modifier1);
            Boolean boolean0 = Boolean.valueOf(z);
            composer1.startReplaceGroup(0x354952F8);
            j j0 = composer1.rememberedValue();
            if((((0xE000 & v3) == 0x4000 ? 1 : 0) | ((v3 & 14) == 4 ? 1 : 0)) != 0 || j0 == Composer.Companion.getEmpty()) {
                j0 = new j(z, function00, null);
                composer1.updateRememberedValue(j0);
            }
            composer1.endReplaceGroup();
            Modifier modifier3 = SuspendingPointerInputFilterKt.pointerInput(modifier2, boolean0, j0);
            long v4 = MaterialTheme.INSTANCE.getColorScheme(composer1, MaterialTheme.$stable).getOnBackground-0d7_KjU();
            composer1.startReplaceGroup(0x354953FA);
            boolean z1 = composer1.changed(v4);
            wd wd0 = composer1.rememberedValue();
            if((v3 & 0x1C00) == 0x800 || z1 || wd0 == Composer.Companion.getEmpty()) {
                wd0 = new wd(touchLinePoint0, v4, 2.0f);
                composer1.updateRememberedValue(wd0);
            }
            composer1.endReplaceGroup();
            CanvasKt.Canvas(modifier3, wd0, composer1, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new h(z, v, v1, touchLinePoint0, function00, v2));
        }
    }
}

