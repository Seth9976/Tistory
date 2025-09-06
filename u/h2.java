package u;

import androidx.compose.foundation.IndicationInstance;
import androidx.compose.ui.draw.DrawModifier;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;

public final class h2 implements DrawModifier {
    public final IndicationInstance a;

    public h2(IndicationInstance indicationInstance0) {
        this.a = indicationInstance0;
    }

    @Override  // androidx.compose.ui.draw.DrawModifier
    public final void draw(ContentDrawScope contentDrawScope0) {
        this.a.drawIndication(contentDrawScope0);
    }
}

