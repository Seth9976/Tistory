package com.kakao.kandinsky.sticker;

import android.graphics.Matrix;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import com.kakao.kandinsky.base.KDMviViewModel;
import com.kakao.kandinsky.base.contract.Destination;
import com.kakao.kandinsky.base.contract.KDEvent.Go;
import com.kakao.kandinsky.base.contract.KDEvent.UpdateConfirm;
import com.kakao.kandinsky.core.kdphoto.Decoration.Absolute;
import com.kakao.kandinsky.core.kdphoto.KDPhoto;
import com.kakao.kandinsky.core.kdphoto.KDPhotoKt;
import com.kakao.kandinsky.core.kdphoto.Sticker;
import com.kakao.kandinsky.decoration.DecorationControllerInterface.DefaultImpls;
import com.kakao.kandinsky.decoration.DecorationControllerInterface;
import com.kakao.kandinsky.designsystem.util.MatrixTransformKt;
import com.kakao.kandinsky.designsystem.util.OffsetExtensionKt;
import com.kakao.kandinsky.designsystem.util.Transform;
import com.kakao.kandinsky.sticker.contract.StickerIntent.AddSticker;
import com.kakao.kandinsky.sticker.contract.StickerIntent.Confirm;
import com.kakao.kandinsky.sticker.contract.StickerIntent.MoveSelectSticker;
import com.kakao.kandinsky.sticker.contract.StickerIntent.RemoveAllSticker;
import com.kakao.kandinsky.sticker.contract.StickerIntent.RemoveSelectSticker;
import com.kakao.kandinsky.sticker.contract.StickerIntent.ScaleNRotateSelectSticker;
import com.kakao.kandinsky.sticker.contract.StickerIntent.SelectDecoSticker;
import com.kakao.kandinsky.sticker.contract.StickerIntent.SelectStickerGroup;
import com.kakao.kandinsky.sticker.contract.StickerIntent.UpdateContentBounds;
import com.kakao.kandinsky.sticker.contract.StickerIntent.UpdatePhoto;
import com.kakao.kandinsky.sticker.contract.StickerIntent;
import com.kakao.kandinsky.sticker.contract.StickerUiModel;
import com.kakao.kandinsky.utils.MatrixExtensionKt;
import com.kakao.kandinsky.utils.MatrixValues;
import com.kakao.kandinsky.utils.MatrixValuesKt;
import com.kakao.kdtracker.KDTracker;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ExtensionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import wa.a;
import wa.b;
import wa.c;
import wa.d;
import wa.e;
import wa.f;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00122\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0012B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001F\u0010\t\u001A\u00020\u00022\u0006\u0010\u0007\u001A\u00020\u00022\u0006\u0010\b\u001A\u00020\u0003H\u0014¢\u0006\u0004\b\t\u0010\nR\u001D\u0010\u0011\u001A\b\u0012\u0004\u0012\u00020\f0\u000B8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000E\u001A\u0004\b\u000F\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/kakao/kandinsky/sticker/StickerViewModel;", "Lcom/kakao/kandinsky/base/KDMviViewModel;", "Lcom/kakao/kandinsky/sticker/contract/StickerUiModel;", "Lcom/kakao/kandinsky/sticker/contract/StickerIntent;", "Lcom/kakao/kandinsky/base/contract/KDEvent;", "<init>", "()V", "current", "intent", "handleIntent", "(Lcom/kakao/kandinsky/sticker/contract/StickerUiModel;Lcom/kakao/kandinsky/sticker/contract/StickerIntent;)Lcom/kakao/kandinsky/sticker/contract/StickerUiModel;", "Lcom/kakao/kandinsky/decoration/DecorationControllerInterface;", "Lcom/kakao/kandinsky/core/kdphoto/Sticker;", "L0", "Lcom/kakao/kandinsky/decoration/DecorationControllerInterface;", "getController", "()Lcom/kakao/kandinsky/decoration/DecorationControllerInterface;", "controller", "Companion", "sticker_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nStickerViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StickerViewModel.kt\ncom/kakao/kandinsky/sticker/StickerViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,190:1\n819#2:191\n847#2,2:192\n*S KotlinDebug\n*F\n+ 1 StickerViewModel.kt\ncom/kakao/kandinsky/sticker/StickerViewModel\n*L\n167#1:191\n167#1:192,2\n*E\n"})
public final class StickerViewModel extends KDMviViewModel {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001A\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/kakao/kandinsky/sticker/StickerViewModel$Companion;", "", "", "STICKER_INIT_RATIO", "F", "sticker_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    public static final int $stable;
    @NotNull
    public static final Companion Companion;
    public final com.kakao.kandinsky.sticker.StickerViewModel.controller.1 L0;

