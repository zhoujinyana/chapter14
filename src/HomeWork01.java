import java.util.ArrayList;

public class HomeWork01 {
    public static void main(String[] args) {
        News news = new News("新冠确诊病例超千方，数百方印度教信徒赴恒河\"圣浴\"引民众担忧");
        News news1 = new News("男子突然想起2个月前钓的鱼还在网兜里，捞起一看赶紧放生");
        ArrayList list = new ArrayList();
        list.add(news);
        list.add(news1);
        int size = list.size();
        for (int i = size - 1; i >= 0 ; i--) {
             News news2 = (News) list.get(i);
            System.out.println(processTitle(news2.getTitle()));

        }


    }
    public static String processTitle(String title){
        if(title == null){
            return " ";
        }
        if(title.length() > 15){
            return title.substring(0,15) + "...";
        }else{
            return title;
        }
    }

}
class News{
    private String title;
    private String content;

    public News(String title) {
        this.title = title;

    }

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

    @Override
    public String toString() {
        return "News title=" + title ;
    }
}