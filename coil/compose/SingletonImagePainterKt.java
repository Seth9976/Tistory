package coil.compose;

import android.content.Context;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import coil.request.ImageRequest.Builder;
import coil.request.ImageRequest;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001A\u0016\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u0003H\u0087\b\u00A2\u0006\u0002\u0010\u0004\u001A`\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032H\u0010\u0005\u001AD\u0012\u001A\u0012\u0018\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\u0007j\u0002`\n\u0012\u001A\u0012\u0018\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\u0007j\u0002`\n\u0012\u0004\u0012\u00020\u000B0\u0006j\u0002`\fH\u0087\b\u00A2\u0006\u0002\u0010\r\u001A\u0018\u0010\u0000\u001A\u00020\u00012\b\u0010\u000E\u001A\u0004\u0018\u00010\u000FH\u0087\b\u00A2\u0006\u0002\u0010\u0010\u001Ab\u0010\u0000\u001A\u00020\u00012\b\u0010\u000E\u001A\u0004\u0018\u00010\u000F2H\u0010\u0005\u001AD\u0012\u001A\u0012\u0018\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\u0007j\u0002`\n\u0012\u001A\u0012\u0018\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\u0007j\u0002`\n\u0012\u0004\u0012\u00020\u000B0\u0006j\u0002`\fH\u0087\b\u00A2\u0006\u0002\u0010\u0011\u001A{\u0010\u0000\u001A\u00020\u00012\b\u0010\u000E\u001A\u0004\u0018\u00010\u000F2H\u0010\u0005\u001AD\u0012\u001A\u0012\u0018\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\u0007j\u0002`\n\u0012\u001A\u0012\u0018\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\u0007j\u0002`\n\u0012\u0004\u0012\u00020\u000B0\u0006j\u0002`\f2\u0017\u0010\u0012\u001A\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013\u00A2\u0006\u0002\b\u0016H\u0087\b\u00A2\u0006\u0002\u0010\u0017\u001A1\u0010\u0000\u001A\u00020\u00012\b\u0010\u000E\u001A\u0004\u0018\u00010\u000F2\u0017\u0010\u0012\u001A\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013\u00A2\u0006\u0002\b\u0016H\u0087\b\u00A2\u0006\u0002\u0010\u0018*\\\b\u0002\u0010\u0019\"\u0014\u0012\u0004\u0012\u0002`\n\u0012\u0004\u0012\u0002`\n\u0012\u0004\u0012\u00020\u000B0\u00062@\u0012\u001A\u0012\u0018\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\u0007j\u0002`\n\u0012\u001A\u0012\u0018\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\u0007j\u0002`\n\u0012\u0004\u0012\u00020\u000B0\u0006*0\b\u0002\u0010\u001A\"\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\u00072\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\u0007\u00A8\u0006\u001B"}, d2 = {"rememberImagePainter", "Lcoil/compose/AsyncImagePainter;", "request", "Lcoil/request/ImageRequest;", "(Lcoil/request/ImageRequest;Landroidx/compose/runtime/Composer;I)Lcoil/compose/AsyncImagePainter;", "onExecute", "Lkotlin/Function2;", "Lkotlin/Triple;", "Lcoil/compose/AsyncImagePainter$State;", "Landroidx/compose/ui/geometry/Size;", "Lcoil/compose/Snapshot;", "", "Lcoil/compose/ExecuteCallback;", "(Lcoil/request/ImageRequest;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)Lcoil/compose/AsyncImagePainter;", "data", "", "(Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Lcoil/compose/AsyncImagePainter;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)Lcoil/compose/AsyncImagePainter;", "builder", "Lkotlin/Function1;", "Lcoil/request/ImageRequest$Builder;", "", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Lcoil/compose/AsyncImagePainter;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Lcoil/compose/AsyncImagePainter;", "ExecuteCallback", "Snapshot", "coil-compose-singleton_release"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSingletonImagePainter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SingletonImagePainter.kt\ncoil/compose/SingletonImagePainterKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,108:1\n74#2:109\n74#2:110\n*S KotlinDebug\n*F\n+ 1 SingletonImagePainter.kt\ncoil/compose/SingletonImagePainterKt\n*L\n54#1:109\n76#1:110\n*E\n"})
public final class SingletonImagePainterKt {
    @Composable
    @Deprecated(message = "ImagePainter has been renamed to AsyncImagePainter.", replaceWith = @ReplaceWith(expression = "rememberAsyncImagePainter(request)", imports = {"coil.compose.rememberAsyncImagePainter"}))
    @NotNull
    public static final AsyncImagePainter rememberImagePainter(@NotNull ImageRequest imageRequest0, @Nullable Composer composer0, int v) {
        composer0.startReplaceableGroup(0x7CA7050D);
        AsyncImagePainter asyncImagePainter0 = SingletonAsyncImagePainterKt.rememberAsyncImagePainter-EHKIwbg(imageRequest0, null, null, null, 0, null, composer0, 8, 62);
        composer0.endReplaceableGroup();
        return asyncImagePainter0;
    }

