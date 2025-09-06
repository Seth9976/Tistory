package com.kakao.tistory.data.repository;

import android.content.ContentResolver;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import com.kakao.android.base.model.ErrorModel;
import com.kakao.android.base.utils.ImageUtils;
import com.kakao.tistory.data.service.EntryService;
import com.kakao.tistory.domain.ErrorStatus;
import com.kakao.tistory.domain.ErrorStatusKt;
import com.kakao.tistory.domain.entity.common.Result.Fail;
import com.kakao.tistory.domain.entity.common.Result.Success;
import com.kakao.tistory.domain.repository.EntryFileRepository;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import okhttp3.MediaType;
import okhttp3.MultipartBody.Part;
import okhttp3.RequestBody.Companion;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u001AB\u0019\b\u0007\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\f\u001A\u00020\u000B2\u0006\u0010\n\u001A\u00020\tH\u0094@¢\u0006\u0004\b\f\u0010\rJ&\u0010\u0013\u001A\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u000F\u001A\u00020\u000E2\u0006\u0010\u0010\u001A\u00020\u000EH\u0096@¢\u0006\u0004\b\u0013\u0010\u0014J8\u0010\u0018\u001A\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u000F\u001A\u00020\u000E2\u0006\u0010\u0015\u001A\u00020\u000E2\u0006\u0010\u0016\u001A\u00020\u000E2\b\u0010\u0017\u001A\u0004\u0018\u00010\u000EH\u0096@¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001B"}, d2 = {"Lcom/kakao/tistory/data/repository/EntryFileRepositoryImpl;", "Lcom/kakao/tistory/data/repository/BaseRepository;", "Lcom/kakao/tistory/domain/repository/EntryFileRepository;", "Lcom/kakao/tistory/data/service/EntryService;", "entryService", "Landroid/content/ContentResolver;", "contentResolver", "<init>", "(Lcom/kakao/tistory/data/service/EntryService;Landroid/content/ContentResolver;)V", "", "throwable", "Lcom/kakao/android/base/model/ErrorModel;", "createErrorModel", "(Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "blogName", "filePath", "Lcom/kakao/tistory/domain/entity/common/Result;", "Lcom/kakao/tistory/domain/entity/entry/AttachedData;", "postBlogAttachImage", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fileName", "contentUriPath", "mimeType", "postBlogAttachFile", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "com/kakao/tistory/data/repository/n0", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nEntryFileRepositoryImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EntryFileRepositoryImpl.kt\ncom/kakao/tistory/data/repository/EntryFileRepositoryImpl\n+ 2 BaseRepository.kt\ncom/kakao/tistory/data/repository/BaseRepository\n+ 3 BaseRepository.kt\ncom/kakao/tistory/data/repository/BaseRepository$checkError$2\n*L\n1#1,126:1\n26#2,27:127\n53#2:155\n26#2,27:156\n53#2:184\n35#2:185\n39#3:154\n39#3:183\n*S KotlinDebug\n*F\n+ 1 EntryFileRepositoryImpl.kt\ncom/kakao/tistory/data/repository/EntryFileRepositoryImpl\n*L\n49#1:127,27\n49#1:155\n82#1:156,27\n82#1:184\n82#1:185\n49#1:154\n82#1:183\n*E\n"})
public final class EntryFileRepositoryImpl extends BaseRepository implements EntryFileRepository {
    public final EntryService a;
    public final ContentResolver b;

    @Inject
    public EntryFileRepositoryImpl(@NotNull EntryService entryService0, @NotNull ContentResolver contentResolver0) {
        Intrinsics.checkNotNullParameter(entryService0, "entryService");
        Intrinsics.checkNotNullParameter(contentResolver0, "contentResolver");
        super();
        this.a = entryService0;
        this.b = contentResolver0;
    }

