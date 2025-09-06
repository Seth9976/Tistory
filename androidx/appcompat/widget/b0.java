package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff.Mode;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import androidx.appcompat.R.attr;
import androidx.appcompat.R.color;
import androidx.appcompat.R.dimen;
import androidx.appcompat.R.drawable;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.graphics.ColorUtils;

public final class b0 implements ResourceManagerHooks {
    public final int[] a;
    public final int[] b;
    public final int[] c;
    public final int[] d;
    public final int[] e;
    public final int[] f;

    public b0() {
        this.a = new int[]{drawable.abc_textfield_search_default_mtrl_alpha, drawable.abc_textfield_default_mtrl_alpha, drawable.abc_ab_share_pack_mtrl_alpha};
        this.b = new int[]{drawable.abc_ic_commit_search_api_mtrl_alpha, drawable.abc_seekbar_tick_mark_material, drawable.abc_ic_menu_share_mtrl_alpha, drawable.abc_ic_menu_copy_mtrl_am_alpha, drawable.abc_ic_menu_cut_mtrl_alpha, drawable.abc_ic_menu_selectall_mtrl_alpha, drawable.abc_ic_menu_paste_mtrl_am_alpha};
        this.c = new int[]{drawable.abc_textfield_activated_mtrl_alpha, drawable.abc_textfield_search_activated_mtrl_alpha, drawable.abc_cab_background_top_mtrl_alpha, drawable.abc_text_cursor_material, drawable.abc_text_select_handle_left_mtrl, drawable.abc_text_select_handle_middle_mtrl, drawable.abc_text_select_handle_right_mtrl};
        this.d = new int[]{drawable.abc_popup_background_mtrl_mult, drawable.abc_cab_background_internal_bg, drawable.abc_menu_hardkey_panel_mtrl_mult};
        this.e = new int[]{drawable.abc_tab_indicator_material, drawable.abc_textfield_search_material};
        this.f = new int[]{drawable.abc_btn_check_material, drawable.abc_btn_radio_material, drawable.abc_btn_check_material_anim, drawable.abc_btn_radio_material_anim};
    }

    public static boolean a(int v, int[] arr_v) {
        for(int v1 = 0; v1 < arr_v.length; ++v1) {
            if(arr_v[v1] == v) {
                return true;
            }
        }
        return false;
    }

    public static ColorStateList b(Context context0, int v) {
        int v1 = ThemeUtils.getThemeAttrColor(context0, attr.colorControlHighlight);
        int v2 = ThemeUtils.getDisabledThemeAttrColor(context0, attr.colorButtonNormal);
        int v3 = ColorUtils.compositeColors(v1, v);
        int v4 = ColorUtils.compositeColors(v1, v);
        return new ColorStateList(new int[][]{ThemeUtils.b, ThemeUtils.d, ThemeUtils.c, ThemeUtils.f}, new int[]{v2, v3, v4, v});
    }

    public static LayerDrawable c(ResourceManagerInternal resourceManagerInternal0, Context context0, int v) {
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable1;
        BitmapDrawable bitmapDrawable0;
        int v1 = context0.getResources().getDimensionPixelSize(v);
        Drawable drawable0 = resourceManagerInternal0.getDrawable(context0, drawable.abc_star_black_48dp);
        Drawable drawable1 = resourceManagerInternal0.getDrawable(context0, drawable.abc_star_half_black_48dp);
        if(!(drawable0 instanceof BitmapDrawable) || drawable0.getIntrinsicWidth() != v1 || drawable0.getIntrinsicHeight() != v1) {
            Bitmap bitmap0 = Bitmap.createBitmap(v1, v1, Bitmap.Config.ARGB_8888);
            Canvas canvas0 = new Canvas(bitmap0);
            drawable0.setBounds(0, 0, v1, v1);
            drawable0.draw(canvas0);
            bitmapDrawable0 = new BitmapDrawable(bitmap0);
            bitmapDrawable1 = new BitmapDrawable(bitmap0);
        }
        else {
            bitmapDrawable0 = (BitmapDrawable)drawable0;
            bitmapDrawable1 = new BitmapDrawable(bitmapDrawable0.getBitmap());
        }
        bitmapDrawable1.setTileModeX(Shader.TileMode.REPEAT);
        if(!(drawable1 instanceof BitmapDrawable) || drawable1.getIntrinsicWidth() != v1 || drawable1.getIntrinsicHeight() != v1) {
            Bitmap bitmap1 = Bitmap.createBitmap(v1, v1, Bitmap.Config.ARGB_8888);
            Canvas canvas1 = new Canvas(bitmap1);
            drawable1.setBounds(0, 0, v1, v1);
            drawable1.draw(canvas1);
            bitmapDrawable2 = new BitmapDrawable(bitmap1);
        }
        else {
            bitmapDrawable2 = (BitmapDrawable)drawable1;
        }
        LayerDrawable layerDrawable0 = new LayerDrawable(new Drawable[]{bitmapDrawable0, bitmapDrawable2, bitmapDrawable1});
        layerDrawable0.setId(0, 0x1020000);
        layerDrawable0.setId(1, 0x102000F);
        layerDrawable0.setId(2, 0x102000D);
        return layerDrawable0;
    }

