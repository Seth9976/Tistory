package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface.OnKeyListener;
import android.content.DialogInterface.OnMultiChoiceClickListener;
import android.content.DialogInterface;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.annotation.ArrayRes;
import androidx.annotation.AttrRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.appcompat.R.attr;
import androidx.appcompat.R.id;
import androidx.appcompat.widget.LinearLayoutCompat.LayoutParams;
import androidx.core.view.ViewCompat;
import androidx.core.widget.NestedScrollView;

public class AlertDialog extends AppCompatDialog implements DialogInterface {
    public static class Builder {
        public final AlertController.AlertParams a;
        public final int b;

        public Builder(@NonNull Context context0) {
            this(context0, AlertDialog.d(context0, 0));
        }

        public Builder(@NonNull Context context0, @StyleRes int v) {
            this.a = new AlertController.AlertParams(new ContextThemeWrapper(context0, AlertDialog.d(context0, v)));
            this.b = v;
        }

        @NonNull
        public AlertDialog create() {
            AlertController.AlertParams alertController$AlertParams0 = this.a;
            AlertDialog alertDialog0 = new AlertDialog(alertController$AlertParams0.mContext, this.b);
            alertController$AlertParams0.apply(alertDialog0.f);
            alertDialog0.setCancelable(alertController$AlertParams0.mCancelable);
            if(alertController$AlertParams0.mCancelable) {
                alertDialog0.setCanceledOnTouchOutside(true);
            }
            alertDialog0.setOnCancelListener(alertController$AlertParams0.mOnCancelListener);
            alertDialog0.setOnDismissListener(alertController$AlertParams0.mOnDismissListener);
            DialogInterface.OnKeyListener dialogInterface$OnKeyListener0 = alertController$AlertParams0.mOnKeyListener;
            if(dialogInterface$OnKeyListener0 != null) {
                alertDialog0.setOnKeyListener(dialogInterface$OnKeyListener0);
            }
            return alertDialog0;
        }

        @NonNull
        public Context getContext() {
            return this.a.mContext;
        }

        public Builder setAdapter(ListAdapter listAdapter0, DialogInterface.OnClickListener dialogInterface$OnClickListener0) {
            this.a.mAdapter = listAdapter0;
            this.a.mOnClickListener = dialogInterface$OnClickListener0;
            return this;
        }

        public Builder setCancelable(boolean z) {
            this.a.mCancelable = z;
            return this;
        }

        public Builder setCursor(Cursor cursor0, DialogInterface.OnClickListener dialogInterface$OnClickListener0, String s) {
            this.a.mCursor = cursor0;
            this.a.mLabelColumn = s;
            this.a.mOnClickListener = dialogInterface$OnClickListener0;
            return this;
        }

        public Builder setCustomTitle(@Nullable View view0) {
            this.a.mCustomTitleView = view0;
            return this;
        }

        public Builder setIcon(@DrawableRes int v) {
            this.a.mIconId = v;
            return this;
        }

        public Builder setIcon(@Nullable Drawable drawable0) {
            this.a.mIcon = drawable0;
            return this;
        }

        public Builder setIconAttribute(@AttrRes int v) {
            TypedValue typedValue0 = new TypedValue();
            this.a.mContext.getTheme().resolveAttribute(v, typedValue0, true);
            this.a.mIconId = typedValue0.resourceId;
            return this;
        }

        @Deprecated
        public Builder setInverseBackgroundForced(boolean z) {
            this.a.mForceInverseBackground = z;
            return this;
        }

        public Builder setItems(@ArrayRes int v, DialogInterface.OnClickListener dialogInterface$OnClickListener0) {
            this.a.mItems = this.a.mContext.getResources().getTextArray(v);
            this.a.mOnClickListener = dialogInterface$OnClickListener0;
            return this;
        }

        public Builder setItems(CharSequence[] arr_charSequence, DialogInterface.OnClickListener dialogInterface$OnClickListener0) {
            this.a.mItems = arr_charSequence;
            this.a.mOnClickListener = dialogInterface$OnClickListener0;
            return this;
        }

        public Builder setMessage(@StringRes int v) {
            this.a.mMessage = this.a.mContext.getText(v);
            return this;
        }

        public Builder setMessage(@Nullable CharSequence charSequence0) {
            this.a.mMessage = charSequence0;
            return this;
        }

