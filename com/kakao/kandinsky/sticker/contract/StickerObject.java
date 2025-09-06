package com.kakao.kandinsky.sticker.contract;

import androidx.compose.runtime.internal.StabilityInferred;
import com.kakao.kandinsky.sticker.R.drawable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ExtensionsKt;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.PersistentList;
import org.jetbrains.annotations.NotNull;
import sd.a;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u000E\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0012R\u001D\u0010\b\u001A\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001A\u0004\b\u0006\u0010\u0007R)\u0010\u0011\u001A\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000B0\t8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000E\u001A\u0004\b\u000F\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/kakao/kandinsky/sticker/contract/StickerObject;", "", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/kakao/kandinsky/sticker/contract/StickerGroup;", "a", "Lkotlinx/collections/immutable/ImmutableList;", "getGroupList", "()Lkotlinx/collections/immutable/ImmutableList;", "groupList", "", "", "", "Lcom/kakao/kandinsky/sticker/contract/StickerItem;", "c", "Ljava/util/Map;", "getItemMap", "()Ljava/util/Map;", "itemMap", "Group", "sticker_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nStickerObject.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StickerObject.kt\ncom/kakao/kandinsky/sticker/contract/StickerObject\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,278:1\n1477#2:279\n1502#2,3:280\n1505#2,3:290\n372#3,7:283\n*S KotlinDebug\n*F\n+ 1 StickerObject.kt\ncom/kakao/kandinsky/sticker/contract/StickerObject\n*L\n277#1:279\n277#1:280,3\n277#1:290,3\n277#1:283,7\n*E\n"})
public final class StickerObject {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000E\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0007\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000B¨\u0006\f"}, d2 = {"Lcom/kakao/kandinsky/sticker/contract/StickerObject$Group;", "", "", "a", "Ljava/lang/String;", "getGroupName", "()Ljava/lang/String;", "groupName", "Friends1", "Niniz", "Friends2", "Face", "sticker_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static enum Group {
        Friends1("friends1"),
        Niniz("niniz"),
        Friends2("friends2"),
        Face("face");

        public final String a;
        public static final Group[] b;
        public static final EnumEntries c;

        static {
            Group.b = arr_stickerObject$Group;
            Intrinsics.checkNotNullParameter(arr_stickerObject$Group, "entries");
            Group.c = new a(arr_stickerObject$Group);
        }

        public Group(String s1) {
            this.a = s1;
        }

        @NotNull
        public static EnumEntries getEntries() {
            return Group.c;
        }

        @NotNull
        public final String getGroupName() {
            return this.a;
        }
    }

    public static final int $stable;
    @NotNull
    public static final StickerObject INSTANCE;
    public static final PersistentList a;
    public static final PersistentList b;
    public static final LinkedHashMap c;

