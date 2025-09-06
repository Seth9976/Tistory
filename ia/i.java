package ia;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier.Companion;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.AnnotatedString.Builder;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.room.a;
import com.kakao.feature.home.R.drawable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class i extends Lambda implements Function3 {
    public final int w;
    public final int x;

    public i(int v, int v1) {
        this.w = v;
        this.x = v1;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        Intrinsics.checkNotNullParameter(((BoxScope)object0), "$this$KDButton");
        if((v & 81) == 16 && ((Composer)object1).getSkipping()) {
            ((Composer)object1).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xADF0B5EE, v, -1, "com.kakao.kandinsky.home.ImageIndex.<anonymous> (HomeScreen.kt:179)");
        }
        int v1 = this.x;
        Companion modifier$Companion0 = Modifier.Companion;
        MeasurePolicy measurePolicy0 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getCenterVertically(), ((Composer)object1), 0x30);
        int v2 = ComposablesKt.getCurrentCompositeKeyHash(((Composer)object1), 0);
        CompositionLocalMap compositionLocalMap0 = ((Composer)object1).getCurrentCompositionLocalMap();
        Modifier modifier0 = ComposedModifierKt.materializeModifier(((Composer)object1), modifier$Companion0);
        androidx.compose.ui.node.ComposeUiNode.Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
        Function0 function00 = composeUiNode$Companion0.getConstructor();
        if(((Composer)object1).getApplier() == null) {
            ComposablesKt.invalidApplier();
        }
        ((Composer)object1).startReusableNode();
        if(((Composer)object1).getInserting()) {
            ((Composer)object1).createNode(function00);
        }
        else {
            ((Composer)object1).useNode();
        }
        Composer composer0 = Updater.constructor-impl(((Composer)object1));
        Function2 function20 = a.r(composeUiNode$Companion0, composer0, measurePolicy0, composer0, compositionLocalMap0);
        if(composer0.getInserting() || !Intrinsics.areEqual(composer0.rememberedValue(), v2)) {
            a.t(v2, composer0, v2, function20);
        }
        Updater.set-impl(composer0, modifier0, composeUiNode$Companion0.getSetModifier());
        ((Composer)object1).startReplaceGroup(-715412308);
        Builder annotatedString$Builder0 = new Builder(0, 1, null);
        int v3 = annotatedString$Builder0.pushStyle(new SpanStyle(MaterialTheme.INSTANCE.getColorScheme(((Composer)object1), MaterialTheme.$stable).getSecondary-0d7_KjU(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 0xFFFE, null));
        try {
            annotatedString$Builder0.append(String.valueOf(v1 + 1));
        }
        finally {
            annotatedString$Builder0.pop(v3);
        }
        annotatedString$Builder0.append(" / " + this.w);
        AnnotatedString annotatedString0 = annotatedString$Builder0.toAnnotatedString();
        ((Composer)object1).endReplaceGroup();
        TextStyle textStyle0 = MaterialTheme.INSTANCE.getTypography(((Composer)object1), MaterialTheme.$stable).getBodySmall();
        TextKt.Text-IbK3jfQ(annotatedString0, PaddingKt.padding-qDBjuR0$default(modifier$Companion0, 0.0f, 0.0f, 0.0f, 1.0f, 7, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, textStyle0, ((Composer)object1), 0x30, 0, 0x1FFFC);
        SpacerKt.Spacer(SizeKt.width-3ABfNKs(modifier$Companion0, 6.0f), ((Composer)object1), 6);
        IconKt.Icon-ww6aTOc(PainterResources_androidKt.painterResource(drawable.action_fold_small, ((Composer)object1), 0), null, null, 0L, ((Composer)object1), 56, 12);
        ((Composer)object1).endNode();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