        public Builder setMultiChoiceItems(@ArrayRes int v, boolean[] arr_z, DialogInterface.OnMultiChoiceClickListener dialogInterface$OnMultiChoiceClickListener0) {
            this.a.mItems = this.a.mContext.getResources().getTextArray(v);
            this.a.mOnCheckboxClickListener = dialogInterface$OnMultiChoiceClickListener0;
            this.a.mCheckedItems = arr_z;
            this.a.mIsMultiChoice = true;
            return this;
        }

        public Builder setMultiChoiceItems(Cursor cursor0, String s, String s1, DialogInterface.OnMultiChoiceClickListener dialogInterface$OnMultiChoiceClickListener0) {
            this.a.mCursor = cursor0;
            this.a.mOnCheckboxClickListener = dialogInterface$OnMultiChoiceClickListener0;
            this.a.mIsCheckedColumn = s;
            this.a.mLabelColumn = s1;
            this.a.mIsMultiChoice = true;
            return this;
        }

        public Builder setMultiChoiceItems(CharSequence[] arr_charSequence, boolean[] arr_z, DialogInterface.OnMultiChoiceClickListener dialogInterface$OnMultiChoiceClickListener0) {
            this.a.mItems = arr_charSequence;
            this.a.mOnCheckboxClickListener = dialogInterface$OnMultiChoiceClickListener0;
            this.a.mCheckedItems = arr_z;
            this.a.mIsMultiChoice = true;
            return this;
        }

        public Builder setNegativeButton(@StringRes int v, DialogInterface.OnClickListener dialogInterface$OnClickListener0) {
            this.a.mNegativeButtonText = this.a.mContext.getText(v);
            this.a.mNegativeButtonListener = dialogInterface$OnClickListener0;
            return this;
        }

        public Builder setNegativeButton(CharSequence charSequence0, DialogInterface.OnClickListener dialogInterface$OnClickListener0) {
            this.a.mNegativeButtonText = charSequence0;
            this.a.mNegativeButtonListener = dialogInterface$OnClickListener0;
            return this;
        }

        public Builder setNegativeButtonIcon(Drawable drawable0) {
            this.a.mNegativeButtonIcon = drawable0;
            return this;
        }

        public Builder setNeutralButton(@StringRes int v, DialogInterface.OnClickListener dialogInterface$OnClickListener0) {
            this.a.mNeutralButtonText = this.a.mContext.getText(v);
            this.a.mNeutralButtonListener = dialogInterface$OnClickListener0;
            return this;
        }

        public Builder setNeutralButton(CharSequence charSequence0, DialogInterface.OnClickListener dialogInterface$OnClickListener0) {
            this.a.mNeutralButtonText = charSequence0;
            this.a.mNeutralButtonListener = dialogInterface$OnClickListener0;
            return this;
        }

        public Builder setNeutralButtonIcon(Drawable drawable0) {
            this.a.mNeutralButtonIcon = drawable0;
            return this;
        }

        public Builder setOnCancelListener(DialogInterface.OnCancelListener dialogInterface$OnCancelListener0) {
            this.a.mOnCancelListener = dialogInterface$OnCancelListener0;
            return this;
        }

        public Builder setOnDismissListener(DialogInterface.OnDismissListener dialogInterface$OnDismissListener0) {
            this.a.mOnDismissListener = dialogInterface$OnDismissListener0;
            return this;
        }

        public Builder setOnItemSelectedListener(AdapterView.OnItemSelectedListener adapterView$OnItemSelectedListener0) {
            this.a.mOnItemSelectedListener = adapterView$OnItemSelectedListener0;
            return this;
        }

        public Builder setOnKeyListener(DialogInterface.OnKeyListener dialogInterface$OnKeyListener0) {
            this.a.mOnKeyListener = dialogInterface$OnKeyListener0;
            return this;
        }

        public Builder setPositiveButton(@StringRes int v, DialogInterface.OnClickListener dialogInterface$OnClickListener0) {
            this.a.mPositiveButtonText = this.a.mContext.getText(v);
            this.a.mPositiveButtonListener = dialogInterface$OnClickListener0;
            return this;
        }

        public Builder setPositiveButton(CharSequence charSequence0, DialogInterface.OnClickListener dialogInterface$OnClickListener0) {
            this.a.mPositiveButtonText = charSequence0;
            this.a.mPositiveButtonListener = dialogInterface$OnClickListener0;
            return this;
        }

