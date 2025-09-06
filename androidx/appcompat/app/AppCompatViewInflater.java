package androidx.appcompat.app;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.R.styleable;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatCheckedTextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatMultiAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.appcompat.widget.AppCompatRatingBar;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.AppCompatToggleButton;
import androidx.appcompat.widget.TintContextWrapper;
import androidx.collection.SimpleArrayMap;
import androidx.core.view.ViewCompat;
import java.lang.reflect.Constructor;

public class AppCompatViewInflater {
    public final Object[] a;
    public static final Class[] b;
    public static final int[] c;
    public static final int[] d;
    public static final int[] e;
    public static final int[] f;
    public static final String[] g;
    public static final SimpleArrayMap h;

    static {
        AppCompatViewInflater.b = new Class[]{Context.class, AttributeSet.class};
        AppCompatViewInflater.c = new int[]{0x101026F};
        AppCompatViewInflater.d = new int[]{0x1010580};
        AppCompatViewInflater.e = new int[]{0x101057C};
        AppCompatViewInflater.f = new int[]{0x1010574};
        AppCompatViewInflater.g = new String[]{"android.widget.", "android.view.", "android.webkit."};
        AppCompatViewInflater.h = new SimpleArrayMap();
    }

    public AppCompatViewInflater() {
        this.a = new Object[2];
    }

    public final View a(Context context0, String s, String s1) {
        SimpleArrayMap simpleArrayMap0 = AppCompatViewInflater.h;
        Constructor constructor0 = (Constructor)simpleArrayMap0.get(s);
        try {
            if(constructor0 == null) {
                constructor0 = Class.forName((s1 == null ? s : s1 + s), false, context0.getClassLoader()).asSubclass(View.class).getConstructor(AppCompatViewInflater.b);
                simpleArrayMap0.put(s, constructor0);
            }
            constructor0.setAccessible(true);
            return (View)constructor0.newInstance(this.a);
        }
        catch(Exception unused_ex) {
            return null;
        }
    }

    public final void b(View view0, String s) {
        if(view0 == null) {
            throw new IllegalStateException(this.getClass().getName() + " asked to inflate view for <" + s + ">, but returned null");
        }
    }

    @NonNull
    public AppCompatAutoCompleteTextView createAutoCompleteTextView(Context context0, AttributeSet attributeSet0) {
        return new AppCompatAutoCompleteTextView(context0, attributeSet0);
    }

    @NonNull
    public AppCompatButton createButton(Context context0, AttributeSet attributeSet0) {
        return new AppCompatButton(context0, attributeSet0);
    }

    @NonNull
    public AppCompatCheckBox createCheckBox(Context context0, AttributeSet attributeSet0) {
        return new AppCompatCheckBox(context0, attributeSet0);
    }

    @NonNull
    public AppCompatCheckedTextView createCheckedTextView(Context context0, AttributeSet attributeSet0) {
        return new AppCompatCheckedTextView(context0, attributeSet0);
    }

    @NonNull
    public AppCompatEditText createEditText(Context context0, AttributeSet attributeSet0) {
        return new AppCompatEditText(context0, attributeSet0);
    }

    @NonNull
    public AppCompatImageButton createImageButton(Context context0, AttributeSet attributeSet0) {
        return new AppCompatImageButton(context0, attributeSet0);
    }

    @NonNull
    public AppCompatImageView createImageView(Context context0, AttributeSet attributeSet0) {
        return new AppCompatImageView(context0, attributeSet0);
    }

    @NonNull
    public AppCompatMultiAutoCompleteTextView createMultiAutoCompleteTextView(Context context0, AttributeSet attributeSet0) {
        return new AppCompatMultiAutoCompleteTextView(context0, attributeSet0);
    }

    @NonNull
    public AppCompatRadioButton createRadioButton(Context context0, AttributeSet attributeSet0) {
        return new AppCompatRadioButton(context0, attributeSet0);
    }

    @NonNull
    public AppCompatRatingBar createRatingBar(Context context0, AttributeSet attributeSet0) {
        return new AppCompatRatingBar(context0, attributeSet0);
    }

    @NonNull
    public AppCompatSeekBar createSeekBar(Context context0, AttributeSet attributeSet0) {
        return new AppCompatSeekBar(context0, attributeSet0);
    }

    @NonNull
    public AppCompatSpinner createSpinner(Context context0, AttributeSet attributeSet0) {
        return new AppCompatSpinner(context0, attributeSet0);
    }

    @NonNull
    public AppCompatTextView createTextView(Context context0, AttributeSet attributeSet0) {
        return new AppCompatTextView(context0, attributeSet0);
    }

    @NonNull
    public AppCompatToggleButton createToggleButton(Context context0, AttributeSet attributeSet0) {
        return new AppCompatToggleButton(context0, attributeSet0);
    }

    @Nullable
    public View createView(Context context0, String s, AttributeSet attributeSet0) [...] // Inlined contents