    @Override  // androidx.appcompat.widget.ResourceManagerInternal$ResourceManagerHooks
    public final Drawable createDrawableFor(ResourceManagerInternal resourceManagerInternal0, Context context0, int v) {
        if(v == drawable.abc_cab_background_top_material) {
            return new LayerDrawable(new Drawable[]{resourceManagerInternal0.getDrawable(context0, drawable.abc_cab_background_internal_bg), resourceManagerInternal0.getDrawable(context0, drawable.abc_cab_background_top_mtrl_alpha)});
        }
        if(v == drawable.abc_ratingbar_material) {
            return b0.c(resourceManagerInternal0, context0, dimen.abc_star_big);
        }
        if(v == drawable.abc_ratingbar_indicator_material) {
            return b0.c(resourceManagerInternal0, context0, dimen.abc_star_medium);
        }
        return v == drawable.abc_ratingbar_small_material ? b0.c(resourceManagerInternal0, context0, dimen.abc_star_small) : null;
    }

    public static void d(Drawable drawable0, int v, PorterDuff.Mode porterDuff$Mode0) {
        drawable0 = drawable0.mutate();
        if(porterDuff$Mode0 == null) {
            porterDuff$Mode0 = AppCompatDrawableManager.b;
        }
        drawable0.setColorFilter(AppCompatDrawableManager.getPorterDuffColorFilter(v, porterDuff$Mode0));
    }

    @Override  // androidx.appcompat.widget.ResourceManagerInternal$ResourceManagerHooks
    public final ColorStateList getTintListForDrawableRes(Context context0, int v) {
        if(v == drawable.abc_edit_text_material) {
            return AppCompatResources.getColorStateList(context0, color.abc_tint_edittext);
        }
        if(v == drawable.abc_switch_track_mtrl_alpha) {
            return AppCompatResources.getColorStateList(context0, color.abc_tint_switch_track);
        }
        if(v == drawable.abc_switch_thumb_material) {
            int[][] arr2_v = new int[3][];
            int[] arr_v = new int[3];
            ColorStateList colorStateList0 = ThemeUtils.getThemeAttrColorStateList(context0, attr.colorSwitchThumbNormal);
            if(colorStateList0 != null && colorStateList0.isStateful()) {
                arr2_v[0] = ThemeUtils.b;
                arr_v[0] = colorStateList0.getColorForState(ThemeUtils.b, 0);
                arr2_v[1] = ThemeUtils.e;
                arr_v[1] = ThemeUtils.getThemeAttrColor(context0, attr.colorControlActivated);
                arr2_v[2] = ThemeUtils.f;
                arr_v[2] = colorStateList0.getDefaultColor();
                return new ColorStateList(arr2_v, arr_v);
            }
            arr2_v[0] = ThemeUtils.b;
            arr_v[0] = ThemeUtils.getDisabledThemeAttrColor(context0, attr.colorSwitchThumbNormal);
            arr2_v[1] = ThemeUtils.e;
            arr_v[1] = ThemeUtils.getThemeAttrColor(context0, attr.colorControlActivated);
            arr2_v[2] = ThemeUtils.f;
            arr_v[2] = ThemeUtils.getThemeAttrColor(context0, attr.colorSwitchThumbNormal);
            return new ColorStateList(arr2_v, arr_v);
        }
        if(v == drawable.abc_btn_default_mtrl_shape) {
            return b0.b(context0, ThemeUtils.getThemeAttrColor(context0, attr.colorButtonNormal));
        }
        if(v == drawable.abc_btn_borderless_material) {
            return b0.b(context0, 0);
        }
        if(v == drawable.abc_btn_colored_material) {
            return b0.b(context0, ThemeUtils.getThemeAttrColor(context0, attr.colorAccent));
        }
        if(v != drawable.abc_spinner_mtrl_am_alpha && v != drawable.abc_spinner_textfield_background_material) {
            if(b0.a(v, this.b)) {
                return ThemeUtils.getThemeAttrColorStateList(context0, attr.colorControlNormal);
            }
            if(b0.a(v, this.e)) {
                return AppCompatResources.getColorStateList(context0, color.abc_tint_default);
            }
            if(b0.a(v, this.f)) {
                return AppCompatResources.getColorStateList(context0, color.abc_tint_btn_checkable);
            }
            return v == drawable.abc_seekbar_thumb_material ? AppCompatResources.getColorStateList(context0, color.abc_tint_seek_thumb) : null;
        }
        return AppCompatResources.getColorStateList(context0, color.abc_tint_spinner);
    }

