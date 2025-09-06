package coil.compose;

import android.content.Context;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import coil.ImageLoader;
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

@Metadata(d1 = {"\u0000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001A\u001E\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u0005H\u0087\b\u00A2\u0006\u0002\u0010\u0006\u001Ah\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00052H\u0010\u0007\u001AD\u0012\u001A\u0012\u0018\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000B0\tj\u0002`\f\u0012\u001A\u0012\u0018\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000B0\tj\u0002`\f\u0012\u0004\u0012\u00020\r0\bj\u0002`\u000EH\u0087\b\u00A2\u0006\u0002\u0010\u000F\u001A \u0010\u0000\u001A\u00020\u00012\b\u0010\u0010\u001A\u0004\u0018\u00010\u00112\u0006\u0010\u0004\u001A\u00020\u0005H\u0087\b\u00A2\u0006\u0002\u0010\u0012\u001Aj\u0010\u0000\u001A\u00020\u00012\b\u0010\u0010\u001A\u0004\u0018\u00010\u00112\u0006\u0010\u0004\u001A\u00020\u00052H\u0010\u0007\u001AD\u0012\u001A\u0012\u0018\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000B0\tj\u0002`\f\u0012\u001A\u0012\u0018\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000B0\tj\u0002`\f\u0012\u0004\u0012\u00020\r0\bj\u0002`\u000EH\u0087\b\u00A2\u0006\u0002\u0010\u0013\u001A\u0083\u0001\u0010\u0000\u001A\u00020\u00012\b\u0010\u0010\u001A\u0004\u0018\u00010\u00112\u0006\u0010\u0004\u001A\u00020\u00052H\u0010\u0007\u001AD\u0012\u001A\u0012\u0018\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000B0\tj\u0002`\f\u0012\u001A\u0012\u0018\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000B0\tj\u0002`\f\u0012\u0004\u0012\u00020\r0\bj\u0002`\u000E2\u0017\u0010\u0014\u001A\u0013\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0015\u00A2\u0006\u0002\b\u0018H\u0087\b\u00A2\u0006\u0002\u0010\u0019\u001A9\u0010\u0000\u001A\u00020\u00012\b\u0010\u0010\u001A\u0004\u0018\u00010\u00112\u0006\u0010\u0004\u001A\u00020\u00052\u0017\u0010\u0014\u001A\u0013\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0015\u00A2\u0006\u0002\b\u0018H\u0087\b\u00A2\u0006\u0002\u0010\u001A*\\\b\u0002\u0010\u001B\"\u0014\u0012\u0004\u0012\u0002`\f\u0012\u0004\u0012\u0002`\f\u0012\u0004\u0012\u00020\r0\b2@\u0012\u001A\u0012\u0018\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000B0\tj\u0002`\f\u0012\u001A\u0012\u0018\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000B0\tj\u0002`\f\u0012\u0004\u0012\u00020\r0\b*>\b\u0007\u0010\u001C\"\u00020\u00012\u00020\u0001B0\b\u001D\u0012\b\b\u001E\u0012\u0004\b\b(\u001F\u0012\"\b \u0012\u001E\b\u000BB\u001A\b!\u0012\f\b\"\u0012\b\b\fJ\u0004\b\b(#\u0012\b\b$\u0012\u0004\b\b(%*0\b\u0002\u0010&\"\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000B0\t2\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000B0\t\u00A8\u0006\'"}, d2 = {"rememberImagePainter", "Lcoil/compose/AsyncImagePainter;", "request", "Lcoil/request/ImageRequest;", "imageLoader", "Lcoil/ImageLoader;", "(Lcoil/request/ImageRequest;Lcoil/ImageLoader;Landroidx/compose/runtime/Composer;I)Lcoil/compose/AsyncImagePainter;", "onExecute", "Lkotlin/Function2;", "Lkotlin/Triple;", "Lcoil/compose/AsyncImagePainter$State;", "Landroidx/compose/ui/geometry/Size;", "Lcoil/compose/Snapshot;", "", "Lcoil/compose/ExecuteCallback;", "(Lcoil/request/ImageRequest;Lcoil/ImageLoader;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)Lcoil/compose/AsyncImagePainter;", "data", "", "(Ljava/lang/Object;Lcoil/ImageLoader;Landroidx/compose/runtime/Composer;I)Lcoil/compose/AsyncImagePainter;", "(Ljava/lang/Object;Lcoil/ImageLoader;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)Lcoil/compose/AsyncImagePainter;", "builder", "Lkotlin/Function1;", "Lcoil/request/ImageRequest$Builder;", "", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/Object;Lcoil/ImageLoader;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Lcoil/compose/AsyncImagePainter;", "(Ljava/lang/Object;Lcoil/ImageLoader;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Lcoil/compose/AsyncImagePainter;", "ExecuteCallback", "ImagePainter", "Lkotlin/Deprecated;", "message", "ImagePainter has been renamed to AsyncImagePainter.", "replaceWith", "Lkotlin/ReplaceWith;", "imports", "coil.compose.AsyncImagePainter", "expression", "AsyncImagePainter", "Snapshot", "coil-compose-base_release"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nImagePainter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImagePainter.kt\ncoil/compose/ImagePainterKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,126:1\n74#2:127\n74#2:128\n*S KotlinDebug\n*F\n+ 1 ImagePainter.kt\ncoil/compose/ImagePainterKt\n*L\n67#1:127\n91#1:128\n*E\n"})
public final class ImagePainterKt {
    @Deprecated(message = "ImagePainter has been renamed to AsyncImagePainter.", replaceWith = @ReplaceWith(expression = "AsyncImagePainter", imports = {"coil.compose.AsyncImagePainter"}))
    public static void ImagePainter$annotations() {
    }

    @Composable
    @Deprecated(message = "ImagePainter has been renamed to AsyncImagePainter.", replaceWith = @ReplaceWith(expression = "rememberAsyncImagePainter(request, imageLoader)", imports = {"coil.compose.rememberAsyncImagePainter"}))
    @NotNull
    public static final AsyncImagePainter rememberImagePainter(@NotNull ImageRequest imageRequest0, @NotNull ImageLoader imageLoader0, @Nullable Composer composer0, int v) {
        composer0.startReplaceableGroup(-2028135656);
        AsyncImagePainter asyncImagePainter0 = AsyncImagePainterKt.rememberAsyncImagePainter-0YpotYA(imageRequest0, imageLoader0, null, null, null, 0, null, composer0, 72, 0x7C);
        composer0.endReplaceableGroup();
        return asyncImagePainter0;
    }

    @Composable
    @Deprecated(level = DeprecationLevel.ERROR, message = "ImagePainter has been renamed to AsyncImagePainter.", replaceWith = @ReplaceWith(expression = "rememberAsyncImagePainter(request, imageLoader)", imports = {"coil.compose.rememberAsyncImagePainter"}))
    @NotNull
    public static final AsyncImagePainter rememberImagePainter(@NotNull ImageRequest imageRequest0, @NotNull ImageLoader imageLoader0, @NotNull Function2 function20, @Nullable Composer composer0, int v) {
        composer0.startReplaceableGroup(-2123088410);
        AsyncImagePainter asyncImagePainter0 = AsyncImagePainterKt.rememberAsyncImagePainter-0YpotYA(imageRequest0, imageLoader0, null, null, null, 0, null, composer0, 72, 0x7C);
        composer0.endReplaceableGroup();
        return asyncImagePainter0;
    }

    @Composable
    @Deprecated(message = "ImagePainter has been renamed to AsyncImagePainter.", replaceWith = @ReplaceWith(expression = "rememberAsyncImagePainter(data, imageLoader)", imports = {"coil.compose.rememberAsyncImagePainter"}))
    @NotNull
    public static final AsyncImagePainter rememberImagePainter(@Nullable Object object0, @NotNull ImageLoader imageLoader0, @Nullable Composer composer0, int v) {
        composer0.startReplaceableGroup(699722038);
        AsyncImagePainter asyncImagePainter0 = AsyncImagePainterKt.rememberAsyncImagePainter-0YpotYA(object0, imageLoader0, null, null, null, 0, null, composer0, 72, 0x7C);
        composer0.endReplaceableGroup();
        return asyncImagePainter0;
    }

    @Composable
    @Deprecated(message = "ImagePainter has been renamed to AsyncImagePainter.", replaceWith = @ReplaceWith(expression = "rememberAsyncImagePainter(ImageRequest.Builder(LocalContext.current).data(data).apply(builder).build(), imageLoader)", imports = {"androidx.compose.ui.platform.LocalContext", "coil.compose.rememberAsyncImagePainter", "coil.request.ImageRequest"}))
    @NotNull
    public static final AsyncImagePainter rememberImagePainter(@Nullable Object object0, @NotNull ImageLoader imageLoader0, @NotNull Function1 function10, @Nullable Composer composer0, int v) {
        composer0.startReplaceableGroup(1750824323);
        Builder imageRequest$Builder0 = new Builder(((Context)composer0.consume(AndroidCompositionLocals_androidKt.getLocalContext()))).data(object0);
        function10.invoke(imageRequest$Builder0);
        AsyncImagePainter asyncImagePainter0 = AsyncImagePainterKt.rememberAsyncImagePainter-0YpotYA(imageRequest$Builder0.build(), imageLoader0, null, null, null, 0, null, composer0, 72, 0x7C);
        composer0.endReplaceableGroup();
        return asyncImagePainter0;
    }

    @Composable
    @Deprecated(level = DeprecationLevel.ERROR, message = "ImagePainter has been renamed to AsyncImagePainter.", replaceWith = @ReplaceWith(expression = "rememberAsyncImagePainter(data, imageLoader)", imports = {"coil.compose.rememberAsyncImagePainter"}))
    @NotNull
    public static final AsyncImagePainter rememberImagePainter(@Nullable Object object0, @NotNull ImageLoader imageLoader0, @NotNull Function2 function20, @Nullable Composer composer0, int v) {
        composer0.startReplaceableGroup(0x8DEF7E84);
        AsyncImagePainter asyncImagePainter0 = AsyncImagePainterKt.rememberAsyncImagePainter-0YpotYA(object0, imageLoader0, null, null, null, 0, null, composer0, 72, 0x7C);
        composer0.endReplaceableGroup();
        return asyncImagePainter0;
    }

    @Composable
    @Deprecated(level = DeprecationLevel.ERROR, message = "ImagePainter has been renamed to AsyncImagePainter.", replaceWith = @ReplaceWith(expression = "rememberAsyncImagePainter(ImageRequest.Builder(LocalContext.current).data(data).apply(builder).build(), imageLoader)", imports = {"androidx.compose.ui.platform.LocalContext", "coil.compose.rememberAsyncImagePainter", "coil.request.ImageRequest"}))
    @NotNull
    public static final AsyncImagePainter rememberImagePainter(@Nullable Object object0, @NotNull ImageLoader imageLoader0, @NotNull Function2 function20, @NotNull Function1 function10, @Nullable Composer composer0, int v) {
        composer0.startReplaceableGroup(0xC5CE4151);
        Builder imageRequest$Builder0 = new Builder(((Context)composer0.consume(AndroidCompositionLocals_androidKt.getLocalContext()))).data(object0);
        function10.invoke(imageRequest$Builder0);
        AsyncImagePainter asyncImagePainter0 = AsyncImagePainterKt.rememberAsyncImagePainter-0YpotYA(imageRequest$Builder0.build(), imageLoader0, null, null, null, 0, null, composer0, 72, 0x7C);
        composer0.endReplaceableGroup();
        return asyncImagePainter0;
    }
}

