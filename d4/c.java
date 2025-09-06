package d4;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.widget.TextView;
import androidx.emoji2.text.EmojiCompat.InitCallback;
import androidx.emoji2.text.EmojiCompat;
import java.lang.ref.WeakReference;

public final class c extends InitCallback {
    public final WeakReference a;
    public final WeakReference b;

    public c(TextView textView0, d d0) {
        this.a = new WeakReference(textView0);
        this.b = new WeakReference(d0);
    }

    @Override  // androidx.emoji2.text.EmojiCompat$InitCallback
    public final void onInitialized() {
        super.onInitialized();
        TextView textView0 = (TextView)this.a.get();
        InputFilter inputFilter0 = (InputFilter)this.b.get();
        if(inputFilter0 != null && textView0 != null) {
            InputFilter[] arr_inputFilter = textView0.getFilters();
            if(arr_inputFilter != null) {
                for(int v = 0; v < arr_inputFilter.length; ++v) {
                    if(arr_inputFilter[v] == inputFilter0) {
                        if(textView0.isAttachedToWindow()) {
                            CharSequence charSequence0 = textView0.getText();
                            CharSequence charSequence1 = EmojiCompat.get().process(charSequence0);
                            if(charSequence0 == charSequence1) {
                                return;
                            }
                            int v1 = Selection.getSelectionStart(charSequence1);
                            int v2 = Selection.getSelectionEnd(charSequence1);
                            textView0.setText(charSequence1);
                            if(charSequence1 instanceof Spannable) {
                                if(v1 >= 0 && v2 >= 0) {
                                    Selection.setSelection(((Spannable)charSequence1), v1, v2);
                                    return;
                                }
                                if(v1 >= 0) {
                                    Selection.setSelection(((Spannable)charSequence1), v1);
                                    return;
                                }
                                if(v2 >= 0) {
                                    Selection.setSelection(((Spannable)charSequence1), v2);
                                }
                            }
                        }
                        return;
                    }
                }
            }
        }
    }
}

