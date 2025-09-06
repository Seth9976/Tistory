package com.google.android.material.dialog;

import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface.OnKeyListener;
import android.content.DialogInterface.OnMultiChoiceClickListener;
import android.content.res.ColorStateList;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ListAdapter;
import androidx.annotation.ArrayRes;
import androidx.annotation.AttrRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.StringRes;
import androidx.appcompat.app.AlertDialog.Builder;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.core.view.ViewCompat;
import com.google.android.material.R.attr;
import com.google.android.material.R.style;
import com.google.android.material.R.styleable;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.resources.MaterialAttributes;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import com.google.errorprone.annotations.CanIgnoreReturnValue;

public class MaterialAlertDialogBuilder extends Builder {
    public Drawable c;
    public final Rect d;
    public static final int e;
    public static final int f;
    public static final int g;

    static {
        MaterialAlertDialogBuilder.e = attr.alertDialogStyle;
        MaterialAlertDialogBuilder.f = style.MaterialAlertDialog_MaterialComponents;
        MaterialAlertDialogBuilder.g = attr.materialAlertDialogTheme;
    }

    public MaterialAlertDialogBuilder(@NonNull Context context0) {
        this(context0, 0);
    }

    public MaterialAlertDialogBuilder(@NonNull Context context0, int v) {
        int v1 = MaterialAlertDialogBuilder.g;
        TypedValue typedValue0 = MaterialAttributes.resolve(context0, v1);
        int v2 = typedValue0 == null ? 0 : typedValue0.data;
        int v3 = MaterialAlertDialogBuilder.e;
        int v4 = MaterialAlertDialogBuilder.f;
        Context context1 = MaterialThemeOverlay.wrap(context0, null, v3, v4);
        if(v2 != 0) {
            context1 = new ContextThemeWrapper(context1, v2);
        }
        if(v == 0) {
            TypedValue typedValue1 = MaterialAttributes.resolve(context0, v1);
            v = typedValue1 == null ? 0 : typedValue1.data;
        }
        super(context1, v);
        Context context2 = this.getContext();
        Resources.Theme resources$Theme0 = context2.getTheme();
        this.d = MaterialDialogs.getDialogBackgroundInsets(context2, v3, v4);
        int v5 = MaterialColors.getColor(context2, attr.colorSurface, this.getClass().getCanonicalName());
        TypedArray typedArray0 = context2.obtainStyledAttributes(null, styleable.MaterialAlertDialog, v3, v4);
        int v6 = typedArray0.getColor(styleable.MaterialAlertDialog_backgroundTint, v5);
        typedArray0.recycle();
        MaterialShapeDrawable materialShapeDrawable0 = new MaterialShapeDrawable(context2, null, v3, v4);
        materialShapeDrawable0.initializeElevationOverlay(context2);
        materialShapeDrawable0.setFillColor(ColorStateList.valueOf(v6));
        if(Build.VERSION.SDK_INT >= 28) {
            TypedValue typedValue2 = new TypedValue();
            resources$Theme0.resolveAttribute(0x1010571, typedValue2, true);
            float f = typedValue2.getDimension(this.getContext().getResources().getDisplayMetrics());
            if(typedValue2.type == 5 && f >= 0.0f) {
                materialShapeDrawable0.setCornerSize(f);
            }
        }
        this.c = materialShapeDrawable0;
    }

    @Override  // androidx.appcompat.app.AlertDialog$Builder
    @NonNull
    public AlertDialog create() {
        AlertDialog alertDialog0 = super.create();
        Window window0 = alertDialog0.getWindow();
        View view0 = window0.getDecorView();
        Drawable drawable0 = this.c;
        if(drawable0 instanceof MaterialShapeDrawable) {
            ((MaterialShapeDrawable)drawable0).setElevation(ViewCompat.getElevation(view0));
        }
        window0.setBackgroundDrawable(MaterialDialogs.insetDrawable(this.c, this.d));
        view0.setOnTouchListener(new InsetDialogOnTouchListener(alertDialog0, this.d));
        return alertDialog0;
    }

    @Nullable
    public Drawable getBackground() {
        return this.c;
    }

