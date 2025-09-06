package com.kakao.kandinsky.signature;

import android.graphics.Matrix;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.lifecycle.ViewModelKt;
import com.kakao.kandinsky.base.KDMviViewModel;
import com.kakao.kandinsky.base.contract.DialogUiState;
import com.kakao.kandinsky.bitmap.usecase.GetBitmapSizeUseCase;
import com.kakao.kandinsky.core.kdphoto.KDPhoto;
import com.kakao.kandinsky.core.kdphoto.Signature.Image;
import com.kakao.kandinsky.core.kdphoto.Signature.Text;
import com.kakao.kandinsky.core.kdphoto.Signature;
import com.kakao.kandinsky.core.kdphoto.SignatureMetaData;
import com.kakao.kandinsky.core.kdphoto.TextData;
import com.kakao.kandinsky.decoration.DecorationControllerInterface.DefaultImpls;
import com.kakao.kandinsky.decoration.DecorationControllerInterface;
import com.kakao.kandinsky.designsystem.util.MatrixTransformKt;
import com.kakao.kandinsky.designsystem.util.SizeExtensionKt;
import com.kakao.kandinsky.signature.contract.SignatureEvent.ShowDialog;
import com.kakao.kandinsky.signature.contract.SignatureEvent.ShowImageSelector;
import com.kakao.kandinsky.signature.contract.SignatureIntent.Cancel;
import com.kakao.kandinsky.signature.contract.SignatureIntent.ChangeSignature;
import com.kakao.kandinsky.signature.contract.SignatureIntent.DeleteHistory;
import com.kakao.kandinsky.signature.contract.SignatureIntent.EditSignature;
import com.kakao.kandinsky.signature.contract.SignatureIntent.Init;
import com.kakao.kandinsky.signature.contract.SignatureIntent.MoveSignature;
import com.kakao.kandinsky.signature.contract.SignatureIntent.OnChangeImageSignatureAlpha;
import com.kakao.kandinsky.signature.contract.SignatureIntent.OnClickConfirm;
import com.kakao.kandinsky.signature.contract.SignatureIntent.OnClickMenuImage;
import com.kakao.kandinsky.signature.contract.SignatureIntent.OnClickMenuText;
import com.kakao.kandinsky.signature.contract.SignatureIntent.OnClickMultipleConfirm;
import com.kakao.kandinsky.signature.contract.SignatureIntent.OnTextEditorClose;
import com.kakao.kandinsky.signature.contract.SignatureIntent.RemoveSignature;
import com.kakao.kandinsky.signature.contract.SignatureIntent.ScaleNRotateSelectSignature;
import com.kakao.kandinsky.signature.contract.SignatureIntent.UpdateContentBounds;
import com.kakao.kandinsky.signature.contract.SignatureIntent.UpdateImageSignature;
import com.kakao.kandinsky.signature.contract.SignatureIntent.UpdatePhoto;
import com.kakao.kandinsky.signature.contract.SignatureIntent.UpdateTextSignature;
import com.kakao.kandinsky.signature.contract.SignatureIntent;
import com.kakao.kandinsky.signature.contract.SignatureState.None;
import com.kakao.kandinsky.signature.contract.SignatureState.TextEditor;
import com.kakao.kandinsky.signature.contract.SignatureUiState;
import com.kakao.kandinsky.signature.database.SignatureDao;
import com.kakao.kandinsky.textedit.contract.FontData;
import com.kakao.kdtracker.KDTracker;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.k;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sa.a0;
import sa.b0;
import sa.c0;
import sa.d0;
import sa.e0;
import sa.f0;
import sa.g0;
import sa.h0;
import sa.m;
import sa.n;
import sa.o;
import sa.p;
import sa.q;
import sa.r;
import sa.s;
import sa.t;
import sa.u;
import sa.v;
import sa.w;
import sa.x;
import sa.y;
import sa.z;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u0012\u0006\u0010\b\u001A\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001F\u0010\r\u001A\u00020\u00022\u0006\u0010\u000B\u001A\u00020\u00022\u0006\u0010\f\u001A\u00020\u0003H\u0014¢\u0006\u0004\b\r\u0010\u000ER\u001D\u0010\u0015\u001A\b\u0012\u0004\u0012\u00020\u00100\u000F8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001A\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/kakao/kandinsky/signature/SignatureVieModel;", "Lcom/kakao/kandinsky/base/KDMviViewModel;", "Lcom/kakao/kandinsky/signature/contract/SignatureUiState;", "Lcom/kakao/kandinsky/signature/contract/SignatureIntent;", "Lcom/kakao/kandinsky/signature/contract/SignatureEvent;", "Lcom/kakao/kandinsky/signature/database/SignatureDao;", "dao", "Lcom/kakao/kandinsky/bitmap/usecase/GetBitmapSizeUseCase;", "getBitmapSizeUseCase", "<init>", "(Lcom/kakao/kandinsky/signature/database/SignatureDao;Lcom/kakao/kandinsky/bitmap/usecase/GetBitmapSizeUseCase;)V", "current", "intent", "handleIntent", "(Lcom/kakao/kandinsky/signature/contract/SignatureUiState;Lcom/kakao/kandinsky/signature/contract/SignatureIntent;)Lcom/kakao/kandinsky/signature/contract/SignatureUiState;", "Lcom/kakao/kandinsky/decoration/DecorationControllerInterface;", "Lcom/kakao/kandinsky/core/kdphoto/Signature;", "N0", "Lcom/kakao/kandinsky/decoration/DecorationControllerInterface;", "getController", "()Lcom/kakao/kandinsky/decoration/DecorationControllerInterface;", "controller", "signature_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSignatureViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SignatureViewModel.kt\ncom/kakao/kandinsky/signature/SignatureVieModel\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,458:1\n125#2:459\n152#2,3:460\n*S KotlinDebug\n*F\n+ 1 SignatureViewModel.kt\ncom/kakao/kandinsky/signature/SignatureVieModel\n*L\n63#1:459\n63#1:460,3\n*E\n"})
public final class SignatureVieModel extends KDMviViewModel {
    public static final int $stable = 8;
    public final SignatureDao L0;
    public final GetBitmapSizeUseCase M0;
    public final com.kakao.kandinsky.signature.SignatureVieModel.controller.1 N0;

