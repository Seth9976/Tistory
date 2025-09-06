package androidx.compose.material3;

import androidx.compose.material.ModalBottomSheetState;
import androidx.compose.material.ModalBottomSheetValue;
import androidx.compose.material3.internal.DraggableAnchorsConfig;
import androidx.compose.ui.geometry.CornerRadiusKt;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.IntSize;
import com.kakao.kandinsky.crop.contract.TouchLinePoint;
import com.kakao.kandinsky.crop.ui.CropBoxKt.DraggableLine.1.1.WhenMappings;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class wd extends Lambda implements Function1 {
    public final int w;
    public final float x;
    public final long y;
    public final Object z;

    public wd(float f, long v, SheetState sheetState0) {
        this.w = 0;
        this.x = f;
        this.y = v;
        this.z = sheetState0;
        super(1);
    }

    public wd(float f, Object object0, long v, int v1) {
        this.w = v1;
        this.x = f;
        this.z = object0;
        this.y = v;
        super(1);
    }

    public wd(TouchLinePoint touchLinePoint0, long v, float f) {
        this.w = 3;
        this.z = touchLinePoint0;
        this.y = v;
        this.x = f;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        long v1;
        long v;
        switch(this.w) {
            case 0: {
                float f1 = this.x;
                ((DraggableAnchorsConfig)object0).at(SheetValue.Hidden, f1);
                long v2 = this.y;
                if(((float)IntSize.getHeight-impl(v2)) > f1 / 2.0f && !((SheetState)this.z).getSkipPartiallyExpanded$material3_release()) {
                    ((DraggableAnchorsConfig)object0).at(SheetValue.PartiallyExpanded, f1 / 2.0f);
                }
                if(IntSize.getHeight-impl(v2) != 0) {
                    ((DraggableAnchorsConfig)object0).at(SheetValue.Expanded, Math.max(0.0f, f1 - ((float)IntSize.getHeight-impl(v2))));
                }
                return Unit.INSTANCE;
            }
            case 1: {
                Intrinsics.checkNotNullParameter(((DrawScope)object0), "$this$Canvas");
                float f2 = ((DrawScope)object0).toPx-0680j_4(this.x);
                float f3 = Size.getWidth-impl(((DrawScope)object0).getSize-NH-jbRc());
                Rect rect0 = ((Rect)this.z).intersect(-f2, ((Rect)this.z).getTop(), f3 + f2, ((Rect)this.z).getHeight());
                float f4 = Size.getMinDimension-impl(rect0.getSize-NH-jbRc());
                long v3 = rect0.getSize-NH-jbRc();
                DrawScope.drawRoundRect-u-Aw5IA$default(((DrawScope)object0), this.y, rect0.getTopLeft-F1C5BW0(), v3, CornerRadiusKt.CornerRadius$default(f4 * 8.0f / 100.0f, 0.0f, 2, null), null, 0.0f, null, 0, 0xF0, null);
                return Unit.INSTANCE;
            }
            case 2: {
                float f5 = this.x;
                ((androidx.compose.material.DraggableAnchorsConfig)object0).at(ModalBottomSheetValue.Hidden, f5);
                long v4 = this.y;
                if(!((ModalBottomSheetState)this.z).isSkipHalfExpanded$material_release() && ((float)IntSize.getHeight-impl(v4)) > f5 / 2.0f) {
                    ((androidx.compose.material.DraggableAnchorsConfig)object0).at(ModalBottomSheetValue.HalfExpanded, f5 / 2.0f);
                }
                if(IntSize.getHeight-impl(v4) != 0) {
                    ((androidx.compose.material.DraggableAnchorsConfig)object0).at(ModalBottomSheetValue.Expanded, Math.max(0.0f, f5 - ((float)IntSize.getHeight-impl(v4))));
                }
                return Unit.INSTANCE;
            }
            default: {
                Intrinsics.checkNotNullParameter(((DrawScope)object0), "$this$Canvas");
                int[] arr_v = CropBoxKt.DraggableLine.1.1.WhenMappings.$EnumSwitchMapping$0;
                TouchLinePoint touchLinePoint0 = (TouchLinePoint)this.z;
                switch(arr_v[touchLinePoint0.ordinal()]) {
                    case 1: 
                    case 2: {
                        v = OffsetKt.Offset(0.0f, Size.getHeight-impl(((DrawScope)object0).getSize-NH-jbRc()) / 2.0f);
                        break;
                    }
                    case 3: 
                    case 4: {
                        v = OffsetKt.Offset(Size.getWidth-impl(((DrawScope)object0).getSize-NH-jbRc()) / 2.0f, 0.0f);
                        break;
                    }
                    default: {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                switch(arr_v[touchLinePoint0.ordinal()]) {
                    case 1: 
                    case 2: {
                        v1 = OffsetKt.Offset(Size.getWidth-impl(((DrawScope)object0).getSize-NH-jbRc()), Size.getHeight-impl(((DrawScope)object0).getSize-NH-jbRc()) / 2.0f);
                        break;
                    }
                    case 3: 
                    case 4: {
                        v1 = OffsetKt.Offset(Size.getWidth-impl(((DrawScope)object0).getSize-NH-jbRc()) / 2.0f, Size.getHeight-impl(((DrawScope)object0).getSize-NH-jbRc()));
                        break;
                    }
                    default: {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                float f = ((DrawScope)object0).toPx-0680j_4(this.x);
                DrawScope.drawLine-NGM6Ib0$default(((DrawScope)object0), this.y, v, v1, f, 0, null, 0.0f, null, 0, 0x1F0, null);
                return Unit.INSTANCE;
            }
        }
    }
}