    public static final Part access$createImageMultipartBody(EntryFileRepositoryImpl entryFileRepositoryImpl0, String s) {
        entryFileRepositoryImpl0.getClass();
        String s1 = MimeTypeMap.getFileExtensionFromUrl(s);
        Intrinsics.checkNotNullExpressionValue(s1, "getFileExtensionFromUrl(...)");
        String s2 = s1.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(s2, "toLowerCase(...)");
        if((Intrinsics.areEqual(s2, "heic") ? true : Intrinsics.areEqual(s2, "heif"))) {
            Bitmap bitmap0 = ImageUtils.INSTANCE.getImageBitmap(s);
            ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
            if(bitmap0 != null) {
                bitmap0.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream0);
            }
            byte[] arr_b = byteArrayOutputStream0.toByteArray();
            Intrinsics.checkNotNullExpressionValue(arr_b, "toByteArray(...)");
            MediaType mediaType0 = MediaType.Companion.parse("image/*");
            RequestBody requestBody0 = Companion.create$default(RequestBody.Companion, arr_b, mediaType0, 0, 0, 6, null);
            String s3 = (String)CollectionsKt___CollectionsKt.last(StringsKt__StringsKt.split$default(s, new char[]{'/'}, false, 0, 6, null));
            return Part.Companion.createFormData("file", s3, requestBody0);
        }
        File file0 = new File(s);
        MediaType mediaType1 = MediaType.Companion.parse("image/*");
        RequestBody requestBody1 = RequestBody.Companion.create(file0, mediaType1);
        String s4 = file0.getName();
        return Part.Companion.createFormData("file", s4, requestBody1);
    }

    public static final Part access$createMultipartBody(EntryFileRepositoryImpl entryFileRepositoryImpl0, String s, Uri uri0, String s1) {
        entryFileRepositoryImpl0.getClass();
        okhttp3.MediaType.Companion mediaType$Companion0 = MediaType.Companion;
        if(s1 == null) {
            s1 = "*/*";
        }
        n0 n00 = new n0(mediaType$Companion0.parse(s1), entryFileRepositoryImpl0.b, uri0);
        return Part.Companion.createFormData("file", s, n00);
    }

    @Override  // com.kakao.tistory.data.repository.BaseRepository
    @Nullable
    public Object createErrorModel(@NotNull Throwable throwable0, @NotNull Continuation continuation0) {
        if(((throwable0 instanceof FileNotFoundException ? true : throwable0 instanceof SecurityException) ? true : throwable0 instanceof IOException)) {
            ErrorModel errorModel0 = new ErrorModel();
            errorModel0.setCode(ErrorStatus.FILE_NOT_FOUND.getCode());
            errorModel0.setStatus("FILE_NOT_FOUND");
            return errorModel0;
        }
        return super.createErrorModel(throwable0, continuation0);
    }

    @Override  // com.kakao.tistory.domain.repository.EntryFileRepository
    @Nullable
    public Object postBlogAttachFile(@NotNull String s, @NotNull String s1, @NotNull String s2, @Nullable String s3, @NotNull Continuation continuation0) {
        BaseRepository baseRepository0;
        o0 o00;
        if(continuation0 instanceof o0) {
            o00 = (o0)continuation0;
            int v = o00.d;
            if((v & 0x80000000) == 0) {
                o00 = new o0(this, continuation0);
            }
            else {
                o00.d = v ^ 0x80000000;
            }
        }
        else {
            o00 = new o0(this, continuation0);
        }
        Object object0 = o00.b;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(o00.d) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    Uri uri0 = Uri.parse(s2);
                    Intrinsics.checkNotNullExpressionValue(uri0, "parse(...)");
                    Part multipartBody$Part0 = EntryFileRepositoryImpl.access$createMultipartBody(this, s1, uri0, s3);
                    o00.a = this;
                    o00.d = 1;
                    object0 = this.a.postBlogAttach(s, multipartBody$Part0, o00);
                }
                catch(CancellationException cancellationException0) {
                    baseRepository0 = this;
                    o00.a = baseRepository0;
                    o00.d = 2;
                    return baseRepository0.sendError("coroutine cancel", cancellationException0, o00) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    baseRepository0 = this;
                    goto label_50;
                }
                if(object0 == object1) {
                    return object1;
                }
                baseRepository0 = this;
                break;
            }
            case 1: {
                baseRepository0 = (BaseRepository)o00.a;
                try {
                    ResultKt.throwOnFailure(object0);
                    break;
                }
                catch(CancellationException cancellationException0) {
                    o00.a = baseRepository0;
                    o00.d = 2;
                    return baseRepository0.sendError("coroutine cancel", cancellationException0, o00) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    goto label_50;
                }
            }
            case 2: {
                baseRepository0 = (BaseRepository)o00.a;
                ResultKt.throwOnFailure(object0);
                return new Fail(baseRepository0.createCoroutineCancelErrorModel());
            }
            case 3: {
                baseRepository0 = (BaseRepository)o00.a;
                ResultKt.throwOnFailure(object0);
                goto label_55;
            }
            case 4: 
            case 5: {
                ErrorModel errorModel0 = (ErrorModel)o00.a;
                ResultKt.throwOnFailure(object0);
                return new Fail(errorModel0);
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        try {
            return new Success(object0);
        }
        catch(CancellationException cancellationException0) {
            o00.a = baseRepository0;
            o00.d = 2;
            return baseRepository0.sendError("coroutine cancel", cancellationException0, o00) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
        }
        catch(Throwable throwable0) {
        }
    label_50:
        o00.a = baseRepository0;
        o00.d = 3;
        object0 = baseRepository0.createErrorModel(throwable0, o00);
        if(object0 == object1) {
            return object1;
        }
    label_55:
        if(ErrorStatusKt.checkAuthTokenError("EXCEPTION_UNKNOWN_STATUS")) {
            MutableSharedFlow mutableSharedFlow0 = baseRepository0.getThrowableRepository().getSessionThrowable();
            o00.a = (ErrorModel)object0;
            o00.d = 4;
            if(mutableSharedFlow0.emit(((ErrorModel)object0), o00) == object1) {
                return object1;
            }
        }
        else if(ErrorStatusKt.checkInspectionError(((ErrorModel)object0).getCode())) {
            MutableSharedFlow mutableSharedFlow1 = baseRepository0.getThrowableRepository().getInspectionThrowable();
            o00.a = (ErrorModel)object0;
            o00.d = 5;
            if(mutableSharedFlow1.emit(((ErrorModel)object0), o00) == object1) {
                return object1;
            }
        }
        return new Fail(((ErrorModel)object0));
    }

    @Override  // com.kakao.tistory.domain.repository.EntryFileRepository
    @Nullable
    public Object postBlogAttachImage(@NotNull String s, @NotNull String s1, @NotNull Continuation continuation0) {
        BaseRepository baseRepository0;
        p0 p00;
        if(continuation0 instanceof p0) {
            p00 = (p0)continuation0;
            int v = p00.d;
            if((v & 0x80000000) == 0) {
                p00 = new p0(this, continuation0);
            }
            else {
                p00.d = v ^ 0x80000000;
            }
        }
        else {
            p00 = new p0(this, continuation0);
        }
        Object object0 = p00.b;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(p00.d) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    Part multipartBody$Part0 = EntryFileRepositoryImpl.access$createImageMultipartBody(this, s1);
                    p00.a = this;
                    p00.d = 1;
                    object0 = this.a.postBlogAttach(s, multipartBody$Part0, p00);
                }
                catch(CancellationException cancellationException0) {
                    baseRepository0 = this;
                    p00.a = baseRepository0;
                    p00.d = 2;
                    return baseRepository0.sendError("coroutine cancel", cancellationException0, p00) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    baseRepository0 = this;
                    goto label_48;
                }
                if(object0 == object1) {
                    return object1;
                }
                baseRepository0 = this;
                break;
            }
            case 1: {
                baseRepository0 = (BaseRepository)p00.a;
                try {
                    ResultKt.throwOnFailure(object0);
                    break;
                }
                catch(CancellationException cancellationException0) {
                    p00.a = baseRepository0;
                    p00.d = 2;
                    return baseRepository0.sendError("coroutine cancel", cancellationException0, p00) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
                }
                catch(Throwable throwable0) {
                    goto label_48;
                }
            }
            case 2: {
                baseRepository0 = (BaseRepository)p00.a;
                ResultKt.throwOnFailure(object0);
                return new Fail(baseRepository0.createCoroutineCancelErrorModel());
            }
            case 3: {
                baseRepository0 = (BaseRepository)p00.a;
                ResultKt.throwOnFailure(object0);
                goto label_53;
            }
            case 4: 
            case 5: {
                ErrorModel errorModel0 = (ErrorModel)p00.a;
                ResultKt.throwOnFailure(object0);
                return new Fail(errorModel0);
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        try {
            return new Success(object0);
        }
        catch(CancellationException cancellationException0) {
            p00.a = baseRepository0;
            p00.d = 2;
            return baseRepository0.sendError("coroutine cancel", cancellationException0, p00) == object1 ? object1 : new Fail(baseRepository0.createCoroutineCancelErrorModel());
        }
        catch(Throwable throwable0) {
        }
    label_48:
        p00.a = baseRepository0;
        p00.d = 3;
        object0 = baseRepository0.createErrorModel(throwable0, p00);
        if(object0 == object1) {
            return object1;
        }
    label_53:
        if(ErrorStatusKt.checkAuthTokenError("EXCEPTION_UNKNOWN_STATUS")) {
            MutableSharedFlow mutableSharedFlow0 = baseRepository0.getThrowableRepository().getSessionThrowable();
            p00.a = (ErrorModel)object0;
            p00.d = 4;
            if(mutableSharedFlow0.emit(((ErrorModel)object0), p00) == object1) {
                return object1;
            }
        }
        else if(ErrorStatusKt.checkInspectionError(((ErrorModel)object0).getCode())) {
            MutableSharedFlow mutableSharedFlow1 = baseRepository0.getThrowableRepository().getInspectionThrowable();
            p00.a = (ErrorModel)object0;
            p00.d = 5;
            if(mutableSharedFlow1.emit(((ErrorModel)object0), p00) == object1) {
                return object1;
            }
        }
        return new Fail(((ErrorModel)object0));
    }
}

