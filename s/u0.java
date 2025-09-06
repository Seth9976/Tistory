package s;

import androidx.compose.animation.ChangeSize;
import androidx.compose.animation.EnterExitState;
import androidx.compose.animation.Slide;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class u0 extends Lambda implements Function1 {
    public final int w;
    public final y0 x;
    public final long y;

    public u0(y0 y00, long v, int v1) {
        this.w = v1;
        this.x = y00;
        this.y = v;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        long v2;
        long v1;
        switch(this.w) {
            case 0: {
                y0 y01 = this.x;
                y01.getClass();
                long v3 = this.y;
                switch(((EnterExitState)object0)) {
                    case 1: {
                        break;
                    }
                    case 2: {
                        ChangeSize changeSize0 = y01.r.getData$animation_release().getChangeSize();
                        if(changeSize0 != null) {
                            Function1 function12 = changeSize0.getSize();
                            return function12 == null ? IntSize.box-impl(v3) : IntSize.box-impl(((IntSize)function12.invoke(IntSize.box-impl(v3))).unbox-impl());
                        }
                        break;
                    }
                    case 3: {
                        ChangeSize changeSize1 = y01.s.getData$animation_release().getChangeSize();
                        if(changeSize1 != null) {
                            Function1 function13 = changeSize1.getSize();
                            return function13 == null ? IntSize.box-impl(v3) : IntSize.box-impl(((IntSize)function13.invoke(IntSize.box-impl(v3))).unbox-impl());
                        }
                        break;
                    }
                    default: {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                return IntSize.box-impl(v3);
            }
            case 1: {
                y0 y02 = this.x;
                if(y02.w == null) {
                    return IntOffset.box-impl(0L);
                }
                if(y02.getAlignment() == null) {
                    return IntOffset.box-impl(0L);
                }
                if(Intrinsics.areEqual(y02.w, y02.getAlignment())) {
                    return IntOffset.box-impl(0L);
                }
                switch(((EnterExitState)object0)) {
                    case 1: {
                        return IntOffset.box-impl(0L);
                    }
                    case 2: {
                        return IntOffset.box-impl(0L);
                    }
                    case 3: {
                        ChangeSize changeSize2 = y02.s.getData$animation_release().getChangeSize();
                        if(changeSize2 != null) {
                            long v4 = ((IntSize)changeSize2.getSize().invoke(IntSize.box-impl(this.y))).unbox-impl();
                            Alignment alignment0 = y02.getAlignment();
                            Intrinsics.checkNotNull(alignment0);
                            long v5 = alignment0.align-KFBX0sM(this.y, v4, LayoutDirection.Ltr);
                            Alignment alignment1 = y02.w;
                            Intrinsics.checkNotNull(alignment1);
                            return IntOffset.box-impl(IntOffset.minus-qkQi6aY(v5, alignment1.align-KFBX0sM(this.y, v4, LayoutDirection.Ltr)));
                        }
                        return IntOffset.box-impl(0L);
                    }
                    default: {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }
            default: {
                y0 y00 = this.x;
                Slide slide0 = y00.r.getData$animation_release().getSlide();
                long v = this.y;
                if(slide0 == null) {
                    v1 = 0L;
                }
                else {
                    Function1 function10 = slide0.getSlideOffset();
                    v1 = function10 == null ? 0L : ((IntOffset)function10.invoke(IntSize.box-impl(v))).unbox-impl();
                }
                Slide slide1 = y00.s.getData$animation_release().getSlide();
                if(slide1 == null) {
                    v2 = 0L;
                }
                else {
                    Function1 function11 = slide1.getSlideOffset();
                    v2 = function11 == null ? 0L : ((IntOffset)function11.invoke(IntSize.box-impl(v))).unbox-impl();
                }
                switch(((EnterExitState)object0)) {
                    case 1: {
                        v1 = 0L;
                        break;
                    }
                    case 2: {
                        break;
                    }
                    case 3: {
                        return IntOffset.box-impl(v2);
                    }
                    default: {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                return IntOffset.box-impl(v1);
            }
        }
    }
}

