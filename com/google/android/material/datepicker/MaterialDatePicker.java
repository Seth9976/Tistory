package com.google.android.material.datepicker;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View.OnClickListener;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentTransaction;
import com.google.android.material.R.attr;
import com.google.android.material.R.dimen;
import com.google.android.material.R.drawable;
import com.google.android.material.R.id;
import com.google.android.material.R.layout;
import com.google.android.material.R.string;
import com.google.android.material.R.style;
import com.google.android.material.R.styleable;
import com.google.android.material.dialog.InsetDialogOnTouchListener;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.EdgeToEdgeUtils;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialAttributes;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.LinkedHashSet;

public final class MaterialDatePicker extends DialogFragment {
    public static final class Builder {
        public final DateSelector a;
        public int b;
        public CalendarConstraints c;
        public DayViewDecorator d;
        public int e;
        public CharSequence f;
        public int g;
        public CharSequence h;
        public int i;
        public CharSequence j;
        public int k;
        public CharSequence l;
        public int m;
        public CharSequence n;
        public Object o;
        public int p;

        public Builder(DateSelector dateSelector0) {
            this.b = 0;
            this.e = 0;
            this.f = null;
            this.g = 0;
            this.h = null;
            this.i = 0;
            this.j = null;
            this.k = 0;
            this.l = null;
            this.m = 0;
            this.n = null;
            this.o = null;
            this.p = 0;
            this.a = dateSelector0;
        }

