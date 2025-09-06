package androidx.compose.material3;

import android.graphics.Matrix;
import androidx.compose.animation.core.Transition;
import androidx.compose.material.AnchoredDraggableKt;
import androidx.compose.material.DraggableAnchors;
import androidx.compose.material.ModalBottomSheetKt.modalBottomSheetAnchors.1.WhenMappings;
import androidx.compose.material.ModalBottomSheetState;
import androidx.compose.material.ModalBottomSheetValue;
import androidx.compose.material3.carousel.Keyline;
import androidx.compose.material3.carousel.KeylineList;
import androidx.compose.material3.carousel.KeylineListScope;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.DrawScope.DefaultImpls;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.IntSize;
import androidx.constraintlayout.compose.Measurer;
import com.kakao.kandinsky.designsystem.util.MatrixTransformKt;
import com.kakao.kandinsky.designsystem.util.Transform;
import com.kakao.kandinsky.preview.PreviewAnimator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class y3 extends Lambda implements Function1 {
    public final int w;
    public final float x;
    public final Object y;

    public y3(float f, Object object0, int v) {
        this.w = v;
        this.x = f;
        this.y = object0;
        super(1);
    }

    public y3(Object object0, float f, int v) {
        this.w = v;
        this.y = object0;
        this.x = f;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        switch(this.w) {
            case 0: {
                ((GraphicsLayerScope)object0).setAlpha(this.x);
                ((GraphicsLayerScope)object0).setShape(((Shape)this.y));
                ((GraphicsLayerScope)object0).setClip(true);
                return Unit.INSTANCE;
            }
            case 1: {
                Intrinsics.checkNotNullParameter(((DrawScope)object0), "$this$Canvas");
                float f = ((float)((Measurer)this.y).getLayoutCurrentWidth()) * this.x;
                float f1 = ((float)((Measurer)this.y).getLayoutCurrentHeight()) * this.x;
                float f2 = (Size.getWidth-impl(((DrawScope)object0).getSize-NH-jbRc()) - f) / 2.0f;
                float f3 = (Size.getHeight-impl(((DrawScope)object0).getSize-NH-jbRc()) - f1) / 2.0f;
                float f4 = f2 + f;
                DefaultImpls.drawLine-NGM6Ib0$default(((DrawScope)object0), 0xFFFFFFFF00000000L, OffsetKt.Offset(f2, f3), OffsetKt.Offset(f4, f3), 0.0f, 0, null, 0.0f, null, 0, 504, null);
                float f5 = f3 + f1;
                DefaultImpls.drawLine-NGM6Ib0$default(((DrawScope)object0), 0xFFFFFFFF00000000L, OffsetKt.Offset(f4, f3), OffsetKt.Offset(f4, f5), 0.0f, 0, null, 0.0f, null, 0, 504, null);
                DefaultImpls.drawLine-NGM6Ib0$default(((DrawScope)object0), 0xFFFFFFFF00000000L, OffsetKt.Offset(f4, f5), OffsetKt.Offset(f2, f5), 0.0f, 0, null, 0.0f, null, 0, 504, null);
                DefaultImpls.drawLine-NGM6Ib0$default(((DrawScope)object0), 0xFFFFFFFF00000000L, OffsetKt.Offset(f2, f5), OffsetKt.Offset(f2, f3), 0.0f, 0, null, 0.0f, null, 0, 504, null);
                float f6 = f2 + 1.0f + f;
                DefaultImpls.drawLine-NGM6Ib0$default(((DrawScope)object0), 0xFF00000000000000L, OffsetKt.Offset(f2 + 1.0f, f3 + 1.0f), OffsetKt.Offset(f6, f3 + 1.0f), 0.0f, 0, null, 0.0f, null, 0, 504, null);
                float f7 = f3 + 1.0f + f1;
                DefaultImpls.drawLine-NGM6Ib0$default(((DrawScope)object0), 0xFF00000000000000L, OffsetKt.Offset(f6, f3 + 1.0f), OffsetKt.Offset(f6, f7), 0.0f, 0, null, 0.0f, null, 0, 504, null);
                DefaultImpls.drawLine-NGM6Ib0$default(((DrawScope)object0), 0xFF00000000000000L, OffsetKt.Offset(f6, f7), OffsetKt.Offset(f2 + 1.0f, f7), 0.0f, 0, null, 0.0f, null, 0, 504, null);
                DefaultImpls.drawLine-NGM6Ib0$default(((DrawScope)object0), 0xFF00000000000000L, OffsetKt.Offset(f2 + 1.0f, f7), OffsetKt.Offset(f2 + 1.0f, f3 + 1.0f), 0.0f, 0, null, 0.0f, null, 0, 504, null);
                return Unit.INSTANCE;
            }
            case 2: {
                Intrinsics.checkNotNullParameter(((GraphicsLayerScope)object0), "$this$graphicsLayer");
                Transform transform0 = MatrixTransformKt.getTransform(((Matrix)this.y));
                ((GraphicsLayerScope)object0).setTransformOrigin-__ExYCQ(0L);
                ((GraphicsLayerScope)object0).setTranslationX(transform0.getTransitionX());
                ((GraphicsLayerScope)object0).setTranslationY(transform0.getTransitionY());
                ((GraphicsLayerScope)object0).setRotationZ(transform0.getRotateZ());
                ((GraphicsLayerScope)object0).setScaleX(transform0.getScaleX() * this.x);
                ((GraphicsLayerScope)object0).setScaleY(transform0.getScaleY() * this.x);
                return Unit.INSTANCE;
            }
            case 3: {
                Intrinsics.checkNotNullParameter(((Matrix)object0), "$this$buildMatrix");
                float f8 = Offset.getX-impl(PreviewAnimator.access$getContentBound$p(((PreviewAnimator)this.y)).getCenter-F1C5BW0());
                float f9 = Offset.getY-impl(PreviewAnimator.access$getContentBound$p(((PreviewAnimator)this.y)).getCenter-F1C5BW0());
                ((Matrix)object0).postScale(this.x, this.x, f8, f9);
                return Unit.INSTANCE;
            }
            case 4: {
                long v2 = ((IntSize)object0).unbox-impl();
                ModalBottomSheetState modalBottomSheetState0 = (ModalBottomSheetState)this.y;
                DraggableAnchors draggableAnchors0 = AnchoredDraggableKt.DraggableAnchors(new wd(this.x, modalBottomSheetState0, v2, 2));
                boolean z = modalBottomSheetState0.getAnchoredDraggableState$material_release().getAnchors().getSize() > 0;
                ModalBottomSheetValue modalBottomSheetValue0 = modalBottomSheetState0.getCurrentValue();
                if(z || !draggableAnchors0.hasAnchorFor(modalBottomSheetValue0)) {
                    switch(ModalBottomSheetKt.modalBottomSheetAnchors.1.WhenMappings.$EnumSwitchMapping$0[modalBottomSheetState0.getTargetValue().ordinal()]) {
                        case 1: {
                            modalBottomSheetValue0 = ModalBottomSheetValue.Hidden;
                            break;
                        }
                        case 2: 
                        case 3: {
                            ModalBottomSheetValue modalBottomSheetValue1 = ModalBottomSheetValue.HalfExpanded;
                            if(!draggableAnchors0.hasAnchorFor(modalBottomSheetValue1)) {
                                modalBottomSheetValue1 = ModalBottomSheetValue.Expanded;
                                if(!draggableAnchors0.hasAnchorFor(modalBottomSheetValue1)) {
                                    modalBottomSheetValue1 = ModalBottomSheetValue.Hidden;
                                }
                            }
                            modalBottomSheetValue0 = modalBottomSheetValue1;
                            break;
                        }
                        default: {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                }
                modalBottomSheetState0.getAnchoredDraggableState$material_release().updateAnchors(draggableAnchors0, modalBottomSheetValue0);
                return Unit.INSTANCE;
            }
            case 5: {
                long v3 = ((Number)object0).longValue();
                Transition transition0 = (Transition)this.y;
                if(!transition0.isSeeking()) {
                    transition0.onFrame$animation_core_release(v3, this.x);
                }
                return Unit.INSTANCE;
            }
            default: {
                KeylineList keylineList0 = (KeylineList)this.y;
                int v = keylineList0.size();
                for(int v1 = 0; v1 < v; ++v1) {
                    Keyline keyline0 = (Keyline)keylineList0.get(v1);
                    ((KeylineListScope)object0).add(keyline0.getSize() - Math.abs(this.x), keyline0.isAnchor());
                }
                return Unit.INSTANCE;
            }
        }
    }
}

