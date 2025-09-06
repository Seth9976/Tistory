package com.kakao.tistory.presentation.main.ui;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.res.StringResources_androidKt;
import com.kakao.tistory.domain.entity.Blog;
import com.kakao.tistory.presentation.main.navigation.MainDestination;
import com.kakao.tistory.presentation.widget.common.FunctionStateKt;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class x extends Lambda implements Function3 {
    public final long a;
    public final List b;
    public final MainDestination c;
    public final Function1 d;
    public final Function0 e;
    public final Blog f;
    public final Function0 g;
    public final long h;

    public x(long v, List list0, MainDestination mainDestination0, Function1 function10, Function0 function00, Blog blog0, Function0 function01, long v1) {
        this.a = v;
        this.b = list0;
        this.c = mainDestination0;
        this.d = function10;
        this.e = function00;
        this.f = blog0;
        this.g = function01;
        this.h = v1;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        long v2;
        Function0 function04;
        Blog blog1;
        Function0 function03;
        Composer composer0 = (Composer)object1;
        int v = ((Number)object2).intValue();
        Intrinsics.checkNotNullParameter(((RowScope)object0), "$this$BottomBar");
        if((v & 81) == 16 && composer0.getSkipping()) {
            composer0.skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xE4C05A43, v, -1, "com.kakao.tistory.presentation.main.ui.MainBottomBar.<anonymous> (MainBottomBar.kt:56)");
        }
        RoundedCornerShape roundedCornerShape0 = RoundedCornerShapeKt.RoundedCornerShape(20);
        Modifier modifier0 = SizeKt.size-6HolHcs(ClipKt.clip(Modifier.Companion, roundedCornerShape0), this.a);
        MainDestination mainDestination0 = this.c;
        Function1 function10 = this.d;
        Function0 function00 = this.e;
        Blog blog0 = this.f;
        Function0 function01 = this.g;
        long v1 = this.h;
        for(Object object3: this.b) {
            MainDestination mainDestination1 = (MainDestination)object3;
            boolean z = mainDestination1 == mainDestination0;
            composer0.startReplaceGroup(0x248AFFE2);
            boolean z1 = composer0.changed(function10);
            boolean z2 = composer0.changed(mainDestination1);
            w w0 = composer0.rememberedValue();
            if(z1 || z2 || w0 == Composer.Companion.getEmpty()) {
                w0 = new w(function10, mainDestination1);
                composer0.updateRememberedValue(w0);
            }
            composer0.endReplaceGroup();
            Function0 function02 = FunctionStateKt.rememberImmutableFunctionState(w0, composer0, 0);
            switch(mainDestination1) {
                case 1: 
                case 2: {
                    v2 = v1;
                    function03 = function01;
                    blog1 = blog0;
                    function04 = function00;
                    composer0.startReplaceGroup(613094757);
                    BottomBarKt.BottomBarIconItem(z, function02, StringResources_androidKt.stringResource(mainDestination1.getContentDescription(), composer0, 0), mainDestination1.getUnselectedIcon(), mainDestination1.getSelectedIcon(), StringResources_androidKt.stringResource(mainDestination1.getIconContentDescription(), composer0, 0), null, modifier0, composer0, 0, 0x40);
                    composer0.endReplaceGroup();
                    break;
                }
                case 3: {
                    function03 = function01;
                    blog1 = blog0;
                    function04 = function00;
                    composer0.startReplaceGroup(0x6CDFDCCE);
                    v2 = v1;
                    BottomBarKt.BottomBarIconItem(z, function02, StringResources_androidKt.stringResource(mainDestination1.getContentDescription(), composer0, 0), mainDestination1.getUnselectedIcon(), mainDestination1.getSelectedIcon(), StringResources_androidKt.stringResource(mainDestination1.getIconContentDescription(), composer0, 0), ComposableLambdaKt.rememberComposableLambda(0xB19CD238, true, new v(v1), composer0, 54), modifier0, composer0, 0x180000, 0);
                    composer0.endReplaceGroup();
                    break;
                }
                case 4: {
                    composer0.startReplaceGroup(0x248BB450);
                    BottomBarKt.BottomBarIconItem(z, function00, StringResources_androidKt.stringResource(mainDestination1.getContentDescription(), composer0, 0), mainDestination1.getUnselectedIcon(), mainDestination1.getSelectedIcon(), StringResources_androidKt.stringResource(mainDestination1.getIconContentDescription(), composer0, 0), null, modifier0, composer0, 0, 0x40);
                    composer0.endReplaceGroup();
                    continue;
                }
                case 5: {
                    composer0.startReplaceGroup(0x6CF30B09);
                    MainBottomBarKt.access$BottomBarMyItem(blog0, z, function02, StringResources_androidKt.stringResource(mainDestination1.getContentDescription(), composer0, 0), function01, StringResources_androidKt.stringResource(mainDestination1.getIconContentDescription(), composer0, 0), modifier0, composer0, 8, 0);
                    composer0.endReplaceGroup();
                    continue;
                }
                default: {
                    composer0.startReplaceGroup(0x6CFABF88);
                    composer0.endReplaceGroup();
                    continue;
                }
            }
            function01 = function03;
            blog0 = blog1;
            function00 = function04;
            v1 = v2;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

