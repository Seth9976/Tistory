package androidx.compose.ui.text;

import android.graphics.Picture;
import androidx.compose.material3.carousel.Keyline;
import androidx.compose.material3.carousel.KeylineList;
import androidx.compose.material3.carousel.KeylineListScope;
import androidx.compose.material3.carousel.StrategyKt;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class i extends Lambda implements Function1 {
    public final int w;
    public final int x;
    public final int y;
    public final Object z;

    public i(int v, int v1, int v2, Object object0) {
        this.w = v2;
        this.z = object0;
        this.x = v;
        this.y = v1;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        switch(this.w) {
            case 0: {
                Path path0 = ((ParagraphInfo)object0).toGlobal(((ParagraphInfo)object0).getParagraph().getPathForRange(((ParagraphInfo)object0).toLocalIndex(this.x), ((ParagraphInfo)object0).toLocalIndex(this.y)));
                Path.addPath-Uv8p0NA$default(((Path)this.z), path0, 0L, 2, null);
                return Unit.INSTANCE;
            }
            case 1: {
                List list0 = StrategyKt.access$move(CollectionsKt___CollectionsKt.toMutableList(((KeylineList)this.z)), this.x, this.y);
                int v3 = list0.size();
                for(int v4 = 0; v4 < v3; ++v4) {
                    Keyline keyline0 = (Keyline)list0.get(v4);
                    ((KeylineListScope)object0).add(keyline0.getSize(), keyline0.isAnchor());
                }
                return Unit.INSTANCE;
            }
            default: {
                Canvas canvas0 = AndroidCanvas_androidKt.Canvas(((Picture)this.z).beginRecording(this.x, this.y));
                LayoutDirection layoutDirection0 = ((ContentDrawScope)object0).getLayoutDirection();
                long v = ((ContentDrawScope)object0).getSize-NH-jbRc();
                Density density0 = ((ContentDrawScope)object0).getDrawContext().getDensity();
                LayoutDirection layoutDirection1 = ((ContentDrawScope)object0).getDrawContext().getLayoutDirection();
                Canvas canvas1 = ((ContentDrawScope)object0).getDrawContext().getCanvas();
                long v1 = ((ContentDrawScope)object0).getDrawContext().getSize-NH-jbRc();
                GraphicsLayer graphicsLayer0 = ((ContentDrawScope)object0).getDrawContext().getGraphicsLayer();
                DrawContext drawContext0 = ((ContentDrawScope)object0).getDrawContext();
                drawContext0.setDensity(((ContentDrawScope)object0));
                drawContext0.setLayoutDirection(layoutDirection0);
                drawContext0.setCanvas(canvas0);
                drawContext0.setSize-uvyYCjk(v);
                drawContext0.setGraphicsLayer(null);
                canvas0.save();
                try {
                    ((ContentDrawScope)object0).drawContent();
                }
                finally {
                    canvas0.restore();
                    DrawContext drawContext1 = ((ContentDrawScope)object0).getDrawContext();
                    drawContext1.setDensity(density0);
                    drawContext1.setLayoutDirection(layoutDirection1);
                    drawContext1.setCanvas(canvas1);
                    drawContext1.setSize-uvyYCjk(v1);
                    drawContext1.setGraphicsLayer(graphicsLayer0);
                }
                ((Picture)this.z).endRecording();
                AndroidCanvas_androidKt.getNativeCanvas(((ContentDrawScope)object0).getDrawContext().getCanvas()).drawPicture(((Picture)this.z));
                return Unit.INSTANCE;
            }
        }
    }
}

