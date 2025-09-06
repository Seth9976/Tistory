package androidx.databinding.adapters;

import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.InputFilter.LengthFilter;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextWatcher;
import android.text.method.DialerKeyListener;
import android.text.method.DigitsKeyListener;
import android.text.method.KeyListener;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TextKeyListener.Capitalize;
import android.text.method.TextKeyListener;
import android.util.Log;
import android.widget.TextView.BufferType;
import android.widget.TextView;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.databinding.BindingAdapter;
import androidx.databinding.BindingMethod;
import androidx.databinding.BindingMethods;
import androidx.databinding.InverseBindingAdapter;
import androidx.databinding.InverseBindingListener;
import androidx.databinding.library.baseAdapters.R.id;

@RestrictTo({Scope.LIBRARY})
@BindingMethods({@BindingMethod(attribute = "android:autoLink", method = "setAutoLinkMask", type = TextView.class), @BindingMethod(attribute = "android:drawablePadding", method = "setCompoundDrawablePadding", type = TextView.class), @BindingMethod(attribute = "android:editorExtras", method = "setInputExtras", type = TextView.class), @BindingMethod(attribute = "android:inputType", method = "setRawInputType", type = TextView.class), @BindingMethod(attribute = "android:scrollHorizontally", method = "setHorizontallyScrolling", type = TextView.class), @BindingMethod(attribute = "android:textAllCaps", method = "setAllCaps", type = TextView.class), @BindingMethod(attribute = "android:textColorHighlight", method = "setHighlightColor", type = TextView.class), @BindingMethod(attribute = "android:textColorHint", method = "setHintTextColor", type = TextView.class), @BindingMethod(attribute = "android:textColorLink", method = "setLinkTextColor", type = TextView.class), @BindingMethod(attribute = "android:onEditorAction", method = "setOnEditorActionListener", type = TextView.class)})
public class TextViewBindingAdapter {
    public interface AfterTextChanged {
        void afterTextChanged(Editable arg1);
    }

    public interface BeforeTextChanged {
        void beforeTextChanged(CharSequence arg1, int arg2, int arg3, int arg4);
    }

    public interface OnTextChanged {
        void onTextChanged(CharSequence arg1, int arg2, int arg3, int arg4);
    }

    public static final int DECIMAL = 5;
    public static final int INTEGER = 1;
    public static final int SIGNED = 3;

    public static void a(Drawable drawable0) {
        if(drawable0 != null) {
            drawable0.setBounds(0, 0, drawable0.getIntrinsicWidth(), drawable0.getIntrinsicHeight());
        }
    }

    @InverseBindingAdapter(attribute = "android:text", event = "android:textAttrChanged")
    public static String getTextString(TextView textView0) {
        return textView0.getText().toString();
    }

    @BindingAdapter({"android:autoText"})
    public static void setAutoText(TextView textView0, boolean z) {
        KeyListener keyListener0 = textView0.getKeyListener();
        TextKeyListener.Capitalize textKeyListener$Capitalize0 = TextKeyListener.Capitalize.NONE;
        int v = keyListener0 == null ? 0 : keyListener0.getInputType();
        if((v & 0x1000) != 0) {
            textKeyListener$Capitalize0 = TextKeyListener.Capitalize.CHARACTERS;
        }
        else if((v & 0x2000) != 0) {
            textKeyListener$Capitalize0 = TextKeyListener.Capitalize.WORDS;
        }
        else if((v & 0x4000) != 0) {
            textKeyListener$Capitalize0 = TextKeyListener.Capitalize.SENTENCES;
        }
        textView0.setKeyListener(TextKeyListener.getInstance(z, textKeyListener$Capitalize0));
    }

    @BindingAdapter({"android:bufferType"})
    public static void setBufferType(TextView textView0, TextView.BufferType textView$BufferType0) {
        textView0.setText(textView0.getText(), textView$BufferType0);
    }

    @BindingAdapter({"android:capitalize"})
    public static void setCapitalize(TextView textView0, TextKeyListener.Capitalize textKeyListener$Capitalize0) {
        textView0.setKeyListener(TextKeyListener.getInstance((textView0.getKeyListener().getInputType() & 0x8000) != 0, textKeyListener$Capitalize0));
    }

    @BindingAdapter({"android:digits"})
    public static void setDigits(TextView textView0, CharSequence charSequence0) {
        if(charSequence0 != null) {
            textView0.setKeyListener(DigitsKeyListener.getInstance(charSequence0.toString()));
            return;
        }
        if(textView0.getKeyListener() instanceof DigitsKeyListener) {
            textView0.setKeyListener(null);
        }
    }