        public Builder setPositiveButtonIcon(Drawable drawable0) {
            this.a.mPositiveButtonIcon = drawable0;
            return this;
        }

        @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
        public Builder setRecycleOnMeasureEnabled(boolean z) {
            this.a.mRecycleOnMeasure = z;
            return this;
        }

        public Builder setSingleChoiceItems(@ArrayRes int v, int v1, DialogInterface.OnClickListener dialogInterface$OnClickListener0) {
            this.a.mItems = this.a.mContext.getResources().getTextArray(v);
            this.a.mOnClickListener = dialogInterface$OnClickListener0;
            this.a.mCheckedItem = v1;
            this.a.mIsSingleChoice = true;
            return this;
        }

        public Builder setSingleChoiceItems(Cursor cursor0, int v, String s, DialogInterface.OnClickListener dialogInterface$OnClickListener0) {
            this.a.mCursor = cursor0;
            this.a.mOnClickListener = dialogInterface$OnClickListener0;
            this.a.mCheckedItem = v;
            this.a.mLabelColumn = s;
            this.a.mIsSingleChoice = true;
            return this;
        }

        public Builder setSingleChoiceItems(ListAdapter listAdapter0, int v, DialogInterface.OnClickListener dialogInterface$OnClickListener0) {
            this.a.mAdapter = listAdapter0;
            this.a.mOnClickListener = dialogInterface$OnClickListener0;
            this.a.mCheckedItem = v;
            this.a.mIsSingleChoice = true;
            return this;
        }

        public Builder setSingleChoiceItems(CharSequence[] arr_charSequence, int v, DialogInterface.OnClickListener dialogInterface$OnClickListener0) {
            this.a.mItems = arr_charSequence;
            this.a.mOnClickListener = dialogInterface$OnClickListener0;
            this.a.mCheckedItem = v;
            this.a.mIsSingleChoice = true;
            return this;
        }

        public Builder setTitle(@StringRes int v) {
            this.a.mTitle = this.a.mContext.getText(v);
            return this;
        }

        public Builder setTitle(@Nullable CharSequence charSequence0) {
            this.a.mTitle = charSequence0;
            return this;
        }

        public Builder setView(int v) {
            this.a.mView = null;
            this.a.mViewLayoutResId = v;
            this.a.mViewSpacingSpecified = false;
            return this;
        }

        public Builder setView(View view0) {
            this.a.mView = view0;
            this.a.mViewLayoutResId = 0;
            this.a.mViewSpacingSpecified = false;
            return this;
        }

        @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
        @Deprecated
        public Builder setView(View view0, int v, int v1, int v2, int v3) {
            this.a.mView = view0;
            this.a.mViewLayoutResId = 0;
            this.a.mViewSpacingSpecified = true;
            this.a.mViewSpacingLeft = v;
            this.a.mViewSpacingTop = v1;
            this.a.mViewSpacingRight = v2;
            this.a.mViewSpacingBottom = v3;
            return this;
        }

        public AlertDialog show() {
            AlertDialog alertDialog0 = this.create();
            alertDialog0.show();
            return alertDialog0;
        }
    }

    public final l f;

    public AlertDialog(@NonNull Context context0) {
        this(context0, 0);
    }

    public AlertDialog(@NonNull Context context0, @StyleRes int v) {
        super(context0, AlertDialog.d(context0, v));
        this.f = new l(this.getContext(), this, this.getWindow());
    }

    public AlertDialog(@NonNull Context context0, boolean z, @Nullable DialogInterface.OnCancelListener dialogInterface$OnCancelListener0) {
        this(context0, 0);
        this.setCancelable(z);
        this.setOnCancelListener(dialogInterface$OnCancelListener0);
    }

    public static int d(Context context0, int v) {
        if((v >>> 24 & 0xFF) >= 1) {
            return v;
        }
        TypedValue typedValue0 = new TypedValue();
        context0.getTheme().resolveAttribute(attr.alertDialogTheme, typedValue0, true);
        return typedValue0.resourceId;
    }

    public Button getButton(int v) {
        l l0 = this.f;
        switch(v) {
            case -3: {
                return l0.w;
            }
            case -2: {
                return l0.s;
            }
            case -1: {
                return l0.o;
            }
            default: {
                l0.getClass();
                return null;
            }
        }
    }