    @Nullable
    public final View createView(@Nullable View view0, @NonNull String s, @NonNull Context context0, @NonNull AttributeSet attributeSet0, boolean z, boolean z1, boolean z2, boolean z3) {
        View view2;
        View view1;
        Context context1 = !z || view0 == null ? context0 : view0.getContext();
        if(z1 || z2) {
            TypedArray typedArray0 = context1.obtainStyledAttributes(attributeSet0, styleable.View, 0, 0);
            int v = z1 ? typedArray0.getResourceId(styleable.View_android_theme, 0) : 0;
            if(z2 && v == 0) {
                v = typedArray0.getResourceId(styleable.View_theme, 0);
                if(v != 0) {
                    Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
                }
            }
            typedArray0.recycle();
            if(v != 0 && (!(context1 instanceof ContextThemeWrapper) || ((ContextThemeWrapper)context1).getThemeResId() != v)) {
                context1 = new ContextThemeWrapper(context1, v);
            }
        }
        if(z3) {
            context1 = TintContextWrapper.wrap(context1);
        }
        s.getClass();
        switch(s) {
            case "AutoCompleteTextView": {
                view1 = this.createAutoCompleteTextView(context1, attributeSet0);
                this.b(view1, s);
                break;
            }
            case "Button": {
                view1 = this.createButton(context1, attributeSet0);
                this.b(view1, s);
                break;
            }
            case "CheckBox": {
                view1 = this.createCheckBox(context1, attributeSet0);
                this.b(view1, s);
                break;
            }
            case "CheckedTextView": {
                view1 = this.createCheckedTextView(context1, attributeSet0);
                this.b(view1, s);
                break;
            }
            case "EditText": {
                view1 = this.createEditText(context1, attributeSet0);
                this.b(view1, s);
                break;
            }
            case "ImageButton": {
                view1 = this.createImageButton(context1, attributeSet0);
                this.b(view1, s);
                break;
            }
            case "ImageView": {
                view1 = this.createImageView(context1, attributeSet0);
                this.b(view1, s);
                break;
            }
            case "MultiAutoCompleteTextView": {
                view1 = this.createMultiAutoCompleteTextView(context1, attributeSet0);
                this.b(view1, s);
                break;
            }
            case "RadioButton": {
                view1 = this.createRadioButton(context1, attributeSet0);
                this.b(view1, s);
                break;
            }
            case "RatingBar": {
                view1 = this.createRatingBar(context1, attributeSet0);
                this.b(view1, s);
                break;
            }
            case "SeekBar": {
                view1 = this.createSeekBar(context1, attributeSet0);
                this.b(view1, s);
                break;
            }
            case "Spinner": {
                view1 = this.createSpinner(context1, attributeSet0);
                this.b(view1, s);
                break;
            }
            case "TextView": {
                view1 = this.createTextView(context1, attributeSet0);
                this.b(view1, s);
                break;
            }
            case "ToggleButton": {
                view1 = this.createToggleButton(context1, attributeSet0);
                this.b(view1, s);
                break;
            }
            default: {
                view1 = null;
            }
        }
        if(view1 == null && context0 != context1) {
            Object[] arr_object = this.a;
            if(s.equals("view")) {
                s = attributeSet0.getAttributeValue(null, "class");
            }
            try {
                arr_object[0] = context1;
                arr_object[1] = attributeSet0;
                if(-1 == s.indexOf(46)) {
                    int v2 = 0;
                    while(true) {
                        String[] arr_s = AppCompatViewInflater.g;
                        if(v2 >= 3) {
                            goto label_87;
                        }
                        view2 = this.a(context1, s, arr_s[v2]);
                        if(view2 != null) {
                            view1 = view2;
                            break;
                        }
                        ++v2;
                    }
                }
                else {
                    goto label_81;
                }
                goto label_88;
            }
            catch(Exception unused_ex) {
                goto label_85;
            }
            finally {
                arr_object[0] = null;
                arr_object[1] = null;
            }
            view1 = view2;
            goto label_88;
            try {
                goto label_87;
            label_81:
                View view3 = this.a(context1, s, null);
                view1 = view3;
                goto label_88;
            }
            catch(Exception unused_ex) {
            label_85:
                arr_object[0] = null;
                arr_object[1] = null;
            }
        label_87:
            view1 = null;
        }
    label_88:
        if(view1 != null) {
            Context context2 = view1.getContext();
            if(context2 instanceof ContextWrapper && ViewCompat.hasOnClickListeners(view1)) {
                TypedArray typedArray1 = context2.obtainStyledAttributes(attributeSet0, AppCompatViewInflater.c);
                String s1 = typedArray1.getString(0);
                if(s1 != null) {
                    view1.setOnClickListener(new k0(view1, s1));
                }
                typedArray1.recycle();
            }
            if(Build.VERSION.SDK_INT <= 28) {
                TypedArray typedArray2 = context1.obtainStyledAttributes(attributeSet0, AppCompatViewInflater.d);
                if(typedArray2.hasValue(0)) {
                    ViewCompat.setAccessibilityHeading(view1, typedArray2.getBoolean(0, false));
                }
                typedArray2.recycle();
                TypedArray typedArray3 = context1.obtainStyledAttributes(attributeSet0, AppCompatViewInflater.e);
                if(typedArray3.hasValue(0)) {
                    ViewCompat.setAccessibilityPaneTitle(view1, typedArray3.getString(0));
                }
                typedArray3.recycle();
                TypedArray typedArray4 = context1.obtainStyledAttributes(attributeSet0, AppCompatViewInflater.f);
                if(typedArray4.hasValue(0)) {
                    ViewCompat.setScreenReaderFocusable(view1, typedArray4.getBoolean(0, false));
                }
                typedArray4.recycle();
            }
        }
        return view1;
    }
}

