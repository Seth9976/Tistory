package com.kakao.tistory.presentation.view.bottomsheet;

import androidx.compose.runtime.internal.StabilityInferred;
import com.kakao.android.base.BaseKt;
import com.kakao.tistory.domain.entity.SortItem.ImageSettingSortItem;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.view.common.bottomsheet.CommonBottomDialogFragment;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sd.a;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00032\u00020\u0001:\u0002\u0003\u0004B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0005"}, d2 = {"Lcom/kakao/tistory/presentation/view/bottomsheet/ImageSettingDialogFragment;", "Lcom/kakao/tistory/presentation/view/common/bottomsheet/CommonBottomDialogFragment;", "()V", "Companion", "ImageSettingMenuType", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class ImageSettingDialogFragment extends CommonBottomDialogFragment {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\r\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/kakao/tistory/presentation/view/bottomsheet/ImageSettingDialogFragment$Companion;", "", "Lcom/kakao/tistory/presentation/view/bottomsheet/ImageSettingDialogFragment;", "newInstance", "()Lcom/kakao/tistory/presentation/view/bottomsheet/ImageSettingDialogFragment;", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final ImageSettingDialogFragment newInstance() {
            return new ImageSettingDialogFragment();
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000E\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0007\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001A\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001A\u0004\b\u000B\u0010\fj\u0002\b\u000Ej\u0002\b\u000F¨\u0006\u0010"}, d2 = {"Lcom/kakao/tistory/presentation/view/bottomsheet/ImageSettingDialogFragment$ImageSettingMenuType;", "", "", "a", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "value", "", "b", "I", "getTitleResourceId", "()I", "titleResourceId", "GALLERY", "DELETE", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static enum ImageSettingMenuType {
        GALLERY("gallery", string.label_blog_setting_bottom_dialog_gallery),
        DELETE("delete", string.label_blog_setting_bottom_dialog_delete_image);

        public final String a;
        public final int b;
        public static final ImageSettingMenuType[] c;
        public static final EnumEntries d;

        static {
            ImageSettingMenuType.c = arr_imageSettingDialogFragment$ImageSettingMenuType;
            Intrinsics.checkNotNullParameter(arr_imageSettingDialogFragment$ImageSettingMenuType, "entries");
            ImageSettingMenuType.d = new a(arr_imageSettingDialogFragment$ImageSettingMenuType);
        }

        public ImageSettingMenuType(String s1, int v1) {
            this.a = s1;
            this.b = v1;
        }

        @NotNull
        public static EnumEntries getEntries() {
            return ImageSettingMenuType.d;
        }

        public final int getTitleResourceId() {
            return this.b;
        }

        @NotNull
        public final String getValue() {
            return this.a;
        }
    }

    public static final int $stable;
    @NotNull
    public static final Companion Companion;

    static {
        ImageSettingDialogFragment.Companion = new Companion(null);
    }

    public ImageSettingDialogFragment() {
        ImageSettingMenuType[] arr_imageSettingDialogFragment$ImageSettingMenuType = ImageSettingMenuType.values();
        for(int v = 0; v < arr_imageSettingDialogFragment$ImageSettingMenuType.length; ++v) {
            ImageSettingMenuType imageSettingDialogFragment$ImageSettingMenuType0 = arr_imageSettingDialogFragment$ImageSettingMenuType[v];
            String s = BaseKt.getAppContext().getString(imageSettingDialogFragment$ImageSettingMenuType0.getTitleResourceId());
            Intrinsics.checkNotNullExpressionValue(s, "getString(...)");
            this.getItems().add(new ImageSettingSortItem(imageSettingDialogFragment$ImageSettingMenuType0.getValue(), s));
        }
    }
}

