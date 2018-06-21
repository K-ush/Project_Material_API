package com.example.kush.project_material_api;

import java.util.List;

public class BookItems {
    /**
     * "title": "'두니아~처음 만난 세계' 유노윤호-권현빈-<b>루다</b>, 귀여운 현장 사진 공개",
     * "originallink": "http://www.topstarnews.net/news/articleView.html?idxno=432094",
     * "link": "http://www.topstarnews.net/news/articleView.html?idxno=432094",
     * "description": "공개된 사진 속 동방신기 유노윤호, 우주소녀 <b>루다</b> 그리고 권현빈이 카메라를 응시한다. 특히 그들의... 유노윤호, <b>루다</b>, 권현빈이 출연하는 MBC '두니아~처음 만난 세계'는 매주 일요일 저녁 6시 45분에 방송된다.",
     * "pubDate": "Wed, 20 Jun 2018 17:46:00 +0900"
     */

    private String title;
    private String content;
    private String pubDate;
    private List<ItemsBean> items;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getPubDate() {
        return pubDate;
    }

    public void setPubDate(String pubDate) {
        this.pubDate = pubDate;
    }

    public List<ItemsBean> getItems() {
        return items;
    }

    public void setItems(List<ItemsBean> items) {
        this.items = items;
    }

    class ItemsBean {
        private String title;
        private String link;
        private String content;
//        private


        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getLink() {
            return link;
        }

        public void setLink(String link) {
            this.link = link;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }
    }
}