    public ListView getListView() {
        return this.f.g;
    }

    @Override  // androidx.appcompat.app.AppCompatDialog
    public void onCreate(Bundle bundle0) {
        int v2;
        super.onCreate(bundle0);
        l l0 = this.f;
        l0.b.setContentView(l0.J);
        Window window0 = l0.c;
        View view0 = window0.findViewById(id.parentPanel);
        View view1 = view0.findViewById(id.topPanel);
        View view2 = view0.findViewById(id.contentPanel);
        View view3 = view0.findViewById(id.buttonPanel);
        ViewGroup viewGroup0 = (ViewGroup)view0.findViewById(id.customPanel);
        View view4 = l0.h;
        Context context0 = l0.a;
        if(view4 == null) {
            view4 = l0.i == 0 ? null : LayoutInflater.from(context0).inflate(l0.i, viewGroup0, false);
        }
        if(view4 == null || !l.a(view4)) {
            window0.setFlags(0x20000, 0x20000);
        }
        if(view4 == null) {
            viewGroup0.setVisibility(8);
        }
        else {
            FrameLayout frameLayout0 = (FrameLayout)window0.findViewById(id.custom);
            frameLayout0.addView(view4, new ViewGroup.LayoutParams(-1, -1));
            if(l0.n) {
                frameLayout0.setPadding(l0.j, l0.k, l0.l, l0.m);
            }
            if(l0.g != null) {
                ((LayoutParams)viewGroup0.getLayoutParams()).weight = 0.0f;
            }
        }
        View view5 = viewGroup0.findViewById(id.topPanel);
        View view6 = viewGroup0.findViewById(id.contentPanel);
        View view7 = viewGroup0.findViewById(id.buttonPanel);
        ViewGroup viewGroup1 = l.b(view5, view1);
        ViewGroup viewGroup2 = l.b(view6, view2);
        ViewGroup viewGroup3 = l.b(view7, view3);
        NestedScrollView nestedScrollView0 = (NestedScrollView)window0.findViewById(id.scrollView);
        l0.A = nestedScrollView0;
        nestedScrollView0.setFocusable(false);
        l0.A.setNestedScrollingEnabled(false);
        TextView textView0 = (TextView)viewGroup2.findViewById(0x102000B);
        l0.F = textView0;
        if(textView0 != null) {
            CharSequence charSequence0 = l0.f;
            if(charSequence0 == null) {
                textView0.setVisibility(8);
                l0.A.removeView(l0.F);
                if(l0.g == null) {
                    viewGroup2.setVisibility(8);
                }
                else {
                    ViewGroup viewGroup4 = (ViewGroup)l0.A.getParent();
                    int v = viewGroup4.indexOfChild(l0.A);
                    viewGroup4.removeViewAt(v);
                    viewGroup4.addView(l0.g, v, new ViewGroup.LayoutParams(-1, -1));
                }
            }
            else {
                textView0.setText(charSequence0);
            }
        }
        Button button0 = (Button)viewGroup3.findViewById(0x1020019);
        l0.o = button0;
        e e0 = l0.Q;
        button0.setOnClickListener(e0);
        boolean z = TextUtils.isEmpty(l0.p);
        int v1 = l0.d;
        if(!z || l0.r != null) {
            l0.o.setText(l0.p);
            Drawable drawable0 = l0.r;
            if(drawable0 != null) {
                drawable0.setBounds(0, 0, v1, v1);
                l0.o.setCompoundDrawables(l0.r, null, null, null);
            }
            l0.o.setVisibility(0);
            v2 = 1;
        }
        else {
            l0.o.setVisibility(8);
            v2 = 0;
        }
        Button button1 = (Button)viewGroup3.findViewById(0x102001A);
        l0.s = button1;
        button1.setOnClickListener(e0);
        if(!TextUtils.isEmpty(l0.t) || l0.v != null) {
            l0.s.setText(l0.t);
            Drawable drawable1 = l0.v;
            if(drawable1 != null) {
                drawable1.setBounds(0, 0, v1, v1);
                l0.s.setCompoundDrawables(l0.v, null, null, null);
            }
            l0.s.setVisibility(0);
            v2 |= 2;
        }
        else {
            l0.s.setVisibility(8);
        }
        Button button2 = (Button)viewGroup3.findViewById(0x102001B);
        l0.w = button2;
        button2.setOnClickListener(e0);
        if(!TextUtils.isEmpty(l0.x) || l0.z != null) {
            l0.w.setText(l0.x);
            Drawable drawable2 = l0.z;
            if(drawable2 != null) {
                drawable2.setBounds(0, 0, v1, v1);
                l0.w.setCompoundDrawables(l0.z, null, null, null);
            }
            l0.w.setVisibility(0);
            v2 |= 4;
        }
        else {
            l0.w.setVisibility(8);
        }
        TypedValue typedValue0 = new TypedValue();
        context0.getTheme().resolveAttribute(attr.alertDialogCenterButtons, typedValue0, true);
        if(typedValue0.data != 0) {
            switch(v2) {
                case 1: {
                    Button button3 = l0.o;
                    LinearLayout.LayoutParams linearLayout$LayoutParams0 = (LinearLayout.LayoutParams)button3.getLayoutParams();
                    linearLayout$LayoutParams0.gravity = 1;
                    linearLayout$LayoutParams0.weight = 0.5f;
                    button3.setLayoutParams(linearLayout$LayoutParams0);
                    break;
                }
                case 2: {
                    Button button4 = l0.s;
                    LinearLayout.LayoutParams linearLayout$LayoutParams1 = (LinearLayout.LayoutParams)button4.getLayoutParams();
                    linearLayout$LayoutParams1.gravity = 1;
                    linearLayout$LayoutParams1.weight = 0.5f;
                    button4.setLayoutParams(linearLayout$LayoutParams1);
                    break;
                }
                case 4: {
                    Button button5 = l0.w;
                    LinearLayout.LayoutParams linearLayout$LayoutParams2 = (LinearLayout.LayoutParams)button5.getLayoutParams();
                    linearLayout$LayoutParams2.gravity = 1;
                    linearLayout$LayoutParams2.weight = 0.5f;
                    button5.setLayoutParams(linearLayout$LayoutParams2);
                }
            }
        }
        if(v2 == 0) {
            viewGroup3.setVisibility(8);
        }
        if(l0.G == null) {
            l0.D = (ImageView)window0.findViewById(0x1020006);
            if(TextUtils.isEmpty(l0.e) || !l0.O) {
                window0.findViewById(id.title_template).setVisibility(8);
                l0.D.setVisibility(8);
                viewGroup1.setVisibility(8);
            }
            else {
                TextView textView1 = (TextView)window0.findViewById(id.alertTitle);
                l0.E = textView1;
                textView1.setText(l0.e);
                int v3 = l0.B;
                if(v3 == 0) {
                    Drawable drawable3 = l0.C;
                    if(drawable3 == null) {
                        l0.E.setPadding(l0.D.getPaddingLeft(), l0.D.getPaddingTop(), l0.D.getPaddingRight(), l0.D.getPaddingBottom());
                        l0.D.setVisibility(8);
                    }
                    else {
                        l0.D.setImageDrawable(drawable3);
                    }
                }
                else {
                    l0.D.setImageResource(v3);
                }
            }
        }
        else {
            ViewGroup.LayoutParams viewGroup$LayoutParams0 = new ViewGroup.LayoutParams(-1, -2);
            viewGroup1.addView(l0.G, 0, viewGroup$LayoutParams0);
            window0.findViewById(id.title_template).setVisibility(8);
        }
        boolean z1 = viewGroup0.getVisibility() != 8;
        boolean z2 = viewGroup1 != null && viewGroup1.getVisibility() != 8;
        boolean z3 = viewGroup3.getVisibility() != 8;
        if(!z3) {
            View view8 = viewGroup2.findViewById(id.textSpacerNoButtons);
            if(view8 != null) {
                view8.setVisibility(0);
            }
        }
        if(z2) {
            NestedScrollView nestedScrollView1 = l0.A;
            if(nestedScrollView1 != null) {
                nestedScrollView1.setClipToPadding(true);
            }
            View view9 = l0.f != null || l0.g != null ? viewGroup1.findViewById(id.titleDividerNoCustom) : null;
            if(view9 != null) {
                view9.setVisibility(0);
            }
        }
        else {
            View view10 = viewGroup2.findViewById(id.textSpacerNoTitle);
            if(view10 != null) {
                view10.setVisibility(0);
            }
        }
        AlertController.RecycleListView alertController$RecycleListView0 = l0.g;
        if(alertController$RecycleListView0 != null) {
            alertController$RecycleListView0.setHasDecor(z2, z3);
        }
        if(!z1) {
            AlertController.RecycleListView alertController$RecycleListView1 = l0.g;
            if(alertController$RecycleListView1 == null) {
                alertController$RecycleListView1 = l0.A;
            }
            if(alertController$RecycleListView1 != null) {
                View view11 = window0.findViewById(id.scrollIndicatorUp);
                View view12 = window0.findViewById(id.scrollIndicatorDown);
                ViewCompat.setScrollIndicators(alertController$RecycleListView1, z2, 3);
                if(view11 != null) {
                    viewGroup2.removeView(view11);
                }
                if(view12 != null) {
                    viewGroup2.removeView(view12);
                }
            }
        }
        AlertController.RecycleListView alertController$RecycleListView2 = l0.g;
        if(alertController$RecycleListView2 != null) {
            ListAdapter listAdapter0 = l0.H;
            if(listAdapter0 != null) {
                alertController$RecycleListView2.setAdapter(listAdapter0);
                int v4 = l0.I;
                if(v4 > -1) {
                    alertController$RecycleListView2.setItemChecked(v4, true);
                    alertController$RecycleListView2.setSelection(v4);
                }
            }
        }
    }

