package com.example.sch.myapplication;

import java.io.Serializable;
import java.util.List;

public class HomePagerBean implements Serializable {


    /**
     * status : 200
     * hint : 获取成功
     * result : {"section_detail":[{"id":20,"detail":[{"img_url":"http://www.yingzhiyunwenhua.cn/yzyFiles/icons/c6d4d437-b622-4dd8-82e7-e3b5ab774e4f-1561010048359.png","id":21,"title":"这是一个测试用的专辑","type":"list","read_volume":9,"add_time":"2019-08-27"},{"img_url":"http://www.yingzhiyunwenhua.cn/yzyFiles/icons/dad6da1d-74c4-4417-93ca-c60c031778a3-1561010069748.png","id":22,"title":"这又是一个测试用的专辑","type":"list","read_volume":10,"add_time":"2019-08-27"},{"img_url":"http://www.yingzhiyunwenhua.cn/yzyFiles/icons/68eaf64f-379a-437d-b78a-fbbeca6876c5-1561010090658.png","id":23,"title":"那有没有正式的专辑？","type":"list","read_volume":3,"add_time":"2019-08-27"},{"img_url":"http://www.yingzhiyunwenhua.cn/yzyFiles/icons/c7e48c63-8646-4db8-8590-2b8953953056-1561010107850.png","id":24,"title":"抱歉现在还没有","type":"list","read_volume":1,"add_time":"2019-08-27"},{"img_url":"http://www.yingzhiyunwenhua.cn/yzyFiles/icons/7e901a2d-1427-47b0-b25b-9bcd07d415cd-1566800824681.png","id":27,"title":"这是新增一","type":"list","read_volume":0,"add_time":"2019-08-27"},{"img_url":"http://www.yingzhiyunwenhua.cn/yzyFiles/icons/485a16e7-016f-4709-8163-082ceced8dda-1566800852581.png","id":28,"title":"这是新增二","type":"list","read_volume":0,"add_time":"2019-08-27"},{"img_url":"http://www.yingzhiyunwenhua.cn/yzyFiles/icons/3dfe5e59-bd05-4c3e-9f8c-1a1456c6491a-1566800878950.png","id":29,"title":"这是新增三","type":"list","read_volume":0,"add_time":"2019-08-27"}],"title":"精选专辑","type":"collectionList"},{"id":25,"detail":[{"file_path":"http://www.yingzhiyunwenhua.cn/yzy/app/indexFile/172e274d-c406-4f6f-8b2b-e0d1d4ab490f-1561010395193.mp4","img_url":"http://www.yingzhiyunwenhua.cn/yzyFiles/icons/8475f67e-499c-45f9-b738-d223f38f7f5c-1561010395210.png","id":3,"title":"医学专业临床视频","type":"video","read_volume":"12","add_time":"2019-06-20"},{"file_path":"http://www.yingzhiyunwenhua.cn/yzy/app/indexFile/1f58a915-b09d-4fc1-9175-3d31f39f4ad3-1561010684645.mp4","img_url":"http://www.yingzhiyunwenhua.cn/yzyFiles/icons/bca4892a-7eba-4e65-b1f9-cc65e2cd2189-1561010684789.png","id":5,"title":"专业教练教开车","type":"video","read_volume":"4","add_time":"2019-06-20"}],"title":"视频资源","type":"list"},{"id":26,"detail":[{"file_path":"http://www.yingzhiyunwenhua.cn/yzy/app/indexFile/1db84852-eff8-44d8-aa9d-06f9dbe65f46-1561010636591.mp4","img_url":"http://www.yingzhiyunwenhua.cn/yzyFiles/icons/3889da92-d856-4ae2-a3a6-df5bb60c67b3-1561010636613.png","id":4,"title":"篮球大使教你打篮球","type":"video","read_volume":"6","add_time":"2019-06-20"},{"file_path":"http://www.yingzhiyunwenhua.cn/yzy/app/indexFile/5d377485-1e68-41a3-983b-0a685aff0e94-1561010727269.mp4","img_url":"http://www.yingzhiyunwenhua.cn/yzyFiles/icons/75ba7b46-3f2d-4ea2-8018-94a965a4f818-1561010727400.png","id":6,"title":"名师辅导测试","type":"video","read_volume":"1","add_time":"2019-06-20"}],"title":"名师辅导","type":"list"}],"C2E":{"id":30,"title":"高考真题","list":[],"type":"list"},"banner":[{"img_url":"http://www.yingzhiyunwenhua.cn/yzyFiles/icons/bd2edb9c-ae9e-49e4-932e-782d3f6b1e60-1561016513831.png","id":11,"type":"list"}],"menu":[{"img_url":"http://www.yingzhiyunwenhua.cn/yzyFiles/icons/143ad4a1-8bfb-4df6-8ae2-ead3fec38bc0-1561003154835.png","id":12,"title":"教材教案","type":"list"},{"img_url":"http://www.yingzhiyunwenhua.cn/yzyFiles/icons/79876694-f245-4491-8d8c-8c2ffde3cdcf-1561003221237.png","id":13,"title":"真题测试","type":"list"},{"img_url":"http://www.yingzhiyunwenhua.cn/yzyFiles/icons/544f0836-10ac-4b0b-91cc-f700bb5edc14-1561003254097.png","id":14,"title":"每日更新","type":"list"},{"img_url":"http://www.yingzhiyunwenhua.cn/yzyFiles/icons/9ac160b1-39e9-47d5-95ca-0c1bf16e07fd-1561009867537.png","id":15,"title":"免费书店","type":"list"},{"img_url":"http://www.yingzhiyunwenhua.cn/yzyFiles/icons/14d03eff-365c-4de0-bf14-9014d52321cd-1561009895780.png","id":16,"title":"加强训练","type":"list"},{"img_url":"http://www.yingzhiyunwenhua.cn/yzyFiles/icons/68083802-4746-421e-9816-13d01eb6e3f8-1561009938608.png","id":17,"title":"职业培训","type":"list"},{"img_url":"http://www.yingzhiyunwenhua.cn/yzyFiles/icons/0fad3fdc-695b-4cc8-b331-7d1eff410ca1-1561009963347.png","id":18,"title":"视频资料","type":"list"},{"img_url":"http://www.yingzhiyunwenhua.cn/yzyFiles/icons/7f2ec6dc-a05a-47d6-80bc-2d4e18491858-1561009982290.png","id":19,"title":"八市联考","type":"list"}],"test_list":{"id":11,"title":"名校联考测评","list":[{"add_time":"2019-06-04","title":"高三英语单元检测试题（2）","id":266,"file_path":"http://www.yingzhiyunwenhua.cn/yzy/app/courseWare/1ff1e43c-c4ce-4fe5-b413-eda9689f1ffc-1559630294550.docx","file_size":"0.05MB","read_volume":0,"type":"word","img_url":null,"collection":false,"labelList":["单元测试","word","试题试卷"]},{"add_time":"2019-06-04","title":"高三英语单元检测试题（3）","id":267,"file_path":"http://www.yingzhiyunwenhua.cn/yzy/app/courseWare/e660aaa9-570e-4fa8-a528-df36c03121d9-1559630339170.docx","file_size":"0.04MB","read_volume":0,"type":"word","img_url":null,"collection":false,"labelList":["单元测试","word","试题试卷"]},{"add_time":"2019-06-04","title":"高三英语单元检测试题（4）","id":268,"file_path":"http://www.yingzhiyunwenhua.cn/yzy/app/courseWare/5d898b36-a26a-4583-88fd-306035c96af5-1559630518097.docx","file_size":"0.03MB","read_volume":0,"type":"word","img_url":null,"collection":false,"labelList":["单元测试","word","试题试卷"]},{"add_time":"2019-06-04","title":"高三英语单元检测试题（5）","id":269,"file_path":"http://www.yingzhiyunwenhua.cn/yzy/app/courseWare/80f89356-dccf-4f9a-9b7c-4cfede186cd4-1559630710117.docx","file_size":"0.03MB","read_volume":0,"type":"word","img_url":null,"collection":false,"labelList":["单元测试","word","试题试卷"]},{"add_time":"2019-06-04","title":"高三英语单元检测试题（6）","id":270,"file_path":"http://www.yingzhiyunwenhua.cn/yzy/app/courseWare/151f4e61-c3c6-43da-b108-2f32f526d569-1559630738995.docx","file_size":"0.03MB","read_volume":0,"type":"word","img_url":null,"collection":false,"labelList":["单元测试","word","试题试卷"]},{"add_time":"2019-06-04","title":"高三英语单元检测试题（7）","id":271,"file_path":"http://www.yingzhiyunwenhua.cn/yzy/app/courseWare/ee2efed5-93b5-43ff-942e-2eaa4c08237c-1559630777599.docx","file_size":"0.03MB","read_volume":0,"type":"word","img_url":null,"collection":false,"labelList":["单元测试","word","试题试卷"]},{"add_time":"2019-06-04","title":"高三英语单元检测试题（8）","id":272,"file_path":"http://www.yingzhiyunwenhua.cn/yzy/app/courseWare/b98e98be-2883-417d-8e44-7acc844d8471-1559630801488.docx","file_size":"0.03MB","read_volume":0,"type":"word","img_url":null,"collection":false,"labelList":["单元测试","word","试题试卷"]}],"type":"list"},"olympiad":{"id":31,"title":"奥赛专区","list":[{"add_time":"2019-06-15","title":"河南省八市重点高中联盟\u201c领军考试\u201d高二第一次理数检测试题","id":617,"file_path":"http://www.yingzhiyunwenhua.cn/yzy/app/courseWare/6c26ef63-5414-46e8-a86a-1b8818268926-1560578585016.doc","file_size":"0.84MB","read_volume":0,"type":"word","img_url":null,"collection":false,"labelList":["联考","word","试题试卷"]},{"add_time":"2019-06-15","title":"河南省八市重点高中联盟\u201c领军考试\u201d高二第一次文数检测试题","id":620,"file_path":"http://www.yingzhiyunwenhua.cn/yzy/app/courseWare/38da92a0-3b7b-45f2-861d-5f90dde10a9a-1560579333236.docx","file_size":"0.26MB","read_volume":0,"type":"word","img_url":null,"collection":false,"labelList":["联考","word","试题试卷"]},{"add_time":"2019-06-15","title":"河南省八市重点高中联盟\u201c领军考试\u201d高二第二次理数检测试题","id":626,"file_path":"http://www.yingzhiyunwenhua.cn/yzy/app/courseWare/f4a47ecd-81fc-46ba-8a47-04895cc57698-1560579715996.docx","file_size":"0.35MB","read_volume":0,"type":"word","img_url":null,"collection":false,"labelList":["联考","word","试题试卷"]}],"type":"list"}}
     */