    @Override  // androidx.appcompat.app.AlertDialog$Builder
    @NonNull
    @CanIgnoreReturnValue
    public Builder setAdapter(@Nullable ListAdapter listAdapter0, @Nullable DialogInterface.OnClickListener dialogInterface$OnClickListener0) {
        return this.setAdapter(listAdapter0, dialogInterface$OnClickListener0);
    }

    @NonNull
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setAdapter(@Nullable ListAdapter listAdapter0, @Nullable DialogInterface.OnClickListener dialogInterface$OnClickListener0) {
        return (MaterialAlertDialogBuilder)super.setAdapter(listAdapter0, dialogInterface$OnClickListener0);
    }

    @NonNull
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setBackground(@Nullable Drawable drawable0) {
        this.c = drawable0;
        return this;
    }

    @NonNull
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setBackgroundInsetBottom(@Px int v) {
        this.d.bottom = v;
        return this;
    }

    @NonNull
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setBackgroundInsetEnd(@Px int v) {
        int v1 = this.getContext().getResources().getConfiguration().getLayoutDirection();
        Rect rect0 = this.d;
        if(v1 == 1) {
            rect0.left = v;
            return this;
        }
        rect0.right = v;
        return this;
    }

    @NonNull
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setBackgroundInsetStart(@Px int v) {
        int v1 = this.getContext().getResources().getConfiguration().getLayoutDirection();
        Rect rect0 = this.d;
        if(v1 == 1) {
            rect0.right = v;
            return this;
        }
        rect0.left = v;
        return this;
    }

    @NonNull
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setBackgroundInsetTop(@Px int v) {
        this.d.top = v;
        return this;
    }

    @Override  // androidx.appcompat.app.AlertDialog$Builder
    @NonNull
    @CanIgnoreReturnValue
    public Builder setCancelable(boolean z) {
        return this.setCancelable(z);
    }

    @NonNull
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setCancelable(boolean z) {
        return (MaterialAlertDialogBuilder)super.setCancelable(z);
    }

    @Override  // androidx.appcompat.app.AlertDialog$Builder
    @NonNull
    @CanIgnoreReturnValue
    public Builder setCursor(@Nullable Cursor cursor0, @Nullable DialogInterface.OnClickListener dialogInterface$OnClickListener0, @NonNull String s) {
        return this.setCursor(cursor0, dialogInterface$OnClickListener0, s);
    }

    @NonNull
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setCursor(@Nullable Cursor cursor0, @Nullable DialogInterface.OnClickListener dialogInterface$OnClickListener0, @NonNull String s) {
        return (MaterialAlertDialogBuilder)super.setCursor(cursor0, dialogInterface$OnClickListener0, s);
    }

    @Override  // androidx.appcompat.app.AlertDialog$Builder
    @NonNull
    @CanIgnoreReturnValue
    public Builder setCustomTitle(@Nullable View view0) {
        return this.setCustomTitle(view0);
    }

    @NonNull
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setCustomTitle(@Nullable View view0) {
        return (MaterialAlertDialogBuilder)super.setCustomTitle(view0);
    }

    @Override  // androidx.appcompat.app.AlertDialog$Builder
    @NonNull
    @CanIgnoreReturnValue
    public Builder setIcon(@DrawableRes int v) {
        return this.setIcon(v);
    }

    @Override  // androidx.appcompat.app.AlertDialog$Builder
    @NonNull
    @CanIgnoreReturnValue
    public Builder setIcon(@Nullable Drawable drawable0) {
        return this.setIcon(drawable0);
    }

    @NonNull
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setIcon(@DrawableRes int v) {
        return (MaterialAlertDialogBuilder)super.setIcon(v);
    }

    @NonNull
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setIcon(@Nullable Drawable drawable0) {
        return (MaterialAlertDialogBuilder)super.setIcon(drawable0);
    }

    @Override  // androidx.appcompat.app.AlertDialog$Builder
    @NonNull
    @CanIgnoreReturnValue
    public Builder setIconAttribute(@AttrRes int v) {
        return this.setIconAttribute(v);
    }

    @NonNull
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setIconAttribute(@AttrRes int v) {
        return (MaterialAlertDialogBuilder)super.setIconAttribute(v);
    }

