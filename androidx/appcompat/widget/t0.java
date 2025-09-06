package androidx.appcompat.widget;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;

public abstract class t0 {
    @DoNotInline
    @NonNull
    public static TextClassifier a(@NonNull TextView textView0) {
        TextClassificationManager textClassificationManager0 = (TextClassificationManager)textView0.getContext().getSystemService(TextClassificationManager.class);
        return textClassificationManager0 == null ? TextClassifier.NO_OP : textClassificationManager0.getTextClassifier();
    }
}