    @BindingAdapter({"android:drawableBottom"})
    public static void setDrawableBottom(TextView textView0, Drawable drawable0) {
        TextViewBindingAdapter.a(drawable0);
        Drawable[] arr_drawable = textView0.getCompoundDrawables();
        textView0.setCompoundDrawables(arr_drawable[0], arr_drawable[1], arr_drawable[2], drawable0);
    }

    @BindingAdapter({"android:drawableEnd"})
    public static void setDrawableEnd(TextView textView0, Drawable drawable0) {
        TextViewBindingAdapter.a(drawable0);
        Drawable[] arr_drawable = textView0.getCompoundDrawablesRelative();
        textView0.setCompoundDrawablesRelative(arr_drawable[0], arr_drawable[1], drawable0, arr_drawable[3]);
    }

    @BindingAdapter({"android:drawableLeft"})
    public static void setDrawableLeft(TextView textView0, Drawable drawable0) {
        TextViewBindingAdapter.a(drawable0);
        Drawable[] arr_drawable = textView0.getCompoundDrawables();
        textView0.setCompoundDrawables(drawable0, arr_drawable[1], arr_drawable[2], arr_drawable[3]);
    }

    @BindingAdapter({"android:drawableRight"})
    public static void setDrawableRight(TextView textView0, Drawable drawable0) {
        TextViewBindingAdapter.a(drawable0);
        Drawable[] arr_drawable = textView0.getCompoundDrawables();
        textView0.setCompoundDrawables(arr_drawable[0], arr_drawable[1], drawable0, arr_drawable[3]);
    }

    @BindingAdapter({"android:drawableStart"})
    public static void setDrawableStart(TextView textView0, Drawable drawable0) {
        TextViewBindingAdapter.a(drawable0);
        Drawable[] arr_drawable = textView0.getCompoundDrawablesRelative();
        textView0.setCompoundDrawablesRelative(drawable0, arr_drawable[1], arr_drawable[2], arr_drawable[3]);
    }

    @BindingAdapter({"android:drawableTop"})
    public static void setDrawableTop(TextView textView0, Drawable drawable0) {
        TextViewBindingAdapter.a(drawable0);
        Drawable[] arr_drawable = textView0.getCompoundDrawables();
        textView0.setCompoundDrawables(arr_drawable[0], drawable0, arr_drawable[2], arr_drawable[3]);
    }

    @BindingAdapter({"android:imeActionId"})
    public static void setImeActionLabel(TextView textView0, int v) {
        textView0.setImeActionLabel(textView0.getImeActionLabel(), v);
    }

    @BindingAdapter({"android:imeActionLabel"})
    public static void setImeActionLabel(TextView textView0, CharSequence charSequence0) {
        textView0.setImeActionLabel(charSequence0, textView0.getImeActionId());
    }

    @BindingAdapter({"android:inputMethod"})
    public static void setInputMethod(TextView textView0, CharSequence charSequence0) {
        try {
            textView0.setKeyListener(((KeyListener)Class.forName(charSequence0.toString()).newInstance()));
        }
        catch(ClassNotFoundException classNotFoundException0) {
            Log.e("TextViewBindingAdapters", "Could not create input method: " + charSequence0, classNotFoundException0);
        }
        catch(InstantiationException instantiationException0) {
            Log.e("TextViewBindingAdapters", "Could not create input method: " + charSequence0, instantiationException0);
        }
        catch(IllegalAccessException illegalAccessException0) {
            Log.e("TextViewBindingAdapters", "Could not create input method: " + charSequence0, illegalAccessException0);
        }
    }

    @BindingAdapter({"android:lineSpacingExtra"})
    public static void setLineSpacingExtra(TextView textView0, float f) {
        textView0.setLineSpacing(f, textView0.getLineSpacingMultiplier());
    }

    @BindingAdapter({"android:lineSpacingMultiplier"})
    public static void setLineSpacingMultiplier(TextView textView0, float f) {
        textView0.setLineSpacing(textView0.getLineSpacingExtra(), f);
    }

    @BindingAdapter({"android:maxLength"})
    public static void setMaxLength(TextView textView0, int v) {
        InputFilter[] arr_inputFilter = textView0.getFilters();
        if(arr_inputFilter == null) {
            arr_inputFilter = new InputFilter[]{new InputFilter.LengthFilter(v)};
        }
        else {
            for(int v1 = 0; true; ++v1) {
                if(v1 >= arr_inputFilter.length) {
                    InputFilter[] arr_inputFilter1 = new InputFilter[arr_inputFilter.length + 1];
                    System.arraycopy(arr_inputFilter, 0, arr_inputFilter1, 0, arr_inputFilter.length);
                    arr_inputFilter1[arr_inputFilter.length] = new InputFilter.LengthFilter(v);
                    arr_inputFilter = arr_inputFilter1;
                    break;
                }
                InputFilter inputFilter0 = arr_inputFilter[v1];
                if(inputFilter0 instanceof InputFilter.LengthFilter) {
                    if(((InputFilter.LengthFilter)inputFilter0).getMax() == v) {
                        break;
                    }
                    arr_inputFilter[v1] = new InputFilter.LengthFilter(v);
                    break;
                }
            }
        }
        textView0.setFilters(arr_inputFilter);
    }

