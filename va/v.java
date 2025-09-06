package va;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MovableContent;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.res.StringResources_androidKt;
import com.kakao.kandinsky.crop.CropScreenKt;
import com.kakao.kandinsky.crop.contract.TouchDragPoint;
import com.kakao.kandinsky.designsystem.common.MenuButtonKt;
import com.kakao.kandinsky.signature.ui.SignatureMenu;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import p9.a;
import z1.m;

public final class v extends Lambda implements Function2 {
    public final int w;
    public final Object x;
    public final Object y;

    public v(int v, Object object0, Object object1) {
        this.w = v;
        this.y = object0;
        this.x = object1;
        super(2);
    }

    public v(Function1 function10, State state0) {
        this.w = 1;
        this.x = function10;
        this.y = state0;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        switch(this.w) {
            case 0: {
                int v = ((Number)object1).intValue();
                if((v & 11) == 2 && ((Composer)object0).getSkipping()) {
                    ((Composer)object0).skipToGroupEnd();
                    return Unit.INSTANCE;
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(396551830, v, -1, "com.kakao.kandinsky.signature.ui.SignatureMenu.<anonymous> (SignatureMenu.kt:23)");
                }
                for(Object object2: SignatureMenu.getEntries()) {
                    SignatureMenu signatureMenu0 = (SignatureMenu)object2;
                    int v1 = signatureMenu0.getIconResId();
                    boolean z = false;
                    String s = StringResources_androidKt.stringResource(signatureMenu0.getTitleResId(), ((Composer)object0), 0);
                    if(((SignatureMenu)this.y) == signatureMenu0) {
                        z = true;
                    }
                    ((Composer)object0).startReplaceGroup(0xEE6FCE94);
                    Function1 function10 = (Function1)this.x;
                    boolean z1 = ((Composer)object0).changed(function10);
                    boolean z2 = ((Composer)object0).changed(signatureMenu0);
                    a a0 = ((Composer)object0).rememberedValue();
                    if(z1 || z2 || a0 == Composer.Companion.getEmpty()) {
                        a0 = new a(10, function10, signatureMenu0);
                        ((Composer)object0).updateRememberedValue(a0);
                    }
                    ((Composer)object0).endReplaceGroup();
                    MenuButtonKt.MenuIconTextToggleButton(v1, s, z, a0, ((Composer)object0), 0);
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
            case 1: {
                Intrinsics.checkNotNullParameter(((TouchDragPoint)object1), "touchPoint");
                ((Function1)this.x).invoke(Boolean.FALSE);
                CropScreenKt.access$CropScreen$lambda$0(((State)this.y)).getOnDrag().invoke(Offset.box-impl(((Offset)object0).unbox-impl()), ((TouchDragPoint)object1));
                return Unit.INSTANCE;
            }
            case 2: {
                int v2 = ((Number)object1).intValue();
                if((v2 & 3) == 2 && ((Composer)object0).getSkipping()) {
                    ((Composer)object0).skipToGroupEnd();
                    return Unit.INSTANCE;
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(0x12D6006F, v2, -1, "androidx.compose.runtime.ComposerImpl.invokeMovableContentLambda.<anonymous> (Composer.kt:3291)");
                }
                ((MovableContent)this.y).getContent().invoke(this.x, ((Composer)object0), 0);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
            case 3: {
                int v3 = ((Number)object1).intValue();
                if((v3 & 3) == 2 && ((Composer)object0).getSkipping()) {
                    ((Composer)object0).skipToGroupEnd();
                    return Unit.INSTANCE;
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1750409193, v3, -1, "androidx.compose.ui.layout.LayoutNodeSubcompositionsState.subcompose.<anonymous>.<anonymous>.<anonymous> (SubcomposeLayout.kt:493)");
                }
                Boolean boolean0 = (Boolean)((m)this.y).f.getValue();
                boolean z3 = boolean0.booleanValue();
                ((Composer)object0).startReusableGroup(0xCF, boolean0);
                boolean z4 = ((Composer)object0).changed(z3);
                ((Composer)object0).startReplaceGroup(0xCC294FAD);
                if(z3) {
                    ((Function2)this.x).invoke(((Composer)object0), 0);
                }
                else {
                    ((Composer)object0).deactivateToEndGroup(z4);
                }
                ((Composer)object0).endReplaceGroup();
                ((Composer)object0).endReusableGroup();
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
            default: {
                return !Intrinsics.areEqual(((DeclarationDescriptor)object0), ((CallableDescriptor)this.y)) || !Intrinsics.areEqual(((DeclarationDescriptor)object1), ((CallableDescriptor)this.x)) ? false : true;
            }
        }
    }
}

