package com.kakao.tistory.presentation.widget.swipe;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;

@Stable
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u0000 \u001C2\u00020\u0001:\u0001\u001CB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001A\u00020\u00062\u0006\u0010\u0005\u001A\u00020\u0004H\u0086@¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001A\u00020\u0006H\u0086@¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000B\u001A\u00020\u0006H\u0086@¢\u0006\u0004\b\u000B\u0010\nJ\u001D\u0010\u0010\u001A\u00020\u00062\u0006\u0010\r\u001A\u00020\f2\u0006\u0010\u000F\u001A\u00020\u000E¢\u0006\u0004\b\u0010\u0010\u0011R#\u0010\u0018\u001A\u000E\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00130\u00128\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001A\u0004\b\u0016\u0010\u0017R\u0011\u0010\u001B\u001A\u00020\f8F¢\u0006\u0006\u001A\u0004\b\u0019\u0010\u001A¨\u0006\u001D"}, d2 = {"Lcom/kakao/tistory/presentation/widget/swipe/CommonSwipeState;", "", "<init>", "()V", "", "amount", "", "move", "(FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dismiss", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dragStop", "Lcom/kakao/tistory/presentation/widget/swipe/DragDirection;", "direction", "", "offset", "updateOffset", "(Lcom/kakao/tistory/presentation/widget/swipe/DragDirection;I)V", "Landroidx/compose/animation/core/Animatable;", "Landroidx/compose/animation/core/AnimationVector1D;", "a", "Landroidx/compose/animation/core/Animatable;", "getDragOffsetX", "()Landroidx/compose/animation/core/Animatable;", "dragOffsetX", "getDragDirection", "()Lcom/kakao/tistory/presentation/widget/swipe/DragDirection;", "dragDirection", "Companion", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class CommonSwipeState {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/kakao/tistory/presentation/widget/swipe/CommonSwipeState$Companion;", "", "", "SWIPE_BOUND_MULTIPLE", "F", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[DragDirection.values().length];
            try {
                arr_v[DragDirection.Start.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[DragDirection.End.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    public static final int $stable = 0;
    @NotNull
    public static final Companion Companion = null;
    public static final float SWIPE_BOUND_MULTIPLE = 1.2f;
    public final Animatable a;
    public float b;
    public float c;
    public SwipeDirection d;

    static {
        CommonSwipeState.Companion = new Companion(null);
    }

    public CommonSwipeState() {
        this.a = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
        this.d = SwipeDirection.Default;
    }

    @Nullable
    public final Object dismiss(@NotNull Continuation continuation0) {
        this.d = SwipeDirection.Default;
        Object object0 = Animatable.animateTo$default(this.a, Boxing.boxFloat(0.0f), null, null, null, continuation0, 14, null);
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }

    @Nullable
    public final Object dragStop(@NotNull Continuation continuation0) {
        CommonSwipeState commonSwipeState2;
        CommonSwipeState commonSwipeState1;
        CommonSwipeState commonSwipeState0;
        c c0;
        if(continuation0 instanceof c) {
            c0 = (c)continuation0;
            int v = c0.d;
            if((v & 0x80000000) == 0) {
                c0 = new c(this, continuation0);
            }
            else {
                c0.d = v ^ 0x80000000;
            }
        }
        else {
            c0 = new c(this, continuation0);
        }
        Object object0 = c0.b;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(c0.d) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                if(this.getDragDirection() == DragDirection.Start && this.d != SwipeDirection.Start) {
                    c0.a = this;
                    c0.d = 1;
                    if(Animatable.animateTo$default(this.a, Boxing.boxFloat(this.b), null, null, null, c0, 14, null) == object1) {
                        return object1;
                    }
                    commonSwipeState0 = this;
                    commonSwipeState0.d = SwipeDirection.Start;
                    return Unit.INSTANCE;
                }
                if(this.getDragDirection() == DragDirection.End && this.d != SwipeDirection.End) {
                    c0.a = this;
                    c0.d = 2;
                    if(Animatable.animateTo$default(this.a, Boxing.boxFloat(this.c), null, null, null, c0, 14, null) == object1) {
                        return object1;
                    }
                    commonSwipeState1 = this;
                    commonSwipeState1.d = SwipeDirection.End;
                    return Unit.INSTANCE;
                }
                c0.a = this;
                c0.d = 3;
                if(Animatable.animateTo$default(this.a, Boxing.boxFloat(0.0f), null, null, null, c0, 14, null) == object1) {
                    return object1;
                }
                commonSwipeState2 = this;
                break;
            }
            case 1: {
                commonSwipeState0 = c0.a;
                ResultKt.throwOnFailure(object0);
                commonSwipeState0.d = SwipeDirection.Start;
                return Unit.INSTANCE;
            }
            case 2: {
                commonSwipeState1 = c0.a;
                ResultKt.throwOnFailure(object0);
                commonSwipeState1.d = SwipeDirection.End;
                return Unit.INSTANCE;
            }
            case 3: {
                commonSwipeState2 = c0.a;
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        commonSwipeState2.d = SwipeDirection.Default;
        return Unit.INSTANCE;
    }

    @NotNull
    public final DragDirection getDragDirection() {
        if(((Number)this.a.getValue()).floatValue() > 0.0f) {
            return DragDirection.Start;
        }
        return ((Number)this.a.getValue()).floatValue() < 0.0f ? DragDirection.End : DragDirection.None;
    }

    @NotNull
    public final Animatable getDragOffsetX() {
        return this.a;
    }

    @Nullable
    public final Object move(float f, @NotNull Continuation continuation0) {
        Float float0 = Boxing.boxFloat(((Number)this.a.getValue()).floatValue() + f);
        Object object0 = this.a.snapTo(float0, continuation0);
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }

    public final void updateOffset(@NotNull DragDirection dragDirection0, int v) {
        Intrinsics.checkNotNullParameter(dragDirection0, "direction");
        if(v == 0) {
            return;
        }
        switch(WhenMappings.$EnumSwitchMapping$0[dragDirection0.ordinal()]) {
            case 1: {
                this.b = (float)v;
                break;
            }
            case 2: {
                this.c = -((float)v);
            }
        }
        this.a.updateBounds(((float)(this.c * 1.2f)), ((float)(this.b * 1.2f)));
    }
}