    @Override  // androidx.appcompat.app.AlertDialog$Builder
    @NonNull
    @CanIgnoreReturnValue
    public Builder setItems(@ArrayRes int v, @Nullable DialogInterface.OnClickListener dialogInterface$OnClickListener0) {
        return this.setItems(v, dialogInterface$OnClickListener0);
    }

    @Override  // androidx.appcompat.app.AlertDialog$Builder
    @NonNull
    @CanIgnoreReturnValue
    public Builder setItems(@Nullable CharSequence[] arr_charSequence, @Nullable DialogInterface.OnClickListener dialogInterface$OnClickListener0) {
        return this.setItems(arr_charSequence, dialogInterface$OnClickListener0);
    }

    @NonNull
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setItems(@ArrayRes int v, @Nullable DialogInterface.OnClickListener dialogInterface$OnClickListener0) {
        return (MaterialAlertDialogBuilder)super.setItems(v, dialogInterface$OnClickListener0);
    }

    @NonNull
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setItems(@Nullable CharSequence[] arr_charSequence, @Nullable DialogInterface.OnClickListener dialogInterface$OnClickListener0) {
        return (MaterialAlertDialogBuilder)super.setItems(arr_charSequence, dialogInterface$OnClickListener0);
    }

    @Override  // androidx.appcompat.app.AlertDialog$Builder
    @NonNull
    @CanIgnoreReturnValue
    public Builder setMessage(@StringRes int v) {
        return this.setMessage(v);
    }

    @Override  // androidx.appcompat.app.AlertDialog$Builder
    @NonNull
    @CanIgnoreReturnValue
    public Builder setMessage(@Nullable CharSequence charSequence0) {
        return this.setMessage(charSequence0);
    }

    @NonNull
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setMessage(@StringRes int v) {
        return (MaterialAlertDialogBuilder)super.setMessage(v);
    }

    @NonNull
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setMessage(@Nullable CharSequence charSequence0) {
        return (MaterialAlertDialogBuilder)super.setMessage(charSequence0);
    }

    @Override  // androidx.appcompat.app.AlertDialog$Builder
    @NonNull
    @CanIgnoreReturnValue
    public Builder setMultiChoiceItems(@ArrayRes int v, @Nullable boolean[] arr_z, @Nullable DialogInterface.OnMultiChoiceClickListener dialogInterface$OnMultiChoiceClickListener0) {
        return this.setMultiChoiceItems(v, arr_z, dialogInterface$OnMultiChoiceClickListener0);
    }

    @Override  // androidx.appcompat.app.AlertDialog$Builder
    @NonNull
    @CanIgnoreReturnValue
    public Builder setMultiChoiceItems(@Nullable Cursor cursor0, @NonNull String s, @NonNull String s1, @Nullable DialogInterface.OnMultiChoiceClickListener dialogInterface$OnMultiChoiceClickListener0) {
        return this.setMultiChoiceItems(cursor0, s, s1, dialogInterface$OnMultiChoiceClickListener0);
    }

    @Override  // androidx.appcompat.app.AlertDialog$Builder
    @NonNull
    @CanIgnoreReturnValue
    public Builder setMultiChoiceItems(@Nullable CharSequence[] arr_charSequence, @Nullable boolean[] arr_z, @Nullable DialogInterface.OnMultiChoiceClickListener dialogInterface$OnMultiChoiceClickListener0) {
        return this.setMultiChoiceItems(arr_charSequence, arr_z, dialogInterface$OnMultiChoiceClickListener0);
    }

    @NonNull
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setMultiChoiceItems(@ArrayRes int v, @Nullable boolean[] arr_z, @Nullable DialogInterface.OnMultiChoiceClickListener dialogInterface$OnMultiChoiceClickListener0) {
        return (MaterialAlertDialogBuilder)super.setMultiChoiceItems(v, arr_z, dialogInterface$OnMultiChoiceClickListener0);
    }

    @NonNull
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setMultiChoiceItems(@Nullable Cursor cursor0, @NonNull String s, @NonNull String s1, @Nullable DialogInterface.OnMultiChoiceClickListener dialogInterface$OnMultiChoiceClickListener0) {
        return (MaterialAlertDialogBuilder)super.setMultiChoiceItems(cursor0, s, s1, dialogInterface$OnMultiChoiceClickListener0);
    }

