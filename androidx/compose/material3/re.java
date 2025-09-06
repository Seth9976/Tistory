package androidx.compose.material3;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.material.TextFieldColors;
import androidx.compose.material.TextFieldDefaults;
import androidx.compose.material3.internal.ProvideContentColorTextStyleKt;
import androidx.compose.material3.tokens.NavigationBarTokens;
import androidx.compose.material3.tokens.NavigationRailTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.text.TextStyle;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class re extends Lambda implements Function2 {
    public final Object A;
    public final int w;
    public final boolean x;
    public final boolean y;
    public final Object z;

    public re(InteractionSource interactionSource0, TextFieldColors textFieldColors0, boolean z, boolean z1) {
        this.w = 2;
        this.x = z;
        this.y = z1;
        this.A = interactionSource0;
        this.z = textFieldColors0;
        super(2);
    }

    public re(Object object0, boolean z, boolean z1, Function2 function20, int v) {
        this.w = v;
        this.A = object0;
        this.x = z;
        this.y = z1;
        this.z = function20;
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
                    ComposerKt.traceEventStart(0x620C84C8, v1, -1, "androidx.compose.material3.NavigationBarItem.<anonymous>.<anonymous> (NavigationBar.kt:201)");
                }
                TextStyle textStyle0 = TypographyKt.getValue(NavigationBarTokens.INSTANCE.getLabelTextFont(), ((Composer)object0), 6);
                ProvideContentColorTextStyleKt.ProvideContentColorTextStyle-3J-VO9M(((Color)SingleValueAnimationKt.animateColorAsState-euL9pac(((NavigationBarItemColors)this.A).textColor-WaAFU9c$material3_release(this.x, this.y), AnimationSpecKt.tween$default(100, 0, null, 6, null), null, null, ((Composer)object0), 0x30, 12).getValue()).unbox-impl(), textStyle0, ((Function2)this.z), ((Composer)object0), 0);
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
                    ComposerKt.traceEventStart(0xF9B9B6A1, v2, -1, "androidx.compose.material3.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:201)");
                }
                TextStyle textStyle1 = TypographyKt.getValue(NavigationRailTokens.INSTANCE.getLabelTextFont(), ((Composer)object0), 6);
                ProvideContentColorTextStyleKt.ProvideContentColorTextStyle-3J-VO9M(((Color)SingleValueAnimationKt.animateColorAsState-euL9pac(((NavigationRailItemColors)this.A).textColor-WaAFU9c$material3_release(this.x, this.y), AnimationSpecKt.tween$default(150, 0, null, 6, null), null, null, ((Composer)object0), 0x30, 12).getValue()).unbox-impl(), textStyle1, ((Function2)this.z), ((Composer)object0), 0);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
            default: {
                int v = ((Number)object1).intValue();
                if((v & 11) == 2 && ((Composer)object0).getSkipping()) {
                    ((Composer)object0).skipToGroupEnd();
                    return Unit.INSTANCE;
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(0x4B37506D, v, -1, "androidx.compose.material.TextFieldDefaults.OutlinedTextFieldDecorationBox.<anonymous> (TextFieldDefaults.kt:667)");
                }
                TextFieldDefaults.INSTANCE.BorderBox-nbWgWpA(this.x, this.y, ((InteractionSource)this.A), ((TextFieldColors)this.z), null, 0.0f, 0.0f, ((Composer)object0), 0xC00000, 0x70);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
        }
    }
}

