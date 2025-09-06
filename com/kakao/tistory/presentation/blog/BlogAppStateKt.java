package com.kakao.tistory.presentation.blog;

import android.content.Context;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.material.ModalBottomSheetKt;
import androidx.compose.material.ModalBottomSheetState;
import androidx.compose.material.ModalBottomSheetValue;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.navigation.NavHostController;
import androidx.navigation.Navigator;
import androidx.navigation.compose.NavHostControllerKt;
import com.google.accompanist.navigation.material.BottomSheetNavigator;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001C\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001A+\u0010\u0000\u001A\u00020\u00012\b\u0010\u0002\u001A\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u0007H\u0007¢\u0006\u0002\u0010\b\u001A\r\u0010\t\u001A\u00020\u0005H\u0007¢\u0006\u0002\u0010\n¨\u0006\u000B"}, d2 = {"rememberBlogAppState", "Lcom/kakao/tistory/presentation/blog/BlogAppState;", "blogName", "", "bottomSheetNavigator", "Lcom/google/accompanist/navigation/material/BottomSheetNavigator;", "navController", "Landroidx/navigation/NavHostController;", "(Ljava/lang/String;Lcom/google/accompanist/navigation/material/BottomSheetNavigator;Landroidx/navigation/NavHostController;Landroidx/compose/runtime/Composer;II)Lcom/kakao/tistory/presentation/blog/BlogAppState;", "rememberBottomSheetNavigator", "(Landroidx/compose/runtime/Composer;I)Lcom/google/accompanist/navigation/material/BottomSheetNavigator;", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nBlogAppState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlogAppState.kt\ncom/kakao/tistory/presentation/blog/BlogAppStateKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,79:1\n77#2:80\n1223#3,6:81\n1223#3,6:87\n*S KotlinDebug\n*F\n+ 1 BlogAppState.kt\ncom/kakao/tistory/presentation/blog/BlogAppStateKt\n*L\n33#1:80\n34#1:81,6\n48#1:87,6\n*E\n"})
public final class BlogAppStateKt {
    @Composable
    @NotNull
    public static final BlogAppState rememberBlogAppState(@Nullable String s, @Nullable BottomSheetNavigator bottomSheetNavigator0, @Nullable NavHostController navHostController0, @Nullable Composer composer0, int v, int v1) {
        int v2 = 1;
        composer0.startReplaceGroup(0xD370EA6);
        BottomSheetNavigator bottomSheetNavigator1 = (v1 & 2) == 0 ? bottomSheetNavigator0 : BlogAppStateKt.rememberBottomSheetNavigator(composer0, 0);
        NavHostController navHostController1 = (v1 & 4) == 0 ? navHostController0 : NavHostControllerKt.rememberNavController(new Navigator[]{bottomSheetNavigator1}, composer0, 8);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xD370EA6, v, -1, "com.kakao.tistory.presentation.blog.rememberBlogAppState (BlogAppState.kt:31)");
        }
        Object object0 = composer0.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        composer0.startReplaceGroup(0xFE5723C0);
        boolean z = (v & 14 ^ 6) > 4 && composer0.changed(s) || (v & 6) == 4;
        boolean z1 = composer0.changed(((Context)object0));
        boolean z2 = composer0.changed(navHostController1);
        if(((v & 0x70 ^ 0x30) <= 0x20 || !composer0.changed(bottomSheetNavigator1)) && (v & 0x30) != 0x20) {
            v2 = 0;
        }
        BlogAppState blogAppState0 = composer0.rememberedValue();
        if((z | z1 | z2 | v2) != 0 || blogAppState0 == Composer.Companion.getEmpty()) {
            blogAppState0 = new BlogAppState(s, ((Context)object0), navHostController1, bottomSheetNavigator1, null, 16, null);
            composer0.updateRememberedValue(blogAppState0);
        }
        composer0.endReplaceGroup();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceGroup();
        return blogAppState0;
    }

    @Composable
    @NotNull
    public static final BottomSheetNavigator rememberBottomSheetNavigator(@Nullable Composer composer0, int v) {
        composer0.startReplaceGroup(0xCC598B81);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xCC598B81, v, -1, "com.kakao.tistory.presentation.blog.rememberBottomSheetNavigator (BlogAppState.kt:41)");
        }
        SpringSpec springSpec0 = new SpringSpec(0.0f, 0.0f, null, 7, null);
        ModalBottomSheetState modalBottomSheetState0 = ModalBottomSheetKt.rememberModalBottomSheetState(ModalBottomSheetValue.Hidden, springSpec0, null, true, composer0, 0xC36, 4);
        composer0.startReplaceGroup(0xA10F89FB);
        BottomSheetNavigator bottomSheetNavigator0 = composer0.rememberedValue();
        if(bottomSheetNavigator0 == Composer.Companion.getEmpty()) {
            bottomSheetNavigator0 = new BottomSheetNavigator(modalBottomSheetState0);
            composer0.updateRememberedValue(bottomSheetNavigator0);
        }
        composer0.endReplaceGroup();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceGroup();
        return bottomSheetNavigator0;
    }
}

