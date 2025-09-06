package androidx.compose.foundation.text.input.internal;

import androidx.annotation.VisibleForTesting;
import androidx.compose.foundation.content.internal.ReceiveContentConfiguration;
import androidx.compose.ui.platform.PlatformTextInputSession;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.text.input.ImeOptions;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import m0.c;
import m0.d;
import m0.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0005\u001Aj\u0010\u0012\u001A\u00020\u0011*\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u00012\u0006\u0010\u0004\u001A\u00020\u00032\u0006\u0010\u0006\u001A\u00020\u00052\b\u0010\b\u001A\u0004\u0018\u00010\u00072\u0014\u0010\f\u001A\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000B\u0018\u00010\t2\u0010\b\u0002\u0010\u000E\u001A\n\u0012\u0004\u0012\u00020\u000B\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001A\u0004\u0018\u00010\u000FH\u0080@¢\u0006\u0004\b\u0012\u0010\u0013\u001An\u0010\u0012\u001A\u00020\u0011*\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u00012\u0006\u0010\u0004\u001A\u00020\u00032\u0006\u0010\u0006\u001A\u00020\u00052\b\u0010\b\u001A\u0004\u0018\u00010\u00072\u0014\u0010\f\u001A\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000B\u0018\u00010\t2\u0006\u0010\u0015\u001A\u00020\u00142\u000E\u0010\u000E\u001A\n\u0012\u0004\u0012\u00020\u000B\u0018\u00010\r2\b\u0010\u0010\u001A\u0004\u0018\u00010\u000FH\u0081@¢\u0006\u0004\b\u0012\u0010\u0016\"\u001A\u0010\u0018\u001A\u00020\u00178\u0000X\u0081T¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u0012\u0004\b\u001A\u0010\u001B¨\u0006\u001C"}, d2 = {"Landroidx/compose/ui/platform/PlatformTextInputSession;", "Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;", "state", "Landroidx/compose/foundation/text/input/internal/TextLayoutState;", "layoutState", "Landroidx/compose/ui/text/input/ImeOptions;", "imeOptions", "Landroidx/compose/foundation/content/internal/ReceiveContentConfiguration;", "receiveContentConfiguration", "Lkotlin/Function1;", "Landroidx/compose/ui/text/input/ImeAction;", "", "onImeAction", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "stylusHandwritingTrigger", "Landroidx/compose/ui/platform/ViewConfiguration;", "viewConfiguration", "", "platformSpecificTextInputSession", "(Landroidx/compose/ui/platform/PlatformTextInputSession;Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroidx/compose/foundation/text/input/internal/TextLayoutState;Landroidx/compose/ui/text/input/ImeOptions;Landroidx/compose/foundation/content/internal/ReceiveContentConfiguration;Lkotlin/jvm/functions/Function1;Lkotlinx/coroutines/flow/MutableSharedFlow;Landroidx/compose/ui/platform/ViewConfiguration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/foundation/text/input/internal/ComposeInputMethodManager;", "composeImm", "(Landroidx/compose/ui/platform/PlatformTextInputSession;Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroidx/compose/foundation/text/input/internal/TextLayoutState;Landroidx/compose/ui/text/input/ImeOptions;Landroidx/compose/foundation/content/internal/ReceiveContentConfiguration;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/text/input/internal/ComposeInputMethodManager;Lkotlinx/coroutines/flow/MutableSharedFlow;Landroidx/compose/ui/platform/ViewConfiguration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "TIA_DEBUG", "Z", "getTIA_DEBUG$annotations", "()V", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class AndroidTextInputSession_androidKt {
    public static final boolean TIA_DEBUG = false;
    public static final String[] a;

    static {
        AndroidTextInputSession_androidKt.a = new String[]{"*/*", "image/*", "video/*"};
    }

    @VisibleForTesting
    public static void getTIA_DEBUG$annotations() {
    }

    @VisibleForTesting
    @Nullable
    public static final Object platformSpecificTextInputSession(@NotNull PlatformTextInputSession platformTextInputSession0, @NotNull TransformedTextFieldState transformedTextFieldState0, @NotNull TextLayoutState textLayoutState0, @NotNull ImeOptions imeOptions0, @Nullable ReceiveContentConfiguration receiveContentConfiguration0, @Nullable Function1 function10, @NotNull ComposeInputMethodManager composeInputMethodManager0, @Nullable MutableSharedFlow mutableSharedFlow0, @Nullable ViewConfiguration viewConfiguration0, @NotNull Continuation continuation0) {
        d d0;
        if(continuation0 instanceof d) {
            d0 = (d)continuation0;
            int v = d0.p;
            if((v & 0x80000000) == 0) {
                d0 = new d(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
            }
            else {
                d0.p = v ^ 0x80000000;
            }
        }
        else {
            d0 = new d(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
        }
        Object object0 = d0.o;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(d0.p) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                i i0 = new i(platformTextInputSession0, transformedTextFieldState0, textLayoutState0, imeOptions0, receiveContentConfiguration0, function10, composeInputMethodManager0, mutableSharedFlow0, viewConfiguration0, null);
                d0.p = 1;
                if(CoroutineScopeKt.coroutineScope(i0, d0) == object1) {
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

    @Nullable
    public static final Object platformSpecificTextInputSession(@NotNull PlatformTextInputSession platformTextInputSession0, @NotNull TransformedTextFieldState transformedTextFieldState0, @NotNull TextLayoutState textLayoutState0, @NotNull ImeOptions imeOptions0, @Nullable ReceiveContentConfiguration receiveContentConfiguration0, @Nullable Function1 function10, @Nullable MutableSharedFlow mutableSharedFlow0, @Nullable ViewConfiguration viewConfiguration0, @NotNull Continuation continuation0) {
        c c0;
        if(continuation0 instanceof c) {
            c0 = (c)continuation0;
            int v = c0.p;
            if((v & 0x80000000) == 0) {
                c0 = new c(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
            }
            else {
                c0.p = v ^ 0x80000000;
            }
        }
        else {
            c0 = new c(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
        }
        Object object0 = c0.o;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(c0.p) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                ComposeInputMethodManager composeInputMethodManager0 = ComposeInputMethodManager_androidKt.ComposeInputMethodManager(platformTextInputSession0.getView());
                c0.p = 1;
                if(AndroidTextInputSession_androidKt.platformSpecificTextInputSession(platformTextInputSession0, transformedTextFieldState0, textLayoutState0, imeOptions0, receiveContentConfiguration0, function10, composeInputMethodManager0, mutableSharedFlow0, viewConfiguration0, c0) == object1) {
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

    public static Object platformSpecificTextInputSession$default(PlatformTextInputSession platformTextInputSession0, TransformedTextFieldState transformedTextFieldState0, TextLayoutState textLayoutState0, ImeOptions imeOptions0, ReceiveContentConfiguration receiveContentConfiguration0, Function1 function10, MutableSharedFlow mutableSharedFlow0, ViewConfiguration viewConfiguration0, Continuation continuation0, int v, Object object0) {
        MutableSharedFlow mutableSharedFlow1 = (v & 0x20) == 0 ? mutableSharedFlow0 : null;
        return (v & 0x40) == 0 ? AndroidTextInputSession_androidKt.platformSpecificTextInputSession(platformTextInputSession0, transformedTextFieldState0, textLayoutState0, imeOptions0, receiveContentConfiguration0, function10, mutableSharedFlow1, viewConfiguration0, continuation0) : AndroidTextInputSession_androidKt.platformSpecificTextInputSession(platformTextInputSession0, transformedTextFieldState0, textLayoutState0, imeOptions0, receiveContentConfiguration0, function10, mutableSharedFlow1, null, continuation0);
    }
}

