package com.kakao.kandinsky.mosaic;

import android.graphics.Matrix.ScaleToFit;
import android.graphics.Matrix;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.unit.IntSizeKt;
import com.kakao.kandinsky.base.KDMviViewModel;
import com.kakao.kandinsky.core.kdphoto.Blur;
import com.kakao.kandinsky.core.kdphoto.Decoration.Absolute;
import com.kakao.kandinsky.core.kdphoto.Decoration;
import com.kakao.kandinsky.core.kdphoto.KDPhoto;
import com.kakao.kandinsky.core.kdphoto.KDPhotoKt;
import com.kakao.kandinsky.core.kdphoto.Mosaic.Type;
import com.kakao.kandinsky.core.kdphoto.Mosaic;
import com.kakao.kandinsky.decoration.DecorationControllerInterface.DefaultImpls;
import com.kakao.kandinsky.decoration.DecorationControllerInterface;
import com.kakao.kandinsky.designsystem.util.MatrixTransformKt;
import com.kakao.kandinsky.designsystem.util.OffsetExtensionKt;
import com.kakao.kandinsky.designsystem.util.RectExtensionKt;
import com.kakao.kandinsky.designsystem.util.Transform;
import com.kakao.kandinsky.mosaic.contract.MosaicIntent.Cancel;
import com.kakao.kandinsky.mosaic.contract.MosaicIntent.ChangeBlurType;
import com.kakao.kandinsky.mosaic.contract.MosaicIntent.ChangeIntensity;
import com.kakao.kandinsky.mosaic.contract.MosaicIntent.ChangeMosaicType;
import com.kakao.kandinsky.mosaic.contract.MosaicIntent.ChangeViewType;
import com.kakao.kandinsky.mosaic.contract.MosaicIntent.ClearMosaic;
import com.kakao.kandinsky.mosaic.contract.MosaicIntent.ClickEmptyArea;
import com.kakao.kandinsky.mosaic.contract.MosaicIntent.DeleteSelectedBlur;
import com.kakao.kandinsky.mosaic.contract.MosaicIntent.DeleteSelectedMosaic;
import com.kakao.kandinsky.mosaic.contract.MosaicIntent.Init;
import com.kakao.kandinsky.mosaic.contract.MosaicIntent.MoveSelectBlur;
import com.kakao.kandinsky.mosaic.contract.MosaicIntent.MoveSelectMosaic;
import com.kakao.kandinsky.mosaic.contract.MosaicIntent.ScaleNRotateSelectBlur;
import com.kakao.kandinsky.mosaic.contract.MosaicIntent.ScaleNRotateSelectMosaic;
import com.kakao.kandinsky.mosaic.contract.MosaicIntent.SelectMosaic;
import com.kakao.kandinsky.mosaic.contract.MosaicIntent.UpdateContentBounds;
import com.kakao.kandinsky.mosaic.contract.MosaicIntent.UpdatePhoto;
import com.kakao.kandinsky.mosaic.contract.MosaicIntent;
import com.kakao.kandinsky.mosaic.contract.MosaicUiState;
import com.kakao.kandinsky.utils.MatrixExtensionKt;
import com.kakao.kandinsky.utils.MatrixValues;
import com.kakao.kandinsky.utils.MatrixValuesKt;
import com.kakao.kdtracker.KDTracker;
import java.util.ArrayList;
import java.util.ListIterator;
import javax.inject.Inject;
import ka.l;
import ka.m;
import ka.n;
import ka.o;
import ka.p;
import ka.q;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ExtensionsKt;
import kotlinx.collections.immutable.PersistentList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0006\u001A\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001F\u0010\u000B\u001A\u00020\u00022\u0006\u0010\t\u001A\u00020\u00022\u0006\u0010\n\u001A\u00020\u0003H\u0014¢\u0006\u0004\b\u000B\u0010\fR\u0017\u0010\u0006\u001A\u00020\u00058\u0006¢\u0006\f\n\u0004\b\r\u0010\u000E\u001A\u0004\b\u000F\u0010\u0010R\u001D\u0010\u0017\u001A\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001A\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcom/kakao/kandinsky/mosaic/MosaicViewModel;", "Lcom/kakao/kandinsky/base/KDMviViewModel;", "Lcom/kakao/kandinsky/mosaic/contract/MosaicUiState;", "Lcom/kakao/kandinsky/mosaic/contract/MosaicIntent;", "Lcom/kakao/kandinsky/base/contract/KDEvent;", "Lcom/kakao/kandinsky/mosaic/MosaicAndBlurBitmapLoader;", "bitmapLoader", "<init>", "(Lcom/kakao/kandinsky/mosaic/MosaicAndBlurBitmapLoader;)V", "current", "intent", "handleIntent", "(Lcom/kakao/kandinsky/mosaic/contract/MosaicUiState;Lcom/kakao/kandinsky/mosaic/contract/MosaicIntent;)Lcom/kakao/kandinsky/mosaic/contract/MosaicUiState;", "L0", "Lcom/kakao/kandinsky/mosaic/MosaicAndBlurBitmapLoader;", "getBitmapLoader", "()Lcom/kakao/kandinsky/mosaic/MosaicAndBlurBitmapLoader;", "Lcom/kakao/kandinsky/decoration/DecorationControllerInterface;", "Lcom/kakao/kandinsky/core/kdphoto/Decoration;", "M0", "Lcom/kakao/kandinsky/decoration/DecorationControllerInterface;", "getController", "()Lcom/kakao/kandinsky/decoration/DecorationControllerInterface;", "controller", "mosaic_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nMosaicViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MosaicViewModel.kt\ncom/kakao/kandinsky/mosaic/MosaicViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,373:1\n533#2,6:374\n533#2,6:380\n800#2,11:386\n819#2:397\n847#2,2:398\n1#3:400\n*S KotlinDebug\n*F\n+ 1 MosaicViewModel.kt\ncom/kakao/kandinsky/mosaic/MosaicViewModel\n*L\n95#1:374,6\n96#1:380,6\n158#1:386,11\n222#1:397\n222#1:398,2\n*E\n"})
public final class MosaicViewModel extends KDMviViewModel {
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[ViewType.values().length];
            try {
                arr_v[ViewType.Mosaic.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[ViewType.Blur.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    public static final int $stable;
    public final MosaicAndBlurBitmapLoader L0;
    public final com.kakao.kandinsky.mosaic.MosaicViewModel.controller.1 M0;

    @Inject
    public MosaicViewModel(@NotNull MosaicAndBlurBitmapLoader mosaicAndBlurBitmapLoader0) {
        Intrinsics.checkNotNullParameter(mosaicAndBlurBitmapLoader0, "bitmapLoader");
        super(new MosaicUiState(null, null, null, null, null, null, null, null, null, null, null, null, null, 0x1FFF, null));
        this.L0 = mosaicAndBlurBitmapLoader0;
        this.M0 = new DecorationControllerInterface() {
            public final MosaicViewModel a;

            {
                this.a = mosaicViewModel0;
            }

            @Override  // com.kakao.kandinsky.decoration.DecorationControllerInterface
            public boolean isInDisplayRect-v05aCt0(long v, @NotNull Rect rect0, @NotNull Matrix matrix0, long v1) {
                return DefaultImpls.isInDisplayRect-v05aCt0(this, v, rect0, matrix0, v1);
            }

            @Override  // com.kakao.kandinsky.decoration.DecorationControllerInterface
            public void onClickEmptyArea-k-4lQ0M(long v) {
                ClickEmptyArea mosaicIntent$ClickEmptyArea0 = new ClickEmptyArea(v, null);
                this.a.sendIntent(mosaicIntent$ClickEmptyArea0);
            }

            public void onDelete(@NotNull Decoration decoration0) {
                Intrinsics.checkNotNullParameter(decoration0, "decoration");
                MosaicViewModel mosaicViewModel0 = this.a;
                if(decoration0 instanceof Mosaic) {
                    mosaicViewModel0.sendIntent(new DeleteSelectedMosaic(((Mosaic)decoration0)));
                    return;
                }
                if(decoration0 instanceof Blur) {
                    mosaicViewModel0.sendIntent(new DeleteSelectedBlur(((Blur)decoration0)));
                }
            }

            @Override  // com.kakao.kandinsky.decoration.DecorationControllerInterface
            public void onDelete(Object object0) {
                this.onDelete(((Decoration)object0));
            }

            public void onDrag-Uv8p0NA(@NotNull Decoration decoration0, long v) {
                Intrinsics.checkNotNullParameter(decoration0, "decoration");
                MosaicViewModel mosaicViewModel0 = this.a;
                if(decoration0 instanceof Mosaic) {
                    mosaicViewModel0.sendIntent(new MoveSelectMosaic(((Mosaic)decoration0), v, null));
                    return;
                }
                if(decoration0 instanceof Blur) {
                    mosaicViewModel0.sendIntent(new MoveSelectBlur(((Blur)decoration0), v, null));
                }
            }

            @Override  // com.kakao.kandinsky.decoration.DecorationControllerInterface
            public void onDrag-Uv8p0NA(Object object0, long v) {
                this.onDrag-Uv8p0NA(((Decoration)object0), v);
            }

            public void onOutOfImage(@NotNull Decoration decoration0) {
                Intrinsics.checkNotNullParameter(decoration0, "decoration");
                this.onDelete(decoration0);
            }

            @Override  // com.kakao.kandinsky.decoration.DecorationControllerInterface
            public void onOutOfImage(Object object0) {
                this.onOutOfImage(((Decoration)object0));
            }

            public void onPress(@Nullable Decoration decoration0) {
                if(decoration0 instanceof Mosaic) {
                    SelectMosaic mosaicIntent$SelectMosaic0 = new SelectMosaic(((Mosaic)decoration0));
                    this.a.sendIntent(mosaicIntent$SelectMosaic0);
                }
            }

            @Override  // com.kakao.kandinsky.decoration.DecorationControllerInterface
            public void onPress(Object object0) {
                this.onPress(((Decoration)object0));
            }

            public void onScaleAndRotate-12SF9DM(@NotNull Decoration decoration0, long v, @NotNull Matrix matrix0) {
                Intrinsics.checkNotNullParameter(decoration0, "decoration");
                Intrinsics.checkNotNullParameter(matrix0, "matrix");
                MosaicViewModel mosaicViewModel0 = this.a;
                if(decoration0 instanceof Mosaic) {
                    mosaicViewModel0.sendIntent(new ScaleNRotateSelectMosaic(((Mosaic)decoration0), v, matrix0, null));
                    return;
                }
                if(decoration0 instanceof Blur) {
                    mosaicViewModel0.sendIntent(new ScaleNRotateSelectBlur(((Blur)decoration0), v, matrix0, null));
                }
            }

            @Override  // com.kakao.kandinsky.decoration.DecorationControllerInterface
            public void onScaleAndRotate-12SF9DM(Object object0, long v, Matrix matrix0) {
                this.onScaleAndRotate-12SF9DM(((Decoration)object0), v, matrix0);
            }

            public void onTap(@NotNull Decoration decoration0) {
            }

            @Override  // com.kakao.kandinsky.decoration.DecorationControllerInterface
            public void onTap(Object object0) {
            }
        };
    }

    public static Pair a(float f, float f1, Matrix matrix0, long v) {
        long v1 = SizeKt.Size(Offset.getDistance-impl(OffsetExtensionKt.mapVector-Uv8p0NA(matrix0, OffsetKt.Offset(Size.getWidth-impl(v), 0.0f))), Offset.getDistance-impl(OffsetExtensionKt.mapVector-Uv8p0NA(matrix0, OffsetKt.Offset(0.0f, Size.getHeight-impl(v)))));
        Transform transform0 = MatrixTransformKt.getTransform(matrix0);
        Size size0 = Size.box-impl(v1);
        float f2 = Float.compare(transform0.getScaleX(), 0.0f) >= 0 ? 1.0f : -1.0f;
        return transform0.getScaleY() < 0.0f ? TuplesKt.to(size0, Transform.copy$default(transform0, f, f1, 0.0f, f2, -1.0f, 4, null).getMatrix()) : TuplesKt.to(size0, Transform.copy$default(transform0, f, f1, 0.0f, f2, 1.0f, 4, null).getMatrix());
    }

    public static long b(float f, long v) {
        float f1 = 1.0f / (0.46f - (100.0f * (f / 2.0f + 0.5f) - 1.0f) / 99.0f * 0.45f + 0.01f);
        return SizeKt.Size(f1 / Size.getWidth-impl(v), f1 / Size.getHeight-impl(v));
    }

    public static Matrix c(Matrix matrix0, long v) {
        Matrix matrix1 = MatrixExtensionKt.invert(matrix0);
        long v1 = OffsetExtensionKt.mapOffset-Uv8p0NA(matrix1, v);
        long v2 = OffsetExtensionKt.getTransition(matrix1);
        matrix1.postTranslate(Offset.getX-impl(v1) - Offset.getX-impl(v2), Offset.getY-impl(v1) - Offset.getY-impl(v2));
        return matrix1;
    }

    @NotNull
    public final MosaicAndBlurBitmapLoader getBitmapLoader() {
        return this.L0;
    }

    @NotNull
    public final DecorationControllerInterface getController() {
        return this.M0;
    }

    @NotNull
    public MosaicUiState handleIntent(@NotNull MosaicUiState mosaicUiState0, @NotNull MosaicIntent mosaicIntent0) {
        Absolute decoration$Absolute0;
        Mosaic mosaic0 = null;
        Intrinsics.checkNotNullParameter(mosaicUiState0, "current");
        Intrinsics.checkNotNullParameter(mosaicIntent0, "intent");
        if(Intrinsics.areEqual(mosaicIntent0, Init.INSTANCE)) {
            return MosaicUiState.copy$default(mosaicUiState0, null, new l(this), null, null, null, null, null, null, new m(this), new n(this), new o(this), new p(this), new q(this), 0xFD, null);
        }
        if(mosaicIntent0 instanceof UpdatePhoto) {
            return MosaicUiState.copy$default(mosaicUiState0, null, null, null, null, null, ((UpdatePhoto)mosaicIntent0).getPhoto(), ((UpdatePhoto)mosaicIntent0).getPhoto(), null, null, null, null, null, null, 0x1F9F, null);
        }
        if(mosaicIntent0 instanceof UpdateContentBounds) {
            return MosaicUiState.copy$default(mosaicUiState0, null, null, null, null, null, null, null, ((UpdateContentBounds)mosaicIntent0).getBounds(), null, null, null, null, null, 0x1F7F, null);
        }
        if(mosaicIntent0 instanceof ChangeViewType) {
            String s = ((ChangeViewType)mosaicIntent0).getViewType() == ViewType.Mosaic ? "mosaic-tab" : "blur-tab";
            KDTracker.clickEvent$default(KDTracker.INSTANCE, "mosaicblur-tab", s, null, null, 12, null);
            switch(WhenMappings.$EnumSwitchMapping$0[((ChangeViewType)mosaicIntent0).getViewType().ordinal()]) {
                case 1: {
                    Object object0 = null;
                    PersistentList persistentList0 = mosaicUiState0.getPhoto().getDecorationList();
                    ListIterator listIterator0 = persistentList0.listIterator(persistentList0.size());
                    while(listIterator0.hasPrevious()) {
                        Object object1 = listIterator0.previous();
                        if(((Absolute)object1) instanceof Mosaic) {
                            object0 = object1;
                            break;
                        }
                    }
                    decoration$Absolute0 = (Absolute)object0;
                    break;
                }
                case 2: {
                    Object object2 = null;
                    PersistentList persistentList1 = mosaicUiState0.getPhoto().getDecorationList();
                    ListIterator listIterator1 = persistentList1.listIterator(persistentList1.size());
                    while(listIterator1.hasPrevious()) {
                        Object object3 = listIterator1.previous();
                        if(((Absolute)object3) instanceof Blur) {
                            object2 = object3;
                            break;
                        }
                    }
                    decoration$Absolute0 = (Absolute)object2;
                    break;
                }
                default: {
                    throw new NoWhenBranchMatchedException();
                }
            }
            KDPhoto kDPhoto0 = KDPhotoKt.updateDecoration(mosaicUiState0.getPhoto(), (decoration$Absolute0 == null ? null : decoration$Absolute0.getNo()), decoration$Absolute0);
            if(decoration$Absolute0 != null) {
                mosaic0 = decoration$Absolute0.getNo();
            }
            return MosaicUiState.copy$default(mosaicUiState0, ((ChangeViewType)mosaicIntent0).getViewType(), null, null, null, ((Integer)mosaic0), kDPhoto0, null, null, null, null, null, null, null, 0x1FCE, null);
        }
        if(mosaicIntent0 instanceof ChangeMosaicType) {
            Absolute decoration$Absolute1 = mosaicUiState0.getSelectedItem();
            if(decoration$Absolute1 instanceof Mosaic) {
                mosaic0 = (Mosaic)decoration$Absolute1;
            }
            String s1 = ViewTypeTrackerKt.getTypeTrackerLayer(((ChangeMosaicType)mosaicIntent0).getType().name());
            KDTracker.clickEvent$default(KDTracker.INSTANCE, "mosaic-tab", s1, null, null, 12, null);
            if(mosaic0 != null) {
                Mosaic mosaic1 = Mosaic.copy-lcW1YYU$default(mosaic0, 0, null, 0L, 0.0f, ((ChangeMosaicType)mosaicIntent0).getType(), 0L, 0x2F, null);
                return MosaicUiState.copy$default(mosaicUiState0, null, null, ((ChangeMosaicType)mosaicIntent0).getType(), null, null, KDPhotoKt.updateDecoration(mosaicUiState0.getPhoto(), mosaic1.getNo(), mosaic1), null, null, null, null, null, null, null, 0x1FDB, null);
            }
            return MosaicUiState.copy$default(mosaicUiState0, null, null, ((ChangeMosaicType)mosaicIntent0).getType(), null, null, null, null, null, null, null, null, null, null, 0x1FFB, null);
        }
        if(mosaicIntent0 instanceof ChangeBlurType) {
            Absolute decoration$Absolute2 = mosaicUiState0.getSelectedItem();
            if(decoration$Absolute2 instanceof Blur) {
                mosaic0 = (Blur)decoration$Absolute2;
            }
            String s2 = ViewTypeTrackerKt.getTypeTrackerLayer(((ChangeBlurType)mosaicIntent0).getType().name());
            KDTracker.clickEvent$default(KDTracker.INSTANCE, "blur-tab", s2, null, null, 12, null);
            if(mosaic0 != null) {
                Blur blur0 = Blur.copy-lcW1YYU$default(((Blur)mosaic0), 0, null, 0L, 0.0f, ((ChangeBlurType)mosaicIntent0).getType(), 0L, 0x2F, null);
                return MosaicUiState.copy$default(mosaicUiState0, null, null, null, ((ChangeBlurType)mosaicIntent0).getType(), null, KDPhotoKt.updateDecoration(mosaicUiState0.getPhoto(), blur0.getNo(), blur0), null, null, null, null, null, null, null, 0x1FD7, null);
            }
            return MosaicUiState.copy$default(mosaicUiState0, null, null, null, ((ChangeBlurType)mosaicIntent0).getType(), null, null, null, null, null, null, null, null, null, 0x1FF7, null);
        }
        if(mosaicIntent0 instanceof ClickEmptyArea) {
            long v = OffsetExtensionKt.mapOffset-Uv8p0NA(MatrixExtensionKt.invert(mosaicUiState0.getDisplayMatrix()), ((ClickEmptyArea)mosaicIntent0).getOffset-F1C5BW0());
            Rect rect0 = SizeKt.toRect-uvyYCjk(IntSizeKt.toSize-ozmzZPI(mosaicUiState0.getPhoto().getBitmapSize-YbymL2g()));
            Matrix matrix0 = new Matrix();
            RectExtensionKt.setRectToRect(matrix0, rect0, mosaicUiState0.getContentBounds(), Matrix.ScaleToFit.CENTER);
            long v1 = RectExtensionKt.mapRect(matrix0, rect0).getSize-NH-jbRc();
            switch(WhenMappings.$EnumSwitchMapping$0[mosaicUiState0.getViewType().ordinal()]) {
                case 1: {
                    int v2 = mosaicUiState0.getPhoto().getNewDecoNo();
                    long v3 = mosaicUiState0.getPhoto().getCropSize-NH-jbRc();
                    long v4 = MosaicViewModel.b(1.0f, v1);
                    Matrix matrix1 = MosaicViewModel.c(mosaicUiState0.getPhoto().getMatrix(), v);
                    float f = Math.min(Size.getWidth-impl(v3), Size.getHeight-impl(v3));
                    Mosaic mosaic2 = new Mosaic(v2, MatrixValuesKt.getMatrixValues(matrix1), SizeKt.Size(f * 0.2f, f * 0.2f), 0.0f, mosaicUiState0.getSelectedMosaicType(), v4, 8, null);
                    return MosaicUiState.copy$default(mosaicUiState0, null, null, null, null, mosaic2.getNo(), KDPhotoKt.updateDecoration(mosaicUiState0.getPhoto(), mosaic2.getNo(), mosaic2), null, null, null, null, null, null, null, 0x1FCF, null);
                }
                case 2: {
                    ArrayList arrayList0 = new ArrayList();
                    for(Object object4: mosaicUiState0.getPhoto().getDecorationList()) {
                        if(object4 instanceof Blur) {
                            arrayList0.add(object4);
                        }
                    }
                    Blur blur1 = (Blur)CollectionsKt___CollectionsKt.firstOrNull(arrayList0);
                    int v5 = blur1 == null ? mosaicUiState0.getPhoto().getNewDecoNo() : blur1.getNo();
                    long v6 = mosaicUiState0.getPhoto().getCropSize-NH-jbRc();
                    Matrix matrix2 = MosaicViewModel.c(mosaicUiState0.getPhoto().getMatrix(), v);
                    float f1 = Math.min(Size.getWidth-impl(v6), Size.getHeight-impl(v6));
                    Blur blur2 = new Blur(v5, MatrixValuesKt.getMatrixValues(matrix2), SizeKt.Size(f1 * 0.2f, f1 * 0.2f), 0.0f, mosaicUiState0.getSelectedBlurType(), SizeKt.Size(1.0f / Size.getWidth-impl(v1), 1.0f / Size.getHeight-impl(v1)), 8, null);
                    return MosaicUiState.copy$default(mosaicUiState0, null, null, null, null, blur2.getNo(), KDPhotoKt.updateDecoration(mosaicUiState0.getPhoto(), blur2.getNo(), blur2), null, null, null, null, null, null, null, 0x1FCF, null);
                }
                default: {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
        if(mosaicIntent0 instanceof SelectMosaic) {
            Mosaic mosaic3 = ((SelectMosaic)mosaicIntent0).getMosaic();
            KDPhoto kDPhoto1 = KDPhotoKt.updateDecoration(mosaicUiState0.getPhoto(), (mosaic3 == null ? null : mosaic3.getNo()), mosaic3);
            if(mosaic3 != null) {
                mosaic0 = mosaic3.getNo();
            }
            if(mosaic3 != null) {
                Type mosaic$Type0 = mosaic3.getMosaicType();
                return mosaic$Type0 == null ? MosaicUiState.copy$default(mosaicUiState0, null, null, Type.Circle, null, ((Integer)mosaic0), kDPhoto1, null, null, null, null, null, null, null, 0x1FCB, null) : MosaicUiState.copy$default(mosaicUiState0, null, null, mosaic$Type0, null, ((Integer)mosaic0), kDPhoto1, null, null, null, null, null, null, null, 0x1FCB, null);
            }
            return MosaicUiState.copy$default(mosaicUiState0, null, null, Type.Circle, null, ((Integer)mosaic0), kDPhoto1, null, null, null, null, null, null, null, 0x1FCB, null);
        }
        if(mosaicIntent0 instanceof MoveSelectMosaic) {
            long v7 = ((MoveSelectMosaic)mosaicIntent0).getOffset-F1C5BW0();
            Matrix matrix3 = ((MoveSelectMosaic)mosaicIntent0).getMosaic().getMatrix();
            matrix3.postTranslate(Offset.getX-impl(v7), Offset.getY-impl(v7));
            Mosaic mosaic4 = Mosaic.copy-lcW1YYU$default(((MoveSelectMosaic)mosaicIntent0).getMosaic(), 0, MatrixValuesKt.getMatrixValues(matrix3), 0L, 0.0f, null, 0L, 61, null);
            return MosaicUiState.copy$default(mosaicUiState0, null, null, null, null, null, KDPhotoKt.updateDecoration(mosaicUiState0.getPhoto(), mosaic4.getNo(), mosaic4), null, null, null, null, null, null, null, 0x1FDF, null);
        }
        if(mosaicIntent0 instanceof ScaleNRotateSelectMosaic) {
            String s3 = ViewTypeTrackerKt.getMainTrackerLayer(mosaicUiState0.getViewType());
            String s4 = ViewTypeTrackerKt.getDragTrackerLayer(mosaicUiState0.getViewType());
            KDTracker.clickEvent$default(KDTracker.INSTANCE, s3, s4, null, null, 12, null);
            Pair pair0 = MosaicViewModel.a(((float)MatrixValues.get-impl(((ScaleNRotateSelectMosaic)mosaicIntent0).getMosaic().getMatrixValues-pp_Gbr8(), 2)), ((float)MatrixValues.get-impl(((ScaleNRotateSelectMosaic)mosaicIntent0).getMosaic().getMatrixValues-pp_Gbr8(), 5)), ((ScaleNRotateSelectMosaic)mosaicIntent0).getMatrix(), ((ScaleNRotateSelectMosaic)mosaicIntent0).getSize-NH-jbRc());
            Mosaic mosaic5 = Mosaic.copy-lcW1YYU$default(((ScaleNRotateSelectMosaic)mosaicIntent0).getMosaic(), 0, MatrixValuesKt.getMatrixValues(((Matrix)pair0.component2())), ((Size)pair0.component1()).unbox-impl(), 0.0f, null, 0L, 57, null);
            return MosaicUiState.copy$default(mosaicUiState0, null, null, null, null, null, KDPhotoKt.updateDecoration(mosaicUiState0.getPhoto(), mosaic5.getNo(), mosaic5), null, null, null, null, null, null, null, 0x1FDF, null);
        }
        if(Intrinsics.areEqual(mosaicIntent0, ClearMosaic.INSTANCE)) {
            KDTracker.clickEvent$default(KDTracker.INSTANCE, "mosaic-tab", "removeall", null, null, 12, null);
            KDPhoto kDPhoto2 = mosaicUiState0.getPhoto();
            ArrayList arrayList1 = new ArrayList();
            for(Object object5: mosaicUiState0.getPhoto().getDecorationList()) {
                if(!(((Absolute)object5) instanceof Mosaic)) {
                    arrayList1.add(object5);
                }
            }
            return MosaicUiState.copy$default(mosaicUiState0, null, null, null, null, null, KDPhoto.copy-2Ycw6ww$default(kDPhoto2, null, 0, null, 0L, false, 0, null, 0L, null, 0.0f, null, ExtensionsKt.toPersistentList(arrayList1), null, null, 0x37FF, null), null, null, null, null, null, null, null, 0x1FCF, null);
        }
        if(mosaicIntent0 instanceof DeleteSelectedMosaic) {
            String s5 = ViewTypeTrackerKt.getMainTrackerLayer(mosaicUiState0.getViewType());
            String s6 = ViewTypeTrackerKt.getDeleteTrackerLayer(mosaicUiState0.getViewType());
            KDTracker.clickEvent$default(KDTracker.INSTANCE, s5, s6, null, null, 12, null);
            return MosaicUiState.copy$default(mosaicUiState0, null, null, null, null, null, KDPhotoKt.updateDecoration(mosaicUiState0.getPhoto(), ((DeleteSelectedMosaic)mosaicIntent0).getMosaic().getNo(), null), null, null, null, null, null, null, null, 0x1FDF, null);
        }
        if(mosaicIntent0 instanceof MoveSelectBlur) {
            long v8 = ((MoveSelectBlur)mosaicIntent0).getOffset-F1C5BW0();
            Matrix matrix4 = ((MoveSelectBlur)mosaicIntent0).getBlur().getMatrix();
            matrix4.postTranslate(Offset.getX-impl(v8), Offset.getY-impl(v8));
            Blur blur3 = Blur.copy-lcW1YYU$default(((MoveSelectBlur)mosaicIntent0).getBlur(), 0, MatrixValuesKt.getMatrixValues(matrix4), 0L, 0.0f, null, 0L, 61, null);
            return MosaicUiState.copy$default(mosaicUiState0, null, null, null, null, null, KDPhotoKt.updateDecoration(mosaicUiState0.getPhoto(), blur3.getNo(), blur3), null, null, null, null, null, null, null, 0x1FDF, null);
        }
        if(mosaicIntent0 instanceof ScaleNRotateSelectBlur) {
            String s7 = ViewTypeTrackerKt.getMainTrackerLayer(mosaicUiState0.getViewType());
            String s8 = ViewTypeTrackerKt.getDragTrackerLayer(mosaicUiState0.getViewType());
            KDTracker.clickEvent$default(KDTracker.INSTANCE, s7, s8, null, null, 12, null);
            Pair pair1 = MosaicViewModel.a(((float)MatrixValues.get-impl(((ScaleNRotateSelectBlur)mosaicIntent0).getBlur().getMatrixValues-pp_Gbr8(), 2)), ((float)MatrixValues.get-impl(((ScaleNRotateSelectBlur)mosaicIntent0).getBlur().getMatrixValues-pp_Gbr8(), 5)), ((ScaleNRotateSelectBlur)mosaicIntent0).getMatrix(), ((ScaleNRotateSelectBlur)mosaicIntent0).getSize-NH-jbRc());
            Blur blur4 = Blur.copy-lcW1YYU$default(((ScaleNRotateSelectBlur)mosaicIntent0).getBlur(), 0, MatrixValuesKt.getMatrixValues(((Matrix)pair1.component2())), ((Size)pair1.component1()).unbox-impl(), 0.0f, null, 0L, 57, null);
            return MosaicUiState.copy$default(mosaicUiState0, null, null, null, null, null, KDPhotoKt.updateDecoration(mosaicUiState0.getPhoto(), blur4.getNo(), blur4), null, null, null, null, null, null, null, 0x1FDF, null);
        }
        if(mosaicIntent0 instanceof DeleteSelectedBlur) {
            String s9 = ViewTypeTrackerKt.getMainTrackerLayer(mosaicUiState0.getViewType());
            String s10 = ViewTypeTrackerKt.getDeleteTrackerLayer(mosaicUiState0.getViewType());
            KDTracker.clickEvent$default(KDTracker.INSTANCE, s9, s10, null, null, 12, null);
            return MosaicUiState.copy$default(mosaicUiState0, null, null, null, null, null, KDPhotoKt.updateDecoration(mosaicUiState0.getPhoto(), ((DeleteSelectedBlur)mosaicIntent0).getBlur().getNo(), null), null, null, null, null, null, null, null, 0x1FDF, null);
        }
        if(mosaicIntent0 instanceof ChangeIntensity) {
            Absolute decoration$Absolute3 = mosaicUiState0.getSelectedItem();
            if(decoration$Absolute3 == null) {
                return mosaicUiState0;
            }
            if(decoration$Absolute3 instanceof Mosaic) {
                float f2 = ((ChangeIntensity)mosaicIntent0).getOffset();
                float f3 = ((ChangeIntensity)mosaicIntent0).getOffset();
                Rect rect1 = SizeKt.toRect-uvyYCjk(IntSizeKt.toSize-ozmzZPI(mosaicUiState0.getPhoto().getBitmapSize-YbymL2g()));
                Matrix matrix5 = new Matrix();
                RectExtensionKt.setRectToRect(matrix5, rect1, mosaicUiState0.getContentBounds(), Matrix.ScaleToFit.CENTER);
                Mosaic mosaic6 = Mosaic.copy-lcW1YYU$default(((Mosaic)decoration$Absolute3), 0, null, 0L, f2, null, MosaicViewModel.b(f3, RectExtensionKt.mapRect(matrix5, rect1).getSize-NH-jbRc()), 23, null);
                return MosaicUiState.copy$default(mosaicUiState0, null, null, null, null, null, KDPhotoKt.updateDecoration(mosaicUiState0.getPhoto(), mosaic6.getNo(), mosaic6), null, null, null, null, null, null, null, 0x1FDF, null);
            }
            if(!(decoration$Absolute3 instanceof Blur)) {
                return mosaicUiState0;
            }
            Blur blur5 = Blur.copy-lcW1YYU$default(((Blur)decoration$Absolute3), 0, null, 0L, ((ChangeIntensity)mosaicIntent0).getOffset(), null, 0L, 55, null);
            return MosaicUiState.copy$default(mosaicUiState0, null, null, null, null, null, KDPhotoKt.updateDecoration(mosaicUiState0.getPhoto(), blur5.getNo(), blur5), null, null, null, null, null, null, null, 0x1FDF, null);
        }
        if(!Intrinsics.areEqual(mosaicIntent0, Cancel.INSTANCE)) {
            throw new NoWhenBranchMatchedException();
        }
        this.cancel(this, mosaicUiState0.getChanged());
        return mosaicUiState0;
    }

    @Override  // com.kakao.kandinsky.base.KDMviViewModel
    public Object handleIntent(Object object0, Object object1) {
        return this.handleIntent(((MosaicUiState)object0), ((MosaicIntent)object1));
    }
}