    static {
        StickerViewModel.Companion = new Companion(null);
    }

    @Inject
    public StickerViewModel() {
        super(new StickerUiModel(null, null, null, null, null, null, null, null, null, null, 0x3FF, null));
        this.L0 = new DecorationControllerInterface() {
            public final StickerViewModel a;

            {
                this.a = stickerViewModel0;
            }

            @Override  // com.kakao.kandinsky.decoration.DecorationControllerInterface
            public boolean isInDisplayRect-v05aCt0(long v, @NotNull Rect rect0, @NotNull Matrix matrix0, long v1) {
                return DefaultImpls.isInDisplayRect-v05aCt0(this, v, rect0, matrix0, v1);
            }

            @Override  // com.kakao.kandinsky.decoration.DecorationControllerInterface
            public void onClickEmptyArea-k-4lQ0M(long v) {
            }

            public void onDelete(@NotNull Sticker sticker0) {
                Intrinsics.checkNotNullParameter(sticker0, "decoration");
                RemoveSelectSticker stickerIntent$RemoveSelectSticker0 = new RemoveSelectSticker(sticker0);
                this.a.sendIntent(stickerIntent$RemoveSelectSticker0);
            }

            @Override  // com.kakao.kandinsky.decoration.DecorationControllerInterface
            public void onDelete(Object object0) {
                this.onDelete(((Sticker)object0));
            }

            public void onDrag-Uv8p0NA(@NotNull Sticker sticker0, long v) {
                Intrinsics.checkNotNullParameter(sticker0, "decoration");
                MoveSelectSticker stickerIntent$MoveSelectSticker0 = new MoveSelectSticker(sticker0, v, null);
                this.a.sendIntent(stickerIntent$MoveSelectSticker0);
            }

            @Override  // com.kakao.kandinsky.decoration.DecorationControllerInterface
            public void onDrag-Uv8p0NA(Object object0, long v) {
                this.onDrag-Uv8p0NA(((Sticker)object0), v);
            }

            public void onOutOfImage(@NotNull Sticker sticker0) {
                Intrinsics.checkNotNullParameter(sticker0, "decoration");
                this.onDelete(sticker0);
            }

            @Override  // com.kakao.kandinsky.decoration.DecorationControllerInterface
            public void onOutOfImage(Object object0) {
                this.onOutOfImage(((Sticker)object0));
            }

            public void onPress(@Nullable Sticker sticker0) {
                SelectDecoSticker stickerIntent$SelectDecoSticker0 = new SelectDecoSticker(sticker0);
                this.a.sendIntent(stickerIntent$SelectDecoSticker0);
            }

            @Override  // com.kakao.kandinsky.decoration.DecorationControllerInterface
            public void onPress(Object object0) {
                this.onPress(((Sticker)object0));
            }

            public void onScaleAndRotate-12SF9DM(@NotNull Sticker sticker0, long v, @NotNull Matrix matrix0) {
                Intrinsics.checkNotNullParameter(sticker0, "decoration");
                Intrinsics.checkNotNullParameter(matrix0, "matrix");
                ScaleNRotateSelectSticker stickerIntent$ScaleNRotateSelectSticker0 = new ScaleNRotateSelectSticker(sticker0, v, matrix0, null);
                this.a.sendIntent(stickerIntent$ScaleNRotateSelectSticker0);
            }

            @Override  // com.kakao.kandinsky.decoration.DecorationControllerInterface
            public void onScaleAndRotate-12SF9DM(Object object0, long v, Matrix matrix0) {
                this.onScaleAndRotate-12SF9DM(((Sticker)object0), v, matrix0);
            }

            public void onTap(@NotNull Sticker sticker0) {
            }

            @Override  // com.kakao.kandinsky.decoration.DecorationControllerInterface
            public void onTap(Object object0) {
            }
        };
    }

