package com.kakao.kandinsky.text;

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
import com.kakao.kandinsky.core.kdphoto.Text;
import com.kakao.kandinsky.core.kdphoto.TextData;
import com.kakao.kandinsky.decoration.DecorationControllerInterface.DefaultImpls;
import com.kakao.kandinsky.decoration.DecorationControllerInterface;
import com.kakao.kandinsky.designsystem.util.MatrixTransformKt;
import com.kakao.kandinsky.designsystem.util.OffsetExtensionKt;
import com.kakao.kandinsky.designsystem.util.Transform;
import com.kakao.kandinsky.text.contract.TextIntent.Cancel;
import com.kakao.kandinsky.text.contract.TextIntent.ChangeModeToControl;
import com.kakao.kandinsky.text.contract.TextIntent.ChangeModeToInput;
import com.kakao.kandinsky.text.contract.TextIntent.Confirm;
import com.kakao.kandinsky.text.contract.TextIntent.Init;
import com.kakao.kandinsky.text.contract.TextIntent.MoveSelectDeco;
import com.kakao.kandinsky.text.contract.TextIntent.RemoveAllDeco;
import com.kakao.kandinsky.text.contract.TextIntent.RemoveSelectDeco;
import com.kakao.kandinsky.text.contract.TextIntent.ScaleNRotateSelectDeco;
import com.kakao.kandinsky.text.contract.TextIntent.SelectDecoText;
import com.kakao.kandinsky.text.contract.TextIntent.UpdateContentBounds;
import com.kakao.kandinsky.text.contract.TextIntent.UpdatePhoto;
import com.kakao.kandinsky.text.contract.TextIntent.UpdateTextData;
import com.kakao.kandinsky.text.contract.TextIntent;
import com.kakao.kandinsky.text.contract.TextMode.Control;
import com.kakao.kandinsky.text.contract.TextMode.Input;
import com.kakao.kandinsky.text.contract.TextUiState;
import com.kakao.kandinsky.textedit.contract.FontData;
import com.kakao.kandinsky.utils.Logger;
import com.kakao.kandinsky.utils.MatrixExtensionKt;
import com.kakao.kandinsky.utils.MatrixValues;
import com.kakao.kandinsky.utils.MatrixValuesKt;
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
import kotlinx.collections.immutable.ExtensionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import za.b;
import za.c;
import za.d;
import za.e;
import za.f;
import za.g;
import za.h;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001F\u0010\t\u001A\u00020\u00022\u0006\u0010\u0007\u001A\u00020\u00022\u0006\u0010\b\u001A\u00020\u0003H\u0014¢\u0006\u0004\b\t\u0010\nR\u001D\u0010\u0011\u001A\b\u0012\u0004\u0012\u00020\f0\u000B8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000E\u001A\u0004\b\u000F\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/kakao/kandinsky/text/TextViewModel;", "Lcom/kakao/kandinsky/base/KDMviViewModel;", "Lcom/kakao/kandinsky/text/contract/TextUiState;", "Lcom/kakao/kandinsky/text/contract/TextIntent;", "Lcom/kakao/kandinsky/base/contract/KDEvent;", "<init>", "()V", "current", "intent", "handleIntent", "(Lcom/kakao/kandinsky/text/contract/TextUiState;Lcom/kakao/kandinsky/text/contract/TextIntent;)Lcom/kakao/kandinsky/text/contract/TextUiState;", "Lcom/kakao/kandinsky/decoration/DecorationControllerInterface;", "Lcom/kakao/kandinsky/core/kdphoto/Text;", "L0", "Lcom/kakao/kandinsky/decoration/DecorationControllerInterface;", "getController", "()Lcom/kakao/kandinsky/decoration/DecorationControllerInterface;", "controller", "text_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nTextViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextViewModel.kt\ncom/kakao/kandinsky/text/TextViewModel\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,263:1\n125#2:264\n152#2,3:265\n288#3,2:268\n800#3,11:270\n819#3:281\n847#3,2:282\n*S KotlinDebug\n*F\n+ 1 TextViewModel.kt\ncom/kakao/kandinsky/text/TextViewModel\n*L\n64#1:264\n64#1:265,3\n91#1:268,2\n111#1:270,11\n213#1:281\n213#1:282,2\n*E\n"})
public final class TextViewModel extends KDMviViewModel {
    public static final int $stable;
    public final com.kakao.kandinsky.text.TextViewModel.controller.1 L0;

