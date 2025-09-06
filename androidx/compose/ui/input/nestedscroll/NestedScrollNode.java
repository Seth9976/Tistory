package androidx.compose.ui.input.nestedscroll;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.node.TraversableNodeKt;
import androidx.compose.ui.unit.Velocity;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import w1.a;
import w1.d;
import w1.e;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u000B\n\u0002\u0010\u0000\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0019\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\b\u0010\u0006\u001A\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\"\u0010\u000F\u001A\u00020\t2\u0006\u0010\n\u001A\u00020\t2\u0006\u0010\f\u001A\u00020\u000BH\u0016ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000EJ*\u0010\u0013\u001A\u00020\t2\u0006\u0010\u0010\u001A\u00020\t2\u0006\u0010\n\u001A\u00020\t2\u0006\u0010\f\u001A\u00020\u000BH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u001B\u0010\u0017\u001A\u00020\u00142\u0006\u0010\n\u001A\u00020\u0014H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u001A\u001A\u00020\u00142\u0006\u0010\u0010\u001A\u00020\u00142\u0006\u0010\n\u001A\u00020\u0014H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u000F\u0010\u001C\u001A\u00020\u001BH\u0016¢\u0006\u0004\b\u001C\u0010\u001DJ\u000F\u0010\u001E\u001A\u00020\u001BH\u0016¢\u0006\u0004\b\u001E\u0010\u001DJ!\u0010 \u001A\u00020\u001B2\u0006\u0010\u0004\u001A\u00020\u00022\b\u0010\u0006\u001A\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0004\b\u001F\u0010\bR\"\u0010\u0004\u001A\u00020\u00028\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b!\u0010\"\u001A\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001A\u0010,\u001A\u00020\'8\u0016X\u0096D¢\u0006\f\n\u0004\b(\u0010)\u001A\u0004\b*\u0010+R\u0016\u0010/\u001A\u0004\u0018\u00010\u00008@X\u0080\u0004¢\u0006\u0006\u001A\u0004\b-\u0010.\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u00060"}, d2 = {"Landroidx/compose/ui/input/nestedscroll/NestedScrollNode;", "Landroidx/compose/ui/node/TraversableNode;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "Landroidx/compose/ui/Modifier$Node;", "connection", "Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "dispatcher", "<init>", "(Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;)V", "Landroidx/compose/ui/geometry/Offset;", "available", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "source", "onPreScroll-OzD1aCk", "(JI)J", "onPreScroll", "consumed", "onPostScroll-DzOQY0M", "(JJI)J", "onPostScroll", "Landroidx/compose/ui/unit/Velocity;", "onPreFling-QWom1Mo", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPreFling", "onPostFling-RZ2iAVY", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPostFling", "", "onAttach", "()V", "onDetach", "updateNode$ui_release", "updateNode", "n", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "getConnection", "()Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "setConnection", "(Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;)V", "", "p", "Ljava/lang/Object;", "getTraverseKey", "()Ljava/lang/Object;", "traverseKey", "getParentNestedScrollNode$ui_release", "()Landroidx/compose/ui/input/nestedscroll/NestedScrollNode;", "parentNestedScrollNode", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class NestedScrollNode extends Node implements NestedScrollConnection, TraversableNode {
    public static final int $stable = 8;
    public NestedScrollConnection n;
    public NestedScrollDispatcher o;
    public final String p;

    public NestedScrollNode(@NotNull NestedScrollConnection nestedScrollConnection0, @Nullable NestedScrollDispatcher nestedScrollDispatcher0) {
        this.n = nestedScrollConnection0;
        if(nestedScrollDispatcher0 == null) {
            nestedScrollDispatcher0 = new NestedScrollDispatcher();
        }
        this.o = nestedScrollDispatcher0;
        this.p = "androidx.compose.ui.input.nestedscroll.NestedScrollNode";
    }

    public final CoroutineScope b() {
        CoroutineScope coroutineScope0;
        NestedScrollNode nestedScrollNode0 = this.getParentNestedScrollNode$ui_release();
        if(nestedScrollNode0 != null) {
            coroutineScope0 = nestedScrollNode0.b();
            if(coroutineScope0 == null) {
                goto label_4;
            }
            return coroutineScope0;
        }
    label_4:
        coroutineScope0 = this.o.getScope$ui_release();
        if(coroutineScope0 == null) {
            throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        }
        return coroutineScope0;
    }

    @NotNull
    public final NestedScrollConnection getConnection() {
        return this.n;
    }

    // 去混淆评级： 低(20)
    @Nullable
    public final NestedScrollNode getParentNestedScrollNode$ui_release() {
        return this.isAttached() ? ((NestedScrollNode)TraversableNodeKt.findNearestAncestor(this)) : null;
    }

    @Override  // androidx.compose.ui.node.TraversableNode
    @NotNull
    public Object getTraverseKey() {
        return this.p;
    }

    @Override  // androidx.compose.ui.Modifier$Node
    public void onAttach() {
        this.o.setNestedScrollNode$ui_release(this);
        this.o.setCalculateNestedScrollScope$ui_release(new a(this, 1));
        this.o.setScope$ui_release(this.getCoroutineScope());
    }

    @Override  // androidx.compose.ui.Modifier$Node
    public void onDetach() {
        if(this.o.getNestedScrollNode$ui_release() == this) {
            this.o.setNestedScrollNode$ui_release(null);
        }
    }

    @Override  // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    @Nullable
    public Object onPostFling-RZ2iAVY(long v, long v1, @NotNull Continuation continuation0) {
        NestedScrollNode nestedScrollNode0;
        long v5;
        long v4;
        d d0;
        if(continuation0 instanceof d) {
            d0 = (d)continuation0;
            int v2 = d0.t;
            if((v2 & 0x80000000) == 0) {
                d0 = new d(this, continuation0);
            }
            else {
                d0.t = v2 ^ 0x80000000;
            }
        }
        else {
            d0 = new d(this, continuation0);
        }
        Object object0 = d0.r;
        Object object1 = qd.a.getCOROUTINE_SUSPENDED();
        switch(d0.t) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                d0.o = this;
                v4 = v;
                d0.p = v4;
                v5 = v1;
                d0.q = v5;
                d0.t = 1;
                object0 = this.n.onPostFling-RZ2iAVY(v, v1, d0);
                if(object0 == object1) {
                    return object1;
                }
                nestedScrollNode0 = this;
                break;
            }
            case 1: {
                long v6 = d0.q;
                long v7 = d0.p;
                nestedScrollNode0 = d0.o;
                ResultKt.throwOnFailure(object0);
                v5 = v6;
                v4 = v7;
                break;
            }
            case 2: {
                long v3 = d0.p;
                ResultKt.throwOnFailure(object0);
                return Velocity.box-impl(Velocity.plus-AH228Gc(v3, ((Velocity)object0).unbox-impl()));
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        long v8 = ((Velocity)object0).unbox-impl();
        NestedScrollNode nestedScrollNode1 = nestedScrollNode0.isAttached() ? nestedScrollNode0.getParentNestedScrollNode$ui_release() : null;
        if(nestedScrollNode1 != null) {
            d0.o = null;
            d0.p = v8;
            d0.t = 2;
            object0 = nestedScrollNode1.onPostFling-RZ2iAVY(Velocity.plus-AH228Gc(v4, v8), Velocity.minus-AH228Gc(v5, v8), d0);
            return object0 == object1 ? object1 : Velocity.box-impl(Velocity.plus-AH228Gc(v8, ((Velocity)object0).unbox-impl()));
        }
        return Velocity.box-impl(Velocity.plus-AH228Gc(v8, 0L));
    }

    @Override  // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    public long onPostScroll-DzOQY0M(long v, long v1, int v2) {
        long v3 = this.n.onPostScroll-DzOQY0M(v, v1, v2);
        NestedScrollNode nestedScrollNode0 = this.isAttached() ? this.getParentNestedScrollNode$ui_release() : null;
        return nestedScrollNode0 == null ? Offset.plus-MK-Hz9U(v3, 0L) : Offset.plus-MK-Hz9U(v3, nestedScrollNode0.onPostScroll-DzOQY0M(Offset.plus-MK-Hz9U(v, v3), Offset.minus-MK-Hz9U(v1, v3), v2));
    }

    @Override  // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    @Nullable
    public Object onPreFling-QWom1Mo(long v, @NotNull Continuation continuation0) {
        long v3;
        NestedScrollNode nestedScrollNode1;
        e e0;
        if(continuation0 instanceof e) {
            e0 = (e)continuation0;
            int v1 = e0.s;
            if((v1 & 0x80000000) == 0) {
                e0 = new e(this, continuation0);
            }
            else {
                e0.s = v1 ^ 0x80000000;
            }
        }
        else {
            e0 = new e(this, continuation0);
        }
        Object object0 = e0.q;
        Object object1 = qd.a.getCOROUTINE_SUSPENDED();
        switch(e0.s) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                NestedScrollNode nestedScrollNode0 = this.isAttached() ? this.getParentNestedScrollNode$ui_release() : null;
                if(nestedScrollNode0 == null) {
                    v3 = 0L;
                    nestedScrollNode1 = this;
                }
                else {
                    e0.o = this;
                    e0.p = v;
                    e0.s = 1;
                    object0 = nestedScrollNode0.onPreFling-QWom1Mo(v, e0);
                    if(object0 == object1) {
                        return object1;
                    }
                    nestedScrollNode1 = this;
                    v3 = ((Velocity)object0).unbox-impl();
                }
                break;
            }
            case 1: {
                v = e0.p;
                nestedScrollNode1 = e0.o;
                ResultKt.throwOnFailure(object0);
                v3 = ((Velocity)object0).unbox-impl();
                break;
            }
            case 2: {
                long v2 = e0.p;
                ResultKt.throwOnFailure(object0);
                return Velocity.box-impl(Velocity.plus-AH228Gc(v2, ((Velocity)object0).unbox-impl()));
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        e0.o = null;
        e0.p = v3;
        e0.s = 2;
        object0 = nestedScrollNode1.n.onPreFling-QWom1Mo(Velocity.minus-AH228Gc(v, v3), e0);
        return object0 == object1 ? object1 : Velocity.box-impl(Velocity.plus-AH228Gc(v3, ((Velocity)object0).unbox-impl()));
    }

    @Override  // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    public long onPreScroll-OzD1aCk(long v, int v1) {
        NestedScrollNode nestedScrollNode0 = this.isAttached() ? this.getParentNestedScrollNode$ui_release() : null;
        if(nestedScrollNode0 != null) {
            long v2 = nestedScrollNode0.onPreScroll-OzD1aCk(v, v1);
            return Offset.plus-MK-Hz9U(v2, this.n.onPreScroll-OzD1aCk(Offset.minus-MK-Hz9U(v, v2), v1));
        }
        return Offset.plus-MK-Hz9U(0L, this.n.onPreScroll-OzD1aCk(Offset.minus-MK-Hz9U(v, 0L), v1));
    }

    public final void setConnection(@NotNull NestedScrollConnection nestedScrollConnection0) {
        this.n = nestedScrollConnection0;
    }

    public final void updateNode$ui_release(@NotNull NestedScrollConnection nestedScrollConnection0, @Nullable NestedScrollDispatcher nestedScrollDispatcher0) {
        this.n = nestedScrollConnection0;
        if(this.o.getNestedScrollNode$ui_release() == this) {
            this.o.setNestedScrollNode$ui_release(null);
        }
        if(nestedScrollDispatcher0 == null) {
            this.o = new NestedScrollDispatcher();
        }
        else if(!Intrinsics.areEqual(nestedScrollDispatcher0, this.o)) {
            this.o = nestedScrollDispatcher0;
        }
        if(this.isAttached()) {
            this.o.setNestedScrollNode$ui_release(this);
            this.o.setCalculateNestedScrollScope$ui_release(new a(this, 1));
            this.o.setScope$ui_release(this.getCoroutineScope());
        }
    }
}