    @Override  // android.app.Dialog
    public boolean onKeyDown(int v, KeyEvent keyEvent0) {
        NestedScrollView nestedScrollView0 = this.f.A;
        return nestedScrollView0 == null || !nestedScrollView0.executeKeyEvent(keyEvent0) ? super.onKeyDown(v, keyEvent0) : true;
    }

    @Override  // android.app.Dialog
    public boolean onKeyUp(int v, KeyEvent keyEvent0) {
        NestedScrollView nestedScrollView0 = this.f.A;
        return nestedScrollView0 == null || !nestedScrollView0.executeKeyEvent(keyEvent0) ? super.onKeyUp(v, keyEvent0) : true;
    }

    public void setButton(int v, CharSequence charSequence0, DialogInterface.OnClickListener dialogInterface$OnClickListener0) {
        this.f.c(v, charSequence0, dialogInterface$OnClickListener0, null, null);
    }

    public void setButton(int v, CharSequence charSequence0, Drawable drawable0, DialogInterface.OnClickListener dialogInterface$OnClickListener0) {
        this.f.c(v, charSequence0, dialogInterface$OnClickListener0, null, drawable0);
    }

    public void setButton(int v, CharSequence charSequence0, Message message0) {
        this.f.c(v, charSequence0, null, message0, null);
    }

