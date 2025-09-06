package androidx.compose.ui.platform;

import aa.d;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.Owner;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001A=\u0010\b\u001A\u00020\u0004*\u00020\u00002\'\u0010\u0007\u001A#\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001¢\u0006\u0002\b\u0006H\u0086@¢\u0006\u0004\b\b\u0010\t\u001A*\u0010\u0010\u001A\u00020\r2\u0006\u0010\u000B\u001A\u00020\n2\u0011\u0010\u000F\u001A\r\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0002\b\u000EH\u0007¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/platform/PlatformTextInputModifierNode;", "Lkotlin/Function2;", "Landroidx/compose/ui/platform/PlatformTextInputSessionScope;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "block", "establishTextInputSession", "(Landroidx/compose/ui/platform/PlatformTextInputModifierNode;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/ui/platform/PlatformTextInputInterceptor;", "interceptor", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "content", "InterceptPlatformTextInput", "(Landroidx/compose/ui/platform/PlatformTextInputInterceptor;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nPlatformTextInputModifierNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlatformTextInputModifierNode.kt\nandroidx/compose/ui/platform/PlatformTextInputModifierNodeKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,256:1\n1#2:257\n77#3:258\n1223#4,6:259\n*S KotlinDebug\n*F\n+ 1 PlatformTextInputModifierNode.kt\nandroidx/compose/ui/platform/PlatformTextInputModifierNodeKt\n*L\n164#1:258\n169#1:259,6\n*E\n"})
public final class PlatformTextInputModifierNodeKt {
    public static final ProvidableCompositionLocal a;

    static {
        PlatformTextInputModifierNodeKt.a = CompositionLocalKt.staticCompositionLocalOf(y.a0);
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    @ExperimentalComposeUiApi
    public static final void InterceptPlatformTextInput(@NotNull PlatformTextInputInterceptor platformTextInputInterceptor0, @NotNull Function2 function20, @Nullable Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(1315007550);
        int v1 = (v & 6) == 0 ? (((v & 8) == 0 ? composer1.changed(platformTextInputInterceptor0) : composer1.changedInstance(platformTextInputInterceptor0)) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (composer1.changedInstance(function20) ? 0x20 : 16);
        }
        if((v1 & 19) != 18 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1315007550, v1, -1, "androidx.compose.ui.platform.InterceptPlatformTextInput (PlatformTextInputModifierNode.kt:162)");
            }
            ProvidableCompositionLocal providableCompositionLocal0 = PlatformTextInputModifierNodeKt.a;
            w0 w00 = (w0)composer1.consume(providableCompositionLocal0);
            boolean z = composer1.changed(w00);
            w0 w01 = composer1.rememberedValue();
            if(z || w01 == Composer.Companion.getEmpty()) {
                w01 = new w0(platformTextInputInterceptor0, w00);
                composer1.updateRememberedValue(w01);
            }
            w01.b.setValue(platformTextInputInterceptor0);
            CompositionLocalKt.CompositionLocalProvider(providableCompositionLocal0.provides(w01), function20, composer1, v1 & 0x70 | ProvidedValue.$stable);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new d(platformTextInputInterceptor0, function20, v, 5));
        }
    }

    public static final Object a(Owner owner0, w0 w00, Function2 function20, Continuation continuation0) {
        g1 g10;
        if(continuation0 instanceof g1) {
            g10 = (g1)continuation0;
            int v = g10.p;
            if((v & 0x80000000) == 0) {
                g10 = new g1(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
            }
            else {
                g10.p = v ^ 0x80000000;
            }
        }
        else {
            g10 = new g1(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
        }
        Object object0 = g10.o;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(g10.p) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                if(w00 == null) {
                    g10.p = 1;
                    if(owner0.textInputSession(function20, g10) != object1) {
                        throw new KotlinNothingValueException();
                    }
                    return object1;
                }
                g10.p = 2;
                if(w00.a(owner0, function20, g10) == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                ResultKt.throwOnFailure(object0);
                throw new KotlinNothingValueException();
            }
            case 2: {
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        throw new KotlinNothingValueException();
    }

    @Nullable
    public static final Object establishTextInputSession(@NotNull PlatformTextInputModifierNode platformTextInputModifierNode0, @NotNull Function2 function20, @NotNull Continuation continuation0) {
        f1 f10;
        if(continuation0 instanceof f1) {
            f10 = (f1)continuation0;
            int v = f10.p;
            if((v & 0x80000000) == 0) {
                f10 = new f1(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
            }
            else {
                f10.p = v ^ 0x80000000;
            }
        }
        else {
            f10 = new f1(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
        }
        Object object0 = f10.o;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(f10.p) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                if(!platformTextInputModifierNode0.getNode().isAttached()) {
                    throw new IllegalArgumentException("establishTextInputSession called from an unattached node");
                }
                Owner owner0 = DelegatableNodeKt.requireOwner(platformTextInputModifierNode0);
                w0 w00 = (w0)DelegatableNodeKt.requireLayoutNode(platformTextInputModifierNode0).getCompositionLocalMap().get(PlatformTextInputModifierNodeKt.a);
                f10.p = 1;
                if(PlatformTextInputModifierNodeKt.a(owner0, w00, function20, f10) == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        throw new KotlinNothingValueException();
    }
}

