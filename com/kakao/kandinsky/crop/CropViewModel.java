package com.kakao.kandinsky.crop;

import android.graphics.Matrix;
import androidx.compose.foundation.layout.f3;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.unit.IntSizeKt;
import com.kakao.kandinsky.base.KDMviViewModel;
import com.kakao.kandinsky.base.contract.Destination;
import com.kakao.kandinsky.base.contract.KDEvent.Go;
import com.kakao.kandinsky.base.contract.KDEvent.UpdateConfirm;
import com.kakao.kandinsky.core.kdphoto.KDPhoto;
import com.kakao.kandinsky.crop.contract.CropIntent.Cancel;
import com.kakao.kandinsky.crop.contract.CropIntent.ChangeCropRatio;
import com.kakao.kandinsky.crop.contract.CropIntent.ChangeViewType;
import com.kakao.kandinsky.crop.contract.CropIntent.Confirm;
import com.kakao.kandinsky.crop.contract.CropIntent.FinishInteraction;
import com.kakao.kandinsky.crop.contract.CropIntent.Flip;
import com.kakao.kandinsky.crop.contract.CropIntent.Init;
import com.kakao.kandinsky.crop.contract.CropIntent.OnDrag;
import com.kakao.kandinsky.crop.contract.CropIntent.OnMove;
import com.kakao.kandinsky.crop.contract.CropIntent.RotateAngle;
import com.kakao.kandinsky.crop.contract.CropIntent.RotateDirect;
import com.kakao.kandinsky.crop.contract.CropIntent.UpdateContentBounds;
import com.kakao.kandinsky.crop.contract.CropIntent.UpdatePhoto;
import com.kakao.kandinsky.crop.contract.CropIntent.ZoomInOut;
import com.kakao.kandinsky.crop.contract.CropIntent.ZoomReset;
import com.kakao.kandinsky.crop.contract.CropIntent;
import com.kakao.kandinsky.crop.contract.CropRatioType;
import com.kakao.kandinsky.crop.contract.CropUiState;
import com.kakao.kandinsky.crop.contract.CropViewType;
import com.kakao.kandinsky.crop.contract.FlipType;
import com.kakao.kandinsky.crop.contract.RotateType;
import com.kakao.kandinsky.crop.contract.TouchCenterPoint;
import com.kakao.kandinsky.crop.contract.TouchDragPoint;
import com.kakao.kandinsky.crop.math.RectVertex;
import com.kakao.kandinsky.crop.math.RectVertexKt;
import com.kakao.kandinsky.designsystem.util.MatrixTransformKt;
import com.kakao.kandinsky.designsystem.util.OffsetExtensionKt;
import com.kakao.kandinsky.designsystem.util.RectExtensionKt;
import com.kakao.kandinsky.designsystem.util.SizeExtensionKt;
import com.kakao.kandinsky.utils.Logger;
import com.kakao.kandinsky.utils.MatrixExtensionKt;
import com.kakao.kandinsky.utils.MatrixValues;
import com.kakao.kandinsky.utils.MatrixValuesKt;
import com.kakao.kdtracker.KDTracker;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import u2.b;
import x9.d;
import x9.e;
import x9.f;
import x9.g;
import x9.h;
import x9.i;
import x9.j;
import x9.k;
import x9.l;
import x9.m;
import x9.n;
import x9.o;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001F\u0010\t\u001A\u00020\u00022\u0006\u0010\u0007\u001A\u00020\u00022\u0006\u0010\b\u001A\u00020\u0003H\u0014¢\u0006\u0004\b\t\u0010\n¨\u0006\u000B"}, d2 = {"Lcom/kakao/kandinsky/crop/CropViewModel;", "Lcom/kakao/kandinsky/base/KDMviViewModel;", "Lcom/kakao/kandinsky/crop/contract/CropUiState;", "Lcom/kakao/kandinsky/crop/contract/CropIntent;", "Lcom/kakao/kandinsky/base/contract/KDEvent;", "<init>", "()V", "current", "intent", "handleIntent", "(Lcom/kakao/kandinsky/crop/contract/CropUiState;Lcom/kakao/kandinsky/crop/contract/CropIntent;)Lcom/kakao/kandinsky/crop/contract/CropUiState;", "crop_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nCropViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CropViewModel.kt\ncom/kakao/kandinsky/crop/CropViewModel\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,323:1\n70#2:324\n73#2:325\n1#3:326\n*S KotlinDebug\n*F\n+ 1 CropViewModel.kt\ncom/kakao/kandinsky/crop/CropViewModel\n*L\n210#1:324\n206#1:325\n*E\n"})
public final class CropViewModel extends KDMviViewModel {
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;
        public static final int[] $EnumSwitchMapping$1;
        public static final int[] $EnumSwitchMapping$2;

