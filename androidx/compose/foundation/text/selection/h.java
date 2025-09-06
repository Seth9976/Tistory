package androidx.compose.foundation.text.selection;

import androidx.compose.material3.ui;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import ff.g;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import r0.a;

public final class h extends Lambda implements Function1 {
    public final Object A;
    public final int w;
    public final boolean x;
    public final Object y;
    public final Object z;

    public h(Object object0, boolean z, Object object1, Object object2, int v) {
        this.w = v;
        this.y = object0;
        this.x = z;
        this.z = object1;
        this.A = object2;
        super(1);
    }

    public h(TypeAttributes typeAttributes0, TypeConstructor typeConstructor0, List list0, boolean z) {
        this.w = 2;
        this.y = typeConstructor0;
        this.z = list0;
        this.A = typeAttributes0;
        this.x = z;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        switch(this.w) {
            case 0: {
                ((ContentDrawScope)object0).drawContent();
                if(((Boolean)((Function0)this.y).invoke()).booleanValue()) {
                    if(this.x) {
                        long v = ((ContentDrawScope)object0).getCenter-F1C5BW0();
                        DrawContext drawContext0 = ((ContentDrawScope)object0).getDrawContext();
                        long v1 = drawContext0.getSize-NH-jbRc();
                        drawContext0.getCanvas().save();
                        try {
                            drawContext0.getTransform().scale-0AR0LA0(-1.0f, 1.0f, v);
                            DrawScope.drawImage-gbVJVH8$default(((ContentDrawScope)object0), ((ImageBitmap)this.z), 0L, 0.0f, null, ((ColorFilter)this.A), 0, 46, null);
                            return Unit.INSTANCE;
                        }
                        finally {
                            a.y(drawContext0, v1);
                        }
                    }
                    DrawScope.drawImage-gbVJVH8$default(((ContentDrawScope)object0), ((ImageBitmap)this.z), 0L, 0.0f, null, ((ColorFilter)this.A), 0, 46, null);
                }
                return Unit.INSTANCE;
            }
            case 1: {
                SemanticsPropertiesKt.setContentDescription(((SemanticsPropertyReceiver)object0), ((String)this.y));
                if(this.x) {
                    SemanticsPropertiesKt.setStateDescription(((SemanticsPropertyReceiver)object0), ((String)this.z));
                }
                SemanticsPropertiesKt.onClick$default(((SemanticsPropertyReceiver)object0), null, new ui(((FocusRequester)this.A), 0), 1, null);
                return Unit.INSTANCE;
            }
            default: {
                Intrinsics.checkNotNullParameter(((KotlinTypeRefiner)object0), "refiner");
                List list0 = (List)this.z;
                g g0 = KotlinTypeFactory.access$refineConstructor(KotlinTypeFactory.INSTANCE, ((TypeConstructor)this.y), ((KotlinTypeRefiner)object0), list0);
                if(g0 == null) {
                    return null;
                }
                SimpleType simpleType0 = g0.a;
                if(simpleType0 != null) {
                    return simpleType0;
                }
                Intrinsics.checkNotNull(g0.b);
                return KotlinTypeFactory.simpleType(((TypeAttributes)this.A), g0.b, list0, this.x, ((KotlinTypeRefiner)object0));
            }
        }
    }
}