    @Composable
    @Deprecated(level = DeprecationLevel.ERROR, message = "ImagePainter has been renamed to AsyncImagePainter.", replaceWith = @ReplaceWith(expression = "rememberAsyncImagePainter(request)", imports = {"coil.compose.rememberAsyncImagePainter"}))
    @NotNull
    public static final AsyncImagePainter rememberImagePainter(@NotNull ImageRequest imageRequest0, @NotNull Function2 function20, @Nullable Composer composer0, int v) {
        composer0.startReplaceableGroup(-2003443841);
        AsyncImagePainter asyncImagePainter0 = SingletonAsyncImagePainterKt.rememberAsyncImagePainter-EHKIwbg(imageRequest0, null, null, null, 0, null, composer0, 8, 62);
        composer0.endReplaceableGroup();
        return asyncImagePainter0;
    }

    @Composable
    @Deprecated(message = "ImagePainter has been renamed to AsyncImagePainter.", replaceWith = @ReplaceWith(expression = "rememberAsyncImagePainter(data)", imports = {"coil.compose.rememberAsyncImagePainter"}))
    @NotNull
    public static final AsyncImagePainter rememberImagePainter(@Nullable Object object0, @Nullable Composer composer0, int v) {
        composer0.startReplaceableGroup(0x77191BAF);
        AsyncImagePainter asyncImagePainter0 = SingletonAsyncImagePainterKt.rememberAsyncImagePainter-EHKIwbg(object0, null, null, null, 0, null, composer0, 8, 62);
        composer0.endReplaceableGroup();
        return asyncImagePainter0;
    }

    @Composable
    @Deprecated(message = "ImagePainter has been renamed to AsyncImagePainter.", replaceWith = @ReplaceWith(expression = "rememberAsyncImagePainter(ImageRequest.Builder(LocalContext.current).data(data).apply(builder).build())", imports = {"androidx.compose.ui.platform.LocalContext", "coil.compose.rememberAsyncImagePainter", "coil.request.ImageRequest"}))
    @NotNull
    public static final AsyncImagePainter rememberImagePainter(@Nullable Object object0, @NotNull Function1 function10, @Nullable Composer composer0, int v) {
        composer0.startReplaceableGroup(309201794);
        Builder imageRequest$Builder0 = new Builder(((Context)composer0.consume(AndroidCompositionLocals_androidKt.getLocalContext()))).data(object0);
        function10.invoke(imageRequest$Builder0);
        AsyncImagePainter asyncImagePainter0 = SingletonAsyncImagePainterKt.rememberAsyncImagePainter-EHKIwbg(imageRequest$Builder0.build(), null, null, null, 0, null, composer0, 8, 62);
        composer0.endReplaceableGroup();
        return asyncImagePainter0;
    }

    @Composable
    @Deprecated(level = DeprecationLevel.ERROR, message = "ImagePainter has been renamed to AsyncImagePainter.", replaceWith = @ReplaceWith(expression = "rememberAsyncImagePainter(data)", imports = {"coil.compose.rememberAsyncImagePainter"}))
    @NotNull
    public static final AsyncImagePainter rememberImagePainter(@Nullable Object object0, @NotNull Function2 function20, @Nullable Composer composer0, int v) {
        composer0.startReplaceableGroup(2090701729);
        AsyncImagePainter asyncImagePainter0 = SingletonAsyncImagePainterKt.rememberAsyncImagePainter-EHKIwbg(object0, null, null, null, 0, null, composer0, 8, 62);
        composer0.endReplaceableGroup();
        return asyncImagePainter0;
    }

    @Composable
    @Deprecated(level = DeprecationLevel.ERROR, message = "ImagePainter has been renamed to AsyncImagePainter.", replaceWith = @ReplaceWith(expression = "rememberAsyncImagePainter(ImageRequest.Builder(LocalContext.current).data(data).apply(builder).build())", imports = {"androidx.compose.ui.platform.LocalContext", "coil.compose.rememberAsyncImagePainter", "coil.request.ImageRequest"}))
    @NotNull
    public static final AsyncImagePainter rememberImagePainter(@Nullable Object object0, @NotNull Function2 function20, @NotNull Function1 function10, @Nullable Composer composer0, int v) {
        composer0.startReplaceableGroup(0x123ABCF4);
        Builder imageRequest$Builder0 = new Builder(((Context)composer0.consume(AndroidCompositionLocals_androidKt.getLocalContext()))).data(object0);
        function10.invoke(imageRequest$Builder0);
        AsyncImagePainter asyncImagePainter0 = SingletonAsyncImagePainterKt.rememberAsyncImagePainter-EHKIwbg(imageRequest$Builder0.build(), null, null, null, 0, null, composer0, 8, 62);
        composer0.endReplaceableGroup();
        return asyncImagePainter0;
    }
}