    @BindingAdapter({"android:numeric"})
    public static void setNumeric(TextView textView0, int v) {
        textView0.setKeyListener(DigitsKeyListener.getInstance((v & 3) != 0, (v & 5) != 0));
    }

    @BindingAdapter({"android:password"})
    public static void setPassword(TextView textView0, boolean z) {
        if(z) {
            textView0.setTransformationMethod(PasswordTransformationMethod.getInstance());
            return;
        }
        if(textView0.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textView0.setTransformationMethod(null);
        }
    }

    @BindingAdapter({"android:phoneNumber"})
    public static void setPhoneNumber(TextView textView0, boolean z) {
        if(z) {
            textView0.setKeyListener(DialerKeyListener.getInstance());
            return;
        }
        if(textView0.getKeyListener() instanceof DialerKeyListener) {
            textView0.setKeyListener(null);
        }
    }

    @BindingAdapter({"android:shadowColor"})
    public static void setShadowColor(TextView textView0, int v) {
        float f = textView0.getShadowDx();
        float f1 = textView0.getShadowDy();
        textView0.setShadowLayer(textView0.getShadowRadius(), f, f1, v);
    }

    @BindingAdapter({"android:shadowDx"})
    public static void setShadowDx(TextView textView0, float f) {
        int v = textView0.getShadowColor();
        float f1 = textView0.getShadowDy();
        textView0.setShadowLayer(textView0.getShadowRadius(), f, f1, v);
    }

    @BindingAdapter({"android:shadowDy"})
    public static void setShadowDy(TextView textView0, float f) {
        int v = textView0.getShadowColor();
        float f1 = textView0.getShadowDx();
        textView0.setShadowLayer(textView0.getShadowRadius(), f1, f, v);
    }

    @BindingAdapter({"android:shadowRadius"})
    public static void setShadowRadius(TextView textView0, float f) {
        int v = textView0.getShadowColor();
        textView0.setShadowLayer(f, textView0.getShadowDx(), textView0.getShadowDy(), v);
    }

    @BindingAdapter({"android:text"})
    public static void setText(TextView textView0, CharSequence charSequence0) {
        CharSequence charSequence1 = textView0.getText();
        if(charSequence0 != charSequence1 && (charSequence0 != null || charSequence1.length() != 0)) {
            if(charSequence0 instanceof Spanned) {
                if(!charSequence0.equals(charSequence1)) {
                    textView0.setText(charSequence0);
                    return;
                }
                return;
            }
            int v = 1;
            if(charSequence1 != null) {
                v = 0;
            }
            boolean z = false;
            if((charSequence0 == null ? 1 : 0) != v) {
                z = true;
            }
            else if(charSequence0 != null) {
                z = true;
                int v2 = charSequence0.length();
                if(v2 == charSequence1.length()) {
                    for(int v1 = 0; v1 < v2; ++v1) {
                        if(charSequence0.charAt(v1) != charSequence1.charAt(v1)) {
                            textView0.setText(charSequence0);
                            return;
                        }
                    }
                    return;
                }
            }
            if(z) {
                textView0.setText(charSequence0);
            }
        }
    }

    @BindingAdapter({"android:textSize"})
    public static void setTextSize(TextView textView0, float f) {
        textView0.setTextSize(0, f);
    }

    @BindingAdapter(requireAll = false, value = {"android:beforeTextChanged", "android:onTextChanged", "android:afterTextChanged", "android:textAttrChanged"})
    public static void setTextWatcher(TextView textView0, BeforeTextChanged textViewBindingAdapter$BeforeTextChanged0, OnTextChanged textViewBindingAdapter$OnTextChanged0, AfterTextChanged textViewBindingAdapter$AfterTextChanged0, InverseBindingListener inverseBindingListener0) {
        f f0 = textViewBindingAdapter$BeforeTextChanged0 != null || textViewBindingAdapter$AfterTextChanged0 != null || textViewBindingAdapter$OnTextChanged0 != null || inverseBindingListener0 != null ? new f(textViewBindingAdapter$BeforeTextChanged0, textViewBindingAdapter$OnTextChanged0, inverseBindingListener0, textViewBindingAdapter$AfterTextChanged0) : null;
        TextWatcher textWatcher0 = (TextWatcher)ListenerUtil.trackListener(textView0, f0, id.textWatcher);
        if(textWatcher0 != null) {
            textView0.removeTextChangedListener(textWatcher0);
        }
        if(f0 != null) {
            textView0.addTextChangedListener(f0);
        }
    }
}

