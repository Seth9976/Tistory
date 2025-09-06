package com.kakao.tistory.presentation.screen.blog.setting.contract;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.text.input.TextFieldValue;
import com.kakao.tistory.domain.blog.entity.BlogInfo;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Immutable
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0005\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b)\n\u0002\u0010\b\n\u0002\bJ\b\u0087\b\u0018\u00002\u00020\u0001B\u00F8\u0002\u0012%\b\u0002\u0010\b\u001A\u001F\u0012\u0015\u0012\u0013\u0018\u00010\u0003\u00A2\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00070\u0002\u0012\n\b\u0002\u0010\t\u001A\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000B\u001A\u00020\n\u0012\u0014\b\u0002\u0010\f\u001A\u000E\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00070\u0002\u0012\b\b\u0002\u0010\u000E\u001A\u00020\r\u0012\b\b\u0002\u0010\u000F\u001A\u00020\n\u0012\u0014\b\u0002\u0010\u0010\u001A\u000E\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00070\u0002\u0012\b\b\u0002\u0010\u0011\u001A\u00020\n\u0012\b\b\u0002\u0010\u0012\u001A\u00020\r\u0012\n\b\u0002\u0010\u0014\u001A\u0004\u0018\u00010\u0013\u0012\u0014\b\u0002\u0010\u0015\u001A\u000E\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00070\u0002\u0012\u000E\b\u0002\u0010\u0017\u001A\b\u0012\u0004\u0012\u00020\u00070\u0016\u0012\n\b\u0002\u0010\u0018\u001A\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u001A\u001A\u00020\u0019\u0012\u000E\b\u0002\u0010\u001B\u001A\b\u0012\u0004\u0012\u00020\u00070\u0016\u0012\u000E\b\u0002\u0010\u001C\u001A\b\u0012\u0004\u0012\u00020\u00070\u0016\u0012\u000E\b\u0002\u0010\u001D\u001A\b\u0012\u0004\u0012\u00020\u00070\u0016\u0012\u0014\b\u0002\u0010\u001E\u001A\u000E\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00070\u0002\u0012\u000E\b\u0002\u0010\u001F\u001A\b\u0012\u0004\u0012\u00020\u00070\u0016\u0012\n\b\u0002\u0010!\u001A\u0004\u0018\u00010 \u0012\f\u0010\"\u001A\b\u0012\u0004\u0012\u00020\u00070\u0016\u0012\n\b\u0002\u0010$\u001A\u0004\u0018\u00010#\u0012\f\u0010%\u001A\b\u0012\u0004\u0012\u00020\u00070\u0016\u0012\f\u0010&\u001A\b\u0012\u0004\u0012\u00020\u00070\u0016\u00A2\u0006\u0004\b\'\u0010(J-\u0010)\u001A\u001F\u0012\u0015\u0012\u0013\u0018\u00010\u0003\u00A2\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00070\u0002H\u00C6\u0003\u00A2\u0006\u0004\b)\u0010*J\u0012\u0010+\u001A\u0004\u0018\u00010\u0003H\u00C6\u0003\u00A2\u0006\u0004\b+\u0010,J\u0010\u0010-\u001A\u00020\nH\u00C6\u0003\u00A2\u0006\u0004\b-\u0010.J\u001C\u0010/\u001A\u000E\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00070\u0002H\u00C6\u0003\u00A2\u0006\u0004\b/\u0010*J\u0010\u00100\u001A\u00020\rH\u00C6\u0003\u00A2\u0006\u0004\b0\u00101J\u0010\u00102\u001A\u00020\nH\u00C6\u0003\u00A2\u0006\u0004\b2\u0010.J\u001C\u00103\u001A\u000E\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00070\u0002H\u00C6\u0003\u00A2\u0006\u0004\b3\u0010*J\u0010\u00104\u001A\u00020\nH\u00C6\u0003\u00A2\u0006\u0004\b4\u0010.J\u0010\u00105\u001A\u00020\rH\u00C6\u0003\u00A2\u0006\u0004\b5\u00101J\u0012\u00106\u001A\u0004\u0018\u00010\u0013H\u00C6\u0003\u00A2\u0006\u0004\b6\u00107J\u001C\u00108\u001A\u000E\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00070\u0002H\u00C6\u0003\u00A2\u0006\u0004\b8\u0010*J\u0016\u00109\u001A\b\u0012\u0004\u0012\u00020\u00070\u0016H\u00C6\u0003\u00A2\u0006\u0004\b9\u0010:J\u0012\u0010;\u001A\u0004\u0018\u00010\u0013H\u00C6\u0003\u00A2\u0006\u0004\b;\u00107J\u0010\u0010<\u001A\u00020\u0019H\u00C6\u0003\u00A2\u0006\u0004\b<\u0010=J\u0016\u0010>\u001A\b\u0012\u0004\u0012\u00020\u00070\u0016H\u00C6\u0003\u00A2\u0006\u0004\b>\u0010:J\u0016\u0010?\u001A\b\u0012\u0004\u0012\u00020\u00070\u0016H\u00C6\u0003\u00A2\u0006\u0004\b?\u0010:J\u0016\u0010@\u001A\b\u0012\u0004\u0012\u00020\u00070\u0016H\u00C6\u0003\u00A2\u0006\u0004\b@\u0010:J\u001C\u0010A\u001A\u000E\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00070\u0002H\u00C6\u0003\u00A2\u0006\u0004\bA\u0010*J\u0016\u0010B\u001A\b\u0012\u0004\u0012\u00020\u00070\u0016H\u00C6\u0003\u00A2\u0006\u0004\bB\u0010:J\u0012\u0010C\u001A\u0004\u0018\u00010 H\u00C6\u0003\u00A2\u0006\u0004\bC\u0010DJ\u0016\u0010E\u001A\b\u0012\u0004\u0012\u00020\u00070\u0016H\u00C6\u0003\u00A2\u0006\u0004\bE\u0010:J\u0012\u0010F\u001A\u0004\u0018\u00010#H\u00C6\u0003\u00A2\u0006\u0004\bF\u0010GJ\u0016\u0010H\u001A\b\u0012\u0004\u0012\u00020\u00070\u0016H\u00C6\u0003\u00A2\u0006\u0004\bH\u0010:J\u0016\u0010I\u001A\b\u0012\u0004\u0012\u00020\u00070\u0016H\u00C6\u0003\u00A2\u0006\u0004\bI\u0010:J\u0087\u0003\u0010J\u001A\u00020\u00002%\b\u0002\u0010\b\u001A\u001F\u0012\u0015\u0012\u0013\u0018\u00010\u0003\u00A2\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00070\u00022\n\b\u0002\u0010\t\u001A\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000B\u001A\u00020\n2\u0014\b\u0002\u0010\f\u001A\u000E\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00070\u00022\b\b\u0002\u0010\u000E\u001A\u00020\r2\b\b\u0002\u0010\u000F\u001A\u00020\n2\u0014\b\u0002\u0010\u0010\u001A\u000E\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00070\u00022\b\b\u0002\u0010\u0011\u001A\u00020\n2\b\b\u0002\u0010\u0012\u001A\u00020\r2\n\b\u0002\u0010\u0014\u001A\u0004\u0018\u00010\u00132\u0014\b\u0002\u0010\u0015\u001A\u000E\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00070\u00022\u000E\b\u0002\u0010\u0017\u001A\b\u0012\u0004\u0012\u00020\u00070\u00162\n\b\u0002\u0010\u0018\u001A\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u001A\u001A\u00020\u00192\u000E\b\u0002\u0010\u001B\u001A\b\u0012\u0004\u0012\u00020\u00070\u00162\u000E\b\u0002\u0010\u001C\u001A\b\u0012\u0004\u0012\u00020\u00070\u00162\u000E\b\u0002\u0010\u001D\u001A\b\u0012\u0004\u0012\u00020\u00070\u00162\u0014\b\u0002\u0010\u001E\u001A\u000E\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00070\u00022\u000E\b\u0002\u0010\u001F\u001A\b\u0012\u0004\u0012\u00020\u00070\u00162\n\b\u0002\u0010!\u001A\u0004\u0018\u00010 2\u000E\b\u0002\u0010\"\u001A\b\u0012\u0004\u0012\u00020\u00070\u00162\n\b\u0002\u0010$\u001A\u0004\u0018\u00010#2\u000E\b\u0002\u0010%\u001A\b\u0012\u0004\u0012\u00020\u00070\u00162\u000E\b\u0002\u0010&\u001A\b\u0012\u0004\u0012\u00020\u00070\u0016H\u00C6\u0001\u00A2\u0006\u0004\bJ\u0010KJ\u0010\u0010L\u001A\u00020\u0013H\u00D6\u0001\u00A2\u0006\u0004\bL\u00107J\u0010\u0010N\u001A\u00020MH\u00D6\u0001\u00A2\u0006\u0004\bN\u0010OJ\u001A\u0010Q\u001A\u00020\r2\b\u0010P\u001A\u0004\u0018\u00010\u0001H\u00D6\u0003\u00A2\u0006\u0004\bQ\u0010RR4\u0010\b\u001A\u001F\u0012\u0015\u0012\u0013\u0018\u00010\u0003\u00A2\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00070\u00028\u0006\u00A2\u0006\f\n\u0004\bS\u0010T\u001A\u0004\bU\u0010*R\u0019\u0010\t\u001A\u0004\u0018\u00010\u00038\u0006\u00A2\u0006\f\n\u0004\bV\u0010W\u001A\u0004\bX\u0010,R\u0017\u0010\u000B\u001A\u00020\n8\u0006\u00A2\u0006\f\n\u0004\bY\u0010Z\u001A\u0004\b[\u0010.R#\u0010\f\u001A\u000E\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00070\u00028\u0006\u00A2\u0006\f\n\u0004\b\\\u0010T\u001A\u0004\b]\u0010*R\u0017\u0010\u000E\u001A\u00020\r8\u0006\u00A2\u0006\f\n\u0004\b^\u0010_\u001A\u0004\b\u000E\u00101R\u0017\u0010\u000F\u001A\u00020\n8\u0006\u00A2\u0006\f\n\u0004\b`\u0010Z\u001A\u0004\ba\u0010.R#\u0010\u0010\u001A\u000E\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00070\u00028\u0006\u00A2\u0006\f\n\u0004\bb\u0010T\u001A\u0004\bc\u0010*R\u0017\u0010\u0011\u001A\u00020\n8\u0006\u00A2\u0006\f\n\u0004\bd\u0010Z\u001A\u0004\be\u0010.R\u0017\u0010\u0012\u001A\u00020\r8\u0006\u00A2\u0006\f\n\u0004\bf\u0010_\u001A\u0004\b\u0012\u00101R\u0019\u0010\u0014\u001A\u0004\u0018\u00010\u00138\u0006\u00A2\u0006\f\n\u0004\bg\u0010h\u001A\u0004\bi\u00107R#\u0010\u0015\u001A\u000E\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00070\u00028\u0006\u00A2\u0006\f\n\u0004\bj\u0010T\u001A\u0004\bk\u0010*R\u001D\u0010\u0017\u001A\b\u0012\u0004\u0012\u00020\u00070\u00168\u0006\u00A2\u0006\f\n\u0004\bl\u0010m\u001A\u0004\bn\u0010:R\u0019\u0010\u0018\u001A\u0004\u0018\u00010\u00138\u0006\u00A2\u0006\f\n\u0004\bo\u0010h\u001A\u0004\bp\u00107R\u0017\u0010\u001A\u001A\u00020\u00198\u0006\u00A2\u0006\f\n\u0004\bq\u0010r\u001A\u0004\bs\u0010=R\u001D\u0010\u001B\u001A\b\u0012\u0004\u0012\u00020\u00070\u00168\u0006\u00A2\u0006\f\n\u0004\bt\u0010m\u001A\u0004\bu\u0010:R\u001D\u0010\u001C\u001A\b\u0012\u0004\u0012\u00020\u00070\u00168\u0006\u00A2\u0006\f\n\u0004\bv\u0010m\u001A\u0004\bw\u0010:R\u001D\u0010\u001D\u001A\b\u0012\u0004\u0012\u00020\u00070\u00168\u0006\u00A2\u0006\f\n\u0004\bx\u0010m\u001A\u0004\by\u0010:R#\u0010\u001E\u001A\u000E\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00070\u00028\u0006\u00A2\u0006\f\n\u0004\bz\u0010T\u001A\u0004\b{\u0010*R\u001D\u0010\u001F\u001A\b\u0012\u0004\u0012\u00020\u00070\u00168\u0006\u00A2\u0006\f\n\u0004\b|\u0010m\u001A\u0004\b}\u0010:R\u001A\u0010!\u001A\u0004\u0018\u00010 8\u0006\u00A2\u0006\r\n\u0004\b~\u0010\u007F\u001A\u0005\b\u0080\u0001\u0010DR\u001F\u0010\"\u001A\b\u0012\u0004\u0012\u00020\u00070\u00168\u0006\u00A2\u0006\u000E\n\u0005\b\u0081\u0001\u0010m\u001A\u0005\b\u0082\u0001\u0010:R\u001C\u0010$\u001A\u0004\u0018\u00010#8\u0006\u00A2\u0006\u000F\n\u0006\b\u0083\u0001\u0010\u0084\u0001\u001A\u0005\b\u0085\u0001\u0010GR\u001F\u0010%\u001A\b\u0012\u0004\u0012\u00020\u00070\u00168\u0006\u00A2\u0006\u000E\n\u0005\b\u0086\u0001\u0010m\u001A\u0005\b\u0087\u0001\u0010:R\u001F\u0010&\u001A\b\u0012\u0004\u0012\u00020\u00070\u00168\u0006\u00A2\u0006\u000E\n\u0005\b\u0088\u0001\u0010m\u001A\u0005\b\u0089\u0001\u0010:R\u001A\u0010\u008C\u0001\u001A\u00020\r8\u0006\u00A2\u0006\u000E\n\u0005\b\u008A\u0001\u0010_\u001A\u0005\b\u008B\u0001\u00101R\u001E\u0010\u0090\u0001\u001A\u00020M8\u0006X\u0086D\u00A2\u0006\u000F\n\u0006\b\u008D\u0001\u0010\u008E\u0001\u001A\u0005\b\u008F\u0001\u0010OR\u001E\u0010\u0093\u0001\u001A\u00020M8\u0006X\u0086D\u00A2\u0006\u000F\n\u0006\b\u0091\u0001\u0010\u008E\u0001\u001A\u0005\b\u0092\u0001\u0010OR\u001E\u0010\u0096\u0001\u001A\u00020M8\u0006X\u0086D\u00A2\u0006\u000F\n\u0006\b\u0094\u0001\u0010\u008E\u0001\u001A\u0005\b\u0095\u0001\u0010O\u00A8\u0006\u0097\u0001"}, d2 = {"Lcom/kakao/tistory/presentation/screen/blog/setting/contract/BlogSettingUiState;", "", "Lkotlin/Function1;", "Lcom/kakao/tistory/domain/blog/entity/BlogInfo;", "Lkotlin/ParameterName;", "name", "blogInfo", "", "changeBlogInfo", "originBlogInfo", "Landroidx/compose/ui/text/input/TextFieldValue;", "blogTitle", "onChangeBlogTitle", "", "isValidBlogTitle", "blogDescription", "onChangeBlogDescription", "nickname", "isValidNickname", "", "nicknameErrorMessage", "onChangeNickName", "Lkotlin/Function0;", "onClickNicknameClear", "imageUrl", "", "imageMaxSize", "onClickImage", "onClickShowGallery", "onClickImageDelete", "changeImageFileUrl", "onClickComplete", "Lcom/kakao/tistory/presentation/screen/blog/setting/contract/BottomSheetType;", "bottomSheet", "onDismissBottomSheet", "Lcom/kakao/tistory/presentation/screen/blog/setting/contract/DialogType;", "dialog", "onDismissDialog", "showPermissionErrorDialog", "<init>", "(Lkotlin/jvm/functions/Function1;Lcom/kakao/tistory/domain/blog/entity/BlogInfo;Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/input/TextFieldValue;ZLjava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Ljava/lang/String;JLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lcom/kakao/tistory/presentation/screen/blog/setting/contract/BottomSheetType;Lkotlin/jvm/functions/Function0;Lcom/kakao/tistory/presentation/screen/blog/setting/contract/DialogType;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "component1", "()Lkotlin/jvm/functions/Function1;", "component2", "()Lcom/kakao/tistory/domain/blog/entity/BlogInfo;", "component3", "()Landroidx/compose/ui/text/input/TextFieldValue;", "component4", "component5", "()Z", "component6", "component7", "component8", "component9", "component10", "()Ljava/lang/String;", "component11", "component12", "()Lkotlin/jvm/functions/Function0;", "component13", "component14", "()J", "component15", "component16", "component17", "component18", "component19", "component20", "()Lcom/kakao/tistory/presentation/screen/blog/setting/contract/BottomSheetType;", "component21", "component22", "()Lcom/kakao/tistory/presentation/screen/blog/setting/contract/DialogType;", "component23", "component24", "copy", "(Lkotlin/jvm/functions/Function1;Lcom/kakao/tistory/domain/blog/entity/BlogInfo;Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/input/TextFieldValue;ZLjava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Ljava/lang/String;JLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lcom/kakao/tistory/presentation/screen/blog/setting/contract/BottomSheetType;Lkotlin/jvm/functions/Function0;Lcom/kakao/tistory/presentation/screen/blog/setting/contract/DialogType;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Lcom/kakao/tistory/presentation/screen/blog/setting/contract/BlogSettingUiState;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lkotlin/jvm/functions/Function1;", "getChangeBlogInfo", "b", "Lcom/kakao/tistory/domain/blog/entity/BlogInfo;", "getOriginBlogInfo", "c", "Landroidx/compose/ui/text/input/TextFieldValue;", "getBlogTitle", "d", "getOnChangeBlogTitle", "e", "Z", "f", "getBlogDescription", "g", "getOnChangeBlogDescription", "h", "getNickname", "i", "j", "Ljava/lang/String;", "getNicknameErrorMessage", "k", "getOnChangeNickName", "l", "Lkotlin/jvm/functions/Function0;", "getOnClickNicknameClear", "m", "getImageUrl", "n", "J", "getImageMaxSize", "o", "getOnClickImage", "p", "getOnClickShowGallery", "q", "getOnClickImageDelete", "r", "getChangeImageFileUrl", "s", "getOnClickComplete", "t", "Lcom/kakao/tistory/presentation/screen/blog/setting/contract/BottomSheetType;", "getBottomSheet", "u", "getOnDismissBottomSheet", "v", "Lcom/kakao/tistory/presentation/screen/blog/setting/contract/DialogType;", "getDialog", "w", "getOnDismissDialog", "x", "getShowPermissionErrorDialog", "y", "getCompleteButtonEnabled", "completeButtonEnabled", "z", "I", "getBlogTitleMaxLength", "blogTitleMaxLength", "A", "getBlogDescriptionMaxLength", "blogDescriptionMaxLength", "B", "getNicknameMaxLength", "nicknameMaxLength", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class BlogSettingUiState {
    public static final int $stable;
    public final int A;
    public final int B;
    public final Function1 a;
    public final BlogInfo b;
    public final TextFieldValue c;
    public final Function1 d;
    public final boolean e;
    public final TextFieldValue f;
    public final Function1 g;
    public final TextFieldValue h;
    public final boolean i;
    public final String j;
    public final Function1 k;
    public final Function0 l;
    public final String m;
    public final long n;
    public final Function0 o;
    public final Function0 p;
    public final Function0 q;
    public final Function1 r;
    public final Function0 s;
    public final BottomSheetType t;
    public final Function0 u;
    public final DialogType v;
    public final Function0 w;
    public final Function0 x;
    public final boolean y;
    public final int z;

    public BlogSettingUiState(@NotNull Function1 function10, @Nullable BlogInfo blogInfo0, @NotNull TextFieldValue textFieldValue0, @NotNull Function1 function11, boolean z, @NotNull TextFieldValue textFieldValue1, @NotNull Function1 function12, @NotNull TextFieldValue textFieldValue2, boolean z1, @Nullable String s, @NotNull Function1 function13, @NotNull Function0 function00, @Nullable String s1, long v, @NotNull Function0 function01, @NotNull Function0 function02, @NotNull Function0 function03, @NotNull Function1 function14, @NotNull Function0 function04, @Nullable BottomSheetType bottomSheetType0, @NotNull Function0 function05, @Nullable DialogType dialogType0, @NotNull Function0 function06, @NotNull Function0 function07) {
        Intrinsics.checkNotNullParameter(function10, "changeBlogInfo");
        Intrinsics.checkNotNullParameter(textFieldValue0, "blogTitle");
        Intrinsics.checkNotNullParameter(function11, "onChangeBlogTitle");
        Intrinsics.checkNotNullParameter(textFieldValue1, "blogDescription");
        Intrinsics.checkNotNullParameter(function12, "onChangeBlogDescription");
        Intrinsics.checkNotNullParameter(textFieldValue2, "nickname");
        Intrinsics.checkNotNullParameter(function13, "onChangeNickName");
        Intrinsics.checkNotNullParameter(function00, "onClickNicknameClear");
        Intrinsics.checkNotNullParameter(function01, "onClickImage");
        Intrinsics.checkNotNullParameter(function02, "onClickShowGallery");
        Intrinsics.checkNotNullParameter(function03, "onClickImageDelete");
        Intrinsics.checkNotNullParameter(function14, "changeImageFileUrl");
        Intrinsics.checkNotNullParameter(function04, "onClickComplete");
        Intrinsics.checkNotNullParameter(function05, "onDismissBottomSheet");
        Intrinsics.checkNotNullParameter(function06, "onDismissDialog");
        Intrinsics.checkNotNullParameter(function07, "showPermissionErrorDialog");
        super();
        this.a = function10;
        this.b = blogInfo0;
        this.c = textFieldValue0;
        this.d = function11;
        this.e = z;
        this.f = textFieldValue1;
        this.g = function12;
        this.h = textFieldValue2;
        this.i = z1;
        this.j = s;
        this.k = function13;
        this.l = function00;
        this.m = s1;
        this.n = v;
        this.o = function01;
        this.p = function02;
        this.q = function03;
        this.r = function14;
        this.s = function04;
        this.t = bottomSheetType0;
        this.u = function05;
        this.v = dialogType0;
        this.w = function06;
        this.x = function07;
        this.y = z && z1;
        this.z = 40;
        this.A = 0xFF;
        this.B = 0x20;
    }

    public BlogSettingUiState(Function1 function10, BlogInfo blogInfo0, TextFieldValue textFieldValue0, Function1 function11, boolean z, TextFieldValue textFieldValue1, Function1 function12, TextFieldValue textFieldValue2, boolean z1, String s, Function1 function13, Function0 function00, String s1, long v, Function0 function01, Function0 function02, Function0 function03, Function1 function14, Function0 function04, BottomSheetType bottomSheetType0, Function0 function05, DialogType dialogType0, Function0 function06, Function0 function07, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        Function1 function15 = (v1 & 1) == 0 ? function10 : b.a;
        TextFieldValue textFieldValue3 = (v1 & 4) == 0 ? textFieldValue0 : new TextFieldValue(null, 0L, null, 7, null);
        Function1 function16 = (v1 & 8) == 0 ? function11 : c.a;
        TextFieldValue textFieldValue4 = (v1 & 0x20) == 0 ? textFieldValue1 : new TextFieldValue(null, 0L, null, 7, null);
        Function1 function17 = (v1 & 0x40) == 0 ? function12 : d.a;
        TextFieldValue textFieldValue5 = (v1 & 0x80) == 0 ? textFieldValue2 : new TextFieldValue(null, 0L, null, 7, null);
        Function1 function18 = (v1 & 0x400) == 0 ? function13 : e.a;
        Function0 function08 = (v1 & 0x800) == 0 ? function00 : f.a;
        Function0 function09 = (v1 & 0x4000) == 0 ? function01 : g.a;
        Function0 function010 = (0x8000 & v1) == 0 ? function02 : h.a;
        Function0 function011 = (0x10000 & v1) == 0 ? function03 : i.a;
        Function1 function19 = (0x20000 & v1) == 0 ? function14 : j.a;
        Function0 function012 = (0x40000 & v1) == 0 ? function04 : a.a;
        this(function15, ((v1 & 2) == 0 ? blogInfo0 : null), textFieldValue3, function16, ((v1 & 16) == 0 ? z : false), textFieldValue4, function17, textFieldValue5, ((v1 & 0x100) == 0 ? z1 : false), ((v1 & 0x200) == 0 ? s : null), function18, function08, ((v1 & 0x1000) == 0 ? s1 : null), ((v1 & 0x2000) == 0 ? v : 0L), function09, function010, function011, function19, function012, ((0x80000 & v1) == 0 ? bottomSheetType0 : null), function05, ((v1 & 0x200000) == 0 ? dialogType0 : null), function06, function07);
    }

    @NotNull
    public final Function1 component1() {
        return this.a;
    }

    @Nullable
    public final String component10() {
        return this.j;
    }

    @NotNull
    public final Function1 component11() {
        return this.k;
    }

    @NotNull
    public final Function0 component12() {
        return this.l;
    }

    @Nullable
    public final String component13() {
        return this.m;
    }

    public final long component14() {
        return this.n;
    }

    @NotNull
    public final Function0 component15() {
        return this.o;
    }

    @NotNull
    public final Function0 component16() {
        return this.p;
    }

    @NotNull
    public final Function0 component17() {
        return this.q;
    }

    @NotNull
    public final Function1 component18() {
        return this.r;
    }

    @NotNull
    public final Function0 component19() {
        return this.s;
    }

    @Nullable
    public final BlogInfo component2() {
        return this.b;
    }

    @Nullable
    public final BottomSheetType component20() {
        return this.t;
    }

    @NotNull
    public final Function0 component21() {
        return this.u;
    }

    @Nullable
    public final DialogType component22() {
        return this.v;
    }

    @NotNull
    public final Function0 component23() {
        return this.w;
    }

    @NotNull
    public final Function0 component24() {
        return this.x;
    }

    @NotNull
    public final TextFieldValue component3() {
        return this.c;
    }

    @NotNull
    public final Function1 component4() {
        return this.d;
    }

    public final boolean component5() {
        return this.e;
    }

    @NotNull
    public final TextFieldValue component6() {
        return this.f;
    }

    @NotNull
    public final Function1 component7() {
        return this.g;
    }

    @NotNull
    public final TextFieldValue component8() {
        return this.h;
    }

    public final boolean component9() {
        return this.i;
    }

    @NotNull
    public final BlogSettingUiState copy(@NotNull Function1 function10, @Nullable BlogInfo blogInfo0, @NotNull TextFieldValue textFieldValue0, @NotNull Function1 function11, boolean z, @NotNull TextFieldValue textFieldValue1, @NotNull Function1 function12, @NotNull TextFieldValue textFieldValue2, boolean z1, @Nullable String s, @NotNull Function1 function13, @NotNull Function0 function00, @Nullable String s1, long v, @NotNull Function0 function01, @NotNull Function0 function02, @NotNull Function0 function03, @NotNull Function1 function14, @NotNull Function0 function04, @Nullable BottomSheetType bottomSheetType0, @NotNull Function0 function05, @Nullable DialogType dialogType0, @NotNull Function0 function06, @NotNull Function0 function07) {
        Intrinsics.checkNotNullParameter(function10, "changeBlogInfo");
        Intrinsics.checkNotNullParameter(textFieldValue0, "blogTitle");
        Intrinsics.checkNotNullParameter(function11, "onChangeBlogTitle");
        Intrinsics.checkNotNullParameter(textFieldValue1, "blogDescription");
        Intrinsics.checkNotNullParameter(function12, "onChangeBlogDescription");
        Intrinsics.checkNotNullParameter(textFieldValue2, "nickname");
        Intrinsics.checkNotNullParameter(function13, "onChangeNickName");
        Intrinsics.checkNotNullParameter(function00, "onClickNicknameClear");
        Intrinsics.checkNotNullParameter(function01, "onClickImage");
        Intrinsics.checkNotNullParameter(function02, "onClickShowGallery");
        Intrinsics.checkNotNullParameter(function03, "onClickImageDelete");
        Intrinsics.checkNotNullParameter(function14, "changeImageFileUrl");
        Intrinsics.checkNotNullParameter(function04, "onClickComplete");
        Intrinsics.checkNotNullParameter(function05, "onDismissBottomSheet");
        Intrinsics.checkNotNullParameter(function06, "onDismissDialog");
        Intrinsics.checkNotNullParameter(function07, "showPermissionErrorDialog");
        return new BlogSettingUiState(function10, blogInfo0, textFieldValue0, function11, z, textFieldValue1, function12, textFieldValue2, z1, s, function13, function00, s1, v, function01, function02, function03, function14, function04, bottomSheetType0, function05, dialogType0, function06, function07);
    }

    public static BlogSettingUiState copy$default(BlogSettingUiState blogSettingUiState0, Function1 function10, BlogInfo blogInfo0, TextFieldValue textFieldValue0, Function1 function11, boolean z, TextFieldValue textFieldValue1, Function1 function12, TextFieldValue textFieldValue2, boolean z1, String s, Function1 function13, Function0 function00, String s1, long v, Function0 function01, Function0 function02, Function0 function03, Function1 function14, Function0 function04, BottomSheetType bottomSheetType0, Function0 function05, DialogType dialogType0, Function0 function06, Function0 function07, int v1, Object object0) {
        Function1 function15 = (v1 & 1) == 0 ? function10 : blogSettingUiState0.a;
        BlogInfo blogInfo1 = (v1 & 2) == 0 ? blogInfo0 : blogSettingUiState0.b;
        TextFieldValue textFieldValue3 = (v1 & 4) == 0 ? textFieldValue0 : blogSettingUiState0.c;
        Function1 function16 = (v1 & 8) == 0 ? function11 : blogSettingUiState0.d;
        boolean z2 = (v1 & 16) == 0 ? z : blogSettingUiState0.e;
        TextFieldValue textFieldValue4 = (v1 & 0x20) == 0 ? textFieldValue1 : blogSettingUiState0.f;
        Function1 function17 = (v1 & 0x40) == 0 ? function12 : blogSettingUiState0.g;
        TextFieldValue textFieldValue5 = (v1 & 0x80) == 0 ? textFieldValue2 : blogSettingUiState0.h;
        boolean z3 = (v1 & 0x100) == 0 ? z1 : blogSettingUiState0.i;
        String s2 = (v1 & 0x200) == 0 ? s : blogSettingUiState0.j;
        Function1 function18 = (v1 & 0x400) == 0 ? function13 : blogSettingUiState0.k;
        Function0 function08 = (v1 & 0x800) == 0 ? function00 : blogSettingUiState0.l;
        String s3 = (v1 & 0x1000) == 0 ? s1 : blogSettingUiState0.m;
        long v2 = (v1 & 0x2000) == 0 ? v : blogSettingUiState0.n;
        Function0 function09 = (v1 & 0x4000) == 0 ? function01 : blogSettingUiState0.o;
        Function0 function010 = (0x8000 & v1) == 0 ? function02 : blogSettingUiState0.p;
        Function0 function011 = (v1 & 0x10000) == 0 ? function03 : blogSettingUiState0.q;
        Function1 function19 = (v1 & 0x20000) == 0 ? function14 : blogSettingUiState0.r;
        Function0 function012 = (v1 & 0x40000) == 0 ? function04 : blogSettingUiState0.s;
        BottomSheetType bottomSheetType1 = (v1 & 0x80000) == 0 ? bottomSheetType0 : blogSettingUiState0.t;
        Function0 function013 = (v1 & 0x100000) == 0 ? function05 : blogSettingUiState0.u;
        DialogType dialogType1 = (v1 & 0x200000) == 0 ? dialogType0 : blogSettingUiState0.v;
        Function0 function014 = (v1 & 0x400000) == 0 ? function06 : blogSettingUiState0.w;
        return (v1 & 0x800000) == 0 ? blogSettingUiState0.copy(function15, blogInfo1, textFieldValue3, function16, z2, textFieldValue4, function17, textFieldValue5, z3, s2, function18, function08, s3, v2, function09, function010, function011, function19, function012, bottomSheetType1, function013, dialogType1, function014, function07) : blogSettingUiState0.copy(function15, blogInfo1, textFieldValue3, function16, z2, textFieldValue4, function17, textFieldValue5, z3, s2, function18, function08, s3, v2, function09, function010, function011, function19, function012, bottomSheetType1, function013, dialogType1, function014, blogSettingUiState0.x);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof BlogSettingUiState)) {
            return false;
        }
        BlogSettingUiState blogSettingUiState0 = (BlogSettingUiState)object0;
        if(!Intrinsics.areEqual(this.a, blogSettingUiState0.a)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.b, blogSettingUiState0.b)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.c, blogSettingUiState0.c)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.d, blogSettingUiState0.d)) {
            return false;
        }
        if(this.e != blogSettingUiState0.e) {
            return false;
        }
        if(!Intrinsics.areEqual(this.f, blogSettingUiState0.f)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.g, blogSettingUiState0.g)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.h, blogSettingUiState0.h)) {
            return false;
        }
        if(this.i != blogSettingUiState0.i) {
            return false;
        }
        if(!Intrinsics.areEqual(this.j, blogSettingUiState0.j)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.k, blogSettingUiState0.k)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.l, blogSettingUiState0.l)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.m, blogSettingUiState0.m)) {
            return false;
        }
        if(this.n != blogSettingUiState0.n) {
            return false;
        }
        if(!Intrinsics.areEqual(this.o, blogSettingUiState0.o)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.p, blogSettingUiState0.p)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.q, blogSettingUiState0.q)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.r, blogSettingUiState0.r)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.s, blogSettingUiState0.s)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.t, blogSettingUiState0.t)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.u, blogSettingUiState0.u)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.v, blogSettingUiState0.v)) {
            return false;
        }
        return Intrinsics.areEqual(this.w, blogSettingUiState0.w) ? Intrinsics.areEqual(this.x, blogSettingUiState0.x) : false;
    }

    @NotNull
    public final TextFieldValue getBlogDescription() {
        return this.f;
    }

    public final int getBlogDescriptionMaxLength() {
        return this.A;
    }

    @NotNull
    public final TextFieldValue getBlogTitle() {
        return this.c;
    }

    public final int getBlogTitleMaxLength() {
        return this.z;
    }

    @Nullable
    public final BottomSheetType getBottomSheet() {
        return this.t;
    }

    @NotNull
    public final Function1 getChangeBlogInfo() {
        return this.a;
    }

    @NotNull
    public final Function1 getChangeImageFileUrl() {
        return this.r;
    }

    public final boolean getCompleteButtonEnabled() {
        return this.y;
    }

    @Nullable
    public final DialogType getDialog() {
        return this.v;
    }

    public final long getImageMaxSize() {
        return this.n;
    }

    @Nullable
    public final String getImageUrl() {
        return this.m;
    }

    @NotNull
    public final TextFieldValue getNickname() {
        return this.h;
    }

    @Nullable
    public final String getNicknameErrorMessage() {
        return this.j;
    }

    public final int getNicknameMaxLength() {
        return this.B;
    }

    @NotNull
    public final Function1 getOnChangeBlogDescription() {
        return this.g;
    }

    @NotNull
    public final Function1 getOnChangeBlogTitle() {
        return this.d;
    }

    @NotNull
    public final Function1 getOnChangeNickName() {
        return this.k;
    }

    @NotNull
    public final Function0 getOnClickComplete() {
        return this.s;
    }

    @NotNull
    public final Function0 getOnClickImage() {
        return this.o;
    }

    @NotNull
    public final Function0 getOnClickImageDelete() {
        return this.q;
    }

    @NotNull
    public final Function0 getOnClickNicknameClear() {
        return this.l;
    }

    @NotNull
    public final Function0 getOnClickShowGallery() {
        return this.p;
    }

    @NotNull
    public final Function0 getOnDismissBottomSheet() {
        return this.u;
    }

    @NotNull
    public final Function0 getOnDismissDialog() {
        return this.w;
    }

    @Nullable
    public final BlogInfo getOriginBlogInfo() {
        return this.b;
    }

    @NotNull
    public final Function0 getShowPermissionErrorDialog() {
        return this.x;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = com.kakao.tistory.presentation.main.contract.a.a(this.u, (com.kakao.tistory.presentation.main.contract.a.a(this.s, com.kakao.tistory.presentation.main.contract.b.a(this.r, com.kakao.tistory.presentation.main.contract.a.a(this.q, com.kakao.tistory.presentation.main.contract.a.a(this.p, com.kakao.tistory.presentation.main.contract.a.a(this.o, wb.a.k(this.n, (com.kakao.tistory.presentation.main.contract.a.a(this.l, com.kakao.tistory.presentation.main.contract.b.a(this.k, (com.kakao.tistory.presentation.main.contract.c.a(this.i, (this.h.hashCode() + com.kakao.tistory.presentation.main.contract.b.a(this.g, (this.f.hashCode() + com.kakao.tistory.presentation.main.contract.c.a(this.e, com.kakao.tistory.presentation.main.contract.b.a(this.d, (this.c.hashCode() + (this.a.hashCode() * 0x1F + (this.b == null ? 0 : this.b.hashCode())) * 0x1F) * 0x1F, 0x1F), 0x1F)) * 0x1F, 0x1F)) * 0x1F, 0x1F) + (this.j == null ? 0 : this.j.hashCode())) * 0x1F, 0x1F), 0x1F) + (this.m == null ? 0 : this.m.hashCode())) * 0x1F, 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F) + (this.t == null ? 0 : this.t.hashCode())) * 0x1F, 0x1F);
        DialogType dialogType0 = this.v;
        if(dialogType0 != null) {
            v = dialogType0.hashCode();
        }
        return this.x.hashCode() + com.kakao.tistory.presentation.main.contract.a.a(this.w, (v1 + v) * 0x1F, 0x1F);
    }

    public final boolean isValidBlogTitle() {
        return this.e;
    }

    public final boolean isValidNickname() {
        return this.i;
    }

    @Override
    @NotNull
    public String toString() {
        return "BlogSettingUiState(changeBlogInfo=" + this.a + ", originBlogInfo=" + this.b + ", blogTitle=" + this.c + ", onChangeBlogTitle=" + this.d + ", isValidBlogTitle=" + this.e + ", blogDescription=" + this.f + ", onChangeBlogDescription=" + this.g + ", nickname=" + this.h + ", isValidNickname=" + this.i + ", nicknameErrorMessage=" + this.j + ", onChangeNickName=" + this.k + ", onClickNicknameClear=" + this.l + ", imageUrl=" + this.m + ", imageMaxSize=" + this.n + ", onClickImage=" + this.o + ", onClickShowGallery=" + this.p + ", onClickImageDelete=" + this.q + ", changeImageFileUrl=" + this.r + ", onClickComplete=" + this.s + ", bottomSheet=" + this.t + ", onDismissBottomSheet=" + this.u + ", dialog=" + this.v + ", onDismissDialog=" + this.w + ", showPermissionErrorDialog=" + this.x + ")";
    }
}