    @NonNull
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setMultiChoiceItems(@Nullable CharSequence[] arr_charSequence, @Nullable boolean[] arr_z, @Nullable DialogInterface.OnMultiChoiceClickListener dialogInterface$OnMultiChoiceClickListener0) {
        return (MaterialAlertDialogBuilder)super.setMultiChoiceItems(arr_charSequence, arr_z, dialogInterface$OnMultiChoiceClickListener0);
    }

    @Override  // androidx.appcompat.app.AlertDialog$Builder
    @NonNull
    @CanIgnoreReturnValue
    public Builder setNegativeButton(@StringRes int v, @Nullable DialogInterface.OnClickListener dialogInterface$OnClickListener0) {
        return this.setNegativeButton(v, dialogInterface$OnClickListener0);
    }

    @Override  // androidx.appcompat.app.AlertDialog$Builder
    @NonNull
    @CanIgnoreReturnValue
    public Builder setNegativeButton(@Nullable CharSequence charSequence0, @Nullable DialogInterface.OnClickListener dialogInterface$OnClickListener0) {
        return this.setNegativeButton(charSequence0, dialogInterface$OnClickListener0);
    }

    @NonNull
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setNegativeButton(@StringRes int v, @Nullable DialogInterface.OnClickListener dialogInterface$OnClickListener0) {
        return (MaterialAlertDialogBuilder)super.setNegativeButton(v, dialogInterface$OnClickListener0);
    }

    @NonNull
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setNegativeButton(@Nullable CharSequence charSequence0, @Nullable DialogInterface.OnClickListener dialogInterface$OnClickListener0) {
        return (MaterialAlertDialogBuilder)super.setNegativeButton(charSequence0, dialogInterface$OnClickListener0);
    }

    @Override  // androidx.appcompat.app.AlertDialog$Builder
    @NonNull
    @CanIgnoreReturnValue
    public Builder setNegativeButtonIcon(@Nullable Drawable drawable0) {
        return this.setNegativeButtonIcon(drawable0);
    }

    @NonNull
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setNegativeButtonIcon(@Nullable Drawable drawable0) {
        return (MaterialAlertDialogBuilder)super.setNegativeButtonIcon(drawable0);
    }

    @Override  // androidx.appcompat.app.AlertDialog$Builder
    @NonNull
    @CanIgnoreReturnValue
    public Builder setNeutralButton(@StringRes int v, @Nullable DialogInterface.OnClickListener dialogInterface$OnClickListener0) {
        return this.setNeutralButton(v, dialogInterface$OnClickListener0);
    }

    @Override  // androidx.appcompat.app.AlertDialog$Builder
    @NonNull
    @CanIgnoreReturnValue
    public Builder setNeutralButton(@Nullable CharSequence charSequence0, @Nullable DialogInterface.OnClickListener dialogInterface$OnClickListener0) {
        return this.setNeutralButton(charSequence0, dialogInterface$OnClickListener0);
    }

    @NonNull
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setNeutralButton(@StringRes int v, @Nullable DialogInterface.OnClickListener dialogInterface$OnClickListener0) {
        return (MaterialAlertDialogBuilder)super.setNeutralButton(v, dialogInterface$OnClickListener0);
    }

    @NonNull
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setNeutralButton(@Nullable CharSequence charSequence0, @Nullable DialogInterface.OnClickListener dialogInterface$OnClickListener0) {
        return (MaterialAlertDialogBuilder)super.setNeutralButton(charSequence0, dialogInterface$OnClickListener0);
    }

    @Override  // androidx.appcompat.app.AlertDialog$Builder
    @NonNull
    @CanIgnoreReturnValue
    public Builder setNeutralButtonIcon(@Nullable Drawable drawable0) {
        return this.setNeutralButtonIcon(drawable0);
    }

    @NonNull
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setNeutralButtonIcon(@Nullable Drawable drawable0) {
        return (MaterialAlertDialogBuilder)super.setNeutralButtonIcon(drawable0);
    }

    @Override  // androidx.appcompat.app.AlertDialog$Builder
    @NonNull
    @CanIgnoreReturnValue
    public Builder setOnCancelListener(@Nullable DialogInterface.OnCancelListener dialogInterface$OnCancelListener0) {
        return this.setOnCancelListener(dialogInterface$OnCancelListener0);
    }

