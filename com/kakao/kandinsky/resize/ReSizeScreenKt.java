package com.kakao.kandinsky.resize;

import a4.c;
import android.content.Context;
import androidx.activity.compose.BackHandlerKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.FlowLayoutKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.fc;
import androidx.compose.material3.gc;
import androidx.compose.material3.qq;
import androidx.compose.material3.ti;
import androidx.compose.material3.vb;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MovableContentKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier.Companion;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.input.key.SoftwareKeyboardInterceptionModifierKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.unit.IntSize;
import com.kakao.kandinsky.base.ConsumeDialogKt;
import com.kakao.kandinsky.base.contract.DialogUiState;
import com.kakao.kandinsky.designsystem.common.FeatureBottomBarKt;
import com.kakao.kandinsky.designsystem.common.KDButtonDefaults;
import com.kakao.kandinsky.designsystem.common.KDButtonKt;
import com.kakao.kandinsky.designsystem.common.RotatableScreenKt;
import com.kakao.kandinsky.designsystem.theme.Orientation;
import com.kakao.kandinsky.designsystem.theme.OrientationKt;
import com.kakao.kandinsky.designsystem.theme.ThemeKt;
import com.kakao.kandinsky.resize.contract.ResizeEvent.ShowDialog;
import com.kakao.kandinsky.resize.contract.ResizeUiState;
import j0.b2;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.o;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pa.h;
import pa.i;
import pa.j;
import pa.k;
import pa.l;
import pa.m;
import pa.n;
import pa.p;
import pa.q;
import pa.r;
import pa.s;
import pa.t;
import pa.u;
import pa.v;
import qd.a;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\u001A\u008B\u0001\u0010\u0011\u001A\u00020\b2\u0006\u0010\u0001\u001A\u00020\u000026\u0010\t\u001A2\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u00022\u0012\u0010\f\u001A\u000E\u0012\u0004\u0012\u00020\u000B\u0012\u0004\u0012\u00020\b0\n2\u0018\u0010\u000E\u001A\u0014\u0012\u0004\u0012\u00020\u000B\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\b0\u00022\f\u0010\u0010\u001A\b\u0012\u0004\u0012\u00020\b0\u000FH\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001Ac\u0010\u0017\u001A\u00020\b2\f\u0010\u0015\u001A\b\u0012\u0004\u0012\u00020\u00140\u00132\f\u0010\u0010\u001A\b\u0012\u0004\u0012\u00020\b0\u000F26\u0010\u0016\u001A2\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0002H\u0007¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u001F²\u0006\f\u0010\u001A\u001A\u00020\u00198\nX\u008A\u0084\u0002²\u0006\u000E\u0010\u001C\u001A\u00020\u001B8\n@\nX\u008A\u008E\u0002²\u0006\f\u0010\u001E\u001A\u00020\u001D8\nX\u008A\u0084\u0002"}, d2 = {"Lcom/kakao/kandinsky/resize/ResizeViewModel;", "viewModel", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "from", "to", "", "startBounceAnimation", "Lkotlin/Function1;", "Lcom/kakao/kandinsky/core/kdphoto/KDPhoto;", "onConfirm", "", "onMultipleConfirm", "Lkotlin/Function0;", "goHomeState", "ResizeScreen", "(Lcom/kakao/kandinsky/resize/ResizeViewModel;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "Lkotlinx/coroutines/flow/SharedFlow;", "Lcom/kakao/kandinsky/resize/contract/ResizeEvent;", "event", "startBonceAnimation", "ConsumeEvent", "(Lkotlinx/coroutines/flow/SharedFlow;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "Lcom/kakao/kandinsky/resize/contract/ResizeUiState;", "uiState", "Landroidx/compose/ui/text/input/TextFieldValue;", "input", "", "isValidInput", "resize_release"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nReSizeScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReSizeScreen.kt\ncom/kakao/kandinsky/resize/ReSizeScreenKt\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 7 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 8 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 9 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 10 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 11 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 12 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 13 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 14 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,563:1\n71#2:564\n67#2,7:565\n74#2:600\n78#2:634\n71#2:852\n69#2,5:853\n74#2:886\n78#2:896\n78#3,6:572\n85#3,4:587\n89#3,2:597\n93#3:633\n78#3,6:643\n85#3,4:658\n89#3,2:668\n93#3:674\n78#3,6:683\n85#3,4:698\n89#3,2:708\n93#3:714\n78#3,6:758\n85#3,4:773\n89#3,2:783\n93#3:790\n78#3,6:800\n85#3,4:815\n89#3,2:825\n93#3:832\n78#3,6:858\n85#3,4:873\n89#3,2:883\n93#3:895\n368#4,9:578\n377#4:599\n378#4,2:631\n368#4,9:649\n377#4:670\n378#4,2:672\n368#4,9:689\n377#4:710\n378#4,2:712\n368#4,9:764\n377#4:785\n378#4,2:788\n368#4,9:806\n377#4:827\n378#4,2:830\n368#4,9:864\n377#4:885\n378#4,2:893\n4032#5,6:591\n4032#5,6:662\n4032#5,6:702\n4032#5,6:777\n4032#5,6:819\n4032#5,6:877\n1223#6,6:601\n1223#6,6:607\n1223#6,6:613\n1223#6,6:619\n1223#6,6:625\n1223#6,6:718\n1223#6,6:725\n1223#6,6:731\n1223#6,6:737\n1223#6,6:743\n1223#6,6:834\n1223#6,6:887\n77#7:635\n77#7:749\n77#7:840\n77#7:906\n85#8:636\n82#8,6:637\n88#8:671\n92#8:675\n85#8:794\n83#8,5:795\n88#8:828\n92#8:833\n98#9:676\n95#9,6:677\n101#9:711\n105#9:715\n98#9:752\n96#9,5:753\n101#9:786\n105#9:791\n148#10:716\n148#10:717\n148#10:724\n148#10:750\n148#10:751\n148#10:787\n148#10:792\n148#10:793\n148#10:829\n148#10:841\n148#10:842\n148#10:843\n148#10:844\n148#10:845\n148#10:846\n148#10:847\n148#10:848\n148#10:849\n148#10:850\n148#10:851\n36#11:897\n21#11:898\n23#11:902\n53#11,3:903\n50#12:899\n55#12:901\n107#13:900\n81#14:907\n81#14:908\n107#14,2:909\n81#14:911\n*S KotlinDebug\n*F\n+ 1 ReSizeScreen.kt\ncom/kakao/kandinsky/resize/ReSizeScreenKt\n*L\n120#1:564\n120#1:565,7\n120#1:600\n120#1:634\n485#1:852\n485#1:853,5\n485#1:886\n485#1:896\n120#1:572,6\n120#1:587,4\n120#1:597,2\n120#1:633\n222#1:643,6\n222#1:658,4\n222#1:668,2\n222#1:674\n239#1:683,6\n239#1:698,4\n239#1:708,2\n239#1:714\n369#1:758,6\n369#1:773,4\n369#1:783,2\n369#1:790\n383#1:800,6\n383#1:815,4\n383#1:825,2\n383#1:832\n485#1:858,6\n485#1:873,4\n485#1:883,2\n485#1:895\n120#1:578,9\n120#1:599\n120#1:631,2\n222#1:649,9\n222#1:670\n222#1:672,2\n239#1:689,9\n239#1:710\n239#1:712,2\n369#1:764,9\n369#1:785\n369#1:788,2\n383#1:806,9\n383#1:827\n383#1:830,2\n485#1:864,9\n485#1:885\n485#1:893,2\n120#1:591,6\n222#1:662,6\n239#1:702,6\n369#1:777,6\n383#1:819,6\n485#1:877,6\n163#1:601,6\n165#1:607,6\n178#1:613,6\n188#1:619,6\n198#1:625,6\n282#1:718,6\n312#1:725,6\n321#1:731,6\n332#1:737,6\n345#1:743,6\n406#1:834,6\n497#1:887,6\n220#1:635\n367#1:749\n420#1:840\n542#1:906\n222#1:636\n222#1:637,6\n222#1:671\n222#1:675\n383#1:794\n383#1:795,5\n383#1:828\n383#1:833\n239#1:676\n239#1:677,6\n239#1:711\n239#1:715\n369#1:752\n369#1:753,5\n369#1:786\n369#1:791\n270#1:716\n278#1:717\n292#1:724\n371#1:750\n373#1:751\n377#1:787\n385#1:792\n387#1:793\n391#1:829\n423#1:841\n425#1:842\n426#1:843\n434#1:844\n436#1:845\n437#1:846\n454#1:847\n455#1:848\n456#1:849\n489#1:850\n490#1:851\n540#1:897\n540#1:898\n540#1:902\n540#1:903,3\n540#1:899\n540#1:901\n540#1:900\n116#1:907\n163#1:908\n163#1:909,2\n165#1:911\n*E\n"})
public final class ReSizeScreenKt {
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[Orientation.values().length];
            try {
                arr_v[Orientation.Portrait.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[Orientation.Landscape.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void ConsumeEvent(@NotNull SharedFlow sharedFlow0, @NotNull Function0 function00, @NotNull Function2 function20, @Nullable Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(sharedFlow0, "event");
        Intrinsics.checkNotNullParameter(function00, "goHomeState");
        Intrinsics.checkNotNullParameter(function20, "startBonceAnimation");
        Composer composer1 = composer0.startRestartGroup(0x6D530A3F);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x6D530A3F, v, -1, "com.kakao.kandinsky.resize.ConsumeEvent (ReSizeScreen.kt:538)");
        }
        ConsumeDialogKt.ConsumeDialog(new Flow() {
            @Override  // kotlinx.coroutines.flow.Flow
            @Nullable
            public Object collect(@NotNull FlowCollector flowCollector0, @NotNull Continuation continuation0) {
                com.kakao.kandinsky.resize.ReSizeScreenKt.ConsumeEvent..inlined.map.1.2 reSizeScreenKt$ConsumeEvent$$inlined$map$1$20 = new FlowCollector() {
                    @Override  // kotlinx.coroutines.flow.FlowCollector
                    @Nullable
                    public final Object emit(Object object0, @NotNull Continuation continuation0) {
                        com.kakao.kandinsky.resize.ReSizeScreenKt.ConsumeEvent..inlined.map.1.2.1 reSizeScreenKt$ConsumeEvent$$inlined$map$1$2$10;
                        if(continuation0 instanceof com.kakao.kandinsky.resize.ReSizeScreenKt.ConsumeEvent..inlined.map.1.2.1) {
                            reSizeScreenKt$ConsumeEvent$$inlined$map$1$2$10 = (com.kakao.kandinsky.resize.ReSizeScreenKt.ConsumeEvent..inlined.map.1.2.1)continuation0;
                            int v = reSizeScreenKt$ConsumeEvent$$inlined$map$1$2$10.p;
                            if((v & 0x80000000) == 0) {
                                reSizeScreenKt$ConsumeEvent$$inlined$map$1$2$10 = new ContinuationImpl(/*ERROR_MISSING_ARG_1/*) {
                                    public Object o;
                                    public int p;

                                    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    @Nullable
                                    public final Object invokeSuspend(@NotNull Object object0) {
                                        this.o = object0;
                                        this.p |= 0x80000000;
                                        return continuation0.emit(null, this);
                                    }
                                };
                            }
                            else {
                                reSizeScreenKt$ConsumeEvent$$inlined$map$1$2$10.p = v ^ 0x80000000;
                            }
                        }
                        else {
                            reSizeScreenKt$ConsumeEvent$$inlined$map$1$2$10 = new ContinuationImpl(/*ERROR_MISSING_ARG_1/*) {
                                public Object o;
                                public int p;

                                @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                @Nullable
                                public final Object invokeSuspend(@NotNull Object object0) {
                                    this.o = object0;
                                    this.p |= 0x80000000;
                                    return continuation0.emit(null, this);
                                }
                            };
                        }
                        Object object1 = reSizeScreenKt$ConsumeEvent$$inlined$map$1$2$10.o;
                        Object object2 = a.getCOROUTINE_SUSPENDED();
                        switch(reSizeScreenKt$ConsumeEvent$$inlined$map$1$2$10.p) {
                            case 0: {
                                ResultKt.throwOnFailure(object1);
                                DialogUiState dialogUiState0 = ((ShowDialog)object0).getDialog();
                                reSizeScreenKt$ConsumeEvent$$inlined$map$1$2$10.p = 1;
                                return this.a.emit(dialogUiState0, reSizeScreenKt$ConsumeEvent$$inlined$map$1$2$10) == object2 ? object2 : Unit.INSTANCE;
                            }
                            case 1: {
                                ResultKt.throwOnFailure(object1);
                                return Unit.INSTANCE;
                            }
                            default: {
                                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                            }
                        }
                    }
                };
                Object object0 = new com.kakao.kandinsky.resize.ReSizeScreenKt.ConsumeEvent..inlined.filterIsInstance.1(sharedFlow0).collect(reSizeScreenKt$ConsumeEvent$$inlined$map$1$20, continuation0);
                return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
            }
        }, composer1, 8);
        EffectsKt.LaunchedEffect(sharedFlow0, new h(sharedFlow0, function00, ((Context)composer1.consume(AndroidCompositionLocals_androidKt.getLocalContext())), function20, null), composer1, 72);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new androidx.compose.foundation.text.selection.a(v, 16, sharedFlow0, function00, function20));
        }

        @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001F\u0010\u0002\u001A\u00020\u00032\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\n"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$$inlined$unsafeFlow$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$filter$$inlined$unsafeTransform$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$filterIsInstance$$inlined$filter$1"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
        @SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,113:1\n51#2,5:114\n*E\n"})
        public final class com.kakao.kandinsky.resize.ReSizeScreenKt.ConsumeEvent..inlined.filterIsInstance.1 implements Flow {
            public com.kakao.kandinsky.resize.ReSizeScreenKt.ConsumeEvent..inlined.filterIsInstance.1(Flow flow0) {
            }

            @Override  // kotlinx.coroutines.flow.Flow
            @Nullable
            public Object collect(@NotNull FlowCollector flowCollector0, @NotNull Continuation continuation0) {
                com.kakao.kandinsky.resize.ReSizeScreenKt.ConsumeEvent..inlined.filterIsInstance.1.2 reSizeScreenKt$ConsumeEvent$$inlined$filterIsInstance$1$20 = new FlowCollector() {
                    @Override  // kotlinx.coroutines.flow.FlowCollector
                    @Nullable
                    public final Object emit(Object object0, @NotNull Continuation continuation0) {
                        com.kakao.kandinsky.resize.ReSizeScreenKt.ConsumeEvent..inlined.filterIsInstance.1.2.1 reSizeScreenKt$ConsumeEvent$$inlined$filterIsInstance$1$2$10;
                        if(continuation0 instanceof com.kakao.kandinsky.resize.ReSizeScreenKt.ConsumeEvent..inlined.filterIsInstance.1.2.1) {
                            reSizeScreenKt$ConsumeEvent$$inlined$filterIsInstance$1$2$10 = (com.kakao.kandinsky.resize.ReSizeScreenKt.ConsumeEvent..inlined.filterIsInstance.1.2.1)continuation0;
                            int v = reSizeScreenKt$ConsumeEvent$$inlined$filterIsInstance$1$2$10.p;
                            if((v & 0x80000000) == 0) {
                                reSizeScreenKt$ConsumeEvent$$inlined$filterIsInstance$1$2$10 = new ContinuationImpl(/*ERROR_MISSING_ARG_1/*) {
                                    public Object o;
                                    public int p;

                                    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    @Nullable
                                    public final Object invokeSuspend(@NotNull Object object0) {
                                        this.o = object0;
                                        this.p |= 0x80000000;
                                        return continuation0.emit(null, this);
                                    }
                                };
                            }
                            else {
                                reSizeScreenKt$ConsumeEvent$$inlined$filterIsInstance$1$2$10.p = v ^ 0x80000000;
                            }
                        }
                        else {
                            reSizeScreenKt$ConsumeEvent$$inlined$filterIsInstance$1$2$10 = new ContinuationImpl(/*ERROR_MISSING_ARG_1/*) {
                                public Object o;
                                public int p;

                                @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                @Nullable
                                public final Object invokeSuspend(@NotNull Object object0) {
                                    this.o = object0;
                                    this.p |= 0x80000000;
                                    return continuation0.emit(null, this);
                                }
                            };
                        }
                        Object object1 = reSizeScreenKt$ConsumeEvent$$inlined$filterIsInstance$1$2$10.o;
                        Object object2 = a.getCOROUTINE_SUSPENDED();
                        switch(reSizeScreenKt$ConsumeEvent$$inlined$filterIsInstance$1$2$10.p) {
                            case 0: {
                                ResultKt.throwOnFailure(object1);
                                if(object0 instanceof ShowDialog) {
                                    reSizeScreenKt$ConsumeEvent$$inlined$filterIsInstance$1$2$10.p = 1;
                                    if(this.a.emit(object0, reSizeScreenKt$ConsumeEvent$$inlined$filterIsInstance$1$2$10) == object2) {
                                        return object2;
                                    }
                                }
                                return Unit.INSTANCE;
                            }
                            case 1: {
                                ResultKt.throwOnFailure(object1);
                                return Unit.INSTANCE;
                            }
                            default: {
                                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                            }
                        }
                    }
                };
                Object object0 = this.a.collect(reSizeScreenKt$ConsumeEvent$$inlined$filterIsInstance$1$20, continuation0);
                return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
            }
        }

    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void ResizeScreen(@NotNull ResizeViewModel resizeViewModel0, @NotNull Function2 function20, @NotNull Function1 function10, @NotNull Function2 function21, @NotNull Function0 function00, @Nullable Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(resizeViewModel0, "viewModel");
        Intrinsics.checkNotNullParameter(function20, "startBounceAnimation");
        Intrinsics.checkNotNullParameter(function10, "onConfirm");
        Intrinsics.checkNotNullParameter(function21, "onMultipleConfirm");
        Intrinsics.checkNotNullParameter(function00, "goHomeState");
        Composer composer1 = composer0.startRestartGroup(0x46D80BDD);
        int v1 = (v & 14) == 0 ? (composer1.changed(resizeViewModel0) ? 4 : 2) | v : v;
        if((v & 0x70) == 0) {
            v1 |= (composer1.changedInstance(function20) ? 0x20 : 16);
        }
        if((v & 0x380) == 0) {
            v1 |= (composer1.changedInstance(function10) ? 0x100 : 0x80);
        }
        if((v & 0x1C00) == 0) {
            v1 |= (composer1.changedInstance(function21) ? 0x800 : 0x400);
        }
        if((0xE000 & v) == 0) {
            v1 |= (composer1.changedInstance(function00) ? 0x4000 : 0x2000);
        }
        if((0xB6DB & v1) != 9362 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x46D80BDD, v1, -1, "com.kakao.kandinsky.resize.ResizeScreen (ReSizeScreen.kt:114)");
            }
            State state0 = SnapshotStateKt.collectAsState(resizeViewModel0.getUiState(), null, composer1, 8, 1);
            BackHandlerKt.BackHandler(false, ((ResizeUiState)state0.getValue()).getOnBackPressed(), composer1, 0, 1);
            Companion modifier$Companion0 = Modifier.Companion;
            androidx.compose.ui.Alignment.Companion alignment$Companion0 = Alignment.Companion;
            MeasurePolicy measurePolicy0 = BoxKt.maybeCachedBoxMeasurePolicy(alignment$Companion0.getTopStart(), false);
            int v2 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier0 = ComposedModifierKt.materializeModifier(composer1, modifier$Companion0);
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
            Function2 function22 = androidx.room.a.r(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap0);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v2)) {
                androidx.room.a.t(v2, composer1, v2, function22);
            }
            Updater.set-impl(composer1, modifier0, composeUiNode$Companion0.getSetModifier());
            BoxScopeInstance boxScopeInstance0 = BoxScopeInstance.INSTANCE;
            RotatableScreenKt.RotatableScreen-FHprtrg(null, null, ((ResizeUiState)state0.getValue()).getUpdateContentBounds(), null, 0L, ComposableLambdaKt.rememberComposableLambda(0x57C75703, true, new r(state0, function10, function00, function21, 0), composer1, 54), composer1, 0x30000, 27);
            composer1.startReplaceGroup(0x96D1491);
            if(((ResizeUiState)state0.getValue()).getScreenType() == ResizeScreenType.Custom) {
                composer1.startReplaceGroup(0x111ECCEF);
                MutableState mutableState0 = composer1.rememberedValue();
                androidx.compose.runtime.Composer.Companion composer$Companion0 = Composer.Companion;
                if(mutableState0 == composer$Companion0.getEmpty()) {
                    mutableState0 = SnapshotStateKt.mutableStateOf$default(new TextFieldValue(null, 0L, null, 7, null), null, 2, null);
                    composer1.updateRememberedValue(mutableState0);
                }
                composer1.endReplaceGroup();
                int v3 = ((ResizeUiState)state0.getValue()).getMinSize();
                composer1.startReplaceGroup(0x111ECD3E);
                boolean z = composer1.changed(v3);
                State state1 = composer1.rememberedValue();
                if(z || state1 == composer$Companion0.getEmpty()) {
                    state1 = SnapshotStateKt.derivedStateOf(new t(mutableState0, state0));
                    composer1.updateRememberedValue(state1);
                }
                composer1.endReplaceGroup();
                BoxKt.Box(BackgroundKt.background-bw27NRU$default(SizeKt.fillMaxSize$default(modifier$Companion0, 0.0f, 1, null), MaterialTheme.INSTANCE.getColorScheme(composer1, MaterialTheme.$stable).getScrim-0d7_KjU(), null, 2, null), composer1, 0);
                Modifier modifier1 = boxScopeInstance0.align(modifier$Companion0, alignment$Companion0.getBottomCenter());
                composer1.startReplaceGroup(0x111ECF07);
                boolean z1 = composer1.changed(state0);
                s s0 = composer1.rememberedValue();
                if(z1 || s0 == composer$Companion0.getEmpty()) {
                    s0 = new s(state0);
                    composer1.updateRememberedValue(s0);
                }
                composer1.endReplaceGroup();
                Modifier modifier2 = SoftwareKeyboardInterceptionModifierKt.onInterceptKeyBeforeSoftKeyboard(modifier1, s0);
                boolean z2 = ((Boolean)state1.getValue()).booleanValue();
                Object object0 = mutableState0.getValue();
                composer1.startReplaceGroup(0x111ED073);
                boolean z3 = composer1.changed(state0);
                b2 b20 = composer1.rememberedValue();
                if(z3 || b20 == composer$Companion0.getEmpty()) {
                    b20 = new b2(15, state0, mutableState0);
                    composer1.updateRememberedValue(b20);
                }
                composer1.endReplaceGroup();
                composer1.startReplaceGroup(0x111ED23C);
                boolean z4 = composer1.changed(state0);
                t t0 = composer1.rememberedValue();
                if(z4 || t0 == composer$Companion0.getEmpty()) {
                    t0 = new t(state0, mutableState0);
                    composer1.updateRememberedValue(t0);
                }
                composer1.endReplaceGroup();
                ReSizeScreenKt.b(modifier2, z2, ((TextFieldValue)object0), b20, t0, composer1, 0);
            }
            composer1.endReplaceGroup();
            composer1.endNode();
            ReSizeScreenKt.ConsumeEvent(resizeViewModel0.getEvent(), function00, function20, composer1, v1 >> 9 & 0x70 | 8 | v1 << 3 & 0x380);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new fc(resizeViewModel0, function20, function10, function21, function00, v));
        }
    }

    public static final void a(Modifier modifier0, boolean z, TextFieldValue textFieldValue0, Function1 function10, Function0 function00, Composer composer0, int v, int v1) {
        Modifier modifier1;
        int v2;
        Composer composer1 = composer0.startRestartGroup(0xED42BFAA);
        if((v1 & 1) == 0) {
            v2 = (v & 14) == 0 ? (composer1.changed(modifier0) ? 4 : 2) | v : v;
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
            v2 |= (composer1.changed(textFieldValue0) ? 0x100 : 0x80);
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
        else if((v & 0xE000) == 0) {
            v2 |= (composer1.changedInstance(function00) ? 0x4000 : 0x2000);
        }
        if((0xB6DB & v2) != 9362 || !composer1.getSkipping()) {
            Modifier modifier2 = (v1 & 1) == 0 ? modifier0 : Modifier.Companion;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xED42BFAA, v2, -1, "com.kakao.kandinsky.resize.CustomSizeInputField (ReSizeScreen.kt:480)");
            }
            long v3 = MaterialTheme.INSTANCE.getColorScheme(composer1, MaterialTheme.$stable).getSecondary-0d7_KjU();
            TextStyle textStyle0 = MaterialTheme.INSTANCE.getTypography(composer1, MaterialTheme.$stable).getBodyLarge();
            Modifier modifier3 = PaddingKt.padding-qDBjuR0$default(SizeKt.height-3ABfNKs(SizeKt.fillMaxWidth$default(BackgroundKt.background-bw27NRU$default(modifier2, MaterialTheme.INSTANCE.getColorScheme(composer1, MaterialTheme.$stable).getBackground-0d7_KjU(), null, 2, null), 0.0f, 1, null), 50.0f), 18.0f, 0.0f, 6.0f, 0.0f, 10, null);
            MeasurePolicy measurePolicy0 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getCenterStart(), false);
            int v4 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier4 = ComposedModifierKt.materializeModifier(composer1, modifier3);
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
            Function2 function20 = androidx.room.a.r(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap0);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v4)) {
                androidx.room.a.t(v4, composer1, v4, function20);
            }
            Updater.set-impl(composer1, modifier4, composeUiNode$Companion0.getSetModifier());
            KeyboardOptions keyboardOptions0 = new KeyboardOptions(0, null, 8, 7, null, null, null, 0x73, null);
            composer1.startReplaceGroup(1229071593);
            aa.a a0 = composer1.rememberedValue();
            if((0xE000 & v2) == 0x4000 || a0 == Composer.Companion.getEmpty()) {
                a0 = new aa.a(function00, 19);
                composer1.updateRememberedValue(a0);
            }
            composer1.endReplaceGroup();
            KeyboardActions keyboardActions0 = new KeyboardActions(a0, null, null, null, null, null, 62, null);
            BasicTextFieldKt.BasicTextField(textFieldValue0, function10, null, false, false, TextStyle.copy-p1EtxEg$default(textStyle0, v3, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 0xFFFFFE, null), keyboardOptions0, keyboardActions0, true, 0, 0, null, null, null, new SolidColor(v3, null), ComposableLambdaKt.rememberComposableLambda(0x8B44273A, true, new b(function00, z, textFieldValue0, v3, textStyle0), composer1, 54), composer1, v2 >> 6 & 14 | 0x6180000 | v2 >> 6 & 0x70, 0x30000, 15900);
            composer1.endNode();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier1 = modifier2;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new vb(modifier1, z, textFieldValue0, function10, function00, v, v1));
        }
    }

    public static final void access$CustomSizeInputField(Modifier modifier0, boolean z, TextFieldValue textFieldValue0, Function1 function10, Function0 function00, Composer composer0, int v, int v1) {
        ReSizeScreenKt.a(modifier0, z, textFieldValue0, function10, function00, composer0, v, v1);
    }

    public static final void access$CustomTypeToolbar(Modifier modifier0, boolean z, TextFieldValue textFieldValue0, Function1 function10, Function0 function00, Composer composer0, int v) {
        ReSizeScreenKt.b(modifier0, z, textFieldValue0, function10, function00, composer0, v);
    }

    public static final void access$DefaultTypeToolbar-SUCSAKA(Modifier modifier0, long v, int v1, ImmutableList immutableList0, boolean z, Function0 function00, Function0 function01, Function1 function10, Function0 function02, Function0 function03, Function0 function04, Composer composer0, int v2, int v3, int v4) {
        Modifier modifier1;
        int v6;
        Composer composer1 = composer0.startRestartGroup(1802642327);
        int v5 = (v2 & 14) == 0 ? ((v4 & 1) != 0 || !composer1.changed(modifier0) ? 2 : 4) | v2 : v2;
        if((v4 & 2) != 0) {
            v5 |= 0x30;
        }
        else if((v2 & 0x70) == 0) {
            v5 |= (composer1.changed(v) ? 0x20 : 16);
        }
        if((v4 & 4) != 0) {
            v5 |= 0x180;
        }
        else if((v2 & 0x380) == 0) {
            v5 |= (composer1.changed(v1) ? 0x100 : 0x80);
        }
        if((v4 & 8) != 0) {
            v5 |= 0xC00;
        }
        else if((v2 & 0x1C00) == 0) {
            v5 |= (composer1.changed(immutableList0) ? 0x800 : 0x400);
        }
        if((v4 & 16) != 0) {
            v5 |= 0x6000;
        }
        else if((0xE000 & v2) == 0) {
            v5 |= (composer1.changed(z) ? 0x4000 : 0x2000);
        }
        if((v4 & 0x20) != 0) {
            v5 |= 0x30000;
        }
        else if((0x70000 & v2) == 0) {
            v5 |= (composer1.changedInstance(function00) ? 0x20000 : 0x10000);
        }
        if((v4 & 0x40) != 0) {
            v5 |= 0x180000;
        }
        else if((0x380000 & v2) == 0) {
            v5 |= (composer1.changedInstance(function01) ? 0x100000 : 0x80000);
        }
        if((v4 & 0x80) != 0) {
            v5 |= 0xC00000;
        }
        else if((0x1C00000 & v2) == 0) {
            v5 |= (composer1.changedInstance(function10) ? 0x800000 : 0x400000);
        }
        if((v4 & 0x100) != 0) {
            v5 |= 0x6000000;
        }
        else if((0xE000000 & v2) == 0) {
            v5 |= (composer1.changedInstance(function02) ? 0x4000000 : 0x2000000);
        }
        if((v4 & 0x200) != 0) {
            v5 |= 0x30000000;
        }
        else if((v2 & 0x70000000) == 0) {
            v5 |= (composer1.changedInstance(function03) ? 0x20000000 : 0x10000000);
        }
        if((v4 & 0x400) == 0) {
            v6 = (v3 & 14) == 0 ? v3 | (composer1.changedInstance(function04) ? 4 : 2) : v3;
        }
        else {
            v6 = v3 | 6;
        }
        if((v5 & 0x5B6DB6DB) != 306783378 || (v6 & 11) != 2 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v2 & 1) != 0 && !composer1.getDefaultsInvalid()) {
                composer1.skipToGroupEnd();
                if((v4 & 1) != 0) {
                    v5 &= -15;
                }
                modifier1 = modifier0;
            }
            else if((v4 & 1) == 0) {
                modifier1 = modifier0;
            }
            else {
                long v7 = MaterialTheme.INSTANCE.getColorScheme(composer1, MaterialTheme.$stable).getSurface-0d7_KjU();
                modifier1 = BackgroundKt.background-bw27NRU$default(Modifier.Companion, v7, null, 2, null);
                v5 &= -15;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1802642327, v5, v6, "com.kakao.kandinsky.resize.DefaultTypeToolbar (ReSizeScreen.kt:218)");
            }
            switch(WhenMappings.$EnumSwitchMapping$0[((Orientation)composer1.consume(OrientationKt.getLocalOrientation())).ordinal()]) {
                case 1: {
                    composer1.startReplaceGroup(-1097310169);
                    MeasurePolicy measurePolicy0 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer1, 0);
                    int v8 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
                    CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
                    Modifier modifier2 = ComposedModifierKt.materializeModifier(composer1, modifier1);
                    androidx.compose.ui.node.ComposeUiNode.Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
                    Function0 function05 = composeUiNode$Companion0.getConstructor();
                    if(composer1.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer1.startReusableNode();
                    if(composer1.getInserting()) {
                        composer1.createNode(function05);
                    }
                    else {
                        composer1.useNode();
                    }
                    Function2 function20 = androidx.room.a.r(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap0);
                    if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v8)) {
                        androidx.room.a.t(v8, composer1, v8, function20);
                    }
                    Updater.set-impl(composer1, modifier2, composeUiNode$Companion0.getSetModifier());
                    ReSizeScreenKt.c(v, v1, immutableList0, z, function00, function01, function10, function02, function03, function04, composer1, v5 >> 3 & 0xFFFFFFE | v6 << 27 & 0x70000000);
                    composer1.endNode();
                    composer1.endReplaceGroup();
                    break;
                }
                case 2: {
                    composer1.startReplaceGroup(-1097309469);
                    MeasurePolicy measurePolicy1 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getTop(), composer1, 0);
                    int v9 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
                    CompositionLocalMap compositionLocalMap1 = composer1.getCurrentCompositionLocalMap();
                    Modifier modifier3 = ComposedModifierKt.materializeModifier(composer1, modifier1);
                    androidx.compose.ui.node.ComposeUiNode.Companion composeUiNode$Companion1 = ComposeUiNode.Companion;
                    Function0 function06 = composeUiNode$Companion1.getConstructor();
                    if(composer1.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer1.startReusableNode();
                    if(composer1.getInserting()) {
                        composer1.createNode(function06);
                    }
                    else {
                        composer1.useNode();
                    }
                    Function2 function21 = androidx.room.a.r(composeUiNode$Companion1, composer1, measurePolicy1, composer1, compositionLocalMap1);
                    if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v9)) {
                        androidx.room.a.t(v9, composer1, v9, function21);
                    }
                    Updater.set-impl(composer1, modifier3, composeUiNode$Companion1.getSetModifier());
                    ReSizeScreenKt.c(v, v1, immutableList0, z, function00, function01, function10, function02, function03, function04, composer1, v5 >> 3 & 0xFFFFFFE | v6 << 27 & 0x70000000);
                    composer1.endNode();
                    composer1.endReplaceGroup();
                    break;
                }
                default: {
                    composer1.startReplaceGroup(-1097308815);
                    composer1.endReplaceGroup();
                }
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new j(modifier1, v, v1, immutableList0, z, function00, function01, function10, function02, function03, function04, v2, v3, v4));
        }
    }

    public static final void access$FixedSizeSelector-03bzQGs(long v, List list0, Function1 function10, Composer composer0, int v1) {
        ReSizeScreenKt.d(v, list0, function10, composer0, v1);
    }

    public static final void access$ResizePreview(Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0xAA0184E6);
        if(v != 0 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xAA0184E6, v, -1, "com.kakao.kandinsky.resize.ResizePreview (ReSizeScreen.kt:56)");
            }
            ThemeKt.KandinskyTheme(ComposableSingletons.ReSizeScreenKt.INSTANCE.getLambda-2$resize_release(), composer1, 6);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new ca.h(v, 9));
        }
    }

    public static final void access$ResizePreview2(Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0x5948A94C);
        if(v != 0 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x5948A94C, v, -1, "com.kakao.kandinsky.resize.ResizePreview2 (ReSizeScreen.kt:79)");
            }
            ThemeKt.KandinskyTheme(ComposableSingletons.ReSizeScreenKt.INSTANCE.getLambda-4$resize_release(), composer1, 6);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new ca.h(v, 10));
        }
    }

    public static final ResizeUiState access$ResizeScreen$lambda$0(State state0) {
        return (ResizeUiState)state0.getValue();
    }

    public static final TextFieldValue access$ResizeScreen$lambda$9$lambda$2(MutableState mutableState0) {
        return (TextFieldValue)mutableState0.getValue();
    }

    public static final void access$ResizeScreen$lambda$9$lambda$3(MutableState mutableState0, TextFieldValue textFieldValue0) {
        mutableState0.setValue(textFieldValue0);
    }

    public static final void access$ResizeTypeButton(Modifier modifier0, String s, boolean z, boolean z1, Function0 function00, Composer composer0, int v, int v1) {
        Modifier modifier1;
        long v5;
        int v2;
        Composer composer1 = composer0.startRestartGroup(-938290216);
        if((v1 & 1) == 0) {
            v2 = (v & 14) == 0 ? (composer1.changed(modifier0) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x70) == 0) {
            v2 |= (composer1.changed(s) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x380) == 0) {
            v2 |= (composer1.changed(z) ? 0x100 : 0x80);
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
        }
        else if((v & 0x1C00) == 0) {
            v2 |= (composer1.changed(z1) ? 0x800 : 0x400);
        }
        if((v1 & 16) != 0) {
            v2 |= 0x6000;
        }
        else if((0xE000 & v) == 0) {
            v2 |= (composer1.changedInstance(function00) ? 0x4000 : 0x2000);
        }
        if((0xB6DB & v2) != 9362 || !composer1.getSkipping()) {
            modifier1 = (v1 & 1) == 0 ? modifier0 : Modifier.Companion;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-938290216, v2, -1, "com.kakao.kandinsky.resize.ResizeTypeButton (ReSizeScreen.kt:451)");
            }
            Modifier modifier2 = SizeKt.height-3ABfNKs(modifier1, 50.0f);
            RoundedCornerShape roundedCornerShape0 = RoundedCornerShapeKt.RoundedCornerShape-0680j_4(8.0f);
            composer1.startReplaceGroup(0x95D63AC9);
            BorderStroke borderStroke0 = z ? BorderStrokeKt.BorderStroke-cXLIe8U(1.0f, MaterialTheme.INSTANCE.getColorScheme(composer1, MaterialTheme.$stable).getPrimary-0d7_KjU()) : null;
            composer1.endReplaceGroup();
            KDButtonDefaults kDButtonDefaults0 = KDButtonDefaults.INSTANCE;
            MaterialTheme materialTheme0 = MaterialTheme.INSTANCE;
            int v3 = MaterialTheme.$stable;
            long v4 = materialTheme0.getColorScheme(composer1, v3).getSecondaryContainer-0d7_KjU();
            if(z) {
                composer1.startReplaceGroup(-1781122074);
                v5 = materialTheme0.getColorScheme(composer1, v3).getPrimary-0d7_KjU();
            }
            else {
                composer1.startReplaceGroup(-1781122023);
                v5 = materialTheme0.getColorScheme(composer1, v3).getOnSecondaryContainer-0d7_KjU();
            }
            composer1.endReplaceGroup();
            KDButtonKt.KDButton(function00, modifier2, z1, roundedCornerShape0, kDButtonDefaults0.buttonColors-zf8z9n0(0.0f, v4, v5, 0L, 0L, composer1, KDButtonDefaults.$stable << 15, 25), borderStroke0, null, null, ComposableLambdaKt.rememberComposableLambda(0x86C7EF4F, true, new u(z, s), composer1, 54), composer1, v2 >> 12 & 14 | 0x6000000 | v2 >> 3 & 0x380, 0xC0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new v(modifier1, s, z, z1, function00, v, v1));
        }
    }

    public static final int access$toIntOrZero(TextFieldValue textFieldValue0) {
        Integer integer0 = o.toIntOrNull(textFieldValue0.getText());
        return integer0 == null ? 0 : ((int)integer0);
    }

    public static final void b(Modifier modifier0, boolean z, TextFieldValue textFieldValue0, Function1 function10, Function0 function00, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(-210454824);
        int v1 = (v & 14) == 0 ? (composer1.changed(modifier0) ? 4 : 2) | v : v;
        if((v & 0x70) == 0) {
            v1 |= (composer1.changed(z) ? 0x20 : 16);
        }
        if((v & 0x380) == 0) {
            v1 |= (composer1.changed(textFieldValue0) ? 0x100 : 0x80);
        }
        if((v & 0x1C00) == 0) {
            v1 |= (composer1.changedInstance(function10) ? 0x800 : 0x400);
        }
        if((v & 0xE000) == 0) {
            v1 |= (composer1.changedInstance(function00) ? 0x4000 : 0x2000);
        }
        if((0xB6DB & v1) != 9362 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-210454824, v1, -1, "com.kakao.kandinsky.resize.CustomTypeToolbar (ReSizeScreen.kt:310)");
            }
            composer1.startReplaceGroup(1315592909);
            FocusRequester focusRequester0 = composer1.rememberedValue();
            androidx.compose.runtime.Composer.Companion composer$Companion0 = Composer.Companion;
            if(focusRequester0 == composer$Companion0.getEmpty()) {
                focusRequester0 = new FocusRequester();
                composer1.updateRememberedValue(focusRequester0);
            }
            composer1.endReplaceGroup();
            Modifier modifier1 = FocusRequesterModifierKt.focusRequester(WindowInsetsPadding_androidKt.imePadding(modifier0), focusRequester0);
            composer1.startReplaceGroup(0x4E6A5BE3);
            c c0 = composer1.rememberedValue();
            if((0xE000 & v1) == 0x4000 || c0 == composer$Companion0.getEmpty()) {
                c0 = new c(function00, 14);
                composer1.updateRememberedValue(c0);
            }
            composer1.endReplaceGroup();
            ReSizeScreenKt.a(modifier1, z, textFieldValue0, function10, c0, composer1, v1 & 0x1FF0, 0);
            Unit unit0 = Unit.INSTANCE;
            composer1.startReplaceGroup(0x4E6A5CDE);
            i i0 = composer1.rememberedValue();
            if(i0 == composer$Companion0.getEmpty()) {
                i0 = new i(focusRequester0, null);
                composer1.updateRememberedValue(i0);
            }
            composer1.endReplaceGroup();
            EffectsKt.LaunchedEffect(unit0, i0, composer1, 70);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new qq(modifier0, z, textFieldValue0, function10, function00, v));
        }
    }

    public static final void c(long v, int v1, ImmutableList immutableList0, boolean z, Function0 function00, Function0 function01, Function1 function10, Function0 function02, Function0 function03, Function0 function04, Composer composer0, int v2) {
        Composer composer1 = composer0.startRestartGroup(1841118105);
        int v3 = (v2 & 14) == 0 ? (composer1.changed(v) ? 4 : 2) | v2 : v2;
        if((v2 & 0x70) == 0) {
            v3 |= (composer1.changed(v1) ? 0x20 : 16);
        }
        if((v2 & 0x380) == 0) {
            v3 |= (composer1.changed(immutableList0) ? 0x100 : 0x80);
        }
        if((v2 & 0x1C00) == 0) {
            v3 |= (composer1.changed(z) ? 0x800 : 0x400);
        }
        if((v2 & 0xE000) == 0) {
            v3 |= (composer1.changedInstance(function00) ? 0x4000 : 0x2000);
        }
        if((0x70000 & v2) == 0) {
            v3 |= (composer1.changedInstance(function01) ? 0x20000 : 0x10000);
        }
        if((v2 & 0x380000) == 0) {
            v3 |= (composer1.changedInstance(function10) ? 0x100000 : 0x80000);
        }
        if((0x1C00000 & v2) == 0) {
            v3 |= (composer1.changedInstance(function02) ? 0x800000 : 0x400000);
        }
        if((0xE000000 & v2) == 0) {
            v3 |= (composer1.changedInstance(function03) ? 0x4000000 : 0x2000000);
        }
        if((v2 & 0x70000000) == 0) {
            v3 |= (composer1.changedInstance(function04) ? 0x20000000 : 0x10000000);
        }
        if((v3 & 0x5B6DB6DB) != 306783378 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1841118105, v3, -1, "com.kakao.kandinsky.resize.DefaultTypeToolbarContent (ReSizeScreen.kt:268)");
            }
            Companion modifier$Companion0 = Modifier.Companion;
            SpacerKt.Spacer(SizeKt.size-VpY3zN4(modifier$Companion0, 10.0f, 20.0f), composer1, 6);
            ReSizeScreenKt.e(null, v, v1, function00, function01, composer1, v3 << 3 & 0x3F0 | v3 >> 3 & 0x1C00 | 0xE000 & v3 >> 3, 1);
            SpacerKt.Spacer(SizeKt.size-3ABfNKs(modifier$Companion0, 8.0f), composer1, 6);
            composer1.startReplaceGroup(-1014070071);
            ti ti0 = composer1.rememberedValue();
            if((v3 & 0x380000) == 0x100000 || ti0 == Composer.Companion.getEmpty()) {
                ti0 = new ti(function10, 13);
                composer1.updateRememberedValue(ti0);
            }
            composer1.endReplaceGroup();
            ReSizeScreenKt.d(v, immutableList0, ti0, composer1, v3 & 14 | v3 >> 3 & 0x70);
            SpacerKt.Spacer(SizeKt.size-VpY3zN4(modifier$Companion0, 10.0f, 20.0f), composer1, 6);
            FeatureBottomBarKt.CommonFeatureBottomBar(z, function02, function03, function04, ComposableSingletons.ReSizeScreenKt.INSTANCE.getLambda-5$resize_release(), composer1, v3 >> 9 & 14 | 0x6000 | v3 >> 18 & 0x70 | v3 >> 18 & 0x380 | v3 >> 18 & 0x1C00, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new k(v, v1, immutableList0, z, function00, function01, function10, function02, function03, function04, v2));
        }
    }

    public static final void d(long v, List list0, Function1 function10, Composer composer0, int v1) {
        Composer composer1 = composer0.startRestartGroup(-2081004833);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2081004833, v1, -1, "com.kakao.kandinsky.resize.FixedSizeSelector (ReSizeScreen.kt:404)");
        }
        composer1.startReplaceGroup(-1970575242);
        boolean z = composer1.changed(list0);
        Function3 function30 = composer1.rememberedValue();
        if(z || function30 == Composer.Companion.getEmpty()) {
            function30 = MovableContentKt.movableContentOf(ComposableLambdaKt.composableLambdaInstance(0xB4B7B7A1, true, new n(list0, v, function10)));
            composer1.updateRememberedValue(function30);
        }
        composer1.endReplaceGroup();
        switch(WhenMappings.$EnumSwitchMapping$0[((Orientation)composer1.consume(OrientationKt.getLocalOrientation())).ordinal()]) {
            case 1: {
                composer1.startReplaceGroup(-1970574745);
                FlowLayoutKt.FlowRow(PaddingKt.padding-VpY3zN4$default(Modifier.Companion, 20.0f, 0.0f, 2, null), Arrangement.INSTANCE.spacedBy-0680j_4(8.0f), Arrangement.INSTANCE.spacedBy-0680j_4(8.0f), 4, 0, null, ComposableLambdaKt.rememberComposableLambda(-2061257412, true, new l(function30), composer1, 54), composer1, 0x180DB6, 0x30);
                composer1.endReplaceGroup();
                break;
            }
            case 2: {
                composer1.startReplaceGroup(-1970574366);
                Modifier modifier0 = PaddingKt.padding-VpY3zN4$default(Modifier.Companion, 0.0f, 20.0f, 1, null);
                HorizontalOrVertical arrangement$HorizontalOrVertical0 = Arrangement.INSTANCE.spacedBy-0680j_4(8.0f);
                FlowLayoutKt.FlowColumn(modifier0, Arrangement.INSTANCE.spacedBy-0680j_4(8.0f), arrangement$HorizontalOrVertical0, 4, 0, null, ComposableLambdaKt.rememberComposableLambda(0xB3DFDDF9, true, new m(function30), composer1, 54), composer1, 0x180DB6, 0x30);
                composer1.endReplaceGroup();
                break;
            }
            default: {
                composer1.startReplaceGroup(-1970574026);
                composer1.endReplaceGroup();
            }
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new gc(v, list0, function10, v1, 2));
        }
    }

    public static final void e(Modifier modifier0, long v, int v1, Function0 function00, Function0 function01, Composer composer0, int v2, int v3) {
        Function0 function04;
        Function0 function03;
        Modifier modifier1;
        Function0 function02;
        int v4;
        Composer composer1 = composer0.startRestartGroup(0x8C92CAC8);
        if((v3 & 1) == 0) {
            v4 = (v2 & 14) == 0 ? (composer1.changed(modifier0) ? 4 : 2) | v2 : v2;
        }
        else {
            v4 = v2 | 6;
        }
        if((v3 & 2) != 0) {
            v4 |= 0x30;
        }
        else if((v2 & 0x70) == 0) {
            v4 |= (composer1.changed(v) ? 0x20 : 16);
        }
        if((v3 & 4) != 0) {
            v4 |= 0x180;
        }
        else if((v2 & 0x380) == 0) {
            v4 |= (composer1.changed(v1) ? 0x100 : 0x80);
        }
        if((v3 & 8) != 0) {
            v4 |= 0xC00;
        }
        else if((v2 & 0x1C00) == 0) {
            v4 |= (composer1.changedInstance(function00) ? 0x800 : 0x400);
        }
        if((v3 & 16) != 0) {
            v4 |= 0x6000;
            function02 = function01;
        }
        else if((0xE000 & v2) == 0) {
            function02 = function01;
            v4 |= (composer1.changedInstance(function02) ? 0x4000 : 0x2000);
        }
        else {
            function02 = function01;
        }
        if((0xB6DB & v4) != 9362 || !composer1.getSkipping()) {
            Modifier modifier2 = (v3 & 1) == 0 ? modifier0 : Modifier.Companion;
            Function0 function05 = (v3 & 8) == 0 ? function00 : pa.o.w;
            if((v3 & 16) != 0) {
                function02 = p.w;
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x8C92CAC8, v4, -1, "com.kakao.kandinsky.resize.ResizeController (ReSizeScreen.kt:343)");
            }
            composer1.startReplaceGroup(-169203087);
            Function5 function50 = composer1.rememberedValue();
            if(function50 == Composer.Companion.getEmpty()) {
                function50 = MovableContentKt.movableContentOf(ComposableLambdaKt.composableLambdaInstance(0x10004C4C, true, new com.kakao.kandinsky.resize.c(function05, function02)));
                composer1.updateRememberedValue(function50);
            }
            composer1.endReplaceGroup();
            switch(WhenMappings.$EnumSwitchMapping$0[((Orientation)composer1.consume(OrientationKt.getLocalOrientation())).ordinal()]) {
                case 1: {
                    composer1.startReplaceGroup(-169202141);
                    Modifier modifier3 = SizeKt.fillMaxWidth$default(PaddingKt.padding-VpY3zN4$default(modifier2, 20.0f, 0.0f, 2, null), 0.0f, 1, null);
                    MeasurePolicy measurePolicy0 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.spacedBy-0680j_4(8.0f), Alignment.Companion.getTop(), composer1, 6);
                    int v5 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
                    CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
                    Modifier modifier4 = ComposedModifierKt.materializeModifier(composer1, modifier3);
                    androidx.compose.ui.node.ComposeUiNode.Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
                    Function0 function06 = composeUiNode$Companion0.getConstructor();
                    if(composer1.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer1.startReusableNode();
                    if(composer1.getInserting()) {
                        composer1.createNode(function06);
                    }
                    else {
                        composer1.useNode();
                    }
                    Function2 function20 = androidx.room.a.r(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap0);
                    if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v5)) {
                        androidx.room.a.t(v5, composer1, v5, function20);
                    }
                    Updater.set-impl(composer1, modifier4, composeUiNode$Companion0.getSetModifier());
                    function50.invoke(SizeKt.height-3ABfNKs(RowScope.weight$default(RowScopeInstance.INSTANCE, Modifier.Companion, 1.0f, false, 2, null), 50.0f), IntSize.box-impl(v), v1, composer1, ((int)(v4 & 0x380 | (v4 & 0x70 | 0xC00))));
                    composer1.endNode();
                    composer1.endReplaceGroup();
                    break;
                }
                case 2: {
                    composer1.startReplaceGroup(0xF5EA2FF1);
                    Modifier modifier5 = SizeKt.fillMaxHeight$default(PaddingKt.padding-VpY3zN4$default(modifier2, 0.0f, 20.0f, 1, null), 0.0f, 1, null);
                    MeasurePolicy measurePolicy1 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.spacedBy-0680j_4(8.0f), Alignment.Companion.getStart(), composer1, 6);
                    int v6 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
                    CompositionLocalMap compositionLocalMap1 = composer1.getCurrentCompositionLocalMap();
                    Modifier modifier6 = ComposedModifierKt.materializeModifier(composer1, modifier5);
                    androidx.compose.ui.node.ComposeUiNode.Companion composeUiNode$Companion1 = ComposeUiNode.Companion;
                    Function0 function07 = composeUiNode$Companion1.getConstructor();
                    if(composer1.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer1.startReusableNode();
                    if(composer1.getInserting()) {
                        composer1.createNode(function07);
                    }
                    else {
                        composer1.useNode();
                    }
                    Function2 function21 = androidx.room.a.r(composeUiNode$Companion1, composer1, measurePolicy1, composer1, compositionLocalMap1);
                    if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v6)) {
                        androidx.room.a.t(v6, composer1, v6, function21);
                    }
                    Updater.set-impl(composer1, modifier6, composeUiNode$Companion1.getSetModifier());
                    function50.invoke(SizeKt.width-3ABfNKs(ColumnScope.weight$default(ColumnScopeInstance.INSTANCE, Modifier.Companion, 1.0f, false, 2, null), 50.0f), IntSize.box-impl(v), v1, composer1, ((int)(v4 & 0x380 | (v4 & 0x70 | 0xC00))));
                    composer1.endNode();
                    composer1.endReplaceGroup();
                    break;
                }
                default: {
                    composer1.startReplaceGroup(-169201261);
                    composer1.endReplaceGroup();
                }
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function04 = function02;
            modifier1 = modifier2;
            function03 = function05;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            function03 = function00;
            function04 = function02;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new q(modifier1, v, v1, function03, function04, v2, v3));
        }
    }
}