    @Inject
    public SignatureVieModel(@NotNull SignatureDao signatureDao0, @NotNull GetBitmapSizeUseCase getBitmapSizeUseCase0) {
        Intrinsics.checkNotNullParameter(signatureDao0, "dao");
        Intrinsics.checkNotNullParameter(getBitmapSizeUseCase0, "getBitmapSizeUseCase");
        super(new SignatureUiState(null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0x1FFFFF, null));
        this.L0 = signatureDao0;
        this.M0 = getBitmapSizeUseCase0;
        this.N0 = new DecorationControllerInterface() {
            public final SignatureVieModel a;

            {
                this.a = signatureVieModel0;
            }

            @Override  // com.kakao.kandinsky.decoration.DecorationControllerInterface
            public boolean isInDisplayRect-v05aCt0(long v, @NotNull Rect rect0, @NotNull Matrix matrix0, long v1) {
                return DefaultImpls.isInDisplayRect-v05aCt0(this, v, rect0, matrix0, v1);
            }

            @Override  // com.kakao.kandinsky.decoration.DecorationControllerInterface
            public void onClickEmptyArea-k-4lQ0M(long v) {
            }

            public void onDelete(@NotNull Signature signature0) {
                Intrinsics.checkNotNullParameter(signature0, "decoration");
                this.a.sendIntent(RemoveSignature.INSTANCE);
            }

            @Override  // com.kakao.kandinsky.decoration.DecorationControllerInterface
            public void onDelete(Object object0) {
                this.onDelete(((Signature)object0));
            }

            public void onDrag-Uv8p0NA(@NotNull Signature signature0, long v) {
                Intrinsics.checkNotNullParameter(signature0, "decoration");
                MoveSignature signatureIntent$MoveSignature0 = new MoveSignature(v, null);
                this.a.sendIntent(signatureIntent$MoveSignature0);
            }

            @Override  // com.kakao.kandinsky.decoration.DecorationControllerInterface
            public void onDrag-Uv8p0NA(Object object0, long v) {
                this.onDrag-Uv8p0NA(((Signature)object0), v);
            }

            public void onOutOfImage(@NotNull Signature signature0) {
                Intrinsics.checkNotNullParameter(signature0, "decoration");
                this.onDelete(signature0);
            }

            @Override  // com.kakao.kandinsky.decoration.DecorationControllerInterface
            public void onOutOfImage(Object object0) {
                this.onOutOfImage(((Signature)object0));
            }

            public void onPress(@Nullable Signature signature0) {
            }

            @Override  // com.kakao.kandinsky.decoration.DecorationControllerInterface
            public void onPress(Object object0) {
            }

            public void onScaleAndRotate-12SF9DM(@NotNull Signature signature0, long v, @NotNull Matrix matrix0) {
                Intrinsics.checkNotNullParameter(signature0, "decoration");
                Intrinsics.checkNotNullParameter(matrix0, "matrix");
                ScaleNRotateSelectSignature signatureIntent$ScaleNRotateSelectSignature0 = new ScaleNRotateSelectSignature(v, matrix0, null);
                this.a.sendIntent(signatureIntent$ScaleNRotateSelectSignature0);
            }

            @Override  // com.kakao.kandinsky.decoration.DecorationControllerInterface
            public void onScaleAndRotate-12SF9DM(Object object0, long v, Matrix matrix0) {
                this.onScaleAndRotate-12SF9DM(((Signature)object0), v, matrix0);
            }

            public void onTap(@NotNull Signature signature0) {
                Intrinsics.checkNotNullParameter(signature0, "decoration");
                EditSignature signatureIntent$EditSignature0 = new EditSignature(signature0);
                this.a.sendIntent(signatureIntent$EditSignature0);
            }

            @Override  // com.kakao.kandinsky.decoration.DecorationControllerInterface
            public void onTap(Object object0) {
                this.onTap(((Signature)object0));
            }
        };
    }

