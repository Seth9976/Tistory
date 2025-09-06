package androidx.compose.material3;

import androidx.compose.material3.tokens.ListTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class cc extends Lambda implements Function2 {
    public final int w;
    public final ListItemColors x;
    public final Function2 y;

    public cc(ListItemColors listItemColors0, Function2 function20, int v) {
        this.w = v;
        this.x = listItemColors0;
        this.y = function20;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        switch(this.w) {
            case 0: {
                int v1 = ((Number)object1).intValue();
                if((v1 & 3) == 2 && ((Composer)object0).getSkipping()) {
                    ((Composer)object0).skipToGroupEnd();
                    return Unit.INSTANCE;
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(0xE7F6E615, v1, -1, "androidx.compose.material3.ListItem.<anonymous> (ListItem.kt:105)");
                }
                ListItemKt.access$ProvideTextStyleFromToken-3J-VO9M(this.x.headlineColor-vNxB06k$material3_release(true), ListTokens.INSTANCE.getListItemLabelTextFont(), this.y, ((Composer)object0), 0x30);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
            case 1: {
                int v2 = ((Number)object1).intValue();
                if((v2 & 3) == 2 && ((Composer)object0).getSkipping()) {
                    ((Composer)object0).skipToGroupEnd();
                    return Unit.INSTANCE;
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(0xD26F8D70, v2, -1, "androidx.compose.material3.ListItem.<anonymous>.<anonymous> (ListItem.kt:124)");
                }
                ListItemKt.access$ProvideTextStyleFromToken-3J-VO9M(this.x.overlineColor-0d7_KjU$material3_release(), ListTokens.INSTANCE.getListItemOverlineFont(), this.y, ((Composer)object0), 0x30);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
            default: {
                int v = ((Number)object1).intValue();
                if((v & 3) == 2 && ((Composer)object0).getSkipping()) {
                    ((Composer)object0).skipToGroupEnd();
                    return Unit.INSTANCE;
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1020860251, v, -1, "androidx.compose.material3.ListItem.<anonymous>.<anonymous> (ListItem.kt:114)");
                }
                ListItemKt.access$ProvideTextStyleFromToken-3J-VO9M(this.x.supportingColor-0d7_KjU$material3_release(), ListTokens.INSTANCE.getListItemSupportingTextFont(), this.y, ((Composer)object0), 0x30);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
        }
    }
}