    private int status;
    private String hint;
    private ResultBean result;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getHint() {
        return hint;
    }

    public void setHint(String hint) {
        this.hint = hint;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public static class ResultBean  implements Serializable{
        /**
         * section_detail : [{"id":20,"detail":[{"img_url":"http://www.yingzhiyunwenhua.cn/yzyFiles/icons/c6d4d437-b622-4dd8-82e7-e3b5ab774e4f-1561010048359.png","id":21,"title":"这是一个测试用的专辑","type":"list","read_volume":9,"add_time":"2019-08-27"},{"img_url":"http://www.yingzhiyunwenhua.cn/yzyFiles/icons/dad6da1d-74c4-4417-93ca-c60c031778a3-1561010069748.png","id":22,"title":"这又是一个测试用的专辑","type":"list","read_volume":10,"add_time":"2019-08-27"},{"img_url":"http://www.yingzhiyunwenhua.cn/yzyFiles/icons/68eaf64f-379a-437d-b78a-fbbeca6876c5-1561010090658.png","id":23,"title":"那有没有正式的专辑？","type":"list","read_volume":3,"add_time":"2019-08-27"},{"img_url":"http://www.yingzhiyunwenhua.cn/yzyFiles/icons/c7e48c63-8646-4db8-8590-2b8953953056-1561010107850.png","id":24,"title":"抱歉现在还没有","type":"list","read_volume":1,"add_time":"2019-08-27"},{"img_url":"http://www.yingzhiyunwenhua.cn/yzyFiles/icons/7e901a2d-1427-47b0-b25b-9bcd07d415cd-1566800824681.png","id":27,"title":"这是新增一","type":"list","read_volume":0,"add_time":"2019-08-27"},{"img_url":"http://www.yingzhiyunwenhua.cn/yzyFiles/icons/485a16e7-016f-4709-8163-082ceced8dda-1566800852581.png","id":28,"title":"这是新增二","type":"list","read_volume":0,"add_time":"2019-08-27"},{"img_url":"http://www.yingzhiyunwenhua.cn/yzyFiles/icons/3dfe5e59-bd05-4c3e-9f8c-1a1456c6491a-1566800878950.png","id":29,"title":"这是新增三","type":"list","read_volume":0,"add_time":"2019-08-27"}],"title":"精选专辑","type":"collectionList"},{"id":25,"detail":[{"file_path":"http://www.yingzhiyunwenhua.cn/yzy/app/indexFile/172e274d-c406-4f6f-8b2b-e0d1d4ab490f-1561010395193.mp4","img_url":"http://www.yingzhiyunwenhua.cn/yzyFiles/icons/8475f67e-499c-45f9-b738-d223f38f7f5c-1561010395210.png","id":3,"title":"医学专业临床视频","type":"video","read_volume":"12","add_time":"2019-06-20"},{"file_path":"http://www.yingzhiyunwenhua.cn/yzy/app/indexFile/1f58a915-b09d-4fc1-9175-3d31f39f4ad3-1561010684645.mp4","img_url":"http://www.yingzhiyunwenhua.cn/yzyFiles/icons/bca4892a-7eba-4e65-b1f9-cc65e2cd2189-1561010684789.png","id":5,"title":"专业教练教开车","type":"video","read_volume":"4","add_time":"2019-06-20"}],"title":"视频资源","type":"list"},{"id":26,"detail":[{"file_path":"http://www.yingzhiyunwenhua.cn/yzy/app/indexFile/1db84852-eff8-44d8-aa9d-06f9dbe65f46-1561010636591.mp4","img_url":"http://www.yingzhiyunwenhua.cn/yzyFiles/icons/3889da92-d856-4ae2-a3a6-df5bb60c67b3-1561010636613.png","id":4,"title":"篮球大使教你打篮球","type":"video","read_volume":"6","add_time":"2019-06-20"},{"file_path":"http://www.yingzhiyunwenhua.cn/yzy/app/indexFile/5d377485-1e68-41a3-983b-0a685aff0e94-1561010727269.mp4","img_url":"http://www.yingzhiyunwenhua.cn/yzyFiles/icons/75ba7b46-3f2d-4ea2-8018-94a965a4f818-1561010727400.png","id":6,"title":"名师辅导测试","type":"video","read_volume":"1","add_time":"2019-06-20"}],"title":"名师辅导","type":"list"}]
         * C2E : {"id":30,"title":"高考真题","list":[],"type":"list"}
         * banner : [{"img_url":"http://www.yingzhiyunwenhua.cn/yzyFiles/icons/bd2edb9c-ae9e-49e4-932e-782d3f6b1e60-1561016513831.png","id":11,"type":"list"}]
         * menu : [{"img_url":"http://www.yingzhiyunwenhua.cn/yzyFiles/icons/143ad4a1-8bfb-4df6-8ae2-ead3fec38bc0-1561003154835.png","id":12,"title":"教材教案","type":"list"},{"img_url":"http://www.yingzhiyunwenhua.cn/yzyFiles/icons/79876694-f245-4491-8d8c-8c2ffde3cdcf-1561003221237.png","id":13,"title":"真题测试","type":"list"},{"img_url":"http://www.yingzhiyunwenhua.cn/yzyFiles/icons/544f0836-10ac-4b0b-91cc-f700bb5edc14-1561003254097.png","id":14,"title":"每日更新","type":"list"},{"img_url":"http://www.yingzhiyunwenhua.cn/yzyFiles/icons/9ac160b1-39e9-47d5-95ca-0c1bf16e07fd-1561009867537.png","id":15,"title":"免费书店","type":"list"},{"img_url":"http://www.yingzhiyunwenhua.cn/yzyFiles/icons/14d03eff-365c-4de0-bf14-9014d52321cd-1561009895780.png","id":16,"title":"加强训练","type":"list"},{"img_url":"http://www.yingzhiyunwenhua.cn/yzyFiles/icons/68083802-4746-421e-9816-13d01eb6e3f8-1561009938608.png","id":17,"title":"职业培训","type":"list"},{"img_url":"http://www.yingzhiyunwenhua.cn/yzyFiles/icons/0fad3fdc-695b-4cc8-b331-7d1eff410ca1-1561009963347.png","id":18,"title":"视频资料","type":"list"},{"img_url":"http://www.yingzhiyunwenhua.cn/yzyFiles/icons/7f2ec6dc-a05a-47d6-80bc-2d4e18491858-1561009982290.png","id":19,"title":"八市联考","type":"list"}]
         * test_list : {"id":11,"title":"名校联考测评","list":[{"add_time":"2019-06-04","title":"高三英语单元检测试题（2）","id":266,"file_path":"http://www.yingzhiyunwenhua.cn/yzy/app/courseWare/1ff1e43c-c4ce-4fe5-b413-eda9689f1ffc-1559630294550.docx","file_size":"0.05MB","read_volume":0,"type":"word","img_url":null,"collection":false,"labelList":["单元测试","word","试题试卷"]},{"add_time":"2019-06-04","title":"高三英语单元检测试题（3）","id":267,"file_path":"http://www.yingzhiyunwenhua.cn/yzy/app/courseWare/e660aaa9-570e-4fa8-a528-df36c03121d9-1559630339170.docx","file_size":"0.04MB","read_volume":0,"type":"word","img_url":null,"collection":false,"labelList":["单元测试","word","试题试卷"]},{"add_time":"2019-06-04","title":"高三英语单元检测试题（4）","id":268,"file_path":"http://www.yingzhiyunwenhua.cn/yzy/app/courseWare/5d898b36-a26a-4583-88fd-306035c96af5-1559630518097.docx","file_size":"0.03MB","read_volume":0,"type":"word","img_url":null,"collection":false,"labelList":["单元测试","word","试题试卷"]},{"add_time":"2019-06-04","title":"高三英语单元检测试题（5）","id":269,"file_path":"http://www.yingzhiyunwenhua.cn/yzy/app/courseWare/80f89356-dccf-4f9a-9b7c-4cfede186cd4-1559630710117.docx","file_size":"0.03MB","read_volume":0,"type":"word","img_url":null,"collection":false,"labelList":["单元测试","word","试题试卷"]},{"add_time":"2019-06-04","title":"高三英语单元检测试题（6）","id":270,"file_path":"http://www.yingzhiyunwenhua.cn/yzy/app/courseWare/151f4e61-c3c6-43da-b108-2f32f526d569-1559630738995.docx","file_size":"0.03MB","read_volume":0,"type":"word","img_url":null,"collection":false,"labelList":["单元测试","word","试题试卷"]},{"add_time":"2019-06-04","title":"高三英语单元检测试题（7）","id":271,"file_path":"http://www.yingzhiyunwenhua.cn/yzy/app/courseWare/ee2efed5-93b5-43ff-942e-2eaa4c08237c-1559630777599.docx","file_size":"0.03MB","read_volume":0,"type":"word","img_url":null,"collection":false,"labelList":["单元测试","word","试题试卷"]},{"add_time":"2019-06-04","title":"高三英语单元检测试题（8）","id":272,"file_path":"http://www.yingzhiyunwenhua.cn/yzy/app/courseWare/b98e98be-2883-417d-8e44-7acc844d8471-1559630801488.docx","file_size":"0.03MB","read_volume":0,"type":"word","img_url":null,"collection":false,"labelList":["单元测试","word","试题试卷"]}],"type":"list"}
         * olympiad : {"id":31,"title":"奥赛专区","list":[{"add_time":"2019-06-15","title":"河南省八市重点高中联盟\u201c领军考试\u201d高二第一次理数检测试题","id":617,"file_path":"http://www.yingzhiyunwenhua.cn/yzy/app/courseWare/6c26ef63-5414-46e8-a86a-1b8818268926-1560578585016.doc","file_size":"0.84MB","read_volume":0,"type":"word","img_url":null,"collection":false,"labelList":["联考","word","试题试卷"]},{"add_time":"2019-06-15","title":"河南省八市重点高中联盟\u201c领军考试\u201d高二第一次文数检测试题","id":620,"file_path":"http://www.yingzhiyunwenhua.cn/yzy/app/courseWare/38da92a0-3b7b-45f2-861d-5f90dde10a9a-1560579333236.docx","file_size":"0.26MB","read_volume":0,"type":"word","img_url":null,"collection":false,"labelList":["联考","word","试题试卷"]},{"add_time":"2019-06-15","title":"河南省八市重点高中联盟\u201c领军考试\u201d高二第二次理数检测试题","id":626,"file_path":"http://www.yingzhiyunwenhua.cn/yzy/app/courseWare/f4a47ecd-81fc-46ba-8a47-04895cc57698-1560579715996.docx","file_size":"0.35MB","read_volume":0,"type":"word","img_url":null,"collection":false,"labelList":["联考","word","试题试卷"]}],"type":"list"}
         */

        private C2EBean C2E;
        private TestListBean test_list;
        private OlympiadBean olympiad;
        private List<SectionDetailBean> section_detail;
        private List<BannerBean> banner;
        private List<MenuBean> menu;

        public C2EBean getC2E() {
            return C2E;
        }

        public void setC2E(C2EBean C2E) {
            this.C2E = C2E;
        }

        public TestListBean getTest_list() {
            return test_list;
        }

        public void setTest_list(TestListBean test_list) {
            this.test_list = test_list;
        }

        public OlympiadBean getOlympiad() {
            return olympiad;
        }

        public void setOlympiad(OlympiadBean olympiad) {
            this.olympiad = olympiad;
        }

        public List<SectionDetailBean> getSection_detail() {
            return section_detail;
        }

        public void setSection_detail(List<SectionDetailBean> section_detail) {
            this.section_detail = section_detail;
        }

        public List<BannerBean> getBanner() {
            return banner;
        }

        public void setBanner(List<BannerBean> banner) {
            this.banner = banner;
        }

        public List<MenuBean> getMenu() {
            return menu;
        }

        public void setMenu(List<MenuBean> menu) {
            this.menu = menu;
        }

        public static class C2EBean  implements Serializable{
            /**
             * id : 30
             * title : 高考真题
             * list : []
             * type : list
             */

            private int id;
            private String title;
            private String type;
            private List<TestListBean.ListBean> list;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public List< TestListBean.ListBean> getList() {
                return list;
            }

            public void setList(List<TestListBean.ListBean> list) {
                this.list = list;
            }
        }

        public static class TestListBean implements Serializable{
            /**
             * id : 11
             * title : 名校联考测评
             * list : [{"add_time":"2019-06-04","title":"高三英语单元检测试题（2）","id":266,"file_path":"http://www.yingzhiyunwenhua.cn/yzy/app/courseWare/1ff1e43c-c4ce-4fe5-b413-eda9689f1ffc-1559630294550.docx","file_size":"0.05MB","read_volume":0,"type":"word","img_url":null,"collection":false,"labelList":["单元测试","word","试题试卷"]},{"add_time":"2019-06-04","title":"高三英语单元检测试题（3）","id":267,"file_path":"http://www.yingzhiyunwenhua.cn/yzy/app/courseWare/e660aaa9-570e-4fa8-a528-df36c03121d9-1559630339170.docx","file_size":"0.04MB","read_volume":0,"type":"word","img_url":null,"collection":false,"labelList":["单元测试","word","试题试卷"]},{"add_time":"2019-06-04","title":"高三英语单元检测试题（4）","id":268,"file_path":"http://www.yingzhiyunwenhua.cn/yzy/app/courseWare/5d898b36-a26a-4583-88fd-306035c96af5-1559630518097.docx","file_size":"0.03MB","read_volume":0,"type":"word","img_url":null,"collection":false,"labelList":["单元测试","word","试题试卷"]},{"add_time":"2019-06-04","title":"高三英语单元检测试题（5）","id":269,"file_path":"http://www.yingzhiyunwenhua.cn/yzy/app/courseWare/80f89356-dccf-4f9a-9b7c-4cfede186cd4-1559630710117.docx","file_size":"0.03MB","read_volume":0,"type":"word","img_url":null,"collection":false,"labelList":["单元测试","word","试题试卷"]},{"add_time":"2019-06-04","title":"高三英语单元检测试题（6）","id":270,"file_path":"http://www.yingzhiyunwenhua.cn/yzy/app/courseWare/151f4e61-c3c6-43da-b108-2f32f526d569-1559630738995.docx","file_size":"0.03MB","read_volume":0,"type":"word","img_url":null,"collection":false,"labelList":["单元测试","word","试题试卷"]},{"add_time":"2019-06-04","title":"高三英语单元检测试题（7）","id":271,"file_path":"http://www.yingzhiyunwenhua.cn/yzy/app/courseWare/ee2efed5-93b5-43ff-942e-2eaa4c08237c-1559630777599.docx","file_size":"0.03MB","read_volume":0,"type":"word","img_url":null,"collection":false,"labelList":["单元测试","word","试题试卷"]},{"add_time":"2019-06-04","title":"高三英语单元检测试题（8）","id":272,"file_path":"http://www.yingzhiyunwenhua.cn/yzy/app/courseWare/b98e98be-2883-417d-8e44-7acc844d8471-1559630801488.docx","file_size":"0.03MB","read_volume":0,"type":"word","img_url":null,"collection":false,"labelList":["单元测试","word","试题试卷"]}]
             * type : list
             */

            private int id;
            private String title;
            private String type;
            private List<ListBean> list;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public List<ListBean> getList() {
                return list;
            }

            public void setList(List<ListBean> list) {
                this.list = list;
            }

            public static class ListBean implements Serializable{
                /**
                 * add_time : 2019-06-04
                 * title : 高三英语单元检测试题（2）
                 * id : 266
                 * file_path : http://www.yingzhiyunwenhua.cn/yzy/app/courseWare/1ff1e43c-c4ce-4fe5-b413-eda9689f1ffc-1559630294550.docx
                 * file_size : 0.05MB
                 * read_volume : 0
                 * type : word
                 * img_url : null
                 * collection : false
                 * labelList : ["单元测试","word","试题试卷"]
                 */

                private String add_time;
                private String title;
                private int id;
                private String file_path;
                private String file_size;
                private int read_volume;
                private String type;
                private Object img_url;
                private boolean collection;
                private List<String> labelList;

                public String getAdd_time() {
                    return add_time;
                }

                public void setAdd_time(String add_time) {
                    this.add_time = add_time;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getFile_path() {
                    return file_path;
                }

                public void setFile_path(String file_path) {
                    this.file_path = file_path;
                }

                public String getFile_size() {
                    return file_size;
                }

                public void setFile_size(String file_size) {
                    this.file_size = file_size;
                }

                public int getRead_volume() {
                    return read_volume;
                }

                public void setRead_volume(int read_volume) {
                    this.read_volume = read_volume;
                }

                public String getType() {
                    return type;
                }

                public void setType(String type) {
                    this.type = type;
                }

                public Object getImg_url() {
                    return img_url;
                }

                public void setImg_url(Object img_url) {
                    this.img_url = img_url;
                }

                public boolean isCollection() {
                    return collection;
                }

                public void setCollection(boolean collection) {
                    this.collection = collection;
                }

                public List<String> getLabelList() {
                    return labelList;
                }

                public void setLabelList(List<String> labelList) {
                    this.labelList = labelList;
                }
            }
        }

        public static class OlympiadBean implements Serializable{
            /**
             * id : 31
             * title : 奥赛专区
             * list : [{"add_time":"2019-06-15","title":"河南省八市重点高中联盟\u201c领军考试\u201d高二第一次理数检测试题","id":617,"file_path":"http://www.yingzhiyunwenhua.cn/yzy/app/courseWare/6c26ef63-5414-46e8-a86a-1b8818268926-1560578585016.doc","file_size":"0.84MB","read_volume":0,"type":"word","img_url":null,"collection":false,"labelList":["联考","word","试题试卷"]},{"add_time":"2019-06-15","title":"河南省八市重点高中联盟\u201c领军考试\u201d高二第一次文数检测试题","id":620,"file_path":"http://www.yingzhiyunwenhua.cn/yzy/app/courseWare/38da92a0-3b7b-45f2-861d-5f90dde10a9a-1560579333236.docx","file_size":"0.26MB","read_volume":0,"type":"word","img_url":null,"collection":false,"labelList":["联考","word","试题试卷"]},{"add_time":"2019-06-15","title":"河南省八市重点高中联盟\u201c领军考试\u201d高二第二次理数检测试题","id":626,"file_path":"http://www.yingzhiyunwenhua.cn/yzy/app/courseWare/f4a47ecd-81fc-46ba-8a47-04895cc57698-1560579715996.docx","file_size":"0.35MB","read_volume":0,"type":"word","img_url":null,"collection":false,"labelList":["联考","word","试题试卷"]}]
             * type : list
             */

            private int id;
            private String title;
            private String type;
            private List<TestListBean.ListBean> list;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public List<TestListBean.ListBean> getList() {
                return list;
            }

            public void setList(List<TestListBean.ListBean> list) {
                this.list = list;
            }

            public static class ListBeanX {
                /**
                 * add_time : 2019-06-15
                 * title : 河南省八市重点高中联盟“领军考试”高二第一次理数检测试题
                 * id : 617
                 * file_path : http://www.yingzhiyunwenhua.cn/yzy/app/courseWare/6c26ef63-5414-46e8-a86a-1b8818268926-1560578585016.doc
                 * file_size : 0.84MB
                 * read_volume : 0
                 * type : word
                 * img_url : null
                 * collection : false
                 * labelList : ["联考","word","试题试卷"]
                 */

                private String add_time;
                private String title;
                private int id;
                private String file_path;
                private String file_size;
                private int read_volume;
                private String type;
                private Object img_url;
                private boolean collection;
                private List<String> labelList;

                public String getAdd_time() {
                    return add_time;
                }

                public void setAdd_time(String add_time) {
                    this.add_time = add_time;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getFile_path() {
                    return file_path;
                }

                public void setFile_path(String file_path) {
                    this.file_path = file_path;
                }

                public String getFile_size() {
                    return file_size;
                }

                public void setFile_size(String file_size) {
                    this.file_size = file_size;
                }

                public int getRead_volume() {
                    return read_volume;
                }

                public void setRead_volume(int read_volume) {
                    this.read_volume = read_volume;
                }

                public String getType() {
                    return type;
                }

                public void setType(String type) {
                    this.type = type;
                }

                public Object getImg_url() {
                    return img_url;
                }

                public void setImg_url(Object img_url) {
                    this.img_url = img_url;
                }

                public boolean isCollection() {
                    return collection;
                }

                public void setCollection(boolean collection) {
                    this.collection = collection;
                }

                public List<String> getLabelList() {
                    return labelList;
                }

                public void setLabelList(List<String> labelList) {
                    this.labelList = labelList;
                }
            }
        }

        public static class SectionDetailBean implements Serializable{
            /**
             * id : 20
             * detail : [{"img_url":"http://www.yingzhiyunwenhua.cn/yzyFiles/icons/c6d4d437-b622-4dd8-82e7-e3b5ab774e4f-1561010048359.png","id":21,"title":"这是一个测试用的专辑","type":"list","read_volume":9,"add_time":"2019-08-27"},{"img_url":"http://www.yingzhiyunwenhua.cn/yzyFiles/icons/dad6da1d-74c4-4417-93ca-c60c031778a3-1561010069748.png","id":22,"title":"这又是一个测试用的专辑","type":"list","read_volume":10,"add_time":"2019-08-27"},{"img_url":"http://www.yingzhiyunwenhua.cn/yzyFiles/icons/68eaf64f-379a-437d-b78a-fbbeca6876c5-1561010090658.png","id":23,"title":"那有没有正式的专辑？","type":"list","read_volume":3,"add_time":"2019-08-27"},{"img_url":"http://www.yingzhiyunwenhua.cn/yzyFiles/icons/c7e48c63-8646-4db8-8590-2b8953953056-1561010107850.png","id":24,"title":"抱歉现在还没有","type":"list","read_volume":1,"add_time":"2019-08-27"},{"img_url":"http://www.yingzhiyunwenhua.cn/yzyFiles/icons/7e901a2d-1427-47b0-b25b-9bcd07d415cd-1566800824681.png","id":27,"title":"这是新增一","type":"list","read_volume":0,"add_time":"2019-08-27"},{"img_url":"http://www.yingzhiyunwenhua.cn/yzyFiles/icons/485a16e7-016f-4709-8163-082ceced8dda-1566800852581.png","id":28,"title":"这是新增二","type":"list","read_volume":0,"add_time":"2019-08-27"},{"img_url":"http://www.yingzhiyunwenhua.cn/yzyFiles/icons/3dfe5e59-bd05-4c3e-9f8c-1a1456c6491a-1566800878950.png","id":29,"title":"这是新增三","type":"list","read_volume":0,"add_time":"2019-08-27"}]
             * title : 精选专辑
             * type : collectionList
             */

            private int id;
            private String title;
            private String type;
            private List<DetailBean> detail;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public List<DetailBean> getDetail() {
                return detail;
            }

            public void setDetail(List<DetailBean> detail) {
                this.detail = detail;
            }

            public static class DetailBean implements Serializable{
                /**
                 * img_url : http://www.yingzhiyunwenhua.cn/yzyFiles/icons/c6d4d437-b622-4dd8-82e7-e3b5ab774e4f-1561010048359.png
                 * id : 21
                 * title : 这是一个测试用的专辑
                 * type : list
                 * read_volume : 9
                 * add_time : 2019-08-27
                 */

                private String img_url;
                private int id;
                private String title;
                private String type;
                private boolean collection;

                public boolean isCollection() {
                    return collection;
                }

                public void setCollection(boolean collection) {
                    this.collection = collection;
                }

                public String getFile_path() {
                    return file_path;
                }

                public void setFile_path(String file_path) {
                    this.file_path = file_path;
                }

                public List<String> getLabelList() {
                    return labelList;
                }

                public void setLabelList(List<String> labelList) {
                    this.labelList = labelList;
                }

                private int read_volume;
                private String add_time;
                private String file_path;
                private List<String> labelList;
                public String getImg_url() {
                    return img_url;
                }

                public void setImg_url(String img_url) {
                    this.img_url = img_url;
                }

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public String getType() {
                    return type;
                }

                public void setType(String type) {
                    this.type = type;
                }

                public int getRead_volume() {
                    return read_volume;
                }

                public void setRead_volume(int read_volume) {
                    this.read_volume = read_volume;
                }

                public String getAdd_time() {
                    return add_time;
                }

                public void setAdd_time(String add_time) {
                    this.add_time = add_time;
                }
            }
        }

        public static class BannerBean implements Serializable{
            /**
             * img_url : http://www.yingzhiyunwenhua.cn/yzyFiles/icons/bd2edb9c-ae9e-49e4-932e-782d3f6b1e60-1561016513831.png
             * id : 11
             * type : list
             */

            private String img_url;
            private int id;
            private String type;

            public String getImg_url() {
                return img_url;
            }

            public void setImg_url(String img_url) {
                this.img_url = img_url;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }
        }

        public static class MenuBean implements Serializable{
            /**
             * img_url : http://www.yingzhiyunwenhua.cn/yzyFiles/icons/143ad4a1-8bfb-4df6-8ae2-ead3fec38bc0-1561003154835.png
             * id : 12
             * title : 教材教案
             * type : list
             */

            private String img_url;
            private int id;
            private String title;
            private String type;

            public MenuBean(String img_url, int id, String title, String type) {
                this.img_url = img_url;
                this.id = id;
                this.title = title;
                this.type = type;
            }

            public String getImg_url() {
                return img_url;
            }

            public void setImg_url(String img_url) {
                this.img_url = img_url;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }
        }
    }
}