    @NotNull
    public final DecorationControllerInterface getController() {
        return this.N0;
    }

    @NotNull
    public SignatureUiState handleIntent(@NotNull SignatureUiState signatureUiState0, @NotNull SignatureIntent signatureIntent0) {
        SignatureUiState signatureUiState1;
        Image signature$Image4;
        SignatureMetaData signatureMetaData1;
        Integer integer0 = null;
        Intrinsics.checkNotNullParameter(signatureUiState0, "current");
        Intrinsics.checkNotNullParameter(signatureIntent0, "intent");
        if(signatureIntent0 instanceof Init) {
            List list0 = k.createListBuilder();
            if(((Init)signatureIntent0).getAllowSystemFont()) {
                list0.add(FontData.Companion.getSYSTEM_FONT());
            }
            Map map0 = ((Init)signatureIntent0).getFontResources();
            ArrayList arrayList0 = new ArrayList(map0.size());
            for(Object object0: map0.entrySet()) {
                arrayList0.add(new FontData(((String)((Map.Entry)object0).getKey()), ((Integer)((Map.Entry)object0).getValue())));
            }
            list0.addAll(arrayList0);
            List list1 = k.build(list0);
            boolean z = ((Init)signatureIntent0).isSingleImage();
            String s = ((Init)signatureIntent0).getDefaultSignature();
            return SignatureUiState.copy$default(signatureUiState0, null, null, null, new v(this), z, s, list1, null, null, null, new y(this), new z(this), new a0(list1, this), null, new b0(this), new c0(this), new d0(this), new e0(this), new f0(this), new m(this), new n(this), 9095, null);
        }
        if(signatureIntent0 instanceof UpdatePhoto) {
            Signature signature0 = ((UpdatePhoto)signatureIntent0).getPhoto().getSignature();
            KDPhoto kDPhoto0 = ((UpdatePhoto)signatureIntent0).getPhoto();
            KDPhoto kDPhoto1 = ((UpdatePhoto)signatureIntent0).getPhoto();
            Text signature$Text0 = signature0 instanceof Text ? ((Text)signature0) : null;
            Image signature$Image0 = signature0 instanceof Image ? ((Image)signature0) : null;
            if(signature0 instanceof Text) {
                return SignatureUiState.copy$default(signatureUiState0, kDPhoto0, kDPhoto1, null, null, false, null, null, com.kakao.kandinsky.signature.contract.SignatureState.Text.INSTANCE, signature$Image0, signature$Text0, null, null, null, null, null, null, null, null, null, null, null, 0x1FFC7C, null);
            }
            return signature0 instanceof Image ? SignatureUiState.copy$default(signatureUiState0, kDPhoto0, kDPhoto1, null, null, false, null, null, com.kakao.kandinsky.signature.contract.SignatureState.Image.INSTANCE, signature$Image0, signature$Text0, null, null, null, null, null, null, null, null, null, null, null, 0x1FFC7C, null) : SignatureUiState.copy$default(signatureUiState0, kDPhoto0, kDPhoto1, null, null, false, null, null, None.INSTANCE, signature$Image0, signature$Text0, null, null, null, null, null, null, null, null, null, null, null, 0x1FFC7C, null);
        }
        if(signatureIntent0 instanceof UpdateContentBounds) {
            return SignatureUiState.copy$default(signatureUiState0, null, null, ((UpdateContentBounds)signatureIntent0).getBounds(), null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0x1FFFFB, null);
        }
        if(Intrinsics.areEqual(signatureIntent0, OnClickMenuText.INSTANCE)) {
            KDTracker.clickEvent$default(KDTracker.INSTANCE, "sign-tab", "text-tab", null, null, 12, null);
            if(signatureUiState0.getSavedTextSignature() == null) {
                String s1 = signatureUiState0.getDefaultSignature();
                FontData fontData0 = (FontData)CollectionsKt___CollectionsKt.firstOrNull(signatureUiState0.getFonts());
                if(fontData0 != null) {
                    integer0 = fontData0.getResource();
                }
                return SignatureUiState.copy$default(signatureUiState0, null, null, null, null, false, null, null, new TextEditor(new TextData(s1, 0xFFFFFFFF00000000L, 100.0f, 0xFF17171700000000L, 20.0f, 0L, 0L, false, false, false, 0, integer0, 0.0f, 0.0f, 0x37E0, null), false, new o(this, signatureUiState0), new p(this)), null, null, null, null, null, null, null, null, null, null, null, null, null, 0x1FFF7F, null);
            }
            return Intrinsics.areEqual(signatureUiState0.getState(), com.kakao.kandinsky.signature.contract.SignatureState.Text.INSTANCE) ? SignatureUiState.copy$default(signatureUiState0, null, null, null, null, false, null, null, new TextEditor(signatureUiState0.getSavedTextSignature().getEditTextData(), signatureUiState0.getSavedTextSignature().getWatermark(), new q(this, signatureUiState0), new r(this)), null, null, null, null, null, null, null, null, null, null, null, null, null, 0x1FFF7F, null) : SignatureUiState.copy$default(signatureUiState0, KDPhoto.copy-2Ycw6ww$default(signatureUiState0.getPhoto(), null, 0, null, 0L, false, 0, null, 0L, null, 0.0f, null, null, null, signatureUiState0.getSavedTextSignature(), 0x1FFF, null), null, null, null, false, null, null, com.kakao.kandinsky.signature.contract.SignatureState.Text.INSTANCE, null, null, null, null, null, null, null, null, null, null, null, null, null, 0x1FFF7E, null);
        }
        if(Intrinsics.areEqual(signatureIntent0, OnClickMenuImage.INSTANCE)) {
            KDTracker.clickEvent$default(KDTracker.INSTANCE, "sign-tab", "image-tab", null, null, 12, null);
            if(signatureUiState0.getSavedImageSignature() != null) {
                com.kakao.kandinsky.signature.contract.SignatureState.Image signatureState$Image0 = com.kakao.kandinsky.signature.contract.SignatureState.Image.INSTANCE;
                if(!Intrinsics.areEqual(signatureUiState0.getState(), signatureState$Image0)) {
                    return SignatureUiState.copy$default(signatureUiState0, KDPhoto.copy-2Ycw6ww$default(signatureUiState0.getPhoto(), null, 0, null, 0L, false, 0, null, 0L, null, 0.0f, null, null, null, signatureUiState0.getSavedImageSignature(), 0x1FFF, null), null, null, null, false, null, null, signatureState$Image0, null, null, null, null, null, null, null, null, null, null, null, null, null, 0x1FFF7E, null);
                }
            }
            this.sendEvent(ShowImageSelector.INSTANCE);
            return signatureUiState0;
        }
        if(signatureIntent0 instanceof OnChangeImageSignatureAlpha) {
            Image signature$Image1 = signatureUiState0.getSavedImageSignature();
            if(signature$Image1 != null) {
                Image signature$Image2 = Image.copy$default(signature$Image1, 0, null, ((OnChangeImageSignatureAlpha)signatureIntent0).getAlpha(), null, 11, null);
                return SignatureUiState.copy$default(signatureUiState0, KDPhoto.copy-2Ycw6ww$default(signatureUiState0.getPhoto(), null, 0, null, 0L, false, 0, null, 0L, null, 0.0f, null, null, null, signature$Image2, 0x1FFF, null), null, null, null, false, null, null, null, signature$Image2, null, null, null, null, null, null, null, null, null, null, null, null, 0x1FFEFE, null);
            }
            return SignatureUiState.copy$default(signatureUiState0, KDPhoto.copy-2Ycw6ww$default(signatureUiState0.getPhoto(), null, 0, null, 0L, false, 0, null, 0L, null, 0.0f, null, null, null, null, 0x1FFF, null), null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0x1FFEFE, null);
        }
        if(signatureIntent0 instanceof OnTextEditorClose) {
            Text signature$Text1 = signatureUiState0.getSavedTextSignature();
            if(signature$Text1 != null) {
                TextData textData0 = signature$Text1.getTextData();
                if(textData0 != null) {
                    String s2 = textData0.getText();
                    if(s2 != null && !kotlin.text.p.isBlank(s2) == 1) {
                        return SignatureUiState.copy$default(signatureUiState0, null, null, null, null, false, null, null, com.kakao.kandinsky.signature.contract.SignatureState.Text.INSTANCE, null, null, null, null, null, null, null, null, null, null, null, null, null, 0x1FFF7F, null);
                    }
                }
            }
            return Intrinsics.areEqual(((OnTextEditorClose)signatureIntent0).getState(), com.kakao.kandinsky.signature.contract.SignatureState.Text.INSTANCE) ? SignatureUiState.copy$default(signatureUiState0, null, null, null, null, false, null, null, None.INSTANCE, null, null, null, null, null, null, null, null, null, null, null, null, null, 0x1FFD7F, null) : SignatureUiState.copy$default(signatureUiState0, null, null, null, null, false, null, null, ((OnTextEditorClose)signatureIntent0).getState(), null, null, null, null, null, null, null, null, null, null, null, null, null, 0x1FFD7F, null);
        }
        if(signatureIntent0 instanceof UpdateTextSignature) {
            TextData textData1 = ((UpdateTextSignature)signatureIntent0).getTextData();
            boolean z1 = ((UpdateTextSignature)signatureIntent0).getWatermark();
            if(((UpdateTextSignature)signatureIntent0).getNew() || signatureUiState0.getSavedTextSignature() == null) {
                long v = textData1.getBoundsSize-NH-jbRc();
                long v1 = signatureUiState0.getDisplayCropRect().getSize-NH-jbRc();
                signatureMetaData1 = MetaDataConverter.INSTANCE.createTextInitMetaData-iLBOSCw(v, v1);
            }
            else {
                SignatureMetaData signatureMetaData0 = signatureUiState0.getSavedTextSignature().getMetaData();
                float f = Size.getWidth-impl(textData1.getBoundsSize-NH-jbRc());
                float f1 = Size.getWidth-impl(signatureMetaData0.getOriginalSize-NH-jbRc());
                signatureMetaData1 = SignatureMetaData.copy-_93gMUo$default(signatureMetaData0, textData1.getBoundsSize-NH-jbRc(), f * signatureMetaData0.getWidthRatio() / f1, 0.0f, 0.0f, 0.0f, 28, null);
            }
            Text signature$Text2 = new Text(0, textData1, z1, signatureMetaData1, 1, null);
            return SignatureUiState.copy$default(signatureUiState0, KDPhoto.copy-2Ycw6ww$default(signatureUiState0.getPhoto(), null, 0, null, 0L, false, 0, null, 0L, null, 0.0f, null, null, null, signature$Text2, 0x1FFF, null), null, null, null, false, null, null, null, null, signature$Text2, null, null, null, null, null, null, null, null, null, null, null, 0x1FFDFE, null);
        }
        if(signatureIntent0 instanceof UpdateImageSignature) {
            String s3 = ((UpdateImageSignature)signatureIntent0).getUri();
            long v2 = SizeExtensionKt.toComposeSize(this.M0.invoke(s3));
            Image signature$Image3 = signatureUiState0.getSavedImageSignature();
            if(signature$Image3 != null) {
                signature$Image4 = Image.copy$default(signature$Image3, 0, ((UpdateImageSignature)signatureIntent0).getUri(), 0.0f, SignatureMetaData.copy-_93gMUo$default(signatureUiState0.getSavedImageSignature().getMetaData(), v2, 0.0f, 0.0f, 0.0f, 0.0f, 30, null), 5, null);
                if(signature$Image4 != null) {
                    return SignatureUiState.copy$default(signatureUiState0, KDPhoto.copy-2Ycw6ww$default(signatureUiState0.getPhoto(), null, 0, null, 0L, false, 0, null, 0L, null, 0.0f, null, null, null, signature$Image4, 0x1FFF, null), null, null, null, false, null, null, com.kakao.kandinsky.signature.contract.SignatureState.Image.INSTANCE, signature$Image4, null, null, null, null, null, null, null, null, null, null, null, null, 0x1FFE7E, null);
                }
            }
            String s4 = ((UpdateImageSignature)signatureIntent0).getUri();
            long v3 = signatureUiState0.getDisplayCropRect().getSize-NH-jbRc();
            signature$Image4 = new Image(0, s4, 0.0f, MetaDataConverter.INSTANCE.createImageInitMetaData-iLBOSCw(v2, v3), 4, null);
            return SignatureUiState.copy$default(signatureUiState0, KDPhoto.copy-2Ycw6ww$default(signatureUiState0.getPhoto(), null, 0, null, 0L, false, 0, null, 0L, null, 0.0f, null, null, null, signature$Image4, 0x1FFF, null), null, null, null, false, null, null, com.kakao.kandinsky.signature.contract.SignatureState.Image.INSTANCE, signature$Image4, null, null, null, null, null, null, null, null, null, null, null, null, 0x1FFE7E, null);
        }
        if(signatureIntent0 instanceof MoveSignature) {
            Signature signature1 = signatureUiState0.getSelectedSignature();
            if(signature1 == null) {
                return signatureUiState0;
            }
            long v4 = OffsetKt.Offset(Offset.getX-impl(((MoveSignature)signatureIntent0).getOffset-F1C5BW0()) / Size.getWidth-impl(signatureUiState0.getDisplayCropRect().getSize-NH-jbRc()), Offset.getY-impl(((MoveSignature)signatureIntent0).getOffset-F1C5BW0()) / Size.getWidth-impl(signatureUiState0.getDisplayCropRect().getSize-NH-jbRc()));
            if(signature1 instanceof Image) {
                Image signature$Image5 = Image.copy$default(((Image)signature1), 0, null, 0.0f, SignatureMetaData.copy-_93gMUo$default(signature1.getMetaData(), 0L, 0.0f, 0.0f, signature1.getMetaData().getHorizontalPaddingRatio() - Offset.getX-impl(v4), signature1.getMetaData().getVerticalPaddingRatio() - Offset.getY-impl(v4), 7, null), 7, null);
                signatureUiState1 = SignatureUiState.copy$default(signatureUiState0, KDPhoto.copy-2Ycw6ww$default(signatureUiState0.getPhoto(), null, 0, null, 0L, false, 0, null, 0L, null, 0.0f, null, null, null, signature$Image5, 0x1FFF, null), null, null, null, false, null, null, null, signature$Image5, null, null, null, null, null, null, null, null, null, null, null, null, 0x1FFEFE, null);
                return signatureUiState1 == null ? signatureUiState0 : signatureUiState1;
            }
            if(!(signature1 instanceof Text)) {
                throw new NoWhenBranchMatchedException();
            }
            Text signature$Text3 = Text.copy$default(((Text)signature1), 0, null, false, SignatureMetaData.copy-_93gMUo$default(signature1.getMetaData(), 0L, 0.0f, 0.0f, signature1.getMetaData().getHorizontalPaddingRatio() - Offset.getX-impl(v4), signature1.getMetaData().getVerticalPaddingRatio() - Offset.getY-impl(v4), 7, null), 7, null);
            signatureUiState1 = SignatureUiState.copy$default(signatureUiState0, KDPhoto.copy-2Ycw6ww$default(signatureUiState0.getPhoto(), null, 0, null, 0L, false, 0, null, 0L, null, 0.0f, null, null, null, signature$Text3, 0x1FFF, null), null, null, null, false, null, null, null, null, signature$Text3, null, null, null, null, null, null, null, null, null, null, null, 0x1FFDFE, null);
            return signatureUiState1 == null ? signatureUiState0 : signatureUiState1;
        }
        if(signatureIntent0 instanceof ScaleNRotateSelectSignature) {
            Signature signature2 = signatureUiState0.getSelectedSignature();
            if(signature2 == null) {
                return signatureUiState0;
            }
            float f2 = Size.getWidth-impl(((ScaleNRotateSelectSignature)signatureIntent0).getSize-NH-jbRc());
            float f3 = Size.getWidth-impl(signatureUiState0.getDisplayCropRect().getSize-NH-jbRc());
            SignatureMetaData signatureMetaData2 = signature2.getMetaData();
            SignatureMetaData signatureMetaData3 = SignatureMetaData.copy-_93gMUo$default(signatureMetaData2, 0L, f2 / f3, MatrixTransformKt.getTransform(((ScaleNRotateSelectSignature)signatureIntent0).getMatrix()).getRotateZ(), 0.0f, 0.0f, 25, null);
            long v5 = signatureUiState0.getDisplayCropRect().getSize-NH-jbRc();
            long v6 = MetaDataConverter.INSTANCE.calculatePaddingDiff-jT60Xlo(v5, signatureMetaData2, signatureMetaData3);
            SignatureMetaData signatureMetaData4 = SignatureMetaData.copy-_93gMUo$default(signatureMetaData3, 0L, 0.0f, 0.0f, signatureMetaData2.getHorizontalPaddingRatio() - Offset.getX-impl(v6), signatureMetaData2.getVerticalPaddingRatio() - Offset.getY-impl(v6), 7, null);
            if(signature2 instanceof Image) {
                KDTracker.clickEvent$default(KDTracker.INSTANCE, "sign-tab", "image-tab", "image-resize", null, 8, null);
                Image signature$Image6 = Image.copy$default(((Image)signature2), 0, null, 0.0f, signatureMetaData4, 7, null);
                signatureUiState1 = SignatureUiState.copy$default(signatureUiState0, KDPhoto.copy-2Ycw6ww$default(signatureUiState0.getPhoto(), null, 0, null, 0L, false, 0, null, 0L, null, 0.0f, null, null, null, signature$Image6, 0x1FFF, null), null, null, null, false, null, null, null, signature$Image6, null, null, null, null, null, null, null, null, null, null, null, null, 0x1FFEFE, null);
                return signatureUiState1 == null ? signatureUiState0 : signatureUiState1;
            }
            if(!(signature2 instanceof Text)) {
                throw new NoWhenBranchMatchedException();
            }
            KDTracker.clickEvent$default(KDTracker.INSTANCE, "sign-tab", "text-tab", "text-resize", null, 8, null);
            Text signature$Text4 = Text.copy$default(((Text)signature2), 0, null, false, signatureMetaData4, 7, null);
            signatureUiState1 = SignatureUiState.copy$default(signatureUiState0, KDPhoto.copy-2Ycw6ww$default(signatureUiState0.getPhoto(), null, 0, null, 0L, false, 0, null, 0L, null, 0.0f, null, null, null, signature$Text4, 0x1FFF, null), null, null, null, false, null, null, null, null, signature$Text4, null, null, null, null, null, null, null, null, null, null, null, 0x1FFDFE, null);
            return signatureUiState1 == null ? signatureUiState0 : signatureUiState1;
        }
        if(Intrinsics.areEqual(signatureIntent0, RemoveSignature.INSTANCE)) {
            String s5 = signatureUiState0.getSelectedSignature() instanceof Text ? "text-tab" : "image_tab";
            KDTracker.clickEvent$default(KDTracker.INSTANCE, "sign-tab", s5, "deletesign", null, 8, null);
            Signature signature3 = signatureUiState0.getPhoto().getSignature();
            if(signature3 instanceof Image) {
                return SignatureUiState.copy$default(SignatureUiState.copy$default(signatureUiState0, null, null, null, null, false, null, null, None.INSTANCE, null, null, null, null, null, null, null, null, null, null, null, null, null, 0x1FFE7F, null), KDPhoto.copy-2Ycw6ww$default(signatureUiState0.getPhoto(), null, 0, null, 0L, false, 0, null, 0L, null, 0.0f, null, null, null, null, 0x1FFF, null), null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0x1FFFFE, null);
            }
            if(signature3 instanceof Text) {
                return SignatureUiState.copy$default(SignatureUiState.copy$default(signatureUiState0, null, null, null, null, false, null, null, None.INSTANCE, null, null, null, null, null, null, null, null, null, null, null, null, null, 0x1FFD7F, null), KDPhoto.copy-2Ycw6ww$default(signatureUiState0.getPhoto(), null, 0, null, 0L, false, 0, null, 0L, null, 0.0f, null, null, null, null, 0x1FFF, null), null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0x1FFFFE, null);
            }
            if(signature3 != null) {
                throw new NoWhenBranchMatchedException();
            }
            return SignatureUiState.copy$default(signatureUiState0, KDPhoto.copy-2Ycw6ww$default(signatureUiState0.getPhoto(), null, 0, null, 0L, false, 0, null, 0L, null, 0.0f, null, null, null, null, 0x1FFF, null), null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0x1FFFFE, null);
        }
        if(signatureIntent0 instanceof EditSignature) {
            Signature signature4 = ((EditSignature)signatureIntent0).getSignature();
            if(signature4 instanceof Text) {
                return SignatureUiState.copy$default(signatureUiState0, null, null, null, null, false, null, null, new TextEditor(((Text)signature4).getEditTextData(), ((Text)signature4).getWatermark(), new s(this, signatureUiState0), new t(this)), null, null, null, null, null, null, null, null, null, null, null, null, null, 0x1FFF7F, null);
            }
            if(signature4 instanceof Image) {
                this.sendEvent(ShowImageSelector.INSTANCE);
            }
            return signatureUiState0;
        }
        if(signatureIntent0 instanceof ChangeSignature) {
            Signature signature5 = ((ChangeSignature)signatureIntent0).getSignature();
            if(signature5 instanceof Image) {
                KDPhoto kDPhoto2 = KDPhoto.copy-2Ycw6ww$default(signatureUiState0.getPhoto(), null, 0, null, 0L, false, 0, null, 0L, null, 0.0f, null, null, null, ((ChangeSignature)signatureIntent0).getSignature(), 0x1FFF, null);
                Signature signature6 = ((ChangeSignature)signatureIntent0).getSignature();
                return SignatureUiState.copy$default(signatureUiState0, kDPhoto2, null, null, null, false, null, null, com.kakao.kandinsky.signature.contract.SignatureState.Image.INSTANCE, ((Image)signature6), null, null, null, null, null, null, null, null, null, null, null, null, 0x1FFE7E, null);
            }
            if(!(signature5 instanceof Text)) {
                throw new NoWhenBranchMatchedException();
            }
            KDPhoto kDPhoto3 = KDPhoto.copy-2Ycw6ww$default(signatureUiState0.getPhoto(), null, 0, null, 0L, false, 0, null, 0L, null, 0.0f, null, null, null, ((ChangeSignature)signatureIntent0).getSignature(), 0x1FFF, null);
            Signature signature7 = ((ChangeSignature)signatureIntent0).getSignature();
            return SignatureUiState.copy$default(signatureUiState0, kDPhoto3, null, null, null, false, null, null, com.kakao.kandinsky.signature.contract.SignatureState.Text.INSTANCE, null, ((Text)signature7), null, null, null, null, null, null, null, null, null, null, null, 0x1FFD7E, null);
        }
        if(signatureIntent0 instanceof DeleteHistory) {
            BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new u(this, signatureIntent0, null), 2, null);
            return signatureUiState0;
        }
        if(Intrinsics.areEqual(signatureIntent0, Cancel.INSTANCE)) {
            g0 g00 = new g0(this);
            if(signatureUiState0.getChanged()) {
                this.sendEvent(new ShowDialog(new DialogUiState(0, 0, g00, 3, null)));
                return signatureUiState0;
            }
            g00.invoke();
            return signatureUiState0;
        }
        if(Intrinsics.areEqual(signatureIntent0, OnClickConfirm.INSTANCE)) {
            Signature signature8 = signatureUiState0.getSelectedSignature();
            w w0 = new w(this, signatureUiState0);
            BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new h0(signature8, w0, this, null), 2, null);
            return signatureUiState0;
        }
        if(!Intrinsics.areEqual(signatureIntent0, OnClickMultipleConfirm.INSTANCE)) {
            throw new NoWhenBranchMatchedException();
        }
        Signature signature9 = signatureUiState0.getSelectedSignature();
        x x0 = new x(this, signatureUiState0);
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new h0(signature9, x0, this, null), 2, null);
        return signatureUiState0;
    }

    @Override  // com.kakao.kandinsky.base.KDMviViewModel
    public Object handleIntent(Object object0, Object object1) {
        return this.handleIntent(((SignatureUiState)object0), ((SignatureIntent)object1));
    }
}

