package androidx.compose.ui.text;

import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class j extends Lambda implements Function0 {
    public final MultiParagraphIntrinsics w;

    public j(MultiParagraphIntrinsics multiParagraphIntrinsics0) {
        this.w = multiParagraphIntrinsics0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object object0;
        List list0 = this.w.getInfoList$ui_text_release();
        if(list0.isEmpty()) {
            object0 = null;
        }
        else {
            Object object1 = list0.get(0);
            float f = ((ParagraphIntrinsicInfo)object1).getIntrinsics().getMaxIntrinsicWidth();
            int v = CollectionsKt__CollectionsKt.getLastIndex(list0);
            if(1 <= v) {
                for(int v1 = 1; true; ++v1) {
                    Object object2 = list0.get(v1);
                    float f1 = ((ParagraphIntrinsicInfo)object2).getIntrinsics().getMaxIntrinsicWidth();
                    if(Float.compare(f, f1) < 0) {
                        object1 = object2;
                        f = f1;
                    }
                    if(v1 == v) {
                        break;
                    }
                }
            }
            object0 = object1;
        }
        if(((ParagraphIntrinsicInfo)object0) != null) {
            ParagraphIntrinsics paragraphIntrinsics0 = ((ParagraphIntrinsicInfo)object0).getIntrinsics();
            return paragraphIntrinsics0 == null ? 0.0f : paragraphIntrinsics0.getMaxIntrinsicWidth();
        }
        return 0.0f;
    }
}