    @NotNull
    public final DecorationControllerInterface getController() {
        return this.L0;
    }

    @NotNull
    public StickerUiModel handleIntent(@NotNull StickerUiModel stickerUiModel0, @NotNull StickerIntent stickerIntent0) {
        Intrinsics.checkNotNullParameter(stickerUiModel0, "current");
        Intrinsics.checkNotNullParameter(stickerIntent0, "intent");
        if(stickerIntent0 instanceof UpdatePhoto) {
            boolean z = Intrinsics.areEqual(stickerUiModel0.getPhoto().getOriginalUri(), ((UpdatePhoto)stickerIntent0).getPhoto().getOriginalUri());
            KDPhoto kDPhoto0 = ((UpdatePhoto)stickerIntent0).getPhoto();
            return z ? StickerUiModel.copy$default(stickerUiModel0, kDPhoto0, stickerUiModel0.getSelectedNo(), null, new a(this), null, null, new b(this), new c(this), new d(this), new e(this), 52, null) : StickerUiModel.copy$default(stickerUiModel0, kDPhoto0, null, null, new a(this), null, null, new b(this), new c(this), new d(this), new e(this), 52, null);
        }
        if(stickerIntent0 instanceof UpdateContentBounds) {
            return StickerUiModel.copy$default(stickerUiModel0, null, null, ((UpdateContentBounds)stickerIntent0).getBounds(), null, null, null, null, null, null, null, 0x3FB, null);
        }
        if(stickerIntent0 instanceof SelectStickerGroup) {
            return StickerUiModel.copy$default(stickerUiModel0, null, null, null, null, null, ((SelectStickerGroup)stickerIntent0).getStickerGroup(), null, null, null, null, 0x3DF, null);
        }
        if(stickerIntent0 instanceof AddSticker) {
            KDPhoto kDPhoto1 = stickerUiModel0.getPhoto();
            int v = kDPhoto1.getNewDecoNo();
            float f = Math.min(Size.getWidth-impl(kDPhoto1.getCropSize-NH-jbRc()), Size.getHeight-impl(kDPhoto1.getCropSize-NH-jbRc()));
            long v1 = kDPhoto1.getCropCenter-F1C5BW0();
            Matrix matrix0 = kDPhoto1.getMatrix();
            matrix0.postTranslate(-Offset.getX-impl(v1), -Offset.getY-impl(v1));
            Matrix matrix1 = new Matrix();
            matrix0.invert(matrix1);
            return StickerUiModel.copy$default(stickerUiModel0, KDPhoto.copy-2Ycw6ww$default(stickerUiModel0.getPhoto(), null, 0, null, 0L, false, 0, null, 0L, null, 0.0f, null, stickerUiModel0.getPhoto().getDecorationList().add(new Sticker(v, MatrixValuesKt.getMatrixValues(matrix1), ((AddSticker)stickerIntent0).getStickerItem().getUrl(), SizeKt.Size(f * 0.2f, f * 0.2f), null)), null, null, 0x37FF, null), v, null, null, null, null, null, null, null, null, 1020, null);
        }
        if(stickerIntent0 instanceof SelectDecoSticker) {
            Sticker sticker0 = ((SelectDecoSticker)stickerIntent0).getSticker();
            KDPhoto kDPhoto2 = KDPhotoKt.updateDecoration(stickerUiModel0.getPhoto(), (sticker0 == null ? null : sticker0.getNo()), ((SelectDecoSticker)stickerIntent0).getSticker());
            Sticker sticker1 = ((SelectDecoSticker)stickerIntent0).getSticker();
            return sticker1 == null ? StickerUiModel.copy$default(stickerUiModel0, kDPhoto2, null, null, null, null, null, null, null, null, null, 1020, null) : StickerUiModel.copy$default(stickerUiModel0, kDPhoto2, sticker1.getNo(), null, null, null, null, null, null, null, null, 1020, null);
        }
        if(stickerIntent0 instanceof RemoveSelectSticker) {
            KDTracker.clickEvent$default(KDTracker.INSTANCE, "sticker-tab", "removesticker", null, null, 12, null);
            return StickerUiModel.copy$default(stickerUiModel0, KDPhotoKt.updateDecoration(stickerUiModel0.getPhoto(), ((RemoveSelectSticker)stickerIntent0).getSticker().getNo(), null), null, null, null, null, null, null, null, null, null, 1020, null);
        }
        if(stickerIntent0 instanceof MoveSelectSticker) {
            Sticker sticker2 = ((MoveSelectSticker)stickerIntent0).getSticker();
            Sticker sticker3 = Sticker.copy-ZG1bdyc$default(sticker2, 0, MatrixValuesKt.getMatrixValues(MatrixExtensionKt.buildMatrix(sticker2.getMatrix(), new f(stickerIntent0))), null, 0L, 13, null);
            return StickerUiModel.copy$default(stickerUiModel0, KDPhotoKt.updateDecoration(stickerUiModel0.getPhoto(), sticker2.getNo(), sticker3), sticker3.getNo(), null, null, null, null, null, null, null, null, 1020, null);
        }
        if(stickerIntent0 instanceof ScaleNRotateSelectSticker) {
            KDTracker.clickEvent$default(KDTracker.INSTANCE, "sticker-tab", "sticker-resize", null, null, 12, null);
            Sticker sticker4 = ((ScaleNRotateSelectSticker)stickerIntent0).getSticker();
            Matrix matrix2 = ((ScaleNRotateSelectSticker)stickerIntent0).getMatrix();
            long v2 = SizeKt.Size(Offset.getDistance-impl(OffsetExtensionKt.mapVector-Uv8p0NA(matrix2, OffsetKt.Offset(Size.getWidth-impl(((ScaleNRotateSelectSticker)stickerIntent0).getSize-NH-jbRc()), 0.0f))), Offset.getDistance-impl(OffsetExtensionKt.mapVector-Uv8p0NA(matrix2, OffsetKt.Offset(0.0f, Size.getHeight-impl(((ScaleNRotateSelectSticker)stickerIntent0).getSize-NH-jbRc())))));
            Transform transform0 = MatrixTransformKt.getTransform(matrix2);
            Sticker sticker5 = Sticker.copy-ZG1bdyc$default(sticker4, 0, MatrixValuesKt.getMatrixValues(Transform.copy$default(transform0, ((float)MatrixValues.get-impl(sticker4.getMatrixValues-pp_Gbr8(), 2)), ((float)MatrixValues.get-impl(sticker4.getMatrixValues-pp_Gbr8(), 5)), 0.0f, (Float.compare(transform0.getScaleX(), 0.0f) >= 0 ? 1.0f : -1.0f), (transform0.getScaleY() < 0.0f ? -1.0f : 1.0f), 4, null).getMatrix()), null, v2, 5, null);
            return StickerUiModel.copy$default(stickerUiModel0, KDPhotoKt.updateDecoration(stickerUiModel0.getPhoto(), sticker4.getNo(), sticker5), sticker5.getNo(), null, null, null, null, null, null, null, null, 1020, null);
        }
        if(Intrinsics.areEqual(stickerIntent0, RemoveAllSticker.INSTANCE)) {
            KDPhoto kDPhoto3 = stickerUiModel0.getPhoto();
            ArrayList arrayList0 = new ArrayList();
            for(Object object0: kDPhoto3.getDecorationList()) {
                if(!(((Absolute)object0) instanceof Sticker)) {
                    arrayList0.add(object0);
                }
            }
            return StickerUiModel.copy$default(stickerUiModel0, KDPhoto.copy-2Ycw6ww$default(kDPhoto3, null, 0, null, 0L, false, 0, null, 0L, null, 0.0f, null, ExtensionsKt.toPersistentList(arrayList0), null, null, 0x37FF, null), null, null, null, null, null, null, null, null, null, 1020, null);
        }
        if(!Intrinsics.areEqual(stickerIntent0, Confirm.INSTANCE)) {
            throw new NoWhenBranchMatchedException();
        }
        this.sendEvent(new UpdateConfirm(stickerUiModel0.getPhoto()));
        this.sendEvent(new Go(Destination.HOME));
        return stickerUiModel0;
    }

    @Override  // com.kakao.kandinsky.base.KDMviViewModel
    public Object handleIntent(Object object0, Object object1) {
        return this.handleIntent(((StickerUiModel)object0), ((StickerIntent)object1));
    }
}

