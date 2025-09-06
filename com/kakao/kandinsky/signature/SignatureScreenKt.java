package com.kakao.kandinsky.signature;

import aa.q;
import aa.w;
import android.content.Context;
import androidx.activity.compose.ActivityResultRegistryKt;
import androidx.activity.compose.BackHandlerKt;
import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia;
import androidx.compose.material3.ki;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer.Companion;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.compose.FlowExtKt;
import com.kakao.kandinsky.base.ConsumeDialogKt;
import com.kakao.kandinsky.base.contract.DialogUiState;
import com.kakao.kandinsky.designsystem.common.RotatableScreenKt;
import com.kakao.kandinsky.signature.contract.SignatureEvent.ShowDialog;
import com.kakao.kandinsky.signature.contract.SignatureState.TextEditor;
import com.kakao.kandinsky.signature.contract.SignatureState;
import com.kakao.kandinsky.signature.contract.SignatureUiState;
import com.kakao.kandinsky.signature.ui.SavedSignatureBottomSheetKt;
import com.kakao.kandinsky.textedit.TextEditorKt;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;
import sa.b;
import sa.c;
import sa.d;
import sa.e;
import sa.f;
import sa.g;
import sa.l;

@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001A\u007F\u0010\u0000\u001A\u00020\u00012\f\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00040\u00032\u0012\u0010\u0005\u001A\u000E\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00062\u0012\u0010\b\u001A\u000E\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00062\f\u0010\t\u001A\b\u0012\u0004\u0012\u00020\u00010\n2\f\u0010\u000B\u001A\b\u0012\u0004\u0012\u00020\u00010\n2\u001E\u0010\f\u001A\u001A\u0012\u0010\u0012\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000F0\u000E0\r\u0012\u0004\u0012\u00020\u00010\u0006H\u0007¢\u0006\u0002\u0010\u0010\u001AQ\u0010\u0011\u001A\u00020\u00012\u0006\u0010\u0012\u001A\u00020\u00132\u0012\u0010\u0005\u001A\u000E\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00062\u0018\u0010\b\u001A\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00010\u00142\f\u0010\t\u001A\b\u0012\u0004\u0012\u00020\u00010\nH\u0007¢\u0006\u0002\u0010\u0016¨\u0006\u0017²\u0006\n\u0010\u0018\u001A\u00020\u0019X\u008A\u0084\u0002²\u0006\u0018\u0010\f\u001A\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000F0\u000E\u0018\u00010\rX\u008A\u008E\u0002²\u0006\u0012\u0010\u001A\u001A\n\u0012\u0004\u0012\u00020\u000F\u0018\u00010\u000EX\u008A\u0084\u0002"}, d2 = {"ConsumeEvent", "", "event", "Lkotlinx/coroutines/flow/SharedFlow;", "Lcom/kakao/kandinsky/signature/contract/SignatureEvent;", "onConfirm", "Lkotlin/Function1;", "Lcom/kakao/kandinsky/core/kdphoto/KDPhoto;", "onMultipleConfirm", "goHomeState", "Lkotlin/Function0;", "showImageSelector", "showHistory", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/kakao/kandinsky/core/kdphoto/Signature;", "(Lkotlinx/coroutines/flow/SharedFlow;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "SignatureScreen", "viewModel", "Lcom/kakao/kandinsky/signature/SignatureVieModel;", "Lkotlin/Function2;", "", "(Lcom/kakao/kandinsky/signature/SignatureVieModel;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "signature_release", "uiState", "Lcom/kakao/kandinsky/signature/contract/SignatureUiState;", "histories"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSignatureScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SignatureScreen.kt\ncom/kakao/kandinsky/signature/SignatureScreenKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 5 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 6 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 7 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,261:1\n77#2:262\n1223#3,6:263\n1223#3,6:269\n1223#3,6:275\n1223#3,6:281\n1223#3,6:287\n1223#3,6:293\n1223#3,6:299\n36#4:305\n21#4:306\n23#4:310\n53#4,3:311\n50#5:307\n55#5:309\n107#6:308\n81#7:314\n81#7:315\n107#7,2:316\n81#7:318\n*S KotlinDebug\n*F\n+ 1 SignatureScreen.kt\ncom/kakao/kandinsky/signature/SignatureScreenKt\n*L\n38#1:262\n59#1:263,6\n61#1:269,6\n69#1:275,6\n80#1:281,6\n199#1:287,6\n203#1:293,6\n207#1:299,6\n227#1:305\n227#1:306\n227#1:310\n227#1:311,3\n227#1:307\n227#1:309\n227#1:308\n37#1:314\n59#1:315\n59#1:316,2\n194#1:318\n*E\n"})
public final class SignatureScreenKt {
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void ConsumeEvent(@NotNull SharedFlow sharedFlow0, @NotNull Function1 function10, @NotNull Function1 function11, @NotNull Function0 function00, @NotNull Function0 function01, @NotNull Function1 function12, @Nullable Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(sharedFlow0, "event");
        Intrinsics.checkNotNullParameter(function10, "onConfirm");
        Intrinsics.checkNotNullParameter(function11, "onMultipleConfirm");
        Intrinsics.checkNotNullParameter(function00, "goHomeState");
        Intrinsics.checkNotNullParameter(function01, "showImageSelector");
        Intrinsics.checkNotNullParameter(function12, "showHistory");
        Composer composer1 = composer0.startRestartGroup(0x7E92DC6);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x7E92DC6, v, -1, "com.kakao.kandinsky.signature.ConsumeEvent (SignatureScreen.kt:225)");
        }
        ConsumeDialogKt.ConsumeDialog(new Flow() {
            @Override  // kotlinx.coroutines.flow.Flow
            @Nullable
            public Object collect(@NotNull FlowCollector flowCollector0, @NotNull Continuation continuation0) {
                com.kakao.kandinsky.signature.SignatureScreenKt.ConsumeEvent..inlined.map.1.2 signatureScreenKt$ConsumeEvent$$inlined$map$1$20 = new FlowCollector() {
                    @Override  // kotlinx.coroutines.flow.FlowCollector
                    @Nullable
                    public final Object emit(Object object0, @NotNull Continuation continuation0) {
                        com.kakao.kandinsky.signature.SignatureScreenKt.ConsumeEvent..inlined.map.1.2.1 signatureScreenKt$ConsumeEvent$$inlined$map$1$2$10;
                        if(continuation0 instanceof com.kakao.kandinsky.signature.SignatureScreenKt.ConsumeEvent..inlined.map.1.2.1) {
                            signatureScreenKt$ConsumeEvent$$inlined$map$1$2$10 = (com.kakao.kandinsky.signature.SignatureScreenKt.ConsumeEvent..inlined.map.1.2.1)continuation0;
                            int v = signatureScreenKt$ConsumeEvent$$inlined$map$1$2$10.p;
                            if((v & 0x80000000) == 0) {
                                signatureScreenKt$ConsumeEvent$$inlined$map$1$2$10 = new ContinuationImpl(/*ERROR_MISSING_ARG_1/*) {
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
                                signatureScreenKt$ConsumeEvent$$inlined$map$1$2$10.p = v ^ 0x80000000;
                            }
                        }
                        else {
                            signatureScreenKt$ConsumeEvent$$inlined$map$1$2$10 = new ContinuationImpl(/*ERROR_MISSING_ARG_1/*) {
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
                        Object object1 = signatureScreenKt$ConsumeEvent$$inlined$map$1$2$10.o;
                        Object object2 = a.getCOROUTINE_SUSPENDED();
                        switch(signatureScreenKt$ConsumeEvent$$inlined$map$1$2$10.p) {
                            case 0: {
                                ResultKt.throwOnFailure(object1);
                                DialogUiState dialogUiState0 = ((ShowDialog)object0).getDialog();
                                signatureScreenKt$ConsumeEvent$$inlined$map$1$2$10.p = 1;
                                return this.a.emit(dialogUiState0, signatureScreenKt$ConsumeEvent$$inlined$map$1$2$10) == object2 ? object2 : Unit.INSTANCE;
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
                Object object0 = new com.kakao.kandinsky.signature.SignatureScreenKt.ConsumeEvent..inlined.filterIsInstance.1(sharedFlow0).collect(signatureScreenKt$ConsumeEvent$$inlined$map$1$20, continuation0);
                return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
            }
        }, composer1, 8);
        EffectsKt.LaunchedEffect(sharedFlow0, new b(sharedFlow0, function00, function01, function12, function10, function11, null), composer1, 72);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new ki(sharedFlow0, function10, function11, function00, function01, function12, v, 6));
        }

        @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001F\u0010\u0002\u001A\u00020\u00032\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\n"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$$inlined$unsafeFlow$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$filter$$inlined$unsafeTransform$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$filterIsInstance$$inlined$filter$1"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
        @SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,113:1\n51#2,5:114\n*E\n"})
        public final class com.kakao.kandinsky.signature.SignatureScreenKt.ConsumeEvent..inlined.filterIsInstance.1 implements Flow {
            public com.kakao.kandinsky.signature.SignatureScreenKt.ConsumeEvent..inlined.filterIsInstance.1(Flow flow0) {
            }

            @Override  // kotlinx.coroutines.flow.Flow
            @Nullable
            public Object collect(@NotNull FlowCollector flowCollector0, @NotNull Continuation continuation0) {
                com.kakao.kandinsky.signature.SignatureScreenKt.ConsumeEvent..inlined.filterIsInstance.1.2 signatureScreenKt$ConsumeEvent$$inlined$filterIsInstance$1$20 = new FlowCollector() {
                    @Override  // kotlinx.coroutines.flow.FlowCollector
                    @Nullable
                    public final Object emit(Object object0, @NotNull Continuation continuation0) {
                        com.kakao.kandinsky.signature.SignatureScreenKt.ConsumeEvent..inlined.filterIsInstance.1.2.1 signatureScreenKt$ConsumeEvent$$inlined$filterIsInstance$1$2$10;
                        if(continuation0 instanceof com.kakao.kandinsky.signature.SignatureScreenKt.ConsumeEvent..inlined.filterIsInstance.1.2.1) {
                            signatureScreenKt$ConsumeEvent$$inlined$filterIsInstance$1$2$10 = (com.kakao.kandinsky.signature.SignatureScreenKt.ConsumeEvent..inlined.filterIsInstance.1.2.1)continuation0;
                            int v = signatureScreenKt$ConsumeEvent$$inlined$filterIsInstance$1$2$10.p;
                            if((v & 0x80000000) == 0) {
                                signatureScreenKt$ConsumeEvent$$inlined$filterIsInstance$1$2$10 = new ContinuationImpl(/*ERROR_MISSING_ARG_1/*) {
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
                                signatureScreenKt$ConsumeEvent$$inlined$filterIsInstance$1$2$10.p = v ^ 0x80000000;
                            }
                        }
                        else {
                            signatureScreenKt$ConsumeEvent$$inlined$filterIsInstance$1$2$10 = new ContinuationImpl(/*ERROR_MISSING_ARG_1/*) {
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
                        Object object1 = signatureScreenKt$ConsumeEvent$$inlined$filterIsInstance$1$2$10.o;
                        Object object2 = a.getCOROUTINE_SUSPENDED();
                        switch(signatureScreenKt$ConsumeEvent$$inlined$filterIsInstance$1$2$10.p) {
                            case 0: {
                                ResultKt.throwOnFailure(object1);
                                if(object0 instanceof ShowDialog) {
                                    signatureScreenKt$ConsumeEvent$$inlined$filterIsInstance$1$2$10.p = 1;
                                    if(this.a.emit(object0, signatureScreenKt$ConsumeEvent$$inlined$filterIsInstance$1$2$10) == object2) {
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
                Object object0 = this.a.collect(signatureScreenKt$ConsumeEvent$$inlined$filterIsInstance$1$20, continuation0);
                return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
            }
        }

    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void SignatureScreen(@NotNull SignatureVieModel signatureVieModel0, @NotNull Function1 function10, @NotNull Function2 function20, @NotNull Function0 function00, @Nullable Composer composer0, int v) {
        MutableState mutableState1;
        Intrinsics.checkNotNullParameter(signatureVieModel0, "viewModel");
        Intrinsics.checkNotNullParameter(function10, "onConfirm");
        Intrinsics.checkNotNullParameter(function20, "onMultipleConfirm");
        Intrinsics.checkNotNullParameter(function00, "goHomeState");
        Composer composer1 = composer0.startRestartGroup(0xD9AC0D90);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xD9AC0D90, v, -1, "com.kakao.kandinsky.signature.SignatureScreen (SignatureScreen.kt:35)");
        }
        State state0 = FlowExtKt.collectAsStateWithLifecycle(signatureVieModel0.getUiState(), null, null, null, composer1, 8, 7);
        Context context0 = (Context)composer1.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        ManagedActivityResultLauncher managedActivityResultLauncher0 = ActivityResultRegistryKt.rememberLauncherForActivityResult(new PickVisualMedia(), new b2(21, context0, state0), composer1, 8);
        composer1.startReplaceGroup(-540764370);
        MutableState mutableState0 = composer1.rememberedValue();
        Companion composer$Companion0 = Composer.Companion;
        if(mutableState0 == composer$Companion0.getEmpty()) {
            mutableState0 = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
            composer1.updateRememberedValue(mutableState0);
        }
        composer1.endReplaceGroup();
        composer1.startReplaceGroup(0xDFC49779);
        boolean z = composer1.changed(state0);
        c c0 = composer1.rememberedValue();
        if(z || c0 == composer$Companion0.getEmpty()) {
            c0 = new c(state0);
            composer1.updateRememberedValue(c0);
        }
        composer1.endReplaceGroup();
        boolean z1 = false;
        BackHandlerKt.BackHandler(false, c0, composer1, 0, 1);
        SharedFlow sharedFlow0 = signatureVieModel0.getEvent();
        composer1.startReplaceGroup(-540764023);
        boolean z2 = composer1.changed(state0);
        if((v & 0x380 ^ 0x180) > 0x100 && composer1.changed(function20) || (v & 0x180) == 0x100) {
            z1 = true;
        }
        d d0 = composer1.rememberedValue();
        if(z1 || z2 || d0 == composer$Companion0.getEmpty()) {
            d0 = new d(function20, state0);
            composer1.updateRememberedValue(d0);
        }
        composer1.endReplaceGroup();
        e e0 = new e(managedActivityResultLauncher0);
        composer1.startReplaceGroup(0xDFC49AAE);
        q q0 = composer1.rememberedValue();
        if(q0 == composer$Companion0.getEmpty()) {
            q0 = new q(mutableState0, 18);
            composer1.updateRememberedValue(q0);
        }
        composer1.endReplaceGroup();
        SignatureScreenKt.ConsumeEvent(sharedFlow0, function10, d0, function00, e0, q0, composer1, v & 0x70 | 0x30008 | v & 0x1C00);
        composer1.startReplaceGroup(0xDFC49ADC);
        SignatureState signatureState0 = ((SignatureUiState)state0.getValue()).getState();
        if(signatureState0 instanceof TextEditor) {
            composer1.startReplaceGroup(0xF2EB9161);
            TextEditorKt.TextSignatureEditor("sign-tab", ((SignatureUiState)state0.getValue()).getFonts(), ((TextEditor)signatureState0).getTextData(), ((TextEditor)signatureState0).getWaterMark(), new f(((TextEditor)signatureState0)), new g(((TextEditor)signatureState0)), composer1, 70);
            composer1.endReplaceGroup();
            mutableState1 = mutableState0;
        }
        else {
            composer1.startReplaceGroup(0xF2EB93C7);
            mutableState1 = mutableState0;
            RotatableScreenKt.RotatableScreen-FHprtrg(null, null, ((SignatureUiState)state0.getValue()).getOnChangedContentBounds(), null, 0L, ComposableLambdaKt.rememberComposableLambda(0x643FD868, true, new l(signatureState0, state0), composer1, 54), composer1, 0x30000, 27);
            composer1.endReplaceGroup();
        }
        composer1.endReplaceGroup();
        Flow flow0 = (Flow)mutableState1.getValue();
        if(flow0 != null) {
            List list0 = (List)SnapshotStateKt.collectAsState(flow0, null, null, composer1, 56, 2).getValue();
            composer1.startReplaceGroup(0xDFC4AED0);
            if(list0 != null) {
                composer1.startReplaceGroup(0x2435720E);
                boolean z3 = composer1.changed(state0);
                w w0 = composer1.rememberedValue();
                if(z3 || w0 == composer$Companion0.getEmpty()) {
                    w0 = new w(state0, 14);
                    composer1.updateRememberedValue(w0);
                }
                composer1.endReplaceGroup();
                composer1.startReplaceGroup(607482572);
                boolean z4 = composer1.changed(state0);
                w w1 = composer1.rememberedValue();
                if(z4 || w1 == composer$Companion0.getEmpty()) {
                    w1 = new w(state0, 15);
                    composer1.updateRememberedValue(w1);
                }
                composer1.endReplaceGroup();
                composer1.startReplaceGroup(607482761);
                q q1 = composer1.rememberedValue();
                if(q1 == composer$Companion0.getEmpty()) {
                    q1 = new q(mutableState1, 19);
                    composer1.updateRememberedValue(q1);
                }
                composer1.endReplaceGroup();
                SavedSignatureBottomSheetKt.SavedSignatureBottomSheet(list0, w0, w1, q1, composer1, 3080);
            }
            composer1.endReplaceGroup();
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new aa.g(signatureVieModel0, function10, function20, function00, v, 7));
        }
    }

    public static final SignatureUiState access$SignatureScreen$lambda$0(State state0) {
        return (SignatureUiState)state0.getValue();
    }

    public static final void access$SignatureScreen$lambda$3(MutableState mutableState0, Flow flow0) {
        mutableState0.setValue(flow0);
    }
}