    @Inject
    public TextViewModel() {
        super(new TextUiState(null, null, null, null, null, null, null, null, null, null, null, null, null, 0x1FFF, null));
        this.L0 = new DecorationControllerInterface() {
            public final TextViewModel a;

            {
                this.a = textViewModel0;
            }

            @Override  // com.kakao.kandinsky.decoration.DecorationControllerInterface
            public boolean isInDisplayRect-v05aCt0(long v, @NotNull Rect rect0, @NotNull Matrix matrix0, long v1) {
                return DefaultImpls.isInDisplayRect-v05aCt0(this, v, rect0, matrix0, v1);
            }

            @Override  // com.kakao.kandinsky.decoration.DecorationControllerInterface
            public void onClickEmptyArea-k-4lQ0M(long v) {
            }

            public void onDelete(@NotNull Text text0) {
                Intrinsics.checkNotNullParameter(text0, "decoration");
                RemoveSelectDeco textIntent$RemoveSelectDeco0 = new RemoveSelectDeco(text0);
                this.a.sendIntent(textIntent$RemoveSelectDeco0);
            }

            @Override  // com.kakao.kandinsky.decoration.DecorationControllerInterface
            public void onDelete(Object object0) {
                this.onDelete(((Text)object0));
            }

            public void onDrag-Uv8p0NA(@NotNull Text text0, long v) {
                Intrinsics.checkNotNullParameter(text0, "decoration");
                MoveSelectDeco textIntent$MoveSelectDeco0 = new MoveSelectDeco(text0, v, null);
                this.a.sendIntent(textIntent$MoveSelectDeco0);
            }

            @Override  // com.kakao.kandinsky.decoration.DecorationControllerInterface
            public void onDrag-Uv8p0NA(Object object0, long v) {
                this.onDrag-Uv8p0NA(((Text)object0), v);
            }

            public void onOutOfImage(@NotNull Text text0) {
                Intrinsics.checkNotNullParameter(text0, "decoration");
                this.onDelete(text0);
            }

            @Override  // com.kakao.kandinsky.decoration.DecorationControllerInterface
            public void onOutOfImage(Object object0) {
                this.onOutOfImage(((Text)object0));
            }

            public void onPress(@Nullable Text text0) {
                SelectDecoText textIntent$SelectDecoText0 = new SelectDecoText(text0);
                this.a.sendIntent(textIntent$SelectDecoText0);
            }

            @Override  // com.kakao.kandinsky.decoration.DecorationControllerInterface
            public void onPress(Object object0) {
                this.onPress(((Text)object0));
            }

            public void onScaleAndRotate-12SF9DM(@NotNull Text text0, long v, @NotNull Matrix matrix0) {
                Intrinsics.checkNotNullParameter(text0, "decoration");
                Intrinsics.checkNotNullParameter(matrix0, "matrix");
                ScaleNRotateSelectDeco textIntent$ScaleNRotateSelectDeco0 = new ScaleNRotateSelectDeco(text0, v, matrix0, null);
                this.a.sendIntent(textIntent$ScaleNRotateSelectDeco0);
            }

            @Override  // com.kakao.kandinsky.decoration.DecorationControllerInterface
            public void onScaleAndRotate-12SF9DM(Object object0, long v, Matrix matrix0) {
                this.onScaleAndRotate-12SF9DM(((Text)object0), v, matrix0);
            }

            public void onTap(@NotNull Text text0) {
                Intrinsics.checkNotNullParameter(text0, "decoration");
                ChangeModeToInput textIntent$ChangeModeToInput0 = new ChangeModeToInput(false);
                this.a.sendIntent(textIntent$ChangeModeToInput0);
            }

            @Override  // com.kakao.kandinsky.decoration.DecorationControllerInterface
            public void onTap(Object object0) {
                this.onTap(((Text)object0));
            }
        };
    }

