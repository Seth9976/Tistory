package com.kakao.kandinsky.crop;

import android.graphics.Matrix;
import androidx.compose.material3.y8;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntRectKt;
import androidx.compose.ui.unit.IntSize;
import com.kakao.kandinsky.crop.contract.CropRatioType;
import com.kakao.kandinsky.crop.contract.TouchCenterPoint;
import com.kakao.kandinsky.crop.contract.TouchCirclePoint;
import com.kakao.kandinsky.crop.contract.TouchDragPoint;
import com.kakao.kandinsky.crop.contract.TouchLinePoint;
import com.kakao.kandinsky.crop.contract.TouchPoint;
import com.kakao.kandinsky.crop.math.Line;
import com.kakao.kandinsky.crop.math.NamedVertex;
import com.kakao.kandinsky.crop.math.RectVertex;
import com.kakao.kandinsky.crop.math.RectVertexKt;
import com.kakao.kandinsky.designsystem.util.OffsetExtensionKt;
import com.kakao.kandinsky.designsystem.util.RectExtensionKt;
import com.kakao.kandinsky.gesture.ImageGestureController;
import com.kakao.kandinsky.gesture.RubberBand;
import com.kakao.kandinsky.utils.MatrixExtensionKt;
import ha.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0007\u0018\u0000 72\u00020\u0001:\u00017B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u000B\u001A\u00020\b2\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJF\u0010\u0019\u001A\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00162\u0006\u0010\r\u001A\u00020\f2\u0006\u0010\u000F\u001A\u00020\u000E2\u0006\u0010\u0011\u001A\u00020\u00102\u0006\u0010\u0013\u001A\u00020\u00122\u0006\u0010\u0015\u001A\u00020\u0014ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001B\u001A\u00020\u00062\u0006\u0010\u001A\u001A\u00020\u0006¢\u0006\u0004\b\u001B\u0010\u001CJ-\u0010 \u001A\u00020\u00062\u0006\u0010\r\u001A\u00020\u001D2\u0006\u0010\u001A\u001A\u00020\u00062\u0006\u0010\u001E\u001A\u00020\u00122\u0006\u0010\u001F\u001A\u00020\u0012¢\u0006\u0004\b \u0010!J\r\u0010\"\u001A\u00020\b¢\u0006\u0004\b\"\u0010\u0003J8\u0010*\u001A\u00020#2\u0006\u0010$\u001A\u00020#2\u0006\u0010%\u001A\u00020\u000E2\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010&\u001A\u00020\u00062\u0006\u0010\'\u001A\u00020\u0012ø\u0001\u0000¢\u0006\u0004\b(\u0010)J%\u0010+\u001A\u00020#2\u0006\u0010$\u001A\u00020#2\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010&\u001A\u00020\u0006¢\u0006\u0004\b+\u0010,J(\u0010/\u001A\u00020\u000E2\u0006\u0010\u000F\u001A\u00020\u000E2\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010&\u001A\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b-\u0010.R\"\u00106\u001A\u00020\u00068\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b0\u00101\u001A\u0004\b2\u00103\"\u0004\b4\u00105\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u00068"}, d2 = {"Lcom/kakao/kandinsky/crop/CropGestureController;", "", "<init>", "()V", "Landroidx/compose/ui/unit/IntSize;", "originalSize", "Landroidx/compose/ui/geometry/Rect;", "cropRect", "", "startDrag-viCIZxY", "(JLandroidx/compose/ui/geometry/Rect;)V", "startDrag", "Lcom/kakao/kandinsky/crop/contract/TouchDragPoint;", "touchPoint", "Landroidx/compose/ui/geometry/Offset;", "moveOffset", "Lcom/kakao/kandinsky/crop/contract/CropRatioType;", "ratio", "", "rotate", "Lcom/kakao/kandinsky/crop/math/RectVertex;", "imageVertex", "Lkotlin/Pair;", "drag-YqVAtuI", "(Lcom/kakao/kandinsky/crop/contract/TouchDragPoint;JLcom/kakao/kandinsky/crop/contract/CropRatioType;FLcom/kakao/kandinsky/crop/math/RectVertex;)Lkotlin/Pair;", "drag", "rect", "adjustMinSize", "(Landroidx/compose/ui/geometry/Rect;)Landroidx/compose/ui/geometry/Rect;", "Lcom/kakao/kandinsky/crop/contract/TouchPoint;", "ratioX", "ratioY", "getRatioAdjustedRect", "(Lcom/kakao/kandinsky/crop/contract/TouchPoint;Landroidx/compose/ui/geometry/Rect;FF)Landroidx/compose/ui/geometry/Rect;", "endInteraction", "Landroid/graphics/Matrix;", "matrix", "pivot", "imageRect", "minScale", "adjustScaleIntoImage-YqVAtuI", "(Landroid/graphics/Matrix;JLandroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/geometry/Rect;F)Landroid/graphics/Matrix;", "adjustScaleIntoImage", "fitMatrixIntoImage", "(Landroid/graphics/Matrix;Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/geometry/Rect;)Landroid/graphics/Matrix;", "getMovableOffset-qto3Fdw", "(JLandroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/geometry/Rect;)J", "getMovableOffset", "b", "Landroidx/compose/ui/geometry/Rect;", "getDraggingRect", "()Landroidx/compose/ui/geometry/Rect;", "setDraggingRect", "(Landroidx/compose/ui/geometry/Rect;)V", "draggingRect", "Companion", "crop_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nCropController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CropController.kt\ncom/kakao/kandinsky/crop/CropGestureController\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,425:1\n1#2:426\n1#2:480\n2310#3,14:427\n1549#3:441\n1620#3,3:442\n1789#3,3:445\n1549#3:448\n1620#3,3:449\n2310#3,14:452\n1549#3:466\n1620#3,3:467\n1603#3,9:470\n1855#3:479\n1856#3:481\n1612#3:482\n1747#3,3:483\n*S KotlinDebug\n*F\n+ 1 CropController.kt\ncom/kakao/kandinsky/crop/CropGestureController\n*L\n393#1:480\n159#1:427,14\n274#1:441\n274#1:442,3\n291#1:445,3\n344#1:448\n344#1:449,3\n346#1:452,14\n372#1:466\n372#1:467,3\n393#1:470,9\n393#1:479\n393#1:481\n393#1:482\n394#1:483,3\n*E\n"})
public final class CropGestureController {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001A\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001A\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001A\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/kakao/kandinsky/crop/CropGestureController$Companion;", "", "", "CROP_MIN_SIZE_RATIO", "F", "DEFAULT_CROP_MIN_SIZE", "DRAG_RUBBER_BAND_RATIO", "crop_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[TouchLinePoint.values().length];
            try {
                arr_v[TouchLinePoint.Top.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[TouchLinePoint.Bottom.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[TouchLinePoint.Left.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[TouchLinePoint.Right.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    public static final int $stable;
    @NotNull
    public static final Companion Companion;
    public final ImageGestureController a;
    public Rect b;
    public float c;

    static {
        CropGestureController.Companion = new Companion(null);
        CropGestureController.$stable = 8;
    }

    public CropGestureController() {
        this.a = new ImageGestureController();
        this.b = Rect.Companion.getZero();
        this.c = 200.0f;
    }

    public final Rect a(TouchCirclePoint touchCirclePoint0, CropRatioType cropRatioType0, Rect rect0, float f, RectVertex rectVertex0) {
        long v3;
        long v2;
        Line line0 = null;
        Matrix matrix0 = MatrixExtensionKt.buildMatrix$default(null, new y8(rectVertex0.getCenter-F1C5BW0(), f, 3), 1, null);
        RectVertex rectVertex1 = RectVertexKt.mapVertex(matrix0, rectVertex0).sorted();
        NamedVertex namedVertex0 = RectVertexKt.mapVertex(matrix0, RectVertexKt.toVertex(rect0)).toNamedVertex(touchCirclePoint0);
        long v = rectVertex1.getCenter-F1C5BW0();
        Iterable iterable0 = namedVertex0.getOthers();
        ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(iterable0, 10));
        for(Object object0: iterable0) {
            long v1 = ((Offset)object0).unbox-impl();
            Line line1 = new Line(namedVertex0.getFixPoint-F1C5BW0(), v1, null);
            float f1 = rectVertex1.getLeft();
            float f2 = rectVertex1.getTop();
            float f3 = rectVertex1.getRight();
            float f4 = rectVertex1.getBottom();
            if(Offset.getY-impl(v1) < f2) {
                line0 = new Line(OffsetKt.Offset(f1, f2), OffsetKt.Offset(f3, f2), null);
            }
            Offset offset0 = line1.findNearestIntersection-H5M4yMg(namedVertex0.getFixPoint-F1C5BW0(), CollectionsKt__CollectionsKt.listOfNotNull(new Line[]{line0, (Offset.getY-impl(v1) > f4 ? new Line(OffsetKt.Offset(f1, f4), OffsetKt.Offset(f3, f4), null) : null), (Offset.getX-impl(v1) < f1 ? new Line(OffsetKt.Offset(f1, f2), OffsetKt.Offset(f1, f4), null) : null), (Offset.getX-impl(v1) > f3 ? new Line(OffsetKt.Offset(f3, f2), OffsetKt.Offset(f3, f4), null) : null)}));
            if(offset0 == null) {
                v3 = v1;
                v2 = v3;
            }
            else {
                v2 = offset0.unbox-impl();
                v3 = v1;
            }
            arrayList0.add(Offset.box-impl(Offset.minus-MK-Hz9U(v3, v2)));
            line0 = null;
        }
        long v4 = 0L;
        for(Object object1: arrayList0) {
            v4 = Offset.plus-MK-Hz9U(v4, ((Offset)object1).unbox-impl());
        }
        Iterable iterable1 = OffsetExtensionKt.mapOffsets(MatrixExtensionKt.buildMatrix$default(null, new y8(v, f, 5), 1, null), CollectionsKt__CollectionsKt.listOf(new Offset[]{Offset.box-impl(namedVertex0.getFixPoint-F1C5BW0()), Offset.box-impl(Offset.minus-MK-Hz9U(namedVertex0.getMovePoint-F1C5BW0(), v4))}));
        Iterator iterator2 = iterable1.iterator();
        if(!iterator2.hasNext()) {
            throw new NoSuchElementException();
        }
        Object object2 = iterator2.next();
        float f5;
        for(f5 = Offset.getX-impl(((Offset)object2).unbox-impl()); iterator2.hasNext(); f5 = Math.min(f5, Offset.getX-impl(((Offset)object3).unbox-impl()))) {
            Object object3 = iterator2.next();
        }
        Iterator iterator3 = iterable1.iterator();
        if(!iterator3.hasNext()) {
            throw new NoSuchElementException();
        }
        Object object4 = iterator3.next();
        float f6;
        for(f6 = Offset.getY-impl(((Offset)object4).unbox-impl()); iterator3.hasNext(); f6 = Math.min(f6, Offset.getY-impl(((Offset)object5).unbox-impl()))) {
            Object object5 = iterator3.next();
        }
        Iterator iterator4 = iterable1.iterator();
        if(!iterator4.hasNext()) {
            throw new NoSuchElementException();
        }
        Object object6 = iterator4.next();
        float f7;
        for(f7 = Offset.getX-impl(((Offset)object6).unbox-impl()); iterator4.hasNext(); f7 = Math.max(f7, Offset.getX-impl(((Offset)object7).unbox-impl()))) {
            Object object7 = iterator4.next();
        }
        Iterator iterator5 = iterable1.iterator();
        if(!iterator5.hasNext()) {
            throw new NoSuchElementException();
        }
        Object object8 = iterator5.next();
        float f8;
        for(f8 = Offset.getY-impl(((Offset)object8).unbox-impl()); iterator5.hasNext(); f8 = Math.max(f8, Offset.getY-impl(((Offset)object9).unbox-impl()))) {
            Object object9 = iterator5.next();
        }
        NamedVertex namedVertex1 = RectVertexKt.mapVertex(matrix0, RectVertexKt.toVertex(this.getRatioAdjustedRect(touchCirclePoint0, new Rect(f5, f6, f7, f8), rect0.getWidth(), rect0.getHeight()))).toNamedVertex(touchCirclePoint0);
        Offset offset1 = Offset.box-impl(CropGestureController.d(namedVertex1.getFixPoint-F1C5BW0(), namedVertex1.getMovePoint-F1C5BW0(), rectVertex1));
        if(!new Line(namedVertex1.getFixPoint-F1C5BW0(), namedVertex1.getMovePoint-F1C5BW0(), null).inRange-k-4lQ0M(offset1.unbox-impl())) {
            offset1 = null;
        }
        Iterable iterable2 = OffsetExtensionKt.mapOffsets(MatrixExtensionKt.invert(matrix0), CollectionsKt__CollectionsKt.listOf(new Offset[]{Offset.box-impl((offset1 == null ? namedVertex1.getMovePoint-F1C5BW0() : offset1.unbox-impl())), Offset.box-impl(namedVertex1.getFixPoint-F1C5BW0())}));
        Iterator iterator6 = iterable2.iterator();
        if(!iterator6.hasNext()) {
            throw new NoSuchElementException();
        }
        Object object10 = iterator6.next();
        float f9;
        for(f9 = Offset.getX-impl(((Offset)object10).unbox-impl()); iterator6.hasNext(); f9 = Math.min(f9, Offset.getX-impl(((Offset)object11).unbox-impl()))) {
            Object object11 = iterator6.next();
        }
        Iterator iterator7 = iterable2.iterator();
        if(!iterator7.hasNext()) {
            throw new NoSuchElementException();
        }
        Object object12 = iterator7.next();
        float f10;
        for(f10 = Offset.getY-impl(((Offset)object12).unbox-impl()); iterator7.hasNext(); f10 = Math.min(f10, Offset.getY-impl(((Offset)object13).unbox-impl()))) {
            Object object13 = iterator7.next();
        }
        Iterator iterator8 = iterable2.iterator();
        if(!iterator8.hasNext()) {
            throw new NoSuchElementException();
        }
        Object object14 = iterator8.next();
        float f11;
        for(f11 = Offset.getX-impl(((Offset)object14).unbox-impl()); iterator8.hasNext(); f11 = Math.max(f11, Offset.getX-impl(((Offset)object15).unbox-impl()))) {
            Object object15 = iterator8.next();
        }
        Iterator iterator9 = iterable2.iterator();
        if(!iterator9.hasNext()) {
            throw new NoSuchElementException();
        }
        Object object16 = iterator9.next();
        float f12;
        for(f12 = Offset.getY-impl(((Offset)object16).unbox-impl()); iterator9.hasNext(); f12 = Math.max(f12, Offset.getY-impl(((Offset)object17).unbox-impl()))) {
            Object object17 = iterator9.next();
        }
        return new Rect(f9, f10, f11, f12);
    }

    @NotNull
    public final Rect adjustMinSize(@NotNull Rect rect0) {
        Intrinsics.checkNotNullParameter(rect0, "rect");
        return this.b(TouchCenterPoint.Center, rect0, rect0.getWidth(), rect0.getHeight());
    }

    @NotNull
    public final Matrix adjustScaleIntoImage-YqVAtuI(@NotNull Matrix matrix0, long v, @NotNull Rect rect0, @NotNull Rect rect1, float f) {
        Intrinsics.checkNotNullParameter(matrix0, "matrix");
        Intrinsics.checkNotNullParameter(rect0, "cropRect");
        Intrinsics.checkNotNullParameter(rect1, "imageRect");
        return this.a.adjustScaleIntoImage-YqVAtuI(matrix0, v, rect0, rect1, f);
    }

    public final Rect b(TouchPoint touchPoint0, Rect rect0, float f, float f1) {
        Float float0 = (float)(this.c / f1 * f);
        float f2 = this.c;
        Float float1 = null;
        if(Float.compare(f2, float0.floatValue()) >= 0) {
            float0 = null;
        }
        if(float0 != null) {
            f2 = (float)float0;
        }
        Float float2 = (float)(this.c / f * f1);
        float f3 = this.c;
        if(f3 < float2.floatValue()) {
            float1 = float2;
        }
        if(float1 != null) {
            f3 = (float)float1;
        }
        float f4 = Math.max(f2 - rect0.getWidth(), 0.0f);
        float f5 = Math.max(f3 - rect0.getHeight(), 0.0f);
        if(touchPoint0 == TouchLinePoint.Top) {
            return RectExtensionKt.add$default(rect0, null, ((float)(-f5)), null, null, 13, null);
        }
        if(touchPoint0 == TouchLinePoint.Bottom) {
            return RectExtensionKt.add$default(rect0, null, null, null, f5, 7, null);
        }
        if(touchPoint0 == TouchLinePoint.Left) {
            return RectExtensionKt.add$default(rect0, ((float)(-f4)), null, null, null, 14, null);
        }
        if(touchPoint0 == TouchLinePoint.Right) {
            return RectExtensionKt.add$default(rect0, null, null, f4, null, 11, null);
        }
        if(touchPoint0 == TouchCirclePoint.TopLeft) {
            return RectExtensionKt.add$default(rect0, ((float)(-f4)), ((float)(-f5)), null, null, 12, null);
        }
        if(touchPoint0 == TouchCirclePoint.TopRight) {
            return RectExtensionKt.add$default(rect0, null, ((float)(-f5)), f4, null, 9, null);
        }
        if(touchPoint0 == TouchCirclePoint.BottomLeft) {
            return RectExtensionKt.add$default(rect0, ((float)(-f4)), null, null, f5, 6, null);
        }
        if(touchPoint0 == TouchCirclePoint.BottomRight) {
            return RectExtensionKt.add$default(rect0, null, null, f4, f5, 3, null);
        }
        return touchPoint0 == TouchCenterPoint.Center ? RectExtensionKt.add(rect0, ((float)(-f4 / 2.0f)), ((float)(-f5 / 2.0f)), ((float)(f4 / 2.0f)), ((float)(f5 / 2.0f))) : rect0;
    }

    public static Rect c(TouchPoint touchPoint0, Rect rect0, float f, float f1) {
        return RectExtensionKt.mapRect(MatrixExtensionKt.buildMatrix$default(null, new d(f, f1, CropControllerKt.getFixPoint(rect0, touchPoint0)), 1, null), rect0);
    }

    public static long d(long v, long v1, RectVertex rectVertex0) {
        Line line0 = new Line(v, v1, null);
        Offset offset0 = line0.findNearestIntersection-H5M4yMg(v1, rectVertex0.getLines());
        long v2 = offset0 == null ? v1 : offset0.unbox-impl();
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: rectVertex0.getLines()) {
            Offset offset1 = line0.findIntersection-x-9fifI(((Line)object0));
            if(offset1 == null || !((Line)object0).inRange-k-4lQ0M(offset1.unbox-impl())) {
                offset1 = null;
            }
            if(offset1 != null) {
                arrayList0.add(offset1);
            }
        }
        if(!arrayList0.isEmpty()) {
            for(Object object1: arrayList0) {
                if(new Line(v, ((Offset)object1).unbox-impl(), null).inRange-k-4lQ0M(v1)) {
                    return v1;
                }
                if(false) {
                    break;
                }
            }
        }
        return v2;
    }

    @NotNull
    public final Pair drag-YqVAtuI(@NotNull TouchDragPoint touchDragPoint0, long v, @NotNull CropRatioType cropRatioType0, float f, @NotNull RectVertex rectVertex0) {
        List list0;
        boolean z;
        Rect rect2;
        float f3;
        Intrinsics.checkNotNullParameter(touchDragPoint0, "touchPoint");
        Intrinsics.checkNotNullParameter(cropRatioType0, "ratio");
        Intrinsics.checkNotNullParameter(rectVertex0, "imageVertex");
        Rect rect0 = this.b;
        TouchLinePoint touchLinePoint0 = TouchLinePoint.Top;
        if(touchDragPoint0 == touchLinePoint0) {
            rect0 = RectExtensionKt.add$default(rect0, null, Offset.getY-impl(v), null, null, 13, null);
        }
        else if(touchDragPoint0 == TouchLinePoint.Bottom) {
            rect0 = RectExtensionKt.add$default(rect0, null, null, null, Offset.getY-impl(v), 7, null);
        }
        else if(touchDragPoint0 == TouchLinePoint.Left) {
            rect0 = RectExtensionKt.add$default(rect0, Offset.getX-impl(v), null, null, null, 14, null);
        }
        else if(touchDragPoint0 == TouchLinePoint.Right) {
            rect0 = RectExtensionKt.add$default(rect0, null, null, Offset.getX-impl(v), null, 11, null);
        }
        else if(touchDragPoint0 == TouchCirclePoint.TopLeft) {
            rect0 = RectExtensionKt.add$default(rect0, Offset.getX-impl(v), Offset.getY-impl(v), null, null, 12, null);
        }
        else if(touchDragPoint0 == TouchCirclePoint.TopRight) {
            rect0 = RectExtensionKt.add$default(rect0, null, Offset.getY-impl(v), Offset.getX-impl(v), null, 9, null);
        }
        else if(touchDragPoint0 == TouchCirclePoint.BottomLeft) {
            rect0 = RectExtensionKt.add$default(rect0, Offset.getX-impl(v), null, null, Offset.getY-impl(v), 6, null);
        }
        else if(touchDragPoint0 == TouchCirclePoint.BottomRight) {
            rect0 = RectExtensionKt.add$default(rect0, null, null, Offset.getX-impl(v), Offset.getY-impl(v), 3, null);
        }
        Rect rect1 = this.b(touchDragPoint0, rect0, cropRatioType0.getRatioX(), cropRatioType0.getRatioY());
        float f1 = cropRatioType0.getRatioX();
        float f2 = cropRatioType0.getRatioY();
        if(touchDragPoint0 != touchLinePoint0 && touchDragPoint0 != TouchLinePoint.Bottom) {
            f3 = touchDragPoint0 != TouchLinePoint.Left && touchDragPoint0 != TouchLinePoint.Right ? (rect1.getHeight() + rect1.getWidth()) / (f1 + f2) : rect1.getWidth() / f1;
        }
        else {
            f3 = rect1.getHeight() / f2;
        }
        rect1 = CropGestureController.c(touchDragPoint0, rect1, f1 * f3 / rect1.getWidth(), f3 * f2 / rect1.getHeight());
        this.b = rect1;
        Matrix matrix0 = MatrixExtensionKt.buildMatrix$default(null, new y8(rectVertex0.getCenter-F1C5BW0(), f % 90.0f, 4), 1, null);
        IntRect intRect0 = IntRectKt.roundToIntRect(RectExtensionKt.mapRect(matrix0, rect1));
        RectVertex rectVertex1 = RectVertexKt.mapVertex(matrix0, rectVertex0);
        if(Intrinsics.areEqual(IntRectKt.roundToIntRect(new Rect(rectVertex1.getLeft(), rectVertex1.getTop(), rectVertex1.getRight(), rectVertex1.getBottom())).intersect(intRect0), intRect0)) {
            return TuplesKt.to(this.b, null);
        }
        if(touchDragPoint0 instanceof TouchCirclePoint) {
            rect2 = this.a(((TouchCirclePoint)touchDragPoint0), cropRatioType0, this.b, f % 90.0f, rectVertex0);
        }
        else if(touchDragPoint0 instanceof TouchLinePoint) {
            Rect rect3 = this.b;
            int[] arr_v = WhenMappings.$EnumSwitchMapping$0;
            switch(arr_v[((TouchLinePoint)touchDragPoint0).ordinal()]) {
                case 1: 
                case 2: {
                    z = true;
                    break;
                }
                case 3: 
                case 4: {
                    z = false;
                    break;
                }
                default: {
                    throw new NoWhenBranchMatchedException();
                }
            }
            Pair pair0 = CropControllerKt.access$split(rect3, z);
            Rect rect4 = (Rect)pair0.component1();
            Rect rect5 = (Rect)pair0.component2();
            switch(arr_v[((TouchLinePoint)touchDragPoint0).ordinal()]) {
                case 1: {
                    list0 = CollectionsKt__CollectionsKt.listOf(new Pair[]{TuplesKt.to(TouchCirclePoint.TopLeft, rect4), TuplesKt.to(TouchCirclePoint.TopRight, rect5)});
                    break;
                }
                case 2: {
                    list0 = CollectionsKt__CollectionsKt.listOf(new Pair[]{TuplesKt.to(TouchCirclePoint.BottomLeft, rect4), TuplesKt.to(TouchCirclePoint.BottomRight, rect5)});
                    break;
                }
                case 3: {
                    list0 = CollectionsKt__CollectionsKt.listOf(new Pair[]{TuplesKt.to(TouchCirclePoint.TopLeft, rect4), TuplesKt.to(TouchCirclePoint.BottomLeft, rect5)});
                    break;
                }
                case 4: {
                    list0 = CollectionsKt__CollectionsKt.listOf(new Pair[]{TuplesKt.to(TouchCirclePoint.TopRight, rect4), TuplesKt.to(TouchCirclePoint.BottomRight, rect5)});
                    break;
                }
                default: {
                    throw new NoWhenBranchMatchedException();
                }
            }
            ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(list0, 10));
            for(Object object0: list0) {
                arrayList0.add(this.a(((TouchCirclePoint)((Pair)object0).component1()), cropRatioType0, ((Rect)((Pair)object0).component2()), f % 90.0f, rectVertex0));
            }
            Iterator iterator1 = arrayList0.iterator();
            if(!iterator1.hasNext()) {
                throw new NoSuchElementException();
            }
            Object object1 = iterator1.next();
            if(iterator1.hasNext()) {
                float f4 = ((Rect)object1).getHeight() * ((Rect)object1).getWidth();
                while(true) {
                    Object object2 = iterator1.next();
                    float f5 = ((Rect)object2).getHeight() * ((Rect)object2).getWidth();
                    if(Float.compare(f4, f5) > 0) {
                        object1 = object2;
                        f4 = f5;
                    }
                    if(!iterator1.hasNext()) {
                        break;
                    }
                }
            }
            rect2 = CropGestureController.c(((TouchLinePoint)touchDragPoint0), rect3, ((Rect)object1).getWidth() / rect4.getWidth(), ((Rect)object1).getHeight() / rect4.getHeight());
        }
        else {
            rect2 = this.b;
        }
        Rect rect6 = this.b;
        long v1 = Size.times-7Ah8Wj8(SizeKt.Size(rect2.getWidth(), rect2.getHeight()), 0.333333f);
        long v2 = RubberBand.INSTANCE.calculateBandOffset-ywzJ3js(OffsetKt.Offset(rect6.getWidth() - rect2.getWidth(), rect6.getHeight() - rect2.getHeight()), v1);
        return TuplesKt.to(rect2, CropGestureController.c(touchDragPoint0, rect2, (Math.abs(Offset.getX-impl(v2)) + rect2.getWidth()) / rect2.getWidth(), (Math.abs(Offset.getY-impl(v2)) + rect2.getHeight()) / rect2.getHeight()));
    }

    public final void endInteraction() {
        this.b = Rect.Companion.getZero();
    }

    @NotNull
    public final Matrix fitMatrixIntoImage(@NotNull Matrix matrix0, @NotNull Rect rect0, @NotNull Rect rect1) {
        Intrinsics.checkNotNullParameter(matrix0, "matrix");
        Intrinsics.checkNotNullParameter(rect0, "cropRect");
        Intrinsics.checkNotNullParameter(rect1, "imageRect");
        return this.a.fitMatrixIntoImage(matrix0, rect0, rect1, 1.0f);
    }

    @NotNull
    public final Rect getDraggingRect() {
        return this.b;
    }

    public final long getMovableOffset-qto3Fdw(long v, @NotNull Rect rect0, @NotNull Rect rect1) {
        Intrinsics.checkNotNullParameter(rect0, "cropRect");
        Intrinsics.checkNotNullParameter(rect1, "imageRect");
        return this.a.getMovableOffset-qto3Fdw(v, rect0, rect1);
    }

    @NotNull
    public final Rect getRatioAdjustedRect(@NotNull TouchPoint touchPoint0, @NotNull Rect rect0, float f, float f1) {
        Intrinsics.checkNotNullParameter(touchPoint0, "touchPoint");
        Intrinsics.checkNotNullParameter(rect0, "rect");
        Iterator iterator0 = CollectionsKt__CollectionsKt.listOf(new Rect[]{CropGestureController.c(touchPoint0, rect0, 1.0f, rect0.getWidth() * (f1 / f) / rect0.getHeight()), CropGestureController.c(touchPoint0, rect0, rect0.getHeight() * (f / f1) / rect0.getWidth(), 1.0f)}).iterator();
        if(!iterator0.hasNext()) {
            throw new NoSuchElementException();
        }
        Object object0 = iterator0.next();
        if(iterator0.hasNext()) {
            float f2 = ((Rect)object0).getHeight() * ((Rect)object0).getWidth();
            while(true) {
                Object object1 = iterator0.next();
                float f3 = ((Rect)object1).getHeight() * ((Rect)object1).getWidth();
                if(Float.compare(f2, f3) > 0) {
                    object0 = object1;
                    f2 = f3;
                }
                if(!iterator0.hasNext()) {
                    break;
                }
            }
        }
        return this.b(touchPoint0, ((Rect)object0), f, f1);
    }

    public final void setDraggingRect(@NotNull Rect rect0) {
        Intrinsics.checkNotNullParameter(rect0, "<set-?>");
        this.b = rect0;
    }

    public final void startDrag-viCIZxY(long v, @NotNull Rect rect0) {
        Intrinsics.checkNotNullParameter(rect0, "cropRect");
        this.b = rect0;
        this.c = Math.min(200.0f, Math.min(((float)IntSize.getWidth-impl(v)) * 0.2f, ((float)IntSize.getWidth-impl(v)) * 0.2f));
    }
}

