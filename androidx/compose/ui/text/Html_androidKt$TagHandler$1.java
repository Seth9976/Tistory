package androidx.compose.ui.text;

import android.text.Editable;
import android.text.Html.TagHandler;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;
import org.xml.sax.XMLReader;

@Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J.\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00052\b\u0010\u0006\u001A\u0004\u0018\u00010\u00072\b\u0010\b\u001A\u0004\u0018\u00010\t2\b\u0010\n\u001A\u0004\u0018\u00010\u000BH\u0016¨\u0006\f"}, d2 = {"androidx/compose/ui/text/Html_androidKt$TagHandler$1", "Landroid/text/Html$TagHandler;", "handleTag", "", "opening", "", "tag", "", "output", "Landroid/text/Editable;", "xmlReader", "Lorg/xml/sax/XMLReader;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class Html_androidKt.TagHandler.1 implements Html.TagHandler {
    @Override  // android.text.Html$TagHandler
    public void handleTag(boolean z, @Nullable String s, @Nullable Editable editable0, @Nullable XMLReader xMLReader0) {
        if(xMLReader0 != null && editable0 != null && z && Intrinsics.areEqual(s, "ContentHandlerReplacementTag")) {
            xMLReader0.setContentHandler(new c(xMLReader0.getContentHandler(), editable0));
        }
    }
}

