package com.google.android.material.internal;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.core.c;
import java.util.ArrayList;
import java.util.Collections;

@RestrictTo({Scope.LIBRARY})
public class ToolbarUtils {
    public static final c a;

    static {
        ToolbarUtils.a = new c(7);
    }

    public static ArrayList a(Toolbar toolbar0, CharSequence charSequence0) {
        ArrayList arrayList0 = new ArrayList();
        for(int v = 0; v < toolbar0.getChildCount(); ++v) {
            View view0 = toolbar0.getChildAt(v);
            if(view0 instanceof TextView && TextUtils.equals(((TextView)view0).getText(), charSequence0)) {
                arrayList0.add(((TextView)view0));
            }
        }
        return arrayList0;
    }

    @Nullable
    public static ActionMenuItemView getActionMenuItemView(@NonNull Toolbar toolbar0, @IdRes int v) {
        ActionMenuView actionMenuView0 = ToolbarUtils.getActionMenuView(toolbar0);
        if(actionMenuView0 != null) {
            for(int v1 = 0; v1 < actionMenuView0.getChildCount(); ++v1) {
                View view0 = actionMenuView0.getChildAt(v1);
                if(view0 instanceof ActionMenuItemView && ((ActionMenuItemView)view0).getItemData().getItemId() == v) {
                    return (ActionMenuItemView)view0;
                }
            }
        }
        return null;
    }

    @Nullable
    public static ActionMenuView getActionMenuView(@NonNull Toolbar toolbar0) {
        for(int v = 0; v < toolbar0.getChildCount(); ++v) {
            View view0 = toolbar0.getChildAt(v);
            if(view0 instanceof ActionMenuView) {
                return (ActionMenuView)view0;
            }
        }
        return null;
    }

    @Nullable
    public static ImageView getLogoImageView(@NonNull Toolbar toolbar0) {
        Drawable drawable0 = toolbar0.getLogo();
        if(drawable0 != null) {
            for(int v = 0; v < toolbar0.getChildCount(); ++v) {
                View view0 = toolbar0.getChildAt(v);
                if(view0 instanceof ImageView) {
                    Drawable drawable1 = ((ImageView)view0).getDrawable();
                    if(drawable1 != null && drawable1.getConstantState() != null && drawable1.getConstantState().equals(drawable0.getConstantState())) {
                        return (ImageView)view0;
                    }
                }
            }
        }
        return null;
    }

    @Nullable
    public static ImageButton getNavigationIconButton(@NonNull Toolbar toolbar0) {
        Drawable drawable0 = toolbar0.getNavigationIcon();
        if(drawable0 == null) {
            return null;
        }
        for(int v = 0; v < toolbar0.getChildCount(); ++v) {
            View view0 = toolbar0.getChildAt(v);
            if(view0 instanceof ImageButton && ((ImageButton)view0).getDrawable() == drawable0) {
                return (ImageButton)view0;
            }
        }
        return null;
    }

    @Nullable
    public static View getSecondaryActionMenuItemView(@NonNull Toolbar toolbar0) {
        ActionMenuView actionMenuView0 = ToolbarUtils.getActionMenuView(toolbar0);
        return actionMenuView0 == null || actionMenuView0.getChildCount() <= 1 ? null : actionMenuView0.getChildAt(0);
    }

    @Nullable
    public static TextView getSubtitleTextView(@NonNull Toolbar toolbar0) {
        ArrayList arrayList0 = ToolbarUtils.a(toolbar0, toolbar0.getSubtitle());
        return arrayList0.isEmpty() ? null : ((TextView)Collections.max(arrayList0, ToolbarUtils.a));
    }

    @Nullable
    public static TextView getTitleTextView(@NonNull Toolbar toolbar0) {
        ArrayList arrayList0 = ToolbarUtils.a(toolbar0, toolbar0.getTitle());
        return arrayList0.isEmpty() ? null : ((TextView)Collections.min(arrayList0, ToolbarUtils.a));
    }
}

