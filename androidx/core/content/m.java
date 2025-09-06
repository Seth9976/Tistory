package androidx.core.content;

import android.content.ClipData.Item;
import androidx.annotation.DoNotInline;
import androidx.core.util.Consumer;

public abstract class m {
    @DoNotInline
    public static void a(int v, ClipData.Item clipData$Item0, Consumer consumer0) {
        if(clipData$Item0.getHtmlText() != null || clipData$Item0.getIntent() != null || clipData$Item0.getTextLinks() != null) {
            consumer0.accept("ClipData item at position " + v + " contains htmlText, textLinks or intent: " + clipData$Item0);
        }
    }
}

