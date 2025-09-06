package com.google.android.material.timepicker;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View.OnClickListener;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.DialogFragment;
import com.google.android.material.R.attr;
import com.google.android.material.R.id;
import com.google.android.material.R.layout;
import com.google.android.material.R.string;
import com.google.android.material.R.style;
import com.google.android.material.R.styleable;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.resources.MaterialAttributes;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.LinkedHashSet;

public final class MaterialTimePicker extends DialogFragment implements OnDoubleTapListener {
    public static final class Builder {
        public k a;
        public Integer b;
        public int c;
        public CharSequence d;
        public int e;
        public CharSequence f;
        public int g;
        public CharSequence h;
        public int i;

        public Builder() {
            this.a = new k(0);
            this.c = 0;
            this.e = 0;
            this.g = 0;
            this.i = 0;
        }

        @NonNull
        public MaterialTimePicker build() {
            MaterialTimePicker materialTimePicker0 = new MaterialTimePicker();
            Bundle bundle0 = new Bundle();
            bundle0.putParcelable("TIME_PICKER_TIME_MODEL", this.a);
            Integer integer0 = this.b;
            if(integer0 != null) {
                bundle0.putInt("TIME_PICKER_INPUT_MODE", ((int)integer0));
            }
            bundle0.putInt("TIME_PICKER_TITLE_RES", this.c);
            CharSequence charSequence0 = this.d;
            if(charSequence0 != null) {
                bundle0.putCharSequence("TIME_PICKER_TITLE_TEXT", charSequence0);
            }
            bundle0.putInt("TIME_PICKER_POSITIVE_BUTTON_TEXT_RES", this.e);
            CharSequence charSequence1 = this.f;
            if(charSequence1 != null) {
                bundle0.putCharSequence("TIME_PICKER_POSITIVE_BUTTON_TEXT", charSequence1);
            }
            bundle0.putInt("TIME_PICKER_NEGATIVE_BUTTON_TEXT_RES", this.g);
            CharSequence charSequence2 = this.h;
            if(charSequence2 != null) {
                bundle0.putCharSequence("TIME_PICKER_NEGATIVE_BUTTON_TEXT", charSequence2);
            }
            bundle0.putInt("TIME_PICKER_OVERRIDE_THEME_RES_ID", this.i);
            materialTimePicker0.setArguments(bundle0);
            return materialTimePicker0;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setHour(@IntRange(from = 0L, to = 23L) int v) {
            k k0 = this.a;
            k0.getClass();
            k0.g = v < 12 ? 0 : 1;
            k0.d = v;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setInputMode(int v) {
            this.b = v;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setMinute(@IntRange(from = 0L, to = 59L) int v) {
            this.a.d(v);
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setNegativeButtonText(@StringRes int v) {
            this.g = v;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setNegativeButtonText(@Nullable CharSequence charSequence0) {
            this.h = charSequence0;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setPositiveButtonText(@StringRes int v) {
            this.e = v;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setPositiveButtonText(@Nullable CharSequence charSequence0) {
            this.f = charSequence0;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setTheme(@StyleRes int v) {
            this.i = v;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setTimeFormat(int v) {
            int v1 = this.a.d;
            int v2 = this.a.e;
            k k0 = new k(v);
            this.a = k0;
            k0.d(v2);
            k k1 = this.a;
            k1.getClass();
            k1.g = v1 < 12 ? 0 : 1;
            k1.d = v1;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setTitleText(@StringRes int v) {
            this.c = v;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setTitleText(@Nullable CharSequence charSequence0) {
            this.d = charSequence0;
            return this;
        }
    }

    public final LinkedHashSet A;
    public final LinkedHashSet B;
    public final LinkedHashSet C;
    public TimePickerView D;
    public ViewStub E;
    public n F;
    public s G;
    public Object H;
    public int I;
    public static final int INPUT_MODE_CLOCK = 0;
    public static final int INPUT_MODE_KEYBOARD = 1;
    public int J;
    public int K;
    public CharSequence L;
    public int M;
    public CharSequence N;
    public int O;
    public CharSequence P;
    public MaterialButton Q;
    public Button R;
    public int S;
    public k T;
    public int U;
    public final LinkedHashSet z;

    public MaterialTimePicker() {
        this.z = new LinkedHashSet();
        this.A = new LinkedHashSet();
        this.B = new LinkedHashSet();
        this.C = new LinkedHashSet();
        this.K = 0;
        this.M = 0;
        this.O = 0;
        this.S = 0;
        this.U = 0;
    }

    public boolean addOnCancelListener(@NonNull DialogInterface.OnCancelListener dialogInterface$OnCancelListener0) {
        return this.B.add(dialogInterface$OnCancelListener0);
    }

    public boolean addOnDismissListener(@NonNull DialogInterface.OnDismissListener dialogInterface$OnDismissListener0) {
        return this.C.add(dialogInterface$OnDismissListener0);
    }

    public boolean addOnNegativeButtonClickListener(@NonNull View.OnClickListener view$OnClickListener0) {
        return this.A.add(view$OnClickListener0);
    }

    public boolean addOnPositiveButtonClickListener(@NonNull View.OnClickListener view$OnClickListener0) {
        return this.z.add(view$OnClickListener0);
    }

    public void clearOnCancelListeners() {
        this.B.clear();
    }

    public void clearOnDismissListeners() {
        this.C.clear();
    }

    public void clearOnNegativeButtonClickListeners() {
        this.A.clear();
    }

    public void clearOnPositiveButtonClickListeners() {
        this.z.clear();
    }

    @IntRange(from = 0L, to = 23L)
    public int getHour() {
        return this.T.d % 24;
    }

    public int getInputMode() {
        return this.S;
    }

    @IntRange(from = 0L, to = 59L)
    public int getMinute() {
        return this.T.e;
    }

    public final void i(MaterialButton materialButton0) {
        Pair pair0;
        n n0;
        if(materialButton0 != null && this.D != null && this.E != null) {
            Object object0 = this.H;
            if(object0 != null) {
                ((TimePickerPresenter)object0).hide();
            }
            TimePickerView timePickerView0 = this.D;
            ViewStub viewStub0 = this.E;
            if(this.S == 0) {
                n0 = this.F == null ? new n(timePickerView0, this.T) : this.F;
                this.F = n0;
            }
            else {
                if(this.G == null) {
                    this.G = new s(((LinearLayout)viewStub0.inflate()), this.T);
                }
                s s0 = this.G;
                s0.e.setChecked(false);
                s0.f.setChecked(false);
                n0 = this.G;
            }
            this.H = n0;
            n0.show();
            ((TimePickerPresenter)this.H).invalidate();
            int v = this.S;
            switch(v) {
                case 0: {
                    pair0 = new Pair(this.I, string.material_timepicker_text_input_mode_description);
                    break;
                }
                case 1: {
                    pair0 = new Pair(this.J, string.material_timepicker_clock_mode_description);
                    break;
                }
                default: {
                    throw new IllegalArgumentException("no icon for mode: " + v);
                }
            }
            materialButton0.setIconResource(((int)(((Integer)pair0.first))));
            materialButton0.setContentDescription(this.getResources().getString(((int)(((Integer)pair0.second)))));
            materialButton0.sendAccessibilityEvent(4);
        }
    }

    @Override  // androidx.fragment.app.DialogFragment
    public final void onCancel(@NonNull DialogInterface dialogInterface0) {
        for(Object object0: this.B) {
            ((DialogInterface.OnCancelListener)object0).onCancel(dialogInterface0);
        }
        super.onCancel(dialogInterface0);
    }

    @Override  // androidx.fragment.app.DialogFragment
    public void onCreate(@Nullable Bundle bundle0) {
        super.onCreate(bundle0);
        if(bundle0 == null) {
            bundle0 = this.getArguments();
        }
        if(bundle0 != null) {
            k k0 = (k)bundle0.getParcelable("TIME_PICKER_TIME_MODEL");
            this.T = k0;
            if(k0 == null) {
                this.T = new k(0);
            }
            this.S = bundle0.getInt("TIME_PICKER_INPUT_MODE", (this.T.c == 1 ? 1 : 0));
            this.K = bundle0.getInt("TIME_PICKER_TITLE_RES", 0);
            this.L = bundle0.getCharSequence("TIME_PICKER_TITLE_TEXT");
            this.M = bundle0.getInt("TIME_PICKER_POSITIVE_BUTTON_TEXT_RES", 0);
            this.N = bundle0.getCharSequence("TIME_PICKER_POSITIVE_BUTTON_TEXT");
            this.O = bundle0.getInt("TIME_PICKER_NEGATIVE_BUTTON_TEXT_RES", 0);
            this.P = bundle0.getCharSequence("TIME_PICKER_NEGATIVE_BUTTON_TEXT");
            this.U = bundle0.getInt("TIME_PICKER_OVERRIDE_THEME_RES_ID", 0);
        }
    }

    @Override  // androidx.fragment.app.DialogFragment
    @NonNull
    public final Dialog onCreateDialog(@Nullable Bundle bundle0) {
        Context context0 = this.requireContext();
        int v = this.U;
        if(v == 0) {
            TypedValue typedValue0 = MaterialAttributes.resolve(this.requireContext(), attr.materialTimePickerTheme);
            v = typedValue0 == null ? 0 : typedValue0.data;
        }
        Dialog dialog0 = new Dialog(context0, v);
        Context context1 = dialog0.getContext();
        MaterialShapeDrawable materialShapeDrawable0 = new MaterialShapeDrawable(context1, null, attr.materialTimePickerStyle, style.Widget_MaterialComponents_TimePicker);
        TypedArray typedArray0 = context1.obtainStyledAttributes(null, styleable.MaterialTimePicker, attr.materialTimePickerStyle, style.Widget_MaterialComponents_TimePicker);
        this.J = typedArray0.getResourceId(styleable.MaterialTimePicker_clockIcon, 0);
        this.I = typedArray0.getResourceId(styleable.MaterialTimePicker_keyboardIcon, 0);
        int v1 = typedArray0.getColor(styleable.MaterialTimePicker_backgroundTint, 0);
        typedArray0.recycle();
        materialShapeDrawable0.initializeElevationOverlay(context1);
        materialShapeDrawable0.setFillColor(ColorStateList.valueOf(v1));
        Window window0 = dialog0.getWindow();
        window0.setBackgroundDrawable(materialShapeDrawable0);
        window0.requestFeature(1);
        window0.setLayout(-2, -2);
        materialShapeDrawable0.setElevation(ViewCompat.getElevation(window0.getDecorView()));
        return dialog0;
    }

    @Override  // androidx.fragment.app.Fragment
    @NonNull
    public final View onCreateView(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, @Nullable Bundle bundle0) {
        View view0 = (ViewGroup)layoutInflater0.inflate(layout.material_timepicker_dialog, viewGroup0);
        TimePickerView timePickerView0 = (TimePickerView)view0.findViewById(id.material_timepicker_view);
        this.D = timePickerView0;
        timePickerView0.h = this;
        this.E = (ViewStub)view0.findViewById(id.material_textinput_timepicker);
        this.Q = (MaterialButton)view0.findViewById(id.material_timepicker_mode_button);
        TextView textView0 = (TextView)view0.findViewById(id.header_title);
        int v = this.K;
        if(v != 0) {
            textView0.setText(v);
        }
        else if(!TextUtils.isEmpty(this.L)) {
            textView0.setText(this.L);
        }
        this.i(this.Q);
        Button button0 = (Button)view0.findViewById(id.material_timepicker_ok_button);
        button0.setOnClickListener(new f(this));
        int v1 = this.M;
        if(v1 != 0) {
            button0.setText(v1);
        }
        else if(!TextUtils.isEmpty(this.N)) {
            button0.setText(this.N);
        }
        Button button1 = (Button)view0.findViewById(id.material_timepicker_cancel_button);
        this.R = button1;
        button1.setOnClickListener(new g(this));
        int v2 = this.O;
        if(v2 != 0) {
            this.R.setText(v2);
        }
        else if(!TextUtils.isEmpty(this.P)) {
            this.R.setText(this.P);
        }
        Button button2 = this.R;
        if(button2 != null) {
            button2.setVisibility((this.isCancelable() ? 0 : 8));
        }
        this.Q.setOnClickListener(new h(this));
        return view0;
    }

    @Override  // androidx.fragment.app.DialogFragment
    public void onDestroyView() {
        super.onDestroyView();
        this.H = null;
        this.F = null;
        this.G = null;
        TimePickerView timePickerView0 = this.D;
        if(timePickerView0 != null) {
            timePickerView0.h = null;
            this.D = null;
        }
    }

    @Override  // androidx.fragment.app.DialogFragment
    public final void onDismiss(@NonNull DialogInterface dialogInterface0) {
        for(Object object0: this.C) {
            ((DialogInterface.OnDismissListener)object0).onDismiss(dialogInterface0);
        }
        super.onDismiss(dialogInterface0);
    }

    @Override  // com.google.android.material.timepicker.TimePickerView$OnDoubleTapListener
    @RestrictTo({Scope.LIBRARY_GROUP})
    public void onDoubleTap() {
        this.S = 1;
        this.i(this.Q);
        this.G.a();
    }

    @Override  // androidx.fragment.app.DialogFragment
    public void onSaveInstanceState(@NonNull Bundle bundle0) {
        super.onSaveInstanceState(bundle0);
        bundle0.putParcelable("TIME_PICKER_TIME_MODEL", this.T);
        bundle0.putInt("TIME_PICKER_INPUT_MODE", this.S);
        bundle0.putInt("TIME_PICKER_TITLE_RES", this.K);
        bundle0.putCharSequence("TIME_PICKER_TITLE_TEXT", this.L);
        bundle0.putInt("TIME_PICKER_POSITIVE_BUTTON_TEXT_RES", this.M);
        bundle0.putCharSequence("TIME_PICKER_POSITIVE_BUTTON_TEXT", this.N);
        bundle0.putInt("TIME_PICKER_NEGATIVE_BUTTON_TEXT_RES", this.O);
        bundle0.putCharSequence("TIME_PICKER_NEGATIVE_BUTTON_TEXT", this.P);
        bundle0.putInt("TIME_PICKER_OVERRIDE_THEME_RES_ID", this.U);
    }

    @Override  // androidx.fragment.app.Fragment
    public void onViewCreated(@NonNull View view0, @Nullable Bundle bundle0) {
        super.onViewCreated(view0, bundle0);
        if(this.H instanceof s) {
            view0.postDelayed(new j(this, 1), 100L);
        }
    }

    public boolean removeOnCancelListener(@NonNull DialogInterface.OnCancelListener dialogInterface$OnCancelListener0) {
        return this.B.remove(dialogInterface$OnCancelListener0);
    }

    public boolean removeOnDismissListener(@NonNull DialogInterface.OnDismissListener dialogInterface$OnDismissListener0) {
        return this.C.remove(dialogInterface$OnDismissListener0);
    }

    public boolean removeOnNegativeButtonClickListener(@NonNull View.OnClickListener view$OnClickListener0) {
        return this.A.remove(view$OnClickListener0);
    }

    public boolean removeOnPositiveButtonClickListener(@NonNull View.OnClickListener view$OnClickListener0) {
        return this.z.remove(view$OnClickListener0);
    }

    @Override  // androidx.fragment.app.DialogFragment
    public void setCancelable(boolean z) {
        super.setCancelable(z);
        Button button0 = this.R;
        if(button0 != null) {
            button0.setVisibility((this.isCancelable() ? 0 : 8));
        }
    }

    public void setHour(@IntRange(from = 0L, to = 23L) int v) {
        this.T.c(v);
        Object object0 = this.H;
        if(object0 != null) {
            ((TimePickerPresenter)object0).invalidate();
        }
    }

    public void setMinute(@IntRange(from = 0L, to = 59L) int v) {
        this.T.d(v);
        Object object0 = this.H;
        if(object0 != null) {
            ((TimePickerPresenter)object0).invalidate();
        }
    }
}