        static {
            int[] arr_v = new int[FlipType.values().length];
            try {
                arr_v[FlipType.Horizontal.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[FlipType.Vertical.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
            int[] arr_v1 = new int[RotateType.values().length];
            try {
                arr_v1[RotateType.Right.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v1[RotateType.Left.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$1 = arr_v1;
            int[] arr_v2 = new int[CropRatioType.values().length];
            try {
                arr_v2[CropRatioType.Free.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v2[CropRatioType.Original.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$2 = arr_v2;
        }
    }

    public static final int $stable = 8;
    public final CropGestureController L0;

    @Inject
    public CropViewModel() {
        super(new CropUiState(null, null, null, null, 0.0f, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, 0.0f, null, null, 0x7FFFFF, null));
        this.L0 = new CropGestureController();
    }

    @NotNull
    public CropUiState handleIntent(@NotNull CropUiState cropUiState0, @NotNull CropIntent cropIntent0) {
        String s4;
        Pair pair0;
        String s = "crop-tab";
        Intrinsics.checkNotNullParameter(cropUiState0, "current");
        Intrinsics.checkNotNullParameter(cropIntent0, "intent");
        if(Intrinsics.areEqual(cropIntent0, Init.INSTANCE)) {
            return CropUiState.copy$default(cropUiState0, null, new g(this), null, null, 0.0f, new h(this), null, new i(this), null, null, false, false, new j(this), new k(this), new l(this), new m(this), new n(this), new o(this), null, new d(this), 0.0f, new e(this), new f(this), 0x140F5D, null);
        }
        if(cropIntent0 instanceof UpdatePhoto) {
            float f = MatrixTransformKt.getTransform(((UpdatePhoto)cropIntent0).getPhoto().getMatrix()).getRotateZ() % 90.0f;
            if(f > 45.0f) {
                f -= 90.0f;
            }
            else if(f < -45.0f) {
                f += 90.0f;
            }
            KDPhoto kDPhoto0 = ((UpdatePhoto)cropIntent0).getPhoto();
            KDPhoto kDPhoto1 = ((UpdatePhoto)cropIntent0).getPhoto();
            Rect rect0 = Rect.Companion.getZero();
            Rect rect1 = SizeKt.toRect-uvyYCjk(((UpdatePhoto)cropIntent0).getPhoto().getCropSize-NH-jbRc());
            return ((UpdatePhoto)cropIntent0).getPhoto().getMatrix().isIdentity() ? CropUiState.copy$default(cropUiState0, null, null, kDPhoto0, kDPhoto1, f, null, rect0, null, rect1, null, false, false, null, null, null, null, null, null, CropRatioType.Original, null, 1.0f, null, null, 0x6BF0A3, null) : CropUiState.copy$default(cropUiState0, null, null, kDPhoto0, kDPhoto1, f, null, rect0, null, rect1, null, false, false, null, null, null, null, null, null, CropRatioType.Free, null, 1.0f, null, null, 0x6BF0A3, null);
        }
        if(cropIntent0 instanceof UpdateContentBounds) {
            return CropUiState.copy$default(cropUiState0, null, null, null, null, 0.0f, null, ((UpdateContentBounds)cropIntent0).getBounds(), null, null, null, true, false, null, null, null, null, null, null, null, null, 0.0f, null, null, 0x7FFBBF, null);
        }
        if(cropIntent0 instanceof ChangeViewType) {
            if(((ChangeViewType)cropIntent0).getViewType() != CropViewType.Crop) {
                s = "rotate-tab";
            }
            KDTracker.clickEvent$default(KDTracker.INSTANCE, "crop-tab", s, null, null, 12, null);
            return CropUiState.copy$default(cropUiState0, ((ChangeViewType)cropIntent0).getViewType(), null, null, null, 0.0f, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, 0.0f, null, null, 0x7FFFFE, null);
        }
        if(cropIntent0 instanceof Flip) {
            String s1 = ((Flip)cropIntent0).getFlipType() == FlipType.Horizontal ? "fliph" : "flipv";
            KDTracker.INSTANCE.clickEvent("crop-tab", "rotate", s1, "rotate");
            Matrix matrix0 = cropUiState0.getPhoto().getMatrix();
            long v = cropUiState0.getPhoto().getCropCenter-F1C5BW0();
            switch(WhenMappings.$EnumSwitchMapping$0[((Flip)cropIntent0).getFlipType().ordinal()]) {
                case 1: {
                    pair0 = TuplesKt.to(-1.0f, 1.0f);
                    break;
                }
                case 2: {
                    pair0 = TuplesKt.to(1.0f, -1.0f);
                    break;
                }
                default: {
                    throw new NoWhenBranchMatchedException();
                }
            }
            float f1 = ((Number)pair0.component1()).floatValue();
            float f2 = ((Number)pair0.component2()).floatValue();
            String s2 = Offset.toString-impl(v);
            Logger.INSTANCE.log("flip before " + f1 + " " + f2 + " " + s2 + " " + matrix0);
            matrix0.postScale(f1, f2, Offset.getX-impl(v), Offset.getY-impl(v));
            Logger.INSTANCE.log("flip after " + matrix0);
            float f3 = cropUiState0.getAngle();
            KDPhoto kDPhoto2 = KDPhoto.copy-2Ycw6ww$default(cropUiState0.getPhoto(), null, 0, null, 0L, false, 0, MatrixValuesKt.getMatrixValues(matrix0), 0L, null, 0.0f, null, null, null, null, 0x3FBF, null);
            return cropUiState0.getCropRatioType() == CropRatioType.Original ? CropUiState.copy$default(cropUiState0, null, null, kDPhoto2, null, -f3, null, null, null, null, null, false, false, null, null, null, null, null, null, CropRatioType.Free, null, 0.0f, null, null, 0x7BFFEB, null) : CropUiState.copy$default(cropUiState0, null, null, kDPhoto2, null, -f3, null, null, null, null, null, false, false, null, null, null, null, null, null, cropUiState0.getCropRatioType(), null, 0.0f, null, null, 0x7BFFEB, null);
        }
        if(cropIntent0 instanceof RotateAngle) {
            Matrix matrix1 = cropUiState0.getPhoto().getMatrix();
            long v1 = cropUiState0.getPhoto().getCropCenter-F1C5BW0();
            float f4 = cropUiState0.getAngle();
            float f5 = ((RotateAngle)cropIntent0).getAngle();
            String s3 = Offset.toString-impl(v1);
            Logger.INSTANCE.log("rotate before " + f4 + " " + f5 + " " + s3 + " " + matrix1);
            matrix1.postRotate(((RotateAngle)cropIntent0).getAngle() - f4, Offset.getX-impl(v1), Offset.getY-impl(v1));
            Logger.INSTANCE.log("rotate after " + matrix1);
            long v2 = cropUiState0.getCropRect().getCenter-F1C5BW0();
            Rect rect2 = RectExtensionKt.mapRect(MatrixExtensionKt.invert(matrix1), cropUiState0.getCropRect());
            Rect rect3 = cropUiState0.getPhoto().getImageRect();
            Matrix matrix2 = this.L0.adjustScaleIntoImage-YqVAtuI(matrix1, v2, rect2, rect3, cropUiState0.getManualScale());
            float f6 = ((RotateAngle)cropIntent0).getAngle();
            KDPhoto kDPhoto3 = KDPhoto.copy-2Ycw6ww$default(cropUiState0.getPhoto(), null, 0, null, 0L, false, 0, MatrixValuesKt.getMatrixValues(matrix2), 0L, null, 0.0f, null, null, null, null, 0x3FBF, null);
            return cropUiState0.getCropRatioType() == CropRatioType.Original ? CropUiState.copy$default(cropUiState0, null, null, kDPhoto3, null, f6, null, null, null, null, null, false, false, null, null, null, null, null, null, CropRatioType.Free, null, 0.0f, null, null, 0x7BFFEB, null) : CropUiState.copy$default(cropUiState0, null, null, kDPhoto3, null, f6, null, null, null, null, null, false, false, null, null, null, null, null, null, cropUiState0.getCropRatioType(), null, 0.0f, null, null, 0x7BFFEB, null);
        }
        if(cropIntent0 instanceof RotateDirect) {
            KDTracker.INSTANCE.clickEvent("crop-tab", "rotate", "rotate90", "rotate");
            KDPhoto kDPhoto4 = cropUiState0.getPhoto();
            Matrix matrix3 = kDPhoto4.getMatrix();
            Logger logger0 = Logger.INSTANCE;
            logger0.log("rotate direct before " + matrix3);
            switch(WhenMappings.$EnumSwitchMapping$1[((RotateDirect)cropIntent0).getRotateType().ordinal()]) {
                case 1: {
                    matrix3.postRotate(90.0f);
                    matrix3.postTranslate(Size.getHeight-impl(kDPhoto4.getCropSize-NH-jbRc()), 0.0f);
                    break;
                }
                case 2: {
                    matrix3.postRotate(-90.0f);
                    matrix3.postTranslate(0.0f, Size.getWidth-impl(kDPhoto4.getCropSize-NH-jbRc()));
                }
            }
            logger0.log("rotate direct after " + matrix3);
            long v3 = SizeExtensionKt.reverse-uvyYCjk(cropUiState0.getPhoto().getCropSize-NH-jbRc());
            KDPhoto kDPhoto5 = KDPhoto.copy-2Ycw6ww$default(cropUiState0.getPhoto(), null, 0, null, 0L, false, 0, MatrixValuesKt.getMatrixValues(matrix3), v3, null, 0.0f, null, null, null, null, 0x3F3F, null);
            Rect rect4 = SizeKt.toRect-uvyYCjk(v3);
            return cropUiState0.getCropRatioType() == CropRatioType.Original ? CropUiState.copy$default(cropUiState0, null, null, kDPhoto5, null, 0.0f, null, null, null, rect4, null, false, false, null, null, null, null, null, null, CropRatioType.Free, null, 0.0f, null, null, 0x7BFEFB, null) : CropUiState.copy$default(cropUiState0, null, null, kDPhoto5, null, 0.0f, null, null, null, rect4, null, false, false, null, null, null, null, null, null, cropUiState0.getCropRatioType(), null, 0.0f, null, null, 0x7BFEFB, null);
        }
        CropGestureController cropGestureController0 = this.L0;
        if(cropIntent0 instanceof ChangeCropRatio) {
            CropRatioType cropRatioType0 = ((ChangeCropRatio)cropIntent0).getCropRatioType();
            int[] arr_v = WhenMappings.$EnumSwitchMapping$2;
            switch(arr_v[cropRatioType0.ordinal()]) {
                case 1: {
                    s4 = "free";
                    break;
                }
                case 2: {
                    s4 = "original";
                    break;
                }
                default: {
                    s4 = cropRatioType0.getRatioX() + ":" + cropRatioType0.getRatioY();
                }
            }
            KDTracker.INSTANCE.clickEvent("crop-tab", "ratio", s4, "setratio");
            switch(arr_v[((ChangeCropRatio)cropIntent0).getCropRatioType().ordinal()]) {
                case 1: {
                    return CropUiState.copy$default(cropUiState0, null, null, null, null, 0.0f, null, null, null, null, null, false, false, null, null, null, null, null, null, ((ChangeCropRatio)cropIntent0).getCropRatioType(), null, 0.0f, null, null, 0x7BFFFF, null);
                }
                case 2: {
                    return CropUiState.copy$default(cropUiState0, null, null, KDPhoto.copy-2Ycw6ww$default(cropUiState0.getPhoto(), null, 0, null, 0L, false, 0, MatrixValues.constructor-impl$default(null, 1, null), IntSizeKt.toSize-ozmzZPI(cropUiState0.getPhoto().getBitmapSize-YbymL2g()), null, 0.0f, null, null, null, null, 0x3F3F, null), null, 0.0f, null, null, null, SizeKt.toRect-uvyYCjk(IntSizeKt.toSize-ozmzZPI(cropUiState0.getPhoto().getBitmapSize-YbymL2g())), null, false, false, null, null, null, null, null, null, ((ChangeCropRatio)cropIntent0).getCropRatioType(), null, 1.0f, null, null, 0x6BFEEB, null);
                }
                default: {
                    Rect rect5 = RectExtensionKt.mapRect(cropUiState0.getDisplayInverseMatrix(), cropUiState0.getContentBounds());
                    float f7 = ((ChangeCropRatio)cropIntent0).getCropRatioType().getRatioX();
                    float f8 = ((ChangeCropRatio)cropIntent0).getCropRatioType().getRatioY();
                    Rect rect6 = cropGestureController0.getRatioAdjustedRect(TouchCenterPoint.Center, rect5, f7, f8);
                    this.sendIntent(FinishInteraction.INSTANCE);
                    return CropUiState.copy$default(cropUiState0, null, null, null, null, 0.0f, null, null, null, rect6, null, false, false, null, null, null, null, null, null, ((ChangeCropRatio)cropIntent0).getCropRatioType(), null, 0.0f, null, null, 0x7BFEFF, null);
                }
            }
        }
        if(cropIntent0 instanceof OnMove) {
            long v4 = OffsetExtensionKt.mapVector-Uv8p0NA(cropUiState0.getDisplayInverseMatrix(), ((OnMove)cropIntent0).getOffset-F1C5BW0());
            if(Intrinsics.areEqual(cropGestureController0.getDraggingRect(), Rect.Companion.getZero())) {
                cropGestureController0.startDrag-viCIZxY(cropUiState0.getPhoto().getBitmapSize-YbymL2g(), cropUiState0.getCropRect());
            }
            long v5 = cropGestureController0.getMovableOffset-qto3Fdw(OffsetExtensionKt.mapVector-Uv8p0NA(MatrixExtensionKt.invert(cropUiState0.getPhoto().getMatrix()), v4), RectExtensionKt.mapRect(MatrixExtensionKt.invert(cropUiState0.getPhoto().getMatrix()), cropUiState0.getCropRect()), cropUiState0.getPhoto().getImageRect());
            long v6 = OffsetExtensionKt.mapVector-Uv8p0NA(cropUiState0.getPhoto().getMatrix(), v5);
            return CropUiState.copy$default(cropUiState0, null, null, KDPhoto.copy-2Ycw6ww$default(cropUiState0.getPhoto(), null, 0, null, 0L, false, 0, MatrixValuesKt.getMatrixValues(MatrixExtensionKt.buildMatrix(cropUiState0.getPhoto().getMatrix(), new f3(Offset.getX-impl(v6), Offset.getY-impl(v6), 3))), 0L, null, 0.0f, null, null, null, null, 0x3FBF, null), null, 0.0f, null, null, null, null, null, false, true, null, null, null, null, null, null, null, null, MatrixTransformKt.getTransform(cropUiState0.getPhoto().getMatrix()).getScaleX(), null, null, 0x6FF7FB, null);
        }
        if(cropIntent0 instanceof OnDrag) {
            long v7 = OffsetExtensionKt.mapVector-Uv8p0NA(cropUiState0.getDisplayInverseMatrix(), ((OnDrag)cropIntent0).getOffset-F1C5BW0());
            if(Intrinsics.areEqual(cropGestureController0.getDraggingRect(), Rect.Companion.getZero())) {
                cropGestureController0.startDrag-viCIZxY(cropUiState0.getPhoto().getBitmapSize-YbymL2g(), cropUiState0.getCropRect());
            }
            TouchDragPoint touchDragPoint0 = ((OnDrag)cropIntent0).getTouchPoint();
            float f9 = MatrixTransformKt.getTransform(cropUiState0.getPhoto().getMatrix()).getRotateZ();
            RectVertex rectVertex0 = RectVertexKt.mapVertex(cropUiState0.getPhoto().getMatrix(), RectVertexKt.toVertex(cropUiState0.getPhoto().getImageRect()));
            Pair pair1 = this.L0.drag-YqVAtuI(touchDragPoint0, v7, cropUiState0.getCropRatioType(), f9, rectVertex0);
            Object object0 = pair1.component1();
            Object object1 = pair1.component2();
            return cropUiState0.getCropRatioType() == CropRatioType.Original ? CropUiState.copy$default(cropUiState0, null, null, null, null, 0.0f, null, null, null, ((Rect)object0), ((Rect)object1), false, true, null, null, null, null, null, null, CropRatioType.Free, null, 0.0f, null, null, 0x7BF4FF, null) : CropUiState.copy$default(cropUiState0, null, null, null, null, 0.0f, null, null, null, ((Rect)object0), ((Rect)object1), false, true, null, null, null, null, null, null, cropUiState0.getCropRatioType(), null, 0.0f, null, null, 0x7BF4FF, null);
        }
        if(Intrinsics.areEqual(cropIntent0, FinishInteraction.INSTANCE)) {
            KDPhoto kDPhoto6 = cropUiState0.getPhoto();
            Matrix matrix4 = MatrixExtensionKt.buildMatrix$default(null, new b(7, kDPhoto6, cropUiState0), 1, null);
            Pair pair2 = TuplesKt.to(cropGestureController0.adjustMinSize(RectExtensionKt.mapRect(matrix4, cropUiState0.getCropRect())), MatrixExtensionKt.buildMatrix(kDPhoto6.getMatrix(), new bb.b(matrix4, 3)));
            Object object2 = pair2.component1();
            Matrix matrix5 = cropGestureController0.fitMatrixIntoImage(((Matrix)pair2.component2()), ((Rect)object2), kDPhoto6.getImageRect());
            cropGestureController0.endInteraction();
            long v8 = ((Rect)object2).getSize-NH-jbRc();
            KDPhoto kDPhoto7 = KDPhoto.copy-2Ycw6ww$default(kDPhoto6, null, 0, null, 0L, false, 0, MatrixValuesKt.getMatrixValues(matrix5), v8, null, 0.0f, null, null, null, null, 0x3F3F, null);
            float f10 = MatrixTransformKt.getTransform(matrix5).getScaleX();
            return CropUiState.copy$default(cropUiState0, null, null, kDPhoto7, null, 0.0f, null, null, null, SizeKt.toRect-uvyYCjk(((Rect)object2).getSize-NH-jbRc()), null, false, false, null, null, null, null, null, null, null, null, f10, null, null, 0x6FF4FB, null);
        }
        if(cropIntent0 instanceof ZoomInOut) {
            long v9 = cropUiState0.getCropRect().getCenter-F1C5BW0();
            Matrix matrix6 = cropUiState0.getPhoto().getMatrix();
            matrix6.postScale(((ZoomInOut)cropIntent0).getZoom(), ((ZoomInOut)cropIntent0).getZoom(), Offset.getX-impl(v9), Offset.getY-impl(v9));
            KDPhoto kDPhoto8 = KDPhoto.copy-2Ycw6ww$default(cropUiState0.getPhoto(), null, 0, null, 0L, false, 0, MatrixValuesKt.getMatrixValues(matrix6), 0L, null, 0.0f, null, null, null, null, 0x3FBF, null);
            return cropUiState0.getCropRatioType() == CropRatioType.Original ? CropUiState.copy$default(cropUiState0, null, null, kDPhoto8, null, 0.0f, null, null, null, null, null, false, false, null, null, null, null, null, null, CropRatioType.Free, null, 0.0f, null, null, 0x7BFFFB, null) : CropUiState.copy$default(cropUiState0, null, null, kDPhoto8, null, 0.0f, null, null, null, null, null, false, false, null, null, null, null, null, null, cropUiState0.getCropRatioType(), null, 0.0f, null, null, 0x7BFFFB, null);
        }
        if(!Intrinsics.areEqual(cropIntent0, ZoomReset.INSTANCE)) {
            if(Intrinsics.areEqual(cropIntent0, Cancel.INSTANCE)) {
                this.cancel(this, cropUiState0.getChanged());
                return cropUiState0;
            }
            if(!Intrinsics.areEqual(cropIntent0, Confirm.INSTANCE)) {
                throw new NoWhenBranchMatchedException();
            }
            this.sendEvent(new UpdateConfirm(cropUiState0.getPhoto()));
            this.sendEvent(new Go(Destination.HOME));
            return cropUiState0;
        }
        return cropUiState0;
    }

    @Override  // com.kakao.kandinsky.base.KDMviViewModel
    public Object handleIntent(Object object0, Object object1) {
        return this.handleIntent(((CropUiState)object0), ((CropIntent)object1));
    }
}

