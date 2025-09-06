package com.kakao.keditor.standard;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.FrameLayout.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.IdRes;
import androidx.databinding.BindingAdapter;
import com.kakao.common.widget.ContentDescriptionKt;
import com.kakao.keditor.plugin.attrs.Alignment;
import com.kakao.keditor.plugin.attrs.item.Aligned;
import com.kakao.keditor.plugin.attrs.item.MobileStyle;
import com.kakao.keditor.toolbar.ToolbarStandardKt;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u000E\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\b\u00C6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00A2\u0006\u0002\u0010\u0002J\u001A\u0010\u0003\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u00062\b\u0010\u0003\u001A\u0004\u0018\u00010\u0007H\u0007J1\u0010\b\u001A\u00020\u00042\u0006\u0010\t\u001A\u00020\n2\u0006\u0010\u000B\u001A\u00020\f2\b\u0010\r\u001A\u0004\u0018\u00010\u000E2\b\u0010\u000F\u001A\u0004\u0018\u00010\fH\u0007\u00A2\u0006\u0002\u0010\u0010J\u001F\u0010\u0011\u001A\u00020\u00042\u0006\u0010\t\u001A\u00020\n2\b\u0010\u0012\u001A\u0004\u0018\u00010\fH\u0007\u00A2\u0006\u0002\u0010\u0013J\u001F\u0010\u0014\u001A\u00020\u00042\u0006\u0010\t\u001A\u00020\n2\b\u0010\u0012\u001A\u0004\u0018\u00010\fH\u0007\u00A2\u0006\u0002\u0010\u0013J\u001A\u0010\u0015\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u00062\b\u0010\u0016\u001A\u0004\u0018\u00010\u0017H\u0007J\u0018\u0010\u0018\u001A\u00020\u00042\u0006\u0010\t\u001A\u00020\n2\u0006\u0010\u0019\u001A\u00020\u001AH\u0007J,\u0010\u001B\u001A\u00020\u00042\u0006\u0010\t\u001A\u00020\n2\u0006\u0010\u001C\u001A\u00020\u001D2\b\u0010\u001E\u001A\u0004\u0018\u00010\u000E2\b\u0010\u001F\u001A\u0004\u0018\u00010\u000EH\u0007J,\u0010\u001B\u001A\u00020\u00042\u0006\u0010\t\u001A\u00020\n2\u0006\u0010 \u001A\u00020\u000E2\b\u0010\u001E\u001A\u0004\u0018\u00010\u000E2\b\u0010\u001F\u001A\u0004\u0018\u00010\u000EH\u0007J\u001A\u0010!\u001A\u00020\u00042\u0006\u0010\t\u001A\u00020\n2\b\b\u0001\u0010\"\u001A\u00020\u001DH\u0007J\u0018\u0010#\u001A\u00020\u00042\u0006\u0010\t\u001A\u00020\n2\u0006\u0010$\u001A\u00020\fH\u0007J\u0018\u0010%\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010&\u001A\u00020\u001DH\u0007J\u0018\u0010\'\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\u0019\u001A\u00020\u001AH\u0007J\u0014\u0010(\u001A\u00020\u0004*\u00020\n2\u0006\u0010)\u001A\u00020*H\u0007\u00A8\u0006+"}, d2 = {"Lcom/kakao/keditor/standard/BindingAdapters;", "", "()V", "alignment", "", "imageView", "Landroid/widget/ImageView;", "Lcom/kakao/keditor/plugin/attrs/Alignment;", "applyAccessibilityInfo", "view", "Landroid/view/View;", "isButton", "", "hint", "", "talkBackIsSelected", "(Landroid/view/View;ZLjava/lang/String;Ljava/lang/Boolean;)V", "goneUnless", "visible", "(Landroid/view/View;Ljava/lang/Boolean;)V", "invisibleUnless", "mobileStyleVisible", "mobileStyle", "Lcom/kakao/keditor/plugin/attrs/item/MobileStyle;", "setBackgroundSrcDrawable", "drawable", "Landroid/graphics/drawable/Drawable;", "setContentDescriptionWith", "templateResId", "", "arg", "extra", "template", "setRuntimeId", "id", "setSelected", "selected", "setSrc", "resId", "setSrcDrawable", "setAlign", "aligned", "Lcom/kakao/keditor/plugin/attrs/item/Aligned;", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class BindingAdapters {
    @NotNull
    public static final BindingAdapters INSTANCE;

    static {
        BindingAdapters.INSTANCE = new BindingAdapters();
    }

    @BindingAdapter({"alignment"})
    @JvmStatic
    public static final void alignment(@NotNull ImageView imageView0, @Nullable Alignment alignment0) {
        Intrinsics.checkNotNullParameter(imageView0, "imageView");
        if(alignment0 != null) {
            ToolbarStandardKt.setAlignment(imageView0, alignment0);
        }
    }

    @BindingAdapter(requireAll = false, value = {"isButton", "talkBackHint", "talkBackIsSelected"})
    @JvmStatic
    public static final void applyAccessibilityInfo(@NotNull View view0, boolean z, @Nullable String s, @Nullable Boolean boolean0) {
        Intrinsics.checkNotNullParameter(view0, "view");
        if(z) {
            ContentDescriptionKt.applyAccessibilityInfo$default(view0, Reflection.getOrCreateKotlinClass(Button.class), s, null, null, boolean0, 12, null);
            return;
        }
        ContentDescriptionKt.applyAccessibilityInfo$default(view0, null, s, null, null, boolean0, 13, null);
    }

    @BindingAdapter({"goneUnless"})
    @JvmStatic
    public static final void goneUnless(@NotNull View view0, @Nullable Boolean boolean0) {
        Intrinsics.checkNotNullParameter(view0, "view");
        view0.setVisibility((Intrinsics.areEqual(boolean0, Boolean.TRUE) ? 0 : 8));
    }

    @BindingAdapter({"invisibleUnless"})
    @JvmStatic
    public static final void invisibleUnless(@NotNull View view0, @Nullable Boolean boolean0) {
        Intrinsics.checkNotNullParameter(view0, "view");
        view0.setVisibility((Intrinsics.areEqual(boolean0, Boolean.TRUE) ? 0 : 4));
    }

    @BindingAdapter({"mobileStyleVisible"})
    @JvmStatic
    public static final void mobileStyleVisible(@NotNull ImageView imageView0, @Nullable MobileStyle mobileStyle0) {
        Intrinsics.checkNotNullParameter(imageView0, "imageView");
        ToolbarStandardKt.setMobileStyleVisible(imageView0, mobileStyle0);
    }

    @BindingAdapter({"setAlign"})
    @JvmStatic
    public static final void setAlign(@NotNull View view0, @NotNull Aligned aligned0) {
        Intrinsics.checkNotNullParameter(view0, "<this>");
        Intrinsics.checkNotNullParameter(aligned0, "aligned");
        if(view0.getParent() instanceof FrameLayout) {
            ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0.getLayoutParams();
            Intrinsics.checkNotNull(viewGroup$LayoutParams0, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            ((FrameLayout.LayoutParams)viewGroup$LayoutParams0).gravity = aligned0.getAlignment().toGravity();
            view0.requestLayout();
        }
    }

    @BindingAdapter({"backgroundDrawable"})
    @JvmStatic
    public static final void setBackgroundSrcDrawable(@NotNull View view0, @NotNull Drawable drawable0) {
        Intrinsics.checkNotNullParameter(view0, "view");
        Intrinsics.checkNotNullParameter(drawable0, "drawable");
        view0.setBackgroundDrawable(drawable0);
    }

    @BindingAdapter(requireAll = false, value = {"talkBack", "talkBackArgs", "talkBackExtra"})
    @JvmStatic
    public static final void setContentDescriptionWith(@NotNull View view0, int v, @Nullable String s, @Nullable String s1) {
        Intrinsics.checkNotNullParameter(view0, "view");
        ContentDescriptionKt.setContentDescriptionWith(view0, v, new Object[]{s, s1});
    }

    @BindingAdapter(requireAll = false, value = {"talkBack", "talkBackArgs", "talkBackExtra"})
    @JvmStatic
    public static final void setContentDescriptionWith(@NotNull View view0, @NotNull String s, @Nullable String s1, @Nullable String s2) {
        Intrinsics.checkNotNullParameter(view0, "view");
        Intrinsics.checkNotNullParameter(s, "template");
        ContentDescriptionKt.setContentDescriptionWith(view0, s, new Object[]{s1, s2});
    }

    @BindingAdapter({"runtimeId"})
    @JvmStatic
    public static final void setRuntimeId(@NotNull View view0, @IdRes int v) {
        Intrinsics.checkNotNullParameter(view0, "view");
        view0.setId(v);
    }

    @BindingAdapter({"isSelected"})
    @JvmStatic
    public static final void setSelected(@NotNull View view0, boolean z) {
        Intrinsics.checkNotNullParameter(view0, "view");
        view0.setSelected(z);
    }

    @BindingAdapter({"imageSrc"})
    @JvmStatic
    public static final void setSrc(@NotNull ImageView imageView0, int v) {
        Intrinsics.checkNotNullParameter(imageView0, "imageView");
        imageView0.setImageResource(v);
    }

    @BindingAdapter({"imageDrawable"})
    @JvmStatic
    public static final void setSrcDrawable(@NotNull ImageView imageView0, @NotNull Drawable drawable0) {
        Intrinsics.checkNotNullParameter(imageView0, "imageView");
        Intrinsics.checkNotNullParameter(drawable0, "drawable");
        imageView0.setImageDrawable(drawable0);
    }
}

