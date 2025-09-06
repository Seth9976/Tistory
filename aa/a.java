package aa;

import androidx.compose.foundation.text.KeyboardActionScope;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.semantics.ProgressBarRangeInfo;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import ce.e;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import zd.c;

public final class a extends Lambda implements Function1 {
    public final int w;
    public final Function0 x;

    public a(Function0 function00, int v) {
        this.w = v;
        this.x = function00;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        switch(this.w) {
            case 0: {
                Intrinsics.checkNotNullParameter(((GraphicsLayerScope)object0), "$this$graphicsLayer");
                ((GraphicsLayerScope)object0).setRotationZ(((Number)this.x.invoke()).floatValue());
                return Unit.INSTANCE;
            }
            case 1: {
                this.x.invoke();
                return Unit.INSTANCE;
            }
            case 2: {
                Density density0 = (Density)object0;
                return Offset.box-impl(((Offset)this.x.invoke()).unbox-impl());
            }
            case 3: {
                Density density1 = (Density)object0;
                return Offset.box-impl(((Offset)this.x.invoke()).unbox-impl());
            }
            case 4: {
                Throwable throwable0 = (Throwable)object0;
                this.x.invoke();
                return Unit.INSTANCE;
            }
            case 5: {
                this.x.invoke();
                return Unit.INSTANCE;
            }
            case 6: {
                this.x.invoke();
                return Unit.INSTANCE;
            }
            case 7: {
                ((GraphicsLayerScope)object0).setAlpha(((Number)this.x.invoke()).floatValue());
                return Unit.INSTANCE;
            }
            case 8: {
                SemanticsPropertiesKt.setProgressBarRangeInfo(((SemanticsPropertyReceiver)object0), new ProgressBarRangeInfo(((Number)this.x.invoke()).floatValue(), e.rangeTo(0.0f, 1.0f), 0, 4, null));
                return Unit.INSTANCE;
            }
            case 9: {
                SemanticsPropertiesKt.setProgressBarRangeInfo(((SemanticsPropertyReceiver)object0), new ProgressBarRangeInfo(((Number)this.x.invoke()).floatValue(), e.rangeTo(0.0f, 1.0f), 0, 4, null));
                return Unit.INSTANCE;
            }
            case 10: {
                ((Boolean)object0).booleanValue();
                this.x.invoke();
                return Unit.INSTANCE;
            }
            case 11: {
                Float float0 = (Float)this.x.invoke();
                if(float0 == null) {
                    return false;
                }
                ((List)object0).add(float0);
                return true;
            }
            case 12: {
                Throwable throwable1 = (Throwable)object0;
                this.x.invoke();
                return Unit.INSTANCE;
            }
            case 13: {
                Intrinsics.checkNotNullParameter(object0, "it");
                return this.x.invoke();
            }
            case 14: {
                this.x.invoke();
                return Unit.INSTANCE;
            }
            case 15: {
                this.x.invoke();
                return Unit.INSTANCE;
            }
            case 16: {
                this.x.invoke();
                return Unit.INSTANCE;
            }
            case 17: {
                this.x.invoke();
                return Unit.INSTANCE;
            }
            case 18: {
                Density density2 = (Density)object0;
                return IntOffset.box-impl(IntOffsetKt.IntOffset(c.roundToInt(((Number)this.x.invoke()).floatValue()), 0));
            }
            case 19: {
                Intrinsics.checkNotNullParameter(((KeyboardActionScope)object0), "$this$$receiver");
                this.x.invoke();
                return Unit.INSTANCE;
            }
            case 20: {
                ((GraphicsLayerScope)object0).setClip(((Boolean)this.x.invoke()).booleanValue());
                return Unit.INSTANCE;
            }
            case 21: {
                SemanticsPropertiesKt.setProgressBarRangeInfo(((SemanticsPropertyReceiver)object0), new ProgressBarRangeInfo(((Number)this.x.invoke()).floatValue(), e.rangeTo(0.0f, 1.0f), 0));
                return Unit.INSTANCE;
            }
            default: {
                PointerInputChange pointerInputChange0 = (PointerInputChange)object0;
                this.x.invoke();
                return Unit.INSTANCE;
            }
        }
    }
}

