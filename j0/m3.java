package j0;

import androidx.compose.foundation.text.TextLinkScope;
import androidx.compose.ui.platform.UriHandler;
import androidx.compose.ui.text.AnnotatedString.Range;
import androidx.compose.ui.text.LinkAnnotation;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class m3 extends Lambda implements Function0 {
    public final TextLinkScope w;
    public final Range x;
    public final UriHandler y;

    public m3(TextLinkScope textLinkScope0, Range annotatedString$Range0, UriHandler uriHandler0) {
        this.w = textLinkScope0;
        this.x = annotatedString$Range0;
        this.y = uriHandler0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        TextLinkScope.access$handleLink(this.w, ((LinkAnnotation)this.x.getItem()), this.y);
        return Unit.INSTANCE;
    }
}

