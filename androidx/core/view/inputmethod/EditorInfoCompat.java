package androidx.core.view.inputmethod;

import android.annotation.SuppressLint;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.inputmethod.EditorInfo;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.r;
import androidx.core.util.Preconditions;

@SuppressLint({"PrivateConstructorForUtilityClass"})
public final class EditorInfoCompat {
    public static final int IME_FLAG_FORCE_ASCII = 0x80000000;
    public static final int IME_FLAG_NO_PERSONALIZED_LEARNING = 0x1000000;
    public static final String[] a;

    static {
        EditorInfoCompat.a = new String[0];
    }

    public static void a(EditorInfo editorInfo0, CharSequence charSequence0, int v, int v1) {
        if(editorInfo0.extras == null) {
            editorInfo0.extras = new Bundle();
        }
        SpannableStringBuilder spannableStringBuilder0 = charSequence0 == null ? null : new SpannableStringBuilder(charSequence0);
        editorInfo0.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", spannableStringBuilder0);
        editorInfo0.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", v);
        editorInfo0.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", v1);
    }

    @NonNull
    public static String[] getContentMimeTypes(@NonNull EditorInfo editorInfo0) {
        return editorInfo0.contentMimeTypes == null ? EditorInfoCompat.a : editorInfo0.contentMimeTypes;
    }

    @Nullable
    public static CharSequence getInitialSelectedText(@NonNull EditorInfo editorInfo0, int v) {
        if(Build.VERSION.SDK_INT >= 30) {
            return r.b(editorInfo0, v);
        }
        if(editorInfo0.extras == null) {
            return null;
        }
        int v1 = Math.min(editorInfo0.initialSelStart, editorInfo0.initialSelEnd);
        int v2 = Math.max(editorInfo0.initialSelStart, editorInfo0.initialSelEnd);
        int v3 = editorInfo0.extras.getInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD");
        int v4 = editorInfo0.extras.getInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END");
        if(editorInfo0.initialSelStart >= 0 && editorInfo0.initialSelEnd >= 0 && v4 - v3 == v2 - v1) {
            CharSequence charSequence0 = editorInfo0.extras.getCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT");
            if(charSequence0 == null) {
                return null;
            }
            return (v & 1) != 0 ? charSequence0.subSequence(v3, v4) : TextUtils.substring(charSequence0, v3, v4);
        }
        return null;
    }

    @Nullable
    public static CharSequence getInitialTextAfterCursor(@NonNull EditorInfo editorInfo0, int v, int v1) {
        if(Build.VERSION.SDK_INT >= 30) {
            return r.c(editorInfo0, v, v1);
        }
        Bundle bundle0 = editorInfo0.extras;
        if(bundle0 == null) {
            return null;
        }
        CharSequence charSequence0 = bundle0.getCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT");
        if(charSequence0 == null) {
            return null;
        }
        int v2 = editorInfo0.extras.getInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END");
        int v3 = Math.min(v, charSequence0.length() - v2);
        return (v1 & 1) != 0 ? charSequence0.subSequence(v2, v3 + v2) : TextUtils.substring(charSequence0, v2, v3 + v2);
    }

    @Nullable
    public static CharSequence getInitialTextBeforeCursor(@NonNull EditorInfo editorInfo0, int v, int v1) {
        if(Build.VERSION.SDK_INT >= 30) {
            return r.d(editorInfo0, v, v1);
        }
        Bundle bundle0 = editorInfo0.extras;
        if(bundle0 == null) {
            return null;
        }
        CharSequence charSequence0 = bundle0.getCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT");
        if(charSequence0 == null) {
            return null;
        }
        int v2 = editorInfo0.extras.getInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD");
        int v3 = Math.min(v, v2);
        return (v1 & 1) != 0 ? charSequence0.subSequence(v2 - v3, v2) : TextUtils.substring(charSequence0, v2 - v3, v2);
    }

    public static boolean isStylusHandwritingEnabled(@NonNull EditorInfo editorInfo0) {
        return editorInfo0.extras == null ? false : editorInfo0.extras.getBoolean("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED");
    }

    public static void setContentMimeTypes(@NonNull EditorInfo editorInfo0, @Nullable String[] arr_s) {
        editorInfo0.contentMimeTypes = arr_s;
    }

    public static void setInitialSurroundingSubText(@NonNull EditorInfo editorInfo0, @NonNull CharSequence charSequence0, int v) {
        Preconditions.checkNotNull(charSequence0);
        if(Build.VERSION.SDK_INT >= 30) {
            r.e(editorInfo0, charSequence0, v);
            return;
        }
        int v1 = editorInfo0.initialSelStart <= editorInfo0.initialSelEnd ? editorInfo0.initialSelStart - v : editorInfo0.initialSelEnd - v;
        int v2 = editorInfo0.initialSelStart <= editorInfo0.initialSelEnd ? editorInfo0.initialSelEnd - v : editorInfo0.initialSelStart - v;
        int v3 = charSequence0.length();
        if(v >= 0 && v1 >= 0 && v2 <= v3) {
            if((editorInfo0.inputType & 0xFFF) != 18 && (editorInfo0.inputType & 0xFFF) != 0x81 && (editorInfo0.inputType & 0xFFF) != 0xE1) {
                if(v3 <= 0x800) {
                    EditorInfoCompat.a(editorInfo0, charSequence0, v1, v2);
                    return;
                }
                int v4 = v2 - v1;
                int v5 = v4 <= 0x400 ? v4 : 0;
                int v6 = Math.min(charSequence0.length() - v2, 0x800 - v5 - Math.min(v1, ((int)(((double)(0x800 - v5)) * 0.8))));
                int v7 = Math.min(v1, 0x800 - v5 - v6);
                int v8 = v1 - v7;
                if(Character.isLowSurrogate(charSequence0.charAt(v8))) {
                    ++v8;
                    --v7;
                }
                if(Character.isHighSurrogate(charSequence0.charAt(v2 + v6 - 1))) {
                    --v6;
                }
                int v9 = v7 + v5;
                EditorInfoCompat.a(editorInfo0, (v5 == v4 ? charSequence0.subSequence(v8, v9 + v6 + v8) : TextUtils.concat(new CharSequence[]{charSequence0.subSequence(v8, v8 + v7), charSequence0.subSequence(v2, v6 + v2)})), v7, v9);
                return;
            }
            EditorInfoCompat.a(editorInfo0, null, 0, 0);
            return;
        }
        EditorInfoCompat.a(editorInfo0, null, 0, 0);
    }

    public static void setInitialSurroundingText(@NonNull EditorInfo editorInfo0, @NonNull CharSequence charSequence0) {
        if(Build.VERSION.SDK_INT >= 30) {
            r.e(editorInfo0, charSequence0, 0);
            return;
        }
        EditorInfoCompat.setInitialSurroundingSubText(editorInfo0, charSequence0, 0);
    }

    public static void setStylusHandwritingEnabled(@NonNull EditorInfo editorInfo0, boolean z) {
        if(editorInfo0.extras == null) {
            editorInfo0.extras = new Bundle();
        }
        editorInfo0.extras.putBoolean("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED", z);
    }
}

