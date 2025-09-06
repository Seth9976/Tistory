package k2;

import android.text.style.ClickableSpan;
import android.view.View;
import androidx.compose.ui.text.LinkAnnotation;
import androidx.compose.ui.text.LinkInteractionListener;
import org.jetbrains.annotations.NotNull;

public final class d extends ClickableSpan {
    public final LinkAnnotation a;

    public d(LinkAnnotation linkAnnotation0) {
        this.a = linkAnnotation0;
    }

    @Override  // android.text.style.ClickableSpan
    public void onClick(@NotNull View view0) {
        LinkAnnotation linkAnnotation0 = this.a;
        LinkInteractionListener linkInteractionListener0 = linkAnnotation0.getLinkInteractionListener();
        if(linkInteractionListener0 != null) {
            linkInteractionListener0.onClick(linkAnnotation0);
        }
    }
}

