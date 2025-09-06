package com.google.android.material.badge;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.ViewCompat;
import c4.d;
import com.google.android.material.internal.ParcelableSparseArray;
import com.google.android.material.internal.ToolbarUtils;
import o7.a;

@ExperimentalBadgeUtils
public class BadgeUtils {
    public static final boolean USE_COMPAT_PARENT;

    static {
        BadgeUtils.USE_COMPAT_PARENT = false;
    }

    public static void attachBadgeDrawable(@NonNull BadgeDrawable badgeDrawable0, @NonNull View view0) {
        BadgeUtils.attachBadgeDrawable(badgeDrawable0, view0, null);
    }

    public static void attachBadgeDrawable(@NonNull BadgeDrawable badgeDrawable0, @NonNull View view0, @Nullable FrameLayout frameLayout0) {
        BadgeUtils.setBadgeDrawableBounds(badgeDrawable0, view0, frameLayout0);
        if(badgeDrawable0.getCustomBadgeParent() != null) {
            badgeDrawable0.getCustomBadgeParent().setForeground(badgeDrawable0);
            return;
        }
        if(BadgeUtils.USE_COMPAT_PARENT) {
            throw new IllegalArgumentException("Trying to reference null customBadgeParent");
        }
        view0.getOverlay().add(badgeDrawable0);
    }

    public static void attachBadgeDrawable(@NonNull BadgeDrawable badgeDrawable0, @NonNull Toolbar toolbar0, @IdRes int v) {
        BadgeUtils.attachBadgeDrawable(badgeDrawable0, toolbar0, v, null);
    }

    public static void attachBadgeDrawable(@NonNull BadgeDrawable badgeDrawable0, @NonNull Toolbar toolbar0, @IdRes int v, @Nullable FrameLayout frameLayout0) {
        toolbar0.post(new a(badgeDrawable0, toolbar0, v, frameLayout0));
    }

    @NonNull
    public static SparseArray createBadgeDrawablesFromSavedStates(Context context0, @NonNull ParcelableSparseArray parcelableSparseArray0) {
        SparseArray sparseArray0 = new SparseArray(parcelableSparseArray0.size());
        for(int v = 0; v < parcelableSparseArray0.size(); ++v) {
            int v1 = parcelableSparseArray0.keyAt(v);
            State badgeState$State0 = (State)parcelableSparseArray0.valueAt(v);
            sparseArray0.put(v1, (badgeState$State0 == null ? null : new BadgeDrawable(context0, 0, BadgeDrawable.o, BadgeDrawable.n, badgeState$State0)));
        }
        return sparseArray0;
    }

    @NonNull
    public static ParcelableSparseArray createParcelableBadgeStates(@NonNull SparseArray sparseArray0) {
        ParcelableSparseArray parcelableSparseArray0 = new ParcelableSparseArray();
        for(int v = 0; v < sparseArray0.size(); ++v) {
            int v1 = sparseArray0.keyAt(v);
            BadgeDrawable badgeDrawable0 = (BadgeDrawable)sparseArray0.valueAt(v);
            parcelableSparseArray0.put(v1, (badgeDrawable0 == null ? null : badgeDrawable0.e.a));
        }
        return parcelableSparseArray0;
    }

    public static void detachBadgeDrawable(@Nullable BadgeDrawable badgeDrawable0, @NonNull View view0) {
        if(badgeDrawable0 == null) {
            return;
        }
        if(!BadgeUtils.USE_COMPAT_PARENT && badgeDrawable0.getCustomBadgeParent() == null) {
            view0.getOverlay().remove(badgeDrawable0);
            return;
        }
        badgeDrawable0.getCustomBadgeParent().setForeground(null);
    }

    public static void detachBadgeDrawable(@Nullable BadgeDrawable badgeDrawable0, @NonNull Toolbar toolbar0, @IdRes int v) {
        if(badgeDrawable0 == null) {
            return;
        }
        ActionMenuItemView actionMenuItemView0 = ToolbarUtils.getActionMenuItemView(toolbar0, v);
        if(actionMenuItemView0 != null) {
            badgeDrawable0.e.a.A = 0;
            badgeDrawable0.e.b.A = 0;
            badgeDrawable0.k();
            badgeDrawable0.e.a.B = 0;
            badgeDrawable0.e.b.B = 0;
            badgeDrawable0.k();
            BadgeUtils.detachBadgeDrawable(badgeDrawable0, actionMenuItemView0);
            if(Build.VERSION.SDK_INT >= 29 && ViewCompat.hasAccessibilityDelegate(actionMenuItemView0)) {
                ViewCompat.setAccessibilityDelegate(actionMenuItemView0, new d(actionMenuItemView0.getAccessibilityDelegate()));
                return;
            }
            ViewCompat.setAccessibilityDelegate(actionMenuItemView0, null);
            return;
        }
        Log.w("BadgeUtils", "Trying to remove badge from a null menuItemView: " + v);
    }

    public static void setBadgeDrawableBounds(@NonNull BadgeDrawable badgeDrawable0, @NonNull View view0, @Nullable FrameLayout frameLayout0) {
        Rect rect0 = new Rect();
        view0.getDrawingRect(rect0);
        badgeDrawable0.setBounds(rect0);
        badgeDrawable0.updateBadgeCoordinates(view0, frameLayout0);
    }

    public static void updateBadgeBounds(@NonNull Rect rect0, float f, float f1, float f2, float f3) {
        rect0.set(((int)(f - f2)), ((int)(f1 - f3)), ((int)(f + f2)), ((int)(f1 + f3)));
    }
}

