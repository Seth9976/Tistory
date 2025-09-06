package com.kakao.keditor.toolbar;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;
import com.kakao.common.widget.ContentDescriptionKt;
import com.kakao.keditor.R.dimen;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J-\u0010\u0003\u001A\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001A\u00020\u00062\n\b\u0001\u0010\u0007\u001A\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001A\u0004\u0018\u00010\b¢\u0006\u0002\u0010\nJ-\u0010\u000B\u001A\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001A\u00020\u00062\n\b\u0001\u0010\u0007\u001A\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001A\u0004\u0018\u00010\b¢\u0006\u0002\u0010\n¨\u0006\f"}, d2 = {"Lcom/kakao/keditor/toolbar/ToolbarIconFactory;", "", "()V", "createContextMenuIcon", "Landroid/view/View;", "context", "Landroid/content/Context;", "src", "", "desc", "(Landroid/content/Context;Ljava/lang/Integer;Ljava/lang/Integer;)Landroid/view/View;", "createMoreMenuIcon", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class ToolbarIconFactory {
    @NotNull
    public static final ToolbarIconFactory INSTANCE;

    static {
        ToolbarIconFactory.INSTANCE = new ToolbarIconFactory();
    }

    @Nullable
    public final View createContextMenuIcon(@NotNull Context context0, @DrawableRes @Nullable Integer integer0, @StringRes @Nullable Integer integer1) {
        Intrinsics.checkNotNullParameter(context0, "context");
        if(integer0 == null) {
            return null;
        }
        int v = context0.getResources().getDimensionPixelSize(dimen.ke_toolbar_menu_size);
        int v1 = context0.getResources().getDimensionPixelSize(dimen.ke_toolbar_menu_margin);
        View view0 = new ImageView(context0);
        ((ImageView)view0).setImageResource(((int)integer0));
        LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(v, v);
        linearLayout$LayoutParams0.leftMargin = v1;
        linearLayout$LayoutParams0.rightMargin = v1;
        view0.setLayoutParams(linearLayout$LayoutParams0);
        if(integer1 != null) {
            ContentDescriptionKt.setContentDescriptionWith(view0, ((int)integer1), new Object[0]);
        }
        return view0;
    }

    @Nullable
    public final View createMoreMenuIcon(@NotNull Context context0, @DrawableRes @Nullable Integer integer0, @StringRes @Nullable Integer integer1) {
        Intrinsics.checkNotNullParameter(context0, "context");
        if(integer0 == null) {
            return null;
        }
        int v = context0.getResources().getDimensionPixelSize(dimen.ke_toolbar_overlay_item_thumbnail_size);
        View view0 = new ImageView(context0);
        ((ImageView)view0).setImageResource(((int)integer0));
        view0.setLayoutParams(new LinearLayout.LayoutParams(v, v));
        return view0;
    }
}

