package z;

import androidx.compose.foundation.gestures.PressGestureScopeImpl;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException;
import androidx.compose.ui.input.pointer.PointerInputChange;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref.ObjectRef;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import qd.a;

public final class m3 extends RestrictedSuspendLambda implements Function2 {
    public final PressGestureScopeImpl A;
    public Object p;
    public Object q;
    public ObjectRef r;
    public long s;
    public int t;
    public Object u;
    public final CoroutineScope v;
    public final Function3 w;
    public final Function1 x;
    public final Function1 y;
    public final Function1 z;

    public m3(CoroutineScope coroutineScope0, Function3 function30, Function1 function10, Function1 function11, Function1 function12, PressGestureScopeImpl pressGestureScopeImpl0, Continuation continuation0) {
        this.v = coroutineScope0;
        this.w = function30;
        this.x = function10;
        this.y = function11;
        this.z = function12;
        this.A = pressGestureScopeImpl0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new m3(this.v, this.w, this.x, this.y, this.z, this.A, continuation0);
        continuation1.u = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((m3)this.create(((AwaitPointerEventScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        AwaitPointerEventScope awaitPointerEventScope0;
        ObjectRef ref$ObjectRef0;
        PointerInputChange pointerInputChange0;
        a3 a30;
        AwaitPointerEventScope awaitPointerEventScope6;
        Object object6;
        AwaitPointerEventScope awaitPointerEventScope5;
        ObjectRef ref$ObjectRef2;
        PointerInputChange pointerInputChange2;
        AwaitPointerEventScope awaitPointerEventScope4;
        Object object3;
        ObjectRef ref$ObjectRef1;
        long v;
        PointerInputChange pointerInputChange1;
        AwaitPointerEventScope awaitPointerEventScope2;
        Object object2;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        PressGestureScopeImpl pressGestureScopeImpl0 = this.A;
        Function1 function10 = this.z;
        Function1 function11 = this.x;
        Function3 function30 = this.w;
        switch(this.t) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                AwaitPointerEventScope awaitPointerEventScope1 = (AwaitPointerEventScope)this.u;
                this.u = awaitPointerEventScope1;
                this.t = 1;
                object2 = TapGestureDetectorKt.awaitFirstDown$default(awaitPointerEventScope1, false, null, this, 3, null);
                if(object2 == object1) {
                    return object1;
                }
                awaitPointerEventScope2 = awaitPointerEventScope1;
                goto label_26;
            }
            case 1: {
                AwaitPointerEventScope awaitPointerEventScope3 = (AwaitPointerEventScope)this.u;
                ResultKt.throwOnFailure(object0);
                awaitPointerEventScope2 = awaitPointerEventScope3;
                object2 = object0;
            label_26:
                pointerInputChange1 = (PointerInputChange)object2;
                pointerInputChange1.consume();
                b3 b30 = new b3(pressGestureScopeImpl0, null);
                BuildersKt.launch$default(this.v, null, null, b30, 3, null);
                if(function30 != TapGestureDetectorKt.a) {
                    c3 c30 = new c3(function30, pressGestureScopeImpl0, pointerInputChange1, null);
                    BuildersKt.launch$default(this.v, null, null, c30, 3, null);
                }
                v = function11 == null ? 0x3FFFFFFFFFFFFFFFL : awaitPointerEventScope2.getViewConfiguration().getLongPressTimeoutMillis();
                ref$ObjectRef1 = new ObjectRef();
                try {
                    d3 d30 = new d3(2, null);  // 初始化器: Lkotlin/coroutines/jvm/internal/RestrictedSuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V
                    this.u = awaitPointerEventScope2;
                    this.p = pointerInputChange1;
                    this.q = ref$ObjectRef1;
                    this.r = ref$ObjectRef1;
                    this.s = v;
                    this.t = 2;
                    object3 = awaitPointerEventScope2.withTimeout(v, d30, this);
                    if(object3 == object1) {
                        return object1;
                    }
                }
                catch(PointerEventTimeoutCancellationException unused_ex) {
                    awaitPointerEventScope5 = awaitPointerEventScope2;
                    goto label_76;
                }
                awaitPointerEventScope4 = awaitPointerEventScope2;
                pointerInputChange2 = pointerInputChange1;
                ref$ObjectRef2 = ref$ObjectRef1;
                goto label_63;
            }
            case 2: {
                v = this.s;
                ref$ObjectRef1 = this.r;
                ObjectRef ref$ObjectRef3 = (ObjectRef)this.q;
                pointerInputChange1 = (PointerInputChange)this.p;
                awaitPointerEventScope2 = (AwaitPointerEventScope)this.u;
                try {
                    ResultKt.throwOnFailure(object0);
                    awaitPointerEventScope4 = awaitPointerEventScope2;
                    pointerInputChange2 = pointerInputChange1;
                    ref$ObjectRef2 = ref$ObjectRef3;
                    object3 = object0;
                    goto label_63;
                }
                catch(PointerEventTimeoutCancellationException unused_ex) {
                    ref$ObjectRef1 = ref$ObjectRef3;
                }
                awaitPointerEventScope5 = awaitPointerEventScope2;
                goto label_76;
                try {
                label_63:
                    ref$ObjectRef1.element = object3;
                    Object object4 = ref$ObjectRef2.element;
                    if(object4 == null) {
                        e3 e30 = new e3(pressGestureScopeImpl0, null);
                        BuildersKt.launch$default(this.v, null, null, e30, 3, null);
                    }
                    else {
                        ((PointerInputChange)object4).consume();
                        f3 f30 = new f3(pressGestureScopeImpl0, null);
                        BuildersKt.launch$default(this.v, null, null, f30, 3, null);
                    }
                    goto label_94;
                }
                catch(PointerEventTimeoutCancellationException unused_ex) {
                    ref$ObjectRef1 = ref$ObjectRef2;
                    pointerInputChange1 = pointerInputChange2;
                    awaitPointerEventScope5 = awaitPointerEventScope4;
                }
            label_76:
                if(function11 != null) {
                    function11.invoke(Offset.box-impl(pointerInputChange1.getPosition-F1C5BW0()));
                }
                this.u = awaitPointerEventScope5;
                this.p = ref$ObjectRef1;
                this.q = null;
                this.r = null;
                this.s = v;
                this.t = 3;
                if(TapGestureDetectorKt.access$consumeUntilUp(awaitPointerEventScope5, this) == object1) {
                    return object1;
                }
                goto label_90;
            }
            case 3: {
                v = this.s;
                ref$ObjectRef1 = (ObjectRef)this.p;
                awaitPointerEventScope5 = (AwaitPointerEventScope)this.u;
                ResultKt.throwOnFailure(object0);
            label_90:
                g3 g30 = new g3(pressGestureScopeImpl0, null);
                BuildersKt.launch$default(this.v, null, null, g30, 3, null);
                ref$ObjectRef2 = ref$ObjectRef1;
                awaitPointerEventScope4 = awaitPointerEventScope5;
            label_94:
                Object object5 = ref$ObjectRef2.element;
                if(object5 != null) {
                    if(this.y != null) {
                        this.u = awaitPointerEventScope4;
                        this.p = ref$ObjectRef2;
                        this.q = null;
                        this.r = null;
                        this.s = v;
                        this.t = 4;
                        object6 = TapGestureDetectorKt.access$awaitSecondDown(awaitPointerEventScope4, ((PointerInputChange)object5), this);
                        if(object6 == object1) {
                            return object1;
                        }
                        awaitPointerEventScope6 = awaitPointerEventScope4;
                        goto label_117;
                    }
                    else if(function10 != null) {
                        function10.invoke(Offset.box-impl(((PointerInputChange)object5).getPosition-F1C5BW0()));
                        return Unit.INSTANCE;
                    }
                }
                break;
            }
            case 4: {
                v = this.s;
                ObjectRef ref$ObjectRef4 = (ObjectRef)this.p;
                awaitPointerEventScope6 = (AwaitPointerEventScope)this.u;
                ResultKt.throwOnFailure(object0);
                ref$ObjectRef2 = ref$ObjectRef4;
                object6 = object0;
            label_117:
                PointerInputChange pointerInputChange3 = (PointerInputChange)object6;
                if(pointerInputChange3 != null) {
                    h3 h30 = new h3(pressGestureScopeImpl0, null);
                    BuildersKt.launch$default(this.v, null, null, h30, 3, null);
                    if(function30 != TapGestureDetectorKt.a) {
                        i3 i30 = new i3(function30, pressGestureScopeImpl0, pointerInputChange3, null);
                        BuildersKt.launch$default(this.v, null, null, i30, 3, null);
                    }
                    try {
                        l3 l30 = new l3(this.v, this.y, this.z, ref$ObjectRef2, pressGestureScopeImpl0, null);
                        this.u = awaitPointerEventScope6;
                        this.p = ref$ObjectRef2;
                        this.q = pointerInputChange3;
                        this.t = 5;
                        if(awaitPointerEventScope6.withTimeout(v, l30, this) == object1) {
                            return object1;
                        }
                        break;
                    }
                    catch(PointerEventTimeoutCancellationException unused_ex) {
                        pointerInputChange0 = pointerInputChange3;
                        awaitPointerEventScope0 = awaitPointerEventScope6;
                        ref$ObjectRef0 = ref$ObjectRef2;
                    }
                label_137:
                    if(function10 != null) {
                        function10.invoke(Offset.box-impl(((PointerInputChange)ref$ObjectRef0.element).getPosition-F1C5BW0()));
                    }
                    if(function11 != null) {
                        function11.invoke(Offset.box-impl(pointerInputChange0.getPosition-F1C5BW0()));
                    }
                    this.u = null;
                    this.p = null;
                    this.q = null;
                    this.t = 6;
                    if(TapGestureDetectorKt.access$consumeUntilUp(awaitPointerEventScope0, this) == object1) {
                        return object1;
                    }
                    a30 = new a3(pressGestureScopeImpl0, null);
                    BuildersKt.launch$default(this.v, null, null, a30, 3, null);
                    return Unit.INSTANCE;
                }
                else if(function10 != null) {
                    function10.invoke(Offset.box-impl(((PointerInputChange)ref$ObjectRef2.element).getPosition-F1C5BW0()));
                    return Unit.INSTANCE;
                }
                break;
            }
            case 5: {
                pointerInputChange0 = (PointerInputChange)this.q;
                ref$ObjectRef0 = (ObjectRef)this.p;
                awaitPointerEventScope0 = (AwaitPointerEventScope)this.u;
                try {
                    ResultKt.throwOnFailure(object0);
                    return Unit.INSTANCE;
                }
                catch(PointerEventTimeoutCancellationException unused_ex) {
                    goto label_137;
                }
            }
            case 6: {
                ResultKt.throwOnFailure(object0);
                a30 = new a3(pressGestureScopeImpl0, null);
                BuildersKt.launch$default(this.v, null, null, a30, 3, null);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        return Unit.INSTANCE;
    }
}

