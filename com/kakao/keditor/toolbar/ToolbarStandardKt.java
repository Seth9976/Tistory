package com.kakao.keditor.toolbar;

import android.widget.ImageView;
import com.kakao.common.widget.ContentDescriptionKt;
import com.kakao.keditor.Keditor;
import com.kakao.keditor.R.drawable;
import com.kakao.keditor.R.string;
import com.kakao.keditor.plugin.attrs.Alignment.Center;
import com.kakao.keditor.plugin.attrs.Alignment.Justify;
import com.kakao.keditor.plugin.attrs.Alignment.Left;
import com.kakao.keditor.plugin.attrs.Alignment.Right;
import com.kakao.keditor.plugin.attrs.Alignment;
import com.kakao.keditor.plugin.attrs.item.MobileStyle;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001A\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001A\u0012\u0010\u0000\u001A\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001A\u00020\u0004\u001A\u0014\u0010\u0005\u001A\u00020\u0001*\u00020\u00022\b\u0010\u0006\u001A\u0004\u0018\u00010\u0007¨\u0006\b"}, d2 = {"setAlignment", "", "Landroid/widget/ImageView;", "alignment", "Lcom/kakao/keditor/plugin/attrs/Alignment;", "setMobileStyleVisible", "input", "Lcom/kakao/keditor/plugin/attrs/item/MobileStyle;", "keditor_release"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nToolbarStandard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ToolbarStandard.kt\ncom/kakao/keditor/toolbar/ToolbarStandardKt\n+ 2 Keditor.kt\ncom/kakao/keditor/Keditor\n*L\n1#1,40:1\n136#2,12:41\n*S KotlinDebug\n*F\n+ 1 ToolbarStandard.kt\ncom/kakao/keditor/toolbar/ToolbarStandardKt\n*L\n32#1:41,12\n*E\n"})
public final class ToolbarStandardKt {
    public static final void setAlignment(@NotNull ImageView imageView0, @NotNull Alignment alignment0) {
        int v1;
        int v;
        Intrinsics.checkNotNullParameter(imageView0, "<this>");
        Intrinsics.checkNotNullParameter(alignment0, "alignment");
        if(alignment0 instanceof Left) {
            v = drawable.ke_toolbar_btn_align_left;
        }
        else {
            if(alignment0 instanceof Center) {
                v = drawable.ke_toolbar_btn_align_center;
                goto label_13;
            }
            if(alignment0 instanceof Right) {
                v = drawable.ke_toolbar_btn_align_right;
            }
            else if(alignment0 instanceof Justify) {
                v = drawable.ke_toolbar_btn_align_justify;
            }
            else {
                throw new NoWhenBranchMatchedException();
            }
        }
    label_13:
        imageView0.setImageResource(v);
        if(alignment0 instanceof Left) {
            v1 = string.cd_align_type_left;
        }
        else {
            if(alignment0 instanceof Center) {
                v1 = string.cd_align_type_center;
                ContentDescriptionKt.setContentDescriptionWith(imageView0, v1, new Object[0]);
                return;
            }
            if(alignment0 instanceof Right) {
                v1 = string.cd_align_type_right;
            }
            else if(alignment0 instanceof Justify) {
                v1 = string.cd_align_type_justify;
            }
            else {
                throw new NoWhenBranchMatchedException();
            }
        }
        ContentDescriptionKt.setContentDescriptionWith(imageView0, v1, new Object[0]);
    }

    public static final void setMobileStyleVisible(@NotNull ImageView imageView0, @Nullable MobileStyle mobileStyle0) {
        Intrinsics.checkNotNullParameter(imageView0, "<this>");
        if(mobileStyle0 != null) {
            Object object0 = Keditor.INSTANCE.getConfig().get("image_style");
            String[] arr_s = null;
            if(!(object0 instanceof String[])) {
                object0 = null;
            }
            if(((String[])object0) != null) {
                arr_s = (String[])object0;
            }
            if(arr_s != null) {
                imageView0.setVisibility((arr_s.length <= 1 || ArraysKt___ArraysKt.contains(arr_s, mobileStyle0.getStr()) ? 8 : 0));
            }
        }
    }
}

