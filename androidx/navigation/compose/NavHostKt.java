package androidx.navigation.compose;

import aa.l;
import android.annotation.SuppressLint;
import androidx.activity.compose.PredictiveBackHandlerKt;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.SizeTransform;
import androidx.compose.animation.core.SeekableTransitionState;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.material3.sf;
import androidx.compose.material3.v2;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer.Companion;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.compose.runtime.saveable.SaveableStateHolderKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestination;
import androidx.navigation.NavGraph;
import androidx.navigation.NavGraphBuilder;
import androidx.navigation.NavHostController;
import androidx.navigation.Navigator;
import ca.a1;
import j0.b2;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import o4.a0;
import o4.b0;
import o4.c0;
import o4.d0;
import o4.h;
import o4.i;
import o4.j;
import o4.k;
import o4.m;
import o4.n;
import o4.o;
import o4.p;
import o4.q;
import o4.r;
import o4.s;
import o4.u;
import o4.v;
import o4.w;
import o4.x;
import o4.y;
import o4.z;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0004\u001AN\u0010\f\u001A\u00020\t2\u0006\u0010\u0001\u001A\u00020\u00002\u0006\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u00022\u0017\u0010\u000B\u001A\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u00A2\u0006\u0002\b\nH\u0007\u00A2\u0006\u0004\b\f\u0010\r\u001A\u00DC\u0001\u0010\f\u001A\u00020\t2\u0006\u0010\u0001\u001A\u00020\u00002\u0006\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u000F\u001A\u00020\u000E2\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u00022\u001F\b\u0002\u0010\u0013\u001A\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0004\u0012\u00020\u00120\u0007\u00A2\u0006\u0002\b\n2\u001F\b\u0002\u0010\u0015\u001A\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0004\u0012\u00020\u00140\u0007\u00A2\u0006\u0002\b\n2\u001F\b\u0002\u0010\u0016\u001A\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0004\u0012\u00020\u00120\u0007\u00A2\u0006\u0002\b\n2\u001F\b\u0002\u0010\u0017\u001A\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0004\u0012\u00020\u00140\u0007\u00A2\u0006\u0002\b\n2\u0017\u0010\u000B\u001A\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u00A2\u0006\u0002\b\nH\u0007\u00A2\u0006\u0004\b\f\u0010\u0018\u001A\u009A\u0002\u0010\f\u001A\u00020\t2\u0006\u0010\u0001\u001A\u00020\u00002\u0006\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u000F\u001A\u00020\u000E2\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u00022$\b\u0002\u0010\u0013\u001A\u001E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0004\u0012\u00020\u00120\u0007\u00A2\u0006\u0002\b\u0019\u00A2\u0006\u0002\b\n2$\b\u0002\u0010\u0015\u001A\u001E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0004\u0012\u00020\u00140\u0007\u00A2\u0006\u0002\b\u0019\u00A2\u0006\u0002\b\n2$\b\u0002\u0010\u0016\u001A\u001E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0004\u0012\u00020\u00120\u0007\u00A2\u0006\u0002\b\u0019\u00A2\u0006\u0002\b\n2$\b\u0002\u0010\u0017\u001A\u001E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0004\u0012\u00020\u00140\u0007\u00A2\u0006\u0002\b\u0019\u00A2\u0006\u0002\b\n2(\b\u0002\u0010\u001B\u001A\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001A\u0018\u00010\u0007\u00A2\u0006\u0002\b\u0019\u00A2\u0006\u0002\b\n2\u0017\u0010\u000B\u001A\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u00A2\u0006\u0002\b\nH\u0007\u00A2\u0006\u0004\b\f\u0010\u001C\u001A\u00C1\u0002\u0010\f\u001A\u00020\t2\u0006\u0010\u0001\u001A\u00020\u00002\n\u0010\u0003\u001A\u0006\u0012\u0002\b\u00030\u001D2\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u000F\u001A\u00020\u000E2\u000E\b\u0002\u0010\u0006\u001A\b\u0012\u0002\b\u0003\u0018\u00010\u001D2\u001D\b\u0002\u0010!\u001A\u0017\u0012\u0004\u0012\u00020\u001F\u0012\r\u0012\u000B\u0012\u0002\b\u00030 \u00A2\u0006\u0002\b\u00190\u001E2$\b\u0002\u0010\u0013\u001A\u001E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0004\u0012\u00020\u00120\u0007\u00A2\u0006\u0002\b\u0019\u00A2\u0006\u0002\b\n2$\b\u0002\u0010\u0015\u001A\u001E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0004\u0012\u00020\u00140\u0007\u00A2\u0006\u0002\b\u0019\u00A2\u0006\u0002\b\n2$\b\u0002\u0010\u0016\u001A\u001E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0004\u0012\u00020\u00120\u0007\u00A2\u0006\u0002\b\u0019\u00A2\u0006\u0002\b\n2$\b\u0002\u0010\u0017\u001A\u001E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0004\u0012\u00020\u00140\u0007\u00A2\u0006\u0002\b\u0019\u00A2\u0006\u0002\b\n2(\b\u0002\u0010\u001B\u001A\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001A\u0018\u00010\u0007\u00A2\u0006\u0002\b\u0019\u00A2\u0006\u0002\b\n2\u0017\u0010\u000B\u001A\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u00A2\u0006\u0002\b\nH\u0007\u00A2\u0006\u0004\b\f\u0010\"\u001A\u00BD\u0002\u0010\f\u001A\u00020\t2\u0006\u0010\u0001\u001A\u00020\u00002\u0006\u0010\u0003\u001A\u00020#2\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u000F\u001A\u00020\u000E2\u000E\b\u0002\u0010\u0006\u001A\b\u0012\u0002\b\u0003\u0018\u00010\u001D2\u001D\b\u0002\u0010!\u001A\u0017\u0012\u0004\u0012\u00020\u001F\u0012\r\u0012\u000B\u0012\u0002\b\u00030 \u00A2\u0006\u0002\b\u00190\u001E2$\b\u0002\u0010\u0013\u001A\u001E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0004\u0012\u00020\u00120\u0007\u00A2\u0006\u0002\b\u0019\u00A2\u0006\u0002\b\n2$\b\u0002\u0010\u0015\u001A\u001E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0004\u0012\u00020\u00140\u0007\u00A2\u0006\u0002\b\u0019\u00A2\u0006\u0002\b\n2$\b\u0002\u0010\u0016\u001A\u001E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0004\u0012\u00020\u00120\u0007\u00A2\u0006\u0002\b\u0019\u00A2\u0006\u0002\b\n2$\b\u0002\u0010\u0017\u001A\u001E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0004\u0012\u00020\u00140\u0007\u00A2\u0006\u0002\b\u0019\u00A2\u0006\u0002\b\n2(\b\u0002\u0010\u001B\u001A\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001A\u0018\u00010\u0007\u00A2\u0006\u0002\b\u0019\u00A2\u0006\u0002\b\n2\u0017\u0010\u000B\u001A\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u00A2\u0006\u0002\b\nH\u0007\u00A2\u0006\u0004\b\f\u0010$\u001A)\u0010\f\u001A\u00020\t2\u0006\u0010\u0001\u001A\u00020\u00002\u0006\u0010&\u001A\u00020%2\b\b\u0002\u0010\u0005\u001A\u00020\u0004H\u0007\u00A2\u0006\u0004\b\f\u0010\'\u001A\u00B7\u0001\u0010\f\u001A\u00020\t2\u0006\u0010\u0001\u001A\u00020\u00002\u0006\u0010&\u001A\u00020%2\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u000F\u001A\u00020\u000E2\u001F\b\u0002\u0010\u0013\u001A\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0004\u0012\u00020\u00120\u0007\u00A2\u0006\u0002\b\n2\u001F\b\u0002\u0010\u0015\u001A\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0004\u0012\u00020\u00140\u0007\u00A2\u0006\u0002\b\n2\u001F\b\u0002\u0010\u0016\u001A\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0004\u0012\u00020\u00120\u0007\u00A2\u0006\u0002\b\n2\u001F\b\u0002\u0010\u0017\u001A\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0004\u0012\u00020\u00140\u0007\u00A2\u0006\u0002\b\nH\u0007\u00A2\u0006\u0004\b\f\u0010(\u001A\u00F5\u0001\u0010\f\u001A\u00020\t2\u0006\u0010\u0001\u001A\u00020\u00002\u0006\u0010&\u001A\u00020%2\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u000F\u001A\u00020\u000E2$\b\u0002\u0010\u0013\u001A\u001E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0004\u0012\u00020\u00120\u0007\u00A2\u0006\u0002\b\u0019\u00A2\u0006\u0002\b\n2$\b\u0002\u0010\u0015\u001A\u001E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0004\u0012\u00020\u00140\u0007\u00A2\u0006\u0002\b\u0019\u00A2\u0006\u0002\b\n2$\b\u0002\u0010\u0016\u001A\u001E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0004\u0012\u00020\u00120\u0007\u00A2\u0006\u0002\b\u0019\u00A2\u0006\u0002\b\n2$\b\u0002\u0010\u0017\u001A\u001E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0004\u0012\u00020\u00140\u0007\u00A2\u0006\u0002\b\u0019\u00A2\u0006\u0002\b\n2(\b\u0002\u0010\u001B\u001A\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001A\u0018\u00010\u0007\u00A2\u0006\u0002\b\u0019\u00A2\u0006\u0002\b\nH\u0007\u00A2\u0006\u0004\b\f\u0010)\u00A8\u00062\u00B2\u0006\u0012\u0010+\u001A\b\u0012\u0004\u0012\u00020\u00110*8\nX\u008A\u0084\u0002\u00B2\u0006\u000E\u0010-\u001A\u00020,8\n@\nX\u008A\u008E\u0002\u00B2\u0006\u000E\u0010/\u001A\u00020.8\n@\nX\u008A\u008E\u0002\u00B2\u0006\u0012\u00100\u001A\b\u0012\u0004\u0012\u00020\u00110*8\nX\u008A\u0084\u0002\u00B2\u0006\u0012\u00101\u001A\b\u0012\u0004\u0012\u00020\u00110*8\nX\u008A\u0084\u0002"}, d2 = {"Landroidx/navigation/NavHostController;", "navController", "", "startDestination", "Landroidx/compose/ui/Modifier;", "modifier", "route", "Lkotlin/Function1;", "Landroidx/navigation/NavGraphBuilder;", "", "Lkotlin/ExtensionFunctionType;", "builder", "NavHost", "(Landroidx/navigation/NavHostController;Ljava/lang/String;Landroidx/compose/ui/Modifier;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/Alignment;", "contentAlignment", "Landroidx/compose/animation/AnimatedContentTransitionScope;", "Landroidx/navigation/NavBackStackEntry;", "Landroidx/compose/animation/EnterTransition;", "enterTransition", "Landroidx/compose/animation/ExitTransition;", "exitTransition", "popEnterTransition", "popExitTransition", "(Landroidx/navigation/NavHostController;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lkotlin/jvm/JvmSuppressWildcards;", "Landroidx/compose/animation/SizeTransform;", "sizeTransform", "(Landroidx/navigation/NavHostController;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "Lkotlin/reflect/KClass;", "", "Lkotlin/reflect/KType;", "Landroidx/navigation/NavType;", "typeMap", "(Landroidx/navigation/NavHostController;Lkotlin/reflect/KClass;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Lkotlin/reflect/KClass;Ljava/util/Map;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "", "(Landroidx/navigation/NavHostController;Ljava/lang/Object;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Lkotlin/reflect/KClass;Ljava/util/Map;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "Landroidx/navigation/NavGraph;", "graph", "(Landroidx/navigation/NavHostController;Landroidx/navigation/NavGraph;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "(Landroidx/navigation/NavHostController;Landroidx/navigation/NavGraph;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "(Landroidx/navigation/NavHostController;Landroidx/navigation/NavGraph;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "currentBackStack", "", "progress", "", "inPredictiveBack", "allVisibleEntries", "visibleEntries", "navigation-compose_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nNavHost.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavHost.kt\nandroidx/navigation/compose/NavHostKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 NavController.kt\nandroidx/navigation/NavControllerKt\n+ 4 NavGraphBuilder.kt\nandroidx/navigation/NavGraphBuilderKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 NavigatorProvider.kt\nandroidx/navigation/NavigatorProviderKt\n+ 7 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 8 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n*L\n1#1,762:1\n1223#2,3:763\n1226#2,3:768\n1223#2,3:771\n1226#2,3:776\n1223#2,3:779\n1226#2,3:784\n1223#2,3:787\n1226#2,3:792\n1223#2,3:795\n1226#2,3:800\n1223#2,6:805\n1223#2,6:811\n1223#2,6:817\n1223#2,6:823\n1223#2,6:829\n1223#2,6:835\n1223#2,6:841\n1223#2,6:847\n1223#2,6:853\n1223#2,6:859\n1223#2,6:865\n1223#2,6:871\n1223#2,6:877\n1223#2,6:883\n1223#2,6:889\n2786#3:766\n2786#3:774\n2786#3:782\n2803#3:790\n2820#3:798\n59#4:767\n59#4:775\n59#4:783\n77#4:791\n95#4:799\n77#5:803\n146#6:804\n146#6:895\n81#7:896\n81#7:900\n107#7,2:901\n81#7:903\n81#7:904\n76#8:897\n109#8,2:898\n*S KotlinDebug\n*F\n+ 1 NavHost.kt\nandroidx/navigation/compose/NavHostKt\n*L\n94#1:763,3\n94#1:768,3\n146#1:771,3\n146#1:776,3\n214#1:779,3\n214#1:784,3\n286#1:787,3\n286#1:792,3\n358#1:795,3\n358#1:800,3\n512#1:805,6\n513#1:811,6\n514#1:817,6\n532#1:823,6\n543#1:829,6\n553#1:835,6\n556#1:841,6\n570#1:847,6\n586#1:853,6\n594#1:859,6\n600#1:865,6\n610#1:871,6\n615#1:877,6\n648#1:883,6\n700#1:889,6\n95#1:766\n147#1:774\n215#1:782\n287#1:790\n359#1:798\n95#1:767\n147#1:775\n215#1:783\n287#1:791\n359#1:799\n493#1:803\n507#1:804\n711#1:895\n510#1:896\n513#1:900\n513#1:901,2\n540#1:903\n543#1:904\n512#1:897\n512#1:898,2\n*E\n"})
public final class NavHostKt {
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Deprecated in favor of NavHost that supports AnimatedContent")
    public static final void NavHost(NavHostController navHostController0, NavGraph navGraph0, Modifier modifier0, Composer composer0, int v, int v1) {
        Modifier modifier1;
        int v2;
        Composer composer1 = composer0.startRestartGroup(0xC6F51DC0);
        if((v1 & 1) == 0) {
            v2 = (v & 6) == 0 ? (composer1.changedInstance(navHostController0) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x30) == 0) {
            v2 |= (composer1.changedInstance(navGraph0) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x180) == 0) {
            v2 |= (composer1.changed(modifier0) ? 0x100 : 0x80);
        }
        if((v2 & 0x93) != 0x92 || !composer1.getSkipping()) {
            Modifier modifier2 = (v1 & 4) == 0 ? modifier0 : Modifier.Companion;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xC6F51DC0, v2, -1, "androidx.navigation.compose.NavHost (NavHost.kt:392)");
            }
            NavHostKt.NavHost(navHostController0, navGraph0, modifier2, null, null, null, null, null, null, composer1, v2 & 0x3FE, 504);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier1 = modifier2;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new sf(v, navHostController0, v1, navGraph0, 11, modifier1));
        }
    }

    @SuppressLint({"StateFlowValueCalledInComposition"})
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Deprecated in favor of NavHost that supports sizeTransform")
    public static final void NavHost(NavHostController navHostController0, NavGraph navGraph0, Modifier modifier0, Alignment alignment0, Function1 function10, Function1 function11, Function1 function12, Function1 function13, Composer composer0, int v, int v1) {
        Function1 function110;
        Function1 function19;
        Function1 function18;
        Modifier modifier2;
        Function1 function17;
        Function1 function113;
        Function1 function112;
        Function1 function111;
        int v4;
        int v3;
        Function1 function16;
        Function1 function15;
        Function1 function14;
        Alignment alignment1;
        Modifier modifier1;
        int v2;
        Composer composer1 = composer0.startRestartGroup(0x93A097D5);
        if((v1 & 1) == 0) {
            v2 = (v & 6) == 0 ? (composer1.changedInstance(navHostController0) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x30) == 0) {
            v2 |= (composer1.changedInstance(navGraph0) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
            modifier1 = modifier0;
        }
        else if((v & 0x180) == 0) {
            modifier1 = modifier0;
            v2 |= (composer1.changed(modifier1) ? 0x100 : 0x80);
        }
        else {
            modifier1 = modifier0;
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
            alignment1 = alignment0;
        }
        else if((v & 0xC00) == 0) {
            alignment1 = alignment0;
            v2 |= (composer1.changed(alignment1) ? 0x800 : 0x400);
        }
        else {
            alignment1 = alignment0;
        }
        if((v1 & 16) != 0) {
            v2 |= 0x6000;
            function14 = function10;
        }
        else if((v & 0x6000) == 0) {
            function14 = function10;
            v2 |= (composer1.changedInstance(function14) ? 0x4000 : 0x2000);
        }
        else {
            function14 = function10;
        }
        if((v1 & 0x20) != 0) {
            v2 |= 0x30000;
            function15 = function11;
        }
        else if((0x30000 & v) == 0) {
            function15 = function11;
            v2 |= (composer1.changedInstance(function15) ? 0x20000 : 0x10000);
        }
        else {
            function15 = function11;
        }
        if((0x180000 & v) == 0) {
            if((v1 & 0x40) == 0) {
                function16 = function12;
                v3 = composer1.changedInstance(function16) ? 0x100000 : 0x80000;
            }
            else {
                function16 = function12;
                v3 = 0x80000;
            }
            v2 |= v3;
        }
        else {
            function16 = function12;
        }
        if((v & 0xC00000) == 0) {
            v2 |= ((v1 & 0x80) != 0 || !composer1.changedInstance(function13) ? 0x400000 : 0x800000);
        }
        if((v2 & 0x492493) != 4793490 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v & 1) == 0 || composer1.getDefaultsInvalid()) {
                if((v1 & 4) != 0) {
                    modifier1 = Modifier.Companion;
                }
                if((v1 & 8) != 0) {
                    alignment1 = Alignment.Companion.getTopStart();
                }
                if((v1 & 16) != 0) {
                    function14 = m.w;
                }
                if((v1 & 0x20) != 0) {
                    function15 = n.w;
                }
                if((v1 & 0x40) != 0) {
                    v2 &= 0xFFC7FFFF;
                    function16 = function14;
                }
                if((v1 & 0x80) == 0) {
                label_94:
                    function113 = function13;
                    v4 = v2;
                    function111 = function14;
                    function112 = function15;
                }
                else {
                    v4 = v2 & 0xFE3FFFFF;
                    function111 = function14;
                    function112 = function15;
                    function113 = function112;
                }
            }
            else {
                composer1.skipToGroupEnd();
                if((v1 & 0x40) != 0) {
                    v2 &= 0xFFC7FFFF;
                }
                if((v1 & 0x80) != 0) {
                    v2 &= 0xFE3FFFFF;
                }
                goto label_94;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x93A097D5, v4, -1, "androidx.navigation.compose.NavHost (NavHost.kt:430)");
            }
            NavHostKt.NavHost(navHostController0, navGraph0, modifier1, alignment1, function111, function112, function16, function113, null, composer1, v4 & 0x1FFFFFE, 0x100);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function110 = function16;
            function17 = function113;
            modifier2 = modifier1;
            function18 = function111;
            function19 = function112;
        }
        else {
            composer1.skipToGroupEnd();
            function17 = function13;
            modifier2 = modifier1;
            function18 = function14;
            function19 = function15;
            function110 = function16;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new o(navHostController0, navGraph0, modifier2, alignment1, function18, function19, function110, function17, v, v1));
        }
    }

    @SuppressLint({"StateFlowValueCalledInComposition"})
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void NavHost(@NotNull NavHostController navHostController0, @NotNull NavGraph navGraph0, @Nullable Modifier modifier0, @Nullable Alignment alignment0, @Nullable Function1 function10, @Nullable Function1 function11, @Nullable Function1 function12, @Nullable Function1 function13, @Nullable Function1 function14, @Nullable Composer composer0, int v, int v1) {
        Function1 function119;
        Map map0;
        Function1 function118;
        Function1 function117;
        Alignment alignment3;
        Function1 function114;
        Function1 function113;
        Function1 function112;
        Function1 function111;
        Alignment alignment2;
        Modifier modifier2;
        Function1 function110;
        Function1 function116;
        int v4;
        Function1 function115;
        int v3;
        Function1 function19;
        Function1 function18;
        Function1 function17;
        Function1 function16;
        Alignment alignment1;
        Modifier modifier1;
        Function1 function15;
        int v2;
        Composer composer1 = composer0.startRestartGroup(0x8AE59928);
        if((v1 & 1) == 0) {
            v2 = (v & 6) == 0 ? (composer1.changedInstance(navHostController0) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x30) == 0) {
            v2 |= (composer1.changedInstance(navGraph0) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x180) == 0) {
            v2 |= (composer1.changed(modifier0) ? 0x100 : 0x80);
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
        }
        else if((v & 0xC00) == 0) {
            v2 |= (composer1.changed(alignment0) ? 0x800 : 0x400);
        }
        if((v1 & 16) != 0) {
            v2 |= 0x6000;
        }
        else if((v & 0x6000) == 0) {
            v2 |= (composer1.changedInstance(function10) ? 0x4000 : 0x2000);
        }
        if((v1 & 0x20) != 0) {
            v2 |= 0x30000;
        }
        else if((v & 0x30000) == 0) {
            v2 |= (composer1.changedInstance(function11) ? 0x20000 : 0x10000);
        }
        if((v & 0x180000) == 0) {
            v2 |= ((v1 & 0x40) != 0 || !composer1.changedInstance(function12) ? 0x80000 : 0x100000);
        }
        if((v & 0xC00000) == 0) {
            v2 |= ((v1 & 0x80) != 0 || !composer1.changedInstance(function13) ? 0x400000 : 0x800000);
        }
        if((v1 & 0x100) != 0) {
            v2 |= 0x6000000;
        }
        else if((v & 0x6000000) == 0) {
            v2 |= (composer1.changedInstance(function14) ? 0x4000000 : 0x2000000);
        }
        if((v2 & 0x2492493) == 0x2492492 && composer1.getSkipping()) {
            composer1.skipToGroupEnd();
            function15 = function13;
            modifier1 = modifier0;
            alignment1 = alignment0;
            function16 = function11;
            function17 = function10;
            function18 = function12;
            function19 = function14;
        }
        else {
            composer1.startDefaults();
            if((v & 1) == 0 || composer1.getDefaultsInvalid()) {
                modifier2 = (v1 & 4) == 0 ? modifier0 : Modifier.Companion;
                alignment2 = (v1 & 8) == 0 ? alignment0 : Alignment.Companion.getTopStart();
                function112 = (v1 & 16) == 0 ? function10 : p.w;
                function111 = (v1 & 0x20) == 0 ? function11 : q.w;
                if((v1 & 0x40) == 0) {
                    v3 = v2;
                    function115 = function12;
                }
                else {
                    v3 = v2 & 0xFFC7FFFF;
                    function115 = function112;
                }
                if((v1 & 0x80) == 0) {
                    v4 = v3;
                    function116 = function13;
                }
                else {
                    v4 = v3 & 0xFE3FFFFF;
                    function116 = function111;
                }
                function114 = (v1 & 0x100) == 0 ? function14 : null;
                function110 = function116;
                function113 = function115;
                v2 = v4;
            }
            else {
                composer1.skipToGroupEnd();
                if((v1 & 0x40) != 0) {
                    v2 &= 0xFFC7FFFF;
                }
                if((v1 & 0x80) != 0) {
                    v2 &= 0xFE3FFFFF;
                }
                function110 = function13;
                modifier2 = modifier0;
                alignment2 = alignment0;
                function111 = function11;
                function112 = function10;
                function113 = function12;
                function114 = function14;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x8AE59928, v2, -1, "androidx.navigation.compose.NavHost (NavHost.kt:490)");
            }
            LifecycleOwner lifecycleOwner0 = (LifecycleOwner)composer1.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
            ViewModelStoreOwner viewModelStoreOwner0 = LocalViewModelStoreOwner.INSTANCE.getCurrent(composer1, LocalViewModelStoreOwner.$stable);
            if(viewModelStoreOwner0 == null) {
                throw new IllegalStateException("NavHost requires a ViewModelStoreOwner to be provided via LocalViewModelStoreOwner");
            }
            navHostController0.setViewModelStore(viewModelStoreOwner0.getViewModelStore());
            navHostController0.setGraph(navGraph0);
            Navigator navigator0 = navHostController0.getNavigatorProvider().getNavigator("composable");
            ComposeNavigator composeNavigator0 = navigator0 instanceof ComposeNavigator ? ((ComposeNavigator)navigator0) : null;
            if(composeNavigator0 == null) {
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
                if(scopeUpdateScope0 != null) {
                    scopeUpdateScope0.updateScope(new y(navHostController0, navGraph0, modifier2, alignment2, function112, function111, function113, function110, function114, v, v1, 1));
                }
                return;
            }
            State state0 = SnapshotStateKt.collectAsState(composeNavigator0.getBackStack(), null, composer1, 0, 1);
            MutableFloatState mutableFloatState0 = composer1.rememberedValue();
            Companion composer$Companion0 = Composer.Companion;
            if(mutableFloatState0 == composer$Companion0.getEmpty()) {
                mutableFloatState0 = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
                composer1.updateRememberedValue(mutableFloatState0);
            }
            MutableState mutableState0 = composer1.rememberedValue();
            if(mutableState0 == composer$Companion0.getEmpty()) {
                alignment3 = alignment2;
                mutableState0 = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composer1.updateRememberedValue(mutableState0);
            }
            else {
                alignment3 = alignment2;
            }
            boolean z = ((List)state0.getValue()).size() > 1;
            boolean z1 = composer1.changed(state0);
            boolean z2 = composer1.changed(composeNavigator0);
            r r0 = composer1.rememberedValue();
            if(z1 || z2 || r0 == composer$Companion0.getEmpty()) {
                r0 = new r(composeNavigator0, mutableFloatState0, state0, mutableState0, null);
                composer1.updateRememberedValue(r0);
            }
            PredictiveBackHandlerKt.PredictiveBackHandler(z, r0, composer1, 0, 0);
            boolean z3 = composer1.changedInstance(navHostController0);
            boolean z4 = composer1.changedInstance(lifecycleOwner0);
            b2 b20 = composer1.rememberedValue();
            if(z3 || z4 || b20 == composer$Companion0.getEmpty()) {
                b20 = new b2(7, navHostController0, lifecycleOwner0);
                composer1.updateRememberedValue(b20);
            }
            EffectsKt.DisposableEffect(lifecycleOwner0, b20, composer1, 0);
            SaveableStateHolder saveableStateHolder0 = SaveableStateHolderKt.rememberSaveableStateHolder(composer1, 0);
            State state1 = SnapshotStateKt.collectAsState(navHostController0.getVisibleEntries(), null, composer1, 0, 1);
            State state2 = composer1.rememberedValue();
            if(state2 == composer$Companion0.getEmpty()) {
                state2 = SnapshotStateKt.derivedStateOf(new l(state1, 23));
                composer1.updateRememberedValue(state2);
            }
            NavBackStackEntry navBackStackEntry0 = (NavBackStackEntry)CollectionsKt___CollectionsKt.lastOrNull(((List)state2.getValue()));
            LinkedHashMap linkedHashMap0 = composer1.rememberedValue();
            if(linkedHashMap0 == composer$Companion0.getEmpty()) {
                linkedHashMap0 = new LinkedHashMap();
                composer1.updateRememberedValue(linkedHashMap0);
            }
            composer1.startReplaceGroup(0x26F16314);
            if(navBackStackEntry0 == null) {
                function118 = function111;
                function117 = function113;
                function19 = function114;
                function119 = function110;
            }
            else {
                boolean z5 = composer1.changed(composeNavigator0);
                boolean z6 = (v2 & 0x380000 ^ 0x180000) > 0x100000 && composer1.changed(function113) || (v2 & 0x180000) == 0x100000;
                e e0 = composer1.rememberedValue();
                if((z6 | z5 | ((0xE000 & v2) == 0x4000 ? 1 : 0)) != 0 || e0 == composer$Companion0.getEmpty()) {
                    e0 = new e(composeNavigator0, function113, function112, mutableState0);
                    composer1.updateRememberedValue(e0);
                }
                boolean z7 = composer1.changed(composeNavigator0);
                function117 = function113;
                boolean z8 = (0x1C00000 & v2 ^ 0xC00000) > 0x800000 && composer1.changed(function110) || (v2 & 0xC00000) == 0x800000;
                f f0 = composer1.rememberedValue();
                if((z7 | z8 | ((0x70000 & v2) == 0x20000 ? 1 : 0)) != 0 || f0 == composer$Companion0.getEmpty()) {
                    f0 = new f(composeNavigator0, function110, function111, mutableState0);
                    composer1.updateRememberedValue(f0);
                }
                g g0 = composer1.rememberedValue();
                if((0xE000000 & v2) == 0x4000000 || g0 == composer$Companion0.getEmpty()) {
                    g0 = new g(function114);
                    composer1.updateRememberedValue(g0);
                }
                boolean z9 = composer1.changed(composeNavigator0);
                b2 b21 = composer1.rememberedValue();
                if(z9 || b21 == composer$Companion0.getEmpty()) {
                    b21 = new b2(8, state2, composeNavigator0);
                    composer1.updateRememberedValue(b21);
                }
                EffectsKt.DisposableEffect(Boolean.TRUE, b21, composer1, 6);
                SeekableTransitionState seekableTransitionState0 = composer1.rememberedValue();
                if(seekableTransitionState0 == composer$Companion0.getEmpty()) {
                    seekableTransitionState0 = new SeekableTransitionState(navBackStackEntry0);
                    composer1.updateRememberedValue(seekableTransitionState0);
                }
                function118 = function111;
                Transition transition0 = TransitionKt.rememberTransition(seekableTransitionState0, "entry", composer1, SeekableTransitionState.$stable | 0x30, 0);
                if(((Boolean)mutableState0.getValue()).booleanValue()) {
                    composer1.startReplaceGroup(0xB75DBF38);
                    Float float0 = mutableFloatState0.getFloatValue();
                    boolean z10 = composer1.changed(state0);
                    boolean z11 = composer1.changedInstance(seekableTransitionState0);
                    s s0 = composer1.rememberedValue();
                    if(z10 || z11 || s0 == composer$Companion0.getEmpty()) {
                        s0 = new s(seekableTransitionState0, state0, mutableFloatState0, null);
                        composer1.updateRememberedValue(s0);
                    }
                    EffectsKt.LaunchedEffect(float0, s0, composer1, 0);
                }
                else {
                    composer1.startReplaceGroup(0xB761A375);
                    boolean z12 = composer1.changedInstance(seekableTransitionState0);
                    boolean z13 = composer1.changedInstance(navBackStackEntry0);
                    boolean z14 = composer1.changed(transition0);
                    u u0 = composer1.rememberedValue();
                    if((z12 | z13 | z14) != 0 || u0 == composer$Companion0.getEmpty()) {
                        u0 = new u(seekableTransitionState0, navBackStackEntry0, transition0, null);
                        composer1.updateRememberedValue(u0);
                    }
                    EffectsKt.LaunchedEffect(navBackStackEntry0, u0, composer1, 0);
                }
                composer1.endReplaceGroup();
                map0 = linkedHashMap0;
                boolean z15 = composer1.changedInstance(map0);
                boolean z16 = composer1.changed(composeNavigator0);
                boolean z17 = composer1.changed(e0);
                boolean z18 = composer1.changed(f0);
                boolean z19 = composer1.changed(g0);
                v v5 = composer1.rememberedValue();
                if((z15 | z16 | z17 | z18 | z19) != 0 || v5 == composer$Companion0.getEmpty()) {
                    v5 = new v(map0, composeNavigator0, e0, f0, g0, state2, mutableState0);
                    composer1.updateRememberedValue(v5);
                }
                ComposableLambda composableLambda0 = ComposableLambdaKt.rememberComposableLambda(820763100, true, new a1(saveableStateHolder0, mutableState0, 1, state2), composer1, 54);
                function19 = function114;
                function119 = function110;
                AnimatedContentKt.AnimatedContent(transition0, modifier2, v5, alignment3, w.w, composableLambda0, composer1, v2 >> 3 & 0x70 | 0x36000 | v2 & 0x1C00, 0);
                Object object0 = transition0.getCurrentState();
                Object object1 = transition0.getTargetState();
                boolean z20 = composer1.changed(transition0);
                boolean z21 = composer1.changed(composeNavigator0);
                boolean z22 = composer1.changedInstance(map0);
                x x0 = composer1.rememberedValue();
                if((z20 | z21 | z22) != 0 || x0 == composer$Companion0.getEmpty()) {
                    x0 = new x(transition0, map0, state2, composeNavigator0, null);
                    composer1.updateRememberedValue(x0);
                }
                EffectsKt.LaunchedEffect(object0, object1, x0, composer1, 0);
            }
            composer1.endReplaceGroup();
            Navigator navigator1 = navHostController0.getNavigatorProvider().getNavigator("dialog");
            DialogNavigator dialogNavigator0 = navigator1 instanceof DialogNavigator ? ((DialogNavigator)navigator1) : null;
            if(dialogNavigator0 == null) {
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScope1 = composer1.endRestartGroup();
                if(scopeUpdateScope1 != null) {
                    scopeUpdateScope1.updateScope(new y(navHostController0, navGraph0, modifier2, alignment3, function112, function118, function117, function119, function19, v, v1, 2));
                }
                return;
            }
            DialogHostKt.DialogHost(dialogNavigator0, composer1, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function17 = function112;
            function15 = function119;
            function16 = function118;
            alignment1 = alignment3;
            modifier1 = modifier2;
            function18 = function117;
        }
        ScopeUpdateScope scopeUpdateScope2 = composer1.endRestartGroup();
        if(scopeUpdateScope2 != null) {
            scopeUpdateScope2.updateScope(new y(navHostController0, navGraph0, modifier1, alignment1, function17, function16, function18, function15, function19, v, v1, 0));
        }
    }

    @Composable
    public static final void NavHost(@NotNull NavHostController navHostController0, @NotNull Object object0, @Nullable Modifier modifier0, @Nullable Alignment alignment0, @Nullable KClass kClass0, @Nullable Map map0, @Nullable Function1 function10, @Nullable Function1 function11, @Nullable Function1 function12, @Nullable Function1 function13, @Nullable Function1 function14, @NotNull Function1 function15, @Nullable Composer composer0, int v, int v1, int v2) {
        Function1 function111;
        Function1 function110;
        Alignment alignment1;
        Modifier modifier2;
        Function1 function19;
        Function1 function18;
        Function1 function17;
        Map map1;
        KClass kClass1;
        Function1 function115;
        Map map2;
        Alignment alignment2;
        int v5;
        Function1 function114;
        Function1 function113;
        Function1 function112;
        KClass kClass2;
        int v6;
        int v4;
        Function1 function16;
        Modifier modifier1;
        int v3;
        Composer composer1 = composer0.startRestartGroup(-1476019057);
        if((v2 & 1) == 0) {
            v3 = (v & 6) == 0 ? (composer1.changedInstance(navHostController0) ? 4 : 2) | v : v;
        }
        else {
            v3 = v | 6;
        }
        if((v2 & 2) != 0) {
            v3 |= 0x30;
        }
        else if((v & 0x30) == 0) {
            v3 |= (composer1.changedInstance(object0) ? 0x20 : 16);
        }
        if((v2 & 4) != 0) {
            v3 |= 0x180;
            modifier1 = modifier0;
        }
        else if((v & 0x180) == 0) {
            modifier1 = modifier0;
            v3 |= (composer1.changed(modifier1) ? 0x100 : 0x80);
        }
        else {
            modifier1 = modifier0;
        }
        if((v2 & 8) != 0) {
            v3 |= 0xC00;
        }
        else if((v & 0xC00) == 0) {
            v3 |= (composer1.changed(alignment0) ? 0x800 : 0x400);
        }
        if((v2 & 16) != 0) {
            v3 |= 0x6000;
        }
        else if((v & 0x6000) == 0) {
            v3 |= (composer1.changedInstance(kClass0) ? 0x4000 : 0x2000);
        }
        if((v2 & 0x20) != 0) {
            v3 |= 0x30000;
        }
        else if((v & 0x30000) == 0) {
            v3 |= (composer1.changedInstance(map0) ? 0x20000 : 0x10000);
        }
        if((v2 & 0x40) == 0) {
            function16 = function10;
            if((v & 0x180000) == 0) {
                v3 |= (composer1.changedInstance(function16) ? 0x100000 : 0x80000);
            }
        }
        else {
            v3 |= 0x180000;
            function16 = function10;
        }
        if((v2 & 0x80) != 0) {
            v3 |= 0xC00000;
        }
        else if((v & 0xC00000) == 0) {
            v3 |= (composer1.changedInstance(function11) ? 0x800000 : 0x400000);
        }
        if((v & 0x6000000) == 0) {
            v3 |= ((v2 & 0x100) != 0 || !composer1.changedInstance(function12) ? 0x2000000 : 0x4000000);
        }
        if((v & 0x30000000) == 0) {
            v3 |= ((v2 & 0x200) != 0 || !composer1.changedInstance(function13) ? 0x10000000 : 0x20000000);
        }
        if((v2 & 0x400) == 0) {
            v4 = (v1 & 6) == 0 ? v1 | (composer1.changedInstance(function14) ? 4 : 2) : v1;
        }
        else {
            v4 = v1 | 6;
        }
        if((v2 & 0x800) != 0) {
            v4 |= 0x30;
        }
        else if((v1 & 0x30) == 0) {
            v4 |= (composer1.changedInstance(function15) ? 0x20 : 16);
        }
        if((v3 & 306783379) != 306783378 || (v4 & 19) != 18 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v & 1) == 0 || composer1.getDefaultsInvalid()) {
                Modifier modifier3 = (v2 & 4) == 0 ? modifier1 : Modifier.Companion;
                alignment2 = (v2 & 8) == 0 ? alignment0 : Alignment.Companion.getTopStart();
                kClass2 = (v2 & 16) == 0 ? kClass0 : null;
                map2 = (v2 & 0x20) == 0 ? map0 : kotlin.collections.x.emptyMap();
                if((v2 & 0x40) != 0) {
                    function16 = k.w;
                }
                function112 = (v2 & 0x80) == 0 ? function11 : o4.l.w;
                if((v2 & 0x100) == 0) {
                    v6 = v3;
                    function115 = function12;
                }
                else {
                    v6 = v3 & 0xF1FFFFFF;
                    function115 = function16;
                }
                if((v2 & 0x200) == 0) {
                    function113 = function13;
                }
                else {
                    v6 &= 0x8FFFFFFF;
                    function113 = function112;
                }
                if((v2 & 0x400) == 0) {
                    function114 = function14;
                    v5 = v6;
                }
                else {
                    v5 = v6;
                    function114 = null;
                }
                modifier1 = modifier3;
            }
            else {
                composer1.skipToGroupEnd();
                if((v2 & 0x100) != 0) {
                    v3 &= 0xF1FFFFFF;
                }
                if((v2 & 0x200) != 0) {
                    v3 &= 0x8FFFFFFF;
                }
                kClass2 = kClass0;
                function112 = function11;
                function113 = function13;
                function114 = function14;
                v5 = v3;
                alignment2 = alignment0;
                map2 = map0;
                function115 = function12;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1476019057, v5, v4, "androidx.navigation.compose.NavHost (NavHost.kt:354)");
            }
            boolean z = composer1.changed(kClass2);
            boolean z1 = composer1.changed(object0);
            NavGraph navGraph0 = composer1.rememberedValue();
            if((((v4 & 0x70) == 0x20 ? 1 : 0) | (z | z1)) != 0 || navGraph0 == Composer.Companion.getEmpty()) {
                NavGraphBuilder navGraphBuilder0 = new NavGraphBuilder(navHostController0.getNavigatorProvider(), object0, kClass2, map2);
                function15.invoke(navGraphBuilder0);
                navGraph0 = navGraphBuilder0.build();
                composer1.updateRememberedValue(navGraph0);
            }
            NavHostKt.NavHost(navHostController0, navGraph0, modifier1, alignment2, function16, function112, function115, function113, function114, composer1, v5 & 8078 | 0xE000 & v5 >> 6 | 0x70000 & v5 >> 6 | 0x380000 & v5 >> 6 | v5 >> 6 & 0x1C00000 | v4 << 24 & 0xE000000, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier1;
            kClass1 = kClass2;
            function18 = function114;
            function111 = function113;
            alignment1 = alignment2;
            function19 = function16;
            function110 = function112;
            function17 = function115;
            map1 = map2;
        }
        else {
            composer1.skipToGroupEnd();
            kClass1 = kClass0;
            map1 = map0;
            function17 = function12;
            function18 = function14;
            function19 = function16;
            modifier2 = modifier1;
            alignment1 = alignment0;
            function110 = function11;
            function111 = function13;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new j(navHostController0, object0, modifier2, alignment1, kClass1, map1, function19, function110, function17, function111, function18, function15, v, v1, v2));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Deprecated in favor of NavHost that supports sizeTransform")
    public static final void NavHost(NavHostController navHostController0, String s, Modifier modifier0, Alignment alignment0, String s1, Function1 function10, Function1 function11, Function1 function12, Function1 function13, Function1 function14, Composer composer0, int v, int v1) {
        Function1 function19;
        String s3;
        Function1 function18;
        Alignment alignment2;
        Modifier modifier2;
        Function1 function17;
        Function1 function112;
        String s4;
        Function1 function111;
        int v3;
        Function1 function110;
        Function1 function113;
        Function1 function16;
        Function1 function15;
        String s2;
        Alignment alignment1;
        Modifier modifier1;
        int v2;
        Composer composer1 = composer0.startRestartGroup(410432995);
        if((v1 & 1) == 0) {
            v2 = (v & 6) == 0 ? (composer1.changedInstance(navHostController0) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x30) == 0) {
            v2 |= (composer1.changed(s) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
            modifier1 = modifier0;
        }
        else if((v & 0x180) == 0) {
            modifier1 = modifier0;
            v2 |= (composer1.changed(modifier1) ? 0x100 : 0x80);
        }
        else {
            modifier1 = modifier0;
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
            alignment1 = alignment0;
        }
        else if((v & 0xC00) == 0) {
            alignment1 = alignment0;
            v2 |= (composer1.changed(alignment1) ? 0x800 : 0x400);
        }
        else {
            alignment1 = alignment0;
        }
        if((v1 & 16) != 0) {
            v2 |= 0x6000;
            s2 = s1;
        }
        else if((v & 0x6000) == 0) {
            s2 = s1;
            v2 |= (composer1.changed(s2) ? 0x4000 : 0x2000);
        }
        else {
            s2 = s1;
        }
        if((v1 & 0x20) == 0) {
            function15 = function10;
            if((v & 0x30000) == 0) {
                v2 |= (composer1.changedInstance(function15) ? 0x20000 : 0x10000);
            }
        }
        else {
            v2 |= 0x30000;
            function15 = function10;
        }
        if((v1 & 0x40) == 0) {
            function16 = function11;
            if((v & 0x180000) == 0) {
                v2 |= (composer1.changedInstance(function16) ? 0x100000 : 0x80000);
            }
        }
        else {
            v2 |= 0x180000;
            function16 = function11;
        }
        if((v & 0xC00000) == 0) {
            v2 |= ((v1 & 0x80) != 0 || !composer1.changedInstance(function12) ? 0x400000 : 0x800000);
        }
        if((v & 0x6000000) == 0) {
            v2 |= ((v1 & 0x100) != 0 || !composer1.changedInstance(function13) ? 0x2000000 : 0x4000000);
        }
        if((v1 & 0x200) != 0) {
            v2 |= 0x30000000;
        }
        else if((v & 0x30000000) == 0) {
            v2 |= (composer1.changedInstance(function14) ? 0x20000000 : 0x10000000);
        }
        if((306783379 & v2) != 306783378 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v & 1) == 0 || composer1.getDefaultsInvalid()) {
                if((v1 & 4) != 0) {
                    modifier1 = Modifier.Companion;
                }
                if((v1 & 8) != 0) {
                    alignment1 = Alignment.Companion.getTopStart();
                }
                if((v1 & 16) != 0) {
                    s2 = null;
                }
                if((v1 & 0x20) != 0) {
                    function15 = z.w;
                }
                if((v1 & 0x40) != 0) {
                    function16 = a0.w;
                }
                if((v1 & 0x80) == 0) {
                    function113 = function12;
                }
                else {
                    v2 &= 0xFE3FFFFF;
                    function113 = function15;
                }
                if((v1 & 0x100) == 0) {
                    function110 = function13;
                    v3 = v2;
                    function111 = function16;
                }
                else {
                    v3 = v2 & 0xF1FFFFFF;
                    function111 = function16;
                    function110 = function111;
                }
                function112 = function113;
                s4 = s2;
            }
            else {
                composer1.skipToGroupEnd();
                if((v1 & 0x80) != 0) {
                    v2 &= 0xFE3FFFFF;
                }
                if((v1 & 0x100) != 0) {
                    v2 &= 0xF1FFFFFF;
                }
                function110 = function13;
                v3 = v2;
                function111 = function16;
                s4 = s2;
                function112 = function12;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(410432995, v3, -1, "androidx.navigation.compose.NavHost (NavHost.kt:142)");
            }
            NavGraph navGraph0 = composer1.rememberedValue();
            if((((v3 & 0x70) == 0x20 ? 1 : 0) | ((v3 & 0xE000) == 0x4000 ? 1 : 0) | ((0x70000000 & v3) == 0x20000000 ? 1 : 0)) != 0 || navGraph0 == Composer.Companion.getEmpty()) {
                NavGraphBuilder navGraphBuilder0 = new NavGraphBuilder(navHostController0.getNavigatorProvider(), s, s4);
                function14.invoke(navGraphBuilder0);
                navGraph0 = navGraphBuilder0.build();
                composer1.updateRememberedValue(navGraph0);
            }
            NavHostKt.NavHost(navHostController0, navGraph0, modifier1, alignment1, function15, function111, function112, function110, null, composer1, v3 & 8078 | 0xE000 & v3 >> 3 | 0x70000 & v3 >> 3 | 0x380000 & v3 >> 3 | v3 >> 3 & 0x1C00000, 0x100);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function17 = function112;
            alignment2 = alignment1;
            function19 = function110;
            s3 = s4;
            function18 = function111;
            modifier2 = modifier1;
        }
        else {
            composer1.skipToGroupEnd();
            function17 = function12;
            modifier2 = modifier1;
            alignment2 = alignment1;
            function18 = function16;
            s3 = s2;
            function19 = function13;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new b0(navHostController0, s, modifier2, alignment2, s3, function15, function18, function17, function19, function14, v, v1));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void NavHost(@NotNull NavHostController navHostController0, @NotNull String s, @Nullable Modifier modifier0, @Nullable Alignment alignment0, @Nullable String s1, @Nullable Function1 function10, @Nullable Function1 function11, @Nullable Function1 function12, @Nullable Function1 function13, @Nullable Function1 function14, @NotNull Function1 function15, @Nullable Composer composer0, int v, int v1, int v2) {
        Function1 function110;
        Function1 function19;
        Alignment alignment1;
        Modifier modifier1;
        String s3;
        Function1 function18;
        Function1 function17;
        Function1 function16;
        Function1 function115;
        int v5;
        Function1 function114;
        Alignment alignment2;
        Modifier modifier2;
        Function1 function113;
        Function1 function112;
        Function1 function111;
        int v4;
        String s2;
        int v3;
        Composer composer1 = composer0.startRestartGroup(0x6DAFFDB6);
        if((v2 & 1) == 0) {
            v3 = (v & 6) == 0 ? (composer1.changedInstance(navHostController0) ? 4 : 2) | v : v;
        }
        else {
            v3 = v | 6;
        }
        if((v2 & 2) != 0) {
            v3 |= 0x30;
        }
        else if((v & 0x30) == 0) {
            v3 |= (composer1.changed(s) ? 0x20 : 16);
        }
        if((v2 & 4) != 0) {
            v3 |= 0x180;
        }
        else if((v & 0x180) == 0) {
            v3 |= (composer1.changed(modifier0) ? 0x100 : 0x80);
        }
        if((v2 & 8) != 0) {
            v3 |= 0xC00;
        }
        else if((v & 0xC00) == 0) {
            v3 |= (composer1.changed(alignment0) ? 0x800 : 0x400);
        }
        if((v2 & 16) != 0) {
            v3 |= 0x6000;
            s2 = s1;
        }
        else if((v & 0x6000) == 0) {
            s2 = s1;
            v3 |= (composer1.changed(s2) ? 0x4000 : 0x2000);
        }
        else {
            s2 = s1;
        }
        if((v2 & 0x20) != 0) {
            v3 |= 0x30000;
        }
        else if((v & 0x30000) == 0) {
            v3 |= (composer1.changedInstance(function10) ? 0x20000 : 0x10000);
        }
        if((v2 & 0x40) != 0) {
            v3 |= 0x180000;
        }
        else if((v & 0x180000) == 0) {
            v3 |= (composer1.changedInstance(function11) ? 0x100000 : 0x80000);
        }
        if((v & 0xC00000) == 0) {
            v3 |= ((v2 & 0x80) != 0 || !composer1.changedInstance(function12) ? 0x400000 : 0x800000);
        }
        if((v & 0x6000000) == 0) {
            v3 |= ((v2 & 0x100) != 0 || !composer1.changedInstance(function13) ? 0x2000000 : 0x4000000);
        }
        if((v2 & 0x200) != 0) {
            v3 |= 0x30000000;
        }
        else if((v & 0x30000000) == 0) {
            v3 |= (composer1.changedInstance(function14) ? 0x20000000 : 0x10000000);
        }
        if((v2 & 0x400) == 0) {
            v4 = (v1 & 6) == 0 ? v1 | (composer1.changedInstance(function15) ? 4 : 2) : v1;
        }
        else {
            v4 = v1 | 6;
        }
        if((v3 & 306783379) != 306783378 || (v4 & 3) != 2 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v & 1) == 0 || composer1.getDefaultsInvalid()) {
                modifier2 = (v2 & 4) == 0 ? modifier0 : Modifier.Companion;
                alignment2 = (v2 & 8) == 0 ? alignment0 : Alignment.Companion.getTopStart();
                if((v2 & 16) != 0) {
                    s2 = null;
                }
                function114 = (v2 & 0x20) == 0 ? function10 : c0.w;
                function111 = (v2 & 0x40) == 0 ? function11 : d0.w;
                if((v2 & 0x80) == 0) {
                    v5 = v3;
                    function115 = function12;
                }
                else {
                    v5 = v3 & 0xFE3FFFFF;
                    function115 = function114;
                }
                if((v2 & 0x100) == 0) {
                    function112 = function13;
                }
                else {
                    v5 &= 0xF1FFFFFF;
                    function112 = function111;
                }
                function113 = (v2 & 0x200) == 0 ? function14 : null;
            }
            else {
                composer1.skipToGroupEnd();
                if((v2 & 0x80) != 0) {
                    v3 &= 0xFE3FFFFF;
                }
                if((v2 & 0x100) != 0) {
                    v3 &= 0xF1FFFFFF;
                }
                function111 = function11;
                function112 = function13;
                function113 = function14;
                modifier2 = modifier0;
                alignment2 = alignment0;
                function114 = function10;
                v5 = v3;
                function115 = function12;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x6DAFFDB6, v5, v4, "androidx.navigation.compose.NavHost (NavHost.kt:210)");
            }
            NavGraph navGraph0 = composer1.rememberedValue();
            if((((0xE000 & v5) == 0x4000 ? 1 : 0) | ((v5 & 0x70) == 0x20 ? 1 : 0) | ((v4 & 14) == 4 ? 1 : 0)) != 0 || navGraph0 == Composer.Companion.getEmpty()) {
                NavGraphBuilder navGraphBuilder0 = new NavGraphBuilder(navHostController0.getNavigatorProvider(), s, s2);
                function15.invoke(navGraphBuilder0);
                navGraph0 = navGraphBuilder0.build();
                composer1.updateRememberedValue(navGraph0);
            }
            NavHostKt.NavHost(navHostController0, navGraph0, modifier2, alignment2, function114, function111, function115, function112, function113, composer1, v5 & 8078 | 0xE000 & v5 >> 3 | 0x70000 & v5 >> 3 | 0x380000 & v5 >> 3 | 0x1C00000 & v5 >> 3 | v5 >> 3 & 0xE000000, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier1 = modifier2;
            alignment1 = alignment2;
            function17 = function111;
            function18 = function113;
            function110 = function112;
            s3 = s2;
            function19 = function115;
            function16 = function114;
        }
        else {
            composer1.skipToGroupEnd();
            function16 = function10;
            function17 = function11;
            function18 = function14;
            s3 = s2;
            modifier1 = modifier0;
            alignment1 = alignment0;
            function19 = function12;
            function110 = function13;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new o4.g(navHostController0, s, modifier1, alignment1, s3, function16, function17, function19, function110, function18, function15, v, v1, v2));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Deprecated in favor of NavHost that supports AnimatedContent")
    public static final void NavHost(NavHostController navHostController0, String s, Modifier modifier0, String s1, Function1 function10, Composer composer0, int v, int v1) {
        String s2;
        Modifier modifier1;
        int v2;
        Composer composer1 = composer0.startRestartGroup(0x8741DC0);
        if((v1 & 1) == 0) {
            v2 = (v & 6) == 0 ? (composer1.changedInstance(navHostController0) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x30) == 0) {
            v2 |= (composer1.changed(s) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
            modifier1 = modifier0;
        }
        else if((v & 0x180) == 0) {
            modifier1 = modifier0;
            v2 |= (composer1.changed(modifier1) ? 0x100 : 0x80);
        }
        else {
            modifier1 = modifier0;
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
        }
        else if((v & 0xC00) == 0) {
            v2 |= (composer1.changed(s1) ? 0x800 : 0x400);
        }
        if((v1 & 16) != 0) {
            v2 |= 0x6000;
        }
        else if((v & 0x6000) == 0) {
            v2 |= (composer1.changedInstance(function10) ? 0x4000 : 0x2000);
        }
        if((v2 & 9363) != 9362 || !composer1.getSkipping()) {
            Modifier modifier2 = (v1 & 4) == 0 ? modifier1 : Modifier.Companion;
            String s3 = (v1 & 8) == 0 ? s1 : null;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x8741DC0, v2, -1, "androidx.navigation.compose.NavHost (NavHost.kt:90)");
            }
            NavGraph navGraph0 = composer1.rememberedValue();
            if((((v2 & 0x1C00) == 0x800 ? 1 : 0) | ((v2 & 0x70) == 0x20 ? 1 : 0) | ((0xE000 & v2) == 0x4000 ? 1 : 0)) != 0 || navGraph0 == Composer.Companion.getEmpty()) {
                NavGraphBuilder navGraphBuilder0 = new NavGraphBuilder(navHostController0.getNavigatorProvider(), s, s3);
                function10.invoke(navGraphBuilder0);
                navGraph0 = navGraphBuilder0.build();
                composer1.updateRememberedValue(navGraph0);
            }
            NavHostKt.NavHost(navHostController0, navGraph0, modifier2, null, null, null, null, null, null, composer1, v2 & 910, 504);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier1 = modifier2;
            s2 = s3;
        }
        else {
            composer1.skipToGroupEnd();
            s2 = s1;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new v2(navHostController0, s, modifier1, s2, function10, v, v1, 1));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void NavHost(@NotNull NavHostController navHostController0, @NotNull KClass kClass0, @Nullable Modifier modifier0, @Nullable Alignment alignment0, @Nullable KClass kClass1, @Nullable Map map0, @Nullable Function1 function10, @Nullable Function1 function11, @Nullable Function1 function12, @Nullable Function1 function13, @Nullable Function1 function14, @NotNull Function1 function15, @Nullable Composer composer0, int v, int v1, int v2) {
        Function1 function111;
        Function1 function110;
        Alignment alignment1;
        Modifier modifier2;
        Function1 function19;
        Function1 function18;
        Function1 function17;
        Map map1;
        KClass kClass2;
        Function1 function115;
        Map map2;
        Alignment alignment2;
        int v5;
        Function1 function114;
        Function1 function113;
        Function1 function112;
        KClass kClass3;
        int v6;
        int v4;
        Function1 function16;
        Modifier modifier1;
        int v3;
        Composer composer1 = composer0.startRestartGroup(750467758);
        if((v2 & 1) == 0) {
            v3 = (v & 6) == 0 ? (composer1.changedInstance(navHostController0) ? 4 : 2) | v : v;
        }
        else {
            v3 = v | 6;
        }
        if((v2 & 2) != 0) {
            v3 |= 0x30;
        }
        else if((v & 0x30) == 0) {
            v3 |= (composer1.changedInstance(kClass0) ? 0x20 : 16);
        }
        if((v2 & 4) != 0) {
            v3 |= 0x180;
            modifier1 = modifier0;
        }
        else if((v & 0x180) == 0) {
            modifier1 = modifier0;
            v3 |= (composer1.changed(modifier1) ? 0x100 : 0x80);
        }
        else {
            modifier1 = modifier0;
        }
        if((v2 & 8) != 0) {
            v3 |= 0xC00;
        }
        else if((v & 0xC00) == 0) {
            v3 |= (composer1.changed(alignment0) ? 0x800 : 0x400);
        }
        if((v2 & 16) != 0) {
            v3 |= 0x6000;
        }
        else if((v & 0x6000) == 0) {
            v3 |= (composer1.changedInstance(kClass1) ? 0x4000 : 0x2000);
        }
        if((v2 & 0x20) != 0) {
            v3 |= 0x30000;
        }
        else if((v & 0x30000) == 0) {
            v3 |= (composer1.changedInstance(map0) ? 0x20000 : 0x10000);
        }
        if((v2 & 0x40) == 0) {
            function16 = function10;
            if((v & 0x180000) == 0) {
                v3 |= (composer1.changedInstance(function16) ? 0x100000 : 0x80000);
            }
        }
        else {
            v3 |= 0x180000;
            function16 = function10;
        }
        if((v2 & 0x80) != 0) {
            v3 |= 0xC00000;
        }
        else if((v & 0xC00000) == 0) {
            v3 |= (composer1.changedInstance(function11) ? 0x800000 : 0x400000);
        }
        if((v & 0x6000000) == 0) {
            v3 |= ((v2 & 0x100) != 0 || !composer1.changedInstance(function12) ? 0x2000000 : 0x4000000);
        }
        if((v & 0x30000000) == 0) {
            v3 |= ((v2 & 0x200) != 0 || !composer1.changedInstance(function13) ? 0x10000000 : 0x20000000);
        }
        if((v2 & 0x400) == 0) {
            v4 = (v1 & 6) == 0 ? v1 | (composer1.changedInstance(function14) ? 4 : 2) : v1;
        }
        else {
            v4 = v1 | 6;
        }
        if((v2 & 0x800) != 0) {
            v4 |= 0x30;
        }
        else if((v1 & 0x30) == 0) {
            v4 |= (composer1.changedInstance(function15) ? 0x20 : 16);
        }
        if((v3 & 306783379) != 306783378 || (v4 & 19) != 18 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v & 1) == 0 || composer1.getDefaultsInvalid()) {
                Modifier modifier3 = (v2 & 4) == 0 ? modifier1 : Modifier.Companion;
                alignment2 = (v2 & 8) == 0 ? alignment0 : Alignment.Companion.getTopStart();
                kClass3 = (v2 & 16) == 0 ? kClass1 : null;
                map2 = (v2 & 0x20) == 0 ? map0 : kotlin.collections.x.emptyMap();
                if((v2 & 0x40) != 0) {
                    function16 = h.w;
                }
                function112 = (v2 & 0x80) == 0 ? function11 : i.w;
                if((v2 & 0x100) == 0) {
                    v6 = v3;
                    function115 = function12;
                }
                else {
                    v6 = v3 & 0xF1FFFFFF;
                    function115 = function16;
                }
                if((v2 & 0x200) == 0) {
                    function113 = function13;
                }
                else {
                    v6 &= 0x8FFFFFFF;
                    function113 = function112;
                }
                if((v2 & 0x400) == 0) {
                    function114 = function14;
                    v5 = v6;
                }
                else {
                    v5 = v6;
                    function114 = null;
                }
                modifier1 = modifier3;
            }
            else {
                composer1.skipToGroupEnd();
                if((v2 & 0x100) != 0) {
                    v3 &= 0xF1FFFFFF;
                }
                if((v2 & 0x200) != 0) {
                    v3 &= 0x8FFFFFFF;
                }
                kClass3 = kClass1;
                function112 = function11;
                function113 = function13;
                function114 = function14;
                v5 = v3;
                alignment2 = alignment0;
                map2 = map0;
                function115 = function12;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(750467758, v5, v4, "androidx.navigation.compose.NavHost (NavHost.kt:282)");
            }
            boolean z = composer1.changed(kClass3);
            boolean z1 = composer1.changed(kClass0);
            NavGraph navGraph0 = composer1.rememberedValue();
            if((((v4 & 0x70) == 0x20 ? 1 : 0) | (z | z1)) != 0 || navGraph0 == Composer.Companion.getEmpty()) {
                NavGraphBuilder navGraphBuilder0 = new NavGraphBuilder(navHostController0.getNavigatorProvider(), kClass0, kClass3, map2);
                function15.invoke(navGraphBuilder0);
                navGraph0 = navGraphBuilder0.build();
                composer1.updateRememberedValue(navGraph0);
            }
            NavHostKt.NavHost(navHostController0, navGraph0, modifier1, alignment2, function16, function112, function115, function113, function114, composer1, v5 & 8078 | 0xE000 & v5 >> 6 | 0x70000 & v5 >> 6 | 0x380000 & v5 >> 6 | v5 >> 6 & 0x1C00000 | v4 << 24 & 0xE000000, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier1;
            kClass2 = kClass3;
            function18 = function114;
            function111 = function113;
            alignment1 = alignment2;
            function19 = function16;
            function110 = function112;
            function17 = function115;
            map1 = map2;
        }
        else {
            composer1.skipToGroupEnd();
            kClass2 = kClass1;
            map1 = map0;
            function17 = function12;
            function18 = function14;
            function19 = function16;
            modifier2 = modifier1;
            alignment1 = alignment0;
            function110 = function11;
            function111 = function13;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new j(navHostController0, kClass0, modifier2, alignment1, kClass2, map1, function19, function110, function17, function111, function18, function15, v, v1, v2));
        }
    }

    public static final boolean access$NavHost$lambda$11(MutableState mutableState0) {
        return ((Boolean)mutableState0.getValue()).booleanValue();
    }

    public static final void access$NavHost$lambda$12(MutableState mutableState0, boolean z) {
        mutableState0.setValue(Boolean.valueOf(z));
    }

    public static final List access$NavHost$lambda$15(State state0) {
        return (List)state0.getValue();
    }

    public static final List access$NavHost$lambda$17(State state0) {
        return (List)state0.getValue();
    }

    public static final List access$NavHost$lambda$6(State state0) {
        return (List)state0.getValue();
    }

    public static final float access$NavHost$lambda$8(MutableFloatState mutableFloatState0) {
        return mutableFloatState0.getFloatValue();
    }

    public static final void access$NavHost$lambda$9(MutableFloatState mutableFloatState0, float f) {
        mutableFloatState0.setFloatValue(f);
    }

    public static final EnterTransition access$createEnterTransition(NavDestination navDestination0, AnimatedContentTransitionScope animatedContentTransitionScope0) {
        if(navDestination0 instanceof Destination) {
            Function1 function10 = ((Destination)navDestination0).getEnterTransition$navigation_compose_release();
            return function10 == null ? null : ((EnterTransition)function10.invoke(animatedContentTransitionScope0));
        }
        if(navDestination0 instanceof ComposeNavGraph) {
            Function1 function11 = ((ComposeNavGraph)navDestination0).getEnterTransition$navigation_compose_release();
            return function11 == null ? null : ((EnterTransition)function11.invoke(animatedContentTransitionScope0));
        }
        return null;
    }

    public static final ExitTransition access$createExitTransition(NavDestination navDestination0, AnimatedContentTransitionScope animatedContentTransitionScope0) {
        if(navDestination0 instanceof Destination) {
            Function1 function10 = ((Destination)navDestination0).getExitTransition$navigation_compose_release();
            return function10 == null ? null : ((ExitTransition)function10.invoke(animatedContentTransitionScope0));
        }
        if(navDestination0 instanceof ComposeNavGraph) {
            Function1 function11 = ((ComposeNavGraph)navDestination0).getExitTransition$navigation_compose_release();
            return function11 == null ? null : ((ExitTransition)function11.invoke(animatedContentTransitionScope0));
        }
        return null;
    }

    public static final EnterTransition access$createPopEnterTransition(NavDestination navDestination0, AnimatedContentTransitionScope animatedContentTransitionScope0) {
        if(navDestination0 instanceof Destination) {
            Function1 function10 = ((Destination)navDestination0).getPopEnterTransition$navigation_compose_release();
            return function10 == null ? null : ((EnterTransition)function10.invoke(animatedContentTransitionScope0));
        }
        if(navDestination0 instanceof ComposeNavGraph) {
            Function1 function11 = ((ComposeNavGraph)navDestination0).getPopEnterTransition$navigation_compose_release();
            return function11 == null ? null : ((EnterTransition)function11.invoke(animatedContentTransitionScope0));
        }
        return null;
    }

    public static final ExitTransition access$createPopExitTransition(NavDestination navDestination0, AnimatedContentTransitionScope animatedContentTransitionScope0) {
        if(navDestination0 instanceof Destination) {
            Function1 function10 = ((Destination)navDestination0).getPopExitTransition$navigation_compose_release();
            return function10 == null ? null : ((ExitTransition)function10.invoke(animatedContentTransitionScope0));
        }
        if(navDestination0 instanceof ComposeNavGraph) {
            Function1 function11 = ((ComposeNavGraph)navDestination0).getPopExitTransition$navigation_compose_release();
            return function11 == null ? null : ((ExitTransition)function11.invoke(animatedContentTransitionScope0));
        }
        return null;
    }

    public static final SizeTransform access$createSizeTransform(NavDestination navDestination0, AnimatedContentTransitionScope animatedContentTransitionScope0) {
        if(navDestination0 instanceof Destination) {
            Function1 function10 = ((Destination)navDestination0).getSizeTransform$navigation_compose_release();
            return function10 == null ? null : ((SizeTransform)function10.invoke(animatedContentTransitionScope0));
        }
        if(navDestination0 instanceof ComposeNavGraph) {
            Function1 function11 = ((ComposeNavGraph)navDestination0).getSizeTransform$navigation_compose_release();
            return function11 == null ? null : ((SizeTransform)function11.invoke(animatedContentTransitionScope0));
        }
        return null;
    }
}