    // 去混淆评级： 低(40)
    public static TextData a(TextUiState textUiState0) {
        FontData fontData0 = (FontData)CollectionsKt___CollectionsKt.firstOrNull(textUiState0.getFonts());
        return fontData0 == null ? new TextData("", 0xFFFFFFFF00000000L, 100.0f, 0xFF17171700000000L, 0.0f, 0L, 0L, false, false, false, 0, null, 0.0f, 0.0f, 0x37E0, null) : new TextData("", 0xFFFFFFFF00000000L, 100.0f, 0xFF17171700000000L, 0.0f, 0L, 0L, false, false, false, 0, fontData0.getResource(), 0.0f, 0.0f, 0x37E0, null);
    }

    @NotNull
    public final DecorationControllerInterface getController() {
        return this.L0;
    }

    @NotNull
    public TextUiState handleIntent(@NotNull TextUiState textUiState0, @NotNull TextIntent textIntent0) {
        Text text2;
        Text text0;
        Object object0 = null;
        Intrinsics.checkNotNullParameter(textUiState0, "current");
        Intrinsics.checkNotNullParameter(textIntent0, "intent");
        if(textIntent0 instanceof Init) {
            List list0 = k.createListBuilder();
            if(((Init)textIntent0).getAllowSystemFont()) {
                list0.add(FontData.Companion.getSYSTEM_FONT());
            }
            Map map0 = ((Init)textIntent0).getFontResources();
            ArrayList arrayList0 = new ArrayList(map0.size());
            for(Object object1: map0.entrySet()) {
                arrayList0.add(new FontData(((String)((Map.Entry)object1).getKey()), ((Integer)((Map.Entry)object1).getValue())));
            }
            list0.addAll(arrayList0);
            List list1 = k.build(list0);
            return TextUiState.copy$default(textUiState0, null, null, null, null, new b(this), list1, null, new c(this), new d(this), new e(this), new f(this), new g(this), new h(this), 0x4F, null);
        }
        if(textIntent0 instanceof UpdatePhoto) {
            for(Object object2: ((UpdatePhoto)textIntent0).getPhoto().getDecorationList()) {
                if(((Absolute)object2) instanceof Text) {
                    object0 = object2;
                    break;
                }
                if(false) {
                    break;
                }
            }
            KDPhoto kDPhoto0 = ((UpdatePhoto)textIntent0).getPhoto();
            KDPhoto kDPhoto1 = ((UpdatePhoto)textIntent0).getPhoto();
            return object0 == null ? TextUiState.copy$default(textUiState0, kDPhoto0, null, kDPhoto1, null, null, null, Control.INSTANCE, null, null, null, null, null, null, 0x1FBA, null) : TextUiState.copy$default(textUiState0, kDPhoto0, null, kDPhoto1, null, null, null, new Input(TextViewModel.a(textUiState0)), null, null, null, null, null, null, 0x1FBA, null);
        }
        if(textIntent0 instanceof UpdateContentBounds) {
            return TextUiState.copy$default(textUiState0, null, null, null, ((UpdateContentBounds)textIntent0).getBounds(), null, null, null, null, null, null, null, null, null, 0x1FF7, null);
        }
        if(textIntent0 instanceof ChangeModeToInput) {
            String s = ((ChangeModeToInput)textIntent0).getNew() ? "addtext" : "text-edit";
            KDTracker.clickEvent$default(KDTracker.INSTANCE, "text-tab", s, null, null, 12, null);
            if(((ChangeModeToInput)textIntent0).getNew()) {
                text0 = null;
            }
            else {
                text0 = textUiState0.getSelectedText();
                if(text0 == null) {
                    ArrayList arrayList1 = new ArrayList();
                    for(Object object3: textUiState0.getPhoto().getDecorationList()) {
                        if(object3 instanceof Text) {
                            arrayList1.add(object3);
                        }
                    }
                    text0 = (Text)CollectionsKt___CollectionsKt.lastOrNull(arrayList1);
                }
            }
            Integer integer0 = text0 == null ? null : text0.getNo();
            if(text0 != null) {
                TextData textData0 = text0.getTextData();
                return textData0 == null ? TextUiState.copy$default(textUiState0, null, integer0, null, null, null, null, new Input(TextViewModel.a(textUiState0)), null, null, null, null, null, null, 0x1FBD, null) : TextUiState.copy$default(textUiState0, null, integer0, null, null, null, null, new Input(textData0), null, null, null, null, null, null, 0x1FBD, null);
            }
            return TextUiState.copy$default(textUiState0, null, integer0, null, null, null, null, new Input(TextViewModel.a(textUiState0)), null, null, null, null, null, null, 0x1FBD, null);
        }
        if(textIntent0 instanceof ChangeModeToControl) {
            return TextUiState.copy$default(textUiState0, null, null, null, null, null, null, Control.INSTANCE, null, null, null, null, null, null, 0x1FBF, null);
        }
        if(textIntent0 instanceof UpdateTextData) {
            TextData textData1 = ((UpdateTextData)textIntent0).getData();
            Logger.INSTANCE.log("update text data " + textData1);
            TextData textData2 = ((UpdateTextData)textIntent0).getData();
            Text text1 = textUiState0.getSelectedText();
            if(text1 != null && textData2 != null) {
                float f = Size.getWidth-impl(text1.getSize-NH-jbRc());
                float f1 = Size.getWidth-impl(text1.getTextData().getBoundsSize-NH-jbRc());
                text2 = Text.copy-FXPwcMo$default(text1, 0, null, Size.times-7Ah8Wj8(textData2.getBoundsSize-NH-jbRc(), f / f1), textData2, 3, null);
            }
            else if(text1 != null) {
                text2 = null;
            }
            else if(textData2 != null) {
                KDPhoto kDPhoto2 = textUiState0.getPhoto();
                float f2 = Size.getWidth-impl(kDPhoto2.getCropSize-NH-jbRc());
                int v = kDPhoto2.getNewDecoNo();
                long v1 = kDPhoto2.getCropCenter-F1C5BW0();
                Matrix matrix0 = kDPhoto2.getMatrix();
                matrix0.postTranslate(-Offset.getX-impl(v1), -Offset.getY-impl(v1));
                Matrix matrix1 = new Matrix();
                matrix0.invert(matrix1);
                text2 = new Text(v, MatrixValuesKt.getMatrixValues(matrix1), Size.times-7Ah8Wj8(textData2.getBoundsSize-NH-jbRc(), f2 / 1000.0f), textData2, null);
            }
            else {
                text2 = null;
            }
            KDPhoto kDPhoto3 = KDPhotoKt.updateDecoration(textUiState0.getPhoto(), (text2 == null ? null : text2.getNo()), text2);
            return text2 == null ? TextUiState.copy$default(textUiState0, kDPhoto3, null, null, null, null, null, null, null, null, null, null, null, null, 0x1FFC, null) : TextUiState.copy$default(textUiState0, kDPhoto3, text2.getNo(), null, null, null, null, null, null, null, null, null, null, null, 0x1FFC, null);
        }
        if(textIntent0 instanceof SelectDecoText) {
            Text text3 = ((SelectDecoText)textIntent0).getText();
            KDPhoto kDPhoto4 = KDPhotoKt.updateDecoration(textUiState0.getPhoto(), (text3 == null ? null : text3.getNo()), ((SelectDecoText)textIntent0).getText());
            Text text4 = ((SelectDecoText)textIntent0).getText();
            return text4 == null ? TextUiState.copy$default(textUiState0, kDPhoto4, null, null, null, null, null, null, null, null, null, null, null, null, 0x1FFC, null) : TextUiState.copy$default(textUiState0, kDPhoto4, text4.getNo(), null, null, null, null, null, null, null, null, null, null, null, 0x1FFC, null);
        }
        if(textIntent0 instanceof RemoveSelectDeco) {
            KDTracker.clickEvent$default(KDTracker.INSTANCE, "text-tab", "deletetext", null, null, 12, null);
            return TextUiState.copy$default(textUiState0, KDPhotoKt.updateDecoration(textUiState0.getPhoto(), ((RemoveSelectDeco)textIntent0).getText().getNo(), null), null, null, null, null, null, null, null, null, null, null, null, null, 0x1FFE, null);
        }
        if(textIntent0 instanceof MoveSelectDeco) {
            Text text5 = ((MoveSelectDeco)textIntent0).getText();
            long v2 = ((MoveSelectDeco)textIntent0).getOffset-F1C5BW0();
            return TextUiState.copy$default(textUiState0, KDPhotoKt.updateDecoration(textUiState0.getPhoto(), text5.getNo(), Text.copy-FXPwcMo$default(text5, 0, MatrixValuesKt.getMatrixValues(MatrixExtensionKt.buildMatrix(text5.getMatrix(), new aa.c(v2, 3))), 0L, null, 13, null)), null, null, null, null, null, null, null, null, null, null, null, null, 0x1FFE, null);
        }
        if(textIntent0 instanceof ScaleNRotateSelectDeco) {
            KDTracker.clickEvent$default(KDTracker.INSTANCE, "text-tab", "text-resize", null, null, 12, null);
            Text text6 = ((ScaleNRotateSelectDeco)textIntent0).getText();
            Matrix matrix2 = ((ScaleNRotateSelectDeco)textIntent0).getMatrix();
            long v3 = SizeKt.Size(Offset.getDistance-impl(OffsetExtensionKt.mapVector-Uv8p0NA(matrix2, OffsetKt.Offset(Size.getWidth-impl(((ScaleNRotateSelectDeco)textIntent0).getSize-NH-jbRc()), 0.0f))), Offset.getDistance-impl(OffsetExtensionKt.mapVector-Uv8p0NA(matrix2, OffsetKt.Offset(0.0f, Size.getHeight-impl(((ScaleNRotateSelectDeco)textIntent0).getSize-NH-jbRc())))));
            Transform transform0 = MatrixTransformKt.getTransform(matrix2);
            Text text7 = Text.copy-FXPwcMo$default(text6, 0, MatrixValuesKt.getMatrixValues(Transform.copy$default(transform0, ((float)MatrixValues.get-impl(text6.getMatrixValues-pp_Gbr8(), 2)), ((float)MatrixValues.get-impl(text6.getMatrixValues-pp_Gbr8(), 5)), 0.0f, (Float.compare(transform0.getScaleX(), 0.0f) >= 0 ? 1.0f : -1.0f), (transform0.getScaleY() < 0.0f ? -1.0f : 1.0f), 4, null).getMatrix()), v3, null, 9, null);
            return TextUiState.copy$default(textUiState0, KDPhotoKt.updateDecoration(textUiState0.getPhoto(), text7.getNo(), text7), text7.getNo(), null, null, null, null, null, null, null, null, null, null, null, 0x1FFC, null);
        }
        if(Intrinsics.areEqual(textIntent0, RemoveAllDeco.INSTANCE)) {
            KDTracker.clickEvent$default(KDTracker.INSTANCE, "text-tab", "removeall", null, null, 12, null);
            KDPhoto kDPhoto5 = textUiState0.getPhoto();
            ArrayList arrayList2 = new ArrayList();
            for(Object object4: kDPhoto5.getDecorationList()) {
                if(!(((Absolute)object4) instanceof Text)) {
                    arrayList2.add(object4);
                }
            }
            return TextUiState.copy$default(textUiState0, KDPhoto.copy-2Ycw6ww$default(kDPhoto5, null, 0, null, 0L, false, 0, null, 0L, null, 0.0f, null, ExtensionsKt.toPersistentList(arrayList2), null, null, 0x37FF, null), null, null, null, null, null, null, null, null, null, null, null, null, 0x1FFC, null);
        }
        if(Intrinsics.areEqual(textIntent0, Cancel.INSTANCE)) {
            this.cancel(this, textUiState0.getChanged());
            return textUiState0;
        }
        if(!(textIntent0 instanceof Confirm)) {
            throw new NoWhenBranchMatchedException();
        }
        this.sendEvent(new UpdateConfirm(textUiState0.getPhoto()));
        this.sendEvent(new Go(Destination.HOME));
        return textUiState0;
    }

    @Override  // com.kakao.kandinsky.base.KDMviViewModel
    public Object handleIntent(Object object0, Object object1) {
        return this.handleIntent(((TextUiState)object0), ((TextIntent)object1));
    }
}