    @NonNull
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setOnCancelListener(@Nullable DialogInterface.OnCancelListener dialogInterface$OnCancelListener0) {
        return (MaterialAlertDialogBuilder)super.setOnCancelListener(dialogInterface$OnCancelListener0);
    }

    @Override  // androidx.appcompat.app.AlertDialog$Builder
    @NonNull
    @CanIgnoreReturnValue
    public Builder setOnDismissListener(@Nullable DialogInterface.OnDismissListener dialogInterface$OnDismissListener0) {
        return this.setOnDismissListener(dialogInterface$OnDismissListener0);
    }

    @NonNull
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setOnDismissListener(@Nullable DialogInterface.OnDismissListener dialogInterface$OnDismissListener0) {
        return (MaterialAlertDialogBuilder)super.setOnDismissListener(dialogInterface$OnDismissListener0);
    }

    @Override  // androidx.appcompat.app.AlertDialog$Builder
    @NonNull
    @CanIgnoreReturnValue
    public Builder setOnItemSelectedListener(@Nullable AdapterView.OnItemSelectedListener adapterView$OnItemSelectedListener0) {
        return this.setOnItemSelectedListener(adapterView$OnItemSelectedListener0);
    }

    @NonNull
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setOnItemSelectedListener(@Nullable AdapterView.OnItemSelectedListener adapterView$OnItemSelectedListener0) {
        return (MaterialAlertDialogBuilder)super.setOnItemSelectedListener(adapterView$OnItemSelectedListener0);
    }

    @Override  // androidx.appcompat.app.AlertDialog$Builder
    @NonNull
    @CanIgnoreReturnValue
    public Builder setOnKeyListener(@Nullable DialogInterface.OnKeyListener dialogInterface$OnKeyListener0) {
        return this.setOnKeyListener(dialogInterface$OnKeyListener0);
    }

    @NonNull
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setOnKeyListener(@Nullable DialogInterface.OnKeyListener dialogInterface$OnKeyListener0) {
        return (MaterialAlertDialogBuilder)super.setOnKeyListener(dialogInterface$OnKeyListener0);
    }

    @Override  // androidx.appcompat.app.AlertDialog$Builder
    @NonNull
    @CanIgnoreReturnValue
    public Builder setPositiveButton(@StringRes int v, @Nullable DialogInterface.OnClickListener dialogInterface$OnClickListener0) {
        return this.setPositiveButton(v, dialogInterface$OnClickListener0);
    }

    @Override  // androidx.appcompat.app.AlertDialog$Builder
    @NonNull
    @CanIgnoreReturnValue
    public Builder setPositiveButton(@Nullable CharSequence charSequence0, @Nullable DialogInterface.OnClickListener dialogInterface$OnClickListener0) {
        return this.setPositiveButton(charSequence0, dialogInterface$OnClickListener0);
    }

    @NonNull
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setPositiveButton(@StringRes int v, @Nullable DialogInterface.OnClickListener dialogInterface$OnClickListener0) {
        return (MaterialAlertDialogBuilder)super.setPositiveButton(v, dialogInterface$OnClickListener0);
    }

    @NonNull
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setPositiveButton(@Nullable CharSequence charSequence0, @Nullable DialogInterface.OnClickListener dialogInterface$OnClickListener0) {
        return (MaterialAlertDialogBuilder)super.setPositiveButton(charSequence0, dialogInterface$OnClickListener0);
    }

    @Override  // androidx.appcompat.app.AlertDialog$Builder
    @NonNull
    @CanIgnoreReturnValue
    public Builder setPositiveButtonIcon(@Nullable Drawable drawable0) {
        return this.setPositiveButtonIcon(drawable0);
    }

    @NonNull
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setPositiveButtonIcon(@Nullable Drawable drawable0) {
        return (MaterialAlertDialogBuilder)super.setPositiveButtonIcon(drawable0);
    }

