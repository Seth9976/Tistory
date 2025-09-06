package androidx.constraintlayout.compose;

import androidx.compose.material.AnchoredDraggableKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.core.state.helpers.GuidelineReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p0.t1;

public final class k extends Lambda implements Function1 {
    public final int w;
    public final int x;
    public final float y;

    public k(float f, int v, int v1) {
        this.w = v1;
        this.x = v;
        this.y = f;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        switch(this.w) {
            case 0: {
                Intrinsics.checkNotNullParameter(((State)object0), "state");
                ((State)object0).verticalGuideline(this.x).start(Dp.box-impl(this.y));
                return Unit.INSTANCE;
            }
            case 1: {
                Intrinsics.checkNotNullParameter(((State)object0), "state");
                ((State)object0).verticalGuideline(this.x).percent(this.y);
                return Unit.INSTANCE;
            }
            case 2: {
                Intrinsics.checkNotNullParameter(((State)object0), "state");
                ((State)object0).verticalGuideline(this.x).end(Dp.box-impl(this.y));
                return Unit.INSTANCE;
            }
            case 3: {
                Intrinsics.checkNotNullParameter(((State)object0), "state");
                ((State)object0).horizontalGuideline(this.x).end(Dp.box-impl(this.y));
                return Unit.INSTANCE;
            }
            case 4: {
                Intrinsics.checkNotNullParameter(((State)object0), "state");
                GuidelineReference guidelineReference0 = ((State)object0).verticalGuideline(this.x);
                LayoutDirection layoutDirection0 = ((State)object0).getLayoutDirection();
                float f = this.y;
                if(layoutDirection0 == LayoutDirection.Ltr) {
                    guidelineReference0.end(Dp.box-impl(f));
                    return Unit.INSTANCE;
                }
                guidelineReference0.start(Dp.box-impl(f));
                return Unit.INSTANCE;
            }
            case 5: {
                Intrinsics.checkNotNullParameter(((State)object0), "state");
                GuidelineReference guidelineReference1 = ((State)object0).verticalGuideline(this.x);
                LayoutDirection layoutDirection1 = ((State)object0).getLayoutDirection();
                float f1 = this.y;
                if(layoutDirection1 == LayoutDirection.Ltr) {
                    guidelineReference1.start(Dp.box-impl(f1));
                    return Unit.INSTANCE;
                }
                guidelineReference1.end(Dp.box-impl(f1));
                return Unit.INSTANCE;
            }
            case 6: {
                Intrinsics.checkNotNullParameter(((State)object0), "state");
                GuidelineReference guidelineReference2 = ((State)object0).verticalGuideline(this.x);
                LayoutDirection layoutDirection2 = ((State)object0).getLayoutDirection();
                float f2 = this.y;
                if(layoutDirection2 == LayoutDirection.Ltr) {
                    guidelineReference2.percent(f2);
                    return Unit.INSTANCE;
                }
                guidelineReference2.percent(1.0f - f2);
                return Unit.INSTANCE;
            }
            case 7: {
                Intrinsics.checkNotNullParameter(((State)object0), "state");
                ((State)object0).horizontalGuideline(this.x).start(Dp.box-impl(this.y));
                return Unit.INSTANCE;
            }
            case 8: {
                Intrinsics.checkNotNullParameter(((State)object0), "state");
                ((State)object0).horizontalGuideline(this.x).percent(this.y);
                return Unit.INSTANCE;
            }
            default: {
                return AnchoredDraggableKt.DraggableAnchors(new t1(this.x, this.y, ((float)IntSize.getHeight-impl(((IntSize)object0).unbox-impl()))));
            }
        }
    }
}