    public void setCustomTitle(View view0) {
        this.f.G = view0;
    }

    public void setIcon(int v) {
        this.f.d(v);
    }

    public void setIcon(Drawable drawable0) {
        l l0 = this.f;
        l0.C = drawable0;
        l0.B = 0;
        ImageView imageView0 = l0.D;
        if(imageView0 != null) {
            if(drawable0 != null) {
                imageView0.setVisibility(0);
                l0.D.setImageDrawable(drawable0);
                return;
            }
            imageView0.setVisibility(8);
        }
    }

    public void setIconAttribute(int v) {
        TypedValue typedValue0 = new TypedValue();
        this.getContext().getTheme().resolveAttribute(v, typedValue0, true);
        this.f.d(typedValue0.resourceId);
    }

    public void setMessage(CharSequence charSequence0) {
        this.f.f = charSequence0;
        TextView textView0 = this.f.F;
        if(textView0 != null) {
            textView0.setText(charSequence0);
        }
    }

    @Override  // androidx.appcompat.app.AppCompatDialog
    public void setTitle(CharSequence charSequence0) {
        super.setTitle(charSequence0);
        this.f.e = charSequence0;
        TextView textView0 = this.f.E;
        if(textView0 != null) {
            textView0.setText(charSequence0);
        }
    }

    public void setView(View view0) {
        this.f.h = view0;
        this.f.i = 0;
        this.f.n = false;
    }

    public void setView(View view0, int v, int v1, int v2, int v3) {
        this.f.h = view0;
        this.f.i = 0;
        this.f.n = true;
        this.f.j = v;
        this.f.k = v1;
        this.f.l = v2;
        this.f.m = v3;
    }
}

