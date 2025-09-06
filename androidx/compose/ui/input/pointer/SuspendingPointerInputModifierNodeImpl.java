package androidx.compose.ui.input.pointer;

import androidx.compose.foundation.layout.b4;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;
import s.h1;
import x1.p;
import x1.q;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\f\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001DB^\u0012\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u0005\u0012\u0014\b\u0002\u0010\t\u001A\u000E\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0005\u0018\u00010\b\u0012\'\u0010\u000E\u001A#\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000B\u0012\u0006\u0012\u0004\u0018\u00010\u00050\n\u00A2\u0006\u0002\b\r\u00A2\u0006\u0004\b\u000F\u0010\u0010J`\u0010\u0012\u001A\u00020\f2\b\u0010\u0006\u001A\u0004\u0018\u00010\u00052\b\u0010\u0007\u001A\u0004\u0018\u00010\u00052\u0012\u0010\t\u001A\u000E\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0005\u0018\u00010\b2\'\u0010\u000E\u001A#\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000B\u0012\u0006\u0012\u0004\u0018\u00010\u00050\n\u00A2\u0006\u0002\b\rH\u0000\u00A2\u0006\u0004\b\u0011\u0010\u0010J\u000F\u0010\u0013\u001A\u00020\fH\u0016\u00A2\u0006\u0004\b\u0013\u0010\u0014J\u000F\u0010\u0015\u001A\u00020\fH\u0016\u00A2\u0006\u0004\b\u0015\u0010\u0014J\u000F\u0010\u0016\u001A\u00020\fH\u0016\u00A2\u0006\u0004\b\u0016\u0010\u0014J\u000F\u0010\u0017\u001A\u00020\fH\u0016\u00A2\u0006\u0004\b\u0017\u0010\u0014J*\u0010 \u001A\u00020\f2\u0006\u0010\u0019\u001A\u00020\u00182\u0006\u0010\u001B\u001A\u00020\u001A2\u0006\u0010\u001D\u001A\u00020\u001CH\u0016\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001E\u0010\u001FJ\u000F\u0010!\u001A\u00020\fH\u0016\u00A2\u0006\u0004\b!\u0010\u0014J?\u0010%\u001A\u00028\u0000\"\u0004\b\u0000\u0010\"2\'\u0010$\u001A#\b\u0001\u0012\u0004\u0012\u00020#\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000B\u0012\u0006\u0012\u0004\u0018\u00010\u00050\n\u00A2\u0006\u0002\b\rH\u0096@\u00A2\u0006\u0004\b%\u0010&R\"\u0010.\u001A\u00020\'8\u0016@\u0016X\u0096\u000E\u00A2\u0006\u0012\n\u0004\b(\u0010)\u001A\u0004\b*\u0010+\"\u0004\b,\u0010-Rf\u0010\u000E\u001A#\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000B\u0012\u0006\u0012\u0004\u0018\u00010\u00050\n\u00A2\u0006\u0002\b\r2\'\u0010/\u001A#\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000B\u0012\u0006\u0012\u0004\u0018\u00010\u00050\n\u00A2\u0006\u0002\b\r8V@VX\u0096\u000E\u00A2\u0006\f\u001A\u0004\b0\u00101\"\u0004\b2\u00103R\u0014\u00107\u001A\u0002048VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b5\u00106R\u0014\u00109\u001A\u0002048VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b8\u00106R\u0014\u0010=\u001A\u00020:8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b;\u0010<R\u001A\u0010@\u001A\u00020\u001C8VX\u0096\u0004\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0006\u001A\u0004\b>\u0010?R\u001A\u0010C\u001A\u00020A8VX\u0096\u0004\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0006\u001A\u0004\bB\u0010?\u0082\u0002\u000B\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u0006E"}, d2 = {"Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNodeImpl;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNode;", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "Landroidx/compose/ui/unit/Density;", "", "key1", "key2", "", "keys", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "pointerInputHandler", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "update$ui_release", "update", "onDetach", "()V", "onDensityChange", "onViewConfigurationChange", "resetPointerInputHandler", "Landroidx/compose/ui/input/pointer/PointerEvent;", "pointerEvent", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "pass", "Landroidx/compose/ui/unit/IntSize;", "bounds", "onPointerEvent-H0pRuoY", "(Landroidx/compose/ui/input/pointer/PointerEvent;Landroidx/compose/ui/input/pointer/PointerEventPass;J)V", "onPointerEvent", "onCancelPointerInput", "R", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "block", "awaitPointerEventScope", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "x", "Z", "getInterceptOutOfBoundsChildEvents", "()Z", "setInterceptOutOfBoundsChildEvents", "(Z)V", "interceptOutOfBoundsChildEvents", "value", "getPointerInputHandler", "()Lkotlin/jvm/functions/Function2;", "setPointerInputHandler", "(Lkotlin/jvm/functions/Function2;)V", "", "getDensity", "()F", "density", "getFontScale", "fontScale", "Landroidx/compose/ui/platform/ViewConfiguration;", "getViewConfiguration", "()Landroidx/compose/ui/platform/ViewConfiguration;", "viewConfiguration", "getSize-YbymL2g", "()J", "size", "Landroidx/compose/ui/geometry/Size;", "getExtendedTouchPadding-NH-jbRc", "extendedTouchPadding", "x1/p", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSuspendingPointerInputFilter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SuspendingPointerInputFilter.kt\nandroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNodeImpl\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 JvmActuals.jvm.kt\nandroidx/compose/ui/platform/JvmActuals_jvmKt\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 7 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,831:1\n573#1:862\n574#1:864\n576#1,4:866\n582#1:881\n585#1,3:893\n1208#2:832\n1187#2,2:833\n1208#2:835\n1187#2,2:836\n36#3:838\n36#3:863\n36#3:935\n146#4:839\n460#4,11:840\n492#4,11:851\n146#4:865\n460#4,11:870\n492#4,11:882\n728#4,2:936\n86#5,2:896\n33#5,6:898\n88#5:904\n86#5,2:905\n33#5,6:907\n88#5:913\n416#5,3:914\n33#5,4:917\n419#5:921\n420#5:923\n38#5:924\n421#5:925\n1#6:922\n314#7,9:926\n323#7,2:938\n*S KotlinDebug\n*F\n+ 1 SuspendingPointerInputFilter.kt\nandroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNodeImpl\n*L\n597#1:862\n597#1:864\n597#1:866,4\n597#1:881\n597#1:893,3\n489#1:832\n489#1:833,2\n498#1:835\n498#1:836,2\n573#1:838\n597#1:863\n665#1:935\n574#1:839\n579#1:840,11\n582#1:851,11\n597#1:865\n597#1:870,11\n597#1:882,11\n666#1:936,2\n623#1:896,2\n623#1:898,6\n623#1:904\n633#1:905,2\n633#1:907,6\n633#1:913\n636#1:914,3\n636#1:917,4\n636#1:921\n636#1:923\n636#1:924\n636#1:925\n636#1:922\n663#1:926,9\n663#1:938,2\n*E\n"})
public final class SuspendingPointerInputModifierNodeImpl extends Node implements PointerInputScope, SuspendingPointerInputModifierNode, Density {
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[PointerEventPass.values().length];
            try {
                arr_v[PointerEventPass.Initial.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[PointerEventPass.Final.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[PointerEventPass.Main.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    public static final int $stable;
    public Object n;
    public Object o;
    public Object[] p;
    public Function2 q;
    public Job r;
    public PointerEvent s;
    public final MutableVector t;
    public final MutableVector u;
    public PointerEvent v;
    public long w;
    public boolean x;

    public SuspendingPointerInputModifierNodeImpl(@Nullable Object object0, @Nullable Object object1, @Nullable Object[] arr_object, @NotNull Function2 function20) {
        this.n = object0;
        this.o = object1;
        this.p = arr_object;
        this.q = function20;
        this.s = SuspendingPointerInputFilterKt.a;
        this.t = new MutableVector(new p[16], 0);
        this.u = new MutableVector(new p[16], 0);
        this.w = 0L;
    }

    public SuspendingPointerInputModifierNodeImpl(Object object0, Object object1, Object[] arr_object, Function2 function20, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 1) != 0) {
            object0 = null;
        }
        if((v & 2) != 0) {
            object1 = null;
        }
        if((v & 4) != 0) {
            arr_object = null;
        }
        this(object0, object1, arr_object, function20);
    }

    @Override  // androidx.compose.ui.input.pointer.PointerInputScope
    @Nullable
    public Object awaitPointerEventScope(@NotNull Function2 function20, @NotNull Continuation continuation0) {
        CancellableContinuationImpl cancellableContinuationImpl0 = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation0), 1);
        cancellableContinuationImpl0.initCancellability();
        p p0 = new p(this, cancellableContinuationImpl0);
        synchronized(this.t) {
            this.t.add(p0);
            ContinuationKt.createCoroutine(function20, p0, p0).resumeWith(Unit.INSTANCE);
        }
        cancellableContinuationImpl0.invokeOnCancellation(new h1(p0, 21));
        Object object0 = cancellableContinuationImpl0.getResult();
        if(object0 == a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation0);
        }
        return object0;
    }

    public final void b(PointerEvent pointerEvent0, PointerEventPass pointerEventPass0) {
        synchronized(this.t) {
            this.u.addAll(this.u.getSize(), this.t);
        }
        try {
            switch(WhenMappings.$EnumSwitchMapping$0[pointerEventPass0.ordinal()]) {
                case 1: 
                case 2: {
                    MutableVector mutableVector0 = this.u;
                    int v2 = mutableVector0.getSize();
                    if(v2 > 0) {
                        Object[] arr_object = mutableVector0.getContent();
                        int v3 = 0;
                        do {
                            p p0 = (p)arr_object[v3];
                            if(pointerEventPass0 == p0.d) {
                                CancellableContinuationImpl cancellableContinuationImpl0 = p0.c;
                                if(cancellableContinuationImpl0 != null) {
                                    p0.c = null;
                                    cancellableContinuationImpl0.resumeWith(pointerEvent0);
                                }
                            }
                            ++v3;
                        }
                        while(v3 < v2);
                    }
                    break;
                }
                case 3: {
                    MutableVector mutableVector1 = this.u;
                    int v4 = mutableVector1.getSize();
                    if(v4 > 0) {
                        int v5 = v4 - 1;
                        Object[] arr_object1 = mutableVector1.getContent();
                        while(true) {
                            p p1 = (p)arr_object1[v5];
                            if(pointerEventPass0 == p1.d) {
                                CancellableContinuationImpl cancellableContinuationImpl1 = p1.c;
                                if(cancellableContinuationImpl1 != null) {
                                    p1.c = null;
                                    cancellableContinuationImpl1.resumeWith(pointerEvent0);
                                }
                            }
                            --v5;
                            if(v5 < 0) {
                                break;
                            }
                        }
                    }
                }
            }
        }
        finally {
            this.u.clear();
        }
    }

    @Override  // androidx.compose.ui.unit.Density
    public float getDensity() {
        return DelegatableNodeKt.requireLayoutNode(this).getDensity().getDensity();
    }

    @Override  // androidx.compose.ui.input.pointer.PointerInputScope
    public long getExtendedTouchPadding-NH-jbRc() {
        long v = this.toSize-XkaWNTQ(this.getViewConfiguration().getMinimumTouchTargetSize-MYxV2XQ());
        long v1 = this.getSize-YbymL2g();
        return SizeKt.Size(Math.max(0.0f, Size.getWidth-impl(v) - ((float)IntSize.getWidth-impl(v1))) / 2.0f, Math.max(0.0f, Size.getHeight-impl(v) - ((float)IntSize.getHeight-impl(v1))) / 2.0f);
    }

    @Override  // androidx.compose.ui.unit.FontScaling
    public float getFontScale() {
        return DelegatableNodeKt.requireLayoutNode(this).getDensity().getFontScale();
    }

    @Override  // androidx.compose.ui.input.pointer.PointerInputScope
    public boolean getInterceptOutOfBoundsChildEvents() {
        return this.x;
    }

    @Override  // androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode
    @NotNull
    public Function2 getPointerInputHandler() {
        return this.q;
    }

    @Override  // androidx.compose.ui.input.pointer.PointerInputScope
    public long getSize-YbymL2g() {
        return this.w;
    }

    @Override  // androidx.compose.ui.input.pointer.PointerInputScope
    @NotNull
    public ViewConfiguration getViewConfiguration() {
        return DelegatableNodeKt.requireLayoutNode(this).getViewConfiguration();
    }

    @Override  // androidx.compose.ui.node.PointerInputModifierNode
    public void onCancelPointerInput() {
        PointerEvent pointerEvent0 = this.v;
        if(pointerEvent0 == null) {
            return;
        }
        List list0 = pointerEvent0.getChanges();
        int v = list0.size();
        for(int v2 = 0; v2 < v; ++v2) {
            if(((PointerInputChange)list0.get(v2)).getPressed()) {
                List list1 = pointerEvent0.getChanges();
                ArrayList arrayList0 = new ArrayList(list1.size());
                int v3 = list1.size();
                for(int v1 = 0; v1 < v3; ++v1) {
                    PointerInputChange pointerInputChange0 = (PointerInputChange)list1.get(v1);
                    arrayList0.add(new PointerInputChange(pointerInputChange0.getId-J3iCeTQ(), pointerInputChange0.getUptimeMillis(), pointerInputChange0.getPosition-F1C5BW0(), false, pointerInputChange0.getPressure(), pointerInputChange0.getUptimeMillis(), pointerInputChange0.getPosition-F1C5BW0(), pointerInputChange0.getPressed(), pointerInputChange0.getPressed(), 0, 0L, 0x600, null));
                }
                PointerEvent pointerEvent1 = new PointerEvent(arrayList0);
                this.s = pointerEvent1;
                this.b(pointerEvent1, PointerEventPass.Initial);
                this.b(pointerEvent1, PointerEventPass.Main);
                this.b(pointerEvent1, PointerEventPass.Final);
                this.v = null;
                return;
            }
        }
    }

    @Override  // androidx.compose.ui.node.PointerInputModifierNode
    public void onDensityChange() {
        this.resetPointerInputHandler();
    }

    @Override  // androidx.compose.ui.Modifier$Node
    public void onDetach() {
        this.resetPointerInputHandler();
        super.onDetach();
    }

    @Override  // androidx.compose.ui.node.PointerInputModifierNode
    public void onPointerEvent-H0pRuoY(@NotNull PointerEvent pointerEvent0, @NotNull PointerEventPass pointerEventPass0, long v) {
        this.w = v;
        if(pointerEventPass0 == PointerEventPass.Initial) {
            this.s = pointerEvent0;
        }
        if(this.r == null) {
            CoroutineScope coroutineScope0 = this.getCoroutineScope();
            q q0 = new q(this, null);
            this.r = BuildersKt.launch$default(coroutineScope0, null, CoroutineStart.UNDISPATCHED, q0, 1, null);
        }
        this.b(pointerEvent0, pointerEventPass0);
        List list0 = pointerEvent0.getChanges();
        int v1 = list0.size();
        boolean z = false;
        for(int v2 = 0; true; ++v2) {
            if(v2 >= v1) {
                z = true;
                break;
            }
            if(!PointerEventKt.changedToUpIgnoreConsumed(((PointerInputChange)list0.get(v2)))) {
                break;
            }
        }
        if(z) {
            pointerEvent0 = null;
        }
        this.v = pointerEvent0;
    }

    @Override  // androidx.compose.ui.node.PointerInputModifierNode
    public void onViewConfigurationChange() {
        this.resetPointerInputHandler();
    }

    @Override  // androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode
    public void resetPointerInputHandler() {
        Job job0 = this.r;
        if(job0 != null) {
            job0.cancel(new b4("Pointer input was reset", 4));
            this.r = null;
        }
    }

    @Override  // androidx.compose.ui.input.pointer.PointerInputScope
    public void setInterceptOutOfBoundsChildEvents(boolean z) {
        this.x = z;
    }

    @Override  // androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode
    public void setPointerInputHandler(@NotNull Function2 function20) {
        this.resetPointerInputHandler();
        this.q = function20;
    }

    public final void update$ui_release(@Nullable Object object0, @Nullable Object object1, @Nullable Object[] arr_object, @NotNull Function2 function20) {
        int v = 1;
        int v1 = !Intrinsics.areEqual(this.n, object0);
        this.n = object0;
        if(!Intrinsics.areEqual(this.o, object1)) {
            v1 = 1;
        }
        this.o = object1;
        Object[] arr_object1 = this.p;
        if(arr_object1 != null && arr_object == null) {
            v1 = 1;
        }
        if(arr_object1 == null && arr_object != null) {
            v1 = 1;
        }
        if(arr_object1 == null || arr_object == null || Arrays.equals(arr_object, arr_object1)) {
            v = v1;
        }
        this.p = arr_object;
        if(v != 0) {
            this.resetPointerInputHandler();
        }
        this.q = function20;
    }
}