        @NonNull
        public MaterialDatePicker build() {
            y y0;
            if(this.c == null) {
                this.c = new com.google.android.material.datepicker.CalendarConstraints.Builder().build();
            }
            DateSelector dateSelector0 = this.a;
            if(this.e == 0) {
                this.e = dateSelector0.getDefaultTitleResId();
            }
            Object object0 = this.o;
            if(object0 != null) {
                dateSelector0.setSelection(object0);
            }
            CalendarConstraints calendarConstraints0 = this.c;
            if(calendarConstraints0.d == null) {
                if(dateSelector0.getSelectedDays().isEmpty()) {
                label_15:
                    y0 = new y(i0.f());
                    CalendarConstraints calendarConstraints2 = this.c;
                    if(y0.a(calendarConstraints2.a) < 0 || y0.a(calendarConstraints2.b) > 0) {
                        y0 = this.c.a;
                    }
                }
                else {
                    Object object1 = dateSelector0.getSelectedDays().iterator().next();
                    y0 = y.c(((long)(((Long)object1))));
                    CalendarConstraints calendarConstraints1 = this.c;
                    if(y0.a(calendarConstraints1.a) < 0 || y0.a(calendarConstraints1.b) > 0) {
                        goto label_15;
                    }
                }
                calendarConstraints0.d = y0;
            }
            MaterialDatePicker materialDatePicker0 = new MaterialDatePicker();
            Bundle bundle0 = new Bundle();
            bundle0.putInt("OVERRIDE_THEME_RES_ID", this.b);
            bundle0.putParcelable("DATE_SELECTOR_KEY", dateSelector0);
            bundle0.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.c);
            bundle0.putParcelable("DAY_VIEW_DECORATOR_KEY", this.d);
            bundle0.putInt("TITLE_TEXT_RES_ID_KEY", this.e);
            bundle0.putCharSequence("TITLE_TEXT_KEY", this.f);
            bundle0.putInt("INPUT_MODE_KEY", this.p);
            bundle0.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.g);
            bundle0.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.h);
            bundle0.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.i);
            bundle0.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.j);
            bundle0.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.k);
            bundle0.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.l);
            bundle0.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.m);
            bundle0.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.n);
            materialDatePicker0.setArguments(bundle0);
            return materialDatePicker0;
        }

        @NonNull
        @RestrictTo({Scope.LIBRARY_GROUP})
        public static Builder customDatePicker(@NonNull DateSelector dateSelector0) {
            return new Builder(dateSelector0);
        }

        @NonNull
        public static Builder datePicker() {
            return new Builder(new SingleDateSelector());
        }

        @NonNull
        public static Builder dateRangePicker() {
            return new Builder(new RangeDateSelector());
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setCalendarConstraints(CalendarConstraints calendarConstraints0) {
            this.c = calendarConstraints0;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setDayViewDecorator(@Nullable DayViewDecorator dayViewDecorator0) {
            this.d = dayViewDecorator0;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setInputMode(int v) {
            this.p = v;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setNegativeButtonContentDescription(@StringRes int v) {
            this.m = v;
            this.n = null;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setNegativeButtonContentDescription(@Nullable CharSequence charSequence0) {
            this.n = charSequence0;
            this.m = 0;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setNegativeButtonText(@StringRes int v) {
            this.k = v;
            this.l = null;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setNegativeButtonText(@Nullable CharSequence charSequence0) {
            this.l = charSequence0;
            this.k = 0;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setPositiveButtonContentDescription(@StringRes int v) {
            this.i = v;
            this.j = null;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setPositiveButtonContentDescription(@Nullable CharSequence charSequence0) {
            this.j = charSequence0;
            this.i = 0;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setPositiveButtonText(@StringRes int v) {
            this.g = v;
            this.h = null;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setPositiveButtonText(@Nullable CharSequence charSequence0) {
            this.h = charSequence0;
            this.g = 0;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setSelection(Object object0) {
            this.o = object0;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setTextInputFormat(@Nullable SimpleDateFormat simpleDateFormat0) {
            this.a.setTextInputFormat(simpleDateFormat0);
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setTheme(@StyleRes int v) {
            this.b = v;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setTitleText(@StringRes int v) {
            this.e = v;
            this.f = null;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setTitleText(@Nullable CharSequence charSequence0) {
            this.f = charSequence0;
            this.e = 0;
            return this;
        }
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface InputMode {
    }

    public final LinkedHashSet A;
    public final LinkedHashSet B;
    public final LinkedHashSet C;
    public int D;
    public DateSelector E;
    public c0 F;
    public CalendarConstraints G;
    public DayViewDecorator H;
    public MaterialCalendar I;
    public static final int INPUT_MODE_CALENDAR = 0;
    public static final int INPUT_MODE_TEXT = 1;
    public int J;
    public CharSequence K;
    public boolean L;
    public int M;
    public int N;
    public CharSequence O;
    public int P;
    public CharSequence Q;
    public int R;
    public CharSequence S;
    public int T;
    public CharSequence U;
    public TextView V;
    public TextView W;
    public CheckableImageButton X;
    public MaterialShapeDrawable Y;
    public Button Z;
    public boolean a0;
    public CharSequence b0;
    public CharSequence c0;
    public final LinkedHashSet z;

    public MaterialDatePicker() {
        this.z = new LinkedHashSet();
        this.A = new LinkedHashSet();
        this.B = new LinkedHashSet();
        this.C = new LinkedHashSet();
    }

    public boolean addOnCancelListener(DialogInterface.OnCancelListener dialogInterface$OnCancelListener0) {
        return this.B.add(dialogInterface$OnCancelListener0);
    }

    public boolean addOnDismissListener(DialogInterface.OnDismissListener dialogInterface$OnDismissListener0) {
        return this.C.add(dialogInterface$OnDismissListener0);
    }

    public boolean addOnNegativeButtonClickListener(View.OnClickListener view$OnClickListener0) {
        return this.A.add(view$OnClickListener0);
    }

    public boolean addOnPositiveButtonClickListener(MaterialPickerOnPositiveButtonClickListener materialPickerOnPositiveButtonClickListener0) {
        return this.z.add(materialPickerOnPositiveButtonClickListener0);
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

    public String getHeaderText() {
        return this.i().getSelectionDisplayString(this.getContext());
    }

    public int getInputMode() {
        return this.M;
    }

    @Nullable
    public final Object getSelection() {
        return this.i().getSelection();
    }

    public final DateSelector i() {
        if(this.E == null) {
            this.E = (DateSelector)this.getArguments().getParcelable("DATE_SELECTOR_KEY");
        }
        return this.E;
    }

    public static int j(Context context0) {
        Resources resources0 = context0.getResources();
        int v = resources0.getDimensionPixelOffset(dimen.mtrl_calendar_content_padding);
        Calendar calendar0 = i0.f();
        calendar0.set(5, 1);
        Calendar calendar1 = i0.c(calendar0);
        calendar1.get(2);
        calendar1.get(1);
        int v1 = calendar1.getMaximum(7);
        calendar1.getActualMaximum(5);
        calendar1.getTimeInMillis();
        int v2 = resources0.getDimensionPixelSize(dimen.mtrl_calendar_day_width);
        return (v1 - 1) * resources0.getDimensionPixelOffset(dimen.mtrl_calendar_month_horizontal_padding) + (v2 * v1 + v * 2);
    }

    public static boolean k(Context context0, int v) {
        TypedArray typedArray0 = context0.obtainStyledAttributes(MaterialAttributes.resolveOrThrow(context0, attr.materialCalendarStyle, MaterialCalendar.class.getCanonicalName()), new int[]{v});
        boolean z = typedArray0.getBoolean(0, false);
        typedArray0.recycle();
        return z;
    }

    public final void l() {
        Context context0 = this.requireContext();
        int v = this.D == 0 ? this.i().getDefaultThemeResId(context0) : this.D;
        MaterialCalendar materialCalendar0 = MaterialCalendar.newInstance(this.i(), v, this.G, this.H);
        this.I = materialCalendar0;
        if(this.M == 1) {
            DateSelector dateSelector0 = this.i();
            CalendarConstraints calendarConstraints0 = this.G;
            MaterialTextInputPicker materialTextInputPicker0 = new MaterialTextInputPicker();
            Bundle bundle0 = new Bundle();
            bundle0.putInt("THEME_RES_ID_KEY", v);
            bundle0.putParcelable("DATE_SELECTOR_KEY", dateSelector0);
            bundle0.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints0);
            materialTextInputPicker0.setArguments(bundle0);
            materialCalendar0 = materialTextInputPicker0;
        }
        this.F = materialCalendar0;
        this.V.setText((this.M != 1 || this.getResources().getConfiguration().orientation != 2 ? this.b0 : this.c0));
        String s = this.getHeaderText();
        this.W.setContentDescription(this.i().getSelectionContentDescription(this.requireContext()));
        this.W.setText(s);
        FragmentTransaction fragmentTransaction0 = this.getChildFragmentManager().beginTransaction();
        fragmentTransaction0.replace(id.mtrl_calendar_frame, this.F);
        fragmentTransaction0.commitNow();
        this.F.addOnSelectionChangedListener(new x(this, 1));
    }

    public final void m(CheckableImageButton checkableImageButton0) {
        String s = this.M == 1 ? checkableImageButton0.getContext().getString(string.mtrl_picker_toggle_to_calendar_input_mode) : checkableImageButton0.getContext().getString(string.mtrl_picker_toggle_to_text_input_mode);
        this.X.setContentDescription(s);
    }

    @Override  // androidx.fragment.app.DialogFragment
    public final void onCancel(@NonNull DialogInterface dialogInterface0) {
        for(Object object0: this.B) {
            ((DialogInterface.OnCancelListener)object0).onCancel(dialogInterface0);
        }
        super.onCancel(dialogInterface0);
    }

    @Override  // androidx.fragment.app.DialogFragment
    public final void onCreate(@Nullable Bundle bundle0) {
        super.onCreate(bundle0);
        if(bundle0 == null) {
            bundle0 = this.getArguments();
        }
        this.D = bundle0.getInt("OVERRIDE_THEME_RES_ID");
        this.E = (DateSelector)bundle0.getParcelable("DATE_SELECTOR_KEY");
        this.G = (CalendarConstraints)bundle0.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.H = (DayViewDecorator)bundle0.getParcelable("DAY_VIEW_DECORATOR_KEY");
        this.J = bundle0.getInt("TITLE_TEXT_RES_ID_KEY");
        this.K = bundle0.getCharSequence("TITLE_TEXT_KEY");
        this.M = bundle0.getInt("INPUT_MODE_KEY");
        this.N = bundle0.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.O = bundle0.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.P = bundle0.getInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.Q = bundle0.getCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        this.R = bundle0.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.S = bundle0.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        this.T = bundle0.getInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.U = bundle0.getCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        CharSequence charSequence0 = this.K == null ? this.requireContext().getResources().getText(this.J) : this.K;
        this.b0 = charSequence0;
        if(charSequence0 == null) {
            charSequence0 = null;
        }
        else {
            String[] arr_s = TextUtils.split(String.valueOf(charSequence0), "\n");
            if(arr_s.length > 1) {
                charSequence0 = arr_s[0];
            }
        }
        this.c0 = charSequence0;
    }

    @Override  // androidx.fragment.app.DialogFragment
    @NonNull
    public final Dialog onCreateDialog(@Nullable Bundle bundle0) {
        Context context0 = this.requireContext();
        Context context1 = this.requireContext();
        Dialog dialog0 = new Dialog(context0, (this.D == 0 ? this.i().getDefaultThemeResId(context1) : this.D));
        Context context2 = dialog0.getContext();
        this.L = MaterialDatePicker.k(context2, 0x101020D);
        this.Y = new MaterialShapeDrawable(context2, null, attr.materialCalendarStyle, style.Widget_MaterialComponents_MaterialCalendar);
        TypedArray typedArray0 = context2.obtainStyledAttributes(null, styleable.MaterialCalendar, attr.materialCalendarStyle, style.Widget_MaterialComponents_MaterialCalendar);
        int v = typedArray0.getColor(styleable.MaterialCalendar_backgroundTint, 0);
        typedArray0.recycle();
        this.Y.initializeElevationOverlay(context2);
        this.Y.setFillColor(ColorStateList.valueOf(v));
        this.Y.setElevation(ViewCompat.getElevation(dialog0.getWindow().getDecorView()));
        return dialog0;
    }

    @Override  // androidx.fragment.app.Fragment
    @NonNull
    public final View onCreateView(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, @Nullable Bundle bundle0) {
        View view0 = layoutInflater0.inflate((this.L ? layout.mtrl_picker_fullscreen : layout.mtrl_picker_dialog), viewGroup0);
        Context context0 = view0.getContext();
        if(this.L) {
            view0.findViewById(id.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(MaterialDatePicker.j(context0), -2));
        }
        else {
            view0.findViewById(id.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(MaterialDatePicker.j(context0), -1));
        }
        TextView textView0 = (TextView)view0.findViewById(id.mtrl_picker_header_selection_text);
        this.W = textView0;
        ViewCompat.setAccessibilityLiveRegion(textView0, 1);
        this.X = (CheckableImageButton)view0.findViewById(id.mtrl_picker_header_toggle);
        this.V = (TextView)view0.findViewById(id.mtrl_picker_title_text);
        this.X.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton0 = this.X;
        StateListDrawable stateListDrawable0 = new StateListDrawable();
        Drawable drawable0 = AppCompatResources.getDrawable(context0, drawable.material_ic_calendar_black_24dp);
        stateListDrawable0.addState(new int[]{0x10100A0}, drawable0);
        Drawable drawable1 = AppCompatResources.getDrawable(context0, drawable.material_ic_edit_black_24dp);
        stateListDrawable0.addState(new int[0], drawable1);
        checkableImageButton0.setImageDrawable(stateListDrawable0);
        this.X.setChecked(this.M != 0);
        ViewCompat.setAccessibilityDelegate(this.X, null);
        this.m(this.X);
        this.X.setOnClickListener(new t(this, 0));
        this.Z = (Button)view0.findViewById(id.confirm_button);
        if(this.i().isSelectionComplete()) {
            this.Z.setEnabled(true);
        }
        else {
            this.Z.setEnabled(false);
        }
        this.Z.setTag("CONFIRM_BUTTON_TAG");
        CharSequence charSequence0 = this.O;
        if(charSequence0 == null) {
            int v = this.N;
            if(v != 0) {
                this.Z.setText(v);
            }
        }
        else {
            this.Z.setText(charSequence0);
        }
        CharSequence charSequence1 = this.Q;
        if(charSequence1 != null) {
            this.Z.setContentDescription(charSequence1);
        }
        else if(this.P != 0) {
            this.Z.setContentDescription(this.getContext().getResources().getText(this.P));
        }
        this.Z.setOnClickListener(new u(this));
        Button button0 = (Button)view0.findViewById(id.cancel_button);
        button0.setTag("CANCEL_BUTTON_TAG");
        CharSequence charSequence2 = this.S;
        if(charSequence2 == null) {
            int v1 = this.R;
            if(v1 != 0) {
                button0.setText(v1);
            }
        }
        else {
            button0.setText(charSequence2);
        }
        CharSequence charSequence3 = this.U;
        if(charSequence3 != null) {
            button0.setContentDescription(charSequence3);
        }
        else if(this.T != 0) {
            button0.setContentDescription(this.getContext().getResources().getText(this.T));
        }
        button0.setOnClickListener(new v(this));
        return view0;
    }

    @Override  // androidx.fragment.app.DialogFragment
    public final void onDismiss(@NonNull DialogInterface dialogInterface0) {
        for(Object object0: this.C) {
            ((DialogInterface.OnDismissListener)object0).onDismiss(dialogInterface0);
        }
        ViewGroup viewGroup0 = (ViewGroup)this.getView();
        if(viewGroup0 != null) {
            viewGroup0.removeAllViews();
        }
        super.onDismiss(dialogInterface0);
    }

    @Override  // androidx.fragment.app.DialogFragment
    public final void onSaveInstanceState(@NonNull Bundle bundle0) {
        super.onSaveInstanceState(bundle0);
        bundle0.putInt("OVERRIDE_THEME_RES_ID", this.D);
        bundle0.putParcelable("DATE_SELECTOR_KEY", this.E);
        CalendarConstraints calendarConstraints0 = this.G;
        com.google.android.material.datepicker.CalendarConstraints.Builder calendarConstraints$Builder0 = new com.google.android.material.datepicker.CalendarConstraints.Builder();  // 初始化器: Ljava/lang/Object;-><init>()V
        calendarConstraints$Builder0.a = com.google.android.material.datepicker.CalendarConstraints.Builder.f;
        calendarConstraints$Builder0.b = com.google.android.material.datepicker.CalendarConstraints.Builder.g;
        DateValidatorPointForward.from(0x8000000000000000L);
        calendarConstraints$Builder0.a = calendarConstraints0.a.f;
        calendarConstraints$Builder0.b = calendarConstraints0.b.f;
        calendarConstraints$Builder0.c = calendarConstraints0.d.f;
        calendarConstraints$Builder0.d = calendarConstraints0.e;
        calendarConstraints$Builder0.e = calendarConstraints0.c;
        y y0 = this.I == null ? null : this.I.D;
        if(y0 != null) {
            calendarConstraints$Builder0.setOpenAt(y0.f);
        }
        bundle0.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints$Builder0.build());
        bundle0.putParcelable("DAY_VIEW_DECORATOR_KEY", this.H);
        bundle0.putInt("TITLE_TEXT_RES_ID_KEY", this.J);
        bundle0.putCharSequence("TITLE_TEXT_KEY", this.K);
        bundle0.putInt("INPUT_MODE_KEY", this.M);
        bundle0.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.N);
        bundle0.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.O);
        bundle0.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.P);
        bundle0.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.Q);
        bundle0.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.R);
        bundle0.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.S);
        bundle0.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.T);
        bundle0.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.U);
    }

    @Override  // androidx.fragment.app.DialogFragment
    public void onStart() {
        super.onStart();
        Window window0 = this.requireDialog().getWindow();
        if(this.L) {
            window0.setLayout(-1, -1);
            window0.setBackgroundDrawable(this.Y);
            if(!this.a0) {
                View view0 = this.requireView().findViewById(id.fullscreen_header);
                EdgeToEdgeUtils.applyEdgeToEdge(window0, true, ViewUtils.getBackgroundColor(view0), null);
                int v = view0.getPaddingTop();
                ViewCompat.setOnApplyWindowInsetsListener(view0, new w(view0.getLayoutParams().height, view0, v));
                this.a0 = true;
            }
        }
        else {
            window0.setLayout(-2, -2);
            int v1 = this.getResources().getDimensionPixelOffset(dimen.mtrl_calendar_dialog_background_inset);
            Rect rect0 = new Rect(v1, v1, v1, v1);
            window0.setBackgroundDrawable(new InsetDrawable(this.Y, v1, v1, v1, v1));
            window0.getDecorView().setOnTouchListener(new InsetDialogOnTouchListener(this.requireDialog(), rect0));
        }
        this.l();
    }

    @Override  // androidx.fragment.app.DialogFragment
    public void onStop() {
        this.F.onSelectionChangedListeners.clear();
        super.onStop();
    }

    public boolean removeOnCancelListener(DialogInterface.OnCancelListener dialogInterface$OnCancelListener0) {
        return this.B.remove(dialogInterface$OnCancelListener0);
    }

    public boolean removeOnDismissListener(DialogInterface.OnDismissListener dialogInterface$OnDismissListener0) {
        return this.C.remove(dialogInterface$OnDismissListener0);
    }

    public boolean removeOnNegativeButtonClickListener(View.OnClickListener view$OnClickListener0) {
        return this.A.remove(view$OnClickListener0);
    }

    public boolean removeOnPositiveButtonClickListener(MaterialPickerOnPositiveButtonClickListener materialPickerOnPositiveButtonClickListener0) {
        return this.z.remove(materialPickerOnPositiveButtonClickListener0);
    }

    public static long thisMonthInUtcMilliseconds() {
        Calendar calendar0 = i0.f();
        calendar0.set(5, 1);
        Calendar calendar1 = i0.c(calendar0);
        calendar1.get(2);
        calendar1.get(1);
        calendar1.getMaximum(7);
        calendar1.getActualMaximum(5);
        return calendar1.getTimeInMillis();
    }

    public static long todayInUtcMilliseconds() {
        return i0.f().getTimeInMillis();
    }
}

