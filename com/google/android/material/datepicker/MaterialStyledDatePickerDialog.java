package com.google.android.material.datepicker;

import android.app.DatePickerDialog.OnDateSetListener;
import android.app.DatePickerDialog;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.InsetDrawable;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import com.google.android.material.R.attr;
import com.google.android.material.R.style;
import com.google.android.material.dialog.InsetDialogOnTouchListener;
import com.google.android.material.dialog.MaterialDialogs;
import com.google.android.material.resources.MaterialAttributes;
import com.google.android.material.shape.MaterialShapeDrawable;

@RestrictTo({Scope.LIBRARY_GROUP, Scope.TESTS})
public class MaterialStyledDatePickerDialog extends DatePickerDialog {
    public final InsetDrawable a;
    public final Rect b;
    public static final int c;

    static {
        MaterialStyledDatePickerDialog.c = style.MaterialAlertDialog_MaterialComponents_Picker_Date_Spinner;
    }

    public MaterialStyledDatePickerDialog(@NonNull Context context0) {
        this(context0, 0);
    }

    public MaterialStyledDatePickerDialog(@NonNull Context context0, int v) {
        this(context0, v, null, -1, -1, -1);
    }

    public MaterialStyledDatePickerDialog(@NonNull Context context0, int v, @Nullable DatePickerDialog.OnDateSetListener datePickerDialog$OnDateSetListener0, int v1, int v2, int v3) {
        super(context0, v, datePickerDialog$OnDateSetListener0, v1, v2, v3);
        Context context1 = this.getContext();
        int v4 = MaterialAttributes.resolveOrThrow(this.getContext(), attr.colorSurface, this.getClass().getCanonicalName());
        MaterialShapeDrawable materialShapeDrawable0 = new MaterialShapeDrawable(context1, null, 0x101035C, MaterialStyledDatePickerDialog.c);
        materialShapeDrawable0.setFillColor(ColorStateList.valueOf(v4));
        Rect rect0 = MaterialDialogs.getDialogBackgroundInsets(context1, 0x101035C, MaterialStyledDatePickerDialog.c);
        this.b = rect0;
        this.a = MaterialDialogs.insetDrawable(materialShapeDrawable0, rect0);
    }

    public MaterialStyledDatePickerDialog(@NonNull Context context0, @Nullable DatePickerDialog.OnDateSetListener datePickerDialog$OnDateSetListener0, int v, int v1, int v2) {
        this(context0, 0, datePickerDialog$OnDateSetListener0, v, v1, v2);
    }

    @Override  // android.app.AlertDialog
    public void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        this.getWindow().setBackgroundDrawable(this.a);
        this.getWindow().getDecorView().setOnTouchListener(new InsetDialogOnTouchListener(this, this.b));
    }
}