    @Override  // androidx.appcompat.app.AlertDialog$Builder
    @NonNull
    @CanIgnoreReturnValue
    public Builder setSingleChoiceItems(@ArrayRes int v, int v1, @Nullable DialogInterface.OnClickListener dialogInterface$OnClickListener0) {
        return this.setSingleChoiceItems(v, v1, dialogInterface$OnClickListener0);
    }

    @Override  // androidx.appcompat.app.AlertDialog$Builder
    @NonNull
    @CanIgnoreReturnValue
    public Builder setSingleChoiceItems(@Nullable Cursor cursor0, int v, @NonNull String s, @Nullable DialogInterface.OnClickListener dialogInterface$OnClickListener0) {
        return this.setSingleChoiceItems(cursor0, v, s, dialogInterface$OnClickListener0);
    }

    @Override  // androidx.appcompat.app.AlertDialog$Builder
    @NonNull
    @CanIgnoreReturnValue
    public Builder setSingleChoiceItems(@Nullable ListAdapter listAdapter0, int v, @Nullable DialogInterface.OnClickListener dialogInterface$OnClickListener0) {
        return this.setSingleChoiceItems(listAdapter0, v, dialogInterface$OnClickListener0);
    }

    @Override  // androidx.appcompat.app.AlertDialog$Builder
    @NonNull
    @CanIgnoreReturnValue
    public Builder setSingleChoiceItems(@Nullable CharSequence[] arr_charSequence, int v, @Nullable DialogInterface.OnClickListener dialogInterface$OnClickListener0) {
        return this.setSingleChoiceItems(arr_charSequence, v, dialogInterface$OnClickListener0);
    }

    @NonNull
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setSingleChoiceItems(@ArrayRes int v, int v1, @Nullable DialogInterface.OnClickListener dialogInterface$OnClickListener0) {
        return (MaterialAlertDialogBuilder)super.setSingleChoiceItems(v, v1, dialogInterface$OnClickListener0);
    }

    @NonNull
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setSingleChoiceItems(@Nullable Cursor cursor0, int v, @NonNull String s, @Nullable DialogInterface.OnClickListener dialogInterface$OnClickListener0) {
        return (MaterialAlertDialogBuilder)super.setSingleChoiceItems(cursor0, v, s, dialogInterface$OnClickListener0);
    }

    @NonNull
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setSingleChoiceItems(@Nullable ListAdapter listAdapter0, int v, @Nullable DialogInterface.OnClickListener dialogInterface$OnClickListener0) {
        return (MaterialAlertDialogBuilder)super.setSingleChoiceItems(listAdapter0, v, dialogInterface$OnClickListener0);
    }

    @NonNull
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setSingleChoiceItems(@Nullable CharSequence[] arr_charSequence, int v, @Nullable DialogInterface.OnClickListener dialogInterface$OnClickListener0) {
        return (MaterialAlertDialogBuilder)super.setSingleChoiceItems(arr_charSequence, v, dialogInterface$OnClickListener0);
    }

    @Override  // androidx.appcompat.app.AlertDialog$Builder
    @NonNull
    @CanIgnoreReturnValue
    public Builder setTitle(@StringRes int v) {
        return this.setTitle(v);
    }

    @Override  // androidx.appcompat.app.AlertDialog$Builder
    @NonNull
    @CanIgnoreReturnValue
    public Builder setTitle(@Nullable CharSequence charSequence0) {
        return this.setTitle(charSequence0);
    }

    @NonNull
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setTitle(@StringRes int v) {
        return (MaterialAlertDialogBuilder)super.setTitle(v);
    }

    @NonNull
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setTitle(@Nullable CharSequence charSequence0) {
        return (MaterialAlertDialogBuilder)super.setTitle(charSequence0);
    }

    @Override  // androidx.appcompat.app.AlertDialog$Builder
    @NonNull
    @CanIgnoreReturnValue
    public Builder setView(int v) {
        return this.setView(v);
    }

    @Override  // androidx.appcompat.app.AlertDialog$Builder
    @NonNull
    @CanIgnoreReturnValue
    public Builder setView(@Nullable View view0) {
        return this.setView(view0);
    }

    @NonNull
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setView(int v) {
        return (MaterialAlertDialogBuilder)super.setView(v);
    }

    @NonNull
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setView(@Nullable View view0) {
        return (MaterialAlertDialogBuilder)super.setView(view0);
    }
}