    @Override  // androidx.appcompat.widget.ResourceManagerInternal$ResourceManagerHooks
    public final PorterDuff.Mode getTintModeForDrawableRes(int v) {
        return v == drawable.abc_switch_thumb_material ? PorterDuff.Mode.MULTIPLY : null;
    }

    @Override  // androidx.appcompat.widget.ResourceManagerInternal$ResourceManagerHooks
    public final boolean tintDrawable(Context context0, int v, Drawable drawable0) {
        if(v == drawable.abc_seekbar_track_material) {
            b0.d(((LayerDrawable)drawable0).findDrawableByLayerId(0x1020000), ThemeUtils.getThemeAttrColor(context0, attr.colorControlNormal), AppCompatDrawableManager.b);
            b0.d(((LayerDrawable)drawable0).findDrawableByLayerId(0x102000F), ThemeUtils.getThemeAttrColor(context0, attr.colorControlNormal), AppCompatDrawableManager.b);
            b0.d(((LayerDrawable)drawable0).findDrawableByLayerId(0x102000D), ThemeUtils.getThemeAttrColor(context0, attr.colorControlActivated), AppCompatDrawableManager.b);
            return true;
        }
        if(v != drawable.abc_ratingbar_material && v != drawable.abc_ratingbar_indicator_material && v != drawable.abc_ratingbar_small_material) {
            return false;
        }
        b0.d(((LayerDrawable)drawable0).findDrawableByLayerId(0x1020000), ThemeUtils.getDisabledThemeAttrColor(context0, attr.colorControlNormal), AppCompatDrawableManager.b);
        b0.d(((LayerDrawable)drawable0).findDrawableByLayerId(0x102000F), ThemeUtils.getThemeAttrColor(context0, attr.colorControlActivated), AppCompatDrawableManager.b);
        b0.d(((LayerDrawable)drawable0).findDrawableByLayerId(0x102000D), ThemeUtils.getThemeAttrColor(context0, attr.colorControlActivated), AppCompatDrawableManager.b);
        return true;
    }

    @Override  // androidx.appcompat.widget.ResourceManagerInternal$ResourceManagerHooks
    public final boolean tintDrawableUsingColorFilter(Context context0, int v, Drawable drawable0) {
        boolean z;
        int v2;
        PorterDuff.Mode porterDuff$Mode1;
        int v1;
        PorterDuff.Mode porterDuff$Mode0 = AppCompatDrawableManager.b;
        if(b0.a(v, this.a)) {
            v1 = attr.colorControlNormal;
            porterDuff$Mode1 = porterDuff$Mode0;
            v2 = -1;
            z = true;
        }
        else if(b0.a(v, this.c)) {
            v1 = attr.colorControlActivated;
            porterDuff$Mode1 = porterDuff$Mode0;
            v2 = -1;
            z = true;
        }
        else if(b0.a(v, this.d)) {
            porterDuff$Mode0 = PorterDuff.Mode.MULTIPLY;
            porterDuff$Mode1 = porterDuff$Mode0;
            v2 = -1;
            v1 = 0x1010031;
            z = true;
        }
        else if(v == drawable.abc_list_divider_mtrl_alpha) {
            z = true;
            v2 = 41;
            v1 = 0x1010030;
            porterDuff$Mode1 = porterDuff$Mode0;
        }
        else if(v == drawable.abc_dialog_material_background) {
            porterDuff$Mode1 = porterDuff$Mode0;
            v2 = -1;
            v1 = 0x1010031;
            z = true;
        }
        else {
            porterDuff$Mode1 = porterDuff$Mode0;
            v2 = -1;
            v1 = 0;
            z = false;
        }
        if(z) {
            drawable0 = drawable0.mutate();
            drawable0.setColorFilter(AppCompatDrawableManager.getPorterDuffColorFilter(ThemeUtils.getThemeAttrColor(context0, v1), porterDuff$Mode1));
            if(v2 != -1) {
                drawable0.setAlpha(v2);
            }
            return true;
        }
        return false;
    }
}