    // 去混淆评级： 高(247)
    static {
        StickerObject.INSTANCE = new StickerObject();  // 初始化器: Ljava/lang/Object;-><init>()V
        StickerObject.a = ExtensionsKt.persistentListOf(new StickerGroup[]{new StickerGroup("friends1", drawable.menu_friends1, drawable.menu_friends1_on, null, 8, null), new StickerGroup("niniz", drawable.menu_niniz, drawable.menu_niniz_on, null, 8, null), new StickerGroup("friends2", drawable.menu_friends2, drawable.menu_friends2_on, null, 8, null), new StickerGroup("face", drawable.menu_face, drawable.menu_face_on, StickerSizeType.Small)});
        PersistentList persistentList0 = ExtensionsKt.persistentListOf(new StickerItem[]{new StickerItem("friends1", "001", "도착한 라이언 이모티콘"), new StickerItem("friends1", "002", "손인사 라이언 이모티콘"), new StickerItem("friends1", "003", "눈하트 라이언 이모티콘"), new StickerItem("friends1", "004", "하트 쏟는 라이언 이모티콘"), new StickerItem("friends1", "005", "라이언 탬버린 이모티콘"), new StickerItem("friends1", "006", "무지와 도는 라이언 이모티콘"), new StickerItem("friends1", "007", "응원하는 라이언 이모티콘"), new StickerItem("friends1", "008", "경례하는 라이언 이모티콘"), new StickerItem("friends1", "009", "궁금한 라이언 이모티콘"), new StickerItem("friends1", "010", "부끄러운 라이언 이모티콘"), new StickerItem("friends1", "011", "공 미는 라이언 이모티콘"), new StickerItem("friends1", "012", "슬픈 라이언 이모티콘"), new StickerItem("friends1", "013", "먹는 라이언 이모티콘"), new StickerItem("friends1", "014", "웃는 어피치 이모티콘"), new StickerItem("friends1", "015", "난동 부리는 어피치 이모티콘"), new StickerItem("friends1", "016", "머리 긁는 어피치 이모티콘"), new StickerItem("friends1", "017", "놀라는 어피치 이모티콘"), new StickerItem("friends1", "018", "콘 쓰다듬는 무지 이모티콘"), new StickerItem("friends1", "019", "연주하는 무지, 콘 이모티콘"), new StickerItem("friends1", "020", "박수치는 튜브 이모티콘"), new StickerItem("friends1", "021", "당황한 튜브 이모티콘"), new StickerItem("friends1", "022", "놀라는 네오 이모티콘"), new StickerItem("friends1", "023", "빛나는 프로도 이모티콘"), new StickerItem("friends1", "024", "부비는 라이언 이모티콘"), new StickerItem("friends1", "025", "손인사 프로도 이모티콘"), new StickerItem("friends1", "026", "춤추는 제이지 이모티콘"), new StickerItem("friends1", "027", "반가운 무지, 콘 이모티콘"), new StickerItem("friends1", "028", "하트 뿅 어피치 이모티콘"), new StickerItem("friends1", "029", "슬픈 무지, 콘 이모티콘"), new StickerItem("friends1", "030", "폭소하는 무지, 콘 이모티콘"), new StickerItem("friends1", "031", "윙크하는 네오 이모티콘"), new StickerItem("friends1", "032", "엄지척 튜브 이모티콘"), new StickerItem("friends1", "033", "토라진 네오 이모티콘"), new StickerItem("friends1", "034", "지친 제이지 이모티콘"), new StickerItem("friends1", "035", "우는 어피치 이모티콘"), new StickerItem("friends1", "036", "음흉한 네오 이모티콘"), new StickerItem("friends1", "037", "NO 무지, 콘 이모티콘"), new StickerItem("friends1", "038", "빈정상한 프로도 이모티콘"), new StickerItem("friends1", "039", "비는 튜브 이모티콘"), new StickerItem("friends1", "040", "화난 프로도 이모티콘"), new StickerItem("friends1", "041", "부끄러운 무지, 콘 이모티콘"), new StickerItem("friends1", "042", "기분좋은 프로도 이모티콘"), new StickerItem("friends1", "043", "고마운 네오 이모티콘"), new StickerItem("friends1", "044", "졸린 어피치 이모티콘"), new StickerItem("friends1", "045", "화난 네오 이모티콘"), new StickerItem("friends1", "046", "놀란 제이지 이모티콘"), new StickerItem("friends1", "047", "지루한 콘 이모티콘"), new StickerItem("friends1", "048", "비웃는 네오 이모티콘"), new StickerItem("niniz", "001", "기분좋은 스카피 버튼"), new StickerItem("niniz", "002", "인사하는 팬다 주니어"), new StickerItem("niniz", "003", "우는 스카피"), new StickerItem("niniz", "004", "춤추는 케로, 베로니"), new StickerItem("niniz", "005", "뽀뽀 받는 앙몬드"), new StickerItem("niniz", "006", "나른한 죠르디"), new StickerItem("niniz", "007", "경악하는 케로, 베로니"), new StickerItem("niniz", "008", "기분좋은 콥, 빠냐"), new StickerItem("niniz", "009", "폭소하는 팬다 주니어"), new StickerItem("niniz", "010", "감사한 스카피"), new StickerItem("niniz", "011", "화난 앙몬드"), new StickerItem("niniz", "012", "OK 팬다 주니어"), new StickerItem("niniz", "013", "힘내 케로, 베로니"), new StickerItem("niniz", "014", "사랑에 빠진 죠르디"), new StickerItem("niniz", "015", "분위기 잡는 콥"), new StickerItem("niniz", "016", "놀라는 스카피"), new StickerItem("niniz", "017", "지친 팬다 주니어"), new StickerItem("niniz", "018", "죄송한 스카피"), new StickerItem("niniz", "019", "나른한 앙몬드"), new StickerItem("niniz", "020", "궁금한 팬다 주니어"), new StickerItem("niniz", "021", "부끄러운 앙몬드"), new StickerItem("niniz", "022", "연주하는 콥, 빠냐"), new StickerItem("niniz", "023", "촛불든 케로, 베로니"), new StickerItem("niniz", "024", "급한 죠르디"), new StickerItem("niniz", "025", "죠르디"), new StickerItem("niniz", "026", "부탁하는 콥, 빠냐"), new StickerItem("niniz", "027", "파도타는 앙몬드"), new StickerItem("niniz", "028", "사랑에 빠진 팬다 주니어"), new StickerItem("niniz", "029", "좌절한 앙몬드"), new StickerItem("niniz", "030", "노력하는 죠르디"), new StickerItem("niniz", "031", "굽신거리는 스카피"), new StickerItem("niniz", "032", "맞는 콥"), new StickerItem("niniz", "033", "아픈 케로, 베로니"), new StickerItem("niniz", "034", "외면하는 스카피"), new StickerItem("niniz", "035", "하이파이브하는 케로, 베로니"), new StickerItem("niniz", "036", "연주하는 죠르디"), new StickerItem("niniz", "037", "손드는 케로, 베로니"), new StickerItem("niniz", "038", "너를 위해 죠르디"), new StickerItem("niniz", "039", "놀란 앙몬드"), new StickerItem("niniz", "040", "경례하는 팬다 주니어"), new StickerItem("niniz", "041", "어쩌라고 앙몬드"), new StickerItem("niniz", "042", "헤롱헤롱 빠냐"), new StickerItem("niniz", "043", "박수치는 죠르디"), new StickerItem("niniz", "044", "지친 콥"), new StickerItem("niniz", "045", "슬픈 팬다 주니어"), new StickerItem("niniz", "046", "사랑 전하는 앙몬드"), new StickerItem("niniz", "047", "심각한 콥, 빠냐"), new StickerItem("niniz", "048", "졸린 조르디"), new StickerItem("friends2", "001", "도착한 라이언 이모티콘"), new StickerItem("friends2", "002", "손인사 라이언 이모티콘"), new StickerItem("friends2", "003", "눈하트 라이언 이모티콘"), new StickerItem("friends2", "004", "하트 쏟는 라이언 이모티콘"), new StickerItem("friends2", "005", "라이언 탬버린 이모티콘"), new StickerItem("friends2", "006", "무지와 도는 라이언 이모티콘"), new StickerItem("friends2", "007", "응원하는 라이언 이모티콘"), new StickerItem("friends2", "008", "경례하는 라이언 이모티콘"), new StickerItem("friends2", "009", "궁금한 라이언 이모티콘"), new StickerItem("friends2", "010", "부끄러운 라이언 이모티콘"), new StickerItem("friends2", "011", "공 미는 라이언 이모티콘"), new StickerItem("friends2", "012", "슬픈 라이언 이모티콘"), new StickerItem("friends2", "013", "먹는 라이언 이모티콘"), new StickerItem("friends2", "014", "웃는 어피치 이모티콘"), new StickerItem("friends2", "015", "난동 부리는 어피치 이모티콘"), new StickerItem("friends2", "016", "머리 긁는 어피치 이모티콘"), new StickerItem("friends2", "017", "놀라는 어피치 이모티콘"), new StickerItem("friends2", "018", "콘 쓰다듬는 무지 이모티콘"), new StickerItem("friends2", "019", "연주하는 무지, 콘 이모티콘"), new StickerItem("friends2", "020", "박수치는 튜브 이모티콘"), new StickerItem("friends2", "021", "당황한 튜브 이모티콘"), new StickerItem("friends2", "022", "놀라는 네오 이모티콘"), new StickerItem("friends2", "023", "빛나는 프로도 이모티콘"), new StickerItem("friends2", "024", "부비는 라이언 이모티콘"), new StickerItem("friends2", "025", "손인사 프로도 이모티콘"), new StickerItem("friends2", "026", "춤추는 제이지 이모티콘"), new StickerItem("friends2", "027", "반가운 무지, 콘 이모티콘"), new StickerItem("friends2", "028", "하트 뿅 어피치 이모티콘"), new StickerItem("friends2", "029", "슬픈 무지, 콘 이모티콘"), new StickerItem("friends2", "030", "폭소하는 무지, 콘 이모티콘"), new StickerItem("friends2", "031", "윙크하는 네오 이모티콘"), new StickerItem("friends2", "032", "엄지척 튜브 이모티콘"), new StickerItem("friends2", "033", "토라진 네오 이모티콘"), new StickerItem("friends2", "034", "지친 제이지 이모티콘"), new StickerItem("friends2", "035", "우는 어피치 이모티콘"), new StickerItem("friends2", "036", "음흉한 네오 이모티콘"), new StickerItem("friends2", "037", "NO 무지, 콘 이모티콘"), new StickerItem("friends2", "038", "빈정상한 프로도 이모티콘"), new StickerItem("friends2", "039", "비는 튜브 이모티콘"), new StickerItem("friends2", "040", "화난 프로도 이모티콘"), new StickerItem("friends2", "041", "부끄러운 무지, 콘 이모티콘"), new StickerItem("friends2", "042", "기분좋은 프로도 이모티콘"), new StickerItem("friends2", "043", "고마운 네오 이모티콘"), new StickerItem("friends2", "044", "졸린 어피치 이모티콘"), new StickerItem("friends2", "045", "화난 네오 이모티콘"), new StickerItem("friends2", "046", "놀란 제이지 이모티콘"), new StickerItem("friends2", "047", "지루한 콘 이모티콘"), new StickerItem("friends2", "048", "비웃는 네오 이모티콘"), new StickerItem("face", "001", "사랑에 빠진 프로도"), new StickerItem("face", "002", "웃는 프로도"), new StickerItem("face", "003", "놀라는 프로도"), new StickerItem("face", "004", "그늘진 프로도"), new StickerItem("face", "005", "당황한 프로도"), new StickerItem("face", "006", "우는 프로도"), new StickerItem("face", "007", "부끄러운 네오"), new StickerItem("face", "008", "윙크하는 네오"), new StickerItem("face", "009", "쑥스러운 네오"), new StickerItem("face", "010", "앙칼진 네오"), new StickerItem("face", "011", "화난 네오"), new StickerItem("face", "012", "기분 나쁜 네오"), new StickerItem("face", "013", "상심한 튜브"), new StickerItem("face", "014", "미소 짓는 튜브"), new StickerItem("face", "015", "폭소하는 튜브"), new StickerItem("face", "016", "퀭한 튜브"), new StickerItem("face", "017", "화난 튜브"), new StickerItem("face", "018", "토라진 어피치"), new StickerItem("face", "019", "우는 어피치"), new StickerItem("face", "020", "사랑에 빠진 어피치"), new StickerItem("face", "021", "퀭한 어피치"), new StickerItem("face", "022", "그늘진 어피치"), new StickerItem("face", "023", "부끄러운 어피치"), new StickerItem("face", "024", "기분 좋은 무지"), new StickerItem("face", "025", "웃는 무지"), new StickerItem("face", "026", "엄지척 무지"), new StickerItem("face", "027", "슬픈 무지"), new StickerItem("face", "028", "기분 나쁜 무지"), new StickerItem("face", "029", "우는 무지"), new StickerItem("face", "030", "눈물나게 웃는 제이지"), new StickerItem("face", "031", "부끄러운 제이지"), new StickerItem("face", "032", "홍조 띈 제이지"), new StickerItem("face", "033", "스웩있는 제이지"), new StickerItem("face", "034", "퀭한 제이지"), new StickerItem("face", "035", "웃는 무지, 콘"), new StickerItem("face", "036", "손 흔드는 무지, 콘"), new StickerItem("face", "037", "놀라는 무지, 콘"), new StickerItem("face", "038", "엄지척 무지, 콘"), new StickerItem("face", "039", "기분 상한 무지, 콘"), new StickerItem("face", "040", "눈치 보는 무지, 콘"), new StickerItem("face", "041", "허탈한 무지, 콘"), new StickerItem("face", "042", "분노한 어피치"), new StickerItem("face", "043", "호기심 어린 어피치"), new StickerItem("face", "044", "피식하는 어피치"), new StickerItem("face", "045", "웃음 짓는 어피치"), new StickerItem("face", "046", "긴장한 어피치"), new StickerItem("face", "047", "우는 어피치"), new StickerItem("face", "048", "당황한 어피치"), new StickerItem("face", "049", "손인사하는 제이지"), new StickerItem("face", "050", "부끄러운 제이지"), new StickerItem("face", "051", "윙크하는 제이지"), new StickerItem("face", "052", "궁금한 제이지"), new StickerItem("face", "053", "기분 상한 제이지"), new StickerItem("face", "054", "우는 제이지"), new StickerItem("face", "055", "엄지척 프로도"), new StickerItem("face", "056", "홍조 띈 프로도"), new StickerItem("face", "057", "잘 생긴 프로도"), new StickerItem("face", "058", "쉿 하는 프로도"), new StickerItem("face", "059", "무표정 프로도"), new StickerItem("face", "060", "지친 프로도"), new StickerItem("face", "061", "한숨 쉬는 프로도"), new StickerItem("face", "062", "부끄러운 네오"), new StickerItem("face", "063", "OK 네오"), new StickerItem("face", "064", "폭소하는 네오"), new StickerItem("face", "065", "머리 긁는 네오"), new StickerItem("face", "066", "우는 네오"), new StickerItem("face", "067", "째려보는 네오"), new StickerItem("face", "068", "덜덜 떠는 네오"), new StickerItem("face", "069", "화난 튜브"), new StickerItem("face", "070", "졸린 튜브"), new StickerItem("face", "071", "지목하는 튜브"), new StickerItem("face", "072", "당황한 튜브"), new StickerItem("face", "073", "똑똑한 튜브"), new StickerItem("face", "074", "폭소하는 튜브")});
        StickerObject.b = persistentList0;
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        for(Object object0: persistentList0) {
            String s = ((StickerItem)object0).getGroupName();
            ArrayList arrayList0 = linkedHashMap0.get(s);
            if(arrayList0 == null) {
                arrayList0 = new ArrayList();
                linkedHashMap0.put(s, arrayList0);
            }
            arrayList0.add(object0);
        }
        StickerObject.c = linkedHashMap0;
        StickerObject.$stable = 8;
    }

    @NotNull
    public final ImmutableList getGroupList() {
        return StickerObject.a;
    }

    @NotNull
    public final Map getItemMap() {
        return StickerObject.c;
    }
}

