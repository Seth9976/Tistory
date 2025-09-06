package androidx.compose.ui.input.nestedscroll;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Velocity;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import w1.a;
import w1.b;
import w1.c;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\n\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ(\u0010\u000E\u001A\u00020\u00042\u0006\u0010\u000B\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u001B\u0010\u0012\u001A\u00020\u000F2\u0006\u0010\u0005\u001A\u00020\u000FH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0015\u001A\u00020\u000F2\u0006\u0010\u000B\u001A\u00020\u000F2\u0006\u0010\u0005\u001A\u00020\u000FH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014R$\u0010\u001D\u001A\u0004\u0018\u00010\u00168\u0000@\u0000X\u0080\u000E¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001A\u0004\b\u0019\u0010\u001A\"\u0004\b\u001B\u0010\u001CR*\u0010&\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u001F0\u001E8\u0000@\u0000X\u0080\u000E¢\u0006\u0012\n\u0004\b \u0010!\u001A\u0004\b\"\u0010#\"\u0004\b$\u0010%R$\u0010-\u001A\u0004\u0018\u00010\u001F8\u0000@\u0000X\u0080\u000E¢\u0006\u0012\n\u0004\b\'\u0010(\u001A\u0004\b)\u0010*\"\u0004\b+\u0010,R\u0011\u0010/\u001A\u00020\u001F8F¢\u0006\u0006\u001A\u0004\b.\u0010*R\u0016\u00103\u001A\u0004\u0018\u0001008@X\u0080\u0004¢\u0006\u0006\u001A\u0004\b1\u00102\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u00064"}, d2 = {"Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "", "<init>", "()V", "Landroidx/compose/ui/geometry/Offset;", "available", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "source", "dispatchPreScroll-OzD1aCk", "(JI)J", "dispatchPreScroll", "consumed", "dispatchPostScroll-DzOQY0M", "(JJI)J", "dispatchPostScroll", "Landroidx/compose/ui/unit/Velocity;", "dispatchPreFling-QWom1Mo", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dispatchPreFling", "dispatchPostFling-RZ2iAVY", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dispatchPostFling", "Landroidx/compose/ui/input/nestedscroll/NestedScrollNode;", "a", "Landroidx/compose/ui/input/nestedscroll/NestedScrollNode;", "getNestedScrollNode$ui_release", "()Landroidx/compose/ui/input/nestedscroll/NestedScrollNode;", "setNestedScrollNode$ui_release", "(Landroidx/compose/ui/input/nestedscroll/NestedScrollNode;)V", "nestedScrollNode", "Lkotlin/Function0;", "Lkotlinx/coroutines/CoroutineScope;", "b", "Lkotlin/jvm/functions/Function0;", "getCalculateNestedScrollScope$ui_release", "()Lkotlin/jvm/functions/Function0;", "setCalculateNestedScrollScope$ui_release", "(Lkotlin/jvm/functions/Function0;)V", "calculateNestedScrollScope", "c", "Lkotlinx/coroutines/CoroutineScope;", "getScope$ui_release", "()Lkotlinx/coroutines/CoroutineScope;", "setScope$ui_release", "(Lkotlinx/coroutines/CoroutineScope;)V", "scope", "getCoroutineScope", "coroutineScope", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "getParent$ui_release", "()Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "parent", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class NestedScrollDispatcher {
    public static final int $stable = 8;
    public NestedScrollNode a;
    public Function0 b;
    public CoroutineScope c;

    public NestedScrollDispatcher() {
        this.b = new a(this, 0);
    }

    @Nullable
    public final Object dispatchPostFling-RZ2iAVY(long v, long v1, @NotNull Continuation continuation0) {
        b b0;
        if(continuation0 instanceof b) {
            b0 = (b)continuation0;
            int v2 = b0.q;
            if((v2 & 0x80000000) == 0) {
                b0 = new b(this, continuation0);
            }
            else {
                b0.q = v2 ^ 0x80000000;
            }
        }
        else {
            b0 = new b(this, continuation0);
        }
        Object object0 = b0.o;
        Object object1 = qd.a.getCOROUTINE_SUSPENDED();
        switch(b0.q) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                NestedScrollConnection nestedScrollConnection0 = this.getParent$ui_release();
                if(nestedScrollConnection0 != null) {
                    b0.q = 1;
                    object0 = nestedScrollConnection0.onPostFling-RZ2iAVY(v, v1, b0);
                    return object0 == object1 ? object1 : Velocity.box-impl(((Velocity)object0).unbox-impl());
                }
                return Velocity.box-impl(0L);
            }
            case 1: {
                ResultKt.throwOnFailure(object0);
                return Velocity.box-impl(((Velocity)object0).unbox-impl());
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    public final long dispatchPostScroll-DzOQY0M(long v, long v1, int v2) {
        NestedScrollConnection nestedScrollConnection0 = this.getParent$ui_release();
        return nestedScrollConnection0 == null ? 0L : nestedScrollConnection0.onPostScroll-DzOQY0M(v, v1, v2);
    }

    @Nullable
    public final Object dispatchPreFling-QWom1Mo(long v, @NotNull Continuation continuation0) {
        c c0;
        if(continuation0 instanceof c) {
            c0 = (c)continuation0;
            int v1 = c0.q;
            if((v1 & 0x80000000) == 0) {
                c0 = new c(this, continuation0);
            }
            else {
                c0.q = v1 ^ 0x80000000;
            }
        }
        else {
            c0 = new c(this, continuation0);
        }
        Object object0 = c0.o;
        Object object1 = qd.a.getCOROUTINE_SUSPENDED();
        switch(c0.q) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                NestedScrollConnection nestedScrollConnection0 = this.getParent$ui_release();
                if(nestedScrollConnection0 != null) {
                    c0.q = 1;
                    object0 = nestedScrollConnection0.onPreFling-QWom1Mo(v, c0);
                    return object0 == object1 ? object1 : Velocity.box-impl(((Velocity)object0).unbox-impl());
                }
                return Velocity.box-impl(0L);
            }
            case 1: {
                ResultKt.throwOnFailure(object0);
                return Velocity.box-impl(((Velocity)object0).unbox-impl());
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    public final long dispatchPreScroll-OzD1aCk(long v, int v1) {
        NestedScrollConnection nestedScrollConnection0 = this.getParent$ui_release();
        return nestedScrollConnection0 == null ? 0L : nestedScrollConnection0.onPreScroll-OzD1aCk(v, v1);
    }

    @NotNull
    public final Function0 getCalculateNestedScrollScope$ui_release() {
        return this.b;
    }

    @NotNull
    public final CoroutineScope getCoroutineScope() {
        CoroutineScope coroutineScope0 = (CoroutineScope)this.b.invoke();
        if(coroutineScope0 == null) {
            throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        }
        return coroutineScope0;
    }

    @Nullable
    public final NestedScrollNode getNestedScrollNode$ui_release() {
        return this.a;
    }

    @Nullable
    public final NestedScrollConnection getParent$ui_release() {
        NestedScrollNode nestedScrollNode0 = this.a;
        return nestedScrollNode0 != null ? nestedScrollNode0.getParentNestedScrollNode$ui_release() : null;
    }

    @Nullable
    public final CoroutineScope getScope$ui_release() {
        return this.c;
    }

    public final void setCalculateNestedScrollScope$ui_release(@NotNull Function0 function00) {
        this.b = function00;
    }

    public final void setNestedScrollNode$ui_release(@Nullable NestedScrollNode nestedScrollNode0) {
        this.a = nestedScrollNode0;
    }

    public final void setScope$ui_release(@Nullable CoroutineScope coroutineScope0) {
        this.c = coroutineScope0;
    }
}

